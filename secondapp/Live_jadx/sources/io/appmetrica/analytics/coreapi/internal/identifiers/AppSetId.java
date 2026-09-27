package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class AppSetId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppSetIdScope f95234b;

    public AppSetId(@m String str, @l AppSetIdScope appSetIdScope) {
        this.f95233a = str;
        this.f95234b = appSetIdScope;
    }

    public static /* synthetic */ AppSetId copy$default(AppSetId appSetId, String str, AppSetIdScope appSetIdScope, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appSetId.f95233a;
        }
        if ((i10 & 2) != 0) {
            appSetIdScope = appSetId.f95234b;
        }
        return appSetId.copy(str, appSetIdScope);
    }

    @m
    public final String component1() {
        return this.f95233a;
    }

    @l
    public final AppSetIdScope component2() {
        return this.f95234b;
    }

    @l
    public final AppSetId copy(@m String str, @l AppSetIdScope appSetIdScope) {
        return new AppSetId(str, appSetIdScope);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return m0.g(this.f95233a, appSetId.f95233a) && this.f95234b == appSetId.f95234b;
    }

    @m
    public final String getId() {
        return this.f95233a;
    }

    @l
    public final AppSetIdScope getScope() {
        return this.f95234b;
    }

    public int hashCode() {
        String str = this.f95233a;
        return this.f95234b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @l
    public String toString() {
        return "AppSetId(id=" + this.f95233a + ", scope=" + this.f95234b + ')';
    }
}
