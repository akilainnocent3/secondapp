package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.PlaceBetUseCase$invoke$2", f = "PlaceBetUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xh10 extends tje0 implements Function2<lk50<? extends u2q>, v1b<? super lyh<? extends lk50<? extends u2q>>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ai10 b;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.PlaceBetUseCase$invoke$2$2$1", f = "PlaceBetUseCase.kt", l = {83}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<myh<? super qcn<? extends ocq>>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super qcn<? extends ocq>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.b = myhVar;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                n1a0 n1a0Var = n1a0.c;
                this.b = null;
                this.a = 1;
                if (myhVar.emit(n1a0Var, this) == y5bVar) {
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

    public static final class b implements lyh<lk50.a> {
        public final /* synthetic */ yzh a;

        @c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.PlaceBetUseCase$invoke$2$invokeSuspend$lambda$1$$inlined$map$1", f = "PlaceBetUseCase.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: xh10$b$b, reason: collision with other inner class name */
        public static final class C1291b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: xh10$b$b$a */
            @c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.PlaceBetUseCase$invoke$2$invokeSuspend$lambda$1$$inlined$map$1$2", f = "PlaceBetUseCase.kt", l = {50}, m = "emit", v = 2)
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
                    return C1291b.this.emit(null, this);
                }
            }

            public C1291b(myh myhVar) {
                this.a = myhVar;
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
                    lk50.a aVar2 = new lk50.a(q0r.a.a);
                    aVar.b = 1;
                    if (this.a.emit(aVar2, aVar) == y5bVar) {
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

        public b(yzh yzhVar) {
            this.a = yzhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super lk50.a> myhVar, v1b v1bVar) {
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
            if (i2 == 0) {
                uj50.b(obj);
                C1291b c1291b = new C1291b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c1291b, aVar) == y5bVar) {
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
    public xh10(ai10 ai10Var, v1b<? super xh10> v1bVar) {
        super(2, v1bVar);
        this.b = ai10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xh10 xh10Var = new xh10(this.b, v1bVar);
        xh10Var.a = obj;
        return xh10Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends u2q> lk50Var, v1b<? super lyh<? extends lk50<? extends u2q>>> v1bVar) {
        return ((xh10) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        SprThrowable sprThrowableH = bm50.h(lk50Var);
        if (sprThrowableH != null) {
            Integer num = new Integer(sprThrowableH.getD());
            int iIntValue = num.intValue();
            q0r.a.a.getClass();
            if (iIntValue != q0r.a.b) {
                num = null;
            }
            if (num != null) {
                return new b(new yzh(this.b.d.c.e(), new a(3, null)));
            }
        }
        return new gzh(lk50Var);
    }
}
