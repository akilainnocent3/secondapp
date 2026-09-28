package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a;
import com.sportybet.feature.gift.giftreceived.presentation.giftreceived.GiftReceivedActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class geb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ geb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((x5a0) ((fgb) obj).k1).setValue(Boolean.FALSE);
                break;
            case 1:
                int i2 = GiftReceivedActivity.e;
                ((GiftReceivedActivity) obj).finish();
                break;
            default:
                ((Function1) obj).invoke(a.b.C0340b.a);
                break;
        }
        return Unit.a;
    }
}
