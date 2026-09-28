package defpackage;

import com.sporty.android.sportytv.data.SportyTvDataStoreData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportytv.viewmodel.MyProgramListViewModel$checkNotificationEnable$2", f = "MyProgramListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a0x extends tje0 implements Function2<SportyTvDataStoreData<Boolean>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ c0x b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0x(c0x c0xVar, v1b<? super a0x> v1bVar) {
        super(2, v1bVar);
        this.b = c0xVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        a0x a0xVar = new a0x(this.b, v1bVar);
        a0xVar.a = obj;
        return a0xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SportyTvDataStoreData<Boolean> sportyTvDataStoreData, v1b<? super Unit> v1bVar) {
        return ((a0x) create(sportyTvDataStoreData, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        SportyTvDataStoreData sportyTvDataStoreData = (SportyTvDataStoreData) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        c0x c0xVar = this.b;
        c0xVar.D.m(new lk50.c(sportyTvDataStoreData));
        c0xVar.i.m(Boolean.FALSE);
        return Unit.a;
    }
}
