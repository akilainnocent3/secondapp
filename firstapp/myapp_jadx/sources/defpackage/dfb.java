package defpackage;

import androidx.compose.ui.layout.y;
import com.sportygames.crash.remote.models.PreviousMultiplierResponseSocket;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dfb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dfb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((fgb) obj2).D2(((PreviousMultiplierResponseSocket) q97.a(PreviousMultiplierResponseSocket.class, (String) obj)).getData());
                break;
            case 1:
                szr szrVar = (szr) obj;
                szrVar.getClass();
                qcn<le70> qcnVar = ((re70) obj2).a;
                szrVar.d(qcnVar.size(), null, new qe70.b(qcnVar), new op8(802480018, new qe70.c(qcnVar), true));
                szr.h(szrVar, null, jo9.a, 3);
                break;
            case 2:
                ylb0 ylb0Var = (ylb0) obj2;
                cgb.a(ylb0Var.e1(), (String) ((x5a0) ylb0Var.c1().v).getValue(), "cashout", (String) obj);
                break;
            default:
                ((y.a) obj).s((y) obj2, 0, 0, 0.0f);
                break;
        }
        return Unit.a;
    }
}
