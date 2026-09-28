package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q96 implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q96(b5 b5Var, Function0 function0) {
        this.c = b5Var;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function0 function0 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.TRUE);
                function0.invoke();
                break;
            default:
                ((b5) obj).gotoSportyBet(xae.c, null);
                function0.invoke();
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ q96(ytw ytwVar, Function0 function0) {
        this.b = function0;
        this.c = ytwVar;
    }
}
