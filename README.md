# torder 프로젝트

요구사항 분석 및 참고 자료 : https://www.notion.so/Java-Spring-boot-d2a2a8da28ec4ff3a410df9e0724751b

# Torder Porject

## 개발 환경

리눅스 20.04 RTS

Spring boot

VScode

## Requirement analysis

### 기능 요구사항 분석

1. 계정 관리
    1. 전화 번호로 회원가입
    2. 전화번호로 login
    3. logout
    
1. 메뉴 조회
    1. 메뉴 조회
    2. 메뉴 추가
    3. 메뉴 변경
    4. 메뉴 세부 설명 보기
    
1. 메뉴 선택
    1. 장바구니 조회
    2. 메뉴 선택 장바구니 추가
    3. 장바구니 수량 선택
    4. 옵션 선택
    5. 장바구니 삭제
    
1. 주문
    1. 주문내역 조회
    
1. 계산
    1. 계산 후 주문내역 삭제
    2. 결제 내역 추가 
    

### 비기능 요구사항 분석

1. Monolithic 
2. REST API
3. 사용 프레임워크 ; Spring Boot
4. JPA 사용
5. JWT 인증  

### system context diagram

### class Diagram

### ER Diagram

필수적으로 필요한 DB

- USER
    - id : int, pk
        - 고유 index
    - telephone: varchar(12), unique
        - id 대용 휴대폰 번호
    - pay_hist: 리스트, fk (PAY_HIST), cascade
        - 결제 내역
    - order_hist: 리스트, fk(ORDER_HIST), cascade
        - 주문 내역
        
- MENU
    - name : varchar(30), pk
        - 메뉴 명
    - price: int
        - 가격
    - photo: media
        - 사진
    - recomand : bool
        - 추천 여부
    - menu_desc : varchar(255)
        - 메뉴 설명
    - menu_dist: Enum
        - 메뉴 분류(음료, 메인 등등)

- ORDER_HIST
    - index : int, pk
    - menu : list, fk(MENU)
    - order_time: timestamp
    - ea : int
    
- PAY_HIST
