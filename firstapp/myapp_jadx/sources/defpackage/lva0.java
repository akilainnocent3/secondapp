package defpackage;

import com.sportybet.android.globalpay.stp.spei.a;
import com.sportybet.android.globalpay.stp.spei.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lva0 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object value;
        b bVar = (b) this.receiver;
        if (bVar.z1()) {
            bVar.x1(a.i.a);
        } else {
            wwd0 wwd0Var = bVar.E;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, new sb00(0)));
        }
        return Unit.a;
    }
}
