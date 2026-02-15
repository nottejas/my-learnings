package com.example.management.service;


import java.util.List;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import com.example.management.entitiy.LibraryCard;
import com.example.management.entitiy.Member;
import com.example.management.repository.LibraryCardRepository;
import com.example.management.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class LibraryCardService {

    private final MemberRepository memberRepository;
    private final LibraryCardRepository cardRepository;

    public Member addCardToMember(Long memberId, LibraryCard card) {

        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new RuntimeException("Member not found with id: " + memberId));

        member.getCards().add(card);

        return memberRepository.save(member);
    }

    public List<LibraryCard> getAllCards() {
        return cardRepository.findAll();
    }

    public LibraryCard getCardById(Long id) {
        return cardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Card not found with id: " + id));
    }
}
