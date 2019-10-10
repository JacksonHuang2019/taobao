package com.ccic.taobao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author :hzs
 * @Date :Created in 9:08 2019/9/16
 * @Description :
 * Modified By   :
 * @Version ：
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Long deptNo;
    private String dName;
    private String dbSource;
}
