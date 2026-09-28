package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sporty.android.common_ui.widgets.ItemToggleView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteBaseActivity;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.data.local.BetSlipDataStore;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqz2;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qz2 extends nml {
    public uqm f;
    public BetSlipDataStore i;
    public rdd0 v;
    public hc40 w;
    public BetslipActivity.r y;
    public xie z;

    public static final class a implements ItemToggleView.a {
        public a() {
        }

        @Override // com.sporty.android.common_ui.widgets.ItemToggleView.a
        public final void a(boolean z) {
            BetslipActivity.r rVar = qz2.this.y;
            if (rVar != null) {
                rVar.a(z);
            }
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetSettingDialogHelper$BetSettingBottomSheetDialog$onResume$2", f = "BetSettingDialogHelper.kt", l = {177, 187}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public String a;
        public ItemToggleView b;
        public ItemToggleView c;
        public int d;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return qz2.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x007b  */
        /* JADX WARN: Code duplicated, block: B:29:0x0088  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str;
            ItemToggleView itemToggleView;
            ItemToggleView itemToggleView2;
            String strC;
            y5b y5bVar = y5b.a;
            int i = this.d;
            qz2 qz2Var = qz2.this;
            if (i == 0) {
                uj50.b(obj);
                String userId = qz2Var.getAccountHelper().getUserId();
                if (userId == null) {
                    userId = "";
                }
                str = userId;
                BetSlipDataStore betSlipDataStore = qz2Var.i;
                if (betSlipDataStore == null) {
                    Intrinsics.n("betSlipDataStore");
                    throw null;
                }
                this.a = str;
                this.d = 1;
                obj = betSlipDataStore.getRetainSelectionsAfterRebet(str, this);
                if (obj != y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                str = this.a;
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                itemToggleView2 = this.c;
                itemToggleView = this.b;
                uj50.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                itemToggleView.getClass();
                strC = sn5.c(itemToggleView, R.string.component_betslip__combine_selections_when_rebet_remix, new Object[0]);
            } else {
                itemToggleView.getClass();
                strC = sn5.c(itemToggleView, R.string.component_betslip__retain_selections_after_rebet, new Object[0]);
            }
            itemToggleView2.setTitle(strC);
            return Unit.a;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            xie xieVar = qz2Var.z;
            if (xieVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ItemToggleView itemToggleView3 = xieVar.z;
            ItemToggleView.a checkedChangeListener = itemToggleView3.getCheckedChangeListener();
            itemToggleView3.setCheckedChangeListener(null);
            itemToggleView3.setChecked(zBooleanValue);
            itemToggleView3.setCheckedChangeListener(checkedChangeListener);
            hc40 hc40Var = qz2Var.w;
            if (hc40Var == null) {
                Intrinsics.n("rebetRemixCombineAnTestHelper");
                throw null;
            }
            this.a = null;
            this.b = itemToggleView3;
            this.c = itemToggleView3;
            this.d = 2;
            obj = hc40Var.c.isRebetRemixCombineVariant(str, this);
            if (obj != y5bVar) {
                itemToggleView = itemToggleView3;
                itemToggleView2 = itemToggleView;
                if (((Boolean) obj).booleanValue()) {
                    itemToggleView.getClass();
                    strC = sn5.c(itemToggleView, R.string.component_betslip__combine_selections_when_rebet_remix, new Object[0]);
                } else {
                    itemToggleView.getClass();
                    strC = sn5.c(itemToggleView, R.string.component_betslip__retain_selections_after_rebet, new Object[0]);
                }
                itemToggleView2.setTitle(strC);
                return Unit.a;
            }
            return y5bVar;
        }
    }

    public static final class c implements ItemToggleView.a {
        public c() {
        }

        @Override // com.sporty.android.common_ui.widgets.ItemToggleView.a
        public final void a(boolean z) {
            BetslipActivity.r rVar = qz2.this.y;
            if (rVar != null) {
                rVar.b(z);
            }
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetSettingDialogHelper$BetSettingBottomSheetDialog$onResume$defaultGiftChange$1", f = "BetSettingDialogHelper.kt", l = {195}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
        public int a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return qz2.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            BetSlipDataStore betSlipDataStore = qz2.this.i;
            if (betSlipDataStore == null) {
                Intrinsics.n("betSlipDataStore");
                throw null;
            }
            wm20<Boolean> betSlipDefaultGift = betSlipDataStore.getBetSlipDefaultGift();
            Boolean bool = Boolean.TRUE;
            this.a = 1;
            Object objE = betSlipDefaultGift.e(this, bool);
            return objE == y5bVar ? y5bVar : objE;
        }
    }

    public final uqm getAccountHelper() {
        uqm uqmVar = this.f;
        if (uqmVar != null) {
            return uqmVar;
        }
        Intrinsics.n("accountHelper");
        throw null;
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getClass();
        com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) dialogOnCreateDialog;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorG = bVar.g();
        bottomSheetBehaviorG.L(3);
        bottomSheetBehaviorG.Y = true;
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_bet_settings, viewGroup, false);
        int i = R.id.bet_settings;
        if (((TextView) h5e.a(R.id.bet_settings, viewInflate)) != null) {
            i = R.id.bottom_space;
            if (((Space) h5e.a(R.id.bottom_space, viewInflate)) != null) {
                i = R.id.btn_goto_my_stakes;
                if (((AppCompatImageView) h5e.a(R.id.btn_goto_my_stakes, viewInflate)) != null) {
                    i = R.id.close;
                    ImageView imageView = (ImageView) h5e.a(R.id.close, viewInflate);
                    if (imageView != null) {
                        i = R.id.default_gift_switch;
                        ItemToggleView itemToggleView = (ItemToggleView) h5e.a(R.id.default_gift_switch, viewInflate);
                        if (itemToggleView != null) {
                            i = R.id.divider1;
                            View viewA = h5e.a(R.id.divider1, viewInflate);
                            if (viewA != null) {
                                i = R.id.divider2;
                                View viewA2 = h5e.a(R.id.divider2, viewInflate);
                                if (viewA2 != null) {
                                    i = R.id.divider3;
                                    View viewA3 = h5e.a(R.id.divider3, viewInflate);
                                    if (viewA3 != null) {
                                        i = R.id.divider4;
                                        View viewA4 = h5e.a(R.id.divider4, viewInflate);
                                        if (viewA4 != null) {
                                            i = R.id.my_stakes;
                                            TextView textView = (TextView) h5e.a(R.id.my_stakes, viewInflate);
                                            if (textView != null) {
                                                i = R.id.odds_change_switch;
                                                ItemToggleView itemToggleView2 = (ItemToggleView) h5e.a(R.id.odds_change_switch, viewInflate);
                                                if (itemToggleView2 != null) {
                                                    i = R.id.remove_suspend_switch;
                                                    ItemToggleView itemToggleView3 = (ItemToggleView) h5e.a(R.id.remove_suspend_switch, viewInflate);
                                                    if (itemToggleView3 != null) {
                                                        i = R.id.retain_current_selection_switch;
                                                        ItemToggleView itemToggleView4 = (ItemToggleView) h5e.a(R.id.retain_current_selection_switch, viewInflate);
                                                        if (itemToggleView4 != null) {
                                                            i = R.id.setting_list;
                                                            if (((ConstraintLayout) h5e.a(R.id.setting_list, viewInflate)) != null) {
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                this.z = new xie(constraintLayout, imageView, itemToggleView, viewA, viewA2, viewA3, viewA4, textView, itemToggleView2, itemToggleView3, itemToggleView4);
                                                                constraintLayout.getClass();
                                                                return constraintLayout;
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
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        String userId = getAccountHelper().getUserId();
        if (userId == null) {
            userId = "no_account";
        } else {
            if (StringsKt.U(userId)) {
                userId = null;
            }
            if (userId == null) {
                userId = "no_account";
            }
        }
        boolean zB = vn20.b(getContext(), "user_accept_change", userId, false);
        xie xieVar = this.z;
        if (xieVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        xieVar.w.setChecked(zB);
        boolean zB2 = vn20.b(getContext(), "suspend_event_change", userId, false);
        xie xieVar2 = this.z;
        if (xieVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        xieVar2.y.setChecked(zB2);
        boolean zIsLogin = getAccountHelper().isLogin();
        xie xieVar3 = this.z;
        if (!zIsLogin) {
            if (xieVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            xieVar3.z.setVisibility(8);
            xie xieVar4 = this.z;
            if (xieVar4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            xieVar4.c.setVisibility(8);
            xie xieVar5 = this.z;
            if (xieVar5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            xieVar5.f.setVisibility(8);
            xie xieVar6 = this.z;
            if (xieVar6 != null) {
                xieVar6.i.setVisibility(8);
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        if (xieVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ItemToggleView itemToggleView = xieVar3.z;
        if (itemToggleView.getCheckedChangeListener() == null) {
            itemToggleView.setCheckedChangeListener(new a());
        }
        itemToggleView.setVisibility(0);
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new b(null), 3);
        boolean zBooleanValue = ((Boolean) dj5.a(e.a, new d(null))).booleanValue();
        xie xieVar7 = this.z;
        if (xieVar7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ItemToggleView itemToggleView2 = xieVar7.c;
        if (itemToggleView2.getCheckedChangeListener() == null) {
            itemToggleView2.setCheckedChangeListener(new c());
        }
        itemToggleView2.setChecked(zBooleanValue);
        itemToggleView2.setVisibility(0);
        xie xieVar8 = this.z;
        if (xieVar8 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        xieVar8.f.setVisibility(0);
        xie xieVar9 = this.z;
        if (xieVar9 != null) {
            xieVar9.i.setVisibility(0);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("go_to_my_stake", true);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Object parent = view.getParent();
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view2 = (View) parent;
        if (view2 != null) {
            view2.setBackgroundColor(0);
        }
        xie xieVar = this.z;
        if (xieVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        xieVar.b.setOnClickListener(new View.OnClickListener() { // from class: kz2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.a.dismiss();
            }
        });
        xie xieVar2 = this.z;
        if (xieVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        xieVar2.v.setOnClickListener(new rz2(new cq40(), this));
        xie xieVar3 = this.z;
        if (xieVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        xieVar3.w.setCheckedChangeListener(new lz2(this));
        xie xieVar4 = this.z;
        if (xieVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        xieVar4.y.setCheckedChangeListener(new pz2(this));
        xie xieVar5 = this.z;
        if (xieVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        xieVar5.z.setCheckedChangeListener(new oz2(this));
        Context context = getContext();
        if (context != null) {
            String userId = getAccountHelper().getUserId();
            if (userId == null) {
                userId = "no_account";
            } else {
                if (StringsKt.U(userId)) {
                    userId = null;
                }
                if (userId == null) {
                    userId = "no_account";
                }
            }
            long j = context.getSharedPreferences("default_gift_setting_ts", 0).getLong(userId, 0L);
            boolean z = true;
            if (j == 0) {
                ((ContextWrapper) context).getSharedPreferences("default_gift_setting_ts", 0).edit().putLong(userId, System.currentTimeMillis()).commit();
            } else if (System.currentTimeMillis() - j > 604800000) {
                z = false;
            }
            boolean zBooleanValue = ((Boolean) dj5.a(e.a, new nz2(this, null))).booleanValue();
            rdd0 rdd0Var = this.v;
            if (rdd0Var == null) {
                Intrinsics.n("sportyTrackingUseCase");
                throw null;
            }
            rdd0Var.a(new v03.c0(kpu.d(new Pair("value", zBooleanValue ? AnalyticsParam.EVENT_STATUS_ON : AnalyticsParam.EVENT_STATUS_OFF))), k00.d, k00.c);
            xie xieVar6 = this.z;
            if (xieVar6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ItemToggleView itemToggleView = xieVar6.c;
            itemToggleView.setNewFlagVisibility(z);
            itemToggleView.setChecked(zBooleanValue);
            itemToggleView.setCheckedChangeListener(new mz2(this));
        }
        if (bundle == null || !bundle.getBoolean("go_to_my_stake")) {
            return;
        }
        MyFavoriteBaseActivity.z1(requireActivity(), MyFavoriteTypeEnum.DEFAULT_STAKE);
        bundle.putBoolean("go_to_my_stake", false);
    }
}
