package defpackage;

import com.sportybet.android.transaction.ui.calendar.TxCalendarActivity;
import java.util.Date;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.calendar.TxCalendarActivity$initViewModel$1$3", f = "TxCalendarActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q0h0 extends tje0 implements Function2<Pair<? extends Date, ? extends Date>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxCalendarActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0h0(TxCalendarActivity txCalendarActivity, v1b<? super q0h0> v1bVar) {
        super(2, v1bVar);
        this.b = txCalendarActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        q0h0 q0h0Var = new q0h0(this.b, v1bVar);
        q0h0Var.a = obj;
        return q0h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends Date, ? extends Date> pair, v1b<? super Unit> v1bVar) {
        return ((q0h0) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        uyc uycVar = new uyc((Date) pair.a);
        uyc uycVar2 = new uyc((Date) pair.b);
        int i = TxCalendarActivity.f;
        this.b.A1(uycVar, uycVar2);
        return Unit.a;
    }
}
