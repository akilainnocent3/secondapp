package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rmf implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rmf(int i, d dVar, Function0 function0) {
        this.b = dVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj4;
                smf smfVar = (smf) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = aVar.A(smfVar);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new pmf(smfVar, 0);
                        aVar.r(objY);
                    }
                    anf.b(null, str, (Function0) objY, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                kxe0.a(qj40.a(7), (a) obj, (d) obj4, (Function0) obj3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rmf(String str, smf smfVar) {
        this.b = str;
        this.c = smfVar;
    }
}
