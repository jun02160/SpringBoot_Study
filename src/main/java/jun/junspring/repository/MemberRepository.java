package jun.junspring.repository;

import jun.junspring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    // 회원 관련 기능
    Member save(Member member);   // 새로운 회원 등록
    Optional<Member> findById(Long id);  // ID로 회원 찾기
    Optional<Member> findByName(String name);  // 이름으로 회원 찾기
    List<Member> findAll();    // 저장된 회원 리스트 반환
}
