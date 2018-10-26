package io.github.weechang.moreco.sys.domain;

import io.github.weechang.weechang.moreco.base.BaseEntry;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

/**
 * 用户与角色对应关系
 *
 * @author zhangwei
 * date 2018/10/26
 * time 17:56
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUserRoleEntity extends BaseEntry {
    private static final long serialVersionUID = -4753510506298775667L;

    @Id
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;
}
