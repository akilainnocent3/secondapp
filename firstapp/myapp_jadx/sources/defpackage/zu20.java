package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.primaryphone.updatedsuccessfully.PrimaryPhoneUpdatedSuccessfullyViewModel$cancelPrimaryPhoneReview$1", f = "PrimaryPhoneUpdatedSuccessfullyViewModel.kt", l = {71}, m = "invokeSuspend", v = 2)
public final class zu20 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ cv20 b;
    public final /* synthetic */ String c;

    public static final class a<T> implements myh {
        public final /* synthetic */ cv20 a;

        public a(cv20 cv20Var) {
            this.a = cv20Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            lk50 lk50Var = (lk50) obj;
            boolean z = lk50Var instanceof lk50.c;
            cv20 cv20Var = this.a;
            if (z) {
                cv20Var.getClass();
                ej5.c(o8i0.d(cv20Var), null, null, new bv20(cv20Var, null), 3);
            } else if (lk50Var instanceof lk50.a) {
                wwd0 wwd0Var = cv20Var.b;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, yu20.a((yu20) value, null, null, null, true, 7)));
            }
            return Unit.a;
        }
    }

    public static final class b implements lyh<Unit> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.feature.primaryphone.updatedsuccessfully.PrimaryPhoneUpdatedSuccessfullyViewModel$cancelPrimaryPhoneReview$1$invokeSuspend$$inlined$map$1", f = "PrimaryPhoneUpdatedSuccessfullyViewModel.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: zu20$b$b, reason: collision with other inner class name */
        public static final class C1423b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: zu20$b$b$a */
            @c0d(c = "com.sportybet.feature.primaryphone.updatedsuccessfully.PrimaryPhoneUpdatedSuccessfullyViewModel$cancelPrimaryPhoneReview$1$invokeSuspend$$inlined$map$1$2", f = "PrimaryPhoneUpdatedSuccessfullyViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C1423b.this.emit(null, this);
                }
            }

            public C1423b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws SprThrowable {
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
                    n52.c((BaseResponse) obj);
                    Unit unit = Unit.a;
                    aVar.b = 1;
                    if (this.a.emit(unit, aVar) == y5bVar) {
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

        public b(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
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
                C1423b c1423b = new C1423b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c1423b, aVar) == y5bVar) {
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
    public zu20(cv20 cv20Var, String str, v1b<? super zu20> v1bVar) {
        super(2, v1bVar);
        this.b = cv20Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zu20(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zu20) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            cv20 cv20Var = this.b;
            yzh yzhVarA = bm50.a(new b(cv20Var.a.s(this.c)));
            a aVar = new a(cv20Var);
            this.a = 1;
            if (yzhVarA.collect(aVar, this) == y5bVar) {
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
