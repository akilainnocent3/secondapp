package defpackage;

import com.sportybet.android.instantwin.presentation.bethistory2.a;
import com.sportybet.plugin.realsports.event.LiveTimerTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class eco implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eco(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(a.k.a);
                break;
            case 1:
                LiveTimerTextView liveTimerTextView = (LiveTimerTextView) obj;
                int i2 = liveTimerTextView.y + 1;
                liveTimerTextView.y = i2;
                liveTimerTextView.setText(liveTimerTextView.v.a(i2, liveTimerTextView.z));
                if (!liveTimerTextView.v.b(liveTimerTextView.w, liveTimerTextView.y, liveTimerTextView.z)) {
                    liveTimerTextView.h();
                }
                break;
            default:
                ((Function0) obj).invoke();
                break;
        }
        return Unit.a;
    }
}
