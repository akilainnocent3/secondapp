package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class xid0 implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;

    public xid0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
    }

    public static xid0 a(View view) {
        int i = R.id.open_bet_no_bet_text;
        if (((AppCompatTextView) h5e.a(R.id.open_bet_no_bet_text, view)) != null) {
            i = R.id.open_bet_no_data_recommend_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.open_bet_no_data_recommend_icon, view);
            if (appCompatImageView != null) {
                i = R.id.open_bet_no_login_text;
                if (((AppCompatTextView) h5e.a(R.id.open_bet_no_login_text, view)) != null) {
                    return new xid0((ConstraintLayout) view, appCompatImageView);
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
