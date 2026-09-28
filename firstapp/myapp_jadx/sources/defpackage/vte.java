package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class vte extends e64<ieb0> {
    @Override // defpackage.e64
    public final void f(g6i0 g6i0Var, int i) {
        ((ieb0) g6i0Var).getClass();
    }

    @Override // defpackage.e64
    public final int h() {
        return R.layout.spm_divider_line;
    }

    @Override // defpackage.e64
    public final g6i0 i(View view) {
        view.getClass();
        View viewA = h5e.a(R.id.divider_line, view);
        if (viewA != null) {
            return new ieb0(viewA, (FrameLayout) view);
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.divider_line)));
        return null;
    }
}
