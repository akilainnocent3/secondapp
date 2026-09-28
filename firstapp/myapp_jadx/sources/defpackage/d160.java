package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d160 implements aiv, z060 {
    public final kw0.e a;
    public final ht.c b;

    public d160(kw0.e eVar, ht.c cVar) {
        this.a = eVar;
        this.b = cVar;
    }

    @Override // defpackage.aiv
    public final int a(nzo nzoVar, List<? extends mzo> list, int i) {
        int iY0 = nzoVar.y0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            mzo mzoVar = list.get(i3);
            float fC = nj0.c(nj0.b(mzoVar));
            int iB0 = mzoVar.b0(i);
            if (fC == 0.0f) {
                i2 += iB0;
            } else if (fC > 0.0f) {
                f += fC;
                iMax = Math.max(iMax, Math.round(iB0 / fC));
            }
        }
        return ((list.size() - 1) * iY0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.z060
    public final void b(int i, int[] iArr, int[] iArr2, t tVar) {
        this.a.b(tVar, i, iArr, tVar.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        return jee.a(this, kxa.k(j), kxa.j(j), kxa.i(j), kxa.h(j), tVar.y0(this.a.a()), tVar, list, new y[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.z060
    public final long d(int i, int i2, int i3, boolean z) {
        d160 d160Var = b160.a;
        return !z ? oxa.a(i, i2, 0, i3) : kxa.a.b(i, i2, 0, i3);
    }

    @Override // defpackage.aiv
    public final int e(nzo nzoVar, List<? extends mzo> list, int i) {
        int iY0 = nzoVar.y0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            mzo mzoVar = list.get(i3);
            float fC = nj0.c(nj0.b(mzoVar));
            int iA0 = mzoVar.a0(i);
            if (fC == 0.0f) {
                i2 += iA0;
            } else if (fC > 0.0f) {
                f += fC;
                iMax = Math.max(iMax, Math.round(iA0 / fC));
            }
        }
        return ((list.size() - 1) * iY0) + Math.round(iMax * f) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d160)) {
            return false;
        }
        d160 d160Var = (d160) obj;
        return Intrinsics.g(this.a, d160Var.a) && Intrinsics.g(this.b, d160Var.b);
    }

    @Override // defpackage.z060
    public final biv f(final y[] yVarArr, t tVar, final int i, final int[] iArr, int i2, final int i3, int[] iArr2, int i4, int i5, int i6) {
        return t.z1(tVar, i2, i3, new Function1() { // from class: c160
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                y[] yVarArr2 = yVarArr;
                int length = yVarArr2.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    y yVar = yVarArr2[i7];
                    int i9 = i8 + 1;
                    yVar.getClass();
                    Object objG = yVar.g();
                    a160 a160Var = objG instanceof a160 ? (a160) objG : null;
                    c3c c3cVar = a160Var != null ? a160Var.c : null;
                    int i10 = i3;
                    aVar.s(yVar, iArr[i8], c3cVar != null ? c3cVar.a(i10 - yVar.b, asr.a, yVar, i) : this.b.a(0, i10 - yVar.b), 0.0f);
                    i7++;
                    i8 = i9;
                }
                return Unit.a;
            }
        });
    }

    @Override // defpackage.aiv
    public final int g(nzo nzoVar, List<? extends mzo> list, int i) {
        int iY0 = nzoVar.y0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iY0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            mzo mzoVar = list.get(i2);
            float fC = nj0.c(nj0.b(mzoVar));
            if (fC == 0.0f) {
                int iMin2 = Math.min(mzoVar.b0(Reader.READ_DONE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, mzoVar.x(iMin2));
            } else if (fC > 0.0f) {
                f += fC;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            mzo mzoVar2 = list.get(i3);
            float fC2 = nj0.c(nj0.b(mzoVar2));
            if (fC2 > 0.0f) {
                iMax = Math.max(iMax, mzoVar2.x(iRound != Integer.MAX_VALUE ? Math.round(iRound * fC2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.z060
    public final int h(y yVar) {
        return yVar.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.aiv
    public final int i(nzo nzoVar, List<? extends mzo> list, int i) {
        int iY0 = nzoVar.y0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iY0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            mzo mzoVar = list.get(i2);
            float fC = nj0.c(nj0.b(mzoVar));
            if (fC == 0.0f) {
                int iMin2 = Math.min(mzoVar.b0(Reader.READ_DONE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, mzoVar.R(iMin2));
            } else if (fC > 0.0f) {
                f += fC;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            mzo mzoVar2 = list.get(i3);
            float fC2 = nj0.c(nj0.b(mzoVar2));
            if (fC2 > 0.0f) {
                iMax = Math.max(iMax, mzoVar2.R(iRound != Integer.MAX_VALUE ? Math.round(iRound * fC2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.z060
    public final int j(y yVar) {
        return yVar.b;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
