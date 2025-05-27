## 일정 API 설계

<details>
<summary>일정생성</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /schedule<br>
HTTP METHOD : POST<br>
설명 : 일정을 생성하는 API 입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명

## c.body

| 키        | 데이터타입 | 설명    |
|----------|-------|-------|
| username | String | 사용자이름 |
| title    | String | 할일 제목 |
| content  | String | 할일 내용 | 

### 2. 요청예시
```json
{
   "username" : "이형준",
   "title" : "오늘도 짜증난다.",
   "content" : "사랑합니다."
   

}
```

### 3. 응답(Response)
| 키           | 데이터타입  | 설명 |
|-------------|--------|----|
| data        | Object | 핵심데이터 |
| status      | int    | 상태코드 |
| id          | long   | 생성된 할일 식별자 |
| username    | String | 사용자이름 |
| title       | String | 할일 제목 |
| content     | String | 할일 내용 |
| creationData |datatime| 생성날짜 |
| creationtime |datatime| 생성시간 |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "id": 1,
     "username": "이형준",
     "title": "오늘도 짜증난다.",
     "content": "사랑합니다.",
     "creationData": "2025-05-21",
     "creationtime": "19:15:54"
   }   

}
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "메모가 없습니다."
}
```
</details>
<details>
<summary>일정수정</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /schedule/{userid}<br>
HTTP METHOD : PUT<br>
설명 : 일정 정보를 수정하는 API입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키       | 데이터타입  | 설명 |
|---------|--------|----|
| userid  | int    | 유저 식별자 |

```json
localhost:8080/schedule/{userid}
```

## c.body

### 1.설명
| 키        | 데이터타입 | 설명    |
|----------|-------|-------|
| username | String | 사용자이름 |
| title    | String | 할일 제목 |
| content  | String | 할일 내용 | 

### 2. 요청예시
```json
{
   "username" : "이형준2",
   "title" : "오늘도 짜증난다2",
   "content" : "사랑합니다2"
   

}
```

### 3. 응답(Response)
| 키           | 데이터타입  | 설명 |
|-------------|--------|----|
| data        | Object | 핵심데이터 |
| status      | int    | 상태코드 |
| id          | long   | 생성된 할일 식별자 |
| username    | String | 사용자이름 |
| title       | String | 할일 제목 |
| content     | String | 할일 내용 |
| creationData |datatime| 생성날짜 |
| creationtime |datatime| 생성시간 |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "id": 1,
     "username": "이형준2",
     "title": "오늘도 짜증난다2",
     "content": "사랑합니다2",
     "creationData": "2025-05-21",
     "creationtime": "19:15:54"
   }   

}
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "메모가 없습니다."
}
```
</details>
<details>
<summary>단일 일정 특정 정보수정</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /schedule/{userid}<br>
HTTP METHOD : PATCH<br>
설명 : 단일 일정 특정 정보를 수정하는 API입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키       | 데이터타입  | 설명 |
|---------|--------|----|
| userid  | int    | 유저 식별자 |

```json
localhost:8080/schedule/{userid}
```

## c.body

### 1.설명
| 키        | 데이터타입 | 설명    |
|----------|-------|-------|
| username | String | 사용자이름 |
| title    | String | 할일 제목 |
| content  | String | 할일 내용 | 

### 2. 요청예시
```json
{
   "username" : "이형준2",
   "title" : "오늘도 짜증난다2"
}
```

### 3. 응답(Response)
| 키           | 데이터타입  | 설명 |
|-------------|--------|----|
| data        | Object | 핵심데이터 |
| status      | int    | 상태코드 |
| id          | long   | 생성된 할일 식별자 |
| username    | String | 사용자이름 |
| title       | String | 할일 제목 |
| content     | String | 할일 내용 |
| creationData |datatime| 생성날짜 |
| creationtime |datatime| 생성시간 |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "id": 1,
     "username": "이형준2",
     "title": "오늘도 짜증난다2",
     "content": "사랑합니다.",
     "creationData": "2025-05-21",
     "creationtime": "19:15:54"
   }   

}
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "메모가 없습니다."
}
```
</details>
<details>
<summary>단일 일정조회</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /schedule/{userid}<br>
HTTP METHOD : GET<br>
설명 : 단일 일정 정보를 조회하는 API입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키       | 데이터타입  | 설명 |
|---------|--------|----|
| userid  | int    | 유저 식별자 |

```json
localhost:8080/schedule/{userid}
```

## c.body

### 1.설명
| 키 | 데이터타입 | 설명 |
|---|-------|----|
| - | -     | -  |
| - | -     | -  |
| - | -     | -  | 

### 2. 요청예시
```json
{
  
}
```

### 3. 응답(Response)
| 키           | 데이터타입  | 설명 |
|-------------|--------|----|
| data        | Object | 핵심데이터 |
| status      | int    | 상태코드 |
| id          | long   | 생성된 할일 식별자 |
| username    | String | 사용자이름 |
| title       | String | 할일 제목 |
| content     | String | 할일 내용 |
| creationData |datatime| 생성날짜 |
| creationtime |datatime| 생성시간 |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "id": 1,
     "username": "이형준2",
     "title": "오늘도 짜증난다2",
     "content": "사랑합니다2",
     "creationData": "2025-05-21",
     "creationtime": "19:15:54"
   }   

}
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "메모가 없습니다."
}
```
</details>
<details>
<summary>일정조회</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /schedule<br>
HTTP METHOD : GET<br>
설명 : 일정 정보를 조회하는 API입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키 | 데이터타입 | 설명 |
|---|-------|----|
| - | -     | -  |

```json

```

## c.body

### 1.설명
| 키 | 데이터타입 | 설명 |
|---|-------|----|
| - | -     | -  |
| - | -     | -  |
| - | -     | -  | 

### 2. 요청예시
```json
{
  
}
```

### 3. 응답(Response)
| 키           | 데이터타입  | 설명 |
|-------------|--------|----|
| data        | Object | 핵심데이터 |
| status      | int    | 상태코드 |
| id          | long   | 생성된 할일 식별자 |
| username    | String | 사용자이름 |
| title       | String | 할일 제목 |
| content     | String | 할일 내용 |
| creationData |datatime| 생성날짜 |
| creationtime |datatime| 생성시간 |

### 응답 예시
```json

   "status" : 200,
   "data" : {
     "id": 1,
     "username": "이형준2",
     "title": "오늘도 짜증난다2",
     "content": "사랑합니다2",
     "creationData": "2025-05-21",
     "creationtime": "19:15:54"
   },
   {
     "id": 2,
     "username": "이형준2",
     "title": "오늘도 짜증난다2",
     "content": "사랑합니다2",
     "creationData": "2025-05-21",
     "creationtime": "19:15:54"
   }
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "메모가 없습니다."
}
```
</details>
<details>
<summary>일정삭제</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /schedule/{userid}<br>
HTTP METHOD : DELETE<br>
설명 : 단일 일정 정보를 삭제하는 API 입니다. <br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키       | 데이터타입  | 설명 |
|---------|--------|----|
| userid  | int    | 유저 식별자 |

```json
localhost:8080/schedule/{userid}
```

## c.body

### 1.설명
| 키 | 데이터타입 | 설명 |
|---|-------|----|
| - | -     | -  |
| - | -     | -  |
| - | -     | -  | 

### 2. 요청예시
```json
{
  
}
```

### 3. 응답(Response)
| 키 | 데이터타입 | 설명 |
|---|-------|----|
| - | -     | -  |


### 응답 예시
```json
{
  
}
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "메모가 없습니다."
}
```
</details>

## 유저 API 설계
<details>
<summary>유저생성</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /user<br>
HTTP METHOD : POST<br>
설명 : 유저를 생성하는 API 입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명

## c.body

| 키        | 데이터타입 | 설명    |
|----------|-------|-------|
| username | String | 사용자이름 |
| useremail| String | 사용자 이메일 |

### 2. 요청예시
```json
{
   "username" : "이형준",
   "useremail" : "xkrhd3@naver.com"
}
```

### 3. 응답(Response)
| 키           | 데이터타입  | 설명         |
|-------------|--------|------------|
| data        | Object | 핵심데이터      |
| status      | int    | 상태코드       |
| id          | long   | 생성된 유저 식별자 |
| username    | String | 사용자이름      |
| title       | String | 할일 제목      |
| content     | String | 할일 내용      |
| useremail     | String | 사용자 이메일   |
| creationData |datatime| 생성날짜       |
| creationtime |datatime| 생성시간       |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "id": 1,
     "username": "이형준",
     "title": "오늘도 짜증난다2",
     "content": "사랑합니다2",
     "useremail" : "xkrhd3@naver.com",
     "creationData": "2025-05-21",
     "creationtime": "19:15:54"
   }   

}
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "유저가 없습니다."
}
```
</details>
<details>
<summary>유저수정</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /user/{userid}<br>
HTTP METHOD : PUT<br>
설명 : 유저 정보를 수정하는 API입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키       | 데이터타입  | 설명 |
|---------|--------|----|
| userid  | int    | 유저 식별자 |

```json
localhost:8080/schedule/{userid}
```

## c.body

### 1.설명
| 키        | 데이터타입 | 설명    |
|----------|-------|-------|
| username | String | 사용자이름 |
| useremail| String | 사용자 이메일 |

### 2. 요청예시
```json
{
   "username" : "이형준3",
   "useremail" : "xkrhd6@naver.com"
}
```

### 3. 응답(Response)
| 키           | 데이터타입  | 설명 |
|-------------|--------|----|
| data        | Object | 핵심데이터 |
| status      | int    | 상태코드 |
| id          | long   | 생성된 할일 식별자 |
| username    | String | 사용자이름 |
| title       | String | 할일 제목 |
| content     | String | 할일 내용 |
| useremail     | String | 사용자 이메일|
| creationData |datatime| 생성날짜 |
| creationtime |datatime| 생성시간 |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "id": 1,
     "username" : "이형준3",
     "title": "오늘도 짜증난다2",
     "content": "사랑합니다2",
     "useremail" : "xkrhd6@naver.com",
     "creationData": "2025-05-21",
     "creationtime": "19:15:54"
   }   

}
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "유저가 없습니다."
}
```
</details>
<details>
<summary>단일 유저 특정 정보수정</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /user/{userid}<br>
HTTP METHOD : PATCH<br>
설명 : 단일 유저 특정 정보를 수정하는 API입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키       | 데이터타입  | 설명 |
|---------|--------|----|
| userid  | int    | 유저 식별자 |

```json
localhost:8080/schedule/{userid}
```

## c.body

### 1.설명
| 키        | 데이터타입 | 설명    |
|----------|-------|-------|
| useremail| String | 사용자 이메일 |

### 2. 요청예시
```json
{
  "useremail" : "xkrhd8@naver.com"
}
```

### 3. 응답(Response)
| 키           | 데이터타입  | 설명 |
|-------------|--------|----|
| data        | Object | 핵심데이터 |
| status      | int    | 상태코드 |
| id          | long   | 생성된 할일 식별자 |
| username    | String | 사용자이름 |
| title       | String | 할일 제목 |
| content     | String | 할일 내용 |
| useremail     | String | 사용자 이메일|
| creationData |datatime| 생성날짜 |
| creationtime |datatime| 생성시간 |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "id": 1,
     "username" : "이형준3",
     "title": "오늘도 짜증난다2",
     "content": "사랑합니다2",
     "useremail" : "xkrhd8@naver.com",
     "creationData": "2025-05-21",
     "creationtime": "19:15:54"
   }   

}
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "메모가 없습니다."
}
```
</details>
<details>
<summary>단일 유저조회</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /user/{userid}<br>
HTTP METHOD : GET<br>
설명 : 단일 유저 정보를 조회하는 API입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키       | 데이터타입  | 설명 |
|---------|--------|----|
| userid  | int    | 유저 식별자 |

```json
localhost:8080/schedule/{userid}
```

## c.body

### 1.설명
| 키 | 데이터타입 | 설명 |
|---|-------|----|
| - | -     | -  |
| - | -     | -  |
| - | -     | -  | 

### 2. 요청예시
```json
{
  
}
```

### 3. 응답(Response)
| 키           | 데이터타입  | 설명         |
|-------------|--------|------------|
| data        | Object | 핵심데이터      |
| status      | int    | 상태코드       |
| id          | long   | 생성된 할일 식별자 |
| username    | String | 사용자이름      |
| title       | String | 할일 제목      |
| content     | String | 할일 내용      |
| useremail     | String | 사용자 이메일    |
| creationData |datatime| 생성날짜       |
| creationtime |datatime| 생성시간       |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "id": 1,
     "username" : "이형준3",
     "title": "오늘도 짜증난다2",
     "content": "사랑합니다2",
     "useremail" : "xkrhd8@naver.com",
     "creationData": "2025-05-21",
     "creationtime": "19:15:54"
   }   

}
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "유저가 없습니다."
}
```
</details>
<details>
<summary>유저조회</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /user<br>
HTTP METHOD : GET<br>
설명 : 유저 정보를 조회하는 API입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키 | 데이터타입 | 설명 |
|---|-------|----|
| - | -     | -  |

```json

```

## c.body

### 1.설명
| 키 | 데이터타입 | 설명 |
|---|-------|----|
| - | -     | -  |
| - | -     | -  |
| - | -     | -  | 

### 2. 요청예시
```json
{
  
}
```

### 3. 응답(Response)
| 키           | 데이터타입  | 설명 |
|-------------|--------|----|
| data        | Object | 핵심데이터 |
| status      | int    | 상태코드 |
| id          | long   | 생성된 할일 식별자 |
| username    | String | 사용자이름 |
| title       | String | 할일 제목 |
| content     | String | 할일 내용 |
| useremail     | String | 사용자 이메일    |
| creationData |datatime| 생성날짜 |
| creationtime |datatime| 생성시간 |

### 응답 예시
```json

   "status" : 200,
   "data" : {
   "id": 1,
   "username" : "이형준3",
   "title": "오늘도 짜증난다2",
   "content": "사랑합니다2",
   "useremail" : "xkrhd8@naver.com",
   "creationData": "2025-05-21",
   "creationtime": "19:15:54"
   },
   {
   "id": 2,
   "username" : "이형준3",
   "title": "오늘도 짜증난다2",
   "content": "사랑합니다2",
   "useremail" : "xkrhd8@naver.com",
   "creationData": "2025-05-21",
   "creationtime": "19:15:54"
   }
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "메모가 없습니다."
}
```
</details>
<details>
<summary>유저삭제</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /user/{userid}<br>
HTTP METHOD : DELETE<br>
설명 : 단일 유저 정보를 삭제하는 API 입니다. <br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키       | 데이터타입  | 설명 |
|---------|--------|----|
| userid  | int    | 유저 식별자 |

```json
localhost:8080/schedule/{userid}
```

## c.body

### 1.설명
| 키 | 데이터타입 | 설명 |
|---|-------|----|
| - | -     | -  |
| - | -     | -  |
| - | -     | -  | 

### 2. 요청예시
```json
{
  
}
```

### 3. 응답(Response)
| 키 | 데이터타입 | 설명 |
|---|-------|----|
| - | -     | -  |


### 응답 예시
```json
{
  
}
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "메모가 없습니다."
}
```
</details>

## 댓글 API 설계

<details>
<summary>댓글생성</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /commentid<br>
HTTP METHOD : POST<br>
설명 : 댓글를 생성하는 API 입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명

## c.body

| 키               | 데이터타입 | 설명 |
|-----------------|-------|----|
| commentContents | String | 댓글 |

### 2. 요청예시
```json
{
   "commentContents" : "스프링 어렵다...인생"
}
```

### 3. 응답(Response)
| 키            | 데이터타입  | 설명         |
|--------------|--------|------------|
| data         | Object | 핵심데이터      |
| status       | int    | 상태코드       |
| commentid           | bigint | 일정고유 식별자   | 
| userid       | bigint   | 생성된 유저 식별자 |
| scheduleid           | bigint   | 생성된 일정 식별자 |
| commentContents |String| 생성 댓글      |
| creationData |datatime| 생성날짜       |
| creationtime |datatime| 생성시간       |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "commentid" : 1,
     "userid": 1,
     "scheduleid" : 1,
     "creationData": "2025-05-21",
     "creationtime": "19:15:54"
   }   

}
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "댓글이 없습니다."
}
```
</details>
<details>
<summary>댓글수정</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /commentid/{commentidid}<br>
HTTP METHOD : PUT<br>
설명 : 댓글 정보를 수정하는 API입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키       | 데이터타입  | 설명     |
|---------|--------|--------|
| userid  | int    | 댓글 식별자 |

```json
localhost:8080/schedule/{userid}
```

## c.body

### 1.설명
| 키        | 데이터타입 | 설명 |
|----------|-------|----|
| commentContents | String | 댓글 |

### 2. 요청예시
```json
{
  "commentContents" : "스프링 어렵다...인생2"
}
```

### 3. 응답(Response)
| 키            | 데이터타입  | 설명         |
|--------------|--------|------------|
| data         | Object | 핵심데이터      |
| status       | int    | 상태코드       |
| commentid           | bigint | 일정고유 식별자   | 
| userid       | bigint   | 생성된 유저 식별자 |
| scheduleid           | bigint   | 생성된 일정 식별자 |
| commentContents |String| 생성 댓글      |
| creationData |datatime| 생성날짜       |
| creationtime |datatime| 생성시간       |

### 응답 예시
```json
{
  "status" : 200,
  "data" : {
    "commentid" : 1,
    "userid": 1,
    "scheduleid" : 1,
    "creationData": "2025-05-21",
    "creationtime": "19:15:54"
   }   

}
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "유저가 없습니다."
}
```
</details>
<details>
<summary>단일 댓글조회</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /commentid/{commentidid}<br>
HTTP METHOD : GET<br>
설명 : 단일 댓글 정보를 조회하는 API입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키       | 데이터타입  | 설명 |
|---------|--------|----|
| userid  | int    | 유저 식별자 |

```json
localhost:8080/commentid/{commentidid}
```

## c.body

### 1.설명
| 키 | 데이터타입 | 설명 |
|---|-------|----|
| - | -     | -  |
| - | -     | -  |
| - | -     | -  | 

### 2. 요청예시
```json
{
  
}
```

### 3. 응답(Response)
| 키            | 데이터타입  | 설명         |
|--------------|--------|------------|
| data         | Object | 핵심데이터      |
| status       | int    | 상태코드       |
| commentid           | bigint | 일정고유 식별자   | 
| userid       | bigint   | 생성된 유저 식별자 |
| scheduleid           | bigint   | 생성된 일정 식별자 |
| commentContents |String| 생성 댓글      |
| creationData |datatime| 생성날짜       |
| creationtime |datatime| 생성시간       |

### 응답 예시
```json
{
  "status" : 200,
  "data" : {
    "commentid" : 1,
    "userid": 1,
    "scheduleid" : 1,
    "creationData": "2025-05-21",
    "creationtime": "19:15:54"
   }   

}
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "유저가 없습니다."
}
```
</details>
<details>
<summary>댓글조회</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /comment<br>
HTTP METHOD : GET<br>
설명 : 댓글 정보를 조회하는 API입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키 | 데이터타입 | 설명 |
|---|-------|----|
| - | -     | -  |

```json

```

## c.body

### 1.설명
| 키 | 데이터타입 | 설명 |
|---|-------|----|
| - | -     | -  |
| - | -     | -  |
| - | -     | -  | 

### 2. 요청예시
```json
{
  
}
```

### 3. 응답(Response)
| 키           | 데이터타입  | 설명 |
|-------------|--------|----|
| data        | Object | 핵심데이터 |
| status      | int    | 상태코드 |
| id          | long   | 생성된 할일 식별자 |
| username    | String | 사용자이름 |
| title       | String | 할일 제목 |
| content     | String | 할일 내용 |
| useremail     | String | 사용자 이메일    |
| creationData |datatime| 생성날짜 |
| creationtime |datatime| 생성시간 |

### 응답 예시
```json

   "status" : 200,
   "data" : {
   "commentid" : 1,
   "userid": 1,
   "scheduleid" : 1,
   "creationData": "2025-05-21",
   "creationtime": "19:15:54"
   },
   {
   "commentid" : 2,
   "userid": 2,
   "scheduleid" : 2,
   "creationData": "2025-05-21",
   "creationtime": "19:15:56"
   }
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "메모가 없습니다."
}
```
</details>
<details>
<summary>댓글삭제</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /comment/{commentid}<br>
HTTP METHOD : DELETE<br>
설명 : 단일 댓글 정보를 삭제하는 API 입니다. <br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키       | 데이터타입  | 설명 |
|---------|--------|----|
| userid  | int    | 유저 식별자 |

```json
localhost:8080/schedule/{userid}
```

## c.body

### 1.설명
| 키 | 데이터타입 | 설명 |
|---|-------|----|
| - | -     | -  |
| - | -     | -  |
| - | -     | -  | 

### 2. 요청예시
```json
{
  
}
```

### 3. 응답(Response)
| 키 | 데이터타입 | 설명 |
|---|-------|----|
| - | -     | -  |


### 응답 예시
```json
{
  
}
```
### b. 생성 실패 응답

| 키       | 데이터타입  | 설명  |
|---------|--------|-----|
| status  | int    | 상태코드 |
| message | String | 에러관련 메시지 |

### 실패 응답 예시
```json
{
   "status" : "404",
   "message" : "메모가 없습니다."
}
```
</details>

## ERD
![ERD](https://d2sqqdb3t4xrq5.cloudfront.net/upload/EmaLDtDg9vgnFssgn/SDczcWRrUWdYakNSaFNDbllfc0FYdzlaOFpxcFBtWXhCSG0ucG5n)
