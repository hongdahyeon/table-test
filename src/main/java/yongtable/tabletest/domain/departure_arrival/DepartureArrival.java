package yongtable.tabletest.domain.departure_arrival;

import yongtable.tabletest.domain.estimation.Estimation;

import javax.persistence.*;

@Entity
@Table(name = "yong_departure_arrival")
public class DepartureArrival {
    
    @Id @GeneratedValue
    @Column(name = "yong_departure_arrival_id")
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "yong_estimation_id")
    private Estimation estimation;
    
    @Column(name = "departure_arrival")
    private String departureArrival;
    
    @Column(name = "region")
    private String region;
    
    @Column(name = "floor")
    private Integer floor;
    
    @Column(name = "elevator") // 엘베 유무
    private String elevator;
    
    @Column(name = "seperate_stairs") // 1층 별도 계단
    private String seperateStairs;
    
    @Column(name = "building_type") // 건물 종류
    private String buildingType;
    
    @Column(name = "house_size") // 집 평수
    private String houseSize;
    
    @Column(name = "room_structure") // 집구조
    private String room_structure;
}
