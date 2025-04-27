package com.quickiebio.quickiebio.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "TB_SUMMARY")
public class Summary {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "search_request_id")
    private SearchRequest searchRequest;
    private String blogFormatText;
    private String cvFormatText;
    private LocalDateTime createdAt;
}
