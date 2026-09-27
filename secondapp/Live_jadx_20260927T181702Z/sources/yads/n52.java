package yads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n52 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final un2 f152886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gl1 f152887b;

    /* JADX WARN: Multi-variable type inference failed */
    public n52(Context context, un2 un2Var, gl1 gl1Var) {
        super(context);
        this.f152886a = un2Var;
        this.f152887b = gl1Var;
        addView(un2Var);
        if (gl1Var == 0 || !(gl1Var instanceof View)) {
            return;
        }
        addView((View) gl1Var);
    }
}
