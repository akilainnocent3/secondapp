package defpackage;

import androidx.compose.runtime.a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class fpk implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function1 d;

    public fpk(ArrayList arrayList, Function1 function1, Function1 function2, Function1 function3) {
        this.a = arrayList;
        this.b = function1;
        this.c = function2;
        this.d = function3;
    }

    @Override // defpackage.iaj
    public final Unit d(gwr gwrVar, Integer num, a aVar, Integer num2) {
        int i;
        gwr gwrVar2 = gwrVar;
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= aVar2.d(iIntValue) ? 32 : 16;
        }
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            wok wokVar = (wok) this.a.get(iIntValue);
            aVar2.N(1253806145);
            if (wokVar instanceof wok.b) {
                aVar2.N(1253857356);
                bok.c(((wok.b) wokVar).b, this.b, null, aVar2, 0);
                aVar2.H();
            } else if (wokVar instanceof wok.c) {
                aVar2.N(1254126312);
                oqf0.c(((wok.c) wokVar).b, this.c, null, aVar2, 0);
                aVar2.H();
            } else {
                if (!(wokVar instanceof wok.a)) {
                    throw rg.a(-1483575294, aVar2);
                }
                aVar2.N(1254399360);
                i25.c(((wok.a) wokVar).b, this.d, null, aVar2, 0);
                aVar2.H();
            }
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
