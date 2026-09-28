package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class mwz implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mwz(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj2;
                ytw ytwVar = (ytw) obj;
                if (function0 != null) {
                    function0.invoke();
                } else {
                    ytwVar.setValue(Boolean.valueOf(!((Boolean) ytwVar.getValue()).booleanValue()));
                }
                break;
            case 1:
                q1c0 q1c0Var = (q1c0) obj2;
                cgb.a(q1c0Var.m1(), q1c0Var.c1, "placeBet", (String) obj);
                break;
            default:
                ((Function1) obj2).invoke((Set) ((ytw) obj).getValue());
                break;
        }
        return Unit.a;
    }
}
