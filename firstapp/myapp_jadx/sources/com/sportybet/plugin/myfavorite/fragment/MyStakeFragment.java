package com.sportybet.plugin.myfavorite.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.account.MyFavoriteStake;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.fragment.MyStakeFragment;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import com.sportybet.plugin.myfavorite.widget.BottomLayout;
import com.sportybet.plugin.myfavorite.widget.DefaultStakeLayout;
import com.sportybet.plugin.myfavorite.widget.QuickAddStakeLayout;
import com.sportybet.plugin.myfavorite.widget.item.QuickAddStakeItem;
import defpackage.a2x;
import defpackage.b6y;
import defpackage.iww;
import defpackage.jww;
import defpackage.jxl;
import defpackage.lfy;
import defpackage.nzm;
import defpackage.pvw;
import defpackage.sn5;
import defpackage.x1x;

/* JADX INFO: loaded from: classes6.dex */
public class MyStakeFragment extends jxl implements BottomLayout.a {
    public nzm B;
    public b C;
    public MyFavoriteTypeEnum D;
    public TabLayout E;
    public DefaultStakeLayout F;
    public QuickAddStakeLayout G;
    public String H = null;
    public iww I;
    public LoadingViewNew J;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MyFavoriteTypeEnum.values().length];
            a = iArr;
            try {
                iArr[MyFavoriteTypeEnum.DEFAULT_STAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MyFavoriteTypeEnum.QUICK_ADD_STAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface b {
        void n(MyFavoriteTypeEnum myFavoriteTypeEnum);
    }

    @Override // com.sportybet.plugin.myfavorite.widget.BottomLayout.a
    public final void S() {
        if (this.F.getVisibility() == 0) {
            DefaultStakeLayout defaultStakeLayout = this.F;
            defaultStakeLayout.d.setText((CharSequence) null);
            defaultStakeLayout.b(null, false);
        } else {
            for (QuickAddStakeItem quickAddStakeItem : this.G.I) {
                quickAddStakeItem.H.c.setText((CharSequence) null);
                quickAddStakeItem.E(null, false);
            }
        }
    }

    @Override // com.sportybet.plugin.myfavorite.widget.BottomLayout.a
    public final void Z() {
        MyFavoriteStake stake;
        String stake2 = this.F.getStake();
        Double dValueOf = stake2.isEmpty() ? null : Double.valueOf(Double.parseDouble(stake2));
        if (this.F.getVisibility() == 0) {
            if (!this.F.d()) {
                return;
            }
            stake = this.G.E() ? ((a2x) this.I).w : this.G.getStake();
            stake.setDefaultStake(dValueOf);
        } else {
            if (this.G.E()) {
                return;
            }
            stake = this.G.getStake();
            if (this.F.d()) {
                stake.setDefaultStake(dValueOf);
            } else {
                stake.setDefaultStake(((a2x) this.I).w.getDefaultStake());
            }
        }
        ((a2x) this.I).E1(stake, true);
        this.I.B1(new pvw(stake, 17));
    }

    public final void n0() {
        int i = a.a[this.D.ordinal()];
        if (i == 1) {
            this.F.setVisibility(0);
            this.G.setVisibility(8);
        } else {
            if (i != 2) {
                return;
            }
            this.F.setVisibility(8);
            this.G.setVisibility(0);
        }
    }

    public final void o0(MyFavoriteStake myFavoriteStake) {
        if (myFavoriteStake.getDefaultStake() == null) {
            myFavoriteStake.setDefaultStake(Double.valueOf(this.B.h().doubleValue()));
        }
        if (myFavoriteStake.getQuickAddStake1() == null) {
            myFavoriteStake.setQuickAddStake1(Double.valueOf(this.B.i().get(0).doubleValue()));
        }
        if (myFavoriteStake.getQuickAddStake2() == null) {
            myFavoriteStake.setQuickAddStake2(Double.valueOf(this.B.i().get(1).doubleValue()));
        }
        if (myFavoriteStake.getQuickAddStake3() == null) {
            myFavoriteStake.setQuickAddStake3(Double.valueOf(this.B.i().get(2).doubleValue()));
        }
        if (myFavoriteStake.getDefaultStake() != null) {
            this.F.setDefaultStake(b6y.b.format(myFavoriteStake.getDefaultStake().doubleValue()));
        }
        this.G.setStake(myFavoriteStake);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() instanceof b) {
            this.C = (b) getActivity();
        }
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.I = jww.a(requireActivity(), MyFavoriteTypeEnum.STAKE);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_my_stake, viewGroup, false);
        this.E = (TabLayout) viewInflate.findViewById(R.id.stake_tab);
        this.F = (DefaultStakeLayout) viewInflate.findViewById(R.id.default_stake_layout);
        this.G = (QuickAddStakeLayout) viewInflate.findViewById(R.id.quick_add_stake_layout);
        BottomLayout bottomLayout = (BottomLayout) viewInflate.findViewById(R.id.bottom_layout);
        this.J = (LoadingViewNew) viewInflate.findViewById(R.id.loading);
        bottomLayout.setCallBackListener(this);
        if (getArguments() != null) {
            this.D = (MyFavoriteTypeEnum) getArguments().getSerializable("favorite_type");
            x1x x1xVarFromBundle = x1x.fromBundle(getArguments());
            if (x1xVarFromBundle != null) {
                this.H = x1xVarFromBundle.a;
            }
        }
        if (!TextUtils.isEmpty(this.H)) {
            bottomLayout.setRightButtonText(this.H);
        }
        this.E.n();
        TabLayout tabLayout = this.E;
        TabLayout.g gVarL = tabLayout.l();
        gVarL.e(sn5.d(this, R.string.wap_setting__default_stake, new Object[0]));
        tabLayout.d(gVarL, this.D == MyFavoriteTypeEnum.DEFAULT_STAKE);
        TabLayout tabLayout2 = this.E;
        TabLayout.g gVarL2 = tabLayout2.l();
        gVarL2.e(sn5.d(this, R.string.wap_setting__quick_add_stake, new Object[0]));
        tabLayout2.d(gVarL2, this.D == MyFavoriteTypeEnum.QUICK_ADD_STAKE);
        n0();
        this.E.a(new com.sportybet.plugin.myfavorite.fragment.a(this));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.I.C1();
        this.I.a.f(getViewLifecycleOwner(), new lfy() { // from class: v1x
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                hqc hqcVar = (hqc) obj;
                boolean z = hqcVar instanceof lqc;
                MyStakeFragment myStakeFragment = this.a;
                if (z) {
                    myStakeFragment.J.d();
                    return;
                }
                if (hqcVar instanceof nqc) {
                    myStakeFragment.J.a();
                    a2x a2xVar = (a2x) myStakeFragment.I;
                    MyFavoriteStake myFavoriteStake = (MyFavoriteStake) ((nqc) hqcVar).a;
                    a2xVar.E1(myFavoriteStake, false);
                    myStakeFragment.o0(myFavoriteStake);
                    return;
                }
                if (hqcVar instanceof jqc) {
                    myStakeFragment.J.a();
                    myStakeFragment.o0(new MyFavoriteStake());
                } else if (hqcVar instanceof kqc) {
                    myStakeFragment.J.a();
                    zyf0.a(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you);
                }
            }
        });
        this.I.b.f(getViewLifecycleOwner(), new lfy() { // from class: w1x
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                hqc hqcVar = (hqc) obj;
                boolean z = hqcVar instanceof nqc;
                MyStakeFragment myStakeFragment = this.a;
                if (z) {
                    myStakeFragment.J.a();
                    zyf0.b(R.string.my_favourites_settings__saved_toast, 0);
                } else {
                    if (hqcVar instanceof jqc) {
                        myStakeFragment.J.a();
                        return;
                    }
                    if (hqcVar instanceof kqc) {
                        myStakeFragment.J.a();
                        zyf0.a(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you);
                    } else if (hqcVar instanceof lqc) {
                        myStakeFragment.J.d();
                    }
                }
            }
        });
        this.I.z1();
    }
}
