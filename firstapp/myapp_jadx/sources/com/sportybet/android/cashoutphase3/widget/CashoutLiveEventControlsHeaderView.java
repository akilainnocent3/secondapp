package com.sportybet.android.cashoutphase3.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sporty.android.book.domain.entity.EventSource;
import com.sporty.android.book.domain.entity.SourceType;
import com.sporty.android.core.model.cashout.EventInfoTrackingWidgetEnabledConfigs;
import com.sportybet.android.cashoutphase3.widget.CashoutLiveEventControlsHeaderView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.BetSelection;
import defpackage.b3;
import defpackage.bmy;
import defpackage.c8i0;
import defpackage.h5e;
import defpackage.ich;
import defpackage.ils;
import defpackage.jhd0;
import defpackage.kgb0;
import defpackage.mfb0;
import defpackage.nkd0;
import defpackage.pp6;
import defpackage.psm;
import defpackage.qp6;
import defpackage.uhc;
import defpackage.y8j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u00015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/sportybet/android/cashoutphase3/widget/CashoutLiveEventControlsHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/sporty/android/core/model/cashout/EventInfoTrackingWidgetEnabledConfigs;", "configs", "", "setEventInfoTrackingWidgetEnabledConfigs", "(Lcom/sporty/android/core/model/cashout/EventInfoTrackingWidgetEnabledConfigs;)V", "Lcom/sportybet/plugin/realsports/data/BetSelection;", "selection", "Lmfb0;", "rule", "setUpdateSelection", "(Lcom/sportybet/plugin/realsports/data/BetSelection;Lmfb0;)V", "Lcom/sportybet/android/cashoutphase3/widget/CashoutLiveEventControlsHeaderView$a;", "K", "Lcom/sportybet/android/cashoutphase3/widget/CashoutLiveEventControlsHeaderView$a;", "getCallback", "()Lcom/sportybet/android/cashoutphase3/widget/CashoutLiveEventControlsHeaderView$a;", "setCallback", "(Lcom/sportybet/android/cashoutphase3/widget/CashoutLiveEventControlsHeaderView$a;)V", "callback", "Lpsm;", "L", "Lpsm;", "getCountryManager", "()Lpsm;", "setCountryManager", "(Lpsm;)V", "countryManager", "Ly8j;", "M", "Ly8j;", "getFullStoryCommonManager", "()Ly8j;", "setFullStoryCommonManager", "(Ly8j;)V", "fullStoryCommonManager", "Lich;", "N", "Lich;", "getFeatureHintShownCache", "()Lich;", "setFeatureHintShownCache", "(Lich;)V", "featureHintShownCache", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CashoutLiveEventControlsHeaderView extends Hilt_CashoutLiveEventControlsHeaderView {
    public static final /* synthetic */ int O = 0;
    public final jhd0 H;
    public ils I;
    public EventInfoTrackingWidgetEnabledConfigs J;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public a callback;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public psm countryManager;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public y8j fullStoryCommonManager;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ich featureHintShownCache;

    public interface a {
        void a(boolean z);

        void b();

        void c(boolean z);

        void d(boolean z);

        void e(boolean z);
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ils.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ils ilsVar = ils.NONE;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ils ilsVar2 = ils.NONE;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ils ilsVar3 = ils.NONE;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ils ilsVar4 = ils.NONE;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[SourceType.values().length];
            try {
                iArr2[SourceType.BET_RADAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SourceType.BET_GENIUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashoutLiveEventControlsHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.spr_cashout_live_event_controls_header, this);
        int i2 = R.id.games;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.games, this);
        if (appCompatImageView != null) {
            i2 = R.id.live_event_indicator;
            ImageView imageView = (ImageView) h5e.a(R.id.live_event_indicator, this);
            if (imageView != null) {
                i2 = R.id.live_event_widgets_red_dot;
                View viewA = h5e.a(R.id.live_event_widgets_red_dot, this);
                if (viewA != null) {
                    i2 = R.id.live_match_tracker;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.live_match_tracker, this);
                    if (appCompatImageView2 != null) {
                        i2 = R.id.stats;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.stats, this);
                        if (appCompatImageView3 != null) {
                            i2 = R.id.streaming;
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.streaming, this);
                            if (appCompatImageView4 != null) {
                                this.H = new jhd0(this, appCompatImageView, imageView, viewA, appCompatImageView2, appCompatImageView3, appCompatImageView4);
                                this.I = ils.NONE;
                                appCompatImageView4.setOnClickListener(new View.OnClickListener() { // from class: op6
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i3 = CashoutLiveEventControlsHeaderView.O;
                                        this.a.H(ils.STREAMING);
                                    }
                                });
                                appCompatImageView3.setOnClickListener(new pp6(this, 0));
                                appCompatImageView2.setOnClickListener(new qp6(this, 0));
                                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: rp6
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i3 = CashoutLiveEventControlsHeaderView.O;
                                        this.a.H(ils.GAMES);
                                    }
                                });
                                return;
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final boolean E(BetSelection betSelection, mfb0 mfb0Var) {
        EventInfoTrackingWidgetEnabledConfigs eventInfoTrackingWidgetEnabledConfigs;
        EventSource eventSource;
        SourceType sourceType;
        if (mfb0Var == null || (eventInfoTrackingWidgetEnabledConfigs = this.J) == null || !eventInfoTrackingWidgetEnabledConfigs.getLiveMatchTrackerWidgetDisplayEnabled()) {
            return false;
        }
        if (b3.S(betSelection.eventId)) {
            return mfb0Var.u() && !betSelection.matchTrackerNotAllowed;
        }
        if (!betSelection.isLive() || (eventSource = betSelection.eventSource) == null || (sourceType = eventSource.getSourceType(true)) == null) {
            return false;
        }
        int i = b.a[sourceType.ordinal()];
        if (i == 1) {
            return mfb0Var.u();
        }
        if (i != 2) {
            return false;
        }
        return kgb0.i(betSelection.sportId);
    }

    public final boolean F(BetSelection betSelection, mfb0 mfb0Var) {
        EventInfoTrackingWidgetEnabledConfigs eventInfoTrackingWidgetEnabledConfigs;
        EventSource eventSource;
        SourceType sourceType;
        boolean zContains;
        if (mfb0Var != null && (eventInfoTrackingWidgetEnabledConfigs = this.J) != null && eventInfoTrackingWidgetEnabledConfigs.getStatsWidgetDisplayEnabled()) {
            if (b3.S(betSelection.eventId)) {
                nkd0 nkd0Var = nkd0.a.a;
                String str = betSelection.categoryId;
                nkd0Var.getClass();
                try {
                    zContains = nkd0Var.a.contains(str);
                } catch (Exception unused) {
                    zContains = false;
                }
                if (mfb0Var.e() && !zContains && !betSelection.matchTrackerNotAllowed) {
                    return true;
                }
            } else if (betSelection.isLive() && (eventSource = betSelection.eventSource) != null && (sourceType = eventSource.getSourceType(true)) != null && sourceType == SourceType.BET_RADAR) {
                return mfb0Var.e();
            }
        }
        return false;
    }

    public final boolean G(BetSelection betSelection) {
        EventInfoTrackingWidgetEnabledConfigs eventInfoTrackingWidgetEnabledConfigs;
        betSelection.getClass();
        return (betSelection.liveChannel || ((betSelection.socialMediaLiveChannel && betSelection.status == 0) || (betSelection.webViewLiveChannel && betSelection.status == 0))) && (eventInfoTrackingWidgetEnabledConfigs = this.J) != null && eventInfoTrackingWidgetEnabledConfigs.getStvWidgetDisplayEnabled() && betSelection.isLive();
    }

    public final void H(ils ilsVar) {
        if (ilsVar != ils.GAMES && !getFeatureHintShownCache().a("key_live_event_intro_need_show")) {
            getFeatureHintShownCache().b("key_live_event_intro_need_show");
            K();
            a aVar = this.callback;
            if (aVar != null) {
                aVar.b();
            }
        }
        ils ilsVar2 = this.I;
        if (ilsVar2 == ilsVar) {
            this.I = ils.NONE;
            I(ilsVar, false);
        } else {
            I(ilsVar2, false);
            this.I = ilsVar;
            I(ilsVar, true);
        }
    }

    public final void I(ils ilsVar, boolean z) {
        int iOrdinal = ilsVar.ordinal();
        if (iOrdinal != 0) {
            jhd0 jhd0Var = this.H;
            if (iOrdinal == 1) {
                jhd0Var.i.setActivated(z);
                J(jhd0Var.i, z);
                a aVar = this.callback;
                if (aVar != null) {
                    aVar.a(z);
                    return;
                }
                return;
            }
            if (iOrdinal == 2) {
                jhd0Var.f.setActivated(z);
                J(jhd0Var.f, z);
                a aVar2 = this.callback;
                if (aVar2 != null) {
                    aVar2.c(z);
                    return;
                }
                return;
            }
            if (iOrdinal == 3) {
                jhd0Var.e.setActivated(z);
                J(jhd0Var.e, z);
                a aVar3 = this.callback;
                if (aVar3 != null) {
                    aVar3.d(z);
                    return;
                }
                return;
            }
            if (iOrdinal != 4) {
                uhc.a();
                return;
            }
            jhd0Var.b.setActivated(z);
            J(jhd0Var.b, z);
            a aVar4 = this.callback;
            if (aVar4 != null) {
                aVar4.e(z);
            }
        }
    }

    public final void J(View view, boolean z) {
        jhd0 jhd0Var = this.H;
        if (!z) {
            jhd0Var.c.setVisibility(4);
            return;
        }
        ImageView imageView = jhd0Var.c;
        ImageView imageView2 = jhd0Var.c;
        imageView.setVisibility(0);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f(this);
        bVar.g(imageView2.getId(), 6, view.getId(), 6);
        bVar.g(imageView2.getId(), 7, view.getId(), 7);
        bVar.b(this);
    }

    public final void K() {
        jhd0 jhd0Var = this.H;
        c8i0.o(jhd0Var.d, (jhd0Var.i.getVisibility() == 0 || jhd0Var.e.getVisibility() == 0 || jhd0Var.f.getVisibility() == 0) && !getFeatureHintShownCache().a("key_live_event_intro_need_show"));
    }

    public final a getCallback() {
        return this.callback;
    }

    public final psm getCountryManager() {
        psm psmVar = this.countryManager;
        if (psmVar != null) {
            return psmVar;
        }
        Intrinsics.n("countryManager");
        throw null;
    }

    public final ich getFeatureHintShownCache() {
        ich ichVar = this.featureHintShownCache;
        if (ichVar != null) {
            return ichVar;
        }
        Intrinsics.n("featureHintShownCache");
        throw null;
    }

    public final y8j getFullStoryCommonManager() {
        y8j y8jVar = this.fullStoryCommonManager;
        if (y8jVar != null) {
            return y8jVar;
        }
        Intrinsics.n("fullStoryCommonManager");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.H.b.setImageResource(getCountryManager().t());
    }

    public final void setCallback(a aVar) {
        this.callback = aVar;
    }

    public final void setCountryManager(psm psmVar) {
        psmVar.getClass();
        this.countryManager = psmVar;
    }

    public final void setEventInfoTrackingWidgetEnabledConfigs(EventInfoTrackingWidgetEnabledConfigs configs) {
        this.J = configs;
    }

    public final void setFeatureHintShownCache(ich ichVar) {
        ichVar.getClass();
        this.featureHintShownCache = ichVar;
    }

    public final void setFullStoryCommonManager(y8j y8jVar) {
        y8jVar.getClass();
        this.fullStoryCommonManager = y8jVar;
    }

    public final void setUpdateSelection(BetSelection selection, mfb0 rule) {
        selection.getClass();
        jhd0 jhd0Var = this.H;
        c8i0.o(jhd0Var.i, G(selection));
        c8i0.o(jhd0Var.e, E(selection, rule));
        c8i0.o(jhd0Var.f, F(selection, rule));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashoutLiveEventControlsHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashoutLiveEventControlsHeaderView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ CashoutLiveEventControlsHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
