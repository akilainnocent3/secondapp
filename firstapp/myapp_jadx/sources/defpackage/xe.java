package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class xe implements g6i0 {
    public final ConstraintLayout a;

    public xe(ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    public static xe a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_settings, (ViewGroup) null, false);
        if (((FragmentContainerView) h5e.a(R.id.settings_nav_host_fragment, viewInflate)) != null) {
            return new xe((ConstraintLayout) viewInflate);
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.settings_nav_host_fragment)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
