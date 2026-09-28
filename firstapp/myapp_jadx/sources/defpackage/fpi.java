package defpackage;

import com.sportybet.android.globalpay.pixBtg.withdraw.b;
import com.sportybet.android.instantwin.presentation.racingevent.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fpi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;

    public /* synthetic */ fpi(haj hajVar, int i) {
        this.a = i;
        this.b = hajVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((Function1) hajVar).invoke(poi.MONEY_POLICY);
                break;
            case 1:
                ((Function1) hajVar).invoke(c.InterfaceC0309c.b.a);
                break;
            case 2:
                ((Function1) hajVar).invoke(b.g.a);
                break;
            default:
                ((Function0) hajVar).invoke();
                break;
        }
        return Unit.a;
    }
}
