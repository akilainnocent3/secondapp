package defpackage;

import android.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class zn8 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(rn8 rn8Var, op8 op8Var) {
        int i = 0;
        View childAt = ((ViewGroup) rn8Var.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        AttributeSet attributeSet = null;
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(op8Var);
            return;
        }
        ComposeView composeView2 = new ComposeView(rn8Var, attributeSet, 6, i);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(op8Var);
        View decorView = rn8Var.getWindow().getDecorView();
        if (ll5.b(decorView) == null) {
            decorView.setTag(com.sportybet.android.gp.tz.R.id.view_tree_lifecycle_owner, rn8Var);
        }
        if (tl5.b(decorView) == null) {
            decorView.setTag(com.sportybet.android.gp.tz.R.id.view_tree_view_model_store_owner, rn8Var);
        }
        if (ydx.a(decorView) == null) {
            decorView.setTag(com.sportybet.android.gp.tz.R.id.view_tree_saved_state_registry_owner, rn8Var);
        }
        rn8Var.setContentView(composeView2, a);
    }
}
