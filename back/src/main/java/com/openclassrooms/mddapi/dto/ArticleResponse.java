package com.openclassrooms.mddapi.dto;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class ArticleResponse {
	Long id;
	String title;
	String content;
	String authorName;
	Instant createdAt;
	String theme;
}
