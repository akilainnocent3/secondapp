package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sh10 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sh10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                wwd0 wwd0Var = ((nq50) obj).f;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, sq50.a((sq50) value, null, null, null, null, new wo50.c(cp50.i.a), null, 95)));
                break;
        }
        return Unit.a;
    }
}
