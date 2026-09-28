package defpackage;

import com.sportybet.feature.debugscreen.impl.popupqueue.PopupQueueDebugActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pja implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pja(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                break;
            case 1:
                int i2 = PopupQueueDebugActivity.b;
                ((PopupQueueDebugActivity) obj).finish();
                break;
            default:
                ((Function1) obj).invoke(vc60.f.a);
                break;
        }
        return Unit.a;
    }
}
