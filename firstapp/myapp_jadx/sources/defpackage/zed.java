package defpackage;

import androidx.window.layout.oKr.TEFcJcMqR;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class zed implements dn20 {
    public final sqc<zn20> a;

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {257}, m = "clearDataStore", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public a(v1b<? super a> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return zed.this.a(this);
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getLongByFlow$3", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a0 extends tje0 implements gaj<myh<? super zn20>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super zn20> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            a0 a0Var = new a0(3, v1bVar);
            a0Var.a = th;
            return a0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.o(th);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$putLong$2", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a1 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<Long> b;
        public final /* synthetic */ Long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(zn20.a<Long> aVar, Long l, v1b<? super a1> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
            this.c = l;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a1 a1Var = new a1(this.b, this.c, v1bVar);
            a1Var.a = obj;
            return a1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((a1) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.getClass();
            jtwVar.h(this.b, this.c);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$clearDataStore$2", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(2, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((b) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.e();
            jtwVar.a.clear();
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {61}, m = "getString", v = 2)
    public static final class b0 extends x1b {
        public String a;
        public /* synthetic */ Object b;
        public int d;

        public b0(v1b<? super b0> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return zed.this.getString(null, null, this);
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$putLong$3", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b1 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<Long> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b1(zn20.a<Long> aVar, v1b<? super b1> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b1 b1Var = new b1(this.b, v1bVar);
            b1Var.a = obj;
            return b1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((b1) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.f(this.b);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {249}, m = "clearPreference", v = 2)
    public static final class c<T> extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public c(v1b<? super c> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return zed.this.clearPreference(null, this);
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getString$3", f = "PreferenceDataStoreImpl.kt", l = {71}, m = "invokeSuspend", v = 2)
    public static final class c0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ tqc<String> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(String str, String str2, tqc<String> tqcVar, v1b<? super c0> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = str2;
            this.e = tqcVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zed.this.new c0(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            tqc<String> tqcVar = this.e;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    zed zedVar = zed.this;
                    String str = this.c;
                    String str2 = this.d;
                    this.a = 1;
                    obj = zedVar.getString(str, str2, this);
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
                tqcVar.onSuccess((String) obj);
            } catch (Exception e) {
                tqcVar.a(e);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, 38}, m = "putString", v = 2)
    public static final class c1 extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public c1(v1b<? super c1> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return zed.this.putString(null, null, this);
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$clearPreference$2", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(zn20.a<T> aVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(this.b, v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((d) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.f(this.b);
            return Unit.a;
        }
    }

    public static final class d0 implements lyh<String> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getStringByFlow$$inlined$map$1", f = "PreferenceDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return d0.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;

            @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getStringByFlow$$inlined$map$1$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, String str, String str2) {
                this.a = myhVar;
                this.b = str;
                this.c = str2;
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
                    String str = (String) ((zn20) obj).c(co20.f(this.b));
                    if (str == null) {
                        str = this.c;
                    }
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

        public d0(yzh yzhVar, String str, String str2) {
            this.a = yzhVar;
            this.b = str;
            this.c = str2;
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
                b bVar = new b(myhVar, this.b, this.c);
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

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$putString$2", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d1 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<String> b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(zn20.a<String> aVar, String str, v1b<? super d1> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d1 d1Var = new d1(this.b, this.c, v1bVar);
            d1Var.a = obj;
            return d1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((d1) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.getClass();
            jtwVar.h(this.b, this.c);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {253}, m = "clearPreference", v = 2)
    public static final class e extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public e(v1b<? super e> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return zed.this.b(null, this);
        }
    }

    public static final class e0 implements lyh<String> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ String b;

        @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getStringByFlow$$inlined$map$2", f = "PreferenceDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return e0.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;

            @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getStringByFlow$$inlined$map$2$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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
                    Object objC = ((zn20) obj).c(co20.f(this.b));
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

        public e0(yzh yzhVar, String str) {
            this.a = yzhVar;
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

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$putString$3", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e1 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(zn20.a<String> aVar, v1b<? super e1> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e1 e1Var = new e1(this.b, v1bVar);
            e1Var.a = obj;
            return e1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((e1) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.f(this.b);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$clearPreference$4", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, v1b<? super f> v1bVar) {
            super(2, v1bVar);
            this.b = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = new f(this.b, v1bVar);
            fVar.a = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((f) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.f(co20.f(this.b));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getStringByFlow$1", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f0 extends tje0 implements gaj<myh<? super zn20>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super zn20> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            f0 f0Var = new f0(3, v1bVar);
            f0Var.a = th;
            return f0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.o(th);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$putString$4", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "invokeSuspend", v = 2)
    public static final class f1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ tqc<String> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f1(String str, String str2, tqc<String> tqcVar, v1b<? super f1> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = str2;
            this.e = tqcVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zed.this.new f1(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            tqc<String> tqcVar = this.e;
            String str = this.d;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    zed zedVar = zed.this;
                    String str2 = this.c;
                    this.a = 1;
                    if (zedVar.putString(str2, str, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                tqcVar.onSuccess(str);
            } catch (Exception e) {
                tqcVar.a(e);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {205}, m = "getBoolean", v = 2)
    public static final class g extends x1b {
        public boolean a;
        public /* synthetic */ Object b;
        public int d;

        public g(v1b<? super g> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return zed.this.getBoolean(null, false, this);
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getStringByFlow$3", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g0 extends tje0 implements gaj<myh<? super zn20>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super zn20> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            g0 g0Var = new g0(3, v1bVar);
            g0Var.a = th;
            return g0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.o(th);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {225}, m = "putStringSet", v = 2)
    public static final class g1 extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public g1(v1b<? super g1> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return zed.this.i(null, null, this);
        }
    }

    public static final class h implements lyh<Boolean> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;

        @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getBooleanByFlow$$inlined$map$1", f = "PreferenceDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return h.this.collect(null, this);
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;
            public final /* synthetic */ boolean c;

            /* JADX INFO: loaded from: classes6.dex */
            @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getBooleanByFlow$$inlined$map$1$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, String str, boolean z) {
                this.a = myhVar;
                this.b = str;
                this.c = z;
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
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : this.c);
                    aVar.b = 1;
                    if (this.a.emit(boolValueOf, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a(yFmFZvuWxAYfEj.xiMAwM);
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public h(yzh yzhVar, String str, boolean z) {
            this.a = yzhVar;
            this.b = str;
            this.c = z;
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
                b bVar = new b(myhVar, this.b, this.c);
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

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {231}, m = "getStringSet", v = 2)
    public static final class h0 extends x1b {
        public String a;
        public /* synthetic */ Object b;
        public int d;

        public h0(v1b<? super h0> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return zed.this.d(null, this);
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$putStringSet$2", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h1 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<Set<String>> b;
        public final /* synthetic */ Set<String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h1(zn20.a<Set<String>> aVar, Set<String> set, v1b<? super h1> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
            this.c = set;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h1 h1Var = new h1(this.b, this.c, v1bVar);
            h1Var.a = obj;
            return h1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((h1) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.getClass();
            jtwVar.h(this.b, this.c);
            return Unit.a;
        }
    }

    public static final class i implements lyh<Boolean> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ String b;

        @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getBooleanByFlow$$inlined$map$2", f = "PreferenceDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return i.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;

            @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getBooleanByFlow$$inlined$map$2$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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
                    Object objC = ((zn20) obj).c(co20.a(this.b));
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

        public i(yzh yzhVar, String str) {
            this.a = yzhVar;
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

    public static final class i0 implements lyh<Set<? extends String>> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ zn20.a b;
        public final /* synthetic */ Set c;

        @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getStringSetByFlow$$inlined$map$1", f = "PreferenceDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return i0.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ zn20.a b;
            public final /* synthetic */ Set c;

            @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getStringSetByFlow$$inlined$map$1$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, zn20.a aVar, Set set) {
                this.a = myhVar;
                this.b = aVar;
                this.c = set;
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
                    Set set = (Set) ((zn20) obj).c(this.b);
                    if (set == null) {
                        set = this.c;
                    }
                    aVar.b = 1;
                    if (this.a.emit(set, aVar) == y5bVar) {
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

        public i0(yzh yzhVar, zn20.a aVar, Set set) {
            this.a = yzhVar;
            this.b = aVar;
            this.c = set;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Set<? extends String>> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar, this.b, this.c);
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

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getBooleanByFlow$1", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j extends tje0 implements gaj<myh<? super zn20>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super zn20> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            j jVar = new j(3, v1bVar);
            jVar.a = th;
            return jVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.o(th);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getStringSetByFlow$1", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j0 extends tje0 implements gaj<myh<? super zn20>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super zn20> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            j0 j0Var = new j0(3, v1bVar);
            j0Var.a = th;
            return j0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.o(th);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getBooleanByFlow$3", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k extends tje0 implements gaj<myh<? super zn20>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super zn20> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            k kVar = new k(3, v1bVar);
            kVar.a = th;
            return kVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.o(th);
            return Unit.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class k0<T> implements lyh<T> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ zn20.a b;

        @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getValue$$inlined$map$1", f = "PreferenceDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return k0.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ zn20.a b;

            @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getValue$$inlined$map$1$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, zn20.a aVar) {
                this.a = myhVar;
                this.b = aVar;
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
                    Object objC = ((zn20) obj).c(this.b);
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

        public k0(yzh yzhVar, zn20.a aVar) {
            this.a = yzhVar;
            this.b = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh myhVar, v1b v1bVar) {
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

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {181}, m = "getDouble", v = 2)
    public static final class l extends x1b {
        public double a;
        public /* synthetic */ Object b;
        public int d;

        public l(v1b<? super l> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return zed.this.getDouble(null, 0.0d, this);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getValue$2", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class l0 extends tje0 implements gaj<myh<? super zn20>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super zn20> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            l0 l0Var = new l0(3, v1bVar);
            l0Var.a = th;
            return l0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a aVar = itf0.a;
            aVar.q(TEFcJcMqR.SKUIDOiQr);
            aVar.b(th);
            return Unit.a;
        }
    }

    public static final class m implements lyh<Double> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ String b;
        public final /* synthetic */ double c;

        @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getDoubleByFlow$$inlined$map$1", f = "PreferenceDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return m.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;
            public final /* synthetic */ double c;

            @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getDoubleByFlow$$inlined$map$1$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, String str, double d) {
                this.a = myhVar;
                this.b = str;
                this.c = d;
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
                    Double d = (Double) ((zn20) obj).c(co20.b(this.b));
                    Double d2 = new Double(d != null ? d.doubleValue() : this.c);
                    aVar.b = 1;
                    if (this.a.emit(d2, aVar) == y5bVar) {
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

        public m(lyh lyhVar, String str, double d) {
            this.a = lyhVar;
            this.b = str;
            this.c = d;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Double> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar, this.b, this.c);
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

    public static final class m0 implements lyh<Boolean> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ zn20.a b;

        @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$isKeyStored$$inlined$map$1", f = "PreferenceDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return m0.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ zn20.a b;

            @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$isKeyStored$$inlined$map$1$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, zn20.a aVar) {
                this.a = myhVar;
                this.b = aVar;
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
                    Boolean boolValueOf = Boolean.valueOf(((zn20) obj).b(this.b));
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

        public m0(lyh lyhVar, zn20.a aVar) {
            this.a = lyhVar;
            this.b = aVar;
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

    public static final class n implements lyh<Double> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ String b;

        @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getDoubleByFlow$$inlined$map$2", f = "PreferenceDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return n.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;

            @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getDoubleByFlow$$inlined$map$2$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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
                    Object objC = ((zn20) obj).c(co20.b(this.b));
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

        public n(lyh lyhVar, String str) {
            this.a = lyhVar;
            this.b = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Double> myhVar, v1b v1bVar) {
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

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {196, 198}, m = "putBoolean", v = 2)
    public static final class n0 extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public n0(v1b<? super n0> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return zed.this.putBoolean(null, null, this);
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {159}, m = "getFloat", v = 2)
    public static final class o extends x1b {
        public float a;
        public /* synthetic */ Object b;
        public int d;

        public o(v1b<? super o> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return zed.this.getFloat(null, 0.0f, this);
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$putBoolean$2", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class o0 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<Boolean> b;
        public final /* synthetic */ Boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(zn20.a<Boolean> aVar, Boolean bool, v1b<? super o0> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
            this.c = bool;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            o0 o0Var = new o0(this.b, this.c, v1bVar);
            o0Var.a = obj;
            return o0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((o0) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.getClass();
            jtwVar.h(this.b, this.c);
            return Unit.a;
        }
    }

    public static final class p implements lyh<Float> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ String b;
        public final /* synthetic */ float c;

        @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getFloatByFlow$$inlined$map$1", f = "PreferenceDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return p.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;
            public final /* synthetic */ float c;

            @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getFloatByFlow$$inlined$map$1$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, String str, float f) {
                this.a = myhVar;
                this.b = str;
                this.c = f;
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
                    Float f = (Float) ((zn20) obj).c(co20.c(this.b));
                    Float f2 = new Float(f != null ? f.floatValue() : this.c);
                    aVar.b = 1;
                    if (this.a.emit(f2, aVar) == y5bVar) {
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

        public p(lyh lyhVar, String str, float f) {
            this.a = lyhVar;
            this.b = str;
            this.c = f;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Float> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar, this.b, this.c);
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

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$putBoolean$3", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class p0 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(zn20.a<Boolean> aVar, v1b<? super p0> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            p0 p0Var = new p0(this.b, v1bVar);
            p0Var.a = obj;
            return p0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((p0) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.f(this.b);
            return Unit.a;
        }
    }

    public static final class q implements lyh<Float> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ String b;

        @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getFloatByFlow$$inlined$map$2", f = "PreferenceDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return q.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;

            @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getFloatByFlow$$inlined$map$2$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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
                    Object objC = ((zn20) obj).c(co20.c(this.b));
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

        public q(lyh lyhVar, String str) {
            this.a = lyhVar;
            this.b = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Float> myhVar, v1b v1bVar) {
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

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {172, 174}, m = "putDouble", v = 2)
    public static final class q0 extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public q0(v1b<? super q0> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return zed.this.putDouble(null, null, this);
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {115}, m = "getInt", v = 2)
    public static final class r extends x1b {
        public int a;
        public /* synthetic */ Object b;
        public int d;

        public r(v1b<? super r> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return zed.this.getInt(null, 0, this);
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$putDouble$2", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class r0 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<Double> b;
        public final /* synthetic */ Double c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(zn20.a<Double> aVar, Double d, v1b<? super r0> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
            this.c = d;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            r0 r0Var = new r0(this.b, this.c, v1bVar);
            r0Var.a = obj;
            return r0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((r0) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.getClass();
            jtwVar.h(this.b, this.c);
            return Unit.a;
        }
    }

    public static final class s implements lyh<Integer> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getIntFlow$$inlined$map$1", f = "PreferenceDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return s.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;
            public final /* synthetic */ int c;

            @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getIntFlow$$inlined$map$1$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, String str, int i) {
                this.a = myhVar;
                this.b = str;
                this.c = i;
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
                    Integer num = (Integer) ((zn20) obj).c(co20.d(this.b));
                    Integer num2 = new Integer(num != null ? num.intValue() : this.c);
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

        public s(yzh yzhVar, String str, int i) {
            this.a = yzhVar;
            this.b = str;
            this.c = i;
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
                b bVar = new b(myhVar, this.b, this.c);
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

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$putDouble$3", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class s0 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<Double> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(zn20.a<Double> aVar, v1b<? super s0> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s0 s0Var = new s0(this.b, v1bVar);
            s0Var.a = obj;
            return s0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((s0) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.f(this.b);
            return Unit.a;
        }
    }

    public static final class t implements lyh<Integer> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ String b;

        @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getIntFlow$$inlined$map$2", f = "PreferenceDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return t.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;

            @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getIntFlow$$inlined$map$2$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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
                    Object objC = ((zn20) obj).c(co20.d(this.b));
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

        public t(yzh yzhVar, String str) {
            this.a = yzhVar;
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

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {150, 152}, m = "putFloat", v = 2)
    public static final class t0 extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public t0(v1b<? super t0> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return zed.this.putFloat(null, null, this);
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getIntFlow$1", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class u extends tje0 implements gaj<myh<? super zn20>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super zn20> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            u uVar = new u(3, v1bVar);
            uVar.a = th;
            return uVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.o(th);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$putFloat$2", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class u0 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<Float> b;
        public final /* synthetic */ Float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(zn20.a<Float> aVar, Float f, v1b<? super u0> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
            this.c = f;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            u0 u0Var = new u0(this.b, this.c, v1bVar);
            u0Var.a = obj;
            return u0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((u0) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.getClass();
            jtwVar.h(this.b, this.c);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getIntFlow$3", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class v extends tje0 implements gaj<myh<? super zn20>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super zn20> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            v vVar = new v(3, v1bVar);
            vVar.a = th;
            return vVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.o(th);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$putFloat$3", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class v0 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<Float> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(zn20.a<Float> aVar, v1b<? super v0> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            v0 v0Var = new v0(this.b, v1bVar);
            v0Var.a = obj;
            return v0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((v0) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.f(this.b);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {137}, m = "getLong", v = 2)
    public static final class w extends x1b {
        public long a;
        public /* synthetic */ Object b;
        public int d;

        public w(v1b<? super w> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return zed.this.getLong(null, 0L, this);
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {90, 92}, m = "putInt", v = 2)
    public static final class w0 extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public w0(v1b<? super w0> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return zed.this.putInt(null, null, this);
        }
    }

    public static final class x implements lyh<Long> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getLongByFlow$$inlined$map$1", f = "PreferenceDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return x.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;
            public final /* synthetic */ long c;

            @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getLongByFlow$$inlined$map$1$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, String str, long j) {
                this.a = myhVar;
                this.b = str;
                this.c = j;
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
                    Long l = (Long) ((zn20) obj).c(co20.e(this.b));
                    Long l2 = new Long(l != null ? l.longValue() : this.c);
                    aVar.b = 1;
                    if (this.a.emit(l2, aVar) == y5bVar) {
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

        public x(yzh yzhVar, String str, long j) {
            this.a = yzhVar;
            this.b = str;
            this.c = j;
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
                b bVar = new b(myhVar, this.b, this.c);
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

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$putInt$2", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class x0 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<Integer> b;
        public final /* synthetic */ Integer c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(zn20.a<Integer> aVar, Integer num, v1b<? super x0> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
            this.c = num;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            x0 x0Var = new x0(this.b, this.c, v1bVar);
            x0Var.a = obj;
            return x0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((x0) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.getClass();
            jtwVar.h(this.b, this.c);
            return Unit.a;
        }
    }

    public static final class y implements lyh<Long> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ String b;

        @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getLongByFlow$$inlined$map$2", f = "PreferenceDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
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
                return y.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;

            @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getLongByFlow$$inlined$map$2$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
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
                    Object objC = ((zn20) obj).c(co20.e(this.b));
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

        public y(yzh yzhVar, String str) {
            this.a = yzhVar;
            this.b = str;
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

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$putInt$3", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class y0 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<Integer> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(zn20.a<Integer> aVar, v1b<? super y0> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            y0 y0Var = new y0(this.b, v1bVar);
            y0Var.a = obj;
            return y0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((y0) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtwVar.f(this.b);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getLongByFlow$1", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class z extends tje0 implements gaj<myh<? super zn20>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super zn20> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            z zVar = new z(3, v1bVar);
            zVar.a = th;
            return zVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.o(th);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore", f = "PreferenceDataStoreImpl.kt", l = {128, 130}, m = "putLong", v = 2)
    public static final class z0 extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public z0(v1b<? super z0> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return zed.this.putLong(null, null, this);
        }
    }

    public zed(sqc<zn20> sqcVar) {
        sqcVar.getClass();
        this.a = sqcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v1b<? super Unit> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i3 = aVar.c;
        if (i3 == 0) {
            uj50.b(obj);
            b bVar = new b(2, null);
            aVar.c = 1;
            if (do20.a(this.a, bVar, aVar) == y5bVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, v1b<? super Unit> v1bVar) {
        e eVar;
        if (v1bVar instanceof e) {
            eVar = (e) v1bVar;
            int i2 = eVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.c = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(v1bVar);
            }
        } else {
            eVar = new e(v1bVar);
        }
        Object obj = eVar.a;
        y5b y5bVar = y5b.a;
        int i3 = eVar.c;
        if (i3 == 0) {
            uj50.b(obj);
            f fVar = new f(str, null);
            eVar.c = 1;
            if (do20.a(this.a, fVar, eVar) == y5bVar) {
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

    public final void c(String str, String str2, tqc<String> tqcVar, v5b v5bVar) {
        str.getClass();
        str2.getClass();
        tqcVar.getClass();
        v5bVar.getClass();
        pfd pfdVar = fse.a;
        ej5.c(v5bVar, odd.b, null, new c0(str, str2, tqcVar, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.dn20
    public final <T> Object clearPreference(zn20.a<T> aVar, v1b<? super Unit> v1bVar) {
        c cVar;
        if (v1bVar instanceof c) {
            cVar = (c) v1bVar;
            int i2 = cVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.c = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(v1bVar);
            }
        } else {
            cVar = new c(v1bVar);
        }
        Object obj = cVar.a;
        y5b y5bVar = y5b.a;
        int i3 = cVar.c;
        if (i3 == 0) {
            uj50.b(obj);
            d dVar = new d(aVar, null);
            cVar.c = 1;
            if (do20.a(this.a, dVar, cVar) == y5bVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, v1b<? super Set<String>> v1bVar) {
        h0 h0Var;
        if (v1bVar instanceof h0) {
            h0Var = (h0) v1bVar;
            int i2 = h0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(v1bVar);
            }
        } else {
            h0Var = new h0(v1bVar);
        }
        Object objA = h0Var.b;
        y5b y5bVar = y5b.a;
        int i3 = h0Var.d;
        if (i3 == 0) {
            uj50.b(objA);
            lyh<zn20> lyhVarK = this.a.k();
            h0Var.a = str;
            h0Var.d = 1;
            objA = s0i.a(lyhVarK, h0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = h0Var.a;
            uj50.b(objA);
        }
        return ((zn20) objA).c(co20.g(str));
    }

    public final lyh<Set<String>> e(String str, Set<String> set) {
        str.getClass();
        set.getClass();
        return new i0(new yzh(this.a.k(), new j0(3, null)), new zn20.a(str), set);
    }

    public final <T> Object f(zn20.a<T> aVar, v1b<? super T> v1bVar) {
        return s0i.c(new k0(new yzh(this.a.k(), new l0(3, null)), aVar), v1bVar);
    }

    public final <T> lyh<Boolean> g(zn20.a<T> aVar) {
        aVar.getClass();
        return new m0(this.a.k(), aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.dn20
    public final Object getBoolean(String str, boolean z2, v1b<? super Boolean> v1bVar) {
        g gVar;
        if (v1bVar instanceof g) {
            gVar = (g) v1bVar;
            int i2 = gVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.d = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(v1bVar);
            }
        } else {
            gVar = new g(v1bVar);
        }
        Object objF = gVar.b;
        y5b y5bVar = y5b.a;
        int i3 = gVar.d;
        boolean zBooleanValue = true;
        if (i3 == 0) {
            uj50.b(objF);
            zn20.a<Boolean> aVarA = co20.a(str);
            gVar.a = z2;
            gVar.d = 1;
            objF = f(aVarA, gVar);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = gVar.a;
            uj50.b(objF);
        }
        Boolean bool = (Boolean) objF;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (!z2) {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // defpackage.dn20
    public final lyh<Boolean> getBooleanByFlow(String str) {
        str.getClass();
        return new i(new yzh(this.a.k(), new k(3, null)), str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.dn20
    public final Object getDouble(String str, double d2, v1b<? super Double> v1bVar) {
        l lVar;
        if (v1bVar instanceof l) {
            lVar = (l) v1bVar;
            int i2 = lVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.d = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(v1bVar);
            }
        } else {
            lVar = new l(v1bVar);
        }
        Object objF = lVar.b;
        y5b y5bVar = y5b.a;
        int i3 = lVar.d;
        if (i3 == 0) {
            uj50.b(objF);
            zn20.a<Double> aVarB = co20.b(str);
            lVar.a = d2;
            lVar.d = 1;
            objF = f(aVarB, lVar);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d2 = lVar.a;
            uj50.b(objF);
        }
        Double d3 = (Double) objF;
        if (d3 != null) {
            d2 = d3.doubleValue();
        }
        return new Double(d2);
    }

    @Override // defpackage.dn20
    public final lyh<Double> getDoubleByFlow(String str) {
        str.getClass();
        return new n(this.a.k(), str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.dn20
    public final Object getFloat(String str, float f2, v1b<? super Float> v1bVar) {
        o oVar;
        if (v1bVar instanceof o) {
            oVar = (o) v1bVar;
            int i2 = oVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.d = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(v1bVar);
            }
        } else {
            oVar = new o(v1bVar);
        }
        Object objF = oVar.b;
        y5b y5bVar = y5b.a;
        int i3 = oVar.d;
        if (i3 == 0) {
            uj50.b(objF);
            zn20.a<Float> aVarC = co20.c(str);
            oVar.a = f2;
            oVar.d = 1;
            objF = f(aVarC, oVar);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = oVar.a;
            uj50.b(objF);
        }
        Float f3 = (Float) objF;
        if (f3 != null) {
            f2 = f3.floatValue();
        }
        return new Float(f2);
    }

    @Override // defpackage.dn20
    public final lyh<Float> getFloatByFlow(String str) {
        str.getClass();
        return new q(this.a.k(), str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.dn20
    public final Object getInt(String str, int i2, v1b<? super Integer> v1bVar) {
        r rVar;
        if (v1bVar instanceof r) {
            rVar = (r) v1bVar;
            int i3 = rVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rVar.d = i3 - Integer.MIN_VALUE;
            } else {
                rVar = new r(v1bVar);
            }
        } else {
            rVar = new r(v1bVar);
        }
        Object objF = rVar.b;
        y5b y5bVar = y5b.a;
        int i4 = rVar.d;
        if (i4 == 0) {
            uj50.b(objF);
            zn20.a<Integer> aVarD = co20.d(str);
            rVar.a = i2;
            rVar.d = 1;
            objF = f(aVarD, rVar);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = rVar.a;
            uj50.b(objF);
        }
        Integer num = (Integer) objF;
        if (num != null) {
            i2 = num.intValue();
        }
        return new Integer(i2);
    }

    @Override // defpackage.dn20
    public final lyh<Integer> getIntFlow(String str) {
        str.getClass();
        return new t(new yzh(this.a.k(), new v(3, null)), str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.dn20
    public final Object getLong(String str, long j2, v1b<? super Long> v1bVar) {
        w wVar;
        if (v1bVar instanceof w) {
            wVar = (w) v1bVar;
            int i2 = wVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.d = i2 - Integer.MIN_VALUE;
            } else {
                wVar = new w(v1bVar);
            }
        } else {
            wVar = new w(v1bVar);
        }
        Object objF = wVar.b;
        y5b y5bVar = y5b.a;
        int i3 = wVar.d;
        if (i3 == 0) {
            uj50.b(objF);
            zn20.a<Long> aVarE = co20.e(str);
            wVar.a = j2;
            wVar.d = 1;
            objF = f(aVarE, wVar);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = wVar.a;
            uj50.b(objF);
        }
        Long l2 = (Long) objF;
        if (l2 != null) {
            j2 = l2.longValue();
        }
        return new Long(j2);
    }

    @Override // defpackage.dn20
    public final lyh<Long> getLongByFlow(String str) {
        str.getClass();
        return new y(new yzh(this.a.k(), new a0(3, null)), str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.dn20
    public final Object getString(String str, String str2, v1b<? super String> v1bVar) {
        b0 b0Var;
        if (v1bVar instanceof b0) {
            b0Var = (b0) v1bVar;
            int i2 = b0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(v1bVar);
            }
        } else {
            b0Var = new b0(v1bVar);
        }
        Object string = b0Var.b;
        Object obj = y5b.a;
        int i3 = b0Var.d;
        if (i3 == 0) {
            uj50.b(string);
            b0Var.a = str2;
            b0Var.d = 1;
            string = getString(str, b0Var);
            if (string == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = b0Var.a;
            uj50.b(string);
        }
        String str3 = (String) string;
        return str3 == null ? str2 : str3;
    }

    @Override // defpackage.dn20
    public final lyh<String> getStringByFlow(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new d0(new yzh(this.a.k(), new f0(3, null)), str, str2);
    }

    public final void h(String str, String str2, tqc<String> tqcVar, v5b v5bVar) {
        str.getClass();
        str2.getClass();
        tqcVar.getClass();
        v5bVar.getClass();
        pfd pfdVar = fse.a;
        ej5.c(v5bVar, odd.b, null, new f1(str, str2, tqcVar, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, Set<String> set, v1b<? super Unit> v1bVar) {
        g1 g1Var;
        if (v1bVar instanceof g1) {
            g1Var = (g1) v1bVar;
            int i2 = g1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                g1Var = new g1(v1bVar);
            }
        } else {
            g1Var = new g1(v1bVar);
        }
        Object obj = g1Var.a;
        y5b y5bVar = y5b.a;
        int i3 = g1Var.c;
        if (i3 == 0) {
            uj50.b(obj);
            h1 h1Var = new h1(co20.g(str), set, null);
            g1Var.c = 1;
            if (do20.a(this.a, h1Var, g1Var) == y5bVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (defpackage.do20.a(r6, r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (defpackage.do20.a(r6, r8, r0) == r1) goto L25;
     */
    @Override // defpackage.dn20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object putBoolean(java.lang.String r7, java.lang.Boolean r8, defpackage.v1b<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof zed.n0
            if (r0 == 0) goto L13
            r0 = r9
            zed$n0 r0 = (zed.n0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zed$n0 r0 = new zed$n0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.uj50.b(r9)
            goto L5f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L31:
            defpackage.uj50.b(r9)
            goto L4e
        L35:
            defpackage.uj50.b(r9)
            zn20$a r7 = defpackage.co20.a(r7)
            sqc<zn20> r6 = r6.a
            if (r8 == 0) goto L51
            zed$o0 r9 = new zed$o0
            r9.<init>(r7, r8, r5)
            r0.c = r4
            java.lang.Object r6 = defpackage.do20.a(r6, r9, r0)
            if (r6 != r1) goto L4e
            goto L5e
        L4e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L51:
            zed$p0 r8 = new zed$p0
            r8.<init>(r7, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.do20.a(r6, r8, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zed.putBoolean(java.lang.String, java.lang.Boolean, v1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (defpackage.do20.a(r6, r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (defpackage.do20.a(r6, r8, r0) == r1) goto L25;
     */
    @Override // defpackage.dn20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object putDouble(java.lang.String r7, java.lang.Double r8, defpackage.v1b<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof zed.q0
            if (r0 == 0) goto L13
            r0 = r9
            zed$q0 r0 = (zed.q0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zed$q0 r0 = new zed$q0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.uj50.b(r9)
            goto L5f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L31:
            defpackage.uj50.b(r9)
            goto L4e
        L35:
            defpackage.uj50.b(r9)
            zn20$a r7 = defpackage.co20.b(r7)
            sqc<zn20> r6 = r6.a
            if (r8 == 0) goto L51
            zed$r0 r9 = new zed$r0
            r9.<init>(r7, r8, r5)
            r0.c = r4
            java.lang.Object r6 = defpackage.do20.a(r6, r9, r0)
            if (r6 != r1) goto L4e
            goto L5e
        L4e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L51:
            zed$s0 r8 = new zed$s0
            r8.<init>(r7, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.do20.a(r6, r8, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zed.putDouble(java.lang.String, java.lang.Double, v1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (defpackage.do20.a(r6, r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (defpackage.do20.a(r6, r8, r0) == r1) goto L25;
     */
    @Override // defpackage.dn20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object putFloat(java.lang.String r7, java.lang.Float r8, defpackage.v1b<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof zed.t0
            if (r0 == 0) goto L13
            r0 = r9
            zed$t0 r0 = (zed.t0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zed$t0 r0 = new zed$t0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.uj50.b(r9)
            goto L5f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L31:
            defpackage.uj50.b(r9)
            goto L4e
        L35:
            defpackage.uj50.b(r9)
            zn20$a r7 = defpackage.co20.c(r7)
            sqc<zn20> r6 = r6.a
            if (r8 == 0) goto L51
            zed$u0 r9 = new zed$u0
            r9.<init>(r7, r8, r5)
            r0.c = r4
            java.lang.Object r6 = defpackage.do20.a(r6, r9, r0)
            if (r6 != r1) goto L4e
            goto L5e
        L4e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L51:
            zed$v0 r8 = new zed$v0
            r8.<init>(r7, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.do20.a(r6, r8, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zed.putFloat(java.lang.String, java.lang.Float, v1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (defpackage.do20.a(r6, r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (defpackage.do20.a(r6, r8, r0) == r1) goto L25;
     */
    @Override // defpackage.dn20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object putInt(java.lang.String r7, java.lang.Integer r8, defpackage.v1b<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof zed.w0
            if (r0 == 0) goto L13
            r0 = r9
            zed$w0 r0 = (zed.w0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zed$w0 r0 = new zed$w0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.uj50.b(r9)
            goto L5f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L31:
            defpackage.uj50.b(r9)
            goto L4e
        L35:
            defpackage.uj50.b(r9)
            zn20$a r7 = defpackage.co20.d(r7)
            sqc<zn20> r6 = r6.a
            if (r8 == 0) goto L51
            zed$x0 r9 = new zed$x0
            r9.<init>(r7, r8, r5)
            r0.c = r4
            java.lang.Object r6 = defpackage.do20.a(r6, r9, r0)
            if (r6 != r1) goto L4e
            goto L5e
        L4e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L51:
            zed$y0 r8 = new zed$y0
            r8.<init>(r7, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.do20.a(r6, r8, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zed.putInt(java.lang.String, java.lang.Integer, v1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (defpackage.do20.a(r6, r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (defpackage.do20.a(r6, r8, r0) == r1) goto L25;
     */
    @Override // defpackage.dn20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object putLong(java.lang.String r7, java.lang.Long r8, defpackage.v1b<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof zed.z0
            if (r0 == 0) goto L13
            r0 = r9
            zed$z0 r0 = (zed.z0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zed$z0 r0 = new zed$z0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.uj50.b(r9)
            goto L5f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L31:
            defpackage.uj50.b(r9)
            goto L4e
        L35:
            defpackage.uj50.b(r9)
            zn20$a r7 = defpackage.co20.e(r7)
            sqc<zn20> r6 = r6.a
            if (r8 == 0) goto L51
            zed$a1 r9 = new zed$a1
            r9.<init>(r7, r8, r5)
            r0.c = r4
            java.lang.Object r6 = defpackage.do20.a(r6, r9, r0)
            if (r6 != r1) goto L4e
            goto L5e
        L4e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L51:
            zed$b1 r8 = new zed$b1
            r8.<init>(r7, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.do20.a(r6, r8, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zed.putLong(java.lang.String, java.lang.Long, v1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (defpackage.do20.a(r6, r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (defpackage.do20.a(r6, r8, r0) == r1) goto L25;
     */
    @Override // defpackage.dn20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object putString(java.lang.String r7, java.lang.String r8, defpackage.v1b<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof zed.c1
            if (r0 == 0) goto L13
            r0 = r9
            zed$c1 r0 = (zed.c1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zed$c1 r0 = new zed$c1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.uj50.b(r9)
            goto L5f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L31:
            defpackage.uj50.b(r9)
            goto L4e
        L35:
            defpackage.uj50.b(r9)
            zn20$a r7 = defpackage.co20.f(r7)
            sqc<zn20> r6 = r6.a
            if (r8 == 0) goto L51
            zed$d1 r9 = new zed$d1
            r9.<init>(r7, r8, r5)
            r0.c = r4
            java.lang.Object r6 = defpackage.do20.a(r6, r9, r0)
            if (r6 != r1) goto L4e
            goto L5e
        L4e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L51:
            zed$e1 r8 = new zed$e1
            r8.<init>(r7, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.do20.a(r6, r8, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zed.putString(java.lang.String, java.lang.String, v1b):java.lang.Object");
    }

    @Override // defpackage.dn20
    public final lyh<Double> getDoubleByFlow(String str, double d2) {
        str.getClass();
        return new m(this.a.k(), str, d2);
    }

    @Override // defpackage.dn20
    public final lyh<Float> getFloatByFlow(String str, float f2) {
        str.getClass();
        return new p(this.a.k(), str, f2);
    }

    @Override // defpackage.dn20
    public final lyh<Boolean> getBooleanByFlow(String str, boolean z2) {
        str.getClass();
        return new h(new yzh(this.a.k(), new j(3, null)), str, z2);
    }

    @Override // defpackage.dn20
    public final lyh<Integer> getIntFlow(String str, int i2) {
        str.getClass();
        return new s(new yzh(this.a.k(), new u(3, null)), str, i2);
    }

    @Override // defpackage.dn20
    public final lyh<Long> getLongByFlow(String str, long j2) {
        str.getClass();
        return new x(new yzh(this.a.k(), new z(3, null)), str, j2);
    }

    @Override // defpackage.dn20
    public final lyh<String> getStringByFlow(String str) {
        str.getClass();
        return new e0(new yzh(this.a.k(), new g0(3, null)), str);
    }

    @Override // defpackage.dn20
    public final Object getString(String str, v1b<? super String> v1bVar) {
        return f(co20.f(str), v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getDouble(String str, v1b<? super Double> v1bVar) {
        return f(co20.b(str), v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getFloat(String str, v1b<? super Float> v1bVar) {
        return f(co20.c(str), v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getInt(String str, v1b<? super Integer> v1bVar) {
        return f(co20.d(str), v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getLong(String str, v1b<? super Long> v1bVar) {
        return f(co20.e(str), v1bVar);
    }

    @Override // defpackage.dn20
    public final Object getBoolean(String str, v1b<? super Boolean> v1bVar) {
        return f(co20.a(str), v1bVar);
    }
}
