package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$updateWallet$1", f = "SpeedyBingoViewModel.kt", l = {605}, m = "invokeSuspend", v = 1)
public final class bva0 extends tje0 implements Function2<v5b, v1b<? super hg60>, Object> {
    public int a;
    public final /* synthetic */ uua0 b;

    @c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$updateWallet$1$1", f = "SpeedyBingoViewModel.kt", l = {602, 603}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements gaj<myh<? super hg60>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Throwable b;
        public final /* synthetic */ uua0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(uua0 uua0Var, v1b<? super a> v1bVar) {
            super(3, v1bVar);
            this.c = uua0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super hg60> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = th;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (!(th instanceof wc60.b)) {
                    return Unit.a;
                }
                this.b = null;
                this.a = 1;
                if (this.c.z1(th, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        throw l80.a(obj);
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            this.b = null;
            this.a = 2;
            hkd.a(this);
            return y5bVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bva0(uua0 uua0Var, v1b<? super bva0> v1bVar) {
        super(2, v1bVar);
        this.b = uua0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bva0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super hg60> v1bVar) {
        return ((bva0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        uua0 uua0Var = this.b;
        lyh lyhVarC = ozh.c(new yzh(uua0Var.c.invoke(), new a(uua0Var, null)), uua0Var.i);
        this.a = 1;
        Object objE = s0i.e(lyhVarC, this);
        return objE == y5bVar ? y5bVar : objE;
    }
}
