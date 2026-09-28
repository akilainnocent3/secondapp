package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$init$9", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {153}, m = "invokeSuspend", v = 2)
public final class mj70 extends tje0 implements Function2<Pair<? extends l770, ? extends e970>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pj70 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj70(v1b v1bVar, pj70 pj70Var, String str) {
        super(2, v1bVar);
        this.c = pj70Var;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mj70 mj70Var = new mj70(v1bVar, this.c, this.d);
        mj70Var.b = obj;
        return mj70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends l770, ? extends e970> pair, v1b<? super Unit> v1bVar) {
        return ((mj70) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            l770 l770Var = (l770) pair.a;
            e970 e970Var = (e970) pair.b;
            String str = l770Var.a;
            String str2 = e970Var.a;
            int i2 = e970Var.b;
            int i3 = e970Var.c;
            this.b = null;
            this.a = 1;
            if (this.c.e(this.d, str, str2, i2, i3, true, this) == y5bVar) {
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
