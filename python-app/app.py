import random
from flask import Flask, request, jsonify


app = Flask(__name__)

@app.route('/get-action', methods=['POST'])
def get_action():
    return jsonify({"action": random.choice([-1, 0, 1])})

app.run(port=5001)
