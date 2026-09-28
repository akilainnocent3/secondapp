package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.LNFeatureMatchConfigSession$verify$2", f = "ObserveLuckyNumberFeatureMatchCardsUseCase.kt", l = {535, 536}, m = "invokeSuspend", v = 2)
public final class f8q extends tje0 implements Function2<v5b, v1b<? super e8q>, Object> {
    public pjd a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ g8q d;
    public final /* synthetic */ d8q e;

    @c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.LNFeatureMatchConfigSession$verify$2$result$1", f = "ObserveLuckyNumberFeatureMatchCardsUseCase.kt", l = {533}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super e8q>, Object> {
        public int a;
        public final /* synthetic */ g8q b;
        public final /* synthetic */ d8q c;

        /* JADX INFO: renamed from: f8q$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.LNFeatureMatchConfigSession$verify$2$result$1$1", f = "ObserveLuckyNumberFeatureMatchCardsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0549a extends tje0 implements Function2<h8q, v1b<? super Boolean>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ d8q b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0549a(d8q d8qVar, v1b<? super C0549a> v1bVar) {
                super(2, v1bVar);
                this.b = d8qVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0549a c0549a = new C0549a(this.b, v1bVar);
                c0549a.a = obj;
                return c0549a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(h8q h8qVar, v1b<? super Boolean> v1bVar) {
                return ((C0549a) create(h8qVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                h8q h8qVar = (h8q) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Boolean.valueOf(Intrinsics.g(h8qVar.a, this.b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g8q g8qVar, d8q d8qVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = g8qVar;
            this.c = d8qVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super e8q> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                t340 t340Var = this.b.c;
                C0549a c0549a = new C0549a(this.c, null);
                this.a = 1;
                obj = s0i.b(t340Var, c0549a, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return ((h8q) obj).b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8q(g8q g8qVar, d8q d8qVar, v1b<? super f8q> v1bVar) {
        super(2, v1bVar);
        this.d = g8qVar;
        this.e = d8qVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        f8q f8qVar = new f8q(this.d, this.e, v1bVar);
        f8qVar.c = obj;
        return f8qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super e8q> v1bVar) {
        return ((f8q) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pjd pjdVarA;
        v5b v5bVar = (v5b) this.c;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            a6b a6bVar = a6b.a;
            g8q g8qVar = this.d;
            d8q d8qVar = this.e;
            pjdVarA = ej5.a(v5bVar, null, new a(g8qVar, d8qVar, null), 1);
            tb5 tb5Var = g8qVar.a;
            this.c = null;
            this.a = pjdVarA;
            this.b = 1;
            if (tb5Var.j(this, d8qVar) != y5bVar) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pjdVarA = this.a;
        uj50.b(obj);
        this.c = null;
        this.a = null;
        this.b = 2;
        Object objAwait = pjdVarA.await(this);
        return objAwait == y5bVar ? y5bVar : objAwait;
    }
}
