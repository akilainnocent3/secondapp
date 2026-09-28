package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jjr implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jjr(int i, d dVar, String str) {
        this.c = dVar;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zM = aVar.M(function1);
                    Object objY = aVar.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new pjr(function1, 0);
                        aVar.r(objY);
                    }
                    e5u.a(null, null, this.b, (Function0) objY, null, aVar, 0, 19);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ukc0.d(qj40.a(1), (a) obj, (d) obj3, this.b);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ jjr(String str, Function1 function1) {
        this.b = str;
        this.c = function1;
    }
}
