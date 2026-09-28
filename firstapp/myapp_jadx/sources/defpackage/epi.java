package defpackage;

import android.app.Dialog;
import com.sportybet.android.globalpay.pixBtg.withdraw.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class epi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ epi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(poi.CONTACT_US);
                break;
            case 1:
                ((Function1) obj).invoke(lnu.b);
                break;
            case 2:
                ((Function1) obj).invoke(b.e.a);
                break;
            default:
                ((Dialog) obj).dismiss();
                break;
        }
        return Unit.a;
    }
}
