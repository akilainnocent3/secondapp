package defpackage;

import android.view.View;
import com.sporty.android.common_ui.widgets.CommonButton;
import com.sportybet.android.transaction.ui.calendar.TxCalendarActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.calendar.TxCalendarActivity$initViewModel$1$1", f = "TxCalendarActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o0h0 extends tje0 implements Function2<rmr, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxCalendarActivity b;
    public final /* synthetic */ v0h0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0h0(TxCalendarActivity txCalendarActivity, v0h0 v0h0Var, v1b<? super o0h0> v1bVar) {
        super(2, v1bVar);
        this.b = txCalendarActivity;
        this.c = v0h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        o0h0 o0h0Var = new o0h0(this.b, this.c, v1bVar);
        o0h0Var.a = obj;
        return o0h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(rmr rmrVar, v1b<? super Unit> v1bVar) {
        return ((o0h0) create(rmrVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final rmr rmrVar = (rmr) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        TxCalendarActivity txCalendarActivity = this.b;
        if (rmrVar == null) {
            af afVar = txCalendarActivity.b;
            if (afVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            afVar.w.setVisibility(8);
            af afVar2 = txCalendarActivity.b;
            if (afVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            afVar2.y.setVisibility(8);
            af afVar3 = txCalendarActivity.b;
            if (afVar3 != null) {
                afVar3.z.setVisibility(8);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
        qmr qmrVar = rmrVar.c;
        qmr qmrVar2 = rmrVar.b;
        qmr qmrVar3 = rmrVar.a;
        af afVar4 = txCalendarActivity.b;
        if (afVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        afVar4.w.setSelected(qmrVar3.b);
        af afVar5 = txCalendarActivity.b;
        if (afVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        afVar5.w.setText(qmrVar3.a.a().e(txCalendarActivity));
        af afVar6 = txCalendarActivity.b;
        if (afVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        afVar6.w.setVisibility(0);
        af afVar7 = txCalendarActivity.b;
        if (afVar7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        CommonButton commonButton = afVar7.w;
        final v0h0 v0h0Var = this.c;
        commonButton.setOnClickListener(new View.OnClickListener() { // from class: l0h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v0h0Var.B1(rmrVar.a);
            }
        });
        af afVar8 = txCalendarActivity.b;
        if (afVar8 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        afVar8.y.setSelected(qmrVar2.b);
        af afVar9 = txCalendarActivity.b;
        if (afVar9 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        afVar9.y.setText(qmrVar2.a.a().e(txCalendarActivity));
        af afVar10 = txCalendarActivity.b;
        if (afVar10 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        afVar10.y.setVisibility(0);
        af afVar11 = txCalendarActivity.b;
        if (afVar11 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        afVar11.y.setOnClickListener(new View.OnClickListener() { // from class: m0h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v0h0Var.B1(rmrVar.b);
            }
        });
        af afVar12 = txCalendarActivity.b;
        if (afVar12 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        afVar12.z.setSelected(qmrVar.b);
        af afVar13 = txCalendarActivity.b;
        if (afVar13 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        afVar13.z.setText(qmrVar.a.a().e(txCalendarActivity));
        af afVar14 = txCalendarActivity.b;
        if (afVar14 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        afVar14.z.setVisibility(0);
        af afVar15 = txCalendarActivity.b;
        if (afVar15 != null) {
            afVar15.z.setOnClickListener(new View.OnClickListener() { // from class: n0h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v0h0Var.B1(rmrVar.c);
                }
            });
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
