package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.o9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4439o9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f63214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    private final String f63216c;

    public C4439o9() {
        this(null, 0, null, 7, null);
    }

    @oy.l
    public final String a() {
        return this.f63214a;
    }

    public final int b() {
        return this.f63215b;
    }

    @oy.m
    public final String c() {
        return this.f63216c;
    }

    @oy.m
    public final String d() {
        return this.f63216c;
    }

    @oy.l
    public final String e() {
        return this.f63214a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4439o9)) {
            return false;
        }
        C4439o9 c4439o9 = (C4439o9) obj;
        return kotlin.jvm.internal.m0.g(this.f63214a, c4439o9.f63214a) && this.f63215b == c4439o9.f63215b && kotlin.jvm.internal.m0.g(this.f63216c, c4439o9.f63216c);
    }

    public final int f() {
        return this.f63215b;
    }

    public int hashCode() {
        int iHashCode = ((this.f63214a.hashCode() * 31) + this.f63215b) * 31;
        String str = this.f63216c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @oy.l
    public String toString() {
        return "InstanceInformation(instanceId=" + this.f63214a + ", instanceType=" + this.f63215b + ", dynamicDemandSourceId=" + this.f63216c + gi.j.f86771d;
    }

    public C4439o9(@oy.l String instanceId, int i10, @oy.m String str) {
        kotlin.jvm.internal.m0.p(instanceId, "instanceId");
        this.f63214a = instanceId;
        this.f63215b = i10;
        this.f63216c = str;
    }

    @oy.l
    public final C4439o9 a(@oy.l String instanceId, int i10, @oy.m String str) {
        kotlin.jvm.internal.m0.p(instanceId, "instanceId");
        return new C4439o9(instanceId, i10, str);
    }

    public static /* synthetic */ C4439o9 a(C4439o9 c4439o9, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c4439o9.f63214a;
        }
        if ((i11 & 2) != 0) {
            i10 = c4439o9.f63215b;
        }
        if ((i11 & 4) != 0) {
            str2 = c4439o9.f63216c;
        }
        return c4439o9.a(str, i10, str2);
    }

    public /* synthetic */ C4439o9(String str, int i10, String str2, int i11, kotlin.jvm.internal.x xVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? "" : str2);
    }
}
