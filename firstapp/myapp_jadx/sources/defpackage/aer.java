package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.showoff.presentation.LNShowOffViewModel$3", f = "LNShowOffViewModel.kt", l = {222}, m = "invokeSuspend", v = 2)
public final class aer extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ber b;

    @c0d(c = "com.sportybet.feature.luckynumber.showoff.presentation.LNShowOffViewModel$3$2", f = "LNShowOffViewModel.kt", l = {223}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ ber c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ber berVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = berVar;
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
            String str = (String) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = this.c.A;
                this.b = null;
                this.a = 1;
                wwd0Var.setValue(str);
                if (Unit.a == y5bVar) {
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

    public static final class b implements lyh<String> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.feature.luckynumber.showoff.presentation.LNShowOffViewModel$3$invokeSuspend$$inlined$mapNotNull$1", f = "LNShowOffViewModel.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: aer$b$b, reason: collision with other inner class name */
        public static final class C0014b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: aer$b$b$a */
            @c0d(c = "com.sportybet.feature.luckynumber.showoff.presentation.LNShowOffViewModel$3$invokeSuspend$$inlined$mapNotNull$1$2", f = "LNShowOffViewModel.kt", l = {55}, m = "emit", v = 2)
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
                    return C0014b.this.emit(null, this);
                }
            }

            public C0014b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                ber.a aVar2;
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
                    ber.a[] aVarArr = (ber.a[]) obj;
                    int length = aVarArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            aVar2 = null;
                            break;
                        }
                        aVar2 = aVarArr[i3];
                        y8r y8rVar = aVar2.a;
                        if (!(y8rVar instanceof y8r.a)) {
                            y8rVar = null;
                        }
                        y8r.a aVar3 = (y8r.a) y8rVar;
                        if ((aVar3 != null ? aVar3.a : null) instanceof a9r.b) {
                            break;
                        }
                        i3++;
                    }
                    String str = aVar2 != null ? aVar2.b.c : null;
                    if (str != null) {
                        aVar.b = 1;
                        if (this.a.emit(str, aVar) == y5bVar) {
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

        public b(eer eerVar) {
            this.a = eerVar;
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
                C0014b c0014b = new C0014b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0014b, aVar) == y5bVar) {
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
    public aer(ber berVar, v1b<? super aer> v1bVar) {
        super(2, v1bVar);
        this.b = berVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new aer(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((aer) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ber berVar = this.b;
            b bVar = new b(berVar.v);
            a aVar = new a(berVar, null);
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
