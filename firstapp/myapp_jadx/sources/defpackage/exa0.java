package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.spei.withdraw.SpeiByStpWithdrawViewModel$observeAccountNumberValidation$1", f = "SpeiByStpWithdrawViewModel.kt", l = {452}, m = "invokeSuspend", v = 2)
public final class exa0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zwa0 b;

    @c0d(c = "com.sportybet.android.globalpay.stp.spei.withdraw.SpeiByStpWithdrawViewModel$observeAccountNumberValidation$1$2", f = "SpeiByStpWithdrawViewModel.kt", l = {461}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ zwa0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zwa0 zwa0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = zwa0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((a) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            wwa0 wwa0VarA;
            zwa0 zwa0Var = this.c;
            wwd0 wwd0Var = zwa0Var.E;
            String str = (String) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (zwa0Var.V) {
                    zwa0Var.i.getClass();
                    if (!rxo.c(str)) {
                        this.b = str;
                        this.a = 1;
                        if (hkd.b(600L, this) == y5bVar) {
                            return y5bVar;
                        }
                    }
                    return Unit.a;
                }
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, wwa0.a((wwa0) value, null, null, null, false, false, 15)));
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            do {
                value2 = wwd0Var.getValue();
                wwa0VarA = (wwa0) value2;
                if (Intrinsics.g(wwa0VarA.c.a.b, str)) {
                    wwa0VarA = wwa0.a(wwa0VarA, null, null, null, false, true, 15);
                }
            } while (!wwd0Var.g(value2, wwa0VarA));
            return Unit.a;
        }
    }

    public static final class b implements lyh<String> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.android.globalpay.stp.spei.withdraw.SpeiByStpWithdrawViewModel$observeAccountNumberValidation$1$invokeSuspend$$inlined$map$1", f = "SpeiByStpWithdrawViewModel.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: exa0$b$b, reason: collision with other inner class name */
        public static final class C0538b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: exa0$b$b$a */
            @c0d(c = "com.sportybet.android.globalpay.stp.spei.withdraw.SpeiByStpWithdrawViewModel$observeAccountNumberValidation$1$invokeSuspend$$inlined$map$1$2", f = "SpeiByStpWithdrawViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C0538b.this.emit(null, this);
                }
            }

            public C0538b(myh myhVar) {
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
                    String str = ((wwa0) obj).c.a.b;
                    aVar.b = 1;
                    if (this.a.emit(str, aVar) == y5bVar) {
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
        public final Object collect(myh<? super String> myhVar, v1b v1bVar) {
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
                C0538b c0538b = new C0538b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0538b, aVar) == y5bVar) {
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
    public exa0(zwa0 zwa0Var, v1b<? super exa0> v1bVar) {
        super(2, v1bVar);
        this.b = zwa0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new exa0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((exa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zwa0 zwa0Var = this.b;
            b bVar = new b(zwa0Var.E);
            a aVar = new a(zwa0Var, null);
            this.a = 1;
            if (kzh.b(bVar, aVar, this) == y5bVar) {
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
