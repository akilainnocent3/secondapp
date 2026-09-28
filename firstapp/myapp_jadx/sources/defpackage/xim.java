package defpackage;

import com.sporty.android.core.model.patron.KYCReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$handleTiersVisibility$1", f = "HomeViewModel.kt", l = {882}, m = "invokeSuspend", v = 2)
public final class xim extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ iim b;
    public final /* synthetic */ KYCReminder c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xim(iim iimVar, KYCReminder kYCReminder, v1b<? super xim> v1bVar) {
        super(2, v1bVar);
        this.b = iimVar;
        this.c = kYCReminder;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xim(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xim) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objPutBoolean;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            gip gipVar = this.b.B;
            this.a = 1;
            if (gipVar.b.F() && this.c.getReminderLevel() == 3) {
                objPutBoolean = gipVar.a.putBoolean("show_tier_level_3", Boolean.TRUE, this);
            } else {
                objPutBoolean = Unit.a;
            }
            if (objPutBoolean == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
