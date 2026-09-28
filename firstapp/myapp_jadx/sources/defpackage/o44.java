package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.presentation.main.BettingStreakViewModel$observeMissionEndTime$1", f = "BettingStreakViewModel.kt", l = {388}, m = "invokeSuspend", v = 2)
public final class o44 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ q44 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ q44 a;

        public a(q44 q44Var) {
            this.a = q44Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Long l = (Long) obj;
            q44 q44Var = this.a;
            jvd0 jvd0Var = q44Var.z;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            q44Var.z = l != null ? ej5.c(o8i0.d(q44Var), null, null, new s44(q44Var, null), 3) : null;
            return Unit.a;
        }
    }

    public static final class b implements lyh<Long> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.presentation.main.BettingStreakViewModel$observeMissionEndTime$1$invokeSuspend$$inlined$map$1", f = "BettingStreakViewModel.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: o44$b$b, reason: collision with other inner class name */
        public static final class C0910b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: o44$b$b$a */
            @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.presentation.main.BettingStreakViewModel$observeMissionEndTime$1$invokeSuspend$$inlined$map$1$2", f = "BettingStreakViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C0910b.this.emit(null, this);
                }
            }

            public C0910b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                n7e0 n7e0Var;
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
                Long l = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    m4e0 m4e0Var = ((k44) obj).a;
                    if (!(m4e0Var instanceof m4e0.c)) {
                        m4e0Var = null;
                    }
                    m4e0.c cVar = (m4e0.c) m4e0Var;
                    if (cVar != null && (n7e0Var = cVar.a) != null) {
                        l = n7e0Var.l;
                    }
                    aVar.b = 1;
                    if (this.a.emit(l, aVar) == y5bVar) {
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

        public b(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Long> myhVar, v1b v1bVar) {
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
                C0910b c0910b = new C0910b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0910b, aVar) == y5bVar) {
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
    public o44(q44 q44Var, v1b<? super o44> v1bVar) {
        super(2, v1bVar);
        this.b = q44Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o44(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o44) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            q44 q44Var = this.b;
            lyh lyhVarB = uzh.b(new b(q44Var.i));
            a aVar = new a(q44Var);
            this.a = 1;
            if (lyhVarB.collect(aVar, this) == y5bVar) {
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
