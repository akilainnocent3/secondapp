package defpackage;

import android.graphics.RectF;
import java.security.SecureRandom;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class wrc extends q12<trc> {
    public final float b;
    public boolean c;
    public final pqc d;
    public oqc e;
    public int f = 0;
    public ArrayList g;
    public fw h;
    public zy60 i;
    public tu50 j;
    public float k;
    public final SecureRandom l;

    public wrc(bwf bwfVar, RectF rectF) {
        this.b = bwfVar.i();
        float fI = bwfVar.i() * 0.5f;
        RectF rectF2 = new RectF(rectF);
        rectF2.left += fI;
        rectF2.right -= fI;
        rectF2.top += fI;
        rectF2.bottom -= fI;
        float f = wij.a().a;
        this.e = new oqc(System.currentTimeMillis(), bwfVar.a(), bwfVar.b(), 0, 0);
        this.l = n380.a();
        this.d = new pqc(new rqc(this.e.b, 0L, 0, f, new qqc() { // from class: urc
            @Override // defpackage.qqc
            public final int a(int i, boolean z, boolean z2) {
                if (z2 || z) {
                    if (i == -1) {
                        return 1;
                    }
                    if (i == 1) {
                        return -1;
                    }
                }
                return new int[]{-1, 1}[this.a.l.nextInt(2)];
            }
        }), new rqc(this.e.c, 500L, 1, f, new qqc() { // from class: vrc
            @Override // defpackage.qqc
            public final int a(int i, boolean z, boolean z2) {
                SecureRandom secureRandom = this.a.l;
                if (z2 || z) {
                    if (i == -1) {
                        return secureRandom.nextBoolean() ? 1 : 0;
                    }
                    if (i != 0) {
                        if (i == 1) {
                            if (!secureRandom.nextBoolean()) {
                                return 0;
                            }
                        }
                    } else if (z2) {
                        return 1;
                    }
                    return -1;
                }
                return new int[]{-1, 1, 0}[n380.a().nextInt(3)];
            }
        }), rectF2);
    }

    @Override // defpackage.q12
    public final trc b(long j, long j2) {
        oqc oqcVarB = this.e;
        if (!this.c) {
            synchronized (this) {
                try {
                    if (this.g == null) {
                        oqcVarB = null;
                        break;
                    }
                    do {
                        if (this.f >= this.g.size()) {
                            oqcVarB = null;
                            break;
                        }
                        oqcVarB = (oqc) this.g.get(this.f);
                        this.f++;
                    } while (j > oqcVarB.a);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (oqcVarB == null) {
                oqcVarB = this.d.b(j, j2);
            }
            this.e = oqcVarB;
        }
        float f = oqcVarB.b;
        float f2 = oqcVarB.c;
        float f3 = this.b;
        fw fwVar = this.h;
        float fFloatValue = fwVar != null ? fwVar.a(j).floatValue() : 1.0f;
        tu50 tu50Var = this.j;
        float fFloatValue2 = tu50Var != null ? tu50Var.a(j).floatValue() : 0.0f;
        float f4 = this.k;
        zy60 zy60Var = this.i;
        return new trc(f, f2, f3, fFloatValue, fFloatValue2, f4, zy60Var != null ? zy60Var.a(j).floatValue() : 1.0f);
    }
}
