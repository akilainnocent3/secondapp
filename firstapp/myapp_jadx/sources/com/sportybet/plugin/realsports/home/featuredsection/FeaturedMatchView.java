package com.sportybet.plugin.realsports.home.featuredsection;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.format.DateUtils;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.FeaturedMatch;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.event.LiveTimerTextView;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedMatchView;
import com.sportybet.plugin.realsports.home.featuredsection.a;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import com.sportybet.plugin.realsports.widget.OutcomeView;
import defpackage.apg;
import defpackage.bgh;
import defpackage.bwf0;
import defpackage.c0d;
import defpackage.cgh;
import defpackage.e6f0;
import defpackage.ej5;
import defpackage.f00;
import defpackage.gbn;
import defpackage.gug0;
import defpackage.hkd;
import defpackage.hwr;
import defpackage.ib5;
import defpackage.iu2;
import defpackage.jvd0;
import defpackage.kuh;
import defpackage.lfb0;
import defpackage.lfh;
import defpackage.mfb0;
import defpackage.mlk;
import defpackage.mpe0;
import defpackage.nfh;
import defpackage.nkd0;
import defpackage.ofh;
import defpackage.q5n;
import defpackage.qfh;
import defpackage.rfh;
import defpackage.saj;
import defpackage.sn5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vfh;
import defpackage.vgb0;
import defpackage.wfh;
import defpackage.xeh;
import defpackage.y5b;
import defpackage.yeh;
import defpackage.z7z;
import defpackage.zch0;
import defpackage.zeh;
import defpackage.zi50;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0017\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u001bR\u001d\u0010$\u001a\u0004\u0018\u00010 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b\"\u0010#R\u001d\u0010)\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\t\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\t\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\t\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/sportybet/plugin/realsports/home/featuredsection/FeaturedMatchView;", "Landroid/widget/FrameLayout;", "Liu2$b;", "Lcom/sportybet/plugin/realsports/widget/OutcomeView;", "", "setOb2NullButton", "(Lcom/sportybet/plugin/realsports/widget/OutcomeView;)V", "Lzeh;", "d", "Lttr;", "getBinding", "()Lzeh;", "binding", "Lgbn;", "e", "getImageService", "()Lgbn;", "imageService", "Llfb0;", "kotlin.jvm.PlatformType", "f", "getSportRepo", "()Llfb0;", "sportRepo", "", "i", "getDp16", "()I", "dp16", "v", "getSpace", "space", "Landroid/content/res/ColorStateList;", "w", "getOutcomeViewTextColor", "()Landroid/content/res/ColorStateList;", "outcomeViewTextColor", "Landroid/graphics/drawable/Drawable;", "y", "getIcInfo", "()Landroid/graphics/drawable/Drawable;", "icInfo", "Lyeh;", "z", "getPopupBinding", "()Lyeh;", "popupBinding", "Landroidx/constraintlayout/widget/b;", "F", "getSet", "()Landroidx/constraintlayout/widget/b;", "set", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FeaturedMatchView extends FrameLayout implements iu2.b {
    public static final /* synthetic */ int G = 0;
    public PopupWindow A;
    public jvd0 B;
    public e6f0 C;
    public e6f0 D;
    public boolean E;
    public final mpe0 F;
    public final Context a;
    public final boolean b;
    public final xeh c;
    public final mpe0 d;
    public final mpe0 e;
    public final mpe0 f;
    public final mpe0 i;
    public final mpe0 v;
    public final mpe0 w;
    public final mpe0 y;
    public final mpe0 z;

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class a extends saj implements Function2<String, v5b, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, v5b v5bVar) {
            String str2 = str;
            v5b v5bVar2 = v5bVar;
            str2.getClass();
            v5bVar2.getClass();
            FeaturedMatchView featuredMatchView = (FeaturedMatchView) this.receiver;
            int i = FeaturedMatchView.G;
            featuredMatchView.c(str2, v5bVar2);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class b extends saj implements Function2<String, v5b, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, v5b v5bVar) {
            String str2 = str;
            v5b v5bVar2 = v5bVar;
            str2.getClass();
            v5bVar2.getClass();
            FeaturedMatchView featuredMatchView = (FeaturedMatchView) this.receiver;
            int i = FeaturedMatchView.G;
            featuredMatchView.b(str2, v5bVar2);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportybet.plugin.realsports.home.featuredsection.FeaturedMatchView$showPopupInfo$1$1", f = "FeaturedMatchView.kt", l = {450}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return FeaturedMatchView.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(3000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            PopupWindow popupWindow = FeaturedMatchView.this.A;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedMatchView(Context context, boolean z, xeh xehVar) {
        super(context, null, 0);
        context.getClass();
        xehVar.getClass();
        int i = 0;
        this.a = context;
        this.b = z;
        this.c = xehVar;
        this.d = hwr.b(new Function0() { // from class: kfh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = FeaturedMatchView.G;
                FeaturedMatchView featuredMatchView = this.a;
                View viewInflate = LayoutInflater.from(featuredMatchView.getContext()).inflate(R.layout.featured_match_item, (ViewGroup) featuredMatchView, false);
                featuredMatchView.addView(viewInflate);
                int i3 = R.id.divider;
                View viewA = h5e.a(R.id.divider, viewInflate);
                if (viewA != null) {
                    i3 = R.id.group_live;
                    Group group = (Group) h5e.a(R.id.group_live, viewInflate);
                    if (group != null) {
                        i3 = R.id.group_prematch;
                        Group group2 = (Group) h5e.a(R.id.group_prematch, viewInflate);
                        if (group2 != null) {
                            i3 = R.id.guideline_away;
                            if (((Guideline) h5e.a(R.id.guideline_away, viewInflate)) != null) {
                                i3 = R.id.guideline_home;
                                if (((Guideline) h5e.a(R.id.guideline_home, viewInflate)) != null) {
                                    i3 = R.id.img_best_odds;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.img_best_odds, viewInflate);
                                    if (appCompatImageView != null) {
                                        i3 = R.id.img_hot;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.img_hot, viewInflate);
                                        if (appCompatImageView2 != null) {
                                            i3 = R.id.img_live_boost;
                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.img_live_boost, viewInflate);
                                            if (appCompatImageView3 != null) {
                                                i3 = R.id.img_sim;
                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.img_sim, viewInflate);
                                                if (appCompatImageView4 != null) {
                                                    i3 = R.id.img_sporty_fm;
                                                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) h5e.a(R.id.img_sporty_fm, viewInflate);
                                                    if (appCompatImageView5 != null) {
                                                        i3 = R.id.img_sporty_gift;
                                                        AppCompatImageView appCompatImageView6 = (AppCompatImageView) h5e.a(R.id.img_sporty_gift, viewInflate);
                                                        if (appCompatImageView6 != null) {
                                                            i3 = R.id.img_sporty_tv;
                                                            AppCompatImageView appCompatImageView7 = (AppCompatImageView) h5e.a(R.id.img_sporty_tv, viewInflate);
                                                            if (appCompatImageView7 != null) {
                                                                i3 = R.id.img_stats;
                                                                AppCompatImageView appCompatImageView8 = (AppCompatImageView) h5e.a(R.id.img_stats, viewInflate);
                                                                if (appCompatImageView8 != null) {
                                                                    i3 = R.id.img_team_away;
                                                                    AppCompatImageView appCompatImageView9 = (AppCompatImageView) h5e.a(R.id.img_team_away, viewInflate);
                                                                    if (appCompatImageView9 != null) {
                                                                        i3 = R.id.img_team_home;
                                                                        AppCompatImageView appCompatImageView10 = (AppCompatImageView) h5e.a(R.id.img_team_home, viewInflate);
                                                                        if (appCompatImageView10 != null) {
                                                                            i3 = R.id.league;
                                                                            TextView textView = (TextView) h5e.a(R.id.league, viewInflate);
                                                                            if (textView != null) {
                                                                                i3 = R.id.live_score;
                                                                                TextView textView2 = (TextView) h5e.a(R.id.live_score, viewInflate);
                                                                                if (textView2 != null) {
                                                                                    i3 = R.id.live_tag;
                                                                                    if (((TextView) h5e.a(R.id.live_tag, viewInflate)) != null) {
                                                                                        i3 = R.id.live_time;
                                                                                        LiveTimerTextView liveTimerTextView = (LiveTimerTextView) h5e.a(R.id.live_time, viewInflate);
                                                                                        if (liveTimerTextView != null) {
                                                                                            i3 = R.id.market_desc;
                                                                                            TextView textView3 = (TextView) h5e.a(R.id.market_desc, viewInflate);
                                                                                            if (textView3 != null) {
                                                                                                i3 = R.id.ov1;
                                                                                                OutcomeView outcomeView = (OutcomeView) h5e.a(R.id.ov1, viewInflate);
                                                                                                if (outcomeView != null) {
                                                                                                    i3 = R.id.ov2;
                                                                                                    OutcomeView outcomeView2 = (OutcomeView) h5e.a(R.id.ov2, viewInflate);
                                                                                                    if (outcomeView2 != null) {
                                                                                                        i3 = R.id.ov3;
                                                                                                        OutcomeView outcomeView3 = (OutcomeView) h5e.a(R.id.ov3, viewInflate);
                                                                                                        if (outcomeView3 != null) {
                                                                                                            i3 = R.id.prematch_date;
                                                                                                            TextView textView4 = (TextView) h5e.a(R.id.prematch_date, viewInflate);
                                                                                                            if (textView4 != null) {
                                                                                                                i3 = R.id.prematch_time;
                                                                                                                TextView textView5 = (TextView) h5e.a(R.id.prematch_time, viewInflate);
                                                                                                                if (textView5 != null) {
                                                                                                                    i3 = R.id.see_details;
                                                                                                                    TextView textView6 = (TextView) h5e.a(R.id.see_details, viewInflate);
                                                                                                                    if (textView6 != null) {
                                                                                                                        i3 = R.id.team_away;
                                                                                                                        TextView textView7 = (TextView) h5e.a(R.id.team_away, viewInflate);
                                                                                                                        if (textView7 != null) {
                                                                                                                            i3 = R.id.team_home;
                                                                                                                            TextView textView8 = (TextView) h5e.a(R.id.team_home, viewInflate);
                                                                                                                            if (textView8 != null) {
                                                                                                                                return new zeh((ConstraintLayout) viewInflate, viewA, group, group2, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, appCompatImageView7, appCompatImageView8, appCompatImageView9, appCompatImageView10, textView, textView2, liveTimerTextView, textView3, outcomeView, outcomeView2, outcomeView3, textView4, textView5, textView6, textView7, textView8);
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
            }
        });
        this.e = hwr.b(new bgh(0));
        this.f = hwr.b(new cgh());
        this.i = hwr.b(new lfh(this, 0));
        this.v = hwr.b(new Function0() { // from class: mfh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(this.a.a.getResources().getDimensionPixelSize(R.dimen.featured_match_odds_padding));
            }
        });
        this.w = hwr.b(new nfh(this, 0));
        this.y = hwr.b(new ofh(this, 0));
        this.z = hwr.b(new Function0() { // from class: pfh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                View viewInflate = LayoutInflater.from(this.a.a).inflate(R.layout.featured_match_info_popup, (ViewGroup) null, false);
                if (viewInflate != null) {
                    return new yeh((TextView) viewInflate);
                }
                bmy.a("rootView");
                return null;
            }
        });
        this.F = hwr.b(new qfh());
        iu2.a(this);
        final zeh binding = getBinding();
        binding.a.setOnClickListener(new rfh(this, 0));
        if (z) {
            binding.M.setOnClickListener(new View.OnClickListener() { // from class: ufh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Event event;
                    int i2 = FeaturedMatchView.G;
                    Object tag = binding.a.getTag();
                    if (!(tag instanceof FeaturedMatch)) {
                        tag = null;
                    }
                    FeaturedMatch featuredMatch = (FeaturedMatch) tag;
                    if (featuredMatch == null || (event = featuredMatch.getEvent()) == null) {
                        return;
                    }
                    this.c.m(event, a.b.a);
                }
            });
        }
        vfh vfhVar = new vfh(this, i);
        wfh wfhVar = new wfh(this, i);
        binding.D.setOnClickListener(new View.OnClickListener() { // from class: xfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = FeaturedMatchView.G;
                Object tag = view.getTag();
                if (!(tag instanceof Event)) {
                    tag = null;
                }
                Event event = (Event) tag;
                if (event == null) {
                    return;
                }
                this.a.c.l(event);
            }
        });
        binding.G.setOnClickListener(new View.OnClickListener() { // from class: yfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = FeaturedMatchView.G;
                Object tag = view.getTag();
                if (!(tag instanceof String)) {
                    tag = null;
                }
                String str = (String) tag;
                if (str == null || StringsKt.U(str)) {
                    return;
                }
                FeaturedMatchView featuredMatchView = this.a;
                featuredMatchView.c.r(str, featuredMatchView.A != null ? new FeaturedMatchView.a(2, featuredMatchView, FeaturedMatchView.class, "showPopupInfo", "showPopupInfo(Ljava/lang/String;Lkotlinx/coroutines/CoroutineScope;)V", 0) : new FeaturedMatchView.b(2, featuredMatchView, FeaturedMatchView.class, "initInfoPopup", "initInfoPopup(Ljava/lang/String;Lkotlinx/coroutines/CoroutineScope;)V", 0));
            }
        });
        for (final OutcomeView outcomeView : kotlin.collections.b.k(binding.H, binding.I, binding.J)) {
            outcomeView.getClass();
            outcomeView.setTextSize(13.0f);
            outcomeView.setTextColor(getOutcomeViewTextColor());
            outcomeView.setLeftPadding(getSpace(), 0, 0, 0);
            outcomeView.setRightPadding(0, 0, getSpace(), 0);
            outcomeView.setOnClickListener(new View.OnClickListener() { // from class: zfh
                /* JADX WARN: Code duplicated, block: B:24:0x0073  */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = FeaturedMatchView.G;
                    f00 f00Var = vgb0.a;
                    vgb0.a("Home_RecommendMatch");
                    OutcomeView outcomeView2 = outcomeView;
                    outcomeView2.setChecked(!outcomeView2.com.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_IS_CHECKED java.lang.String);
                    Object tag = outcomeView2.getTag();
                    if (!(tag instanceof Selection)) {
                        tag = null;
                    }
                    Selection selection = (Selection) tag;
                    if (selection != null) {
                        FeaturedMatchView featuredMatchView = this;
                        xeh xehVar2 = featuredMatchView.c;
                        Context context2 = featuredMatchView.a;
                        xehVar2.d(selection, outcomeView2.com.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_IS_CHECKED java.lang.String);
                        Event event = selection.a;
                        if (!iu2.t(event, selection.b, selection.c, outcomeView2.com.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_IS_CHECKED java.lang.String, false, null, 16368)) {
                            outcomeView2.setChecked(false);
                            if (kni0.m()) {
                                iu2.r(context2);
                            } else if (iu2.l()) {
                                qz3.p(context2);
                            } else if (iu2.f(selection)) {
                                qz3.m(context2);
                            } else {
                                event.getClass();
                                if (iu2.g(event)) {
                                    qz3.m(context2);
                                } else if (iu2.h(event, selection.b, selection.c)) {
                                    qz3.o(context2);
                                }
                            }
                        }
                        if (iu2.p() && outcomeView2.com.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_IS_CHECKED java.lang.String && !iu2.o(selection)) {
                            iu2.e(context2, selection);
                        }
                    }
                }
            });
        }
        binding.y.setOnClickListener(new View.OnClickListener() { // from class: agh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Event event;
                int i2 = FeaturedMatchView.G;
                Object tag = binding.a.getTag();
                if (!(tag instanceof FeaturedMatch)) {
                    tag = null;
                }
                FeaturedMatch featuredMatch = (FeaturedMatch) tag;
                if (featuredMatch == null || (event = featuredMatch.getEvent()) == null) {
                    return;
                }
                this.c.c(event);
            }
        });
        binding.O.setOnClickListener(vfhVar);
        binding.C.setOnClickListener(vfhVar);
        binding.N.setOnClickListener(wfhVar);
        binding.B.setOnClickListener(wfhVar);
    }

    private final zeh getBinding() {
        Object value = this.d.getValue();
        value.getClass();
        return (zeh) value;
    }

    private final int getDp16() {
        return ((Number) this.i.getValue()).intValue();
    }

    private final Drawable getIcInfo() {
        return (Drawable) this.y.getValue();
    }

    private final gbn getImageService() {
        return (gbn) this.e.getValue();
    }

    private final ColorStateList getOutcomeViewTextColor() {
        return (ColorStateList) this.w.getValue();
    }

    private final yeh getPopupBinding() {
        return (yeh) this.z.getValue();
    }

    private final androidx.constraintlayout.widget.b getSet() {
        return (androidx.constraintlayout.widget.b) this.F.getValue();
    }

    private final int getSpace() {
        return ((Number) this.v.getValue()).intValue();
    }

    private final lfb0 getSportRepo() {
        return (lfb0) this.f.getValue();
    }

    private final void setOb2NullButton(OutcomeView outcomeView) {
        outcomeView.setTag(null);
        outcomeView.getOb2().setTextOnAndOff(zch0.h(outcomeView.getContext()));
        outcomeView.setChecked(false);
        outcomeView.setEnabled(false);
    }

    @Override // iu2.a
    public final void C() {
        zeh binding = getBinding();
        for (OutcomeView outcomeView : kotlin.collections.b.k(binding.H, binding.I, binding.J)) {
            if (outcomeView.getTag() instanceof Selection) {
                Object tag = outcomeView.getTag();
                tag.getClass();
                Selection selection = (Selection) tag;
                Event event = selection.a;
                event.getClass();
                Market market = selection.b;
                market.getClass();
                Outcome outcome = selection.c;
                outcome.getClass();
                outcomeView.setChecked(iu2.n(event, market, outcome));
            }
        }
    }

    public final void b(String str, v5b v5bVar) {
        PopupWindow popupWindow = new PopupWindow(getPopupBinding().a, -2, -2);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(-1));
        popupWindow.setElevation(4.0f);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: tfh
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                jvd0 jvd0Var = this.a.B;
                if (jvd0Var != null) {
                    jvd0Var.cancel((CancellationException) null);
                }
            }
        });
        this.A = popupWindow;
        c(str, v5bVar);
    }

    public final void c(String str, v5b v5bVar) {
        TextView textView = getPopupBinding().a;
        textView.setText(str);
        textView.measure(0, 0);
        int width = (getBinding().G.getWidth() - textView.getMeasuredWidth()) / 2;
        int i = -(textView.getMeasuredHeight() + getBinding().G.getHeight());
        PopupWindow popupWindow = this.A;
        if (popupWindow != null) {
            popupWindow.showAsDropDown(getBinding().G, width, i);
        }
        jvd0 jvd0Var = this.B;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.B = ej5.c(v5bVar, null, null, new c(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:185:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:190:0x0416  */
    public final void a(FeaturedMatch featuredMatch) {
        Object bVar;
        Object bVar2;
        int i;
        zeh binding = getBinding();
        final Event event = featuredMatch.getEvent();
        Date date = new Date(event.estimateStartTime);
        mfb0 mfb0VarE = getSportRepo().e(event.sport.id);
        if (mfb0VarE == null) {
            return;
        }
        ConstraintLayout constraintLayout = binding.a;
        OutcomeView outcomeView = binding.H;
        TextView textView = binding.E;
        TextView textView2 = binding.D;
        AppCompatImageView appCompatImageView = binding.A;
        AppCompatImageView appCompatImageView2 = binding.y;
        AppCompatImageView appCompatImageView3 = binding.f;
        AppCompatImageView appCompatImageView4 = binding.e;
        AppCompatImageView appCompatImageView5 = binding.i;
        AppCompatImageView appCompatImageView6 = binding.v;
        OutcomeView outcomeView2 = binding.J;
        OutcomeView outcomeView3 = binding.I;
        TextView textView3 = binding.N;
        TextView textView4 = binding.O;
        AppCompatImageView appCompatImageView7 = binding.B;
        AppCompatImageView appCompatImageView8 = binding.C;
        constraintLayout.setTag(featuredMatch);
        boolean zIsTeamPagesEnabled = featuredMatch.isTeamPagesEnabled();
        this.E = zIsTeamPagesEnabled;
        String str = event.homeTeamId;
        String str2 = str != null ? str : "";
        String str3 = event.homeTeamName;
        if (str3 == null) {
            str3 = "";
        }
        Sport sport = event.sport;
        this.C = new e6f0(str2, str3, sport != null ? sport.id : null);
        String str4 = event.awayTeamId;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = event.awayTeamName;
        if (str5 == null) {
            str5 = "";
        }
        this.D = new e6f0(str4, str5, sport != null ? sport.id : null);
        textView4.setEnabled(zIsTeamPagesEnabled);
        textView4.setClickable(this.E);
        appCompatImageView8.setEnabled(this.E);
        appCompatImageView8.setClickable(this.E);
        textView3.setEnabled(this.E);
        textView3.setClickable(this.E);
        appCompatImageView7.setEnabled(this.E);
        appCompatImageView7.setClickable(this.E);
        Context context = this.a;
        appCompatImageView6.setImageDrawable(gug0.e(context));
        appCompatImageView6.setVisibility(nkd0.a.a.a(event) ? 0 : 8);
        Context context2 = constraintLayout.getContext();
        context2.getClass();
        appCompatImageView5.setImageDrawable(gug0.a(context2));
        appCompatImageView5.setVisibility((featuredMatch.getShowBoost() && ((i = event.status) == 1 || i == 2)) ? 0 : 8);
        appCompatImageView4.setImageDrawable(gug0.b(context));
        appCompatImageView4.setVisibility((event.oddsBoost && event.status == 0) ? 0 : 8);
        appCompatImageView3.setImageDrawable(gug0.f(context));
        appCompatImageView3.setVisibility(event.topTeam ? 0 : 8);
        binding.z.setVisibility(event.hasLiveStream() ? 0 : 8);
        binding.w.setVisibility(event.hasAudioStream() ? 0 : 8);
        appCompatImageView2.setVisibility(event.hasGift() ? 0 : 8);
        if (appCompatImageView2.getVisibility() == 0) {
            LinkedHashSet linkedHashSet = mlk.a;
            String str6 = event.eventId;
            str6.getClass();
            if (mlk.b(str6)) {
                f00 f00Var = vgb0.a;
                vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_SHOWN);
            }
        }
        appCompatImageView.setVisibility(event.showStats() ? 0 : 8);
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: sfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c.a(event);
            }
        });
        textView2.setTag(featuredMatch.getEvent());
        try {
            zi50.a aVar = zi50.b;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            UnderlineSpan underlineSpan = new UnderlineSpan();
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) apg.h(event));
            spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
            bVar = spannableStringBuilder;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        boolean z = bVar instanceof zi50.b;
        Object obj = bVar;
        if (z) {
            obj = null;
        }
        textView2.setText((CharSequence) obj);
        String str7 = event.homeTeamIcon;
        if (str7 != null && !StringsKt.U(str7)) {
            getImageService().e(event.homeTeamIcon, appCompatImageView8, R.drawable.ic_default_league_logo_home, R.drawable.ic_default_league_logo_home);
            appCompatImageView8.setVisibility(0);
        } else if (featuredMatch.getDisplayDefaultIcon()) {
            appCompatImageView8.setImageResource(R.drawable.ic_default_league_logo_home);
            appCompatImageView8.setVisibility(0);
        } else {
            appCompatImageView8.setVisibility(8);
        }
        String str8 = event.awayTeamIcon;
        if (str8 != null && !StringsKt.U(str8)) {
            getImageService().e(event.awayTeamIcon, appCompatImageView7, R.drawable.ic_default_league_logo_away, R.drawable.ic_default_league_logo_away);
            appCompatImageView7.setVisibility(0);
        } else if (featuredMatch.getDisplayDefaultIcon()) {
            appCompatImageView7.setImageResource(R.drawable.ic_default_league_logo_away);
            appCompatImageView7.setVisibility(0);
        } else {
            appCompatImageView7.setVisibility(8);
        }
        androidx.constraintlayout.widget.b set = getSet();
        set.f(constraintLayout);
        String str9 = event.homeTeamIcon;
        set.o(R.id.team_home).e.y = (str9 == null || StringsKt.U(str9)) && !featuredMatch.getDisplayDefaultIcon() ? 0.4f : 0.55f;
        String str10 = event.awayTeamIcon;
        set.o(R.id.team_away).e.y = (str10 == null || StringsKt.U(str10)) && !featuredMatch.getDisplayDefaultIcon() ? 0.4f : 0.55f;
        set.b(constraintLayout);
        textView4.setText(event.homeTeamName);
        textView3.setText(event.awayTeamName);
        if (event.status == 0) {
            binding.L.setText(bwf0.u(date));
            boolean zIsToday = DateUtils.isToday(event.estimateStartTime);
            TextView textView5 = binding.K;
            if (zIsToday) {
                sn5.f(textView5, R.string.common_dates__today, new Object[0]);
            } else {
                Locale locale = Locale.US;
                locale.getClass();
                textView5.setText(bwf0.l(date, "dd/MM", locale, 0, 0));
            }
        } else {
            binding.F.setText(mfb0VarE.p(event.playedSeconds, event.remainingTimeInPeriod, event.matchStatus));
            String str11 = event.setScore;
            if (str11 != null) {
                List listSplit$default = StringsKt__StringsKt.split$default(str11, new String[]{":"}, false, 0, 6, null);
                try {
                    bVar2 = listSplit$default.get(0) + iKBWavCysVP.zHCVwtEHVnplc + listSplit$default.get(1);
                } catch (Throwable th2) {
                    zi50.a aVar3 = zi50.b;
                    bVar2 = new zi50.b(th2);
                }
                if (bVar2 instanceof zi50.b) {
                    bVar2 = null;
                }
                textView.setText((CharSequence) bVar2);
            } else {
                textView.setText("");
            }
        }
        binding.c.setVisibility(event.status != 0 ? 0 : 8);
        binding.d.setVisibility(event.status == 0 ? 0 : 8);
        String marketDescMain = featuredMatch.getMarketDescMain();
        String marketDescSub = featuredMatch.getMarketDescSub();
        TextView textView6 = getBinding().G;
        textView6.setTag(marketDescSub);
        textView6.setText(marketDescMain);
        textView6.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, StringsKt.U(marketDescSub) ? null : getIcInfo(), (Drawable) null);
        textView6.setPadding(StringsKt.U(marketDescSub) ? 0 : getDp16(), 0, 0, 0);
        TextView textView7 = binding.M;
        if (this.b) {
            textView7.setVisibility(0);
            outcomeView.setVisibility(8);
            outcomeView3.setVisibility(8);
            outcomeView2.setVisibility(8);
            return;
        }
        textView7.setVisibility(8);
        int i2 = 0;
        for (Object obj2 : featuredMatch.getMarketTitles().size() == 2 ? kotlin.collections.b.k(outcomeView, outcomeView2, outcomeView3) : kotlin.collections.b.k(outcomeView, outcomeView3, outcomeView2)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            OutcomeView outcomeView4 = (OutcomeView) obj2;
            outcomeView4.getClass();
            Market market = featuredMatch.getMarket();
            List<String> marketTitles = featuredMatch.getMarketTitles();
            q5n q5nVar = outcomeView4.Q;
            if (q5nVar != null) {
                q5nVar.a();
            }
            outcomeView4.Q = null;
            if (outcomeView4.T) {
                outcomeView4.T = false;
                outcomeView4.S = false;
                outcomeView4.G();
            }
            outcomeView4.setVisibility(i2 <= kotlin.collections.b.j(marketTitles) ? 0 : 8);
            if (outcomeView4.getVisibility() == 0) {
                if (i2 <= marketTitles.size() - 1) {
                    outcomeView4.getOb1().setTextOnAndOff(marketTitles.get(i2));
                }
                if (market.status == 0) {
                    List<Outcome> list = market.outcomes;
                    list.getClass();
                    if (i2 > list.size() - 1) {
                        setOb2NullButton(outcomeView4);
                    } else {
                        Outcome outcome = market.outcomes.get(i2);
                        if (outcome.isActive != 0) {
                            String str12 = outcome.odds;
                            str12.getClass();
                            if (StringsKt.U(str12)) {
                                setOb2NullButton(outcomeView4);
                            } else {
                                OutcomeButton ob2 = outcomeView4.getOb2();
                                String str13 = outcome.odds;
                                str13.getClass();
                                ob2.setOdds(str13);
                                outcomeView4.setTag(new Selection(event, market, outcome));
                                outcomeView4.setChecked(iu2.n(event, market, outcome));
                                outcomeView4.setEnabled(true);
                                int i4 = outcome.flag;
                                if (i4 == 1) {
                                    outcomeView4.getOb2().g();
                                    outcome.flag = 0;
                                } else if (i4 != 2) {
                                    outcomeView4.E();
                                } else {
                                    outcomeView4.getOb2().c();
                                    outcome.flag = 0;
                                }
                                xeh xehVar = this.c;
                                z7z z7zVarG = xehVar.g(event, market, outcome);
                                String str14 = outcome.odds;
                                str14.getClass();
                                kuh.d(outcomeView4, z7zVarG, str14, null, false, 56);
                                xehVar.f(event, market, z7zVarG);
                            }
                        } else {
                            setOb2NullButton(outcomeView4);
                        }
                    }
                } else {
                    setOb2NullButton(outcomeView4);
                }
            }
            i2 = i3;
        }
    }
}
