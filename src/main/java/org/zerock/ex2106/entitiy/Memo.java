package org.zerock.ex2106.entitiy;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb1_memo")
// lombok
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;
}
