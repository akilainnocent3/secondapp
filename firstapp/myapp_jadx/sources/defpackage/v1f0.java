package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.layout.i;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v1f0 implements aiv {
    public final /* synthetic */ Function2<a, Integer, Unit> a;

    public v1f0(Function2 function2) {
        this.a = function2;
    }

    @Override // defpackage.aiv
    public final biv c(final t tVar, List<? extends vhv> list, long j) {
        final y yVarD0;
        final y yVar = null;
        if (this.a != null) {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    throw hu1.a("Collection contains no element matching the predicate.");
                }
                vhv vhvVar = list.get(i);
                if (Intrinsics.g(i.a(vhvVar), "text")) {
                    yVarD0 = vhvVar.d0(kxa.b(0, 0, 0, 0, 11, j));
                    break;
                }
                i++;
            }
        } else {
            yVarD0 = null;
        }
        final int iMax = Math.max(yVarD0 != null ? yVarD0.a : 0, 0);
        final int iMax2 = Math.max(tVar.y0(w1f0.a), tVar.I1(w1f0.e) + 0 + (yVarD0 != null ? yVarD0.b : 0));
        final Integer numValueOf = yVarD0 != null ? Integer.valueOf(yVarD0.f0(mt.a)) : null;
        final Integer numValueOf2 = yVarD0 != null ? Integer.valueOf(yVarD0.f0(mt.b)) : null;
        return t.z1(tVar, iMax, iMax2, new Function1() { // from class: u1f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                y yVar2 = yVarD0;
                y yVar3 = yVar;
                int i2 = iMax2;
                if (yVar2 != null && yVar3 != null) {
                    Integer num = numValueOf;
                    num.getClass();
                    int iIntValue = num.intValue();
                    Integer num2 = numValueOf2;
                    num2.getClass();
                    int iIntValue2 = num2.intValue();
                    float f = iIntValue == iIntValue2 ? w1f0.c : w1f0.d;
                    t tVar2 = tVar;
                    int iY0 = tVar2.y0(ir20.b) + tVar2.y0(f);
                    int iI1 = (tVar2.I1(w1f0.e) + yVar3.b) - iIntValue;
                    int i3 = yVar2.a;
                    int i4 = iMax;
                    int i5 = (i2 - iIntValue2) - iY0;
                    y.a.A(aVar, yVar2, (i4 - i3) / 2, i5);
                    y.a.A(aVar, yVar3, (i4 - yVar3.a) / 2, i5 - iI1);
                } else if (yVar2 != null) {
                    float f2 = w1f0.a;
                    y.a.A(aVar, yVar2, 0, (i2 - yVar2.b) / 2);
                } else if (yVar3 != null) {
                    float f3 = w1f0.a;
                    y.a.A(aVar, yVar3, 0, (i2 - yVar3.b) / 2);
                }
                return Unit.a;
            }
        });
    }
}
