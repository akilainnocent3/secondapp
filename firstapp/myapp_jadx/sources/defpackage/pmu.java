package defpackage;

import android.content.Context;
import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.compose.bank.screen.ManageAccountScreenKt$ManageAccountScreen$1$1", f = "ManageAccountScreen.kt", l = {41}, m = "invokeSuspend", v = 2)
public final class pmu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mjj0 b;
    public final /* synthetic */ v3a0 c;
    public final /* synthetic */ Context d;

    public static final class a<T> implements myh {
        public final /* synthetic */ v3a0 a;
        public final /* synthetic */ Context b;

        /* JADX INFO: renamed from: pmu$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.compose.bank.screen.ManageAccountScreenKt$ManageAccountScreen$1$1$1", f = "ManageAccountScreen.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "emit", v = 2)
        public static final class C0978a extends x1b {
            public /* synthetic */ Object a;
            public final /* synthetic */ a<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0978a(a<? super T> aVar, v1b<? super C0978a> v1bVar) {
                super(v1bVar);
                this.b = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        public a(v3a0 v3a0Var, Context context) {
            this.a = v3a0Var;
            this.b = context;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(com.sporty.android.common.uievent.a.m mVar, v1b<? super Unit> v1bVar) {
            C0978a c0978a;
            if (v1bVar instanceof C0978a) {
                c0978a = (C0978a) v1bVar;
                int i = c0978a.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0978a.c = i - Integer.MIN_VALUE;
                } else {
                    c0978a = new C0978a(this, v1bVar);
                }
            } else {
                c0978a = new C0978a(this, v1bVar);
            }
            C0978a c0978a2 = c0978a;
            Object obj = c0978a2.a;
            y5b y5bVar = y5b.a;
            int i2 = c0978a2.c;
            if (i2 == 0) {
                uj50.b(obj);
                String strG = mVar.a.g(this.b);
                c0978a2.c = 1;
                if (v3a0.b(this.a, strG, null, false, null, c0978a2, 14) == y5bVar) {
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

    public static final class b implements lyh<Object> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.compose.bank.screen.ManageAccountScreenKt$ManageAccountScreen$1$1$invokeSuspend$$inlined$filterIsInstance$1", f = "ManageAccountScreen.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: pmu$b$b, reason: collision with other inner class name */
        public static final class C0979b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: pmu$b$b$a */
            @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.compose.bank.screen.ManageAccountScreenKt$ManageAccountScreen$1$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ManageAccountScreen.kt", l = {50}, m = "emit", v = 2)
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
                    return C0979b.this.emit(null, this);
                }
            }

            public C0979b(myh myhVar) {
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
                    if (obj instanceof com.sporty.android.common.uievent.a.m) {
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

        public b(ku90 ku90Var) {
            this.a = ku90Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Object> myhVar, v1b v1bVar) {
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
                C0979b c0979b = new C0979b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0979b, aVar) == y5bVar) {
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
    public pmu(mjj0 mjj0Var, v3a0 v3a0Var, Context context, v1b<? super pmu> v1bVar) {
        super(2, v1bVar);
        this.b = mjj0Var;
        this.c = v3a0Var;
        this.d = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pmu(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pmu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            tmu.b bVar = tmu.b.a;
            mjj0 mjj0Var = this.b;
            mjj0Var.getClass();
            bVar.getClass();
            mjj0Var.A0.a(bVar);
            b bVar2 = new b(mjj0Var.i);
            a aVar = new a(this.c, this.d);
            this.a = 1;
            if (bVar2.collect(aVar, this) == y5bVar) {
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
