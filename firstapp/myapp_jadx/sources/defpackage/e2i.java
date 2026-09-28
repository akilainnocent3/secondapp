package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface e2i extends z060 {
    @Override // defpackage.z060
    default void b(int i, int[] iArr, int[] iArr2, t tVar) {
        if (l()) {
            m().b(tVar, i, iArr, tVar.getLayoutDirection(), iArr2);
        } else {
            n().c(tVar, i, iArr, iArr2);
        }
    }

    @Override // defpackage.z060
    default long d(int i, int i2, int i3, boolean z) {
        if (l()) {
            d160 d160Var = b160.a;
            return !z ? oxa.a(i, i2, 0, i3) : kxa.a.b(i, i2, 0, i3);
        }
        i78 i78Var = g78.a;
        return !z ? oxa.a(0, i3, i, i2) : kxa.a.a(0, i3, i, i2);
    }

    @Override // defpackage.z060
    default biv f(final y[] yVarArr, t tVar, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        if (l()) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
        }
        final asr layoutDirection = l() ? asr.a : tVar.getLayoutDirection();
        return t.z1(tVar, i8, i7, new Function1() { // from class: d2i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                c3c c3cVarK;
                y.a aVar = (y.a) obj;
                int[] iArr3 = iArr2;
                int i9 = iArr3 != null ? iArr3[i4] : 0;
                int i10 = i5;
                for (int i11 = i10; i11 < i6; i11++) {
                    y yVar = yVarArr[i11];
                    yVar.getClass();
                    Object objG = yVar.g();
                    a160 a160Var = objG instanceof a160 ? (a160) objG : null;
                    e2i e2iVar = this;
                    if (a160Var == null || (c3cVarK = a160Var.c) == null) {
                        c3cVarK = e2iVar.k();
                    }
                    int iA = c3cVarK.a(i3 - e2iVar.j(yVar), layoutDirection, yVar, i) + i9;
                    boolean zL = e2iVar.l();
                    int[] iArr4 = iArr;
                    if (zL) {
                        aVar.s(yVar, iArr4[i11 - i10], iA, 0.0f);
                    } else {
                        aVar.s(yVar, iA, iArr4[i11 - i10], 0.0f);
                    }
                }
                return Unit.a;
            }
        });
    }

    @Override // defpackage.z060
    default int h(y yVar) {
        return l() ? yVar.o0() : yVar.l0();
    }

    @Override // defpackage.z060
    default int j(y yVar) {
        return l() ? yVar.l0() : yVar.o0();
    }

    c3c k();

    boolean l();

    kw0.e m();

    kw0.l n();
}
