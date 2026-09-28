package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dzt implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dzt(int i, uyt uytVar) {
        this.b = i;
        this.c = uytVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                uyt uytVar = (uyt) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d dVarJ = h.j(h.h(d.a.b, 24.0f, 0.0f, 2), 0.0f, i2 == 0 ? 8.0f : 20.0f, 0.0f, 0.0f, 13);
                    aiv aivVarC = g75.c(ht.a.a, false);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarJ);
                    yka.k.getClass();
                    tsr.a aVar2 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar2);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, aivVarC, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    bs50.a(0, aVar, null, ((uyt.i) uytVar).a);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                bdj0.c((d) obj3, (a) obj, qj40.a(i2 | 1));
                return Unit.a;
        }
    }

    public /* synthetic */ dzt(d dVar, int i) {
        this.c = dVar;
        this.b = i;
    }
}
