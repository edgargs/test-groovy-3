def strYaml = '''\
---
application: "Sample App"
version: "1.0.1"
autoStart: true
database:
  url: "jdbc:db//localhost"
services:
- "ws1"
- "ws2"
environments:
- name: "DEV"
  active: true
- name: "ACC"
  active: true
user:
  firstName: "Hubert"
  alias: "mrhaki"
  lastName: "Klein Ikkink"
  website: "https://www.mrhaki.com/"
'''

import groovy.yaml.YamlSlurper

def yamlSlurper = new YamlSlurper()
def objYaml = yamlSlurper.parseText(strYaml)
println objYaml
println objYaml.services