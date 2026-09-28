package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.DropdownEntry;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.plugin.realsports.widget.LoadingViewWithHint;

/* JADX INFO: loaded from: classes4.dex */
public final class ze implements g6i0 {
    public final ImageView A;
    public final SwipeRefreshLayout B;
    public final TextView C;
    public final wh7 D;
    public final DropdownEntry E;
    public final LinearLayout a;
    public final DropdownEntry b;
    public final ImageButton c;
    public final AppCompatImageView d;
    public final ImageButton e;
    public final TextView f;
    public final LoadingViewWithHint i;
    public final ConstraintLayout v;
    public final TextView w;
    public final BubbleView y;
    public final RecyclerView z;

    public ze(LinearLayout linearLayout, DropdownEntry dropdownEntry, ImageButton imageButton, AppCompatImageView appCompatImageView, ImageButton imageButton2, TextView textView, LoadingViewWithHint loadingViewWithHint, ConstraintLayout constraintLayout, TextView textView2, BubbleView bubbleView, RecyclerView recyclerView, ImageView imageView, SwipeRefreshLayout swipeRefreshLayout, TextView textView3, wh7 wh7Var, DropdownEntry dropdownEntry2) {
        this.a = linearLayout;
        this.b = dropdownEntry;
        this.c = imageButton;
        this.d = appCompatImageView;
        this.e = imageButton2;
        this.f = textView;
        this.i = loadingViewWithHint;
        this.v = constraintLayout;
        this.w = textView2;
        this.y = bubbleView;
        this.z = recyclerView;
        this.A = imageView;
        this.B = swipeRefreshLayout;
        this.C = textView3;
        this.D = wh7Var;
        this.E = dropdownEntry2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
