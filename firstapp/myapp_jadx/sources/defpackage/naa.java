package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes5.dex */
public final class naa implements maa {
    public final /* synthetic */ ComposeView a;

    public naa(ComposeView composeView) {
        this.a = composeView;
    }

    @Override // defpackage.maa
    public final void dismiss() {
        ComposeView composeView = this.a;
        ViewParent parent = composeView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(composeView);
        }
    }
}
