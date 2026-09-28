package com.sportybet.feature.luckynumber.featurematch.presentation;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.sportybet.android.router.Sender;
import com.sportybet.feature.luckynumber.featurematch.domain.data.LNLastMinuteCard;
import defpackage.arq;
import defpackage.azm;
import defpackage.c0d;
import defpackage.c5j0;
import defpackage.d9q;
import defpackage.fq0;
import defpackage.gaj;
import defpackage.jq40;
import defpackage.l5u;
import defpackage.n5u;
import defpackage.obq;
import defpackage.p5u;
import defpackage.phx;
import defpackage.pp8;
import defpackage.qcn;
import defpackage.rkd0;
import defpackage.rqf;
import defpackage.saj;
import defpackage.tje0;
import defpackage.u6i0;
import defpackage.u7u;
import defpackage.ue80;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w060;
import defpackage.wae;
import defpackage.wc;
import defpackage.y5b;
import defpackage.yfx;
import defpackage.ygx;
import defpackage.ytw;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006(²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/feature/luckynumber/featurematch/presentation/LuckyNumberFeatureMatchView;", "Lcom/sporty/android/compose/ui/component/RevivableComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lu6i0$c;", "getViewCompositionStrategy", "()Lu6i0$c;", "Larq;", "e", "Larq;", "getLoginBinder", "()Larq;", "setLoginBinder", "(Larq;)V", "loginBinder", "Lazm;", "f", "Lazm;", "getIRouter", "()Lazm;", "setIRouter", "(Lazm;)V", "iRouter", "Lkotlin/Function0;", "", "i", "Lkotlin/jvm/functions/Function0;", "getOnConfigDisabled", "()Lkotlin/jvm/functions/Function0;", "setOnConfigDisabled", "(Lkotlin/jvm/functions/Function0;)V", "onConfigDisabled", "Lobq;", "state", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LuckyNumberFeatureMatchView extends Hilt_LuckyNumberFeatureMatchView {
    public static final /* synthetic */ int v = 0;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public arq loginBinder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public azm iRouter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Function0<Unit> onConfigDisabled;

    @c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.LuckyNumberFeatureMatchView$ContentView$1$1$1", f = "LuckyNumberFeatureMatchView.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ytw b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ytw ytwVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return LuckyNumberFeatureMatchView.this.new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Function0<Unit> onConfigDisabled;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            int i = LuckyNumberFeatureMatchView.v;
            if (((obq) this.b.getValue()).d && (onConfigDisabled = LuckyNumberFeatureMatchView.this.getOnConfigDisabled()) != null) {
                onConfigDisabled.invoke();
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.LuckyNumberFeatureMatchView$ContentView$1$2$1", f = "LuckyNumberFeatureMatchView.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<v5b, com.sportybet.feature.luckynumber.featurematch.presentation.b, v1b<? super Unit>, Object> {
        public /* synthetic */ com.sportybet.feature.luckynumber.featurematch.presentation.b a;
        public final /* synthetic */ phx c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(phx phxVar, v1b<? super b> v1bVar) {
            super(3, v1bVar);
            this.c = phxVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(v5b v5bVar, com.sportybet.feature.luckynumber.featurematch.presentation.b bVar, v1b<? super Unit> v1bVar) {
            b bVar2 = LuckyNumberFeatureMatchView.this.new b(this.c, v1bVar);
            bVar2.a = bVar;
            return bVar2.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str;
            com.sportybet.feature.luckynumber.featurematch.presentation.b bVar = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = bVar instanceof com.sportybet.feature.luckynumber.featurematch.presentation.b.a;
            LuckyNumberFeatureMatchView luckyNumberFeatureMatchView = LuckyNumberFeatureMatchView.this;
            if (z) {
                luckyNumberFeatureMatchView.getIRouter().i(wae.LUCKY_NUMBER, c5j0.a("tab", ((com.sportybet.feature.luckynumber.featurematch.presentation.b.a) bVar).a.b), null, Sender.HOMEPAGE_FEATURE);
            } else if (bVar instanceof com.sportybet.feature.luckynumber.featurematch.presentation.b.C0404b) {
                com.sportybet.feature.luckynumber.featurematch.presentation.b.C0404b c0404b = (com.sportybet.feature.luckynumber.featurematch.presentation.b.C0404b) bVar;
                luckyNumberFeatureMatchView.getIRouter().i(wae.LUCKY_NUMBER, n5u.c(new l5u.c(c0404b.a, (String) null, c0404b.b, 2)), null, Sender.HOMEPAGE_LUCKY_NUMBER_HIGH_ODDS);
            } else {
                if (!(bVar instanceof com.sportybet.feature.luckynumber.featurematch.presentation.b.c)) {
                    uhc.a();
                    return null;
                }
                phx phxVar = this.c;
                ygx ygxVarI = phxVar.b.i();
                if (ygxVarI != null) {
                    int i = ygx.f;
                    if (w060.b(ue80.b(jq40.a(d9q.class))) == ygxVarI.b.e) {
                        return Unit.a;
                    }
                }
                d9q.b bVar2 = d9q.Companion;
                com.sportybet.feature.luckynumber.featurematch.presentation.b.c cVar = (com.sportybet.feature.luckynumber.featurematch.presentation.b.c) bVar;
                LNLastMinuteCard lNLastMinuteCard = cVar.a;
                qcn<Integer> qcnVar = cVar.b;
                BigDecimal bigDecimal = cVar.c;
                BigDecimal bigDecimal2 = cVar.d;
                BigDecimal bigDecimal3 = cVar.e;
                bVar2.getClass();
                bigDecimal.getClass();
                bigDecimal2.getClass();
                String str2 = lNLastMinuteCard.a;
                String str3 = lNLastMinuteCard.b;
                String str4 = lNLastMinuteCard.c;
                String str5 = lNLastMinuteCard.d;
                long j = lNLastMinuteCard.e;
                long j2 = lNLastMinuteCard.f;
                long j3 = lNLastMinuteCard.i;
                String str6 = lNLastMinuteCard.v;
                String str7 = lNLastMinuteCard.w;
                String str8 = lNLastMinuteCard.y;
                String str9 = lNLastMinuteCard.z;
                double d = lNLastMinuteCard.A;
                double d2 = lNLastMinuteCard.B;
                int i2 = lNLastMinuteCard.C;
                int i3 = lNLastMinuteCard.D;
                String strA0 = CollectionsKt.a0(qcnVar, ",", null, null, null, 62);
                rkd0.a aVar = rkd0.Companion;
                String plainString = bigDecimal.toPlainString();
                plainString.getClass();
                String plainString2 = bigDecimal2.toPlainString();
                plainString2.getClass();
                if (bigDecimal3 != null) {
                    String plainString3 = bigDecimal3.toPlainString();
                    plainString3.getClass();
                    str = plainString3;
                } else {
                    str = null;
                }
                yfx.h(phxVar, new d9q(str2, str3, str4, str5, j, j2, j3, str6, str7, str8, str9, d, d2, i2, i3, strA0, plainString, plainString2, str), null, 6);
                Unit unit = Unit.a;
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<com.sportybet.feature.luckynumber.featurematch.presentation.a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(com.sportybet.feature.luckynumber.featurematch.presentation.a aVar) {
            com.sportybet.feature.luckynumber.featurematch.presentation.a aVar2 = aVar;
            aVar2.getClass();
            ((k) this.receiver).x1(aVar2);
            return Unit.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuckyNumberFeatureMatchView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    @Override // com.sporty.android.compose.ui.component.RevivableComposeView
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(740744079);
        int i2 = (bVarI.A(this) ? 4 : 2) | i;
        int i3 = 0;
        int i4 = 1;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            u7u.b(48, 1, pp8.b(575171413, new p5u(this, i3), bVarI), bVarI, false);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new rqf(i, i4, this);
        }
    }

    public final azm getIRouter() {
        azm azmVar = this.iRouter;
        if (azmVar != null) {
            return azmVar;
        }
        Intrinsics.n("iRouter");
        throw null;
    }

    public final arq getLoginBinder() {
        arq arqVar = this.loginBinder;
        if (arqVar != null) {
            return arqVar;
        }
        Intrinsics.n("loginBinder");
        throw null;
    }

    public final Function0<Unit> getOnConfigDisabled() {
        return this.onConfigDisabled;
    }

    @Override // com.sporty.android.compose.ui.component.RevivableComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        context.getClass();
        Activity activityB = wc.b(context);
        fq0 fq0Var = activityB instanceof fq0 ? (fq0) activityB : null;
        if (fq0Var != null) {
            getLoginBinder().a(fq0Var);
        }
    }

    public final void setIRouter(azm azmVar) {
        azmVar.getClass();
        this.iRouter = azmVar;
    }

    public final void setLoginBinder(arq arqVar) {
        arqVar.getClass();
        this.loginBinder = arqVar;
    }

    public final void setOnConfigDisabled(Function0<Unit> function0) {
        this.onConfigDisabled = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuckyNumberFeatureMatchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuckyNumberFeatureMatchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    public /* synthetic */ LuckyNumberFeatureMatchView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // com.sporty.android.compose.ui.component.RevivableComposeView
    public u6i0.c getViewCompositionStrategy() {
        return u6i0.c.a;
    }
}
