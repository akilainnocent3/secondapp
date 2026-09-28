package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a;
import com.sportybet.feature.gift.giftreceived.presentation.giftreceived.GiftReceivedActivity;
import com.sportybet.feature.gift.giftreceived.presentation.giftreceived.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class heb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ heb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((x5a0) ((fgb) obj).Z0).setValue(Boolean.FALSE);
                break;
            case 1:
                GiftReceivedActivity giftReceivedActivity = (GiftReceivedActivity) obj;
                int i2 = GiftReceivedActivity.e;
                giftReceivedActivity.A1().x1(new d.c(wqk.d.a));
                giftReceivedActivity.z1().d(wae.ME_GIFTS);
                giftReceivedActivity.finish();
                break;
            default:
                Function1 function1 = (Function1) obj;
                function1.invoke(a.b.C0339a.a);
                function1.invoke(a.InterfaceC0337a.C0338a.a);
                break;
        }
        return Unit.a;
    }
}
