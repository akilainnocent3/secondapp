package defpackage;

import com.sporty.android.core.model.pocket.common.PayHintData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.DepositWithdrawDelegateImpl$getPayHintConfigEntities$2", f = "DepositWithdrawDelegate.kt", l = {228}, m = "invokeSuspend", v = 2)
public final class z9e extends tje0 implements Function2<v5b, v1b<? super List<? extends PayHintData>>, Object> {
    public int a;
    public final /* synthetic */ w9e b;

    public static final class a implements lyh<List<? extends PayHintData>> {
        public final /* synthetic */ f1i a;

        /* JADX INFO: renamed from: z9e$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.basepay.viewModel.DepositWithdrawDelegateImpl$getPayHintConfigEntities$2$invokeSuspend$$inlined$map$1", f = "DepositWithdrawDelegate.kt", l = {109}, m = "collect", v = 2)
        public static final class C1381a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1381a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: z9e$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.basepay.viewModel.DepositWithdrawDelegateImpl$getPayHintConfigEntities$2$invokeSuspend$$inlined$map$1$2", f = "DepositWithdrawDelegate.kt", l = {50}, m = "emit", v = 2)
            public static final class C1382a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1382a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1382a c1382a;
                if (v1bVar instanceof C1382a) {
                    c1382a = (C1382a) v1bVar;
                    int i = c1382a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1382a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1382a = new C1382a(v1bVar);
                    }
                } else {
                    c1382a = new C1382a(v1bVar);
                }
                Object obj2 = c1382a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1382a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    List<PayHintData> list = ((PayHintData.PayHintEntity) obj).entityList;
                    c1382a.b = 1;
                    if (this.a.emit(list, c1382a) == y5bVar) {
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

        public a(f1i f1iVar) {
            this.a = f1iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super List<? extends PayHintData>> myhVar, v1b v1bVar) {
            C1381a c1381a;
            if (v1bVar instanceof C1381a) {
                c1381a = (C1381a) v1bVar;
                int i = c1381a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1381a.b = i - Integer.MIN_VALUE;
                } else {
                    c1381a = new C1381a(v1bVar);
                }
            } else {
                c1381a = new C1381a(v1bVar);
            }
            Object obj = c1381a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1381a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c1381a.b = 1;
                if (this.a.collect(bVar, c1381a) == y5bVar) {
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
    public z9e(w9e w9eVar, v1b<? super z9e> v1bVar) {
        super(2, v1bVar);
        this.b = w9eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z9e(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super List<? extends PayHintData>> v1bVar) {
        return ((z9e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a(new f1i(new zl50(this.b.c.h())));
            this.a = 1;
            obj = s0i.c(aVar, this);
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
        List list = (List) obj;
        return list == null ? m2g.a : list;
    }
}
