package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tlf implements zmy {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;

    public /* synthetic */ tlf(View view, boolean z) {
        this.a = z;
        this.b = view;
    }

    @Override // defpackage.zmy
    public final l8j0 b(View view, l8j0 l8j0Var) {
        view.getClass();
        ymn ymnVarG = l8j0Var.a.g(519);
        ymnVarG.getClass();
        view.setPadding(view.getPaddingLeft(), this.a ? ymnVarG.b : view.getPaddingTop(), view.getPaddingRight(), ymnVarG.d);
        WindowInsets windowInsets = q7i0.a;
        if (Build.VERSION.SDK_INT < 30) {
            p7i0 p7i0Var = new p7i0();
            View view2 = this.b;
            view2.setTag(R.id.tag_compat_insets_dispatch, p7i0Var);
            view2.setOnApplyWindowInsetsListener(p7i0Var);
            q7i0.b = true;
        }
        return l8j0.b;
    }
}
