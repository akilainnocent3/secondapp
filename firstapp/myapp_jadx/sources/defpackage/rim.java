package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchTodayEvents$4", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rim extends tje0 implements gaj<myh<? super List<? extends Event>>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ iim a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rim(iim iimVar, v1b<? super rim> v1bVar) {
        super(3, v1bVar);
        this.a = iimVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super List<? extends Event>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new rim(this.a, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.F0 = null;
        return Unit.a;
    }
}
