package defpackage;

import com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i72 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i72(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                k72 k72Var = (k72) obj;
                return k72Var.b.H(k72Var.getT0());
            case 1:
                ((Function1) obj).invoke(new nvp.f(3, (uf00) null));
                return Unit.a;
            default:
                int i2 = SportsMenuActivity.i;
                ((SportsMenuActivity) obj).B1().x1();
                return Unit.a;
        }
    }
}
