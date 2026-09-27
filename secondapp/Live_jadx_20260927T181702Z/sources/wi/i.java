package wi;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.q1;
import androidx.transition.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends q1 {
    @Override // androidx.transition.q1
    @NonNull
    public Animator onAppear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable y0 y0Var, @Nullable y0 y0Var2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // androidx.transition.q1
    @NonNull
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable y0 y0Var, @Nullable y0 y0Var2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
