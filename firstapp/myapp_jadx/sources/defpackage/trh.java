package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.FirebaseRemoteConfigRepositoryImpl$fetch$2", f = "FirebaseRemoteConfigRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class trh extends tje0 implements Function2<zi50<? extends Void>, v1b<? super lyh<? extends Boolean>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ wrh b;

    public static final class a implements lyh<Boolean> {
        public final /* synthetic */ jv5 a;
        public final /* synthetic */ wrh b;

        /* JADX INFO: renamed from: trh$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.repository.FirebaseRemoteConfigRepositoryImpl$fetch$2$invokeSuspend$$inlined$map$1", f = "FirebaseRemoteConfigRepositoryImpl.kt", l = {109}, m = "collect", v = 2)
        public static final class C1144a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1144a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ wrh b;

            /* JADX INFO: renamed from: trh$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.repository.FirebaseRemoteConfigRepositoryImpl$fetch$2$invokeSuspend$$inlined$map$1$2", f = "FirebaseRemoteConfigRepositoryImpl.kt", l = {50}, m = "emit", v = 2)
            public static final class C1145a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1145a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, wrh wrhVar) {
                this.a = myhVar;
                this.b = wrhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1145a c1145a;
                if (v1bVar instanceof C1145a) {
                    c1145a = (C1145a) v1bVar;
                    int i = c1145a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1145a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1145a = new C1145a(v1bVar);
                    }
                } else {
                    c1145a = new C1145a(v1bVar);
                }
                Object obj2 = c1145a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1145a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object obj3 = ((zi50) obj).a;
                    boolean z = obj3 instanceof zi50.b;
                    if (Intrinsics.g(z ? null : obj3, Boolean.TRUE)) {
                        this.b.e.a(Unit.a);
                    }
                    Boolean boolValueOf = Boolean.valueOf(!z);
                    c1145a.b = 1;
                    if (this.a.emit(boolValueOf, c1145a) == y5bVar) {
                        return y5bVar;
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

        public a(jv5 jv5Var, wrh wrhVar) {
            this.a = jv5Var;
            this.b = wrhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
            C1144a c1144a;
            if (v1bVar instanceof C1144a) {
                c1144a = (C1144a) v1bVar;
                int i = c1144a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1144a.b = i - Integer.MIN_VALUE;
                } else {
                    c1144a = new C1144a(v1bVar);
                }
            } else {
                c1144a = new C1144a(v1bVar);
            }
            Object obj = c1144a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1144a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c1144a.b = 1;
                if (this.a.collect(bVar, c1144a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trh(wrh wrhVar, v1b<? super trh> v1bVar) {
        super(2, v1bVar);
        this.b = wrhVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        trh trhVar = new trh(this.b, v1bVar);
        trhVar.a = ((zi50) obj).a;
        return trhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(zi50<? extends Void> zi50Var, v1b<? super lyh<? extends Boolean>> v1bVar) {
        zi50<? extends Void> zi50Var2 = zi50Var;
        Object obj = zi50Var2.a;
        return ((trh) create(zi50Var2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zi50.a aVar = zi50.b;
        if (obj2 instanceof zi50.b) {
            return new gzh(Boolean.FALSE);
        }
        wrh wrhVar = this.b;
        return new a(hzh.a(new rrh(new l74(wrhVar, 1), null)), wrhVar);
    }
}
