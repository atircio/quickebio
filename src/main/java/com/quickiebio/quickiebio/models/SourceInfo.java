package com.quickiebio.quickiebio.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "TB_SOURCE_INFO")
public class SourceInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "search_request_id")
    private SearchRequest searchRequest;
    private String title;
    private String link;
    private String snippet;
    private String source;
}
