package com.sportybet.plugin.realsports.home.featuredsection;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.FeaturedMatch;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.PreCannedBBOutcome;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedMatchPCBBView;
import com.sportybet.plugin.realsports.home.featuredsection.a;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import defpackage.afh;
import defpackage.apg;
import defpackage.bfh;
import defpackage.bwf0;
import defpackage.dfh;
import defpackage.g4s;
import defpackage.g880;
import defpackage.ga20;
import defpackage.gl40;
import defpackage.gug0;
import defpackage.hl40;
import defpackage.ht3;
import defpackage.hwr;
import defpackage.igh;
import defpackage.il40;
import defpackage.iu2;
import defpackage.j7g;
import defpackage.lfb0;
import defpackage.mfb0;
import defpackage.mpe0;
import defpackage.nkd0;
import defpackage.qz3;
import defpackage.tug;
import defpackage.ulx;
import defpackage.xeh;
import defpackage.zch0;
import defpackage.zi50;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0012R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0005\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/sportybet/plugin/realsports/home/featuredsection/FeaturedMatchPCBBView;", "Landroid/widget/FrameLayout;", "Liu2$b;", "Ligh;", "d", "Lttr;", "getBinding", "()Ligh;", "binding", "Llfb0;", "kotlin.jvm.PlatformType", "e", "getSportRepo", "()Llfb0;", "sportRepo", "", "f", "getVsTextSizePx", "()I", "vsTextSizePx", "i", "getVsColor", "vsColor", "Lil40;", "w", "getFadeEdgeController", "()Lil40;", "fadeEdgeController", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FeaturedMatchPCBBView extends FrameLayout implements iu2.b {
    public static final /* synthetic */ int y = 0;
    public final Context a;
    public final boolean b;
    public final xeh c;
    public final mpe0 d;
    public final mpe0 e;
    public final mpe0 f;
    public final mpe0 i;
    public final ga20 v;
    public final mpe0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedMatchPCBBView(Context context, boolean z, FeaturedContainer featuredContainer) {
        super(context, null, 0);
        context.getClass();
        featuredContainer.getClass();
        this.a = context;
        this.b = z;
        this.c = featuredContainer;
        this.d = hwr.b(new afh(this, 0));
        this.e = hwr.b(new bfh());
        this.f = hwr.b(new ht3(this, 1));
        this.i = hwr.b(new Function0() { // from class: cfh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(this.a.a.getColor(R.color.text_secondary));
            }
        });
        ga20 ga20Var = new ga20();
        this.v = ga20Var;
        ulx ulxVar = new ulx();
        this.w = hwr.b(new dfh(this, 0));
        iu2.a(this);
        final igh binding = getBinding();
        binding.a.setOnClickListener(new View.OnClickListener() { // from class: efh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Event event;
                int i = FeaturedMatchPCBBView.y;
                Object tag = view.getTag();
                if (!(tag instanceof FeaturedMatch)) {
                    tag = null;
                }
                FeaturedMatch featuredMatch = (FeaturedMatch) tag;
                if (featuredMatch == null || (event = featuredMatch.getEvent()) == null) {
                    return;
                }
                this.a.c.m(event, a.C0430a.a);
            }
        });
        binding.z.setOnClickListener(new View.OnClickListener() { // from class: ffh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = FeaturedMatchPCBBView.y;
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
        binding.v.setOnClickListener(new View.OnClickListener() { // from class: gfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Event event;
                int i = FeaturedMatchPCBBView.y;
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
        binding.b.setOnClickListener(new View.OnClickListener() { // from class: hfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeaturedMatchPCBBView.c(binding, this);
            }
        });
        RecyclerView recyclerView = binding.B;
        recyclerView.setAdapter(ga20Var);
        recyclerView.setHasFixedSize(false);
        recyclerView.i(new g4s(context.getColor(R.color.border_secondary), zch0.b(getResources(), 1), zch0.b(getResources(), 3)));
        recyclerView.j(ulxVar);
        il40 fadeEdgeController = getFadeEdgeController();
        fadeEdgeController.a.k(new hl40(fadeEdgeController));
    }

    public static final il40 b(FeaturedMatchPCBBView featuredMatchPCBBView) {
        return new il40(featuredMatchPCBBView.getBinding().B, featuredMatchPCBBView.getBinding().D, featuredMatchPCBBView.getBinding().E);
    }

    public static final void c(igh ighVar, FeaturedMatchPCBBView featuredMatchPCBBView) {
        Object tag = ighVar.b.getTag();
        if (!(tag instanceof Selection)) {
            tag = null;
        }
        Selection selection = (Selection) tag;
        if (selection == null) {
            return;
        }
        Selection selectionP = g880.p(selection, iu2.d());
        if (selectionP != null && (selectionP.A || selectionP.z || selectionP.y)) {
            iu2.t(selection.a, selection.b, selection.c, false, true, null, 8160);
            featuredMatchPCBBView.getBinding().b.setChecked(false);
            return;
        }
        if (selectionP == null) {
            if (!iu2.f(selection)) {
                Event event = selection.a;
                event.getClass();
                if (!iu2.g(event)) {
                    boolean zT = iu2.t(selection.a, selection.b, selection.c, true, true, null, 8160);
                    featuredMatchPCBBView.getBinding().b.setChecked(zT);
                    if (zT) {
                        Object tag2 = featuredMatchPCBBView.getBinding().a.getTag();
                        FeaturedMatch featuredMatch = (FeaturedMatch) (tag2 instanceof FeaturedMatch ? tag2 : null);
                        if (featuredMatch != null) {
                            featuredMatchPCBBView.c.i(featuredMatch);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            qz3.m(featuredMatchPCBBView.a);
        }
    }

    private final igh getBinding() {
        Object value = this.d.getValue();
        value.getClass();
        return (igh) value;
    }

    private final il40 getFadeEdgeController() {
        return (il40) this.w.getValue();
    }

    private final lfb0 getSportRepo() {
        return (lfb0) this.e.getValue();
    }

    private final int getVsColor() {
        return ((Number) this.i.getValue()).intValue();
    }

    private final int getVsTextSizePx() {
        return ((Number) this.f.getValue()).intValue();
    }

    @Override // iu2.a
    public final void C() {
        Object tag = getBinding().b.getTag();
        if (!(tag instanceof Selection)) {
            tag = null;
        }
        Selection selection = (Selection) tag;
        if (selection == null) {
            return;
        }
        OutcomeButton outcomeButton = getBinding().b;
        Selection selectionP = g880.p(selection, iu2.d());
        outcomeButton.setChecked(selectionP != null && (selectionP.A || selectionP.z || selectionP.y));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(FeaturedMatch featuredMatch) {
        Object bVar;
        String str;
        String str2;
        String strA;
        List listSplit$default;
        Object bVar2;
        int i;
        igh binding = getBinding();
        final Event event = featuredMatch.getEvent();
        Date date = new Date(event.estimateStartTime);
        ConstraintLayout constraintLayout = binding.a;
        RecyclerView recyclerView = binding.B;
        TextView textView = binding.z;
        AppCompatImageView appCompatImageView = binding.y;
        AppCompatImageView appCompatImageView2 = binding.d;
        AppCompatImageView appCompatImageView3 = binding.c;
        AppCompatImageView appCompatImageView4 = binding.e;
        constraintLayout.setTag(featuredMatch);
        AppCompatImageView appCompatImageView5 = binding.f;
        Context context = this.a;
        appCompatImageView5.setImageDrawable(gug0.e(context));
        appCompatImageView5.setVisibility(nkd0.a.a.a(event) ? 0 : 8);
        Context context2 = binding.a.getContext();
        context2.getClass();
        appCompatImageView4.setImageDrawable(gug0.a(context2));
        appCompatImageView4.setVisibility((featuredMatch.getShowBoost() && ((i = event.status) == 1 || i == 2)) ? 0 : 8);
        appCompatImageView3.setImageDrawable(gug0.b(context));
        appCompatImageView3.setVisibility((event.oddsBoost && event.status == 0) ? 0 : 8);
        appCompatImageView2.setImageDrawable(gug0.f(context));
        appCompatImageView2.setVisibility(event.topTeam ? 0 : 8);
        binding.w.setVisibility(event.hasLiveStream() ? 0 : 8);
        binding.i.setVisibility(event.hasAudioStream() ? 0 : 8);
        binding.v.setVisibility(event.hasGift() ? 0 : 8);
        appCompatImageView.setVisibility(event.showStats() ? 0 : 8);
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: ifh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c.a(event);
            }
        });
        textView.setTag(featuredMatch.getEvent());
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
        textView.setText((CharSequence) obj);
        TextView textView2 = binding.C;
        j7g j7gVar = new j7g();
        String str3 = event.homeTeamName;
        if (str3 == null) {
            str3 = "";
        }
        j7gVar.d(str3, true);
        j7gVar.j("  vs  ", getVsColor(), getVsTextSizePx());
        String str4 = event.awayTeamName;
        if (str4 == null) {
            str4 = "";
        }
        j7gVar.d(str4, true);
        textView2.setText(j7gVar);
        TextView textView3 = binding.A;
        int i2 = event.status;
        String str5 = CaxEybC.bCqCir;
        if (i2 == 0) {
            String strU = bwf0.u(date);
            Locale locale = Locale.US;
            locale.getClass();
            strA = tug.a(strU, str5, bwf0.l(date, "dd/MM", locale, 0, 0));
        } else {
            lfb0 sportRepo = getSportRepo();
            Sport sport = event.sport;
            if (sport == null || (str = sport.id) == null) {
                str = "";
            }
            mfb0 mfb0VarE = sportRepo.e(str);
            String strP = mfb0VarE != null ? mfb0VarE.p(event.playedSeconds, event.remainingTimeInPeriod, event.matchStatus) : null;
            String str6 = strP == null ? "" : strP;
            String str7 = event.setScore;
            if (str7 == null || (listSplit$default = StringsKt__StringsKt.split$default(str7, new String[]{":"}, false, 0, 6, null)) == null) {
                str2 = null;
            } else {
                try {
                    bVar2 = listSplit$default.get(0) + " - " + listSplit$default.get(1);
                } catch (Throwable th2) {
                    zi50.a aVar3 = zi50.b;
                    bVar2 = new zi50.b(th2);
                }
                if (bVar2 instanceof zi50.b) {
                    bVar2 = null;
                }
                str2 = (String) bVar2;
            }
            String str8 = str2 != null ? str2 : "";
            strA = StringsKt.U(str8) ? str6 : tug.a(str8, str5, str6);
        }
        textView3.setText(strA);
        OutcomeButton outcomeButton = binding.b;
        if (this.b) {
            outcomeButton.setVisibility(8);
        } else {
            outcomeButton.setVisibility(0);
            Market market = featuredMatch.getMarket();
            OutcomeButton outcomeButton2 = getBinding().b;
            List<Outcome> list = market.outcomes;
            list.getClass();
            Outcome outcome = (Outcome) CollectionsKt.firstOrNull(list);
            if (outcome == null || market.status != 0 || outcome.isActive != 1 || TextUtils.isEmpty(outcome.odds)) {
                outcomeButton2.setTag(null);
                outcomeButton2.setTextOnAndOff(zch0.h(outcomeButton2.getContext()));
                outcomeButton2.setChecked(false);
                outcomeButton2.setEnabled(false);
            } else {
                String str9 = outcome.odds;
                str9.getClass();
                outcomeButton2.setOdds(str9);
                Selection selection = new Selection(apg.f(event), market, outcome);
                outcomeButton2.setTag(selection);
                Selection selectionP = g880.p(selection, iu2.d());
                outcomeButton2.setChecked(selectionP != null && (selectionP.A || selectionP.z || selectionP.y));
                outcomeButton2.setEnabled(true);
            }
        }
        List<Outcome> list2 = featuredMatch.getMarket().outcomes;
        list2.getClass();
        Outcome outcome2 = (Outcome) CollectionsKt.firstOrNull(list2);
        if (outcome2 == null) {
            recyclerView.setVisibility(8);
            getFadeEdgeController().a();
            return;
        }
        List<PreCannedBBOutcome> list3 = outcome2.childOutcomes;
        list3.getClass();
        ga20 ga20Var = this.v;
        ga20Var.getClass();
        ArrayList<PreCannedBBOutcome> arrayList = ga20Var.a;
        arrayList.clear();
        arrayList.addAll(list3);
        ga20Var.notifyDataSetChanged();
        recyclerView.setVisibility(0);
        il40 fadeEdgeController = getFadeEdgeController();
        RecyclerView recyclerView2 = fadeEdgeController.a;
        gl40 gl40Var = fadeEdgeController.f;
        recyclerView2.removeCallbacks(gl40Var);
        recyclerView2.post(gl40Var);
    }
}
