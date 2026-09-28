package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.handler.speedcontroller.SpeedControllerHandlerImpl$initSpeedControllerHandler$3", f = "SpeedControllerHandlerImpl.kt", l = {80}, m = "invokeSuspend", v = 2)
public final class gta0 extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kta0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gta0(kta0 kta0Var, v1b<? super gta0> v1bVar) {
        super(2, v1bVar);
        this.c = kta0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gta0 gta0Var = new gta0(this.c, v1bVar);
        gta0Var.b = obj;
        return gta0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((gta0) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            yho yhoVar = this.c.a;
            wm20 wm20VarA = yhoVar.i.a(yhoVar, yho.o[8]);
            this.b = null;
            this.a = 1;
            if (wm20VarA.g(this, str) == y5bVar) {
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
