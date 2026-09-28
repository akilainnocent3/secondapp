package defpackage;

import androidx.compose.ui.layout.i;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class iu1 implements aiv {
    public static final iu1 a = new iu1();

    @Override // defpackage.aiv
    public final biv c(final t tVar, List<? extends vhv> list, long j) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vhv vhvVar = list.get(i);
            if (Intrinsics.g(i.a(vhvVar), "badge")) {
                final y yVarD0 = vhvVar.d0(kxa.b(0, 0, 0, 0, 11, j));
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    vhv vhvVar2 = list.get(i2);
                    if (Intrinsics.g(i.a(vhvVar2), "anchor")) {
                        final y yVarD1 = vhvVar2.d0(j);
                        mjm mjmVar = mt.a;
                        int iF0 = yVarD1.f0(mjmVar);
                        mjm mjmVar2 = mt.b;
                        return tVar.e1(yVarD1.a, yVarD1.b, kpu.f(new Pair(mjmVar, Integer.valueOf(iF0)), new Pair(mjmVar2, Integer.valueOf(yVarD1.f0(mjmVar2)))), new Function1() { // from class: gu1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                y.a aVar = (y.a) obj;
                                y yVar = yVarD0;
                                int i3 = yVar.a;
                                float f = lu1.b;
                                t tVar2 = tVar;
                                boolean z = i3 > tVar2.y0(f);
                                float f2 = z ? 12.0f : 6.0f;
                                float f3 = z ? 14.0f : 6.0f;
                                y yVar2 = yVarD1;
                                y.a.A(aVar, yVar2, 0, 0);
                                y.a.A(aVar, yVar, Math.min(yVar2.a - tVar2.y0(f2), ((int) aVar.e(ju1.b, Float.POSITIVE_INFINITY)) - yVar.a), Math.max(tVar2.y0(f3) + (-yVar.b), (int) aVar.e(ju1.a, Float.NEGATIVE_INFINITY)));
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
