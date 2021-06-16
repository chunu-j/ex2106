package org.zerock.ex2106.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.test.annotation.Commit;
import org.zerock.ex2106.entitiy.Memo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@SpringBootTest
public class MemoRepositoryTests {

    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testParam() {
        int result = memoRepository.updateMemoText(99L, "ChangeText");
        System.out.println(result);
        System.out.println("=============");
        Optional<Memo> memo = memoRepository.findById(99l);
        System.out.println("memo = " + memo);
    }

/*    @Test // 연습하기
    public void testQuery() {
        Pageable pageable = PageRequest.of(0, 10);
        List<Memo> result = memoRepository.getListDesc(pageable);

        for(Memo memo : result){
            System.out.println(memo);
        }
    }*/

// ==============================
/*    @Commit
    @Transactional
    @Test
    public void testDeleteQueryMethods() {
        memoRepository.deleteMemoByMnoLessThan(10L);
    }*/

/*    @Test
    public void testQueryMethodWithPageable() {
        Pageable pageable = PageRequest.of(0, 10, Sort.by("mno").descending());
        Page<Memo> result = memoRepository.findByMnoBetween(10L, 50L, pageable);
        result.get().forEach(memo -> System.out.println(memo));
    }

    @Test
    public void testQueryMethods() {
        List<Memo> list = memoRepository.findByMnoBetweenOrderByMnoDesc(70L, 80L);

        for(Memo memo : list){
            System.out.println(memo);
        }
    }*/

/*    @Test
    public void testSort(){
        Sort sort1 = Sort.by("mno").descending();
        Sort sort2 = Sort.by("memoText").ascending();
        Sort sortAll = sort1.and(sort2); // and를 이용한 연결
        Pageable pageable = PageRequest.of(0, 10, sortAll); // 결합된 정렬 조건
        Page<Memo> result = memoRepository.findAll(pageable);

        result.get().forEach( memo -> {
            System.out.println(memo);
        });
    }*/

/*    @Test
    public void testPageDefault() {
        // 1페이지 10개
        Pageable pageable = PageRequest.of(0, 10);
        Page<Memo> result = memoRepository.findAll(pageable);
        System.out.println("result = " + result);
        System.out.println("=============");
        System.out.println("Total Pages: " + result.getTotalPages());
        System.out.println("Total Count: " + result.getTotalElements());
        System.out.println("Page Number: " + result.getNumber()); // 현재 페이지 번호 0부터 시작
        System.out.println("Page Size: " + result.getSize()); // 페이지당 데이터 개수
        System.out.println("has next page?: " + result.hasNext()); // 다음 페이지?
        System.out.println("first page?: " + result.isFirst()); // 시작 페이지(0) 여부
        System.out.println("=============");
        for (Memo memo : result.getContent()) {
            System.out.println("memo = " + memo);
        }
    }*/

// ==============================
/*    @Test
    public void testDelete() {
        Long mno = 100L;
        memoRepository.deleteById(mno);

        Memo memo = Memo.builder().mno(99L).build();
        memoRepository.delete(memo);
    }*/

/*    @Test
    public void testUpdate() {
        Memo memo = Memo.builder().mno(100L).memoText("Update Text").build();
        System.out.println("memoRepository = " + memoRepository.save(memo));
    }*/

/*    @Transactional
    @Test
    public void testSelect() {
        // DB에 존재하는 mno
        Long mno = 100L;

        Memo memo = memoRepository.getOne(mno);
        System.out.println("===============================");
        System.out.println("memo = " + memo);
    }*/

/*    @Test
    public void testInsertDummies() {
        IntStream.rangeClosed(1,100).forEach(i -> {
            Memo memo = Memo.builder().memoText("Sample..."+i).build();
            memoRepository.save(memo);
        });
    }*/

/*    @Test
    public void testClass(){
        System.out.println(memoRepository.getClass().getName());
    }*/
}
