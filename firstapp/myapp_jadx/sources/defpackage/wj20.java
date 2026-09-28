package defpackage;

import com.sportybet.plugin.realsports.data.TimeFilterEventCountData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wj20 implements Function1 {
    public final /* synthetic */ jk20 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ wj20(jk20 jk20Var, boolean z) {
        this.a = jk20Var;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        final boolean z;
        lk50 lk50Var = (lk50) obj;
        lk50Var.getClass();
        wwd0 wwd0Var = this.a.L;
        do {
            value = wwd0Var.getValue();
            z = this.b;
        } while (!wwd0Var.g(value, bm50.l(lk50Var, new Function1() { // from class: xj20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                TimeFilterEventCountData timeFilterEventCountData = (TimeFilterEventCountData) obj2;
                timeFilterEventCountData.getClass();
                return TimeFilterEventCountData.copy$default(timeFilterEventCountData, null, null, z, 3, null);
            }
        })));
        return Unit.a;
    }
}
