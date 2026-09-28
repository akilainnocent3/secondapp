package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.plugin.event.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z3f implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                i4f.d((d) obj3, (a) obj, qj40.a(7));
                break;
            default:
                i iVar = (i) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    szi0 szi0Var = (szi0) ((x5a0) iVar.a).getValue();
                    boolean zA = aVar.A(iVar);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        i.b bVar = new i.b(0, iVar, i.class, "dismiss", "dismiss()V", 0);
                        aVar.r(bVar);
                        objY = bVar;
                    }
                    rzi0.b(szi0Var, (Function0) ((chp) objY), aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }
}
