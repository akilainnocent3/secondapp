package defpackage;

import android.content.Intent;
import com.sportybet.android.transaction.ui.calendar.TxCalendarActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.calendar.TxCalendarActivity$initViewModel$1$4", f = "TxCalendarActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r0h0 extends tje0 implements Function2<pyc, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxCalendarActivity b;
    public final /* synthetic */ v0h0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0h0(TxCalendarActivity txCalendarActivity, v0h0 v0h0Var, v1b<? super r0h0> v1bVar) {
        super(2, v1bVar);
        this.b = txCalendarActivity;
        this.c = v0h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        r0h0 r0h0Var = new r0h0(this.b, this.c, v1bVar);
        r0h0Var.a = obj;
        return r0h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(pyc pycVar, v1b<? super Unit> v1bVar) {
        return ((r0h0) create(pycVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pyc pycVar = (pyc) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (pycVar instanceof pyc.a) {
            Intent intent = new Intent();
            pyc.a aVar = (pyc.a) pycVar;
            intent.putExtra("start_time", aVar.a.getTime());
            intent.putExtra("end_time", aVar.b.getTime());
            intent.putExtra("logger_event", this.c.w);
            TxCalendarActivity txCalendarActivity = this.b;
            txCalendarActivity.setResult(-1, intent);
            txCalendarActivity.finish();
        }
        return Unit.a;
    }
}
