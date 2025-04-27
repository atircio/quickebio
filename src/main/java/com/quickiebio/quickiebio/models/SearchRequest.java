package com.quickiebio.quickiebio.models;

import com.quickiebio.quickiebio.models.enums.SearchType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_SEARCH_REQUEST")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class SearchRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String query;
    private SearchType searchType;

    private LocalDateTime createdAt;


    @PrePersist
    public void setCreatedAt(){
        this.createdAt = LocalDateTime.now();
    }

}
