package yongtable.tabletest.domain.furniture;

import org.hibernate.annotations.Comment;

import javax.persistence.*;

/**
 * > Furniture : 가구 테이블 -> 침대, 소파, 의자 ... 정도의 범위
 * > Furniture Detail Group : 가구 상세 그룹 -> 각 가구에 대해 상세 그룹 묶음 테이블 -> 크기, 프레임, 종류 ...
 * > Furniture Detail : 가구 상세 테이블 -> 각 가구 상세 그룹 속에 있는 상세 종류들 -> 일인용, 접이식, 라텍스, 일반 ...
 * >> 유저 가구 목록 -> 가구 id (침대) -> 가구 상세 id (접이식)  다음과 같이 매핑된다.
 *
 * */
@Entity
@Table(name = "yong_furniture")
public class Furniture {

    @Id @GeneratedValue
    @Column(name = "yong_furniture_id")
    private Long id;

    @Column(name = "furniture_name")
    private String furnitureName;

    @Column(name = "furniture_upper_id")
    @Comment("가구들의 상위 그룹 (ex)대형/소형 가전, 가구 ...")
    private Long furnitureUpperId;

    @Column(name = "icon_image_id")
    private Long iconImageId;
}
