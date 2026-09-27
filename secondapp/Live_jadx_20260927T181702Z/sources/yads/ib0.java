package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ib0 implements qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f150504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f150505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f150506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f150507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f150508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f150509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pe[] f150510g;

    public ib0() {
        this(0);
    }

    public final synchronized pe a() {
        pe peVar;
        try {
            int i10 = this.f150508e + 1;
            this.f150508e = i10;
            int i11 = this.f150509f;
            if (i11 > 0) {
                pe[] peVarArr = this.f150510g;
                int i12 = i11 - 1;
                this.f150509f = i12;
                peVar = peVarArr[i12];
                peVar.getClass();
                this.f150510g[this.f150509f] = null;
            } else {
                pe peVar2 = new pe(0, new byte[this.f150505b]);
                pe[] peVarArr2 = this.f150510g;
                if (i10 > peVarArr2.length) {
                    this.f150510g = (pe[]) Arrays.copyOf(peVarArr2, peVarArr2.length * 2);
                }
                peVar = peVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return peVar;
    }

    public final int b() {
        return this.f150505b;
    }

    public final synchronized void c() {
        try {
            int i10 = this.f150507d;
            int i11 = this.f150505b;
            int i12 = ib3.f150516a;
            int i13 = (((i10 + i11) - 1) / i11) - this.f150508e;
            int i14 = 0;
            int iMax = Math.max(0, i13);
            int i15 = this.f150509f;
            if (iMax >= i15) {
                return;
            }
            if (this.f150506c != null) {
                int i16 = i15 - 1;
                while (i14 <= i16) {
                    pe peVar = this.f150510g[i14];
                    peVar.getClass();
                    if (peVar.f153899a == this.f150506c) {
                        i14++;
                    } else {
                        pe peVar2 = this.f150510g[i16];
                        peVar2.getClass();
                        if (peVar2.f153899a != this.f150506c) {
                            i16--;
                        } else {
                            pe[] peVarArr = this.f150510g;
                            peVarArr[i14] = peVar2;
                            peVarArr[i16] = peVar;
                            i16--;
                            i14++;
                        }
                    }
                }
                iMax = Math.max(iMax, i14);
                if (iMax >= this.f150509f) {
                    return;
                }
            }
            Arrays.fill(this.f150510g, iMax, this.f150509f, (Object) null);
            this.f150509f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public ib0(int i10) {
        this.f150504a = true;
        this.f150505b = 65536;
        this.f150509f = 0;
        this.f150510g = new pe[100];
        this.f150506c = null;
    }

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f150507d;
        this.f150507d = i10;
        if (z10) {
            c();
        }
    }
}
