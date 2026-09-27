package com.ironsource;

import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.nc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.s1({"SMAP\nNetworkExtraParamsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkExtraParamsProvider.kt\ncom/unity3d/ironsourceads/internal/configurations/NetworkExtraParamsProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1#2:22\n*E\n"})
public final class C4424nc {

    /* JADX INFO: renamed from: com.ironsource.nc$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f63165a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final String f63166b = "SDKPluginType";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final String f63167c = "sessionid";

        private a() {
        }
    }

    @oy.l
    public final Map<String, String> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String pluginType = ConfigFile.getConfigFile().getPluginType();
        if (pluginType != null) {
            linkedHashMap.put(a.f63166b, pluginType);
        }
        String strD = IronSourceUtils.d();
        if (strD != null) {
            linkedHashMap.put("sessionid", strD);
        }
        return linkedHashMap;
    }
}
