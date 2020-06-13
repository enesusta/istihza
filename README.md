## istihza

<div align="center">

[![Build Status](https://travis-ci.com/enesusta/istihza.svg?branch=master)](https://travis-ci.com/enesusta/istihza)
[![Coverage Status](https://coveralls.io/repos/github/enesusta/istihza/badge.svg)](https://coveralls.io/github/enesusta/istihza)
[![javadoc](https://img.shields.io/badge/javadoc-1.0.3-green)](http://www.enesusta.tech/istihza/index.html)

</div>

### What is `istihza`? 
> Istihza means **"mock"** on Turkish language.

`istihza` is a *REST API* which `runs as native` that you can use whenever you need some fake data. It is written with GraalVM and Quarkus Framework.

Istihza aims `mock REST API` for non-backend developers. It does not need any dependency or runtime environment (like nodejs). Just install from releases and add to your **$PATH** environment.


### Examples

#### Mock Human Data

```javascript
fetch('http://localhost:8080/humans')
  .then(response => response.json())
  .then(json => console.log(json))
```

It returns JSON data as like listed below.

> **Note**: Response has **1000** object.


```json
[
    {
        "id": 1,
        "email": "mbartolomeoni0@mapy.cz",
        "gender": "Female",
        "first_name": "Marjorie",
        "last_name": "Bartolomeoni",
        "ip_address": "19.239.207.192"
    },
    {
        "id": 2,
        "email": "egummow1@nps.gov",
        "gender": "Female",
        "first_name": "Edyth",
        "last_name": "Gummow",
        "ip_address": "135.76.165.218"
    },
    {
        "id": 3,
        "email": "jdurrett2@google.cn",
        "gender": "Male",
        "first_name": "Jarrid",
        "last_name": "Durrett",
        "ip_address": "136.149.102.124"
    },
    {
        "id": 4,
        "email": "molsson3@hp.com",
        "gender": "Female",
        "first_name": "Marsiella",
        "last_name": "Olsson",
        "ip_address": "150.157.248.157"
    }
]
```