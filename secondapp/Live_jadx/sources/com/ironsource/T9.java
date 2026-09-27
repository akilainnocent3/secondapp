package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class T9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f60121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f60122b;

    public T9(@oy.l String advId, @oy.l String advIdType) {
        kotlin.jvm.internal.m0.p(advId, "advId");
        kotlin.jvm.internal.m0.p(advIdType, "advIdType");
        this.f60121a = advId;
        this.f60122b = advIdType;
    }

    @oy.l
    public final String a() {
        return this.f60121a;
    }

    @oy.l
    public final String b() {
        return this.f60122b;
    }

    @oy.l
    public final String c() {
        return this.f60121a;
    }

    @oy.l
    public final String d() {
        return this.f60122b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T9)) {
            return false;
        }
        T9 t10 = (T9) obj;
        return kotlin.jvm.internal.m0.g(this.f60121a, t10.f60121a) && kotlin.jvm.internal.m0.g(this.f60122b, t10.f60122b);
    }

    public int hashCode() {
        return (this.f60121a.hashCode() * 31) + this.f60122b.hashCode();
    }

    @oy.l
    public String toString() {
        return "IronSourceAdvId(advId=" + this.f60121a + ", advIdType=" + this.f60122b + gi.j.f86771d;
    }

    @oy.l
    public final T9 a(@oy.l String advId, @oy.l String advIdType) {
        kotlin.jvm.internal.m0.p(advId, "advId");
        kotlin.jvm.internal.m0.p(advIdType, "advIdType");
        return new T9(advId, advIdType);
    }

    public static /* synthetic */ T9 a(T9 t10, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = t10.f60121a;
        }
        if ((i10 & 2) != 0) {
            str2 = t10.f60122b;
        }
        return t10.a(str, str2);
    }
}
