package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vzr implements y4a0 {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ z4a0 b;

    public vzr(zzr zzrVar, z4a0 z4a0Var) {
        this.a = zzrVar;
        this.b = z4a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    @Override // defpackage.y4a0
    public final float a(float f) {
        zzr zzrVar = this.a;
        List<zyr> listK = zzrVar.j().k();
        int size = listK.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            zyr zyrVar = listK.get(i);
            pxr pxrVar = zyrVar instanceof pxr ? (pxr) zyrVar : null;
            if (pxrVar == null || !pxrVar.e()) {
                kzr kzrVarJ = zzrVar.j();
                int iD = (int) (kzrVarJ.a() == i3z.a ? kzrVarJ.d() & 4294967295L : kzrVarJ.d() >> 32);
                int iG = zzrVar.j().g();
                int iE = zzrVar.j().e();
                int iA = zyrVar.a();
                int offset = zyrVar.getOffset();
                zzrVar.j().i();
                float fD = offset - this.b.d(iD, iA, iG, iE);
                if (fD <= 0.0f && fD > f3) {
                    f3 = fD;
                }
                if (fD >= 0.0f && fD < f2) {
                    f2 = fD;
                }
            }
        }
        char c = Math.abs(f) >= ((nzr) ((x5a0) zzrVar.f).getValue()).i.C1(400.0f) ? f > 0.0f ? (char) 1 : (char) 2 : (char) 0;
        if (c == 0) {
            if (Math.abs(f2) <= Math.abs(f3)) {
                f3 = f2;
            }
        } else if (c == 1) {
            f3 = f2;
        } else if (c != 2) {
            f3 = 0.0f;
        }
        if (f3 == Float.POSITIVE_INFINITY || f3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f3;
    }

    @Override // defpackage.y4a0
    public final float b(float f, float f2) {
        float fAbs = Math.abs(f2);
        kzr kzrVarJ = this.a.j();
        int iA = 0;
        if (!kzrVarJ.k().isEmpty()) {
            int size = kzrVarJ.k().size();
            Iterator<T> it = kzrVarJ.k().iterator();
            while (it.hasNext()) {
                iA += ((zyr) it.next()).a();
            }
            iA /= size;
        }
        float f3 = fAbs - iA;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        return Math.signum(f2) * f3;
    }
}
