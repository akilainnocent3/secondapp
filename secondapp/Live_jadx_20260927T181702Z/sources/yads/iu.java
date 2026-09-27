package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class iu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m73 f150807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f150808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f150809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f150810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f150811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f150812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f150813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f150814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f150815i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f150816j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f150817k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f150818l;

    public iu(int i10, int i11, long j10, int i12, m73 m73Var) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        ni.a(z10);
        this.f150810d = j10;
        this.f150811e = i12;
        this.f150807a = m73Var;
        this.f150808b = a(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f150809c = i11 == 2 ? a(i10, 1650720768) : -1;
        this.f150817k = new long[512];
        this.f150818l = new int[512];
    }

    public final void a(long j10) {
        if (this.f150816j == this.f150818l.length) {
            long[] jArr = this.f150817k;
            this.f150817k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f150818l;
            this.f150818l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f150817k;
        int i10 = this.f150816j;
        jArr2[i10] = j10;
        this.f150818l[i10] = this.f150815i;
        this.f150816j = i10 + 1;
    }

    public final tw2 b(long j10) {
        long j11 = 1;
        int i10 = (int) (j10 / ((this.f150810d * j11) / ((long) this.f150811e)));
        int iA = ib3.a(this.f150818l, i10, true, true);
        int[] iArr = this.f150818l;
        int i11 = iArr[iA];
        if (i11 == i10) {
            xw2 xw2Var = new xw2(((this.f150810d * j11) / ((long) this.f150811e)) * ((long) i11), this.f150817k[iA]);
            return new tw2(xw2Var, xw2Var);
        }
        long j12 = i11;
        long j13 = (this.f150810d * j11) / ((long) this.f150811e);
        long[] jArr = this.f150817k;
        xw2 xw2Var2 = new xw2(j12 * j13, jArr[iA]);
        int i12 = iA + 1;
        return i12 < jArr.length ? new tw2(xw2Var2, new xw2(j13 * ((long) iArr[i12]), jArr[i12])) : new tw2(xw2Var2, xw2Var2);
    }

    public final void a() {
        this.f150817k = Arrays.copyOf(this.f150817k, this.f150816j);
        this.f150818l = Arrays.copyOf(this.f150818l, this.f150816j);
    }

    public static int a(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }
}
