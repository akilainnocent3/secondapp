package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.sportybet.plugin.realsports.widget.FlashBoostBadgeView;

/* JADX INFO: loaded from: classes7.dex */
public final class q5n {
    public ViewGroup a;
    public FlashBoostBadgeView b;
    public View c;
    public s5n d;

    public final void a() {
        ViewGroupOverlay overlay;
        ViewGroup viewGroup = this.a;
        FlashBoostBadgeView flashBoostBadgeView = this.b;
        View view = this.c;
        s5n s5nVar = this.d;
        if (view != null && s5nVar != null) {
            view.removeOnAttachStateChangeListener(s5nVar);
        }
        this.c = null;
        this.d = null;
        if (flashBoostBadgeView != null && viewGroup != null && (overlay = viewGroup.getOverlay()) != null) {
            overlay.remove(flashBoostBadgeView);
        }
        this.b = null;
        this.a = null;
    }
}
