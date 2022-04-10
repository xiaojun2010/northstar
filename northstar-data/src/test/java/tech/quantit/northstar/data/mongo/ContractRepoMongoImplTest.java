package tech.quantit.northstar.data.mongo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoClients;

import tech.quantit.northstar.data.IContractRepository;
import tech.quantit.northstar.data.mongo.po.ContractPO;
import test.common.TestFieldFactory;
import xyz.redtorch.pb.CoreEnum.ProductClassEnum;
import xyz.redtorch.pb.CoreField.ContractField;

class ContractRepoMongoImplTest {
	
	MongoTemplate mongoTemplate = new MongoTemplate(MongoClients.create("mongodb://localhost:27017"), "TEST_NS_DB");
	
	IContractRepository repo = new ContractRepoMongoImpl(mongoTemplate); 

	TestFieldFactory fieldFactory = new TestFieldFactory("test");
	
	ContractField c1 = ContractField.newBuilder()
			.setUnifiedSymbol("rb2205@SHFE@FUTURES")
			.setSymbol("rb2205")
			.setLastTradeDateOrContractMonth("20590101")
			.setProductClass(ProductClassEnum.FUTURES)
			.build();
	
	ContractField c2 = ContractField.newBuilder()
			.setUnifiedSymbol("rb2205-C4000@SHFE@FUTURES")
			.setSymbol("rb2205-C4000")
			.setProductClass(ProductClassEnum.OPTION)
			.build();
	
	ContractField c3 = ContractField.newBuilder()
			.setUnifiedSymbol("rb2105@SHFE@FUTURES")
			.setSymbol("rb2105")
			.setProductClass(ProductClassEnum.FUTURES)
			.setLastTradeDateOrContractMonth("20210515")
			.build();
	
	@AfterEach
	void clear() {
		mongoTemplate.dropCollection("contractPO");
	}
	
	@Test
	void testBatchSave() {
		repo.batchSave(List.of(c1, c2, c3));
		assertThat(mongoTemplate.findAll(ContractPO.class)).hasSize(3);
	}

	@Test
	void testSave() {
		repo.save(c3);
		assertThat(mongoTemplate.findAll(ContractPO.class)).hasSize(1);
	}

	@Test
	void testFindAllByType() {
		repo.batchSave(List.of(c1,c2));
		
		List<ContractField> list = repo.findAllByType(ProductClassEnum.FUTURES);
		assertThat(list).hasSize(1).contains(c1);
	}
	
	@Test
	void shouldOnlyCreateOnce() {
		repo.save(c1);
		repo.save(c1);
		List<ContractField> list = repo.findAllByType(ProductClassEnum.FUTURES);
		assertThat(list).hasSize(1).contains(c1);
	}
	
	@Test
	void shouldFilterExpiredContract() {
		repo.save(c1);
		repo.save(c3);
		List<ContractField> list = repo.findAllByType(ProductClassEnum.FUTURES);
		assertThat(list).hasSize(1).contains(c1);
	}
	
}
