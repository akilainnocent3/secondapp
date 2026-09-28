package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class hi30 implements g6i0 {
    public final AppCompatTextView a;
    public final AppCompatTextView b;

    public hi30(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.a = appCompatTextView;
        this.b = appCompatTextView2;
    }

    public static hi30 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.quick_market_header_holder_item, viewGroup, false);
        if (viewInflate != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate;
            return new hi30(appCompatTextView, appCompatTextView);
        }
        bmy.a("rootView");
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
