package defpackage;

import android.os.CountDownTimer;
import com.sportybet.plugin.sportydesk.widgets.SportyDeskButton;
import com.sportybet.plugin.sportydesk.widgets.SportyDeskWebView;

/* JADX INFO: loaded from: classes7.dex */
public final class tnb0 extends CountDownTimer {
    public final /* synthetic */ unb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tnb0(unb0 unb0Var, long j) {
        super(j, 1000L);
        this.a = unb0Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        unb0 unb0Var = this.a;
        SportyDeskButton sportyDeskButton = unb0Var.d;
        if (sportyDeskButton != null) {
            sportyDeskButton.setVisibility(8);
            unb0Var.d = null;
        }
        SportyDeskWebView sportyDeskWebView = unb0Var.f;
        if (sportyDeskWebView != null) {
            sportyDeskWebView.destroy();
            unb0Var.f = null;
        }
        unb0Var.a = false;
        unb0Var.b = false;
        unb0Var.c = true;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
