package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.cruxlab.sectionedrecyclerview.lib.SectionHeaderLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common_ui.widgets.AspectRatioFrameLayout;
import com.sporty.android.common_ui.widgets.SimpleActionBar;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.ScheduleActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ll22;", "Lpy1;", "Lwym;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class l22 extends fml implements wym {
    public static final /* synthetic */ int d = 0;
    public nqs b;
    public final String c = "";

    public static final class a implements wq3.b {
        public a() {
        }

        @Override // wq3.b
        public final boolean a() {
            return !l22.this.isFinishing();
        }

        @Override // wq3.b
        public final void b(int i) {
            View view = l22.this.z1().v;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i - 75;
            view.setLayoutParams(layoutParams);
            view.setVisibility(0);
        }

        @Override // wq3.b
        public final void c(boolean z) {
            l22.this.z1().v.setVisibility(8);
        }
    }

    public abstract String A1();

    public abstract void B1();

    public abstract void C1();

    @Override // defpackage.wym
    public final boolean k0() {
        return false;
    }

    @Override // defpackage.wym
    public final boolean o() {
        return false;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.live_page_activity, (ViewGroup) null, false);
        int i = R.id.action_bar;
        View viewA = h5e.a(R.id.action_bar, viewInflate);
        if (viewA != null) {
            ij90 ij90VarA = ij90.a(viewA);
            i = R.id.boost_ad;
            if (((ImageView) h5e.a(R.id.boost_ad, viewInflate)) != null) {
                i = R.id.boost_ad_container;
                AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) h5e.a(R.id.boost_ad_container, viewInflate);
                if (aspectRatioFrameLayout != null) {
                    i = R.id.close;
                    ImageView imageView = (ImageView) h5e.a(R.id.close, viewInflate);
                    if (imageView != null) {
                        i = R.id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler_view, viewInflate);
                        if (recyclerView != null) {
                            i = R.id.section_header_layout;
                            SectionHeaderLayout sectionHeaderLayout = (SectionHeaderLayout) h5e.a(R.id.section_header_layout, viewInflate);
                            if (sectionHeaderLayout != null) {
                                i = R.id.sport_tab_layout;
                                TabLayout tabLayout = (TabLayout) h5e.a(R.id.sport_tab_layout, viewInflate);
                                if (tabLayout != null) {
                                    i = R.id.stub;
                                    View viewA2 = h5e.a(R.id.stub, viewInflate);
                                    if (viewA2 != null) {
                                        i = R.id.swipe_layout;
                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe_layout, viewInflate);
                                        if (swipeRefreshLayout != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            nqs nqsVar = new nqs(constraintLayout, ij90VarA, aspectRatioFrameLayout, imageView, recyclerView, sectionHeaderLayout, tabLayout, viewA2, swipeRefreshLayout);
                                            setContentView(constraintLayout);
                                            this.b = nqsVar;
                                            setRequireBetslipBtnLater(true);
                                            SimpleActionBar simpleActionBar = z1().b.a;
                                            simpleActionBar.setBackButton(new View.OnClickListener() { // from class: h22
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i2 = l22.d;
                                                    this.a.finish();
                                                }
                                            });
                                            simpleActionBar.setHomeButton(new i22());
                                            simpleActionBar.setPrimaryActionTextButton(sn5.c(simpleActionBar, R.string.common_functions__schedule, new Object[0]), new View.OnClickListener() { // from class: j22
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i2 = l22.d;
                                                    Context context = view.getContext();
                                                    Intent intent = new Intent(view.getContext(), (Class<?>) ScheduleActivity.class);
                                                    intent.putExtra("DEFAULT_SPORT_ID", this.a.A1());
                                                    yrh0.s(context, intent, true);
                                                }
                                            });
                                            simpleActionBar.setTitle(sn5.c(simpleActionBar, R.string.common_functions__live, new Object[0]));
                                            simpleActionBar.setPrimaryActionButtonVisible(0);
                                            final nqs nqsVarZ1 = z1();
                                            nqsVarZ1.c.setAspectRatio(0.17777778f);
                                            nqsVarZ1.d.setOnClickListener(new View.OnClickListener() { // from class: k22
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    vn20.g("sportybet", this.a.c + "live", false, false);
                                                    nqsVarZ1.c.setVisibility(8);
                                                }
                                            });
                                            B1();
                                            z1().w.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: g22
                                                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                                                public final void i() {
                                                    int i2 = l22.d;
                                                    this.a.C1();
                                                }
                                            });
                                            return;
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
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public void onPause() {
        wq3 wq3VarU = ((br3) mmc.a(hp0.A, br3.class)).U();
        wq3VarU.a(this, false);
        wq3VarU.K = null;
        super.onPause();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public void onResume() {
        super.onResume();
        wq3 wq3VarU = ((br3) mmc.a(hp0.A, br3.class)).U();
        wq3VarU.K = new a();
        wq3VarU.a(this, true);
    }

    @Override // defpackage.wym
    public final boolean y() {
        return false;
    }

    public final nqs z1() {
        nqs nqsVar = this.b;
        if (nqsVar != null) {
            return nqsVar;
        }
        Intrinsics.n("_binding");
        throw null;
    }
}
