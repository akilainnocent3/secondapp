package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final String f59207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final String f59208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f59209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    private final Boolean f59210d;

    public Hf(@oy.m String str, boolean z10, @oy.m Boolean bool, @oy.m String str2) {
        this.f59207a = str2;
        this.f59208b = str;
        this.f59209c = z10;
        this.f59210d = bool;
    }

    @oy.m
    public final String a() {
        return this.f59207a;
    }

    public final boolean b() {
        return kotlin.jvm.internal.m0.g(this.f59210d, Boolean.TRUE);
    }

    public final boolean a(@oy.l NetworkSettings networkSettings, @oy.l IronSource.a adUnit) {
        kotlin.jvm.internal.m0.p(networkSettings, "networkSettings");
        kotlin.jvm.internal.m0.p(adUnit, "adUnit");
        String str = this.f59208b;
        if (str == null || str.length() == 0) {
            return true;
        }
        Kf kf2 = Kf.f59378a;
        return kotlin.jvm.internal.m0.g(kf2.a(networkSettings), this.f59208b) && kf2.a(networkSettings, adUnit) == this.f59209c;
    }

    public /* synthetic */ Hf(String str, boolean z10, Boolean bool, String str2, int i10, kotlin.jvm.internal.x xVar) {
        this(str, z10, (i10 & 4) != 0 ? Boolean.FALSE : bool, (i10 & 8) != 0 ? null : str2);
    }
}
