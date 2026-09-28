package defpackage;

import androidx.compose.ui.layout.i;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final class o03 implements aiv {
    @Override // defpackage.aiv
    public final biv c(final t tVar, List<? extends vhv> list, long j) {
        list.getClass();
        for (vhv vhvVar : list) {
            if (Intrinsics.g(i.a(vhvVar), "anchor")) {
                for (vhv vhvVar2 : list) {
                    if (Intrinsics.g(i.a(vhvVar2), "overlay")) {
                        final y yVarD0 = vhvVar.d0(j);
                        final int iE = f.e(yVarD0.a, kxa.k(j), kxa.i(j));
                        final int iE2 = f.e(yVarD0.b, kxa.j(j), kxa.h(j));
                        final y yVarD1 = vhvVar2.d0(kxa.b(0, 0, 0, 0, 10, j));
                        return t.z1(tVar, iE, iE2, new Function1() { // from class: n03
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                y.a aVar = (y.a) obj;
                                aVar.getClass();
                                aVar.s(yVarD0, 0, 0, 0.0f);
                                y yVar = yVarD1;
                                long j2 = (((long) yVar.a) << 32) | (((long) yVar.b) & 4294967295L);
                                long j3 = (((long) iE) << 32) | (((long) iE2) & 4294967295L);
                                long jRound = (((long) Math.round(((tVar.getLayoutDirection() == asr.a ? 0.0f : (-1.0f) * 0.0f) + 1.0f) * ((((int) (j3 >> 32)) - ((int) (j2 >> 32))) / 2.0f))) << 32) | (((long) Math.round((1.0f + 0.0f) * ((((int) (j3 & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f))) & 4294967295L);
                                y.a.A(aVar, yVar, (int) (jRound >> 32), (int) (jRound & 4294967295L));
                                return Unit.a;
                            }
                        });
                    }
                }
                ibh0.a("Collection contains no element matching the predicate.");
                return null;
            }
        }
        ibh0.a("Collection contains no element matching the predicate.");
        return null;
    }
}
