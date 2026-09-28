package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class orh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ orh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                str<irh> strVar = ((wrh) obj).a;
                irh irhVar = strVar.get();
                long jC = strVar.get().c("remote_config_fetch_interval_in_hour");
                Object objOnSuccessTask = irhVar.g.a(jC <= 0 ? 86400L : f.g(TimeUnit.HOURS.toSeconds(jC), 3600L, 172800L)).onSuccessTask(jph.a, new hrh());
                objOnSuccessTask.getClass();
                return objOnSuccessTask;
            case 1:
                ((nn40) obj).u0();
                return Unit.a;
            default:
                v390 v390Var = (v390) obj;
                String strB = v390Var.b();
                lv50 lv50Var = v390Var.a;
                lv50Var.getClass();
                lv50Var.a();
                lv50Var.b();
                return lv50Var.k().f1().J0(strB);
        }
    }
}
