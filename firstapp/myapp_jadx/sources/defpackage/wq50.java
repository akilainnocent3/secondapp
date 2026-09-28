package defpackage;

import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.compose.ui.component.RevivableComposeView;

/* JADX INFO: loaded from: classes4.dex */
public final class wq50 implements tse {
    public final /* synthetic */ RevivableComposeView a;
    public final /* synthetic */ ComposeView b;

    public wq50(RevivableComposeView revivableComposeView, ComposeView composeView) {
        this.a = revivableComposeView;
        this.b = composeView;
    }

    @Override // defpackage.tse
    public final void dispose() {
        ComposeView composeView = this.b;
        RevivableComposeView revivableComposeView = this.a;
        revivableComposeView.removeView(composeView);
        revivableComposeView.a = null;
    }
}
