## 게시글 API 설계

<details>
<summary>게시글 생성</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /Post<br>
HTTP METHOD : POST<br>
설명 : 게시글을 생성하는 API 입니다.<br>


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

| 키        | 데이터타입  | 설명     |
|----------|--------|--------|
| username | String | 사용자이름  |
| title    | String | 게시글 제목 |
| content  | String | 게시글 내용 |
| Likescount    | int    | 좋아요 수  |
| Todocount     | int    | 댓글 수   |


### 2. 요청예시
```json
{
   "username" : "이형준",
   "title" : "오늘도 짜증난다.",
   "content" : "사랑합니다.",
   "Likescount" : 90,
   "Todocount" : 20
  
}
```

### 3. 응답(Response)
| 키           | 데이터타입  | 설명          |
|-------------|--------|-------------|
| data        | Object | 핵심데이터       |
| status      | int    | 상태코드        |
| id          | long   | 생성된 게시글 식별자 |
| username    | String | 사용자이름       |
| title       | String | 게시글 제목      |
| content     | String | 게시글 내용      |
| createdAt | Timestamp  | 생성날짜        |
| Likescount    | int    | 좋아요 수       |
| Todocount     | int    | 댓글 수        |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "id": 1,
     "username" : "이형준",
     "title" : "오늘도 짜증난다.",
     "content" : "사랑합니다.",
     "createdAt": "2025-05-28 11:06:54",
     "Likescount" : 90,
     "Todocount" : 20
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
   "message" : "게시글이 없습니다."
}
```
</details>
<details>
<summary>게시글 수정</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /Posts/{Postid}<br>
HTTP METHOD : PUT<br>
설명 : 게시글 정보를 수정하는 API입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키       | 데이터타입  | 설명      |
|---------|--------|---------|
| Postid  | int    | 게시글 식별자 |

```json
localhost:8080/Post/{Postid}
```

## c.body

### 1.설명
| 키        | 데이터타입 | 설명     |
|----------|-------|--------|
| username | String | 사용자이름  |
| title    | String | 게시글 제목 |
| content  | String | 게시글 내용 | 

### 2. 요청예시
```json
{
   "username" : "이형준",
   "title" : "오늘도 짜증난다2",
   "content" : "사랑합니다2"
}
```

### 3. 응답(Response)
| 키           | 데이터타입  | 설명          |
|-------------|--------|-------------|
| data        | Object | 핵심데이터       |
| status      | int    | 상태코드        |
| username    | String | 사용자이름       |
| title       | String | 게시글 제목      |
| content     | String | 게시글 내용      |
| creationData | Timestamp  | 생성날짜        |
| modifiedDate | Timestamp  | 수정날짜        |
| Likescount    | int    | 좋아요 수      |
| Todocount     | int    | 댓글 수       |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "username": "이형준2",
     "title": "오늘도 짜증난다2",
     "content": "사랑합니다2",
     "createdAt": "2025-05-28 11:06:54",
     "modifiedAt": "2025-05-28 11:08:54",
     "Likescount" : 90,
     "Todocount" : 20
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
   "message" : "게시글이 없습니다."
}
```
</details>
<details>
<summary>단일 게시글 조회</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /Posts/{Postid}<br>
HTTP METHOD : GET<br>
설명 : 단일 게시글 정보를 조회하는 API입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키       | 데이터타입  | 설명      |
|---------|--------|---------|
| scheduleid  | int    | 게시글 식별자 |

```json
localhost:8080/Posts/{Postid}
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
| 키           | 데이터타입  | 설명     |
|-------------|--------|--------|
| data        | Object | 핵심데이터  |
| status      | int    | 상태코드   |
| username    | String | 사용자이름  |
| title       | String | 게시글 제목 |
| content     | String | 게시글 내용 |
| createdAt | Timestamp  | 생성날짜        |
| modifiedAt | Timestamp  | 수정날짜        |
| Likescount    | int    | 좋아요 수  |
| Todocount     | int    | 댓글 수   |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "username": "이형준2",
     "title": "오늘도 짜증난다2",
     "content": "사랑합니다2",
     "createdAt": "2025-05-28 11:06:54",
     "modifiedAt": "2025-05-28 11:08:54",
     "Likescount" : 90,
     "Todocount" : 20
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
   "message" : "게시글이 없습니다."
}
```
</details>
<details>
<summary>단일 유저 게시글 조회</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /Posts/{userid}<br>
HTTP METHOD : GET<br>
설명 : 단일 게시글 정보를 조회하는 API입니다.<br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키       | 데이터타입  | 설명      |
|---------|--------|---------|
| scheduleid  | int    | 게시글 식별자 |

```json
localhost:8080/Posts/{userId}
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
| 키           | 데이터타입  | 설명     |
|-------------|--------|--------|
| data        | Object | 핵심데이터  |
| status      | int    | 상태코드   |
| username    | String | 사용자이름  |
| title       | String | 게시글 제목 |
| content     | String | 게시글 내용 |
| createdAt | Timestamp  | 생성날짜        |
| modifiedAt | Timestamp  | 수정날짜        |
| Likescount    | int    | 좋아요 수  |
| Todocount     | int    | 댓글 수   |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "username": "홍길동",
     "title": "테스트",
     "content": "사랑합니다",
     "createdAt": "2025-05-28 11:06:54",
     "modifiedAt": "2025-05-28 11:08:54",
     "Likescount" : 90,
     "Todocount" : 20
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
   "message" : "게시글이 없습니다."
}
```
</details>
<details>
<summary>게시글 조회</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /Posts<br>
HTTP METHOD : GET<br>
설명 : 게시글 정보를 조회하는 API입니다.<br>


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

localhost:8080/Posts?page=10&size=10

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
| 키           | 데이터타입     | 설명           |
|-------------|-----------|--------------|
| data        | Object    | 핵심데이터        |
| status      | int       | 상태코드         |
| id          | long      | 생성된 게시글 식별자  |
| username    | String    | 사용자이름        |
| title       | String    | 게시글 제목       |
| content     | String    | 게시글 내용       |
| createdAt | Timestamp | 생성날짜         |
| modifiedAt | Timestamp | 수정날짜         |
| Likescount    | int       | 좋아요 수        |
| Todocount     | int       | 댓글 수         |
| page | int       | 현재 페이지 수     |
| size | int       | 페이지 사이즈      |
| totalElements    | int       | 모든 페이지 게시글 수 |
| totalPages     | int       | 모든 페이지 수     |

### 응답 예시
```json

   "status" : 200,
   "data" : [ {
     "id": 1,
     "username": "이형준",
     "title": "오늘도 짜증난다",
     "content": "사랑합니다",
     "createdAt": "2025-05-28 11:06:54",
     "modifiedAt": "2025-05-28 11:08:54",
     "Likescount" : 90,
     "Todocount" : 20
   },
   {
     "id": 2,
     "username": "이형준2",
     "title": "오늘도 짜증난다2",
     "content": "사랑합니다2",
     "createdAt": "2025-05-28 11:09:54",
     "modifiedAt": "2025-05-28 11:11:54",
     "Likescount" : 70,
     "Todocount" : 20
   }
],
"page" : {
   
     "page" : 1,
     "size" : 10,
     "totalElements" : 2,
     "totalPages" : 10
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
   "message" : "게시글이 없습니다."
}
```
</details>
<details>
<summary>게시글 검색</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /Posts/{username}<br>
HTTP METHOD : GET<br>
설명 : 게시글 정보를 검색하는 API입니다.<br>


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
  localhost:8080/Posts?startDate = 20250528&endDate = 20250530 
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
| 키            | 데이터타입     | 설명          |
|--------------|-----------|-------------|
| data         | Object    | 핵심데이터       |
| status       | int       | 상태코드        |
| id           | long      | 생성된 게시글 식별자 |
| userName     | String    | 사용자이름       |
| title        | String    | 게시글 제목      |
| content      | String    | 게시글 내용      |
| createdAt | Timestamp  | 생성날짜        |
| modifiedAt  | Timestamp  | 수정날짜        |
| Likescount   | int       | 좋아요 수       |
| Todocount    | int       | 댓글 수        |

### 응답 예시
```json

   "status" : 200,
   "data" : {
     "id": 1,
     "username": "이형준",
     "title": "오늘도 짜증난다",
     "content": "사랑합니다",
     "createdAt": "2025-05-28 11:06:54",
     "modifiedAt ": "2025-05-30 11:10:55",
     "Likescount" : 90,
     "Todocount" : 20
   },
   {
     "id": 2,
     "username": "이형준",
     "title": "오늘도 짜증난다2",
     "content": "사랑합니다2",
     "creationData": "2025-05-28 11:06:54",
     "modifiedDate": "2025-05-28 11:12:58", 
     "Likescount" : 70,
     "Todocount" : 20
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
   "message" : "게시글이 없습니다."
}
```
</details>
<details>
<summary>게시글삭제</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /Posts/{Postid}<br>
HTTP METHOD : DELETE<br>
설명 : 단일 게시글 정보를 삭제하는 API 입니다. <br>


## 01.요청(Request)
### 1.설명

|key|value|
|---|-----|
|Content-type|application/json

### 2. 예시
Content-type : application/json

## b. Param(파라미터 값이 필요한 경우)

### 1.설명
| 키       | 데이터타입  | 설명      |
|---------|--------|---------|
| Postid  | int    | 게시글 식별자 |

```json
localhost:8080/Posts/{Postid}
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
   "message" : "게시글이 없습니다."
}
```
</details>

## 유저 API 설계
<details>
<summary>유저생성</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /users<br>
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
| email    | String | 사용자 이메일 |
| password |String | 사용자 비밀번호 |

### 2. 요청예시
```json
{
   "username" : "이형준",
   "email" : "xkrhd3@naver.com",
   "password" : 1234
}
```

### 3. 응답(Response)
| 키         | 데이터타입  | 설명         |
|-----------|--------|------------|
| data      | Object | 핵심데이터      |
| status    | int    | 상태코드       |
| id        | long   | 생성된 유저 식별자 |
| username  | String | 사용자이름      |
| email     | String | 사용자 이메일   |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "id": 1,
     "username": "이형준",
     "email" : "xkrhd3@naver.com"
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
<summary>단일 유저 정보수정</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /users/{userid}<br>
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
| 키        | 데이터타입 | 설명       |
|----------|-------|----------|
| username| String | 사용자 이름   |
| email| String | 사용자 이메일  |
| Password| String | 사용자 비밀번호 |

### 2. 요청예시
```json
{
  "username": "이형준",
  "email" : "xkrhd4@naver.com",
  "Password" : 12345
}
```

### 3. 응답(Response)
| 키           | 데이터타입  | 설명 |
|-------------|--------|----|
| status      | int    | 상태코드 |
| id        | long   | 생성된 유저 식별자 |
| username| String | 사용자 이름   |
| email| String | 사용자 이메일  |
| Password| String | 사용자 비밀번호 |

### 응답 예시
```json
{
  "status" : 200,
  "data" : {
    "id": 1,
    "username": "이형준",
    "email" : "xkrhd4@naver.com"
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
<summary>단일 유저조회</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /users/{userid}<br>
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
| 키         | 데이터타입  | 설명         |
|-----------|--------|------------|
| data      | Object | 핵심데이터      |
| status    | int    | 상태코드       |
| id        | long   | 생성된 할일 식별자 |
| username  | String | 사용자이름      |
| email     | String | 사용자 이메일    |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "id": 1,
     "username" : "이형준",
     "email" : "xkrhd3@naver.com"
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
<summary>유저 전체조회</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /users<br>
HTTP METHOD : GET<br>
설명 : 유저 전체정보를 조회하는 API입니다.<br>


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
| 키         | 데이터타입  | 설명 |
|-----------|--------|----|
| data      | Object | 핵심데이터 |
| status    | int    | 상태코드 |
| id        | long   | 생성된 할일 식별자 |
| username  | String | 사용자이름 |
| email     | String | 사용자 이메일 |

### 응답 예시
```json

   "status" : 200,
   "data" : {
   "id": 1,
   "username" : "이형준",
   "email" : "xkrhd3@naver.com",
   },
   {
   "id": 2,
   "username" : "이형준2",
   "email" : "xkrhd4@naver.com",
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
<summary>유저삭제</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /users/{userid}<br>
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
   "message" : "유저가 없습니다."
}
```
</details>
<details>
<summary>로그인</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /users/login/{userid}<br>
HTTP METHOD : GET<br>
설명 : 유저 정보로 로그인하는 API입니다.<br>


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
localhost:8080/users/login/{userid}
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
  "username" : "이형준",
  "email" : "xkrhd3@naver.com"
}
```

### 3. 응답(Response)
| 키         | 데이터타입  | 설명         |
|-----------|--------|------------|
| data      | Object | 핵심데이터      |
| status    | int    | 상태코드       |
| id        | long   | 생성된 할일 식별자 |
| logout  | String | 로그인 메시지    |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "logIn" : "로그인 성공"
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
<summary>로그아웃</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /users/logout/{userid}<br>
HTTP METHOD : GET<br>
설명 : 유저 정보로 로그아웃하는 API입니다.<br>


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
localhost:8080/users/logout/{userid}
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
| 키         | 데이터타입  | 설명         |
|-----------|--------|------------|
| data      | Object | 핵심데이터      |
| status    | int    | 상태코드       |
| id        | long   | 생성된 할일 식별자 |
| logout  | String | 로그아웃 메시지   |

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "logout" : "로그아웃 되었습니다."
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

## 댓글 API 설계

<details>
<summary>댓글생성</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /comments<br>
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

### 응답 예시
```json
{
   "status" : 200,
   "data" : {
     "id" : 1,
     "userid": 1,
     "Postid" : 1,
     "commentContents" : "스프링 어렵다...인생"
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
URL : /comments/{commentsid}<br>
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
| 키 | 데이터타입  | 설명     |
|---|--------|--------|
| commentid  | int    | 댓글 식별자 |

```json
localhost:8080/comments/{commentsid}
```

## c.body

### 1.설명
| 키        | 데이터타입 | 설명 |
|----------|-------|----|
| comment | String | 댓글 |

### 2. 요청예시
```json
{
  "comment" : "스프링 어렵다...인생2"
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
| comment |String| 생성 댓글      |

### 응답 예시
```json
{
  "status" : 200,
  "data" : {
    "id" : 1,
    "userid": 1,
    "Postid" : 1,
    "comment" : "스프링 어렵다...인생2"
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
<summary>단일 댓글조회</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /comments/{commentsid}<br>
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
| 키       | 데이터타입  | 설명     |
|---------|--------|--------|
| commentid  | int    | 댓글 식별자 |

```json
localhost:8080/comments/{commentsid}
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
| comment |String| 생성 댓글      |

### 응답 예시
```json
{
  "status" : 200,
  "data" : {
    "id" : 1,
    "userid": 1,
    "Postid" : 1,
    "comment" : "스프링 어렵다...인생"
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
<summary>댓글조회</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /comments<br>
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
| 키            | 데이터타입  | 설명         |
|--------------|--------|------------|
| data         | Object | 핵심데이터      |
| status       | int    | 상태코드       |
| id           | bigint | 일정고유 식별자   | 
| userid       | bigint   | 생성된 유저 식별자 |
| scheduleid           | bigint   | 생성된 일정 식별자 |
| comment |String| 생성 댓글      |

### 응답 예시
```json

   "status" : 200,
   "data" : {
   "id" : 1,
   "userid": 1,
   "scheduleid" : 1,
   "comment" : "스프링 어렵다...인생"
   },
   {
   "id" : 2,
   "userid": 2,
   "scheduleid" : 2,
   "comment" : "스프링 어렵다...인생"
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
<summary>댓글삭제</summary>

<!-- summary 아래 한칸 공백 두어야함 -->

## 00.개요<br>
URL : /comments/{commentid}<br>
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
| commentid  | int    | 유저 식별자 |

```json
localhost:8080/comments/{commentid}
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
   "message" : "댓글이 없습니다."
}
```
</details>

## ERD 1
![Image](https://github.com/user-attachments/assets/f3665d2e-fdd0-4bc5-b1ec-d8773d9bf2c7)

## ERD 2
![Image](https://github.com/user-attachments/assets/797e0ef3-2f97-4ab4-a875-8a6df9f6b99e)

## ERD 3
![Image](https://github.com/user-attachments/assets/33fbf917-513a-4974-b72d-34fb726d12ea)

## ERD 7
![Image](https://github.com/user-attachments/assets/8d11836f-f87b-465d-87f5-0ec07a899c84)

