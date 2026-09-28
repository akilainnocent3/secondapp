package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tmk implements Function2 {
    public final /* synthetic */ uwd0 a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ tmk(uwd0 uwd0Var, Function0 function0) {
        this.a = uwd0Var;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            final uwd0 uwd0Var = this.a;
            final Function0 function0 = this.b;
            o0z.a(null, null, null, null, null, pp8.b(-1452777749, new Function2() { // from class: umk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    a aVar2 = (a) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        s9s.b bVar = s9s.b.a;
                        ink inkVar = (ink) wyh.c(uwd0Var, aVar2, 384, 5).getValue();
                        ink.a aVar3 = inkVar instanceof ink.a ? (ink.a) inkVar : null;
                        if (aVar3 == null) {
                            aVar2.N(683743511);
                            aVar2.H();
                        } else {
                            aVar2.N(683743512);
                            ank.a(0, 1, aVar2, null, aVar3.a, aVar3.b, function0);
                            aVar2.H();
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, aVar), aVar, 196608);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
