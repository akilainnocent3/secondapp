package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class cxs extends e64<efb0> {
    @Override // defpackage.e64
    public final void f(g6i0 g6i0Var, int i) {
        ((efb0) g6i0Var).getClass();
    }

    @Override // defpackage.e64
    public final int h() {
        return R.layout.spm_my_program_load_more;
    }

    @Override // defpackage.e64
    public final g6i0 i(View view) {
        view.getClass();
        int i = R.id.progress;
        if (((ProgressBar) h5e.a(R.id.progress, view)) != null) {
            i = R.id.text;
            if (((TextView) h5e.a(R.id.text, view)) != null) {
                return new efb0((ConstraintLayout) view);
            }
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
