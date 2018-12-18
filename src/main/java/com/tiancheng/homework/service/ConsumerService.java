/*
package com.tiancheng.homework.service;

import com.tiancheng.homework.domain.Comment;
import com.tiancheng.homework.domain.CommentShow;
import com.tiancheng.homework.domain.Consumer;
import com.tiancheng.homework.domain.Goods;
import com.tiancheng.homework.mapper.ConsumerMapper;
import com.tiancheng.homework.mapper.ContactMapper;
import com.tiancheng.homework.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private ConsumerMapper consumerMapper;

    @Autowired
    private ContactMapper contactMapper;

    public List<Goods> getHotGoods() {
        return goodsMapper.selectHotGoods();
    }

    public List<Goods> getSpecialGoods() {
        return goodsMapper.selectSpecialGoods();
    }

    public boolean checkSignIn(String id, String password) {
        String truePassword = consumerMapper.selectPasswordById(id);
        if (truePassword.equals(password)) {
            return true;
        }
        return false;
    }

    public String getUsername(String id) {
        return consumerMapper.selectUsernameById(id);
    }

    public int checkSignUp(String id, String username, String address, String phone, String password) {
        try{
            return consumerMapper.insert(id, username, address, phone, password);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void addContact(String id, String name, String email, String phone, String message) {
        contactMapper.insert(id, name, email, phone, message);
    }

    public Goods getGoodsById(int id) {
        return goodsMapper.selectGoodById(id);
    }

    public List<CommentShow> getComment(String id) {
        return goodsMapper.selectCommentById(id);
    }

    public int addComment(String content, String goods_id, String id) {
        return goodsMapper.insert(content,goods_id,id);
    }

    public List<Goods> getSearchResult(String key) {
        return goodsMapper.selectLike(key);
    }


    public Consumer getConsumerInfo(String id) {
        return consumerMapper.selectConsumerById(id);
    }
}
*/
