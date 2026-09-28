package defpackage;

import androidx.media3.common.a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class abm implements rs60 {
    public final int a;
    public final fbm b;
    public int c = -1;

    public abm(fbm fbmVar, int i) {
        this.b = fbmVar;
        this.a = i;
    }

    @Override // defpackage.rs60
    public final void a() throws qs60, lef.a {
        int i = this.c;
        fbm fbmVar = this.b;
        if (i == -2) {
            fbmVar.w();
            throw new qs60(tug.a("Unable to bind a sample queue to TrackGroup with MIME type ", fbmVar.X.a(this.a).d[0].n, "."));
        }
        if (i == -1) {
            fbmVar.G();
            return;
        }
        if (i != -3) {
            fbmVar.G();
            fbm.b bVar = fbmVar.K[i];
            lef lefVar = bVar.h;
            if (lefVar == null || lefVar.getState() != 1) {
                return;
            }
            lef.a aVarE = bVar.h.e();
            aVarE.getClass();
            throw aVarE;
        }
    }

    @Override // defpackage.rs60
    public final int b(yti ytiVar, g5d g5dVar, int i) {
        a aVar;
        if (this.c == -3) {
            g5dVar.e(4);
            return -4;
        }
        if (e()) {
            int i2 = this.c;
            fbm fbmVar = this.b;
            ArrayList<nam> arrayList = fbmVar.C;
            if (!fbmVar.E()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = arrayList.get(i4).k;
                        int length = fbmVar.K.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (fbmVar.c0[i6] && fbmVar.K[i6].u() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    String str = jrh0.a;
                    if (i4 > arrayList.size() || i4 < 0) {
                        d580.a();
                        return 0;
                    }
                    if (i4 != 0) {
                        arrayList.subList(0, i4).clear();
                    }
                    nam namVar = arrayList.get(0);
                    a aVar2 = namVar.d;
                    if (!aVar2.equals(fbmVar.V)) {
                        mkv.a aVar3 = fbmVar.z;
                        aVar3.a(new fkv(aVar3, new pjv(1, fbmVar.b, aVar2, namVar.e, namVar.f, jrh0.Z(namVar.g), -9223372036854775807L)));
                    }
                    fbmVar.V = aVar2;
                }
                if (arrayList.isEmpty() || arrayList.get(0).f()) {
                    int iV = fbmVar.K[i2].v(ytiVar, g5dVar, i, fbmVar.i0);
                    if (iV == -5) {
                        a aVarD = ytiVar.b;
                        aVarD.getClass();
                        if (i2 == fbmVar.Q) {
                            int iQ = c0p.q(fbmVar.K[i2].u());
                            while (i3 < arrayList.size() && arrayList.get(i3).k != iQ) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                aVar = arrayList.get(i3).d;
                            } else {
                                aVar = fbmVar.U;
                                aVar.getClass();
                            }
                            aVarD = aVarD.d(aVar);
                        }
                        ytiVar.b = aVarD;
                    }
                    return iV;
                }
            }
        }
        return -3;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    @Override // defpackage.rs60
    public final int c(long j) throws Throwable {
        nam next;
        Object objA;
        if (!e()) {
            return 0;
        }
        int i = this.c;
        fbm fbmVar = this.b;
        if (fbmVar.E()) {
            return 0;
        }
        fbm.b bVar = fbmVar.K[i];
        int iP = bVar.p(j, fbmVar.i0);
        ArrayList<nam> arrayList = fbmVar.C;
        if (arrayList == null) {
            Iterator<nam> it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                objA = next;
            } else {
                objA = null;
            }
        } else if (arrayList.isEmpty()) {
            objA = null;
        } else {
            objA = rh6.a(1, arrayList);
        }
        nam namVar = (nam) objA;
        if (namVar != null && !namVar.f()) {
            iP = Math.min(iP, namVar.e(i) - bVar.n());
        }
        bVar.z(iP);
        return iP;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final void d() {
        ly0.b(this.c == -1);
        fbm fbmVar = this.b;
        fbmVar.w();
        fbmVar.Z.getClass();
        int[] iArr = fbmVar.Z;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = fbmVar.c0;
            if (zArr[i2]) {
                i2 = -2;
            } else {
                zArr[i2] = true;
            }
        } else if (fbmVar.Y.contains(fbmVar.X.a(i))) {
            i2 = -3;
        } else {
            i2 = -2;
        }
        this.c = i2;
    }

    public final boolean e() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.rs60
    public final boolean isReady() {
        if (this.c == -3) {
            return true;
        }
        if (!e()) {
            return false;
        }
        int i = this.c;
        fbm fbmVar = this.b;
        return !fbmVar.E() && fbmVar.K[i].r(fbmVar.i0);
    }
}
