package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class d700 implements b700 {
    public final Context a;
    public final psm b;
    public final uqm c;
    public final m2l d;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a implements lyh<String> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: d700$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$getDepositBankTransferSubMethodsOrder$$inlined$map$1", f = "PaymentDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
        public static final class C0477a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0477a(v1b v1bVar) {
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
            public final /* synthetic */ String b;

            /* JADX INFO: renamed from: d700$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$getDepositBankTransferSubMethodsOrder$$inlined$map$1$2", f = "PaymentDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
            public static final class C0478a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0478a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, String str) {
                this.a = myhVar;
                this.b = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0478a c0478a;
                if (v1bVar instanceof C0478a) {
                    c0478a = (C0478a) v1bVar;
                    int i = c0478a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0478a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0478a = new C0478a(v1bVar);
                    }
                } else {
                    c0478a = new C0478a(v1bVar);
                }
                Object obj2 = c0478a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0478a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objC = ((zn20) obj).c(new zn20.a<>(this.b));
                    c0478a.b = 1;
                    if (this.a.emit(objC, c0478a) == y5bVar) {
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

        public a(lyh lyhVar, String str) {
            this.a = lyhVar;
            this.b = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super String> myhVar, v1b v1bVar) {
            C0477a c0477a;
            if (v1bVar instanceof C0477a) {
                c0477a = (C0477a) v1bVar;
                int i = c0477a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0477a.b = i - Integer.MIN_VALUE;
                } else {
                    c0477a = new C0477a(v1bVar);
                }
            } else {
                c0477a = new C0477a(v1bVar);
            }
            Object obj = c0477a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0477a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c0477a.b = 1;
                if (this.a.collect(bVar, c0477a) == y5bVar) {
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

    /* JADX INFO: loaded from: classes6.dex */
    public static final class b implements lyh<Long> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$getLastFixStatusTimestamp$$inlined$map$1", f = "PaymentDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: d700$b$b, reason: collision with other inner class name */
        public static final class C0479b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: d700$b$b$a */
            @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$getLastFixStatusTimestamp$$inlined$map$1$2", f = "PaymentDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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
                    return C0479b.this.emit(null, this);
                }
            }

            public C0479b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
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
                    Object objC = ((zn20) obj).c(new zn20.a<>("PREF_KEY_LAST_FIX_STATUS_TIMESTAMP"));
                    aVar.b = 1;
                    if (this.a.emit(objC, aVar) == y5bVar) {
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
                C0479b c0479b = new C0479b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0479b, aVar) == y5bVar) {
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

    /* JADX INFO: loaded from: classes6.dex */
    public static final class c implements lyh<Integer> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ String b;

        @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$getMethodPartialRate$$inlined$map$1", f = "PaymentDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return c.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;

            @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$getMethodPartialRate$$inlined$map$1$2", f = "PaymentDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, String str) {
                this.a = myhVar;
                this.b = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
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
                    Object objC = ((zn20) obj).c(new zn20.a<>(this.b));
                    aVar.b = 1;
                    if (this.a.emit(objC, aVar) == y5bVar) {
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

        public c(lyh lyhVar, String str) {
            this.a = lyhVar;
            this.b = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Integer> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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

    /* JADX INFO: loaded from: classes6.dex */
    public static final class d implements lyh<String> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ String b;

        @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$getMethodsOrder$$inlined$map$1", f = "PaymentDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return d.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;

            @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$getMethodsOrder$$inlined$map$1$2", f = "PaymentDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, String str) {
                this.a = myhVar;
                this.b = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
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
                    Object objC = ((zn20) obj).c(new zn20.a<>(this.b));
                    aVar.b = 1;
                    if (this.a.emit(objC, aVar) == y5bVar) {
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

        public d(lyh lyhVar, String str) {
            this.a = lyhVar;
            this.b = str;
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
                b bVar = new b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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

    /* JADX INFO: loaded from: classes6.dex */
    public static final class e implements lyh<String> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ String b;

        @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$getRecentlyUsedMethod$$inlined$map$1", f = "PaymentDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return e.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;

            @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$getRecentlyUsedMethod$$inlined$map$1$2", f = "PaymentDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, String str) {
                this.a = myhVar;
                this.b = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
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
                    Object objC = ((zn20) obj).c(new zn20.a<>(this.b));
                    aVar.b = 1;
                    if (this.a.emit(objC, aVar) == y5bVar) {
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

        public e(lyh lyhVar, String str) {
            this.a = lyhVar;
            this.b = str;
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
                b bVar = new b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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

    /* JADX INFO: loaded from: classes6.dex */
    public static final class f implements lyh<Integer> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ String b;

        @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$getSportyBankHintRemainCount$$inlined$map$1", f = "PaymentDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return f.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;

            @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$getSportyBankHintRemainCount$$inlined$map$1$2", f = "PaymentDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, String str) {
                this.a = myhVar;
                this.b = str;
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
                    Integer num = (Integer) ((zn20) obj).c(new zn20.a<>(this.b));
                    Integer num2 = new Integer(num != null ? num.intValue() : 1);
                    aVar.b = 1;
                    if (this.a.emit(num2, aVar) == y5bVar) {
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

        public f(lyh lyhVar, String str) {
            this.a = lyhVar;
            this.b = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Integer> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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

    /* JADX INFO: loaded from: classes6.dex */
    public static final class g implements lyh<Boolean> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ String b;

        @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$needShow$$inlined$map$1", f = "PaymentDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return g.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;

            @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$needShow$$inlined$map$1$2", f = "PaymentDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, String str) {
                this.a = myhVar;
                this.b = str;
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
                    Boolean bool = (Boolean) ((zn20) obj).c(co20.a(this.b));
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    aVar.b = 1;
                    if (this.a.emit(boolValueOf, aVar) == y5bVar) {
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

        public g(lyh lyhVar, String str) {
            this.a = lyhVar;
            this.b = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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

    public d700(Context context, psm psmVar, uqm uqmVar, m2l m2lVar) {
        psmVar.getClass();
        uqmVar.getClass();
        m2lVar.getClass();
        this.a = context;
        this.b = psmVar;
        this.c = uqmVar;
        this.d = m2lVar;
    }

    @Override // defpackage.b700
    public final lyh<String> a(log0 log0Var) {
        String str;
        log0Var.getClass();
        Account account = this.c.getAccount();
        if (account == null || (str = account.name) == null) {
            return new gzh(null);
        }
        e eVar = new e(q700.a(this.a).k(), "PREF_KEY_RECENTLY_USED_METHOD" + log0Var.name() + this.b.getCountryCode() + str);
        pfd pfdVar = fse.a;
        return ozh.c(eVar, odd.b);
    }

    @Override // defpackage.b700
    public final lyh<String> b() {
        a aVar = new a(q700.a(this.a).k(), "PREF_KEY_DEPOSIT_TRANSFER_SUB_METHODS_ORDER" + this.b.getCountryCode());
        pfd pfdVar = fse.a;
        return ozh.c(aVar, odd.b);
    }

    @Override // defpackage.b700
    public final lyh<String> c(log0 log0Var) {
        log0Var.getClass();
        d dVar = new d(q700.a(this.a).k(), "PREF_KEY_METHODS_ORDER" + log0Var.name() + this.b.getCountryCode());
        pfd pfdVar = fse.a;
        return ozh.c(dVar, odd.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.b700
    public final Object d(long j, x1b x1bVar) {
        g700 g700Var;
        if (x1bVar instanceof g700) {
            g700Var = (g700) x1bVar;
            int i = g700Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g700Var.c = i - Integer.MIN_VALUE;
            } else {
                g700Var = new g700(this, x1bVar);
            }
        } else {
            g700Var = new g700(this, x1bVar);
        }
        Object obj = g700Var.a;
        y5b y5bVar = y5b.a;
        int i2 = g700Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            sqc<zn20> sqcVarA = q700.a(this.a);
            h700 h700Var = new h700(j, null);
            g700Var.c = 1;
            if (do20.a(sqcVarA, h700Var, g700Var) == y5bVar) {
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

    @Override // defpackage.b700
    public final zed.d0 e() {
        return (zed.d0) this.d.getStringByFlow("PartnerCode", "");
    }

    @Override // defpackage.b700
    public final lyh<Integer> f() {
        String lastAccount = this.c.getLastAccount();
        if (lastAccount == null) {
            return new gzh(1);
        }
        f fVar = new f(q700.a(this.a).k(), "sporty_bank_info_count_".concat(lastAccount));
        pfd pfdVar = fse.a;
        return ozh.c(fVar, odd.b);
    }

    @Override // defpackage.b700
    public final Object g(String str, pnj0 pnj0Var) {
        m2l m2lVar = this.d;
        if (str != null && !StringsKt.U(str)) {
            return m2lVar.a.putString("PartnerCode", str, pnj0Var);
        }
        return m2lVar.a.clearPreference(new zn20.a("PartnerCode"), pnj0Var);
    }

    @Override // defpackage.b700
    public final Object h(log0 log0Var, String str, Integer num, i200.b.a aVar) {
        pfd pfdVar = fse.a;
        Object objD = ej5.d(odd.b, new i700(log0Var, str, this, num, null), aVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    @Override // defpackage.b700
    public final Object i(String str, tje0 tje0Var) {
        pfd pfdVar = fse.a;
        Object objD = ej5.d(odd.b, new c700(this, str, null), tje0Var);
        return objD == y5b.a ? objD : Unit.a;
    }

    @Override // defpackage.b700
    public final lyh<Integer> j(log0 log0Var, String str) {
        str.getClass();
        c cVar = new c(q700.a(this.a).k(), "PREF_KEY_METHOD_PARTIAL_RATE" + log0Var.name() + str + this.b.getCountryCode());
        pfd pfdVar = fse.a;
        return ozh.c(cVar, odd.b);
    }

    @Override // defpackage.b700
    public final lyh<Long> k() {
        b bVar = new b(q700.a(this.a).k());
        pfd pfdVar = fse.a;
        return ozh.c(bVar, odd.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.b700
    public final Object l(log0 log0Var, String str, x1b x1bVar) {
        l700 l700Var;
        String str2;
        if (x1bVar instanceof l700) {
            l700Var = (l700) x1bVar;
            int i = l700Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l700Var.c = i - Integer.MIN_VALUE;
            } else {
                l700Var = new l700(this, x1bVar);
            }
        } else {
            l700Var = new l700(this, x1bVar);
        }
        Object obj = l700Var.a;
        y5b y5bVar = y5b.a;
        int i2 = l700Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            Account account = this.c.getAccount();
            if (account == null || (str2 = account.name) == null) {
                return Unit.a;
            }
            String str3 = "PREF_KEY_RECENTLY_USED_METHOD" + log0Var.name() + this.b.getCountryCode() + str2;
            sqc<zn20> sqcVarA = q700.a(this.a);
            m700 m700Var = new m700(str, str3, null);
            l700Var.c = 1;
            if (do20.a(sqcVarA, m700Var, l700Var) == y5bVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.b700
    public final Object m(log0 log0Var, String str, x1b x1bVar) {
        j700 j700Var;
        if (x1bVar instanceof j700) {
            j700Var = (j700) x1bVar;
            int i = j700Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j700Var.c = i - Integer.MIN_VALUE;
            } else {
                j700Var = new j700(this, x1bVar);
            }
        } else {
            j700Var = new j700(this, x1bVar);
        }
        Object obj = j700Var.a;
        y5b y5bVar = y5b.a;
        int i2 = j700Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            String str2 = "PREF_KEY_METHODS_ORDER" + log0Var.name() + this.b.getCountryCode();
            sqc<zn20> sqcVarA = q700.a(this.a);
            k700 k700Var = new k700(str, str2, null);
            j700Var.c = 1;
            if (do20.a(sqcVarA, k700Var, j700Var) == y5bVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.b700
    public final Object n(String str, x1b x1bVar) {
        e700 e700Var;
        if (x1bVar instanceof e700) {
            e700Var = (e700) x1bVar;
            int i = e700Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e700Var.c = i - Integer.MIN_VALUE;
            } else {
                e700Var = new e700(this, x1bVar);
            }
        } else {
            e700Var = new e700(this, x1bVar);
        }
        Object obj = e700Var.a;
        y5b y5bVar = y5b.a;
        int i2 = e700Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            String str2 = "PREF_KEY_DEPOSIT_TRANSFER_SUB_METHODS_ORDER" + this.b.getCountryCode();
            sqc<zn20> sqcVarA = q700.a(this.a);
            f700 f700Var = new f700(str, str2, null);
            e700Var.c = 1;
            if (do20.a(sqcVarA, f700Var, e700Var) == y5bVar) {
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

    @Override // defpackage.b700
    public final lyh<Boolean> needShow(String str) {
        str.getClass();
        g gVar = new g(q700.a(this.a).k(), str);
        pfd pfdVar = fse.a;
        return ozh.c(gVar, odd.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.b700
    public final Object o(int i, x1b x1bVar) {
        n700 n700Var;
        if (x1bVar instanceof n700) {
            n700Var = (n700) x1bVar;
            int i2 = n700Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n700Var.c = i2 - Integer.MIN_VALUE;
            } else {
                n700Var = new n700(this, x1bVar);
            }
        } else {
            n700Var = new n700(this, x1bVar);
        }
        Object obj = n700Var.a;
        y5b y5bVar = y5b.a;
        int i3 = n700Var.c;
        if (i3 == 0) {
            uj50.b(obj);
            String lastAccount = this.c.getLastAccount();
            if (lastAccount == null) {
                return Unit.a;
            }
            String strConcat = gvQvkPPtA.KbDRufmg.concat(lastAccount);
            sqc<zn20> sqcVarA = q700.a(this.a);
            o700 o700Var = new o700(strConcat, i, null);
            n700Var.c = 1;
            if (do20.a(sqcVarA, o700Var, n700Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
