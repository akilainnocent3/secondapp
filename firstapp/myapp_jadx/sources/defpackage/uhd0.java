package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.search.SearchResultLoadingView;
import com.sportybet.plugin.realsports.search.widget.searchlivepanel.SearchLivePanel;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SearchPreMatchPanel;
import com.sportybet.plugin.realsports.widget.ClearEditText;

/* JADX INFO: loaded from: classes7.dex */
public final class uhd0 implements g6i0 {
    public final OneUpTwoUpSwitch A;
    public final OUEarlyGoalsSwitch B;
    public final RecyclerView C;
    public final TextView D;
    public final ClearEditText E;
    public final TabLayout F;
    public final gid0 G;
    public final SearchLivePanel H;
    public final TabLayout I;
    public final ConstraintLayout J;
    public final View K;
    public final SearchResultLoadingView L;
    public final View M;
    public final TabLayout N;
    public final SearchPreMatchPanel O;
    public final TabLayout P;
    public final ConstraintLayout Q;
    public final View R;
    public final ConstraintLayout a;
    public final TextView b;
    public final ImageButton c;
    public final TextView d;
    public final ChipGroup e;
    public final View f;
    public final BubbleView i;
    public final OneUpTwoUpSwitch v;
    public final OUEarlyGoalsSwitch w;
    public final View y;
    public final BubbleView z;

    public uhd0(ConstraintLayout constraintLayout, TextView textView, ImageButton imageButton, TextView textView2, ChipGroup chipGroup, View view, BubbleView bubbleView, OneUpTwoUpSwitch oneUpTwoUpSwitch, OUEarlyGoalsSwitch oUEarlyGoalsSwitch, View view2, BubbleView bubbleView2, OneUpTwoUpSwitch oneUpTwoUpSwitch2, OUEarlyGoalsSwitch oUEarlyGoalsSwitch2, RecyclerView recyclerView, TextView textView3, ClearEditText clearEditText, TabLayout tabLayout, gid0 gid0Var, SearchLivePanel searchLivePanel, TabLayout tabLayout2, ConstraintLayout constraintLayout2, View view3, SearchResultLoadingView searchResultLoadingView, View view4, TabLayout tabLayout3, SearchPreMatchPanel searchPreMatchPanel, TabLayout tabLayout4, ConstraintLayout constraintLayout3, View view5) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = imageButton;
        this.d = textView2;
        this.e = chipGroup;
        this.f = view;
        this.i = bubbleView;
        this.v = oneUpTwoUpSwitch;
        this.w = oUEarlyGoalsSwitch;
        this.y = view2;
        this.z = bubbleView2;
        this.A = oneUpTwoUpSwitch2;
        this.B = oUEarlyGoalsSwitch2;
        this.C = recyclerView;
        this.D = textView3;
        this.E = clearEditText;
        this.F = tabLayout;
        this.G = gid0Var;
        this.H = searchLivePanel;
        this.I = tabLayout2;
        this.J = constraintLayout2;
        this.K = view3;
        this.L = searchResultLoadingView;
        this.M = view4;
        this.N = tabLayout3;
        this.O = searchPreMatchPanel;
        this.P = tabLayout4;
        this.Q = constraintLayout3;
        this.R = view5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
