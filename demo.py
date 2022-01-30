import requests
import json

response = requests.get('https://api.chucknorris.io/jokes/random')

data = response.json()
print(data)
print()
print(data['value'])