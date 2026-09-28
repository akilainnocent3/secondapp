package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.sporty.android.common_ui.widgets.CashOutLoadingButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wl6 implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Context baseContext = (Context) obj;
                int i2 = CashOutLoadingButton.R;
                do {
                    ibs ibsVar = baseContext instanceof ibs ? (ibs) baseContext : null;
                    if (ibsVar != null) {
                        return ibsVar;
                    }
                    ContextWrapper contextWrapper = baseContext instanceof ContextWrapper ? (ContextWrapper) baseContext : null;
                    if (contextWrapper == null) {
                        return null;
                    }
                    baseContext = contextWrapper.getBaseContext();
                } while (baseContext != null);
                return null;
            default:
                ((b5) obj).gotoSportyBet(xae.c, null);
                return Unit.a;
        }
    }
}
