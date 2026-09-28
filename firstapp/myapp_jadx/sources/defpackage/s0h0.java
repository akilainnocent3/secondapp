package defpackage;

import com.sportybet.android.transaction.ui.calendar.TxCalendarActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.calendar.TxCalendarActivity$initViewModel$1$5", f = "TxCalendarActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s0h0 extends tje0 implements Function2<gqx, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxCalendarActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0h0(TxCalendarActivity txCalendarActivity, v1b<? super s0h0> v1bVar) {
        super(2, v1bVar);
        this.b = txCalendarActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s0h0 s0h0Var = new s0h0(this.b, v1bVar);
        s0h0Var.a = obj;
        return s0h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(gqx gqxVar, v1b<? super Unit> v1bVar) {
        return ((s0h0) create(gqxVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        gqx gqxVar = (gqx) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        TxCalendarActivity txCalendarActivity = this.b;
        af afVar = txCalendarActivity.b;
        if (gqxVar == null) {
            if (afVar != null) {
                afVar.v.setVisibility(8);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
        if (afVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        afVar.v.setTitle(gqxVar.b.e(txCalendarActivity));
        af afVar2 = txCalendarActivity.b;
        if (afVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        afVar2.v.setDescription(gqxVar.a.e(txCalendarActivity));
        af afVar3 = txCalendarActivity.b;
        if (afVar3 != null) {
            afVar3.v.setVisibility(0);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
