package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.CreateEvent;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.viewmodel.MatchEventViewModel$fetchCreateEventData$2", f = "MatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r5v extends tje0 implements gaj<myh<? super lk50<? extends CreateEvent>>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ z5v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5v(v1b v1bVar, z5v z5vVar) {
        super(3, v1bVar);
        this.b = z5vVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends CreateEvent>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        r5v r5vVar = new r5v(v1bVar, this.b);
        r5vVar.a = th;
        return r5vVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        lk50.a aVarA = gtc0.a(th, obj);
        z5v z5vVar = this.b;
        wwd0 wwd0Var = z5vVar.P;
        wwd0Var.getClass();
        wwd0Var.k(null, aVarA);
        wwd0 wwd0Var2 = z5vVar.Q;
        wwd0Var2.getClass();
        wwd0Var2.k(null, aVarA);
        return Unit.a;
    }
}
