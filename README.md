# table-test
table-test

* 23-05-19 | commit 1  (beginning)
* 23-05-22 | commit 2  (moving company table)
* 23-05-22 | commit 3  (moving company -> user table : 잘못이름을 적음.. & user table에다가 BaseEntity 추가)
* 23-05-22 | commit 4  (user table package 이동)
* 23-05-22 | commit 5  (user table id 컬럼명 수정)
* 23-05-22 | commit 6  (user table name 수정 -> 'user'로 테이블 이름을 할 경우, sql 키워드와 겹처서 ddl 생성시 오류가 발생한다.)
* 23-05-22 | commit 7  (알림 & 알림타입 테이블 생성 -> 2개 테이블 모두 BaseEntity를 상속받는다.)
* 23-05-22 | commit 8  (알림 & 알림타입 테이블 이름 변경 -> 모든 테이블 앞에 'yong' 붙이기)
* 23-05-22 | commit 9  (알림 & 알림타입 & 유저 id 컬럼명 변경 -> 모든 테이블의 id컬럼명은 'table이름+_id'로 통일)
* 23-05-22 | commit 10 (commit9의 id 컬럼명 변경에 따른 -> joincolumn name값 변경)
* 23-05-22 | commit 11 (db url 변경 -> db 연결 at intellij)
