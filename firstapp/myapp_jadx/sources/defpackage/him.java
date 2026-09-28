package defpackage;

import com.sportybet.plugin.realsports.data.SportGroup;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchCountries$4", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class him extends tje0 implements gaj<myh<? super SportGroup>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ iim a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public him(iim iimVar, v1b<? super him> v1bVar) {
        super(3, v1bVar);
        this.a = iimVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super SportGroup> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new him(this.a, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.J0 = null;
        return Unit.a;
    }
}
