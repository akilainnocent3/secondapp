package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class hhd0 implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final ImageButton d;
    public final ImageButton e;
    public final TextView f;

    public hhd0(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageButton imageButton, ImageButton imageButton2, TextView textView3) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = imageButton;
        this.e = imageButton2;
        this.f = textView3;
    }

    public static hhd0 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.spr_cash_out_page, viewGroup, false);
        int i = R.id.center;
        TextView textView = (TextView) h5e.a(R.id.center, viewInflate);
        if (textView != null) {
            i = R.id.cur;
            TextView textView2 = (TextView) h5e.a(R.id.cur, viewInflate);
            if (textView2 != null) {
                i = R.id.guid;
                if (((Guideline) h5e.a(R.id.guid, viewInflate)) != null) {
                    i = R.id.next;
                    ImageButton imageButton = (ImageButton) h5e.a(R.id.next, viewInflate);
                    if (imageButton != null) {
                        i = R.id.pre;
                        ImageButton imageButton2 = (ImageButton) h5e.a(R.id.pre, viewInflate);
                        if (imageButton2 != null) {
                            i = R.id.total;
                            TextView textView3 = (TextView) h5e.a(R.id.total, viewInflate);
                            if (textView3 != null) {
                                return new hhd0((ConstraintLayout) viewInflate, textView, textView2, imageButton, imageButton2, textView3);
                            }
                        }
                    }
                }
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
