package xyz.weechang.moreco.component.rbac.service;

import xyz.weechang.moreco.component.rbac.model.domain.Menu;
import xyz.weechang.moreco.core.model.dto.PageModel;
import xyz.weechang.moreco.core.service.BaseService;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author zhangwei
 * date 2018/10/27
 * time 15:57
 */
public interface MenuService extends BaseService<Menu> {

    /**
     * 根据条件分页查询
     *
     * @param menu     查询条件
     * @param pageable 分页参数
     * @return 目录列表
     */
    PageModel<Menu> findAll(Menu menu, Pageable pageable);

    /**
     * 查询完整树结构
     *
     * @return 树结构
     */
    List<Menu> tree();

    /**
     * 查询授权目录
     *
     * @param username 用户名
     * @return 授权目录
     */
    List<Menu> permissionMenu(String username);

    /**
     * 查询授权目录树结构
     *
     * @param username 用户名
     * @return 授权目录树结构
     */
    List<Menu> permissionMenuTree(String username);

    /**
     * 根据目录路径，查询授权页面组件
     *
     * @param matchedPathList 目录路径
     * @param username        用户名
     * @return 授权目录
     */
    List<Menu> permissionComponent(List<String> matchedPathList, String username);
}
