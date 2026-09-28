package defpackage;

import androidx.compose.ui.layout.i;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f0a0 implements aiv {
    public final /* synthetic */ j040 a;

    public f0a0(j040 j040Var) {
        this.a = j040Var;
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        j040 j040Var = this.a;
        int i = j040Var.a;
        osw oswVar = j040Var.k;
        float[] fArr = j040Var.f;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            vhv vhvVar = list.get(i3);
            if (i.a(vhvVar) == g040.b) {
                final y yVarD0 = vhvVar.d0(j);
                int size2 = list.size();
                int i4 = i2;
                while (i4 < size2) {
                    vhv vhvVar2 = list.get(i4);
                    if (i.a(vhvVar2) == g040.a) {
                        final y yVarD1 = vhvVar2.d0(j);
                        int size3 = list.size();
                        int i5 = i2;
                        while (i5 < size3) {
                            vhv vhvVar3 = list.get(i5);
                            if (i.a(vhvVar3) == g040.c) {
                                final y yVarD2 = vhvVar3.d0(kxa.b(0, 0, 0, 0, 11, oxa.j((-(yVarD0.a + yVarD1.a)) / 2, i2, 2, j)));
                                int i6 = ((yVarD0.a + yVarD1.a) / 2) + yVarD2.a;
                                int iMax = Math.max(yVarD2.b, Math.max(yVarD0.b, yVarD1.b));
                                ((u5a0) oswVar).k(i6);
                                isw iswVar = j040Var.d;
                                isw iswVar2 = j040Var.c;
                                isw iswVar3 = j040Var.q;
                                isw iswVar4 = j040Var.r;
                                float fMax = Math.max(((u5a0) oswVar).D() - (((t5a0) j040Var.i).j() / 2.0f), 0.0f);
                                float fMin = Math.min(((t5a0) j040Var.g).j() / 2.0f, fMax);
                                if (!((Boolean) ((x5a0) j040Var.n).getValue()).booleanValue()) {
                                    t5a0 t5a0Var = (t5a0) iswVar4;
                                    if (t5a0Var.j() != fMin || ((t5a0) iswVar3).j() != fMax || ((t5a0) iswVar2).j() != ((t5a0) iswVar).j()) {
                                        t5a0Var.A(fMin);
                                        t5a0 t5a0Var2 = (t5a0) iswVar3;
                                        t5a0Var2.A(fMax);
                                        ((t5a0) j040Var.l).A(j040Var.f(t5a0Var.j(), t5a0Var2.j(), ((t5a0) iswVar2).j()));
                                        ((t5a0) j040Var.m).A(j040Var.f(t5a0Var.j(), t5a0Var2.j(), ((t5a0) iswVar).j()));
                                    }
                                }
                                float fB = j040Var.b();
                                boolean z = true;
                                boolean z2 = Intrinsics.b(fB, ay0.x(fArr)) || Intrinsics.b(fB, ay0.J(fArr));
                                float fA = j040Var.a();
                                if (!Intrinsics.b(fA, ay0.x(fArr)) && !Intrinsics.b(fA, ay0.J(fArr))) {
                                    z = false;
                                }
                                final int i7 = yVarD0.a / 2;
                                int iF0 = yVarD2.f0(d0a0.f);
                                if (iF0 == Integer.MIN_VALUE) {
                                    iF0 = 0;
                                }
                                final int iB = (i <= 0 || z2) ? ycv.b(yVarD2.a * fB) : ycv.b((yVarD2.a - (iF0 * 2)) * fB) + iF0;
                                int i8 = (yVarD0.a - yVarD1.a) / 2;
                                final int iB2 = (i <= 0 || z) ? ycv.b((yVarD2.a * fA) + i8) : ycv.b(((yVarD2.a - (iF0 * 2)) * fA) + i8) + iF0;
                                final int i9 = (iMax - yVarD2.b) / 2;
                                final int i10 = (iMax - yVarD0.b) / 2;
                                final int i11 = (iMax - yVarD1.b) / 2;
                                return t.z1(tVar, i6, iMax, new Function1() { // from class: e0a0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        y.a aVar = (y.a) obj;
                                        y.a.A(aVar, yVarD2, i7, i9);
                                        y.a.A(aVar, yVarD0, iB, i10);
                                        y.a.A(aVar, yVarD1, iB2, i11);
                                        return Unit.a;
                                    }
                                });
                            }
                            i5++;
                            i2 = 0;
                        }
                        throw hu1.a("Collection contains no element matching the predicate.");
                    }
                    i4++;
                    i2 = 0;
                }
                throw hu1.a("Collection contains no element matching the predicate.");
            }
            i3++;
            i2 = 0;
        }
        throw hu1.a("Collection contains no element matching the predicate.");
    }
}
