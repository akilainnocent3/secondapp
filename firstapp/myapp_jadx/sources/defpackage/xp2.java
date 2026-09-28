package defpackage;

import android.content.Intent;
import com.sportybet.android.bethistory.presentation.activity.BetHistoryCalendarActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.activity.BetHistoryCalendarActivity$initViewModel$1$2", f = "BetHistoryCalendarActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xp2 extends tje0 implements Function2<pyc, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ BetHistoryCalendarActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp2(BetHistoryCalendarActivity betHistoryCalendarActivity, v1b<? super xp2> v1bVar) {
        super(2, v1bVar);
        this.b = betHistoryCalendarActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xp2 xp2Var = new xp2(this.b, v1bVar);
        xp2Var.a = obj;
        return xp2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(pyc pycVar, v1b<? super Unit> v1bVar) {
        return ((xp2) create(pycVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pyc pycVar = (pyc) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = pycVar instanceof pyc.a;
        BetHistoryCalendarActivity betHistoryCalendarActivity = this.b;
        if (z) {
            Intent intent = new Intent();
            pyc.a aVar = (pyc.a) pycVar;
            intent.putExtra("start_time", aVar.a.getTime());
            intent.putExtra("end_time", aVar.b.getTime());
            betHistoryCalendarActivity.setResult(-1, intent);
            betHistoryCalendarActivity.finish();
        } else {
            if (!(pycVar instanceof pyc.b)) {
                uhc.a();
                return null;
            }
            betHistoryCalendarActivity.setResult(-1, new Intent());
            betHistoryCalendarActivity.finish();
        }
        return Unit.a;
    }
}
