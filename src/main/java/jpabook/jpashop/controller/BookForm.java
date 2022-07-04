package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookForm {

    // 상품의 공통속성들
    private Long id;
    private String name;
    private int price;
    private int stockQuantity;

    // book 속성들
    private String author;
    private String isbn;
}
