package defpackage;

import com.sportybet.android.instantwin.presentation.racingevent.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mun implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ mun(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                zrd0 zrd0Var = (zrd0) obj;
                zrd0Var.getClass();
                function1.invoke(new c.q.b(zrd0Var));
                break;
            default:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                function1.invoke(new rb50.e(ijf0Var));
                break;
        }
        return Unit.a;
    }
}
