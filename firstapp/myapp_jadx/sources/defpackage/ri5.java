package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.presentation.buildandgo.f;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoViewModel$placeBet$2", f = "BuildAndGoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ri5 extends tje0 implements gaj<myh<? super lk50<? extends Round>>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri5(f fVar, v1b<? super ri5> v1bVar) {
        super(3, v1bVar);
        this.b = fVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends Round>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        ri5 ri5Var = new ri5(this.b, v1bVar);
        ri5Var.a = th;
        return ri5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        f fVar = this.b;
        wwd0 wwd0Var = fVar.H;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ni5.a((ni5) value, null, null, null, null, false, jh10.b.a, null, null, false, false, 0, 2015)));
        fVar.d.a();
        fVar.i.c("sr:sport:1-1", th);
        yy50.a.m(new jqc());
        do {
            value2 = wwd0Var.getValue();
        } while (!wwd0Var.g(value2, ni5.a((ni5) value2, null, null, null, null, false, jh10.c.a, null, null, false, false, 0, 2015)));
        return Unit.a;
    }
}
