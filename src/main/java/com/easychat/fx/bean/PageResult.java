package com.easychat.fx.bean;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author Ann
 * date: 2024/08/22.
 * description: 分页返回model
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /**
     * 总记录数
     */
    private int totalRecord;
    /**
     * 记录
     */
    private List<T> records;
    /**
     * 是否有下一页
     */
    private boolean hasNext;
    
    /**
     * 总页数
     */
    private int pages;
    
    private int currentPage;
}
