package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositDedicatedAccountFragment$initView$1$1$1$1$1", f = "DepositDedicatedAccountFragment.kt", l = {120}, m = "invokeSuspend", v = 2)
public final class sxd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rxd b;
    public final /* synthetic */ ytw<Boolean> c;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositDedicatedAccountFragment$initView$1$1$1$1$1$1", f = "DepositDedicatedAccountFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<hch0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ rxd b;
        public final /* synthetic */ ytw<Boolean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rxd rxdVar, ytw<Boolean> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = rxdVar;
            this.c = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(hch0 hch0Var, v1b<? super Unit> v1bVar) {
            return ((a) create(hch0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            hch0 hch0Var = (hch0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!(hch0Var instanceof hch0.a)) {
                uhc.a();
                return null;
            }
            this.b.e0 = ((hch0.a) hch0Var).a;
            this.c.setValue(Boolean.TRUE);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxd(rxd rxdVar, ytw<Boolean> ytwVar, v1b<? super sxd> v1bVar) {
        super(2, v1bVar);
        this.b = rxdVar;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sxd(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sxd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            rxd rxdVar = this.b;
            t340 t340Var = rxdVar.J0().t0;
            a aVar = new a(rxdVar, this.c, null);
            this.a = 1;
            if (kzh.b(t340Var, aVar, this) == y5bVar) {
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
