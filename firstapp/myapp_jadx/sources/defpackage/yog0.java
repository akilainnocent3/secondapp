package defpackage;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity$initViewModel$6", f = "TradingActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yog0 extends tje0 implements Function2<m7l, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TradingActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yog0(TradingActivity tradingActivity, v1b<? super yog0> v1bVar) {
        super(2, v1bVar);
        this.b = tradingActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yog0 yog0Var = new yog0(this.b, v1bVar);
        yog0Var.a = obj;
        return yog0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(m7l m7lVar, v1b<? super Unit> v1bVar) {
        return ((yog0) create(m7lVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        m7l m7lVar = (m7l) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = m7lVar instanceof m7l.c;
        final TradingActivity tradingActivity = this.b;
        ye yeVar = tradingActivity.d;
        if (z) {
            if (yeVar != null) {
                yeVar.f.a.setVisibility(8);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
        if (yeVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        yeVar.f.a.setVisibility(0);
        ye yeVar2 = tradingActivity.d;
        if (yeVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView = yeVar2.f.d;
        CharSequence charSequenceE = m7lVar.getTitle().e(tradingActivity);
        if (charSequenceE.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        textView.setText(charSequenceE);
        boolean z2 = m7lVar instanceof m7l.d;
        ye yeVar3 = tradingActivity.d;
        if (z2) {
            if (yeVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yeVar3.z.setVisibility(0);
            f00 f00Var = vgb0.a;
            vgb0.b(AnalyticsEvent.WITHDRAWAL_PAGE_VERIFY_NIN_HINT_VIEWED, (Bundle) tradingActivity.e.getValue());
        } else {
            if (yeVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yeVar3.z.setVisibility(8);
        }
        l7l l7lVarB = m7lVar.b();
        if (l7lVarB instanceof l7l.b) {
            ye yeVar4 = tradingActivity.d;
            if (yeVar4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yeVar4.f.c.setText(((l7l.b) l7lVarB).a.e(tradingActivity));
        } else {
            if (!(l7lVarB instanceof l7l.a)) {
                uhc.a();
                return null;
            }
            l7l.a aVar = (l7l.a) l7lVarB;
            SpannableStringBuilder spannableStringBuilderJ = zch0.j(aVar.a.e(tradingActivity), tradingActivity.getColor(R.color.warning_primary), 12, new twx(new ww3(1, tradingActivity, aVar)));
            ye yeVar5 = tradingActivity.d;
            if (yeVar5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yeVar5.f.c.setMovementMethod(LinkMovementMethod.getInstance());
            ye yeVar6 = tradingActivity.d;
            if (yeVar6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yeVar6.f.c.setText(spannableStringBuilderJ);
        }
        i7l i7lVarA = m7lVar.a();
        if (i7lVarA instanceof i7l.b) {
            ye yeVar7 = tradingActivity.d;
            if (yeVar7 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yeVar7.f.e.setVisibility(8);
        } else {
            if (!(i7lVarA instanceof i7l.a)) {
                uhc.a();
                return null;
            }
            ye yeVar8 = tradingActivity.d;
            if (yeVar8 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yeVar8.f.e.setVisibility(0);
            ye yeVar9 = tradingActivity.d;
            if (yeVar9 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            final i7l.a aVar2 = (i7l.a) i7lVarA;
            yeVar9.f.e.setText(aVar2.a.e(tradingActivity));
            ye yeVar10 = tradingActivity.d;
            if (yeVar10 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yeVar10.f.e.setOnClickListener(new View.OnClickListener() { // from class: xog0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = TradingActivity.X;
                    qpg0 qpg0VarA1 = tradingActivity.A1();
                    h7l h7lVar = aVar2.b;
                    h7lVar.getClass();
                    qpg0VarA1.D.a(h7lVar);
                }
            });
        }
        return Unit.a;
    }
}
