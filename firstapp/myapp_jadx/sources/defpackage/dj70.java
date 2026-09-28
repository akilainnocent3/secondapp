package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$init$1$1", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {96}, m = "invokeSuspend", v = 2)
public final class dj70 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ boolean b;
    public final /* synthetic */ pj70 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj70(v1b v1bVar, pj70 pj70Var, String str) {
        super(2, v1bVar);
        this.c = pj70Var;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dj70 dj70Var = new dj70(v1bVar, this.c, this.d);
        dj70Var.b = ((Boolean) obj).booleanValue();
        return dj70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((dj70) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.b;
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.b = z;
            this.a = 1;
            Object objD = w5b.d(new ui70(this.c, this.d, z, null), this);
            if (objD != obj2) {
                objD = Unit.a;
            }
            if (objD == obj2) {
                return obj2;
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
