package yads;

import android.util.SparseArray;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class k01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m73 f151334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f151335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f151336c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kb2 f151339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f151340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f151341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f151342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f151343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f151344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f151345l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f151348o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f151349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f151350q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f151351r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f151337d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f151338e = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j01 f151346m = new j01();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j01 f151347n = new j01();

    public k01(m73 m73Var, boolean z10, boolean z11) {
        this.f151334a = m73Var;
        this.f151335b = z10;
        this.f151336c = z11;
        byte[] bArr = new byte[128];
        this.f151340g = bArr;
        this.f151339f = new kb2(bArr, 0, 0);
        a();
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:59:0x0111  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:63:0x011d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128  */
    /* JADX WARN: Code duplicated, block: B:73:0x0148  */
    /* JADX WARN: Code duplicated, block: B:74:0x014c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0180  */
    public final void a(byte[] bArr, int i10, int i11) {
        boolean zC;
        boolean zC2;
        boolean z10;
        boolean z11;
        int iD;
        int i12;
        int iE;
        int iE2;
        int i13;
        int iB;
        if (this.f151344k) {
            int i14 = i11 - i10;
            byte[] bArr2 = this.f151340g;
            int length = bArr2.length;
            int i15 = this.f151341h + i14;
            if (length < i15) {
                this.f151340g = Arrays.copyOf(bArr2, i15 * 2);
            }
            System.arraycopy(bArr, i10, this.f151340g, this.f151341h, i14);
            int i16 = this.f151341h + i14;
            this.f151341h = i16;
            int i17 = 0;
            this.f151339f.a(this.f151340g, 0, i16);
            if (this.f151339f.a(8)) {
                this.f151339f.f();
                int iB2 = this.f151339f.b(2);
                this.f151339f.d(5);
                if (this.f151339f.b()) {
                    this.f151339f.d();
                    if (this.f151339f.b()) {
                        int iD2 = this.f151339f.d();
                        if (!this.f151336c) {
                            this.f151344k = false;
                            j01 j01Var = this.f151347n;
                            j01Var.f150884e = iD2;
                            j01Var.f150881b = true;
                            return;
                        }
                        if (this.f151339f.b()) {
                            int iD3 = this.f151339f.d();
                            if (this.f151338e.indexOfKey(iD3) < 0) {
                                this.f151344k = false;
                                return;
                            }
                            by1 by1Var = (by1) this.f151338e.get(iD3);
                            cy1 cy1Var = (cy1) this.f151337d.get(by1Var.f147397a);
                            if (cy1Var.f147955h) {
                                if (!this.f151339f.a(2)) {
                                    return;
                                } else {
                                    this.f151339f.d(2);
                                }
                            }
                            if (this.f151339f.a(cy1Var.f147957j)) {
                                int iB3 = this.f151339f.b(cy1Var.f147957j);
                                if (!cy1Var.f147956i) {
                                    if (this.f151339f.a(1)) {
                                        zC = this.f151339f.c();
                                        if (!zC) {
                                            zC2 = false;
                                        } else {
                                            if (!this.f151339f.a(1)) {
                                                return;
                                            }
                                            zC2 = this.f151339f.c();
                                            z10 = true;
                                        }
                                        if (this.f151342i == 5) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            iD = 0;
                                        } else if (!this.f151339f.b()) {
                                            return;
                                        } else {
                                            iD = this.f151339f.d();
                                        }
                                        i12 = cy1Var.f147958k;
                                        if (i12 == 0) {
                                            if (!this.f151339f.a(cy1Var.f147959l)) {
                                                return;
                                            }
                                            iB = this.f151339f.b(cy1Var.f147959l);
                                            if (by1Var.f147398b || zC) {
                                                iE = 0;
                                                i13 = iB;
                                                iE2 = 0;
                                            } else {
                                                if (!this.f151339f.b()) {
                                                    return;
                                                }
                                                iE = this.f151339f.e();
                                                i13 = iB;
                                                iE2 = 0;
                                            }
                                        } else if (i12 == 1 || cy1Var.f147960m) {
                                            iE = 0;
                                            iE2 = 0;
                                            i13 = 0;
                                        } else {
                                            if (!this.f151339f.b()) {
                                                return;
                                            }
                                            int iE3 = this.f151339f.e();
                                            if (!by1Var.f147398b || zC) {
                                                iE = 0;
                                                i13 = 0;
                                                i17 = iE3;
                                                iE2 = 0;
                                            } else {
                                                if (!this.f151339f.b()) {
                                                    return;
                                                }
                                                i13 = 0;
                                                i17 = iE3;
                                                iE2 = this.f151339f.e();
                                                iE = 0;
                                            }
                                        }
                                        j01 j01Var2 = this.f151347n;
                                        j01Var2.f150882c = cy1Var;
                                        j01Var2.f150883d = iB2;
                                        j01Var2.f150884e = iD2;
                                        j01Var2.f150885f = iB3;
                                        j01Var2.f150886g = iD3;
                                        j01Var2.f150887h = zC;
                                        j01Var2.f150888i = z10;
                                        j01Var2.f150889j = zC2;
                                        j01Var2.f150890k = z11;
                                        j01Var2.f150891l = iD;
                                        j01Var2.f150892m = i13;
                                        j01Var2.f150893n = iE;
                                        j01Var2.f150894o = i17;
                                        j01Var2.f150895p = iE2;
                                        j01Var2.f150880a = true;
                                        j01Var2.f150881b = true;
                                        this.f151344k = false;
                                    }
                                    return;
                                }
                                zC = false;
                                zC2 = false;
                                z10 = zC2;
                                if (this.f151342i == 5) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    iD = 0;
                                } else if (!this.f151339f.b()) {
                                    return;
                                } else {
                                    iD = this.f151339f.d();
                                }
                                i12 = cy1Var.f147958k;
                                if (i12 == 0) {
                                    if (!this.f151339f.a(cy1Var.f147959l)) {
                                        return;
                                    }
                                    iB = this.f151339f.b(cy1Var.f147959l);
                                    if (by1Var.f147398b) {
                                        iE = 0;
                                        i13 = iB;
                                        iE2 = 0;
                                    } else {
                                        iE = 0;
                                        i13 = iB;
                                        iE2 = 0;
                                    }
                                } else if (i12 == 1) {
                                    iE = 0;
                                    iE2 = 0;
                                    i13 = 0;
                                } else {
                                    iE = 0;
                                    iE2 = 0;
                                    i13 = 0;
                                }
                                j01 j01Var3 = this.f151347n;
                                j01Var3.f150882c = cy1Var;
                                j01Var3.f150883d = iB2;
                                j01Var3.f150884e = iD2;
                                j01Var3.f150885f = iB3;
                                j01Var3.f150886g = iD3;
                                j01Var3.f150887h = zC;
                                j01Var3.f150888i = z10;
                                j01Var3.f150889j = zC2;
                                j01Var3.f150890k = z11;
                                j01Var3.f150891l = iD;
                                j01Var3.f150892m = i13;
                                j01Var3.f150893n = iE;
                                j01Var3.f150894o = i17;
                                j01Var3.f150895p = iE2;
                                j01Var3.f150880a = true;
                                j01Var3.f150881b = true;
                                this.f151344k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a() {
        this.f151344k = false;
        this.f151348o = false;
        j01 j01Var = this.f151347n;
        j01Var.f150881b = false;
        j01Var.f150880a = false;
    }
}
