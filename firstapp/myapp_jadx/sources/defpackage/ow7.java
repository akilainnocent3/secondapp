package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.codehub.ui.CodeHubActivity;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ow7 extends ViewPager2.g {
    public final /* synthetic */ CodeHubActivity a;

    public ow7(CodeHubActivity codeHubActivity) {
        this.a = codeHubActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void c(int i) {
        View viewFindViewById;
        TextView textView;
        CodeHubActivity codeHubActivity = this.a;
        if (codeHubActivity.i.size() > 1) {
            TabLayout tabLayout = codeHubActivity.B1().b;
            int tabCount = tabLayout.getTabCount();
            for (int i2 = 0; i2 < tabCount; i2++) {
                TabLayout.g gVarK = tabLayout.k(i2);
                if (gVarK != null) {
                    View view = gVarK.f;
                    if (view != null && (textView = (TextView) view.findViewById(R.id.tab_title)) != null) {
                        textView.setTypeface(gVarK.a() ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
                    }
                    View view2 = gVarK.f;
                    if (view2 != null && (viewFindViewById = view2.findViewById(R.id.custom_indicator)) != null) {
                        viewFindViewById.setVisibility(gVarK.a() ? 0 : 8);
                    }
                }
            }
        }
    }
}
