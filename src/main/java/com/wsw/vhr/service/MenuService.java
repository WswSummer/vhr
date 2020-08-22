package com.wsw.vhr.service;

import com.wsw.vhr.mapper.MenuMapper;
import com.wsw.vhr.model.Hr;
import com.wsw.vhr.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WSW
 * @date 2020/5/6 16:47
 */
@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;

    public List<Menu> getMenusByHrId() {
        Integer id = ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();
        return menuMapper.getMenusByHrId(id);
    }
}
