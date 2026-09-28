package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.f;
import com.sportybet.android.globalpay.pixBtg.deposit.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sli implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sli(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                wf00 wf00Var = (wf00) obj;
                wf00Var.getClass();
                ((ytw) obj2).setValue(wf00Var);
                return Unit.a;
            case 1:
                f.c cVar = (f.c) obj;
                cVar.getClass();
                qpi qpiVar = cVar.g;
                return f.c.a(cVar, null, 0.0d, null, null, null, null, qpi.a(qpiVar, ((g) obj2).Q && qpiVar.b && !cVar.c.e ? uxs.ENABLE : uxs.DISABLE, false, false, 6), null, 191);
            default:
                vad0 vad0Var = (vad0) obj2;
                cgb.a(vad0Var.e1(), (String) ((x5a0) vad0Var.c1().v).getValue(), "placeBet", (String) obj);
                return Unit.a;
        }
    }
}
