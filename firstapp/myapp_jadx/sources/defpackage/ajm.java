package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$homeNotification$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ajm extends tje0 implements Function2<myh<? super Boolean>, v1b<? super Unit>, Object> {
    public final /* synthetic */ iim a;
    public final /* synthetic */ pck b;

    @c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$homeNotification$1$1", f = "HomeViewModel.kt", l = {311}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ pck b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pck pckVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = pckVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sl50 sl50Var = new sl50(this.b.a());
                this.a = 1;
                if (s0i.f(sl50Var, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajm(iim iimVar, pck pckVar, v1b<? super ajm> v1bVar) {
        super(2, v1bVar);
        this.a = iimVar;
        this.b = pckVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ajm(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Boolean> myhVar, v1b<? super Unit> v1bVar) {
        return ((ajm) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ej5.c(o8i0.d(this.a), null, null, new a(this.b, null), 3);
        return Unit.a;
    }
}
