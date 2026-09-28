package defpackage;

import android.app.Dialog;
import com.sportybet.android.globalpay.pixBtg.depositQrCode.a;
import com.sportybet.android.instantwin.presentation.racingevent.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bvn implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bvn(Object obj, int i) {
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
                ((Function1) obj).invoke(a.C0236a.a);
                break;
            default:
                ((Dialog) obj).dismiss();
                break;
        }
        return Unit.a;
    }
}
