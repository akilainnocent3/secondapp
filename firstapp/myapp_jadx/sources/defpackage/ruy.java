package defpackage;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lruy;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ruy extends j8i0 {
    public final iuy a;
    public final mpe0 b;
    public final mpe0 c;
    public final mpe0 d;

    public static final class a implements lyh<Object> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: ruy$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.realsports.onetwoup.presentation.viewmodel.OneUpTwoUpConfigViewModel$oneXTwoUpConfigFlow_delegate$lambda$0$$inlined$filterIsInstance$1", f = "OneUpTwoUpConfigViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C1062a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1062a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: ruy$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.onetwoup.presentation.viewmodel.OneUpTwoUpConfigViewModel$oneXTwoUpConfigFlow_delegate$lambda$0$$inlined$filterIsInstance$1$2", f = "OneUpTwoUpConfigViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1063a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1063a(v1b v1bVar) {
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
                C1063a c1063a;
                if (v1bVar instanceof C1063a) {
                    c1063a = (C1063a) v1bVar;
                    int i = c1063a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1063a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1063a = new C1063a(v1bVar);
                    }
                } else {
                    c1063a = new C1063a(v1bVar);
                }
                Object obj2 = c1063a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1063a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (obj instanceof vvy.b) {
                        c1063a.b = 1;
                        if (this.a.emit(obj, c1063a) == y5bVar) {
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

        public a(uwd0 uwd0Var) {
            this.a = uwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Object> myhVar, v1b v1bVar) {
            C1062a c1062a;
            if (v1bVar instanceof C1062a) {
                c1062a = (C1062a) v1bVar;
                int i = c1062a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1062a.b = i - Integer.MIN_VALUE;
                } else {
                    c1062a = new C1062a(v1bVar);
                }
            } else {
                c1062a = new C1062a(v1bVar);
            }
            Object obj = c1062a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1062a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c1062a.b = 1;
                if (this.a.collect(bVar, c1062a) == y5bVar) {
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

    public static final class b implements lyh<uvy> {
        public final /* synthetic */ a a;

        @c0d(c = "com.sportybet.plugin.realsports.onetwoup.presentation.viewmodel.OneUpTwoUpConfigViewModel$oneXTwoUpConfigFlow_delegate$lambda$0$$inlined$map$1", f = "OneUpTwoUpConfigViewModel.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: ruy$b$b, reason: collision with other inner class name */
        public static final class C1064b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: ruy$b$b$a */
            @c0d(c = "com.sportybet.plugin.realsports.onetwoup.presentation.viewmodel.OneUpTwoUpConfigViewModel$oneXTwoUpConfigFlow_delegate$lambda$0$$inlined$map$1$2", f = "OneUpTwoUpConfigViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C1064b.this.emit(null, this);
                }
            }

            public C1064b(myh myhVar) {
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
                    uvy uvyVar = ((vvy.b) obj).a;
                    aVar.b = 1;
                    if (this.a.emit(uvyVar, aVar) == y5bVar) {
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

        public b(a aVar) {
            this.a = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super uvy> myhVar, v1b v1bVar) {
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
                C1064b c1064b = new C1064b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c1064b, aVar) == y5bVar) {
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

    public ruy(iuy iuyVar) {
        iuyVar.getClass();
        this.a = iuyVar;
        this.b = hwr.b(new d72(this, 3));
        int i = 1;
        this.c = hwr.b(new iab(this, i));
        this.d = hwr.b(new f72(this, i));
    }

    public static jvd0 x1(ruy ruyVar) {
        return kzh.d(new yzh(new g1i(ruyVar.a.b(), new puy(2, null)), new quy(3, null)), o8i0.d(ruyVar));
    }
}
