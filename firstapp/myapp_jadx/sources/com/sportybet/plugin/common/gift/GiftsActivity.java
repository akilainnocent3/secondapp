package com.sportybet.plugin.common.gift;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.GiftGroup;
import com.sporty.android.core.model.gift.GiftGroupType;
import com.sporty.android.core.model.gift.SelectedGiftData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.domain.GiftCurrentBalance;
import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.common.gift.GiftsActivity;
import com.sportybet.plugin.realsports.betorder.RecyclerView.CustomLinearLayoutManager;
import com.sportybet.plugin.realsports.betorder.RecyclerView.PullRefreshRecyclerView;
import defpackage.bqe;
import defpackage.btk;
import defpackage.cyb;
import defpackage.dor;
import defpackage.dq7;
import defpackage.eqk;
import defpackage.fdt;
import defpackage.g93;
import defpackage.g9i0;
import defpackage.hb5;
import defpackage.jq40;
import defpackage.l48;
import defpackage.lfy;
import defpackage.lop;
import defpackage.lq1;
import defpackage.m2g;
import defpackage.mzk;
import defpackage.n8j0;
import defpackage.nzk;
import defpackage.qoa0;
import defpackage.qrl;
import defpackage.r6i0;
import defpackage.r8i0;
import defpackage.rj5;
import defpackage.rlf;
import defpackage.s8i0;
import defpackage.sq7;
import defpackage.tik;
import defpackage.tlf;
import defpackage.tq7;
import defpackage.up3;
import defpackage.v8i0;
import defpackage.yyk;
import defpackage.zpk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class GiftsActivity extends qrl implements View.OnClickListener, rlf, btk {
    public static final /* synthetic */ int P = 0;
    public boolean A;
    public String B;
    public boolean C = false;
    public boolean D = true;
    public int E;
    public InstantWinGiftApplicabilityContext F;
    public FrameLayout G;
    public Handler H;
    public zpk I;
    public yyk J;
    public lq1 K;
    public eqk L;
    public up3 M;
    public up3 N;
    public up3 O;
    public ArrayList b;
    public boolean c;
    public LoadingView d;
    public PullRefreshRecyclerView e;
    public tik f;
    public int i;
    public String v;
    public int w;
    public String y;
    public long z;

    public final void A1() {
        if (!this.c) {
            this.d.K();
        }
        this.J.z1(this.i);
    }

    public final void B1() {
        this.d.getEmptyView().setTextColor(Color.parseColor("#9ca0ab"));
        this.d.getEmptyView().setTextSize(14.0f);
        this.d.H(getCMSString(R.string.component_coupon__you_have_no_available_gifts_at_this_time, new Object[0]));
        this.d.L(this);
    }

    @Override // defpackage.btk
    public final void V(SelectedGiftData selectedGiftData, int i) {
        up3 up3Var;
        int i2 = this.E;
        if (i2 != 1) {
            up3Var = (i2 == 2 || i2 == 4 || i2 == 6) ? this.N : this.O;
        } else {
            up3Var = this.M;
        }
        up3Var.b(selectedGiftData);
        Intent intent = new Intent();
        intent.putExtra("gift_value", selectedGiftData.getGiftValue());
        intent.putExtra("gift_kind", selectedGiftData.getGiftKind());
        intent.putExtra("gift_id", selectedGiftData.getGiftId());
        intent.putExtra("gift_limit", selectedGiftData.getGiftLimit());
        intent.putExtra("gift_count", i);
        intent.putExtra("extra_selected_gift", selectedGiftData);
        setResult(-1, intent);
        if (this.C) {
            this.M.v = true;
            intent.setAction("quick_bet_gifts");
            fdt.a(this).c(intent);
        }
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        this.G.setBackground(getDrawable(R.drawable.betslip_bg_enter));
        overridePendingTransition(R.anim.activity_slide_exit_bottom_without_change, R.anim.activity_slide_exit_bottom);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.goback) {
            z1();
        } else if (id == R.id.loading) {
            this.d.L(null);
            A1();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        n8j0.g cVar;
        super.onCreate(bundle);
        int i = 1;
        try {
            setRequestedOrientation(1);
        } catch (Exception unused) {
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 35) {
            Window window = getWindow();
            qoa0 qoa0Var = new qoa0(window.getDecorView());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 35) {
                cVar = new n8j0.f(window, qoa0Var);
            } else if (i2 >= 30) {
                cVar = new n8j0.d(window, qoa0Var);
            } else {
                cVar = i2 >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
            }
            cVar.d(false);
            cVar.c(false);
            View viewFindViewById = findViewById(android.R.id.content);
            tlf tlfVar = new tlf(viewFindViewById, z);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.d.n(viewFindViewById, tlfVar);
        } else {
            Window window2 = getWindow();
            window2.addFlags(Integer.MIN_VALUE);
            window2.clearFlags(67108864);
            window2.setStatusBarColor(0);
        }
        setContentView(R.layout.spr_activity_gifts);
        getOnBackPressedDispatcher().a(this, new mzk(this));
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(yyk.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.J = (yyk) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        getWindow().setSoftInputMode(3);
        this.H = new Handler();
        Intent intent = getIntent();
        this.z = intent.getLongExtra("jackpot_total_stake", 0L);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            int i3 = extras.getInt("order_biz_type", 1);
            this.i = i3;
            this.A = i3 == 3;
            this.E = extras.getInt("betslip_type", g93.a().getTypeName());
            this.v = extras.getString("key_gift_id");
            this.w = extras.getInt("key_gift_kind");
            this.y = extras.getString("key_gift_value");
            this.B = extras.getString("quick_stake");
            this.C = extras.getBoolean("gift_quick_bet", false);
            this.D = extras.getBoolean("is_support_free_bet", true);
            this.F = (InstantWinGiftApplicabilityContext) rj5.a(extras, "key_instant_win_gift_applicability_context", InstantWinGiftApplicabilityContext.class);
        }
        boolean z2 = this.C;
        if (z2) {
            this.E = 1;
            this.D = true;
        }
        eqk eqkVar = this.L;
        int i4 = this.i;
        int i5 = this.E;
        String str = this.B;
        if (str == null) {
            str = "";
        }
        this.I = eqkVar.a(i4, i5, z2, str, this.F);
        this.b = new ArrayList();
        LoadingView loadingView = (LoadingView) findViewById(R.id.loading);
        this.d = loadingView;
        loadingView.setOnClickListener(new sq7(this, i));
        this.d.setEnabled(true);
        findViewById(R.id.goback).setOnClickListener(this);
        PullRefreshRecyclerView pullRefreshRecyclerView = (PullRefreshRecyclerView) findViewById(R.id.mPullRefreshRecyclerView);
        this.e = pullRefreshRecyclerView;
        pullRefreshRecyclerView.setOnRefreshListener(new nzk(this));
        this.e.setLayoutManager(new CustomLinearLayoutManager());
        this.e.i0.i(new dor(bqe.a(20.0f)));
        PullRefreshRecyclerView pullRefreshRecyclerView2 = this.e;
        pullRefreshRecyclerView2.l0 = true;
        pullRefreshRecyclerView2.setEnabled(true);
        this.e.n0 = false;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.layout_background);
        this.G = frameLayout;
        ((TransitionDrawable) frameLayout.getBackground()).startTransition(300);
        this.G.setOnClickListener(new tq7(this, i));
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.activity_slide_enter_bottom);
        animationLoadAnimation.reset();
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.container);
        constraintLayout.clearAnimation();
        constraintLayout.startAnimation(animationLoadAnimation);
        this.J.G.f(this, new lfy() { // from class: kzk
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                List<GiftGroup> list = (List) obj;
                int i6 = GiftsActivity.P;
                GiftsActivity giftsActivity = this.a;
                if (giftsActivity.isFinishing()) {
                    return;
                }
                giftsActivity.d.E();
                if (list == null || list.isEmpty()) {
                    if (giftsActivity.c) {
                        giftsActivity.e.n();
                    }
                    ArrayList arrayList = giftsActivity.b;
                    if (arrayList == null) {
                        giftsActivity.d.I();
                        return;
                    }
                    if (arrayList.isEmpty()) {
                        giftsActivity.B1();
                        return;
                    } else if (giftsActivity.getAccountHelper().isLogin()) {
                        zyf0.b(R.string.common_feedback__no_internet_connection_try_again, 0);
                        return;
                    } else {
                        giftsActivity.finish();
                        return;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (GiftGroup giftGroup : list) {
                    if (!giftGroup.getGifts().isEmpty()) {
                        Iterator<GiftDetails> it = giftGroup.getGifts().iterator();
                        while (it.hasNext()) {
                            it.next().setType(giftGroup.getType());
                        }
                        if (giftGroup.getType() == 10) {
                            List<GiftDetails> gifts = giftGroup.getGifts();
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            for (GiftDetails giftDetails : gifts) {
                                double d = Double.parseDouble(bjb0.X(giftDetails.getLeastOrderAmount()));
                                if (giftsActivity.A) {
                                    long j = giftsActivity.z;
                                    giftDetails.setAvailable(j == 0 || ((double) j) >= d);
                                } else {
                                    giftDetails.setAvailable(giftsActivity.I.d(giftDetails));
                                }
                                if (!giftDetails.isAvailable()) {
                                    arrayList3.add(giftDetails);
                                }
                                if (!giftsActivity.I.a()) {
                                    int i7 = giftsActivity.E;
                                    List<Integer> betTypeScopes = giftDetails.getBetTypeScopes();
                                    if (betTypeScopes != null && betTypeScopes.size() > 0) {
                                        Iterator<Integer> it2 = betTypeScopes.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                Integer next = it2.next();
                                                if (next.intValue() == i7 || next.intValue() == 0) {
                                                    if (giftDetails.getKind() == 3 && giftDetails.getType() == 10 && !giftsActivity.D) {
                                                        arrayList4.add(giftDetails);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    arrayList4.add(giftDetails);
                                } else if (!giftsActivity.I.b(giftDetails)) {
                                    arrayList4.add(giftDetails);
                                }
                            }
                            if (arrayList4.size() > 0) {
                                gifts.removeAll(arrayList4);
                                int size = arrayList4.size();
                                int i8 = 0;
                                while (i8 < size) {
                                    Object obj2 = arrayList4.get(i8);
                                    i8++;
                                    ((GiftDetails) obj2).setType(-10);
                                }
                                gifts.addAll(arrayList4);
                            }
                            if (arrayList3.size() > 0) {
                                gifts.removeAll(arrayList3);
                                int size2 = arrayList3.size();
                                int i9 = 0;
                                while (i9 < size2) {
                                    Object obj3 = arrayList3.get(i9);
                                    i9++;
                                    ((GiftDetails) obj3).setType(20);
                                }
                                gifts.addAll(arrayList3);
                            }
                            arrayList2.addAll(gifts);
                        } else {
                            arrayList2.addAll(giftGroup.getGifts());
                        }
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    GiftDetails giftDetails2 = (GiftDetails) it3.next();
                    if (giftDetails2.shouldVerifyBvn() || !giftsActivity.I.e(giftDetails2.getKind())) {
                        it3.remove();
                    }
                }
                giftsActivity.b.clear();
                giftsActivity.b.addAll(arrayList2);
                if (giftsActivity.f == null) {
                    tik tikVar = new tik(giftsActivity, giftsActivity.b, giftsActivity.A, giftsActivity.z, giftsActivity.v, giftsActivity.w, giftsActivity.y, giftsActivity.I, giftsActivity.i, qq1.a(giftsActivity.K, BOConfigParam.CashoutSupportGiftEnabled, false), giftsActivity);
                    giftsActivity.f = tikVar;
                    giftsActivity.e.setAdapter(tikVar);
                }
                if (giftsActivity.c) {
                    giftsActivity.c = false;
                }
                ArrayList arrayList5 = giftsActivity.b;
                if (arrayList5 == null || arrayList5.size() == 0) {
                    giftsActivity.B1();
                } else {
                    giftsActivity.f.notifyDataSetChanged();
                    giftsActivity.e.n();
                }
            }
        });
        A1();
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.H.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (isFinishing()) {
            lop.a(this.e);
        }
    }

    public final void z1() {
        Object next;
        Intent intent = new Intent();
        Iterator<T> it = this.J.B1().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((GiftGroup) next).getType() != GiftGroupType.USABLE.getValue());
        GiftGroup giftGroup = (GiftGroup) next;
        List<GiftDetails> gifts = giftGroup != null ? giftGroup.getGifts() : null;
        if (gifts == null) {
            gifts = m2g.a;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(l48.r(gifts, 10));
        for (GiftDetails giftDetails : gifts) {
            arrayList.add(new GiftCurrentBalance(giftDetails.getGiftId(), giftDetails.getCurrentBalance()));
        }
        intent.putParcelableArrayListExtra("extra_usable_gift_current_balances", arrayList);
        setResult(0, intent);
        finish();
    }
}
