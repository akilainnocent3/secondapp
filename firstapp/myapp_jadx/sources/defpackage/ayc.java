package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ayc implements Function2<a, Integer, Unit> {
    public final /* synthetic */ oyc a;
    public final /* synthetic */ du5 b;
    public final /* synthetic */ guc c;
    public final /* synthetic */ gtc d;
    public final /* synthetic */ b5i e;

    public ayc(oyc oycVar, du5 du5Var, guc gucVar, gtc gtcVar, b5i b5iVar) {
        this.a = oycVar;
        this.b = du5Var;
        this.c = gucVar;
        this.d = gtcVar;
        this.e = b5iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            final oyc oycVar = this.a;
            Long lF = oycVar.f();
            Long lE = oycVar.e();
            long jA = oycVar.a();
            int iD = oycVar.d();
            boolean zM = aVar2.M(oycVar);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new Function2() { // from class: yxc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        try {
                            oycVar.g((Long) obj, (Long) obj2);
                        } catch (IllegalArgumentException unused) {
                        }
                        return Unit.a;
                    }
                };
                aVar2.r(objY);
            }
            Function2 function2 = (Function2) objY;
            boolean zM2 = aVar2.M(oycVar);
            Object objY2 = aVar2.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = new zxc(oycVar, 0);
                aVar2.r(objY2);
            }
            byc.c(lF, lE, jA, iD, function2, (Function1) objY2, this.b, oycVar.a, this.c, oycVar.b(), this.d, this.e, aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
