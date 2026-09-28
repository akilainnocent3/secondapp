package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b2u implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b2u(f2u f2uVar, Function0 function0, int i) {
        this.b = f2uVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c2u.d((f2u) obj4, (Function0) obj3, (a) obj, qj40.a(1));
                break;
            default:
                ijj0 ijj0Var = (ijj0) obj4;
                phx phxVar = (phx) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 2;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hna.b(new j730[]{bij0.a.a(new yhj0((sr0) aVar.O(aqe.a))), bij0.b.a(ijj0Var.P0().d.f())}, pp8.b(1709409230, new e9b(i2, ijj0Var, phxVar), aVar), aVar, 48);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ b2u(ijj0 ijj0Var, phx phxVar) {
        this.b = ijj0Var;
        this.c = phxVar;
    }
}
