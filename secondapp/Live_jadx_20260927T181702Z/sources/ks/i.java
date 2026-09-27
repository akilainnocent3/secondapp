package ks;

import java.io.Serializable;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class i extends f implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @l
    public static final a f102884j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f102885k = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f102886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f102887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f102888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f102889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f102890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f102891i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public a() {
        }
    }

    public i(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f102886d = i10;
        this.f102887e = i11;
        this.f102888f = i12;
        this.f102889g = i13;
        this.f102890h = i14;
        this.f102891i = i15;
        if ((i10 | i11 | i12 | i13 | i14) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i16 = 0; i16 < 64; i16++) {
            p();
        }
    }

    @Override // ks.f
    public int e(int i10) {
        return g.j(p(), i10);
    }

    @Override // ks.f
    public int p() {
        int i10 = this.f102886d;
        int i11 = i10 ^ (i10 >>> 2);
        this.f102886d = this.f102887e;
        this.f102887e = this.f102888f;
        this.f102888f = this.f102889g;
        int i12 = this.f102890h;
        this.f102889g = i12;
        int i13 = ((i11 ^ (i11 << 1)) ^ i12) ^ (i12 << 4);
        this.f102890h = i13;
        int i14 = this.f102891i + 362437;
        this.f102891i = i14;
        return i13 + i14;
    }

    public i(int i10, int i11) {
        this(i10, i11, 0, 0, ~i10, (i10 << 10) ^ (i11 >>> 4));
    }
}
