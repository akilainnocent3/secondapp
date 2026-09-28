package defpackage;

import androidx.compose.runtime.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class x4n implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ f3n d;
    public final /* synthetic */ Function1 e;

    public x4n(List list, boolean z, Function1 function1, f3n f3nVar, Function1 function2) {
        this.a = list;
        this.b = z;
        this.c = function1;
        this.d = f3nVar;
        this.e = function2;
    }

    @Override // defpackage.iaj
    public final Unit d(gwr gwrVar, Integer num, a aVar, Integer num2) {
        int i;
        int i2;
        int i3;
        gwr gwrVar2 = gwrVar;
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        int iIntValue2 = num2.intValue();
        f3n f3nVar = this.d;
        f3n.g gVar = f3nVar.d;
        if ((iIntValue2 & 6) == 0) {
            i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= aVar2.d(iIntValue) ? 32 : 16;
        }
        boolean z = false;
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            a4n a4nVar = (a4n) this.a.get(iIntValue);
            aVar2.N(-760506977);
            if (a4nVar instanceof a4n.d) {
                aVar2.N(-760489091);
                q1n.a(this.b, false, null, this.c, aVar2, 0, 6);
                aVar2.H();
            } else if (a4nVar instanceof a4n.b) {
                aVar2.N(-760206464);
                a4n.b bVar = (a4n.b) a4nVar;
                int i4 = gVar.a;
                int i5 = i4 - 4;
                if (i4 > 4 && (i3 = bVar.i) > 0 && i5 <= i3) {
                    z = true;
                }
                boolean z2 = iIntValue == 1;
                boolean z3 = bVar.h;
                Function1 function1 = this.e;
                boolean zM = aVar2.M(function1);
                Object objY = aVar2.y();
                if (zM || objY == a.C0041a.a) {
                    objY = new v4n(function1);
                    aVar2.r(objY);
                }
                d1n.b(z2, z3, z, (Function1) objY, bVar, f3nVar, aVar2, 294912);
                aVar2 = aVar2;
                if (bVar.h) {
                    aVar2.N(-759625617);
                    Iterator<T> it = bVar.l.iterator();
                    while (it.hasNext()) {
                        p0n.a(f3nVar, (sw2) it.next(), z, aVar2, 8);
                    }
                    aVar2.H();
                } else {
                    aVar2.N(-759264281);
                    aVar2.H();
                }
                aVar2.H();
            } else if (a4nVar instanceof a4n.c) {
                aVar2.N(-759183154);
                q1n.a(false, false, ((a4n.c) a4nVar).a, null, aVar2, 48, 9);
                aVar2.H();
            } else {
                if (!(a4nVar instanceof a4n.a)) {
                    throw rg.a(-855816476, aVar2);
                }
                aVar2.N(-758940982);
                a4n.a aVar3 = (a4n.a) a4nVar;
                int i6 = gVar.a;
                j1n.b(aVar3, f3nVar, i6 > 4 && (i2 = aVar3.g) > 0 && i6 + (-4) <= i2, aVar2, 72);
                aVar2.H();
            }
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
