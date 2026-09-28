package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawViewModel$initWithdrawState$1", f = "EFTWithdrawViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class oif extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ sif a;

    @c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawViewModel$initWithdrawState$1$1", f = "EFTWithdrawViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<kqj0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ sif b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sif sifVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = sifVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kqj0 kqj0Var, v1b<? super Unit> v1bVar) {
            return ((a) create(kqj0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            kqj0 kqj0Var = (kqj0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = kqj0Var instanceof kqj0.c;
            sif sifVar = this.b;
            if (z) {
                wwd0 wwd0Var = sifVar.a1;
                jo50 jo50Var = new jo50(((kqj0.c) kqj0Var).a, true);
                wwd0Var.getClass();
                wwd0Var.k(null, jo50Var);
            } else if (kqj0Var instanceof kqj0.a) {
                sifVar.L1();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oif(sif sifVar, v1b<? super oif> v1bVar) {
        super(2, v1bVar);
        this.a = sifVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new oif(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((oif) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        sif sifVar = this.a;
        kzh.d(new g1i(sifVar.e0, new a(sifVar, null)), o8i0.d(sifVar));
        return Unit.a;
    }
}
