package com.ironsource;

import java.util.Arrays;

/* JADX INFO: renamed from: com.ironsource.ed, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4262ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f61666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private String f61667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f61668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f61669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.m
    private int[] f61670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    private int[] f61671f;

    public C4262ed() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public final boolean a() {
        return this.f61666a;
    }

    @oy.l
    public final String b() {
        return this.f61667b;
    }

    public final boolean c() {
        return this.f61668c;
    }

    public final int d() {
        return this.f61669d;
    }

    @oy.m
    public final int[] e() {
        return this.f61670e;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4262ed)) {
            return false;
        }
        C4262ed c4262ed = (C4262ed) obj;
        return this.f61666a == c4262ed.f61666a && kotlin.jvm.internal.m0.g(this.f61667b, c4262ed.f61667b) && this.f61668c == c4262ed.f61668c && this.f61669d == c4262ed.f61669d && kotlin.jvm.internal.m0.g(this.f61670e, c4262ed.f61670e) && kotlin.jvm.internal.m0.g(this.f61671f, c4262ed.f61671f);
    }

    @oy.m
    public final int[] f() {
        return this.f61671f;
    }

    public final boolean g() {
        return this.f61668c;
    }

    public final int h() {
        return this.f61669d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        boolean z10 = this.f61666a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iHashCode = ((r10 * 31) + this.f61667b.hashCode()) * 31;
        boolean z11 = this.f61668c;
        int i10 = (((iHashCode + (z11 ? 1 : z11)) * 31) + this.f61669d) * 31;
        int[] iArr = this.f61670e;
        int iHashCode2 = (i10 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f61671f;
        return iHashCode2 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.f61666a;
    }

    @oy.l
    public final String j() {
        return this.f61667b;
    }

    @oy.m
    public final int[] k() {
        return this.f61671f;
    }

    @oy.m
    public final int[] l() {
        return this.f61670e;
    }

    @oy.l
    public String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f61666a + ", pixelEventsUrl=" + this.f61667b + ", pixelEventsCompression=" + this.f61668c + ", pixelEventsCompressionLevel=" + this.f61669d + ", pixelOptOut=" + Arrays.toString(this.f61670e) + ", pixelOptIn=" + Arrays.toString(this.f61671f) + gi.j.f86771d;
    }

    public C4262ed(boolean z10, @oy.l String pixelEventsUrl, boolean z11, int i10, @oy.m int[] iArr, @oy.m int[] iArr2) {
        kotlin.jvm.internal.m0.p(pixelEventsUrl, "pixelEventsUrl");
        this.f61666a = z10;
        this.f61667b = pixelEventsUrl;
        this.f61668c = z11;
        this.f61669d = i10;
        this.f61670e = iArr;
        this.f61671f = iArr2;
    }

    @oy.l
    public final C4262ed a(boolean z10, @oy.l String pixelEventsUrl, boolean z11, int i10, @oy.m int[] iArr, @oy.m int[] iArr2) {
        kotlin.jvm.internal.m0.p(pixelEventsUrl, "pixelEventsUrl");
        return new C4262ed(z10, pixelEventsUrl, z11, i10, iArr, iArr2);
    }

    public final void b(boolean z10) {
        this.f61666a = z10;
    }

    public static /* synthetic */ C4262ed a(C4262ed c4262ed, boolean z10, String str, boolean z11, int i10, int[] iArr, int[] iArr2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = c4262ed.f61666a;
        }
        if ((i11 & 2) != 0) {
            str = c4262ed.f61667b;
        }
        if ((i11 & 4) != 0) {
            z11 = c4262ed.f61668c;
        }
        if ((i11 & 8) != 0) {
            i10 = c4262ed.f61669d;
        }
        if ((i11 & 16) != 0) {
            iArr = c4262ed.f61670e;
        }
        if ((i11 & 32) != 0) {
            iArr2 = c4262ed.f61671f;
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        return c4262ed.a(z10, str, z11, i10, iArr3, iArr4);
    }

    public final void b(@oy.m int[] iArr) {
        this.f61670e = iArr;
    }

    public final void a(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<set-?>");
        this.f61667b = str;
    }

    public final void a(boolean z10) {
        this.f61668c = z10;
    }

    public final void a(int i10) {
        this.f61669d = i10;
    }

    public final void a(@oy.m int[] iArr) {
        this.f61671f = iArr;
    }

    public /* synthetic */ C4262ed(boolean z10, String str, boolean z11, int i10, int[] iArr, int[] iArr2, int i11, kotlin.jvm.internal.x xVar) {
        this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? C4280fd.f61787a : str, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? -1 : i10, (i11 & 16) != 0 ? null : iArr, (i11 & 32) != 0 ? null : iArr2);
    }
}
