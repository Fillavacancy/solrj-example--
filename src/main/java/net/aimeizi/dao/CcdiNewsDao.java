package net.aimeizi.dao;

import net.aimeizi.domain.News;
import java.util.List;

public interface CcdiNewsDao {
    void save(News news);

    List<News> findAll();
}
