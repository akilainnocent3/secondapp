package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$accountInfo$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class aim extends tje0 implements gaj<myh<? super AccountInfo>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super AccountInfo> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        aim aimVar = new aim(3, v1bVar);
        aimVar.a = th;
        return aimVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a.d(a320.a("fetchNameUpdateStatus error: ", th), new Object[0]);
        return Unit.a;
    }
}
