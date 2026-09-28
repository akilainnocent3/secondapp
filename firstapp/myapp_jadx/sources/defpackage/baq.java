package defpackage;

import com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.WorldCupPassAnnouncementActivity;
import com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.a;
import com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class baq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ baq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(c9q.l.a);
                break;
            default:
                int i2 = WorldCupPassAnnouncementActivity.d;
                ((c) ((WorldCupPassAnnouncementActivity) obj).c.getValue()).z1(a.C0397a.a);
                break;
        }
        return Unit.a;
    }
}
