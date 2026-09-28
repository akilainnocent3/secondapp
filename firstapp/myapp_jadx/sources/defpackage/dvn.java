package defpackage;

import com.sportybet.android.globalpay.pixBtg.depositQrCode.a;
import com.sportybet.android.instantwin.presentation.racingevent.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dvn implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dvn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(c.h.a.a);
                break;
            case 1:
                ((Function1) obj).invoke(a.d.a);
                break;
            default:
                ((vld) obj).dismissAllowingStateLoss();
                break;
        }
        return Unit.a;
    }
}
