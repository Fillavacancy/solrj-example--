package net.aimeizi.service;

import java.util.Map;

public interface JDProductService {
    Map<String, Object> query(String queryString, String sort, int start, int pageSize) throws Exception;
}
