package defpackage;

import android.view.Window;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.autobet.widget.AutoBetActivity;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n51 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n51(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = AutoBetActivity.f;
                azm azmVar = ((AutoBetActivity) obj).c;
                if (azmVar != null) {
                    azmVar.d(wae.LIVE_HOST);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
            case 1:
                ggt ggtVar = (ggt) obj;
                return w5b.a(CoroutineContext.Element.a.d(lfe0.a(), ggtVar.e).plus(ggtVar.f));
            default:
                Window window = (Window) obj;
                if (window != null) {
                    window.setGravity(8388613);
                }
                if (window != null) {
                    window.setWindowAnimations(R.style.AnimRight);
                }
                return Unit.a;
        }
    }
}
