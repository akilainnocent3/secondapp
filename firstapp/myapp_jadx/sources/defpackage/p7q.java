package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNFavoriteUpdateManager$startUpdate$2", f = "LNFavoriteUpdateManager.kt", l = {57}, m = "invokeSuspend", v = 2)
public final class p7q extends tje0 implements Function2<v5b, v1b<?>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ j7q c;

    public static final class a<T> implements myh {
        public final /* synthetic */ j7q a;
        public final /* synthetic */ v5b b;

        public a(j7q j7qVar, v5b v5bVar) {
            this.a = j7qVar;
            this.b = v5bVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            j7q.b bVar = (j7q.b) obj;
            j7q j7qVar = this.a;
            if (!j7qVar.b.isLogin()) {
                return Unit.a;
            }
            ej5.c(this.b, j7qVar.c, null, new k7q(j7qVar, bVar, null), 2);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7q(j7q j7qVar, v1b<? super p7q> v1bVar) {
        super(2, v1bVar);
        this.c = j7qVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p7q p7qVar = new p7q(this.c, v1bVar);
        p7qVar.b = obj;
        return p7qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<?> v1bVar) throws Throwable {
        ((p7q) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        j7q j7qVar = this.c;
        b390 b390Var = j7qVar.f;
        a aVar = new a(j7qVar, v5bVar);
        this.b = null;
        this.a = 1;
        b390Var.collect(aVar, this);
        return y5bVar;
    }
}
