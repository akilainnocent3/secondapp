package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class eo implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f148785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f148786b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f148787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u30 f148788d;

    public eo(boolean z10) {
        this.f148785a = z10;
    }

    @Override // yads.p30
    public final void a(r83 r83Var) {
        r83Var.getClass();
        if (this.f148786b.contains(r83Var)) {
            return;
        }
        this.f148786b.add(r83Var);
        this.f148787c++;
    }

    public final void b(u30 u30Var) {
        this.f148788d = u30Var;
        for (int i10 = 0; i10 < this.f148787c; i10++) {
            r83 r83Var = (r83) this.f148786b.get(i10);
            boolean z10 = this.f148785a;
            dc0 dc0Var = (dc0) r83Var;
            synchronized (dc0Var) {
                try {
                    sm2 sm2Var = dc0.f148143n;
                    if (z10 && (u30Var.f156242i & 8) != 8) {
                        if (dc0Var.f148155f == 0) {
                            ((f53) dc0Var.f148153d).getClass();
                            dc0Var.f148156g = SystemClock.elapsedRealtime();
                        }
                        dc0Var.f148155f++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void c(int i10) {
        u30 u30Var = this.f148788d;
        int i11 = ib3.f150516a;
        for (int i12 = 0; i12 < this.f148787c; i12++) {
            r83 r83Var = (r83) this.f148786b.get(i12);
            boolean z10 = this.f148785a;
            dc0 dc0Var = (dc0) r83Var;
            synchronized (dc0Var) {
                sm2 sm2Var = dc0.f148143n;
                if (z10 && (u30Var.f156242i & 8) != 8) {
                    dc0Var.f148157h += (long) i10;
                }
            }
        }
    }

    public final void d() {
        int i10;
        a13 a13Var;
        float f10;
        u30 u30Var = this.f148788d;
        int i11 = ib3.f150516a;
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.f148787c) {
            r83 r83Var = (r83) this.f148786b.get(i13);
            boolean z10 = this.f148785a;
            dc0 dc0Var = (dc0) r83Var;
            synchronized (dc0Var) {
                try {
                    sm2 sm2Var = dc0.f148143n;
                    if (!z10 || (u30Var.f156242i & 8) == 8) {
                        i10 = i13;
                    } else {
                        if (dc0Var.f148155f <= 0) {
                            throw new IllegalStateException();
                        }
                        ((f53) dc0Var.f148153d).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i14 = (int) (jElapsedRealtime - dc0Var.f148156g);
                        dc0Var.f148159j += (long) i14;
                        long j10 = dc0Var.f148160k;
                        long j11 = dc0Var.f148157h;
                        dc0Var.f148160k = j10 + j11;
                        if (i14 > 0) {
                            float f11 = (j11 * 8000.0f) / i14;
                            b13 b13Var = dc0Var.f148152c;
                            int iSqrt = (int) Math.sqrt(j11);
                            if (b13Var.f147010d != 1) {
                                Collections.sort(b13Var.f147008b, b13.f147005h);
                                b13Var.f147010d = 1;
                            }
                            int i15 = b13Var.f147013g;
                            if (i15 > 0) {
                                a13[] a13VarArr = b13Var.f147009c;
                                int i16 = i15 - 1;
                                b13Var.f147013g = i16;
                                a13Var = a13VarArr[i16];
                            } else {
                                a13Var = new a13();
                            }
                            int i17 = b13Var.f147011e;
                            b13Var.f147011e = i17 + 1;
                            a13Var.f146616a = i17;
                            a13Var.f146617b = iSqrt;
                            a13Var.f146618c = f11;
                            b13Var.f147008b.add(a13Var);
                            b13Var.f147012f += iSqrt;
                            while (true) {
                                int i18 = b13Var.f147012f;
                                int i19 = b13Var.f147007a;
                                if (i18 <= i19) {
                                    break;
                                }
                                int i20 = i18 - i19;
                                a13 a13Var2 = (a13) b13Var.f147008b.get(i12);
                                int i21 = a13Var2.f146617b;
                                if (i21 <= i20) {
                                    b13Var.f147012f -= i21;
                                    b13Var.f147008b.remove(i12);
                                    int i22 = b13Var.f147013g;
                                    if (i22 < 5) {
                                        a13[] a13VarArr2 = b13Var.f147009c;
                                        b13Var.f147013g = i22 + 1;
                                        a13VarArr2[i22] = a13Var2;
                                    }
                                } else {
                                    a13Var2.f146617b = i21 - i20;
                                    b13Var.f147012f -= i20;
                                }
                            }
                            if (dc0Var.f148159j >= 2000 || dc0Var.f148160k >= 524288) {
                                b13 b13Var2 = dc0Var.f148152c;
                                if (b13Var2.f147010d != 0) {
                                    Collections.sort(b13Var2.f147008b, b13.f147006i);
                                    b13Var2.f147010d = i12;
                                }
                                float f12 = 0.5f * b13Var2.f147012f;
                                int i23 = i12;
                                int i24 = i23;
                                while (true) {
                                    if (i23 >= b13Var2.f147008b.size()) {
                                        if (!b13Var2.f147008b.isEmpty()) {
                                            ArrayList arrayList = b13Var2.f147008b;
                                            f10 = ((a13) arrayList.get(arrayList.size() - 1)).f146618c;
                                            break;
                                        } else {
                                            f10 = Float.NaN;
                                            break;
                                        }
                                    }
                                    a13 a13Var3 = (a13) b13Var2.f147008b.get(i23);
                                    i24 += a13Var3.f146617b;
                                    if (i24 >= f12) {
                                        f10 = a13Var3.f146618c;
                                        break;
                                    }
                                    i23++;
                                }
                                dc0Var.f148161l = (long) f10;
                            }
                            long j12 = dc0Var.f148157h;
                            long j13 = dc0Var.f148161l;
                            if (i14 == 0 && j12 == 0) {
                                i10 = i13;
                                if (j13 == dc0Var.f148162m) {
                                }
                                dc0Var.f148156g = jElapsedRealtime;
                                dc0Var.f148157h = 0;
                            } else {
                                i10 = i13;
                            }
                            dc0Var.f148162m = j13;
                            dc0Var.f148151b.a(i14, j12, j13);
                            dc0Var.f148156g = jElapsedRealtime;
                            dc0Var.f148157h = 0;
                        } else {
                            i10 = i13;
                        }
                        dc0Var.f148155f--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i13 = i10 + 1;
            i12 = 0;
        }
        this.f148788d = null;
    }

    public final void e() {
        for (int i10 = 0; i10 < this.f148787c; i10++) {
            ((r83) this.f148786b.get(i10)).getClass();
        }
    }

    @Override // yads.p30
    public /* synthetic */ Map getResponseHeaders() {
        return y74.a(this);
    }
}
