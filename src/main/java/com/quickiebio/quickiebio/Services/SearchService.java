package com.quickiebio.quickiebio.Services;

import com.quickiebio.quickiebio.models.SearchRequest;
import com.quickiebio.quickiebio.repositories.SearchRequestRepository;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    private final SearchRequestRepository searchRequestRepository;
    private final FetchService fetchService;

    public SearchService(SearchRequestRepository searchRequestRepository, FetchService fetchService){
        this.searchRequestRepository = searchRequestRepository;
        this.fetchService = fetchService;
    }

    public void startSearch(SearchRequest searchRequest){
        SearchRequest request = searchRequestRepository.save(searchRequest);
        fetchService.fetchPublicInfo(request);
    }
}
