package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class cn {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private a f1372;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ds f1373;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Class f1374;

        public a(Class cls) {
            this.f1374 = cls;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final Class m1571() {
            return this.f1374;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public abstract boolean mo1572(hv hvVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cn.a
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo1572(hv hvVar) {
            return m1571().isInstance(hvVar.mo2309());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends a {
        public c(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cn.a
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo1572(hv hvVar) {
            return m1571().equals(hvVar.mo2308().getType());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends a {
        public d(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cn.a
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo1572(hv hvVar) {
            return m1571().isAssignableFrom(hvVar.mo2308().getType());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private cn f1375 = new cn();

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final e m1573(Class cls) {
            this.f1375.f1372 = new d(cls);
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final e m1574(Class cls) {
            this.f1375.f1372 = new c(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final cn m1575() {
            return this.f1375;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final e m1577(Class cls) {
            this.f1375.f1372 = new b(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final e m1576(ds dsVar) {
            this.f1375.f1373 = dsVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m1570(hv hvVar, du duVar, cq cqVar, List<Object> list) {
        a aVar = this.f1372;
        if (aVar != null && !aVar.mo1572(hvVar)) {
            return false;
        }
        if (this.f1373 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, hvVar);
        return this.f1373.m2052(duVar, cqVar, arrayList).m2046();
    }
}
