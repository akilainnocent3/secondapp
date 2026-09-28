package com.sportybet.plugin.realsports.betslip.widget.header;

import android.accounts.Account;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.sim.SimShareData;
import defpackage.bmy;
import defpackage.cq40;
import defpackage.cz3;
import defpackage.etr;
import defpackage.h5e;
import defpackage.iu2;
import defpackage.iw2;
import defpackage.k53;
import defpackage.m43;
import defpackage.n43;
import defpackage.o43;
import defpackage.ogd0;
import defpackage.op8;
import defpackage.q43;
import defpackage.u6i0;
import defpackage.uhc;
import defpackage.zch0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\f2\b\b\u0001\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b&\u0010\u001eJ\u0015\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u000f¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u000f¢\u0006\u0004\b*\u0010)J\u0015\u0010+\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u000f¢\u0006\u0004\b+\u0010)J\u0015\u0010,\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u000f¢\u0006\u0004\b,\u0010)J\u001f\u0010.\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010\n2\u0006\u0010'\u001a\u00020\u000f¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\u00020\f2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\f2\u0006\u00106\u001a\u00020\u000f¢\u0006\u0004\b7\u0010)J\u001d\u00109\u001a\u00020\f2\u0006\u00106\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000f¢\u0006\u0004\b9\u00103J\u001d\u0010:\u001a\u00020\f2\u0006\u00106\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000f¢\u0006\u0004\b:\u00103J\u0015\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u0006¢\u0006\u0004\b<\u0010!J\r\u0010=\u001a\u00020\f¢\u0006\u0004\b=\u00105J5\u0010B\u001a\u00020\f2\b\u0010>\u001a\u0004\u0018\u00010\"2\b\u0010?\u001a\u0004\u0018\u00010\"2\b\u0010@\u001a\u0004\u0018\u00010\"2\b\u0010A\u001a\u0004\u0018\u00010\"¢\u0006\u0004\bB\u0010CR*\u0010K\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010O\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010F\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR*\u0010S\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010F\u001a\u0004\bQ\u0010H\"\u0004\bR\u0010JR*\u0010W\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010F\u001a\u0004\bU\u0010H\"\u0004\bV\u0010JR*\u0010[\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010F\u001a\u0004\bY\u0010H\"\u0004\bZ\u0010JR*\u0010_\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010F\u001a\u0004\b]\u0010H\"\u0004\b^\u0010JR*\u0010c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010F\u001a\u0004\ba\u0010H\"\u0004\bb\u0010JR*\u0010g\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010F\u001a\u0004\be\u0010H\"\u0004\bf\u0010JR*\u0010k\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010F\u001a\u0004\bi\u0010H\"\u0004\bj\u0010JR*\u0010o\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010F\u001a\u0004\bm\u0010H\"\u0004\bn\u0010JR*\u0010s\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010F\u001a\u0004\bq\u0010H\"\u0004\br\u0010JR*\u0010w\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010F\u001a\u0004\bu\u0010H\"\u0004\bv\u0010JR1\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\f\u0018\u00010x8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR.\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010F\u001a\u0005\b\u0082\u0001\u0010H\"\u0005\b\u0083\u0001\u0010JR\u0015\u0010\u0087\u0001\u001a\u00030\u0084\u00018F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u0088\u0001"}, d2 = {"Lcom/sportybet/plugin/realsports/betslip/widget/header/BetSlipHeader;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lq43;", "state", "", "setBetSlipHeaderState", "(Lq43;)V", "", "isSupported", "currentBetSlipHeaderState", "setDisplayTypeMenuVisibility", "(ZLq43;)V", "setRemoveContainerVisibility", "Landroid/accounts/Account;", "account", "setAccountInfo", "(Landroid/accounts/Account;)V", "getSettingNewFlagVisible", "()Z", "", "text", "setBetSlipNumberText", "(Ljava/lang/String;)V", "color", "setBetSlipNumberTextColor", "(I)V", "Landroid/graphics/drawable/Drawable;", "background", "setBetSlipNumberBackground", "(Landroid/graphics/drawable/Drawable;)V", "setBetSlipCashText", "isVisible", "setSimDescAndGamesContainerVisible", "(Z)V", "setSimBetHistoryHintVisible", "setSimNotifyBadgeVisible", "setSimRemoveAllVisible", "betSlipHeaderState", "setAutoBetButtonVisible", "(Lq43;Z)V", "isSim", "isBetSlipSimple", "setSwitchRealToSim", "(ZZ)V", "setBetBonusHintCount", "()V", "enabled", "setRemoveAllBtnEnabled", "isLogin", "setBetHistoryButtonEnabled", "setSimButtonsEnabled", "betType", "setSelectTab", "setStrikeThruFlag", "drawableLeft", "drawableTop", "drawableRight", "drawableBottom", "setSinglesCompoundDrawable", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "Lkotlin/Function0;", "G", "Lkotlin/jvm/functions/Function0;", "getOnCollapseClick", "()Lkotlin/jvm/functions/Function0;", "setOnCollapseClick", "(Lkotlin/jvm/functions/Function0;)V", "onCollapseClick", "H", "getOnCancelEditClick", "setOnCancelEditClick", "onCancelEditClick", "I", "getOnSimDescContainerClick", "setOnSimDescContainerClick", "onSimDescContainerClick", "J", "getOnSimBetHistoryContainerClick", "setOnSimBetHistoryContainerClick", "onSimBetHistoryContainerClick", "K", "getOnAutoBetClick", "setOnAutoBetClick", "onAutoBetClick", "L", "getOnRemoveAllClick", "setOnRemoveAllClick", "onRemoveAllClick", "M", "getOnLoginClick", "setOnLoginClick", "onLoginClick", "N", "getOnRegisterClick", "setOnRegisterClick", "onRegisterClick", "O", "getOnSinglesClick", "setOnSinglesClick", "onSinglesClick", "P", "getOnMultipleClick", "setOnMultipleClick", "onMultipleClick", "Q", "getOnSystemClick", "setOnSystemClick", "onSystemClick", "R", "getOnBetSettingsClick", "setOnBetSettingsClick", "onBetSettingsClick", "Lkotlin/Function1;", "Lcz3;", "S", "Lkotlin/jvm/functions/Function1;", "getOnBetSlipTypeChanged", "()Lkotlin/jvm/functions/Function1;", "setOnBetSlipTypeChanged", "(Lkotlin/jvm/functions/Function1;)V", "onBetSlipTypeChanged", "T", "isInsureSelected", "setInsureSelected", "Landroidx/compose/ui/platform/ComposeView;", "getBetSlipTypeDropdown", "()Landroidx/compose/ui/platform/ComposeView;", "betSlipTypeDropdown", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BetSlipHeader extends ConstraintLayout {
    public static final /* synthetic */ int U = 0;
    public final ogd0 F;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Function0<Unit> onCollapseClick;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public Function0<Unit> onCancelEditClick;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public Function0<Unit> onSimDescContainerClick;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public Function0<Unit> onSimBetHistoryContainerClick;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public Function0<Unit> onAutoBetClick;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public Function0<Unit> onRemoveAllClick;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public Function0<Unit> onLoginClick;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public Function0<Unit> onRegisterClick;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public Function0<Unit> onSinglesClick;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public Function0<Unit> onMultipleClick;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public Function0<Unit> onSystemClick;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public Function0<Unit> onBetSettingsClick;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public Function1<? super cz3, Unit> onBetSlipTypeChanged;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public Function0<Boolean> isInsureSelected;

    public static final class a implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ BetSlipHeader b;

        public a(cq40 cq40Var, BetSlipHeader betSlipHeader) {
            this.a = cq40Var;
            this.b = betSlipHeader;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 500) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            Function0<Unit> onAutoBetClick = this.b.getOnAutoBetClick();
            if (onAutoBetClick != null) {
                onAutoBetClick.invoke();
            }
        }
    }

    public static final class b implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ BetSlipHeader b;

        public b(cq40 cq40Var, BetSlipHeader betSlipHeader) {
            this.a = cq40Var;
            this.b = betSlipHeader;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 500) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            Function0<Unit> onRemoveAllClick = this.b.getOnRemoveAllClick();
            if (onRemoveAllClick != null) {
                onRemoveAllClick.invoke();
            }
        }
    }

    public static final class c implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ BetSlipHeader b;

        public c(cq40 cq40Var, BetSlipHeader betSlipHeader) {
            this.a = cq40Var;
            this.b = betSlipHeader;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 500) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            Function0<Unit> onRemoveAllClick = this.b.getOnRemoveAllClick();
            if (onRemoveAllClick != null) {
                onRemoveAllClick.invoke();
            }
        }
    }

    public static final class d implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ BetSlipHeader b;

        public d(cq40 cq40Var, BetSlipHeader betSlipHeader) {
            this.a = cq40Var;
            this.b = betSlipHeader;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 500) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            Function0<Unit> onBetSettingsClick = this.b.getOnBetSettingsClick();
            if (onBetSettingsClick != null) {
                onBetSettingsClick.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:88:0x02c5 A[PHI: r2
      0x02c5: PHI (r2v2 int) = 
      (r2v1 int)
      (r2v4 int)
      (r2v5 int)
      (r2v6 int)
      (r2v7 int)
      (r2v8 int)
      (r2v9 int)
      (r2v10 int)
      (r2v11 int)
      (r2v12 int)
      (r2v13 int)
      (r2v14 int)
      (r2v15 int)
      (r2v16 int)
      (r2v17 int)
      (r2v18 int)
     binds: [B:3:0x0023, B:5:0x002f, B:7:0x003b, B:9:0x0046, B:11:0x0052, B:13:0x005e, B:15:0x006a, B:17:0x0076, B:19:0x0082, B:21:0x008d, B:23:0x0096, B:25:0x00a3, B:27:0x00b0, B:29:0x00bd, B:31:0x00ca, B:33:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    public BetSlipHeader(Context context, AttributeSet attributeSet, int i) throws Throwable {
        Throwable th;
        super(context, attributeSet, i);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_betslip_header, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.auto_bet_btn;
        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.auto_bet_btn, viewInflate);
        if (linearLayout != null) {
            i2 = R.id.bet_settings;
            ImageView imageView = (ImageView) h5e.a(R.id.bet_settings, viewInflate);
            if (imageView != null) {
                i2 = R.id.bet_settings_flag;
                ImageView imageView2 = (ImageView) h5e.a(R.id.bet_settings_flag, viewInflate);
                if (imageView2 != null) {
                    i2 = R.id.betslip_label;
                    if (((TextView) h5e.a(R.id.betslip_label, viewInflate)) != null) {
                        i2 = R.id.betslip_num;
                        TextView textView = (TextView) h5e.a(R.id.betslip_num, viewInflate);
                        if (textView != null) {
                            i2 = R.id.betslip_type_dropdown;
                            ComposeView composeView = (ComposeView) h5e.a(R.id.betslip_type_dropdown, viewInflate);
                            if (composeView != null) {
                                i2 = R.id.cancel_edit;
                                TextView textView2 = (TextView) h5e.a(R.id.cancel_edit, viewInflate);
                                if (textView2 != null) {
                                    i2 = R.id.cash;
                                    TextView textView3 = (TextView) h5e.a(R.id.cash, viewInflate);
                                    if (textView3 != null) {
                                        i2 = R.id.collapse_icon;
                                        ImageButton imageButton = (ImageButton) h5e.a(R.id.collapse_icon, viewInflate);
                                        if (imageButton != null) {
                                            i2 = R.id.collapse_icon_container;
                                            if (((LinearLayout) h5e.a(R.id.collapse_icon_container, viewInflate)) != null) {
                                                i2 = R.id.divide_line;
                                                View viewA = h5e.a(R.id.divide_line, viewInflate);
                                                if (viewA != null) {
                                                    i2 = R.id.how_to_play_image;
                                                    ImageView imageView3 = (ImageView) h5e.a(R.id.how_to_play_image, viewInflate);
                                                    if (imageView3 != null) {
                                                        i2 = R.id.how_to_play_text;
                                                        TextView textView4 = (TextView) h5e.a(R.id.how_to_play_text, viewInflate);
                                                        if (textView4 != null) {
                                                            i2 = R.id.login;
                                                            TextView textView5 = (TextView) h5e.a(R.id.login, viewInflate);
                                                            if (textView5 != null) {
                                                                i2 = R.id.multiple;
                                                                Button button = (Button) h5e.a(R.id.multiple, viewInflate);
                                                                if (button != null) {
                                                                    i2 = R.id.real2sim_switch;
                                                                    View viewA2 = h5e.a(R.id.real2sim_switch, viewInflate);
                                                                    if (viewA2 != null) {
                                                                        CardView cardView = (CardView) viewA2;
                                                                        th = null;
                                                                        int i3 = R.id.real2sim_switch_container;
                                                                        if (((ConstraintLayout) h5e.a(R.id.real2sim_switch_container, viewA2)) != null) {
                                                                            TextView textView6 = (TextView) h5e.a(R.id.real_switch_btn, viewA2);
                                                                            if (textView6 != null) {
                                                                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) h5e.a(R.id.shimmerView, viewA2);
                                                                                if (shimmerFrameLayout != null) {
                                                                                    TextView textView7 = (TextView) h5e.a(R.id.sim_switch_btn, viewA2);
                                                                                    if (textView7 != null) {
                                                                                        int i4 = R.id.txt_real;
                                                                                        if (((TextView) h5e.a(R.id.txt_real, viewA2)) != null) {
                                                                                            i4 = R.id.txt_sim;
                                                                                            if (((TextView) h5e.a(R.id.txt_sim, viewA2)) != null) {
                                                                                                etr etrVar = new etr(cardView, textView6, shimmerFrameLayout, textView7);
                                                                                                i2 = R.id.register;
                                                                                                TextView textView8 = (TextView) h5e.a(R.id.register, viewInflate);
                                                                                                if (textView8 != null) {
                                                                                                    i2 = R.id.remove_all;
                                                                                                    ImageView imageView4 = (ImageView) h5e.a(R.id.remove_all, viewInflate);
                                                                                                    if (imageView4 != null) {
                                                                                                        i2 = R.id.remove_container;
                                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.remove_container, viewInflate);
                                                                                                        if (constraintLayout != null) {
                                                                                                            i2 = R.id.settings_divide_line;
                                                                                                            View viewA3 = h5e.a(R.id.settings_divide_line, viewInflate);
                                                                                                            if (viewA3 != null) {
                                                                                                                i2 = R.id.sim_bet_history_container;
                                                                                                                LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.sim_bet_history_container, viewInflate);
                                                                                                                if (linearLayout2 != null) {
                                                                                                                    i2 = R.id.sim_bet_history_hint;
                                                                                                                    ImageView imageView5 = (ImageView) h5e.a(R.id.sim_bet_history_hint, viewInflate);
                                                                                                                    if (imageView5 != null) {
                                                                                                                        i2 = R.id.sim_bet_history_img;
                                                                                                                        ImageView imageView6 = (ImageView) h5e.a(R.id.sim_bet_history_img, viewInflate);
                                                                                                                        if (imageView6 != null) {
                                                                                                                            i2 = R.id.sim_bet_history_txt;
                                                                                                                            TextView textView9 = (TextView) h5e.a(R.id.sim_bet_history_txt, viewInflate);
                                                                                                                            if (textView9 != null) {
                                                                                                                                i2 = R.id.sim_desc_and_games_container;
                                                                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.sim_desc_and_games_container, viewInflate);
                                                                                                                                if (constraintLayout2 != null) {
                                                                                                                                    i2 = R.id.sim_desc_container;
                                                                                                                                    LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.sim_desc_container, viewInflate);
                                                                                                                                    if (linearLayout3 != null) {
                                                                                                                                        i2 = R.id.sim_notify_badge;
                                                                                                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.sim_notify_badge, viewInflate);
                                                                                                                                        if (appCompatImageView != null) {
                                                                                                                                            i2 = R.id.sim_remove_all;
                                                                                                                                            LinearLayout linearLayout4 = (LinearLayout) h5e.a(R.id.sim_remove_all, viewInflate);
                                                                                                                                            if (linearLayout4 != null) {
                                                                                                                                                i2 = R.id.sim_remove_all_img;
                                                                                                                                                ImageView imageView7 = (ImageView) h5e.a(R.id.sim_remove_all_img, viewInflate);
                                                                                                                                                if (imageView7 != null) {
                                                                                                                                                    i2 = R.id.sim_remove_all_tv;
                                                                                                                                                    TextView textView10 = (TextView) h5e.a(R.id.sim_remove_all_tv, viewInflate);
                                                                                                                                                    if (textView10 != null) {
                                                                                                                                                        i2 = R.id.singles;
                                                                                                                                                        Button button2 = (Button) h5e.a(R.id.singles, viewInflate);
                                                                                                                                                        if (button2 != null) {
                                                                                                                                                            i2 = R.id.system;
                                                                                                                                                            Button button3 = (Button) h5e.a(R.id.system, viewInflate);
                                                                                                                                                            if (button3 != null) {
                                                                                                                                                                i2 = R.id.type_container;
                                                                                                                                                                LinearLayout linearLayout5 = (LinearLayout) h5e.a(R.id.type_container, viewInflate);
                                                                                                                                                                if (linearLayout5 != null) {
                                                                                                                                                                    this.F = new ogd0((ConstraintLayout) viewInflate, linearLayout, imageView, imageView2, textView, composeView, textView2, textView3, imageButton, viewA, imageView3, textView4, textView5, button, etrVar, textView8, imageView4, constraintLayout, viewA3, linearLayout2, imageView5, imageView6, textView9, constraintLayout2, linearLayout3, appCompatImageView, linearLayout4, imageView7, textView10, button2, button3, linearLayout5);
                                                                                                                                                                    imageButton.setOnClickListener(new View.OnClickListener() { // from class: f43
                                                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                                                        public final void onClick(View view) {
                                                                                                                                                                            Function0<Unit> function0 = this.a.onCollapseClick;
                                                                                                                                                                            if (function0 != null) {
                                                                                                                                                                                function0.invoke();
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: g43
                                                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                                                        public final void onClick(View view) {
                                                                                                                                                                            Function0<Unit> function0 = this.a.onCancelEditClick;
                                                                                                                                                                            if (function0 != null) {
                                                                                                                                                                                function0.invoke();
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                    linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: h43
                                                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                                                        public final void onClick(View view) {
                                                                                                                                                                            Function0<Unit> function0 = this.a.onSimDescContainerClick;
                                                                                                                                                                            if (function0 != null) {
                                                                                                                                                                                function0.invoke();
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                    linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: i43
                                                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                                                        public final void onClick(View view) {
                                                                                                                                                                            Function0<Unit> function0 = this.a.onSimBetHistoryContainerClick;
                                                                                                                                                                            if (function0 != null) {
                                                                                                                                                                                function0.invoke();
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                    linearLayout.setOnClickListener(new a(new cq40(), this));
                                                                                                                                                                    imageView4.setOnClickListener(new b(new cq40(), this));
                                                                                                                                                                    linearLayout4.setOnClickListener(new c(new cq40(), this));
                                                                                                                                                                    textView5.setOnClickListener(new View.OnClickListener() { // from class: j43
                                                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                                                        public final void onClick(View view) {
                                                                                                                                                                            Function0<Unit> function0 = this.a.onLoginClick;
                                                                                                                                                                            if (function0 != null) {
                                                                                                                                                                                function0.invoke();
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                    textView8.setOnClickListener(new View.OnClickListener() { // from class: k43
                                                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                                                        public final void onClick(View view) {
                                                                                                                                                                            Function0<Unit> function0 = this.a.onRegisterClick;
                                                                                                                                                                            if (function0 != null) {
                                                                                                                                                                                function0.invoke();
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                    button2.setOnClickListener(new View.OnClickListener() { // from class: l43
                                                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                                                        public final void onClick(View view) {
                                                                                                                                                                            Function0<Unit> function0 = this.a.onSinglesClick;
                                                                                                                                                                            if (function0 != null) {
                                                                                                                                                                                function0.invoke();
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                    button.setOnClickListener(new m43(this, 0));
                                                                                                                                                                    button3.setOnClickListener(new n43(this, 0));
                                                                                                                                                                    imageView.setOnClickListener(new d(new cq40(), this));
                                                                                                                                                                    composeView.setViewCompositionStrategy(u6i0.b.a);
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
                                                                                        i3 = i4;
                                                                                    } else {
                                                                                        i3 = R.id.sim_switch_btn;
                                                                                    }
                                                                                } else {
                                                                                    i3 = R.id.shimmerView;
                                                                                }
                                                                            } else {
                                                                                i3 = R.id.real_switch_btn;
                                                                            }
                                                                        }
                                                                        bmy.a("Missing required view with ID: ".concat(viewA2.getResources().getResourceName(i3)));
                                                                        throw null;
                                                                    }
                                                                    th = null;
                                                                } else {
                                                                    th = null;
                                                                }
                                                            } else {
                                                                th = null;
                                                            }
                                                        } else {
                                                            th = null;
                                                        }
                                                    } else {
                                                        th = null;
                                                    }
                                                } else {
                                                    th = null;
                                                }
                                            } else {
                                                th = null;
                                            }
                                        } else {
                                            th = null;
                                        }
                                    } else {
                                        th = null;
                                    }
                                } else {
                                    th = null;
                                }
                            } else {
                                th = null;
                            }
                        } else {
                            th = null;
                        }
                    } else {
                        th = null;
                    }
                } else {
                    th = null;
                }
            } else {
                th = null;
            }
        } else {
            th = null;
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw th;
    }

    public final void E() {
        int size = ((ArrayList) iu2.d()).size();
        ogd0 ogd0Var = this.F;
        if (size > 15) {
            ogd0Var.S.setEnabled(false);
            ogd0Var.S.setPaintFlags(16);
        } else {
            ogd0Var.S.setEnabled(true);
            ogd0Var.S.setPaintFlags(0);
        }
    }

    public final void F(boolean z) {
        ogd0 ogd0Var = this.F;
        ogd0Var.A.setVisibility(z ? 0 : 8);
        ogd0Var.D.setVisibility(z ? 0 : 8);
        ogd0Var.w.setVisibility(z ? 0 : 8);
    }

    public final void G(boolean z) {
        this.F.d.setVisibility(z ? 0 : 8);
    }

    public final ComposeView getBetSlipTypeDropdown() {
        return this.F.f;
    }

    public final Function0<Unit> getOnAutoBetClick() {
        return this.onAutoBetClick;
    }

    public final Function0<Unit> getOnBetSettingsClick() {
        return this.onBetSettingsClick;
    }

    public final Function1<cz3, Unit> getOnBetSlipTypeChanged() {
        return this.onBetSlipTypeChanged;
    }

    public final Function0<Unit> getOnCancelEditClick() {
        return this.onCancelEditClick;
    }

    public final Function0<Unit> getOnCollapseClick() {
        return this.onCollapseClick;
    }

    public final Function0<Unit> getOnLoginClick() {
        return this.onLoginClick;
    }

    public final Function0<Unit> getOnMultipleClick() {
        return this.onMultipleClick;
    }

    public final Function0<Unit> getOnRegisterClick() {
        return this.onRegisterClick;
    }

    public final Function0<Unit> getOnRemoveAllClick() {
        return this.onRemoveAllClick;
    }

    public final Function0<Unit> getOnSimBetHistoryContainerClick() {
        return this.onSimBetHistoryContainerClick;
    }

    public final Function0<Unit> getOnSimDescContainerClick() {
        return this.onSimDescContainerClick;
    }

    public final Function0<Unit> getOnSinglesClick() {
        return this.onSinglesClick;
    }

    public final Function0<Unit> getOnSystemClick() {
        return this.onSystemClick;
    }

    public final boolean getSettingNewFlagVisible() {
        return this.F.d.getVisibility() == 0;
    }

    public final void setAccountInfo(Account account) {
        String str = account != null ? account.name : null;
        ogd0 ogd0Var = this.F;
        if (str != null) {
            String str2 = account.name;
            str2.getClass();
            if (str2.length() != 0) {
                F(false);
                TextView textView = ogd0Var.v;
                k53 k53VarC = iu2.c();
                k53VarC.getClass();
                textView.setVisibility(kotlin.collections.b.k(k53.REAL, k53.SIM).contains(k53VarC) ? 0 : 8);
                TextView textView2 = ogd0Var.i;
                k53 k53VarC2 = iu2.c();
                k53VarC2.getClass();
                textView2.setVisibility(kotlin.collections.a.c(k53.EDIT).contains(k53VarC2) ? 0 : 8);
                return;
            }
        }
        ogd0Var.v.setVisibility(8);
        ogd0Var.i.setVisibility(8);
        F(true);
    }

    public final void setAutoBetButtonVisible(q43 betSlipHeaderState, boolean isVisible) {
        ogd0 ogd0Var = this.F;
        ogd0Var.G.setVisibility((isVisible && (betSlipHeaderState == q43.b || betSlipHeaderState == q43.c)) ? 0 : 8);
        ogd0Var.b.setVisibility(isVisible ? 0 : 8);
    }

    public final void setBetBonusHintCount() {
        this.F.e.setText(String.valueOf(iw2.a()));
    }

    public final void setBetHistoryButtonEnabled(boolean enabled, boolean isLogin) {
        ogd0 ogd0Var = this.F;
        ogd0Var.H.setEnabled(!isLogin || enabled);
        int i = enabled ? R.color.text_type2_primary : R.color.text_type1_secondary;
        ogd0Var.K.setTextColor(getContext().getColor(i));
        ogd0Var.J.setColorFilter(new PorterDuffColorFilter(getContext().getColor(i), PorterDuff.Mode.SRC_IN));
    }

    public final void setBetSlipCashText(String text) {
        text.getClass();
        this.F.v.setText(text);
    }

    public final void setBetSlipHeaderState(q43 state) {
        androidx.constraintlayout.widget.b bVar;
        if (state == null) {
            return;
        }
        setRemoveContainerVisibility(state);
        ogd0 ogd0Var = this.F;
        ComposeView composeView = ogd0Var.f;
        ConstraintLayout constraintLayout = ogd0Var.a;
        AppCompatImageView appCompatImageView = ogd0Var.N;
        TextView textView = ogd0Var.e;
        View view = ogd0Var.G;
        LinearLayout linearLayout = ogd0Var.b;
        ConstraintLayout constraintLayout2 = ogd0Var.F;
        ComposeView composeView2 = ogd0Var.f;
        final cz3 cz3Var = cz3.STANDARD;
        cz3 cz3Var2 = cz3.SIMPLE;
        final List listK = kotlin.collections.b.k(cz3Var, cz3Var2);
        q43 q43Var = q43.c;
        if (state == q43Var) {
            cz3Var = cz3Var2;
        } else if (state != q43.b) {
            cz3Var = null;
        }
        final Function0<Boolean> function0 = this.isInsureSelected;
        final o43 o43Var = new o43(this, 0);
        listK.getClass();
        composeView.setContent(new op8(-1124797124, new Function2() { // from class: dz3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final List list = listK;
                    final cz3 cz3Var3 = cz3Var;
                    final Function0 function1 = function0;
                    final o43 o43Var2 = o43Var;
                    scv.b(null, null, null, pp8.b(-1540261104, new Function2() { // from class: ez3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                mz3.a(null, a4h.b(list), cz3Var3, function1, o43Var2, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 3072, 7);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        ogd0Var.T.setVisibility((!iw2.g() || ((ArrayList) iu2.d()).size() <= 1 || state == q43Var) ? 8 : 0);
        ogd0Var.C.a.setVisibility((state == q43Var || iu2.k() || !SimShareData.INSTANCE.isSimulatedActive()) ? 8 : 0);
        if (state == q43Var) {
            ogd0Var.L.setVisibility(8);
            appCompatImageView.setVisibility(8);
        } else {
            appCompatImageView.setVisibility(iw2.c() ? 0 : 8);
        }
        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
        bVar2.f(constraintLayout2);
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            composeView2.setVisibility(8);
            bVar2.A(view.getId(), 8);
            bVar2.e(linearLayout.getId(), 7);
            bVar2.g(linearLayout.getId(), 6, 0, 6);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                uhc.a();
                return;
            }
            composeView2.setVisibility(0);
            bVar2.A(view.getId(), 0);
            bVar2.e(linearLayout.getId(), 6);
            bVar2.h(linearLayout.getId(), 7, view.getId(), 6, zch0.a(getContext(), 4));
        }
        bVar2.b(constraintLayout2);
        androidx.constraintlayout.widget.b bVar3 = new androidx.constraintlayout.widget.b();
        bVar3.f(constraintLayout);
        bVar3.A(composeView2.getId(), state != q43.a ? 0 : 8);
        bVar3.e(composeView2.getId(), 6);
        bVar3.e(composeView2.getId(), 3);
        bVar3.e(composeView2.getId(), 4);
        bVar3.l(composeView2.getId(), -2);
        bVar3.i(composeView2.getId(), -2);
        int iOrdinal2 = state.ordinal();
        if (iOrdinal2 == 1) {
            bVar = bVar3;
            bVar.g(composeView2.getId(), 3, constraintLayout2.getId(), 3);
            bVar.g(composeView2.getId(), 4, constraintLayout2.getId(), 4);
            bVar.h(composeView2.getId(), 6, 0, 6, zch0.a(getContext(), 16));
        } else if (iOrdinal2 != 2) {
            bVar3.g(composeView2.getId(), 3, constraintLayout2.getId(), 3);
            bVar3.g(composeView2.getId(), 6, 0, 6);
            bVar = bVar3;
        } else {
            bVar3.g(composeView2.getId(), 3, textView.getId(), 3);
            bVar3.g(composeView2.getId(), 4, textView.getId(), 4);
            bVar3.h(composeView2.getId(), 6, textView.getId(), 7, zch0.a(getContext(), 4));
            bVar = bVar3;
        }
        bVar.b(constraintLayout);
    }

    public final void setBetSlipNumberBackground(Drawable background) {
        this.F.e.setBackground(background);
    }

    public final void setBetSlipNumberText(String text) {
        text.getClass();
        this.F.e.setText(text);
    }

    public final void setBetSlipNumberTextColor(int color) {
        this.F.e.setTextColor(color);
    }

    public final void setDisplayTypeMenuVisibility(boolean isSupported, q43 currentBetSlipHeaderState) {
        this.F.T.setVisibility((!isSupported || ((ArrayList) iu2.d()).size() <= 1 || currentBetSlipHeaderState == q43.c) ? 8 : 0);
    }

    public final void setInsureSelected(Function0<Boolean> function0) {
        this.isInsureSelected = function0;
    }

    public final void setOnAutoBetClick(Function0<Unit> function0) {
        this.onAutoBetClick = function0;
    }

    public final void setOnBetSettingsClick(Function0<Unit> function0) {
        this.onBetSettingsClick = function0;
    }

    public final void setOnBetSlipTypeChanged(Function1<? super cz3, Unit> function1) {
        this.onBetSlipTypeChanged = function1;
    }

    public final void setOnCancelEditClick(Function0<Unit> function0) {
        this.onCancelEditClick = function0;
    }

    public final void setOnCollapseClick(Function0<Unit> function0) {
        this.onCollapseClick = function0;
    }

    public final void setOnLoginClick(Function0<Unit> function0) {
        this.onLoginClick = function0;
    }

    public final void setOnMultipleClick(Function0<Unit> function0) {
        this.onMultipleClick = function0;
    }

    public final void setOnRegisterClick(Function0<Unit> function0) {
        this.onRegisterClick = function0;
    }

    public final void setOnRemoveAllClick(Function0<Unit> function0) {
        this.onRemoveAllClick = function0;
    }

    public final void setOnSimBetHistoryContainerClick(Function0<Unit> function0) {
        this.onSimBetHistoryContainerClick = function0;
    }

    public final void setOnSimDescContainerClick(Function0<Unit> function0) {
        this.onSimDescContainerClick = function0;
    }

    public final void setOnSinglesClick(Function0<Unit> function0) {
        this.onSinglesClick = function0;
    }

    public final void setOnSystemClick(Function0<Unit> function0) {
        this.onSystemClick = function0;
    }

    public final void setRemoveAllBtnEnabled(boolean enabled) {
        ogd0 ogd0Var = this.F;
        ogd0Var.E.setEnabled(enabled || !iu2.p());
        ogd0Var.O.setEnabled(enabled);
        int i = enabled ? R.color.text_type2_primary : R.color.text_type1_secondary;
        ImageView imageView = ogd0Var.E;
        int color = getContext().getColor(i);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        ogd0Var.Q.setTextColor(getContext().getColor(i));
        ogd0Var.P.setColorFilter(new PorterDuffColorFilter(getContext().getColor(i), mode));
    }

    public final void setRemoveContainerVisibility(q43 currentBetSlipHeaderState) {
        int i;
        ConstraintLayout constraintLayout = this.F.F;
        k53 k53VarC = iu2.c();
        k53VarC.getClass();
        if (!kotlin.collections.b.k(k53.REAL, k53.SIM).contains(k53VarC) || (!iu2.p() && ((ArrayList) iu2.d()).isEmpty())) {
            i = currentBetSlipHeaderState == q43.b ? 4 : 8;
        } else {
            i = 0;
        }
        constraintLayout.setVisibility(i);
    }

    public final void setSelectTab(int betType) {
        ogd0 ogd0Var = this.F;
        ogd0Var.R.setSelected(betType == 1);
        ogd0Var.B.setSelected(betType == 2);
        ogd0Var.S.setSelected(betType == 3);
    }

    public final void setSimBetHistoryHintVisible(boolean isVisible) {
        this.F.I.setVisibility(isVisible ? 0 : 8);
    }

    public final void setSimButtonsEnabled(boolean enabled, boolean isLogin) {
        ogd0 ogd0Var = this.F;
        ogd0Var.M.setEnabled(enabled);
        setBetHistoryButtonEnabled(enabled && isLogin, isLogin);
        setRemoveAllBtnEnabled(enabled);
        int i = enabled ? R.color.text_type2_primary : R.color.text_type1_secondary;
        ogd0Var.z.setTextColor(getContext().getColor(i));
        ogd0Var.y.setColorFilter(new PorterDuffColorFilter(getContext().getColor(i), PorterDuff.Mode.SRC_IN));
    }

    public final void setSimDescAndGamesContainerVisible(boolean isVisible) {
        this.F.L.setVisibility(isVisible ? 0 : 8);
    }

    public final void setSimNotifyBadgeVisible(boolean isVisible) {
        this.F.N.setVisibility(isVisible ? 0 : 8);
    }

    public final void setSimRemoveAllVisible(boolean isVisible) {
        ogd0 ogd0Var = this.F;
        ogd0Var.O.setVisibility(isVisible ? 0 : 8);
        ogd0Var.E.setVisibility(isVisible ? 8 : 0);
    }

    public final void setSinglesCompoundDrawable(Drawable drawableLeft, Drawable drawableTop, Drawable drawableRight, Drawable drawableBottom) {
        this.F.R.setCompoundDrawablesWithIntrinsicBounds(drawableLeft, drawableTop, drawableRight, drawableBottom);
    }

    public final void setStrikeThruFlag() {
        ogd0 ogd0Var = this.F;
        ogd0Var.B.setEnabled(false);
        ogd0Var.B.setPaintFlags(16);
        Button button = ogd0Var.S;
        button.setEnabled(false);
        button.setPaintFlags(16);
    }

    public final void setSwitchRealToSim(boolean isSim, boolean isBetSlipSimple) {
        ogd0 ogd0Var = this.F;
        if (isBetSlipSimple) {
            ogd0Var.C.a.setVisibility(8);
            return;
        }
        ogd0Var.C.b.setVisibility(!isSim ? 0 : 8);
        ogd0Var.C.d.setVisibility(isSim ? 0 : 8);
        ogd0Var.L.setVisibility(isSim ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetSlipHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetSlipHeader(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ BetSlipHeader(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
