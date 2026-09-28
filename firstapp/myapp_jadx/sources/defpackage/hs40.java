package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$updateWalletGift$2", f = "RefsCallViewModel.kt", l = {385}, m = "invokeSuspend", v = 1)
public final class hs40 extends tje0 implements Function2<v5b, v1b<? super uq30>, Object> {
    public int a;
    public final /* synthetic */ zr40 b;

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$updateWalletGift$2$1", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements gaj<myh<? super uq30>, Throwable, v1b<? super Unit>, Object> {
        @Override // defpackage.gaj
        public final Object invoke(myh<? super uq30> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
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
    public hs40(zr40 zr40Var, v1b<? super hs40> v1bVar) {
        super(2, v1bVar);
        this.b = zr40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hs40(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super uq30> v1bVar) {
        return ((hs40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        yzh yzhVar = new yzh(this.b.c.invoke(), new a(3, null));
        this.a = 1;
        Object objE = s0i.e(yzhVar, this);
        return objE == y5bVar ? y5bVar : objE;
    }
}
