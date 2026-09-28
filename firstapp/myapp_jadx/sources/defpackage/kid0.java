package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.presentation.widget.filter.FilterTabLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class kid0 implements g6i0 {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final ComposeView d;
    public final FilterTabLayout e;
    public final TextView f;
    public final oid0 i;
    public final RecyclerView v;
    public final RecyclerView w;
    public final ij90 y;

    public kid0(ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, ComposeView composeView, FilterTabLayout filterTabLayout, TextView textView, oid0 oid0Var, RecyclerView recyclerView, RecyclerView recyclerView2, ij90 ij90Var) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = composeView;
        this.e = filterTabLayout;
        this.f = textView;
        this.i = oid0Var;
        this.v = recyclerView;
        this.w = recyclerView2;
        this.y = ij90Var;
    }

    public static kid0 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.spr_multi_maker_activity, (ViewGroup) null, false);
        int i = R.id.above_bottom_area_mask;
        FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.above_bottom_area_mask, viewInflate);
        if (frameLayout != null) {
            i = R.id.anti_interaction_mask;
            FrameLayout frameLayout2 = (FrameLayout) h5e.a(R.id.anti_interaction_mask, viewInflate);
            if (frameLayout2 != null) {
                i = R.id.bottom_compose_view;
                ComposeView composeView = (ComposeView) h5e.a(R.id.bottom_compose_view, viewInflate);
                if (composeView != null) {
                    i = R.id.filter_tabs;
                    FilterTabLayout filterTabLayout = (FilterTabLayout) h5e.a(R.id.filter_tabs, viewInflate);
                    if (filterTabLayout != null) {
                        i = R.id.last_selection_msg;
                        TextView textView = (TextView) h5e.a(R.id.last_selection_msg, viewInflate);
                        if (textView != null) {
                            i = R.id.multi_maker_no_result_view;
                            View viewA = h5e.a(R.id.multi_maker_no_result_view, viewInflate);
                            if (viewA != null) {
                                if (((AppCompatTextView) h5e.a(R.id.mm_no_result_title, viewA)) == null) {
                                    bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(R.id.mm_no_result_title)));
                                    return null;
                                }
                                oid0 oid0Var = new oid0((LinearLayout) viewA);
                                i = R.id.multi_maker_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.multi_maker_recycler_view, viewInflate);
                                if (recyclerView != null) {
                                    i = R.id.multi_maker_sports;
                                    RecyclerView recyclerView2 = (RecyclerView) h5e.a(R.id.multi_maker_sports, viewInflate);
                                    if (recyclerView2 != null) {
                                        i = R.id.title_bar;
                                        View viewA2 = h5e.a(R.id.title_bar, viewInflate);
                                        if (viewA2 != null) {
                                            return new kid0((ConstraintLayout) viewInflate, frameLayout, frameLayout2, composeView, filterTabLayout, textView, oid0Var, recyclerView, recyclerView2, ij90.a(viewA2));
                                        }
                                    }
                                }
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
