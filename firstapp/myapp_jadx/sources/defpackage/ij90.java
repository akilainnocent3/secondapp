package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.sporty.android.common_ui.widgets.DoubleTextViewWithSeparator;
import com.sporty.android.common_ui.widgets.SimpleActionBar;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ij90 implements g6i0 {
    public final SimpleActionBar a;
    public final View b;
    public final ImageButton c;
    public final TextView d;
    public final ImageButton e;
    public final TextView f;

    public ij90(SimpleActionBar simpleActionBar, View view, ImageButton imageButton, TextView textView, ImageButton imageButton2, TextView textView2) {
        this.a = simpleActionBar;
        this.b = view;
        this.c = imageButton;
        this.d = textView;
        this.e = imageButton2;
        this.f = textView2;
    }

    public static ij90 a(View view) {
        int i = R.id.divider_line;
        View viewA = h5e.a(R.id.divider_line, view);
        if (viewA != null) {
            i = R.id.double_text_view_with_separator;
            if (((DoubleTextViewWithSeparator) h5e.a(R.id.double_text_view_with_separator, view)) != null) {
                i = R.id.home;
                ImageButton imageButton = (ImageButton) h5e.a(R.id.home, view);
                if (imageButton != null) {
                    i = R.id.primary_action;
                    TextView textView = (TextView) h5e.a(R.id.primary_action, view);
                    if (textView != null) {
                        i = R.id.primary_action_holder;
                        if (((FrameLayout) h5e.a(R.id.primary_action_holder, view)) != null) {
                            i = R.id.primary_action_icon;
                            if (((ImageButton) h5e.a(R.id.primary_action_icon, view)) != null) {
                                i = R.id.search;
                                if (((ImageButton) h5e.a(R.id.search, view)) != null) {
                                    i = R.id.simple_action_bar_back;
                                    ImageButton imageButton2 = (ImageButton) h5e.a(R.id.simple_action_bar_back, view);
                                    if (imageButton2 != null) {
                                        i = R.id.title;
                                        TextView textView2 = (TextView) h5e.a(R.id.title, view);
                                        if (textView2 != null) {
                                            return new ij90((SimpleActionBar) view, viewA, imageButton, textView, imageButton2, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
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
