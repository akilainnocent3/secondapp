package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.ne, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4426ne {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f63170c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f63171d = 2070;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f63172e = 2080;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f63173f = 2090;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f63174g = 2100;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f63175h = 2110;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f63176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f63177b;

    /* JADX INFO: renamed from: com.ironsource.ne$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        private a() {
        }
    }

    public C4426ne(int i10, @oy.l String errorMessage) {
        kotlin.jvm.internal.m0.p(errorMessage, "errorMessage");
        this.f63176a = i10;
        this.f63177b = errorMessage;
    }

    public final int a() {
        return this.f63176a;
    }

    @oy.l
    public final String b() {
        return this.f63177b;
    }

    public final int c() {
        return this.f63176a;
    }

    @oy.l
    public final String d() {
        return this.f63177b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4426ne)) {
            return false;
        }
        C4426ne c4426ne = (C4426ne) obj;
        return this.f63176a == c4426ne.f63176a && kotlin.jvm.internal.m0.g(this.f63177b, c4426ne.f63177b);
    }

    public int hashCode() {
        return (this.f63176a * 31) + this.f63177b.hashCode();
    }

    @oy.l
    public String toString() {
        return "SdkError(errorCode=" + this.f63176a + ", errorMessage=" + this.f63177b + gi.j.f86771d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4426ne(@oy.l IronSourceError error) {
        kotlin.jvm.internal.m0.p(error, "error");
        int errorCode = error.getErrorCode();
        String errorMessage = error.getErrorMessage();
        kotlin.jvm.internal.m0.o(errorMessage, "error.errorMessage");
        this(errorCode, errorMessage);
    }

    @oy.l
    public final C4426ne a(int i10, @oy.l String errorMessage) {
        kotlin.jvm.internal.m0.p(errorMessage, "errorMessage");
        return new C4426ne(i10, errorMessage);
    }

    public static /* synthetic */ C4426ne a(C4426ne c4426ne, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c4426ne.f63176a;
        }
        if ((i11 & 2) != 0) {
            str = c4426ne.f63177b;
        }
        return c4426ne.a(i10, str);
    }
}
