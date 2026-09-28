package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class efg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ efg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                e activity = ((fgg) obj).getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return Unit.a;
            case 1:
                ViewParent parent = ((View) obj).getParent();
                eme emeVar = parent instanceof eme ? (eme) parent : null;
                Window window = emeVar != null ? emeVar.getWindow() : null;
                if (window != null) {
                    window.setWindowAnimations(R.style.AnimBottom);
                }
                return Unit.a;
            default:
                int i2 = ((j4k0) obj).j;
                if (i2 == 1) {
                    return Integer.valueOf(R.string.common_functions__cash_gift);
                }
                if (i2 == 2) {
                    return Integer.valueOf(R.string.common_functions__discount_gift);
                }
                if (i2 == 3) {
                    return Integer.valueOf(R.string.common_functions__free_bet_gift);
                }
                return null;
        }
    }
}
