package defpackage;

import com.sportybet.android.instantwin.presentation.racingevent.c;
import com.sportybet.android.limits.success.LimitsSuccessActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xmi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xmi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((dni) obj).e.h("share-loyalty-reward");
            case 1:
                ((Function1) obj).invoke(c.j.d.a);
                return Unit.a;
            default:
                int i2 = LimitsSuccessActivity.a;
                ((LimitsSuccessActivity) obj).finish();
                return Unit.a;
        }
    }
}
