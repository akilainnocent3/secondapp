package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class igo {
    public final /* synthetic */ jrm a;

    public static final class a implements lyh<Boolean> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: igo$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.inject.InstantWinModule$provideSimulationModeObserver$1$special$$inlined$map$1", f = "InstantWinModule.kt", l = {109}, m = "collect", v = 2)
        public static final class C0679a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0679a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: igo$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.inject.InstantWinModule$provideSimulationModeObserver$1$special$$inlined$map$1$2", f = "InstantWinModule.kt", l = {50}, m = "emit", v = 2)
            public static final class C0680a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0680a(v1b v1bVar) {
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
                C0680a c0680a;
                boolean z;
                if (v1bVar instanceof C0680a) {
                    c0680a = (C0680a) v1bVar;
                    int i = c0680a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0680a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0680a = new C0680a(v1bVar);
                    }
                } else {
                    c0680a = new C0680a(v1bVar);
                }
                Object obj2 = c0680a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0680a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    int iOrdinal = ((k53) obj).ordinal();
                    if (iOrdinal == 0) {
                        z = false;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            uhc.a();
                            return null;
                        }
                        z = false;
                    } else {
                        z = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    c0680a.b = 1;
                    if (this.a.emit(boolValueOf, c0680a) == y5bVar) {
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

        public a(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
            C0679a c0679a;
            if (v1bVar instanceof C0679a) {
                c0679a = (C0679a) v1bVar;
                int i = c0679a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0679a.b = i - Integer.MIN_VALUE;
                } else {
                    c0679a = new C0679a(v1bVar);
                }
            } else {
                c0679a = new C0679a(v1bVar);
            }
            Object obj = c0679a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0679a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0679a.b = 1;
                if (this.a.collect(bVar, c0679a) == y5bVar) {
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

    public igo(jrm jrmVar) {
        this.a = jrmVar;
    }

    public final lyh<Boolean> a() {
        return new a(uzh.b(this.a.D1()));
    }
}
