package defpackage;

import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pl3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pl3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                sq3 sq3Var = ((gm3) obj).a;
                if (sq3Var != null) {
                    sq3Var.invoke();
                }
                break;
            case 1:
                ((Function1) obj).invoke(ac00.c.a);
                break;
            default:
                ohp<Object>[] ohpVarArr = hl80.N;
                yfx.i(kjx.a((ComposeView) obj), "time_alert_route", bjx.a(new r8a(1, new kkx())), 4);
                break;
        }
        return Unit.a;
    }
}
