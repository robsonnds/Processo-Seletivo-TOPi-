package io.topi.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;

import io.topi.vo.RetornoGitVO;

@Service
public class BuscaApiGitService {
	

	
	private static final String URL = "https://api.github.com/search/repositories?q=language:Java&sort=stars&page=1";
	

	public RetornoGitVO consultaGit () {

		RestTemplate restTemplate = new RestTemplate();

		try {

			ResponseEntity<RetornoGitVO> retorno = restTemplate.getForEntity(URL, RetornoGitVO.class);

			if (!ObjectUtils.isEmpty(retorno)) {
				return retorno.getBody();
			}

		} catch (Exception e) {
			throw e;
		}

		return null;

	}
	
}
