package com.sportybet.plugin.realsports.event.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.sportyfm.ui.widget.RadioPlaybackMiniPanel;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import defpackage.atd;
import defpackage.bmy;
import defpackage.did0;
import defpackage.gks;
import defpackage.h5e;
import defpackage.jks;
import defpackage.mkg;
import defpackage.psm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0012R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/sportybet/plugin/realsports/event/widget/LiveEventControlsHeaderView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "streamUrl", "", "setRadioStreamUrl", "(Ljava/lang/String;)V", "", "activated", "setStreamingActivated", "(Z)V", "setMatchTrackerActivated", "setStatsActivated", "setGamesActivated", "Lpsm;", "c", "Lpsm;", "getCountryManager", "()Lpsm;", "setCountryManager", "(Lpsm;)V", "countryManager", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LiveEventControlsHeaderView extends Hilt_LiveEventControlsHeaderView {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public psm countryManager;
    public mkg d;
    public final did0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveEventControlsHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((jks) generatedComponent()).L(this);
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_live_event_controls_header, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.games;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.games, viewInflate);
        if (appCompatImageView != null) {
            i2 = R.id.match_tracker;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.match_tracker, viewInflate);
            if (appCompatImageView2 != null) {
                i2 = R.id.radioPlaybackPanel;
                RadioPlaybackMiniPanel radioPlaybackMiniPanel = (RadioPlaybackMiniPanel) h5e.a(R.id.radioPlaybackPanel, viewInflate);
                if (radioPlaybackMiniPanel != null) {
                    i2 = R.id.stats;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.stats, viewInflate);
                    if (appCompatImageView3 != null) {
                        i2 = R.id.streaming;
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.streaming, viewInflate);
                        if (appCompatImageView4 != null) {
                            this.e = new did0((ConstraintLayout) viewInflate, appCompatImageView, appCompatImageView2, radioPlaybackMiniPanel, appCompatImageView3, appCompatImageView4);
                            return;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(Event event) {
        did0 did0Var = this.e;
        AppCompatImageView appCompatImageView = did0Var.c;
        AppCompatImageView appCompatImageView2 = did0Var.f;
        AppCompatImageView appCompatImageView3 = did0Var.e;
        appCompatImageView.setOnClickListener(new atd(this, 1 == true ? 1 : 0));
        AppCompatImageView appCompatImageView4 = did0Var.c;
        int i = 0;
        appCompatImageView4.setVisibility(event.showLiveTracker() ? 0 : 8);
        appCompatImageView3.setOnClickListener(new gks(this, i));
        appCompatImageView3.setVisibility(event.showStats() ? 0 : 8);
        if (event.hasLiveStream()) {
            appCompatImageView2.setVisibility(0);
            mkg mkgVar = this.d;
            appCompatImageView2.setActivated(mkgVar != null && mkgVar.a.l0);
        } else {
            appCompatImageView2.setVisibility(8);
        }
        mkg mkgVar2 = this.d;
        appCompatImageView4.setActivated(mkgVar2 != null && mkgVar2.a.n0);
        mkg mkgVar3 = this.d;
        appCompatImageView3.setActivated(mkgVar3 != null && mkgVar3.a.m0);
        AppCompatImageView appCompatImageView5 = did0Var.b;
        mkg mkgVar4 = this.d;
        appCompatImageView5.setActivated(mkgVar4 != null && mkgVar4.a.o0);
    }

    public final psm getCountryManager() {
        psm psmVar = this.countryManager;
        if (psmVar != null) {
            return psmVar;
        }
        Intrinsics.n("countryManager");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.e.b.setImageResource(getCountryManager().t());
    }

    public final void setCountryManager(psm psmVar) {
        psmVar.getClass();
        this.countryManager = psmVar;
    }

    public final void setGamesActivated(boolean activated) {
        this.e.b.setActivated(activated);
    }

    public final void setMatchTrackerActivated(boolean activated) {
        this.e.c.setActivated(activated);
    }

    public final void setRadioStreamUrl(String streamUrl) {
        streamUrl.getClass();
        did0 did0Var = this.e;
        did0Var.d.setVisibility(0);
        did0Var.d.setStreamURL(streamUrl);
    }

    public final void setStatsActivated(boolean activated) {
        this.e.e.setActivated(activated);
    }

    public final void setStreamingActivated(boolean activated) {
        this.e.f.setActivated(activated);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveEventControlsHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    public /* synthetic */ LiveEventControlsHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveEventControlsHeaderView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }
}
