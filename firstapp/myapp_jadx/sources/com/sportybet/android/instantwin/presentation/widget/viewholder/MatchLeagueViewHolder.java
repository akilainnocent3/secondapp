package com.sportybet.android.instantwin.presentation.widget.viewholder;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.OutcomeSpinnerLayout;
import com.sportybet.android.instantwin.presentation.widget.viewholder.MatchLeagueViewHolder;
import defpackage.a4h;
import defpackage.bmy;
import defpackage.dzc;
import defpackage.h5e;
import defpackage.op8;
import defpackage.p2s;
import defpackage.qru;
import defpackage.r0b;
import defpackage.s4p;
import defpackage.u6i0;
import defpackage.ytw;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/widget/viewholder/MatchLeagueViewHolder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Ls4p;", "binding", "<init>", "(Ls4p;)V", "Lp2s;", "leagueItem", "", "", "specifierList", "", "selectedIndex", "Lcom/sportybet/android/instantwin/presentation/widget/OutcomeSpinnerLayout$c;", "listener", "", "bind", "(Lp2s;Ljava/util/List;Ljava/lang/Integer;Lcom/sportybet/android/instantwin/presentation/widget/OutcomeSpinnerLayout$c;)V", "Ls4p;", "Lytw;", "Lqru;", "uiState", "Lytw;", "Lkotlin/Function1;", "onSpecifierClickListener", "Lkotlin/jvm/functions/Function1;", "onSpecifierClicked", "Companion", "a", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MatchLeagueViewHolder extends BaseViewHolder {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final s4p binding;
    private Function1<? super Integer, Unit> onSpecifierClickListener;
    private final Function1<Integer, Unit> onSpecifierClicked;
    private final ytw<qru> uiState;

    /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.widget.viewholder.MatchLeagueViewHolder$a, reason: from kotlin metadata */
    public static final class Companion {
        public static MatchLeagueViewHolder a(ViewGroup viewGroup) {
            viewGroup.getClass();
            View viewA = dzc.a(viewGroup, R.layout.iwqk_layout_league_item, viewGroup, false);
            ComposeView composeView = (ComposeView) h5e.a(R.id.subtitle, viewA);
            if (composeView != null) {
                return new MatchLeagueViewHolder(new s4p((ConstraintLayout) viewA, composeView));
            }
            bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(R.id.subtitle)));
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v1, types: [e7v, kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit>] */
    public MatchLeagueViewHolder(s4p s4pVar) {
        s4pVar.getClass();
        ConstraintLayout constraintLayout = s4pVar.a;
        constraintLayout.getClass();
        super(constraintLayout);
        this.binding = s4pVar;
        final ytw<qru> ytwVarB = m.b(new qru(0));
        this.uiState = ytwVarB;
        final ?? r1 = new Function1() { // from class: e7v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchLeagueViewHolder.onSpecifierClicked$lambda$0(this.a, ((Integer) obj).intValue());
            }
        };
        this.onSpecifierClicked = r1;
        ComposeView composeView = s4pVar.b;
        composeView.setViewCompositionStrategy(u6i0.b.a);
        composeView.setContent(new op8(880627968, new Function2() { // from class: fru
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final twd0 twd0Var = ytwVarB;
                    final e7v e7vVar = r1;
                    o0z.a(null, null, null, null, null, pp8.b(784235569, new Function2() { // from class: iru
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                qru qruVar = (qru) ((x5a0) twd0Var).getValue();
                                pru.b(qruVar.a, qruVar.b, qruVar.c, e7vVar, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(OutcomeSpinnerLayout.c cVar, int i) {
        if (cVar != null) {
            cVar.a(i);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSpecifierClicked$lambda$0(MatchLeagueViewHolder matchLeagueViewHolder, int i) {
        Function1<? super Integer, Unit> function1 = matchLeagueViewHolder.onSpecifierClickListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
        return Unit.a;
    }

    public final void bind(p2s leagueItem, List<String> specifierList, Integer selectedIndex, final OutcomeSpinnerLayout.c listener) {
        List<String> list;
        this.onSpecifierClickListener = new Function1() { // from class: f7v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchLeagueViewHolder.bind$lambda$0(listener, ((Integer) obj).intValue());
            }
        };
        ConstraintLayout constraintLayout = this.binding.a;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        String str = leagueItem != null ? leagueItem.b : null;
        if (str == null) {
            str = "";
        }
        Context context = this.binding.a.getContext();
        context.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(TypedValue.applyDimension(1, 12.0f, displayMetrics));
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        layoutParams.height = r0b.a(context, textPaint.measureText(str) > ((float) r0b.a(context, 97)) ? 28 : 20);
        constraintLayout.setLayoutParams(layoutParams);
        this.uiState.setValue(new qru((leagueItem == null || (list = leagueItem.c) == null) ? null : a4h.b(list), specifierList != null ? a4h.b(specifierList) : null, selectedIndex != null ? selectedIndex.intValue() : -1));
    }
}
