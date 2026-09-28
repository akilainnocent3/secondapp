package defpackage;

import kotlin.Unit;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.handler.KickOffHandlerImpl$kickOff$3", f = "KickOffHandlerImpl.kt", l = {HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "invokeSuspend", v = 2)
public final class upp extends tje0 implements gaj<myh<? super hqc>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ vpp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upp(vpp vppVar, v1b<? super upp> v1bVar) {
        super(3, v1bVar);
        this.c = vppVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super hqc> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        upp uppVar = new upp(this.c, v1bVar);
        uppVar.b = th;
        return uppVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            vpp vppVar = this.c;
            vppVar.c.k(null, Boolean.FALSE);
            kqc kqcVarB = vppVar.b(th);
            yy50.a.m(kqcVarB);
            ku90<q3v> ku90Var = vppVar.e;
            q3v.a aVar = new q3v.a(kqcVarB.a, kqcVarB.b);
            this.b = null;
            this.a = 1;
            if (ku90Var.a.emit(aVar, this) == y5bVar) {
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
