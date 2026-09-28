package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballOpenBetsCountHandlerImpl$init$1", f = "ScheduledFootballOpenBetsCountHandlerImpl.kt", l = {29}, m = "invokeSuspend", v = 2)
public final class ib70 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ boolean b;
    public final /* synthetic */ mb70 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib70(mb70 mb70Var, String str, v1b<? super ib70> v1bVar) {
        super(2, v1bVar);
        this.c = mb70Var;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ib70 ib70Var = new ib70(this.c, this.d, v1bVar);
        ib70Var.b = ((Boolean) obj).booleanValue();
        return ib70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((ib70) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            mb70 mb70Var = this.c;
            if (z) {
                this.b = z;
                this.a = 1;
                if (mb70Var.a(this.d, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                wwd0 wwd0Var = mb70Var.c;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, nb70.c));
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
