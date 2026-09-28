package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes4.dex */
public final class z35 extends AnimatorListenerAdapter {
    public final /* synthetic */ BottomAppBar a;

    public z35(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BottomAppBar bottomAppBar = this.a;
        bottomAppBar.I0.onAnimationStart(animator);
        View viewB = bottomAppBar.B();
        FloatingActionButton floatingActionButton = viewB instanceof FloatingActionButton ? (FloatingActionButton) viewB : null;
        if (floatingActionButton != null) {
            floatingActionButton.setTranslationX(bottomAppBar.getFabTranslationX());
        }
    }
}
