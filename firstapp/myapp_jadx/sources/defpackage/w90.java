package defpackage;

import androidx.compose.ui.window.PopupLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class w90 implements tse {
    public final /* synthetic */ PopupLayout a;

    public w90(PopupLayout popupLayout) {
        this.a = popupLayout;
    }

    @Override // defpackage.tse
    public final void dispose() {
        PopupLayout popupLayout = this.a;
        popupLayout.e();
        popupLayout.setTag(R.id.view_tree_lifecycle_owner, null);
        popupLayout.C.removeViewImmediate(popupLayout);
    }
}
