package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class d6h0 implements g6i0 {
    public final LinearLayout a;
    public final TextView b;

    public d6h0(LinearLayout linearLayout, TextView textView) {
        this.a = linearLayout;
        this.b = textView;
    }

    public static d6h0 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.tx_item_load_more, viewGroup, false);
        int i = R.id.hint;
        TextView textView = (TextView) h5e.a(R.id.hint, viewInflate);
        if (textView != null) {
            i = R.id.progress;
            if (((ProgressBar) h5e.a(R.id.progress, viewInflate)) != null) {
                return new d6h0((LinearLayout) viewInflate, textView);
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
