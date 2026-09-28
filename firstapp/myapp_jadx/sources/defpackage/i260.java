package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class i260 implements g6i0 {
    public final CardView a;
    public final AppCompatButton b;

    public i260(CardView cardView, AppCompatButton appCompatButton) {
        this.a = cardView;
        this.b = appCompatButton;
    }

    public static i260 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.rush_bethistory_viewmore, viewGroup, false);
        AppCompatButton appCompatButton = (AppCompatButton) h5e.a(R.id.viewmore, viewInflate);
        if (appCompatButton != null) {
            return new i260((CardView) viewInflate, appCompatButton);
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.viewmore)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
