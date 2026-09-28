package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f61 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f61(int i, Object obj, Function1 function1) {
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
                Boolean bool = (Boolean) ytwVar.getValue();
                bool.booleanValue();
                function1.invoke(bool);
                ytwVar.setValue(Boolean.FALSE);
                break;
            default:
                function1.invoke(((rc60.f) ((eg60) obj).b).c);
                break;
        }
        return Unit.a;
    }
}
