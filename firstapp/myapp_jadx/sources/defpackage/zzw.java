package defpackage;

import com.sporty.android.sportytv.data.SportyTvDataStoreData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportytv.viewmodel.MyProgramListViewModel$checkNotificationEnable$1", f = "MyProgramListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zzw extends tje0 implements Function2<myh<? super SportyTvDataStoreData<Boolean>>, v1b<? super Unit>, Object> {
    public final /* synthetic */ c0x a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzw(c0x c0xVar, v1b<? super zzw> v1bVar) {
        super(2, v1bVar);
        this.a = c0xVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zzw(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super SportyTvDataStoreData<Boolean>> myhVar, v1b<? super Unit> v1bVar) {
        return ((zzw) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.i.m(Boolean.TRUE);
        return Unit.a;
    }
}
