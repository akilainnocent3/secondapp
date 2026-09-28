package defpackage;

import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xk20 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nv60 b;

    public /* synthetic */ xk20(nv60 nv60Var, int i) {
        this.a = i;
        this.b = nv60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        nv60 nv60Var = this.b;
        switch (i) {
            case 0:
                LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                return Boolean.valueOf(((sn20) ((PreMatchSportActivity) nv60Var).y.getValue()).a.a("dc_one_up_switch_hint_displayed"));
            default:
                nv60Var.getLifecycle().a(new kk40(nv60Var));
                return Unit.a;
        }
    }
}
