package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import or.f;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface StaticDeviceInfoDataSource {
    @m
    Object fetch(@l List<String> list, @l f<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> fVar);

    @l
    StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached();

    @m
    String getAnalyticsUserId();

    @l
    String getAppName();

    @m
    Object getAuid(@l f<? super String> fVar);

    @m
    Object getIdfi(@l f<? super String> fVar);

    @l
    String getManufacturer();

    @l
    String getModel();

    @l
    String getOsVersion();

    long getSystemBootTime();

    @m
    Object getUnityBuildGuid(@l f<? super String> fVar);
}
