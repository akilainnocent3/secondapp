package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a;
import com.sportybet.feature.gift.giftreceived.presentation.giftreceived.GiftReceivedActivity;
import com.sportybet.feature.gift.giftreceived.presentation.giftreceived.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class feb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ feb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj;
                if (yju.a("br")) {
                    fgbVar.M1(false);
                }
                ((x5a0) fgbVar.e1).setValue(Boolean.FALSE);
                break;
            case 1:
                GiftReceivedActivity giftReceivedActivity = (GiftReceivedActivity) obj;
                int i2 = GiftReceivedActivity.e;
                giftReceivedActivity.A1().x1(d.b.a);
                giftReceivedActivity.finish();
                break;
            case 2:
                ((Function1) obj).invoke(a.d.C0341a.a);
                break;
            default:
                ((lsj0) obj).r1();
                break;
        }
        return Unit.a;
    }
}
