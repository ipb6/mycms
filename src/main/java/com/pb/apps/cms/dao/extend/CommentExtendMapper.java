package com.pb.apps.cms.dao.extend;
/**

* @类说明 
* @Title CommentExtendMapper.java
* @author pengbin
* @version 1.0
* @date 2019年11月19日 上午9:51:29

*/
import java.util.List;

import com.pb.apps.cms.bean.Comment;

public interface CommentExtendMapper {

    List<Comment> selectByArticleId(long article_id);
}
