package cn.edu.zucc.dao.Category;

import cn.edu.zucc.model.TbArticleEntity;
import cn.edu.zucc.model.TbCategoryEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by shentao on 2016/5/31.
 */
public interface CategoryDao {

    //增
    public  void  save(TbCategoryEntity tbCategoryEntity)  throws Exception;

    //删
    public void delete(TbCategoryEntity tbCategoryEntity)  throws Exception;

    //改
    public void update(TbCategoryEntity tbCategoryEntity)  throws Exception;


    //查总数
    public  long getCount() throws Exception;

    //查所有
    public List<TbCategoryEntity> findAll();

    //查分页


    //查单个
    public TbCategoryEntity findById(Integer id) throws Exception;

    public TbCategoryEntity findByName(String name) throws Exception;






}
