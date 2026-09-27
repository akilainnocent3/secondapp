package sw;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f135845c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f135846d = 65535;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f135847e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f135848f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f135849g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f135850h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f135851i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f135852j = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f135853k = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f135854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final int[] f135855b = new int[10];

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public a() {
        }
    }

    public final void a() {
        this.f135854a = 0;
        fr.q.T1(this.f135855b, 0, 0, 0, 6, null);
    }

    public final int b(int i10) {
        return this.f135855b[i10];
    }

    public final boolean c(boolean z10) {
        if ((this.f135854a & 4) != 0) {
            return this.f135855b[2] == 1;
        }
        return z10;
    }

    public final int d() {
        if ((this.f135854a & 2) != 0) {
            return this.f135855b[1];
        }
        return -1;
    }

    public final int e() {
        if ((this.f135854a & 16) != 0) {
            return this.f135855b[4];
        }
        return 65535;
    }

    public final int f() {
        if ((this.f135854a & 8) != 0) {
            return this.f135855b[3];
        }
        return Integer.MAX_VALUE;
    }

    public final int g(int i10) {
        return (this.f135854a & 32) != 0 ? this.f135855b[5] : i10;
    }

    public final int h(int i10) {
        return (this.f135854a & 64) != 0 ? this.f135855b[6] : i10;
    }

    public final boolean i(int i10) {
        return ((1 << i10) & this.f135854a) != 0;
    }

    public final void j(@oy.l z other) {
        m0.p(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.i(i10)) {
                k(i10, other.b(i10));
            }
        }
    }

    @oy.l
    public final z k(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f135855b;
            if (i10 < iArr.length) {
                this.f135854a = (1 << i10) | this.f135854a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int l() {
        return Integer.bitCount(this.f135854a);
    }
}
