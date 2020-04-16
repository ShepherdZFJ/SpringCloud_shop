package com.shepherd.springcloudproduct.api.vo;

import com.shepherd.springcloudproduct.dto.CategoryDTO;
import com.shepherd.springcloudproduct.dto.ProductDTO;
import lombok.Data;

import java.util.List;

/**
 * @author fjZheng
 * @version 1.0
 * @date 2020/4/16 19:53
 */
@Data
public class CategoryVO {
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private List<CategoryDTO> data;

}

