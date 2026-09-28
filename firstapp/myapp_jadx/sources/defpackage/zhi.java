package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zhi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zhi(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                wmi wmiVar = (wmi) obj2;
                Function1 function1 = (Function1) obj;
                if (wmiVar.a || (wmiVar.d instanceof smi.c)) {
                    function1.invoke(ebi.a.a);
                }
                break;
            default:
                m410 m410Var = (m410) obj2;
                cgb.a(m410Var.P0(), m410Var.F0, "cashout", (String) obj);
                break;
        }
        return Unit.a;
    }
}
