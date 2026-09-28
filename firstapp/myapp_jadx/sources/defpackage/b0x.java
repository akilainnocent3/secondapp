package defpackage;

import com.sporty.android.sportytv.data.SportyTvDataStoreData;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportytv.viewmodel.MyProgramListViewModel$checkNotificationEnable$3", f = "MyProgramListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b0x extends tje0 implements gaj<myh<? super SportyTvDataStoreData<Boolean>>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ c0x b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0x(c0x c0xVar, v1b<? super b0x> v1bVar) {
        super(3, v1bVar);
        this.b = c0xVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super SportyTvDataStoreData<Boolean>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        b0x b0xVar = new b0x(this.b, v1bVar);
        b0xVar.a = th;
        return b0xVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        c0x c0xVar = this.b;
        c0xVar.D.m(new lk50.a(th));
        c0xVar.i.m(Boolean.FALSE);
        return Unit.a;
    }
}
