package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.widget.SettleDelayHint;

/* JADX INFO: loaded from: classes7.dex */
public final class phd0 implements g6i0 {
    public final SettleDelayHint a;

    public phd0(SettleDelayHint settleDelayHint) {
        this.a = settleDelayHint;
    }

    public static phd0 a(View view) {
        if (((AppCompatImageView) h5e.a(R.id.hint_btn, view)) != null) {
            return new phd0((SettleDelayHint) view);
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.hint_btn)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
