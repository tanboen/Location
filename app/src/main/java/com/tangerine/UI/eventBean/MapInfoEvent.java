package com.tangerine.UI.eventBean;

import com.baidu.location.Address;
import com.tangerine.UI.infoBean.MapInfo;

public class MapInfoEvent {
    public com.baidu.location.Address address;
    public MapInfo mapInfo;
    public MapInfoEvent( MapInfo mapInfo){
        this.mapInfo = mapInfo;
    }
}
