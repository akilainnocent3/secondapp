package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ml3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ml3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                kq3 kq3Var = ((gm3) obj).c;
                if (kq3Var != null) {
                    kq3Var.invoke();
                }
                break;
            default:
                ((Function1) obj).invoke(new zxq.v(false));
                break;
        }
        return Unit.a;
    }
}
