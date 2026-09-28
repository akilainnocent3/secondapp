package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* JADX INFO: loaded from: classes4.dex */
public final class ljl implements View.OnAttachStateChangeListener {
    public final /* synthetic */ HideBottomViewOnScrollBehavior a;

    public ljl(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.a = hideBottomViewOnScrollBehavior;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.a;
        kjl kjlVar = hideBottomViewOnScrollBehavior.v;
        if (kjlVar == null || (accessibilityManager = hideBottomViewOnScrollBehavior.i) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(kjlVar);
        hideBottomViewOnScrollBehavior.v = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
