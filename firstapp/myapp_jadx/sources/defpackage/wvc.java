package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class wvc implements Function2<a, Integer, Unit> {
    public final /* synthetic */ fxc a;
    public final /* synthetic */ du5 b;
    public final /* synthetic */ guc c;
    public final /* synthetic */ gtc d;
    public final /* synthetic */ b5i e;

    public wvc(fxc fxcVar, du5 du5Var, guc gucVar, gtc gtcVar, b5i b5iVar) {
        this.a = fxcVar;
        this.b = du5Var;
        this.c = gucVar;
        this.d = gtcVar;
        this.e = b5iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        int i = 0;
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            fxc fxcVar = this.a;
            Long lE = fxcVar.e();
            long jA = fxcVar.a();
            int iD = fxcVar.d();
            boolean zM = aVar2.M(fxcVar);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new uvc(fxcVar, 0);
                aVar2.r(objY);
            }
            Function1 function1 = (Function1) objY;
            boolean zM2 = aVar2.M(fxcVar);
            Object objY2 = aVar2.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = new vvc(fxcVar, i);
                aVar2.r(objY2);
            }
            xvc.k(lE, jA, iD, function1, (Function1) objY2, this.b, fxcVar.a, this.c, fxcVar.b(), this.d, this.e, aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
