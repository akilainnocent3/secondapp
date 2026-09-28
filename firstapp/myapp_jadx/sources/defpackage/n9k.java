package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class n9k {
    public final uqm a;
    public final b390 b;

    @c0d(c = "com.sportybet.plugin.realsports.home.domain.useCase.GetMyFavoriteUseCase$2", f = "GetMyFavoriteUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return n9k.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
            return ((a) create(unit, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            n9k.this.a.fetchMyFavorite();
            return Unit.a;
        }
    }

    public static final class b implements lyh<Unit> {
        public final /* synthetic */ b390 a;
        public final /* synthetic */ n9k b;

        @c0d(c = "com.sportybet.plugin.realsports.home.domain.useCase.GetMyFavoriteUseCase$special$$inlined$filter$1", f = "GetMyFavoriteUseCase.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: n9k$b$b, reason: collision with other inner class name */
        public static final class C0891b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ n9k b;

            /* JADX INFO: renamed from: n9k$b$b$a */
            @c0d(c = "com.sportybet.plugin.realsports.home.domain.useCase.GetMyFavoriteUseCase$special$$inlined$filter$1$2", f = "GetMyFavoriteUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0891b.this.emit(null, this);
                }
            }

            public C0891b(myh myhVar, n9k n9kVar) {
                this.a = myhVar;
                this.b = n9kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (this.b.a.isLogin()) {
                        aVar.b = 1;
                        if (this.a.emit(obj, aVar) == y5bVar) {
                            return y5bVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public b(b390 b390Var, n9k n9kVar) {
            this.a = b390Var;
            this.b = n9kVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) throws Throwable {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            C0891b c0891b = new C0891b(myhVar, this.b);
            aVar.b = 1;
            this.a.collect(c0891b, aVar);
            return y5bVar;
        }
    }

    public n9k(uqm uqmVar) {
        uqmVar.getClass();
        this.a = uqmVar;
        b390 b390VarB = d390.b(0, 1, pb5.b, 1);
        this.b = b390VarB;
        g1i g1iVar = new g1i(new or60(new bzh(900000L, null, new b(b390VarB, this))), new a(null));
        zu7.a aVar = zu7.a;
        kzh.d(g1iVar, zu7.a());
    }
}
