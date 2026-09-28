package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hei implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hei(qei qeiVar, Function0 function0) {
        this.a = 0;
        this.b = qeiVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                qei qeiVar = (qei) obj4;
                Function0 function0 = (Function0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    crz crzVarA = erz.a(qeiVar.b(), 0, aVar);
                    d dVarA = ls7.a(h.j(d.a.b, 12.0f, 0.0f, 4.0f, 0.0f, 10), j060.a);
                    boolean zM = aVar.M(function0);
                    Object objY = aVar.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new to4(function0, i2);
                        aVar.r(objY);
                    }
                    h9n.a(crzVarA, null, j.r(h.f(androidx.compose.foundation.d.d(dVarA, false, null, null, (Function0) objY, 15), 4.0f), 24.0f), null, null, 0.0f, null, aVar, 48, 120);
                } else {
                    aVar.G();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                aqw.j((ytw) obj4, (goj) obj3, (a) obj, qj40.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ml90.a((hl90) obj4, (pf3) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hei(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
