package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$updateWalletGift$2", f = "NightNDayViewModel.kt", l = {397}, m = "invokeSuspend", v = 1)
public final class mux extends tje0 implements Function2<v5b, v1b<? super gbx>, Object> {
    public int a;
    public final /* synthetic */ gux b;

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$updateWalletGift$2$1", f = "NightNDayViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements gaj<myh<? super gbx>, Throwable, v1b<? super Unit>, Object> {
        @Override // defpackage.gaj
        public final Object invoke(myh<? super gbx> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            return new a(3, v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mux(gux guxVar, v1b<? super mux> v1bVar) {
        super(2, v1bVar);
        this.b = guxVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mux(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super gbx> v1bVar) {
        return ((mux) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        yzh yzhVar = new yzh(this.b.d.a(), new a(3, null));
        this.a = 1;
        Object objE = s0i.e(yzhVar, this);
        return objE == y5bVar ? y5bVar : objE;
    }
}
