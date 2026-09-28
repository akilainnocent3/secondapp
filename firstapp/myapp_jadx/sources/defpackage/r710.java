package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.f;
import com.sportybet.android.globalpay.pixBtg.deposit.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r710 extends saj implements Function1<Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        final boolean zBooleanValue = bool2.booleanValue();
        g gVar = (g) this.receiver;
        gVar.G.a.e(bool2, "pix_btg_is_bank_linking_checked");
        gVar.I1(new Function1() { // from class: s810
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                f.c cVar = (f.c) obj;
                cVar.getClass();
                return f.c.a(cVar, null, 0.0d, null, null, null, null, qpi.a(cVar.g, null, zBooleanValue, false, 5), null, 191);
            }
        });
        gVar.I1(new sli(gVar, 1));
        return Unit.a;
    }
}
