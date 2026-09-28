package defpackage;

import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.event.e;
import com.sportygames.commons.components.SGHamburgerMenu;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class v920 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v920(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                if (((e) ((x920) obj2).D.getValue()).G0.d() == x920.a.a) {
                    f00 f00Var = vgb0.a;
                    vgb0.c(AnalyticsEvent.QUICK_PICKS_LIST_SCROLL, jpu.b(new Pair(AnalyticsParam.CONTENT_TYPE, str)), false);
                }
                return Unit.a;
            case 1:
                int i2 = SGHamburgerMenu.M;
                ((View) obj).getClass();
                Function0<Unit> function0 = ((SGHamburgerMenu.b) obj2).i;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
            default:
                int iIntValue = ((Integer) obj).intValue();
                mke mkeVar = ((a1b0) obj2).d0;
                if (mkeVar == null) {
                    return null;
                }
                mkeVar.S0(iIntValue);
                return Unit.a;
        }
    }
}
