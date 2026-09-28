package defpackage;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.sportynews.ui.SportyMediaHostFragment;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class erc0 extends ViewPager2.g {
    public final /* synthetic */ SportyMediaHostFragment a;
    public final /* synthetic */ xxi b;

    public erc0(SportyMediaHostFragment sportyMediaHostFragment, xxi xxiVar) {
        this.a = sportyMediaHostFragment;
        this.b = xxiVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void c(int i) {
        TabLayout.g gVarK;
        View viewFindViewById;
        TextView textView;
        SportyMediaHostFragment sportyMediaHostFragment = this.a;
        VB vb = sportyMediaHostFragment.b;
        vb.getClass();
        TabLayout tabLayout = ((xxi) vb).c;
        TabLayout.g gVarK2 = tabLayout.k(0);
        int i2 = R.color.text_type2_primary;
        int i3 = R.color.background_type2_primary;
        if ((gVarK2 == null || !gVarK2.a()) && (gVarK = tabLayout.k(1)) != null && gVarK.a()) {
            i2 = R.color.text_type1_tertiary;
            i3 = R.color.background_general_primary;
        }
        int tabCount = tabLayout.getTabCount();
        for (int i4 = 0; i4 < tabCount; i4++) {
            TabLayout.g gVarK3 = tabLayout.k(i4);
            if (gVarK3 != null) {
                View view = gVarK3.f;
                if (view != null && (textView = (TextView) view.findViewById(R.id.tab_title)) != null) {
                    textView.setTypeface(gVarK3.a() ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
                    VB vb2 = sportyMediaHostFragment.b;
                    vb2.getClass();
                    textView.setTextColor(((xxi) vb2).a.getContext().getColor(i2));
                    VB vb3 = sportyMediaHostFragment.b;
                    vb3.getClass();
                    textView.setBackgroundColor(((xxi) vb3).a.getContext().getColor(i3));
                }
                View view2 = gVarK3.f;
                if (view2 != null && (viewFindViewById = view2.findViewById(R.id.custom_indicator)) != null) {
                    viewFindViewById.setVisibility(gVarK3.a() ? 0 : 8);
                }
            }
        }
        sportyMediaHostFragment.E = i;
        this.b.b.f.setText((i == 0 || TextUtils.isEmpty(sportyMediaHostFragment.F)) ? sportyMediaHostFragment.p0() : sportyMediaHostFragment.F);
    }
}
