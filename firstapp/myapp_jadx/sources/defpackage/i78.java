package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i78 implements aiv, z060 {
    public final kw0.l a;
    public final ht.b b;

    public i78(kw0.l lVar, ht.b bVar) {
        this.a = lVar;
        this.b = bVar;
    }

    @Override // defpackage.aiv
    public final int a(nzo nzoVar, List<? extends mzo> list, int i) {
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
                int iMin2 = Math.min(mzoVar.x(Reader.READ_DONE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, mzoVar.b0(iMin2));
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
                iMax = Math.max(iMax, mzoVar2.b0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fC2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.z060
    public final void b(int i, int[] iArr, int[] iArr2, t tVar) {
        this.a.c(tVar, i, iArr, iArr2);
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        return jee.a(this, kxa.j(j), kxa.k(j), kxa.h(j), kxa.i(j), tVar.y0(this.a.a()), tVar, list, new y[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.z060
    public final long d(int i, int i2, int i3, boolean z) {
        i78 i78Var = g78.a;
        return !z ? oxa.a(0, i3, i, i2) : kxa.a.a(0, i3, i, i2);
    }

    @Override // defpackage.aiv
    public final int e(nzo nzoVar, List<? extends mzo> list, int i) {
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
                int iMin2 = Math.min(mzoVar.x(Reader.READ_DONE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, mzoVar.a0(iMin2));
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
                iMax = Math.max(iMax, mzoVar2.a0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fC2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i78)) {
            return false;
        }
        i78 i78Var = (i78) obj;
        return Intrinsics.g(this.a, i78Var.a) && Intrinsics.g(this.b, i78Var.b);
    }

    @Override // defpackage.z060
    public final biv f(final y[] yVarArr, final t tVar, final int i, final int[] iArr, int i2, final int i3, int[] iArr2, int i4, int i5, int i6) {
        return t.z1(tVar, i3, i2, new Function1() { // from class: h78
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
                    asr layoutDirection = tVar.getLayoutDirection();
                    c3c c3cVar = a160Var != null ? a160Var.c : null;
                    int i10 = i3;
                    aVar.s(yVar, c3cVar != null ? c3cVar.a(i10 - yVar.a, layoutDirection, yVar, i) : this.b.a(0, i10 - yVar.a, layoutDirection), iArr[i8], 0.0f);
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
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            mzo mzoVar = list.get(i3);
            float fC = nj0.c(nj0.b(mzoVar));
            int iX = mzoVar.x(i);
            if (fC == 0.0f) {
                i2 += iX;
            } else if (fC > 0.0f) {
                f += fC;
                iMax = Math.max(iMax, Math.round(iX / fC));
            }
        }
        return ((list.size() - 1) * iY0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.z060
    public final int h(y yVar) {
        return yVar.b;
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
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            mzo mzoVar = list.get(i3);
            float fC = nj0.c(nj0.b(mzoVar));
            int iR = mzoVar.R(i);
            if (fC == 0.0f) {
                i2 += iR;
            } else if (fC > 0.0f) {
                f += fC;
                iMax = Math.max(iMax, Math.round(iR / fC));
            }
        }
        return ((list.size() - 1) * iY0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.z060
    public final int j(y yVar) {
        return yVar.a;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
