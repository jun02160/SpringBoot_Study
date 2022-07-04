package jun.junspring.repository;

import jun.junspring.domain.Member;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements MemberRepository {

    private final EntityManager em;

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        em.persist(member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        Member member = em.find(Member.class, id);   // 찾을 Type과 식별값(pk)
        return Optional.ofNullable(member);
    }

    @Override
    public Optional<Member> findByName(String name) {
        List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();   // 찾을 Type과 식별값(pk)

        return result.stream().findAny();
    }

    @Override
    public List<Member> findAll() {
        // Member Entity를 대상으로 Query 날리기
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }
}
