package defpackage;

import androidx.compose.ui.layout.i;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j0a0 implements aiv {
    public final /* synthetic */ w0a0 a;

    public j0a0(w0a0 w0a0Var) {
        this.a = w0a0Var;
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        int iMax;
        int iMax2;
        int i;
        int i2;
        int iB;
        w0a0 w0a0Var = this.a;
        int i3 = w0a0Var.a;
        float[] fArr = w0a0Var.g;
        i3z i3zVar = w0a0Var.m;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            vhv vhvVar = list.get(i4);
            if (i.a(vhvVar) == fz90.a) {
                final y yVarD0 = vhvVar.d0(j);
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    vhv vhvVar2 = list.get(i5);
                    if (i.a(vhvVar2) == fz90.b) {
                        i3z i3zVar2 = i3z.a;
                        boolean z = true;
                        final y yVarD1 = i3zVar == i3zVar2 ? vhvVar2.d0(kxa.b(0, 0, 0, 0, 14, oxa.j(0, -yVarD0.b, 1, j))) : vhvVar2.d0(kxa.b(0, 0, 0, 0, 11, oxa.j(-yVarD0.a, 0, 2, j)));
                        final bq40 bq40Var = new bq40();
                        float fC = w0a0Var.c();
                        if (!Intrinsics.b(fC, ay0.x(fArr)) && !Intrinsics.b(fC, ay0.J(fArr))) {
                            z = false;
                        }
                        int iF0 = yVarD1.f0(d0a0.f);
                        int i6 = iF0 != Integer.MIN_VALUE ? iF0 : 0;
                        if (i3zVar == i3zVar2) {
                            iMax = Math.max(yVarD1.a, yVarD0.a);
                            int i7 = yVarD0.b;
                            int i8 = yVarD1.b;
                            iMax2 = i7 + i8;
                            i = (iMax - yVarD1.a) / 2;
                            i2 = i7 / 2;
                            iB = (iMax - yVarD0.a) / 2;
                            bq40Var.a = (i3 <= 0 || z) ? ycv.b(i8 * fC) : ycv.b((i8 - (i6 * 2)) * fC) + i6;
                        } else {
                            iMax = yVarD0.a + yVarD1.a;
                            iMax2 = Math.max(yVarD1.b, yVarD0.b);
                            i = yVarD0.a / 2;
                            i2 = (iMax2 - yVarD1.b) / 2;
                            iB = (i3 <= 0 || z) ? ycv.b(yVarD1.a * fC) : ycv.b((yVarD1.a - (i6 * 2)) * fC) + i6;
                            bq40Var.a = (iMax2 - yVarD0.b) / 2;
                        }
                        final int i9 = i2;
                        final int i10 = i;
                        final int i11 = iB;
                        ((u5a0) w0a0Var.h).k(iMax);
                        ((u5a0) w0a0Var.i).k(iMax2);
                        return t.z1(tVar, iMax, iMax2, new Function1() { // from class: i0a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                y.a aVar = (y.a) obj;
                                y.a.A(aVar, yVarD1, i10, i9);
                                y.a.A(aVar, yVarD0, i11, bq40Var.a);
                                return Unit.a;
                            }
                        });
                    }
                }
                throw hu1.a("Collection contains no element matching the predicate.");
            }
        }
        throw hu1.a("Collection contains no element matching the predicate.");
    }
}
