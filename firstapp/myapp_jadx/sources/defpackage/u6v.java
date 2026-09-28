package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.cashout.EventInfoTrackingWidgetEnabledConfigs;
import com.sporty.android.core.model.orders.EventPendingReason;
import com.sportybet.android.cashoutphase3.widget.CashoutLiveEventControlsHeaderView;
import com.sportybet.android.cashoutphase3.widget.LiveMatchTrackerView;
import com.sportybet.android.cashoutphase3.widget.STVPlayerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.model.cashOut.STVPlayerDataSource;
import com.sportybet.plugin.event.view.LiveEventMatchWebView;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.PickMarketMetadata;
import com.sportybet.plugin.realsports.data.UserNote;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class u6v extends gi6 {
    public final fhd0 b;
    public final zzy c;
    public final ai6 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public u6v(fhd0 fhd0Var, ArrayList arrayList, ek6 ek6Var, EventInfoTrackingWidgetEnabledConfigs eventInfoTrackingWidgetEnabledConfigs, ai6 ai6Var, final wh6 wh6Var) {
        arrayList.getClass();
        ek6Var.getClass();
        ConstraintLayout constraintLayout = fhd0Var.a;
        constraintLayout.getClass();
        super(constraintLayout, arrayList);
        this.b = fhd0Var;
        this.c = ek6Var;
        this.d = ai6Var;
        fhd0Var.J.setOnClickListener(new ac3(this, 1));
        fhd0Var.L.setOnClickListener(new o6v());
        fhd0Var.w.setOnClickListener(new View.OnClickListener() { // from class: p6v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((xh6) wh6Var.a).s();
            }
        });
        fhd0Var.y.a.setOnClickListener(new View.OnClickListener() { // from class: q6v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashoutLiveEventControlsHeaderView cashoutLiveEventControlsHeaderView = this.a.b.v;
                cashoutLiveEventControlsHeaderView.I(cashoutLiveEventControlsHeaderView.I, false);
            }
        });
        fhd0Var.K.setCallback(new STVPlayerView.a() { // from class: r6v
            @Override // com.sportybet.android.cashoutphase3.widget.STVPlayerView.a
            public final void a(String str) {
                this.a.c.a(str);
            }
        });
        CashoutLiveEventControlsHeaderView cashoutLiveEventControlsHeaderView = fhd0Var.v;
        cashoutLiveEventControlsHeaderView.setEventInfoTrackingWidgetEnabledConfigs(eventInfoTrackingWidgetEnabledConfigs);
        cashoutLiveEventControlsHeaderView.setCallback(new s6v(this));
    }

    /* JADX WARN: Code duplicated, block: B:174:0x040c  */
    /* JADX WARN: Code duplicated, block: B:196:0x045d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0110  */
    /* JADX WARN: Code duplicated, block: B:60:0x0183  */
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
    public final void c(int i, BoreDrawConfig boreDrawConfig) {
        BetSelection betSelectionC;
        String strB;
        Drawable drawableA;
        Drawable drawableA2;
        String marketHeadline;
        String str;
        int i2;
        int i3;
        int i4;
        boolean z;
        ils ilsVar;
        AppCompatImageView appCompatImageView;
        boolean z2;
        ils ilsVar2;
        zzy zzyVar;
        AppCompatImageView appCompatImageView2;
        STVPlayerDataSource sTVPlayerDataSource;
        UserNote userNote;
        String noteText;
        CharSequence charSequenceA;
        int i5;
        int i6;
        String strB2;
        String strB3;
        boreDrawConfig.getClass();
        pl6 pl6VarB = b(i);
        if (pl6VarB == null || (betSelectionC = pl6VarB.c()) == null) {
            return;
        }
        mfb0 mfb0VarE = lfb0.d().e(betSelectionC.sportId);
        int i7 = i + 1;
        pl6 pl6VarB2 = b(i7);
        List<pl6> list = this.a;
        boolean z3 = (list == null || i7 >= list.size() || pl6VarB2 == null || pl6VarB2.c == 5) ? false : true;
        fhd0 fhd0Var = this.b;
        if (z3) {
            fhd0Var.w.setVisibility(0);
            fhd0Var.w.setTag(b(i));
        } else {
            fhd0Var.w.setVisibility(8);
        }
        if (betSelectionC.joker != null) {
            fhd0Var.I.setImageResource(R.drawable.ic_joker_18dp);
        } else if (mfb0VarE != null) {
            fhd0Var.I.setImageDrawable(mfb0VarE.d());
        } else {
            fhd0Var.I.setImageResource(R.drawable.ic_sport_default);
        }
        if (betSelectionC.isBetBuilder()) {
            Context context = this.itemView.getContext();
            context.getClass();
            strB = sn5.b(context, R.string.bet_builder__bet_builder, new Object[0]);
        } else {
            strB = betSelectionC.outcomeDesc;
        }
        TextView textView = fhd0Var.H;
        ComposeView composeView = fhd0Var.e;
        ImageView imageView = fhd0Var.d;
        TextView textView2 = fhd0Var.c;
        ImageView imageView2 = fhd0Var.J;
        TextView textView3 = fhd0Var.D;
        TextView textView4 = fhd0Var.L;
        ComposeView composeView2 = fhd0Var.F;
        LinearLayout linearLayout = fhd0Var.B;
        boolean z4 = z3;
        TextView textView5 = fhd0Var.G;
        String str2 = strB;
        ImageView imageView3 = fhd0Var.b;
        TextView textView6 = fhd0Var.C;
        TextView textView7 = fhd0Var.M;
        textView.setText(String.format(Locale.US, "%s @", Arrays.copyOf(new Object[]{str2}, 1)));
        String str3 = betSelectionC.odds;
        str3.getClass();
        textView5.setText(gky.a.a(str3, false));
        if (betSelectionC.lfbOddsBoosted) {
            textView5.setCompoundDrawablePadding(zch0.a(this.itemView.getContext(), 2));
            drawableA = gr0.a(this.itemView.getContext(), R.drawable.ic_flash_boost);
            if (drawableA != null) {
                int dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.flash_boost_badge_size);
                drawableA.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            } else {
                drawableA = null;
            }
        } else {
            drawableA = null;
        }
        if (!betSelectionC.banker || (drawableA2 = gr0.a(this.itemView.getContext(), R.drawable.spr_cashout_banker)) == null) {
            drawableA2 = null;
        } else {
            drawableA2.setBounds(0, 0, drawableA2.getIntrinsicWidth(), drawableA2.getIntrinsicHeight());
        }
        textView5.setCompoundDrawables(drawableA, null, drawableA2, null);
        textView5.setTextColor(this.itemView.getContext().getColor(R.color.absolute_type2));
        TextView textView8 = fhd0Var.E;
        if (betSelectionC.isBetBuilder()) {
            textView8.setVisibility(8);
        } else {
            textView8.setVisibility(0);
            if (b3.U(betSelectionC.eventId)) {
                PickMarketMetadata pickMarketMetadata = betSelectionC.pickMarketMetadata;
                String marketHeadline2 = pickMarketMetadata != null ? pickMarketMetadata.getMarketHeadline() : null;
                if (marketHeadline2 == null || marketHeadline2.length() == 0) {
                    marketHeadline = betSelectionC.marketDesc;
                } else {
                    PickMarketMetadata pickMarketMetadata2 = betSelectionC.pickMarketMetadata;
                    marketHeadline = pickMarketMetadata2 != null ? pickMarketMetadata2.getMarketHeadline() : null;
                }
            } else {
                marketHeadline = betSelectionC.marketDesc;
            }
            textView8.setText(marketHeadline);
        }
        j7g j7gVar = new j7g();
        if (b3.U(betSelectionC.eventId)) {
            j7gVar.a(betSelectionC.marketDesc);
        } else if (b3.T(betSelectionC.eventId)) {
            j7gVar.a(betSelectionC.tournamentName);
        } else {
            String str4 = betSelectionC.home;
            if ((str4 != null && str4.length() != 0) || ((str = betSelectionC.away) != null && str.length() != 0)) {
                j7gVar.a(betSelectionC.home);
                j7gVar.l(zch0.a(this.itemView.getContext(), 12), " vs ");
                j7gVar.a(betSelectionC.away);
            }
            Unit unit = Unit.a;
        }
        j7gVar.n(j7gVar);
        textView4.setText(j7gVar);
        textView4.setTag(betSelectionC);
        linearLayout.setVisibility(8);
        int i8 = betSelectionC.eventStatus;
        if (i8 != 0) {
            if (i8 == 1 || i8 == 2) {
                if (!TextUtils.isEmpty(betSelectionC.currentOdds) && betSelectionC.isOutcomeActive == 1 && betSelectionC.marketStatus == 0) {
                    linearLayout.setVisibility(0);
                    textView3.setVisibility(0);
                    String str5 = betSelectionC.currentOdds;
                    str5.getClass();
                    textView6.setText(gky.a.a(str5, false));
                    textView6.setTextColor(this.itemView.getContext().getColor(R.color.text_type1_primary));
                    textView6.setBackgroundColor(0);
                    int i9 = betSelectionC.oddsFlag;
                    if (i9 == 1) {
                        imageView3.setVisibility(0);
                        imageView3.setImageDrawable(iwh0.a(this.itemView.getContext(), R.drawable.spr_ic_arrow_upward_black_24dp, this.itemView.getContext().getColor(R.color.brand_secondary)));
                    } else if (i9 == 2) {
                        imageView3.setVisibility(0);
                        imageView3.setImageDrawable(iwh0.a(this.itemView.getContext(), R.drawable.spr_ic_arrow_downward_black_24dp, this.itemView.getContext().getColor(R.color.warning_primary)));
                    } else {
                        imageView3.setVisibility(8);
                    }
                } else if (betSelectionC.isOutcomeActive != 0 || !TextUtils.isEmpty(betSelectionC.currentOdds) || betSelectionC.currentProbability != 0.0d) {
                    linearLayout.setVisibility(0);
                    textView3.setVisibility(8);
                    textView6.setVisibility(0);
                    if (betSelectionC.marketStatus == 3) {
                        sn5.f(textView6, R.string.cashout__live_odd_unavailable, new Object[0]);
                    } else {
                        sn5.f(textView6, R.string.cashout__live_odd_suspended, new Object[0]);
                    }
                    textView6.setBackgroundColor(this.itemView.getContext().getColor(R.color.background_type1_primary));
                    textView6.setTextColor(this.itemView.getContext().getColor(R.color.text_type2_tertiary));
                    imageView3.setVisibility(8);
                }
                if (mfb0VarE != null) {
                    Context context2 = this.itemView.getContext();
                    context2.getClass();
                    charSequenceA = xi6.a(betSelectionC, context2, mfb0VarE, true);
                } else {
                    charSequenceA = "";
                }
                if (TextUtils.isEmpty(charSequenceA)) {
                    i5 = 0;
                    sn5.f(textView7, R.string.common_functions__not_available, new Object[0]);
                } else {
                    i5 = 0;
                    textView7.setText(charSequenceA);
                }
                textView7.setVisibility(i5);
            } else if (b3.T(betSelectionC.eventId) || b3.U(betSelectionC.eventId)) {
                i2 = 8;
                textView7.setVisibility(8);
            } else {
                j7g j7gVar2 = new j7g();
                if ("sr:sport:1".equals(betSelectionC.sportId) || "sr:sport:202120001".equals(betSelectionC.sportId) || "sr:sport:137".equals(betSelectionC.sportId)) {
                    i6 = 0;
                    Context context3 = this.itemView.getContext();
                    context3.getClass();
                    strB2 = sn5.b(context3, R.string.bet_history__ft, new Object[0]);
                } else {
                    Context context4 = this.itemView.getContext();
                    context4.getClass();
                    i6 = 0;
                    strB2 = sn5.b(context4, R.string.bet_history__final, new Object[0]);
                }
                if (TextUtils.isEmpty(betSelectionC.setScore)) {
                    Context context5 = this.itemView.getContext();
                    context5.getClass();
                    strB3 = sn5.b(context5, R.string.common_functions__not_available, new Object[i6]);
                } else {
                    strB3 = betSelectionC.setScore;
                    strB3.getClass();
                }
                j7gVar2.a(strB2);
                j7gVar2.a(" | ");
                j7gVar2.a(strB3);
                textView7.setText(j7gVar2);
                textView7.setVisibility(i6);
            }
            i2 = 8;
        } else if (b3.T(betSelectionC.eventId) || b3.U(betSelectionC.eventId)) {
            i2 = 8;
            textView7.setVisibility(8);
        } else {
            long j = betSelectionC.startTime;
            if (j != 0) {
                textView7.setText(bwf0.a.d(j, false));
                textView7.setVisibility(0);
            }
            i2 = 8;
        }
        if (betSelectionC.status == 3) {
            linearLayout.setVisibility(i2);
            textView7.setVisibility(i2);
        }
        int i10 = betSelectionC.status;
        if (i10 <= 0) {
            i3 = (b3.T(betSelectionC.eventId) || (i4 = betSelectionC.eventStatus) == 0 || i4 == 6) ? R.drawable.ic_selection_status_not_started : R.drawable.ic_selection_status_ongoing;
        } else if (i10 == 1) {
            int i11 = betSelectionC.settleType;
            if (i11 == 1) {
                i3 = R.drawable.ic_selection_status_flashwin;
            } else if (i11 == 2) {
                i3 = R.drawable.ic_selection_status_flashsave;
            } else if (i11 == 3) {
                i3 = R.drawable.ic_selection_status_2_up;
            } else if (i11 == 5) {
                i3 = R.drawable.ic_selection_status_1_up;
            } else if (i11 == 6) {
                i3 = R.drawable.ic_selection_status_over_under_early_goals;
            } else if (i11 != 7) {
                i3 = R.drawable.ic_selection_status_win;
            } else {
                i3 = R.drawable.ic_selection_status_1_up;
            }
        } else if (i10 == 2) {
            i3 = R.drawable.ic_selection_status_lost;
        } else if (i10 != 3) {
            i3 = i10 != 4 ? -1 : R.drawable.ic_selection_status_refund_all;
        } else {
            i3 = R.drawable.ic_selection_status_void;
        }
        imageView2.setImageDrawable(i3 == -1 ? null : gr0.a(this.itemView.getContext(), i3));
        imageView2.setTag(betSelectionC);
        ImageView imageView4 = fhd0Var.i;
        if (betSelectionC.status != 0) {
            z = false;
        } else if (kgb0.a.contains(betSelectionC.tournamentId)) {
            z = true;
        } else {
            z = false;
        }
        c8i0.o(imageView4, z);
        c8i0.o(fhd0Var.f.b, betSelectionC.shouldShowBoreDrawLabel(boreDrawConfig));
        if (betSelectionC.isBetBuilder()) {
            textView2.setVisibility(0);
            imageView.setVisibility(0);
            List<BetSelection> list2 = betSelectionC.betBuilderSelections;
            list2.getClass();
            textView2.setText(CollectionsKt.a0(list2, "\n", null, null, new i100(1), 30));
        } else {
            textView2.setVisibility(8);
            imageView.setVisibility(8);
        }
        final Bet bet = pl6VarB.a;
        if (!z4 || bet == null || (userNote = bet.userNote) == null || (noteText = userNote.getNoteText()) == null || noteText.length() <= 0) {
            composeView2.setVisibility(8);
        } else {
            composeView2.setVisibility(0);
            String noteText2 = bet.userNote.getNoteText();
            String str6 = bet.orderId;
            str6.getClass();
            szx.b(composeView2, noteText2, str6, e0y.OpenBetsExpanded, new Function1() { // from class: n6v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str7 = (String) obj;
                    u6v u6vVar = this.a;
                    zzy zzyVar2 = u6vVar.c;
                    Bet bet2 = bet;
                    String str8 = bet2.orderId;
                    str8.getClass();
                    zzyVar2.p(str8, str7 == null ? "" : str7);
                    if (str7 == null || str7.length() == 0) {
                        bet2.userNote = null;
                        u6vVar.b.F.setVisibility(8);
                    } else {
                        bet2.userNote = new UserNote(str7);
                    }
                    return Unit.a;
                }
            });
            zi50.a aVar = zi50.b;
        }
        EventPendingReason eventPendingReason = betSelectionC.eventPendingReason;
        if (eventPendingReason == null || bet == null || !bet.hasPendingEvent) {
            eventPendingReason = null;
        }
        if (eventPendingReason != null) {
            composeView.setVisibility(0);
            String title = eventPendingReason.getTitle();
            if (title == null) {
                title = "";
            }
            String desc = eventPendingReason.getDesc();
            xg4.b(composeView, title, desc != null ? desc : "");
        } else {
            composeView.setVisibility(8);
        }
        CashoutLiveEventControlsHeaderView cashoutLiveEventControlsHeaderView = fhd0Var.v;
        LiveEventMatchWebView liveEventMatchWebView = fhd0Var.z;
        LiveMatchTrackerView liveMatchTrackerView = fhd0Var.A;
        STVPlayerView sTVPlayerView = fhd0Var.K;
        jhd0 jhd0Var = cashoutLiveEventControlsHeaderView.H;
        cashoutLiveEventControlsHeaderView.setUpdateSelection(betSelectionC, mfb0VarE);
        pl6 pl6VarB3 = b(i);
        if (pl6VarB3 == null || (ilsVar = pl6VarB3.i) == null) {
            return;
        }
        ils ilsVar3 = ils.STREAMING;
        boolean z5 = ilsVar == ilsVar3 && cashoutLiveEventControlsHeaderView.G(betSelectionC);
        c8i0.o(sTVPlayerView, z5);
        ils ilsVar4 = ils.LIVE_MATCH_TRACKER;
        boolean z6 = (ilsVar == ilsVar4 || ilsVar == ils.STATS) && (cashoutLiveEventControlsHeaderView.E(betSelectionC, mfb0VarE) || cashoutLiveEventControlsHeaderView.F(betSelectionC, mfb0VarE));
        c8i0.o(liveMatchTrackerView, z6);
        boolean z7 = z5;
        ils ilsVar5 = ils.GAMES;
        boolean z8 = ilsVar == ilsVar5;
        c8i0.o(liveEventMatchWebView, z8);
        zzy zzyVar2 = this.c;
        jhd0Var.b.setVisibility(zzyVar2.m() && betSelectionC.eventStatus == 1 ? 0 : 8);
        c8i0.o(fhd0Var.y.a, z7 || z6 || z8);
        ils ilsVar6 = ils.NONE;
        cashoutLiveEventControlsHeaderView.I = ilsVar6;
        AppCompatImageView appCompatImageView3 = jhd0Var.i;
        AppCompatImageView appCompatImageView4 = jhd0Var.f;
        AppCompatImageView appCompatImageView5 = jhd0Var.e;
        AppCompatImageView appCompatImageView6 = jhd0Var.b;
        appCompatImageView3.setActivated(false);
        appCompatImageView5.setActivated(false);
        appCompatImageView4.setActivated(false);
        appCompatImageView6.setActivated(false);
        jhd0Var.c.setVisibility(4);
        cashoutLiveEventControlsHeaderView.I = ilsVar;
        cashoutLiveEventControlsHeaderView.K();
        int iOrdinal = ilsVar.ordinal();
        if (iOrdinal == 0) {
            appCompatImageView = null;
            appCompatImageView6.setImageTintList(null);
            appCompatImageView6 = null;
        } else if (iOrdinal == 1) {
            appCompatImageView = null;
            appCompatImageView6.setImageTintList(null);
            appCompatImageView6 = jhd0Var.i;
        } else if (iOrdinal == 2) {
            appCompatImageView = null;
            appCompatImageView6.setImageTintList(null);
            appCompatImageView6 = appCompatImageView4;
        } else if (iOrdinal == 3) {
            appCompatImageView = null;
            appCompatImageView6.setImageTintList(null);
            appCompatImageView6 = appCompatImageView5;
        } else {
            if (iOrdinal != 4) {
                uhc.a();
                return;
            }
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(cashoutLiveEventControlsHeaderView.getContext().getColor(R.color.brand_quaternary));
            colorStateListValueOf.getClass();
            appCompatImageView6.setImageTintList(colorStateListValueOf);
            appCompatImageView = null;
        }
        if (appCompatImageView6 != null) {
            z2 = true;
            appCompatImageView6.setActivated(true);
            cashoutLiveEventControlsHeaderView.J(appCompatImageView6, cashoutLiveEventControlsHeaderView.I != ilsVar6);
        } else {
            z2 = true;
        }
        int iOrdinal2 = ilsVar.ordinal();
        if (iOrdinal2 == 0) {
            ilsVar2 = ilsVar5;
            zzyVar = zzyVar2;
        } else if (iOrdinal2 == z2) {
            ilsVar2 = ilsVar5;
            zzyVar = zzyVar2;
            pl6 pl6VarB4 = b(i);
            if (pl6VarB4 == null || (sTVPlayerDataSource = pl6VarB4.A) == null) {
                cashoutLiveEventControlsHeaderView.I(cashoutLiveEventControlsHeaderView.I, false);
            } else {
                sTVPlayerView.e(sTVPlayerDataSource);
                vjd0 vjd0Var = sTVPlayerView.d;
                if (vjd0Var != null) {
                    eid0 eid0Var = vjd0Var.f;
                    ConstraintLayout constraintLayout = eid0Var.f;
                    if (mfb0VarE != null) {
                        if (mfb0VarE.k()) {
                            String str7 = betSelectionC.away;
                            str7.getClass();
                            STVPlayerView.h(eid0Var.b, str7);
                            String str8 = betSelectionC.home;
                            str8.getClass();
                            STVPlayerView.h(eid0Var.d, str8);
                            ArrayList arrayListA = mfb0VarE.A(betSelectionC.setScore, betSelectionC.pointScore, betSelectionC.gameScore);
                            if (arrayListA.size() < 2) {
                                constraintLayout.getClass();
                                constraintLayout.setVisibility(8);
                            } else {
                                eid0Var.e.setText((CharSequence) arrayListA.get(0));
                                eid0Var.c.setText((CharSequence) arrayListA.get(1));
                                constraintLayout.getClass();
                                constraintLayout.setVisibility(0);
                            }
                        } else {
                            constraintLayout.getClass();
                            constraintLayout.setVisibility(8);
                        }
                    }
                }
            }
        } else if (iOrdinal2 == 2) {
            ilsVar2 = ilsVar5;
            zzyVar = zzyVar2;
            String str9 = betSelectionC.eventId;
            str9.getClass();
            String str10 = betSelectionC.sportId;
            str10.getClass();
            liveMatchTrackerView.g(str9, str10, betSelectionC.eventSource);
        } else if (iOrdinal2 == 3) {
            ilsVar2 = ilsVar5;
            zzyVar = zzyVar2;
            String str11 = betSelectionC.eventId;
            str11.getClass();
            String str12 = betSelectionC.sportId;
            str12.getClass();
            liveMatchTrackerView.e(str11, str12, betSelectionC.eventSource);
        } else {
            if (iOrdinal2 != 4) {
                uhc.a();
                return;
            }
            String strL = zzyVar2.l();
            liveEventMatchWebView.setLiveTrackerHeightMeasured(z2);
            String str13 = betSelectionC.eventId;
            str13.getClass();
            zzyVar = zzyVar2;
            ilsVar2 = ilsVar5;
            LiveEventMatchWebView.a(liveEventMatchWebView, str13, mfb0VarE, strL, true, 16);
        }
        for (ils ilsVar7 : b.k(ilsVar3, ils.STATS, ilsVar4, ilsVar2)) {
            ilsVar7.getClass();
            int iOrdinal3 = ilsVar7.ordinal();
            if (iOrdinal3 == 1) {
                appCompatImageView2 = jhd0Var.i;
            } else if (iOrdinal3 == 2) {
                appCompatImageView2 = jhd0Var.f;
            } else if (iOrdinal3 != 3) {
                appCompatImageView2 = iOrdinal3 != 4 ? appCompatImageView : jhd0Var.b;
            } else {
                appCompatImageView2 = jhd0Var.e;
            }
            if (appCompatImageView2 != null) {
                zzyVar.e(appCompatImageView2, ilsVar7);
            }
        }
    }

    @Override // defpackage.gi6
    public final void a(int i) {
    }
}
