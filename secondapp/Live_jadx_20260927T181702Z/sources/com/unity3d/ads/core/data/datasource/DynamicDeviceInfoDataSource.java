package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.List;
import nv.i;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface DynamicDeviceInfoDataSource {
    @l
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch();

    @l
    String getConnectionTypeStr();

    int getCurrentUiTheme();

    @l
    List<String> getLocaleList();

    @l
    String getOrientation();

    int getRingerMode();

    @l
    i<VolumeSettingsChange> getVolumeSettingsChange();

    boolean hasInternet();
}
