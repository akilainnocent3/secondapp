package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gg5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gg5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ytw ytwVar = (ytw) obj;
                if (!((Boolean) ytwVar.getValue()).booleanValue()) {
                    ytwVar.setValue(Boolean.TRUE);
                }
                break;
            default:
                ((Function1) obj).invoke(xia0.a);
                break;
        }
        return Unit.a;
    }
}
