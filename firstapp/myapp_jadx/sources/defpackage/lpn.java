package defpackage;

import android.content.Intent;
import com.sportybet.android.virtual.presentation.activity.InstantCalendarActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.activity.InstantCalendarActivity$initViewModel$1$2", f = "InstantCalendarActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lpn extends tje0 implements Function2<pyc, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ InstantCalendarActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpn(InstantCalendarActivity instantCalendarActivity, v1b<? super lpn> v1bVar) {
        super(2, v1bVar);
        this.b = instantCalendarActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lpn lpnVar = new lpn(this.b, v1bVar);
        lpnVar.a = obj;
        return lpnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(pyc pycVar, v1b<? super Unit> v1bVar) {
        return ((lpn) create(pycVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pyc pycVar = (pyc) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = pycVar instanceof pyc.a;
        InstantCalendarActivity instantCalendarActivity = this.b;
        if (z) {
            Intent intent = new Intent();
            pyc.a aVar = (pyc.a) pycVar;
            intent.putExtra("extra_start_time", aVar.a.getTime());
            intent.putExtra("extra_end_time", aVar.b.getTime());
            instantCalendarActivity.setResult(-1, intent);
            instantCalendarActivity.finish();
        } else {
            if (!(pycVar instanceof pyc.b)) {
                uhc.a();
                return null;
            }
            instantCalendarActivity.setResult(-1, new Intent());
            instantCalendarActivity.finish();
        }
        return Unit.a;
    }
}
