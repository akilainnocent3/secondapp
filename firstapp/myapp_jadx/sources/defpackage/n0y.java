package defpackage;

import com.sportybet.feature.notificationcenter.NotificationCenterActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n0y implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n0y(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = NotificationCenterActivity.e;
                ((NotificationCenterActivity) obj).finish();
                break;
            default:
                ((Function1) obj).invoke(new bri0.i(false));
                break;
        }
        return Unit.a;
    }
}
