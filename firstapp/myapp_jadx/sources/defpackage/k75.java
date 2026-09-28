package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k75 implements aiv {
    public final ht a;
    public final boolean b;

    public k75(ht htVar, boolean z) {
        this.a = htVar;
        this.b = z;
    }

    @Override // defpackage.aiv
    public final biv c(final t tVar, final List<? extends vhv> list, long j) {
        final y yVarD0;
        final int iMax;
        final int i;
        if (list.isEmpty()) {
            return t.z1(tVar, kxa.k(j), kxa.j(j), new h75(0));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final vhv vhvVar = list.get(0);
            rtw<ht, aiv> rtwVar = g75.a;
            Object objG = vhvVar.g();
            d75 d75Var = objG instanceof d75 ? (d75) objG : null;
            if (d75Var != null ? d75Var.E : false) {
                int iK = kxa.k(j);
                int iJ = kxa.j(j);
                int iK2 = kxa.k(j);
                int iJ2 = kxa.j(j);
                if (!((iJ2 >= 0) & (iK2 >= 0))) {
                    ykn.a("width and height must be >= 0");
                }
                yVarD0 = vhvVar.d0(oxa.h(iK2, iK2, iJ2, iJ2));
                iMax = iJ;
                i = iK;
            } else {
                y yVarD1 = vhvVar.d0(j2);
                int iMax2 = Math.max(kxa.k(j), yVarD1.a);
                iMax = Math.max(kxa.j(j), yVarD1.b);
                i = iMax2;
                yVarD0 = yVarD1;
            }
            return t.z1(tVar, i, iMax, new Function1() { // from class: i75
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    g75.d((y.a) obj, yVarD0, vhvVar, tVar.getLayoutDirection(), i, iMax, this.a);
                    return Unit.a;
                }
            });
        }
        final y[] yVarArr = new y[list.size()];
        final bq40 bq40Var = new bq40();
        bq40Var.a = kxa.k(j);
        final bq40 bq40Var2 = new bq40();
        bq40Var2.a = kxa.j(j);
        int size = list.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            vhv vhvVar2 = list.get(i2);
            rtw<ht, aiv> rtwVar2 = g75.a;
            Object objG2 = vhvVar2.g();
            d75 d75Var2 = objG2 instanceof d75 ? (d75) objG2 : null;
            if (d75Var2 != null ? d75Var2.E : false) {
                z = true;
            } else {
                y yVarD2 = vhvVar2.d0(j2);
                yVarArr[i2] = yVarD2;
                bq40Var.a = Math.max(bq40Var.a, yVarD2.a);
                bq40Var2.a = Math.max(bq40Var2.a, yVarD2.b);
            }
        }
        if (z) {
            int i3 = bq40Var.a;
            int i4 = i3 != Integer.MAX_VALUE ? i3 : 0;
            int i5 = bq40Var2.a;
            long jA = oxa.a(i4, i3, i5 != Integer.MAX_VALUE ? i5 : 0, i5);
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                vhv vhvVar3 = list.get(i6);
                rtw<ht, aiv> rtwVar3 = g75.a;
                Object objG3 = vhvVar3.g();
                d75 d75Var3 = objG3 instanceof d75 ? (d75) objG3 : null;
                if (d75Var3 != null ? d75Var3.E : false) {
                    yVarArr[i6] = vhvVar3.d0(jA);
                }
            }
        }
        return t.z1(tVar, bq40Var.a, bq40Var2.a, new Function1() { // from class: j75
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                y[] yVarArr2 = yVarArr;
                int length = yVarArr2.length;
                int i7 = 0;
                int i8 = 0;
                while (i8 < length) {
                    int i9 = i7;
                    y yVar = yVarArr2[i8];
                    yVar.getClass();
                    g75.d(aVar, yVar, (vhv) list.get(i9), tVar.getLayoutDirection(), bq40Var.a, bq40Var2.a, this.a);
                    i8++;
                    i7 = i9 + 1;
                }
                return Unit.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k75)) {
            return false;
        }
        k75 k75Var = (k75) obj;
        return Intrinsics.g(this.a, k75Var.a) && this.b == k75Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.a);
        sb.append(", propagateMinConstraints=");
        return ruw.a(sb, this.b, ')');
    }
}
