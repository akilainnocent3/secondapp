package com.ironsource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final List<A> f64530a;

    /* JADX WARN: Multi-variable type inference failed */
    public yg(@oy.l List<? extends A> instances) {
        kotlin.jvm.internal.m0.p(instances, "instances");
        this.f64530a = instances;
    }

    @oy.l
    public final List<A> a() {
        return this.f64530a;
    }

    @oy.l
    public final List<A> b() {
        return this.f64530a;
    }

    public final int c() {
        return this.f64530a.size();
    }

    @oy.l
    public final String d() {
        ArrayList arrayList = new ArrayList();
        for (A a10 : this.f64530a) {
            arrayList.add(a(a10.h(), a10.r()));
        }
        return fr.r0.r3(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg) && kotlin.jvm.internal.m0.g(this.f64530a, ((yg) obj).f64530a);
    }

    public int hashCode() {
        return this.f64530a.hashCode();
    }

    @oy.l
    public String toString() {
        return "WaterfallInstances(instances=" + this.f64530a + gi.j.f86771d;
    }

    @oy.l
    public final yg a(@oy.l List<? extends A> instances) {
        kotlin.jvm.internal.m0.p(instances, "instances");
        return new yg(instances);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ yg a(yg ygVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = ygVar.f64530a;
        }
        return ygVar.a(list);
    }

    private final String a(C4414n2 c4414n2, int i10) {
        kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
        String str = String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i10), c4414n2.c()}, 2));
        kotlin.jvm.internal.m0.o(str, "format(format, *args)");
        return str;
    }
}
