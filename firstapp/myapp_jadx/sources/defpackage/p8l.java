package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p8l implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p8l(int i, Object obj, Function1 function1) {
        this.a = i;
        this.b = function1;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ytw ytwVar = (ytw) obj;
                boolean z = !((Boolean) ytwVar.getValue()).booleanValue();
                ytwVar.setValue(Boolean.valueOf(z));
                function1.invoke(Boolean.valueOf(z));
                break;
            default:
                function1.invoke(new keq.d(((hfq) obj).a));
                break;
        }
        return Unit.a;
    }
}
