package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private String f59735a;

    /* JADX WARN: Multi-variable type inference failed */
    public Of() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @oy.m
    public final String a() {
        return this.f59735a;
    }

    @oy.m
    public final String b() {
        return this.f59735a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Of) && kotlin.jvm.internal.m0.g(this.f59735a, ((Of) obj).f59735a);
    }

    public int hashCode() {
        String str = this.f59735a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @oy.l
    public String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.f59735a + gi.j.f86771d;
    }

    public Of(@oy.m String str) {
        this.f59735a = str;
    }

    @oy.l
    public final Of a(@oy.m String str) {
        return new Of(str);
    }

    public final void b(@oy.m String str) {
        this.f59735a = str;
    }

    public /* synthetic */ Of(String str, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ Of a(Of of2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = of2.f59735a;
        }
        return of2.a(str);
    }
}
