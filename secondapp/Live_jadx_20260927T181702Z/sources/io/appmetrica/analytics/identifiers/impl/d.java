package io.appmetrica.analytics.identifiers.impl;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import dr.v1;
import fr.n1;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f95423a;

    public d(Map map) {
        this.f95423a = map;
    }

    public /* synthetic */ d() {
        this(n1.W(v1.a(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, new h()), v1.a("huawei", new j()), v1.a("yandex", new q())));
    }
}
