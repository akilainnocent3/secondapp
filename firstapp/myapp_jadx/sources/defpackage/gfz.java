package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.antest.datasource.OverrideLocalDataSource$getOverride$1$2", f = "OverrideLocalDataSource.kt", l = {41}, m = "invokeSuspend", v = 2)
public final class gfz extends tje0 implements gaj<myh<? super String>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfz(String str, v1b<? super gfz> v1bVar) {
        super(3, v1bVar);
        this.d = str;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super String> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        gfz gfzVar = new gfz(this.d, v1bVar);
        gfzVar.b = myhVar;
        gfzVar.c = th;
        return gfzVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (th instanceof CancellationException) {
                throw th;
            }
            itf0.a aVar = itf0.a;
            aVar.q("SB_AN_TEST");
            aVar.f(th, yk10.a(this.d, " override read failed"), new Object[0]);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (myhVar.emit(null, this) == y5bVar) {
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
