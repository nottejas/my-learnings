package com.example.management.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.management.entitiy.LibraryCard;
import com.example.management.entitiy.Member;
import com.example.management.service.LibraryCardService;

import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("/cards")
@RequiredArgsConstructor
public class LibraryCardController {

    private final LibraryCardService cardService;
    


    @PostMapping("/member/{memberId}")
    public ResponseEntity<Member> addCard(
            @PathVariable Long memberId,
            @RequestBody LibraryCard card) {

        return ResponseEntity.ok(cardService.addCardToMember(memberId, card));
    }

    @GetMapping
    public ResponseEntity<List<LibraryCard>> getAllCards() {
        return ResponseEntity.ok(cardService.getAllCards());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LibraryCard> getCard(@PathVariable Long id) {
        return ResponseEntity.ok(cardService.getCardById(id));
    }
}
