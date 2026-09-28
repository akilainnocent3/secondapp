package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common_ui.widgets.CommonTitleBar;
import com.sportybet.android.codehub.ui.CodeHubActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.LoadingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gw7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gw7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = CodeHubActivity.v;
                View viewInflate = ((CodeHubActivity) obj).getLayoutInflater().inflate(R.layout.activity_code_hub, (ViewGroup) null, false);
                int i3 = R.id.code_hub_tab;
                TabLayout tabLayout = (TabLayout) h5e.a(R.id.code_hub_tab, viewInflate);
                if (tabLayout != null) {
                    i3 = R.id.creator_credits_entrance_hint;
                    BubbleView bubbleView = (BubbleView) h5e.a(R.id.creator_credits_entrance_hint, viewInflate);
                    if (bubbleView != null) {
                        i3 = R.id.custom_code;
                        if (((ImageView) h5e.a(R.id.custom_code, viewInflate)) != null) {
                            i3 = R.id.custom_code_tab;
                            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.custom_code_tab, viewInflate);
                            if (linearLayout != null) {
                                i3 = R.id.ivHome;
                                ImageView imageView = (ImageView) h5e.a(R.id.ivHome, viewInflate);
                                if (imageView != null) {
                                    i3 = R.id.ivSocial;
                                    ImageView imageView2 = (ImageView) h5e.a(R.id.ivSocial, viewInflate);
                                    if (imageView2 != null) {
                                        i3 = R.id.loading;
                                        LoadingView loadingView = (LoadingView) h5e.a(R.id.loading, viewInflate);
                                        if (loadingView != null) {
                                            i3 = R.id.overlay;
                                            View viewA = h5e.a(R.id.overlay, viewInflate);
                                            if (viewA != null) {
                                                i3 = R.id.tab_divider;
                                                View viewA2 = h5e.a(R.id.tab_divider, viewInflate);
                                                if (viewA2 != null) {
                                                    i3 = R.id.tab_horizontal_divider;
                                                    View viewA3 = h5e.a(R.id.tab_horizontal_divider, viewInflate);
                                                    if (viewA3 != null) {
                                                        i3 = R.id.titleBar;
                                                        CommonTitleBar commonTitleBar = (CommonTitleBar) h5e.a(R.id.titleBar, viewInflate);
                                                        if (commonTitleBar != null) {
                                                            i3 = R.id.viewPager;
                                                            ViewPager2 viewPager2 = (ViewPager2) h5e.a(R.id.viewPager, viewInflate);
                                                            if (viewPager2 != null) {
                                                                i3 = R.id.world_cup_top_bar_background;
                                                                ImageView imageView3 = (ImageView) h5e.a(R.id.world_cup_top_bar_background, viewInflate);
                                                                if (imageView3 != null) {
                                                                    return new oc((ConstraintLayout) viewInflate, tabLayout, bubbleView, linearLayout, imageView, imageView2, loadingView, viewA, viewA2, viewA3, commonTitleBar, viewPager2, imageView3);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                return null;
            default:
                ((fgg) obj).s0();
                return Unit.a;
        }
    }
}
