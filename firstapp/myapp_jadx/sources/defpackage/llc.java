package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", l = {72}, m = "invokeSuspend")
public final class llc extends tje0 implements Function2<v5b, v1b<Object>, Object> {
    public int a;
    public final /* synthetic */ CoroutineContext b;
    public final /* synthetic */ lv50 c;
    public final /* synthetic */ jv50 d;

    @c0d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1", f = "DBUtil.android.kt", l = {260}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<Object>, Object> {
        public int a;
        public final /* synthetic */ lv50 b;
        public final /* synthetic */ jv50 c;

        /* JADX INFO: renamed from: llc$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
        public static final class C0819a extends tje0 implements Function2<crg0, v1b<Object>, Object> {
            public crg0.a a;
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ boolean d;
            public final /* synthetic */ lv50 e;
            public final /* synthetic */ jv50 f;

            /* JADX INFO: renamed from: llc$a$a$a, reason: collision with other inner class name */
            @c0d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
            public static final class C0820a extends tje0 implements Function2<sqg0<Object>, v1b<Object>, Object> {
                public /* synthetic */ Object a;
                public final /* synthetic */ jv50 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0820a(v1b v1bVar, jv50 jv50Var) {
                    super(2, v1bVar);
                    this.b = jv50Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C0820a c0820a = new C0820a(v1bVar, this.b);
                    c0820a.a = obj;
                    return c0820a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(sqg0<Object> sqg0Var, v1b<Object> v1bVar) {
                    return ((C0820a) create(sqg0Var, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    sqg0 sqg0Var = (sqg0) this.a;
                    sqg0Var.getClass();
                    return this.b.invoke(((r040) sqg0Var).d());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0819a(boolean z, lv50 lv50Var, v1b v1bVar, jv50 jv50Var) {
                super(2, v1bVar);
                this.d = z;
                this.e = lv50Var;
                this.f = jv50Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0819a c0819a = new C0819a(this.d, this.e, v1bVar, this.f);
                c0819a.c = obj;
                return c0819a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(crg0 crg0Var, v1b<Object> v1bVar) {
                return ((C0819a) create(crg0Var, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:31:0x008f A[PHI: r1 r11
              0x008f: PHI (r1v8 crg0) = (r1v5 crg0), (r1v13 crg0) binds: [B:29:0x008c, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
              0x008f: PHI (r11v14 java.lang.Object) = (r11v12 java.lang.Object), (r11v0 java.lang.Object) binds: [B:29:0x008c, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:34:0x009a  */
            /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                crg0.a aVar;
                crg0 crg0Var;
                crg0.a aVar2;
                crg0 crg0Var2;
                crg0 crg0Var3;
                Boolean boolB;
                Object obj2;
                y5b y5bVar = y5b.a;
                int i = this.b;
                jv50 jv50Var = this.f;
                lv50 lv50Var = this.e;
                if (i == 0) {
                    uj50.b(obj);
                    crg0 crg0Var4 = (crg0) this.c;
                    if (!this.d) {
                        crg0Var4.getClass();
                        return jv50Var.invoke(((r040) crg0Var4).d());
                    }
                    aVar = crg0.a.b;
                    this.c = crg0Var4;
                    this.a = aVar;
                    this.b = 1;
                    Boolean boolB2 = crg0Var4.b(this);
                    if (boolB2 != y5bVar) {
                        crg0Var = crg0Var4;
                        obj = boolB2;
                    }
                    return y5bVar;
                }
                if (i == 1) {
                    aVar = this.a;
                    crg0Var = (crg0) this.c;
                    uj50.b(obj);
                } else {
                    if (i == 2) {
                        aVar = this.a;
                        crg0Var3 = (crg0) this.c;
                        uj50.b(obj);
                        aVar2 = aVar;
                        crg0Var2 = crg0Var3;
                        C0820a c0820a = new C0820a(null, jv50Var);
                        this.c = crg0Var2;
                        this.a = null;
                        this.b = 3;
                        obj = crg0Var2.a(aVar2, c0820a, this);
                        if (obj != y5bVar) {
                            this.c = obj;
                            this.b = 4;
                            boolB = crg0Var2.b(this);
                            if (boolB != y5bVar) {
                                Object obj3 = obj;
                                obj = boolB;
                                obj2 = obj3;
                            }
                        }
                        return y5bVar;
                    }
                    if (i == 3) {
                        crg0Var2 = (crg0) this.c;
                        uj50.b(obj);
                        this.c = obj;
                        this.b = 4;
                        boolB = crg0Var2.b(this);
                        if (boolB != y5bVar) {
                            Object obj4 = obj;
                            obj = boolB;
                            obj2 = obj4;
                        }
                        return y5bVar;
                    }
                    if (i != 4) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.c;
                    uj50.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    o0p o0pVarJ = lv50Var.j();
                    o0pVarJ.b.d(o0pVarJ.e, o0pVarJ.f);
                }
                return obj2;
                if (((Boolean) obj).booleanValue()) {
                    aVar2 = aVar;
                    crg0Var2 = crg0Var;
                    C0820a c0820a2 = new C0820a(null, jv50Var);
                    this.c = crg0Var2;
                    this.a = null;
                    this.b = 3;
                    obj = crg0Var2.a(aVar2, c0820a2, this);
                    if (obj != y5bVar) {
                        this.c = obj;
                        this.b = 4;
                        boolB = crg0Var2.b(this);
                        if (boolB != y5bVar) {
                            Object obj5 = obj;
                            obj = boolB;
                            obj2 = obj5;
                            if (!((Boolean) obj).booleanValue()) {
                                o0p o0pVarJ2 = lv50Var.j();
                                o0pVarJ2.b.d(o0pVarJ2.e, o0pVarJ2.f);
                            }
                            return obj2;
                        }
                    }
                } else {
                    o0p o0pVarJ3 = lv50Var.j();
                    this.c = crg0Var;
                    this.a = aVar;
                    this.b = 2;
                    if (o0pVarJ3.b(this) != y5bVar) {
                        crg0Var3 = crg0Var;
                        aVar2 = aVar;
                        crg0Var2 = crg0Var3;
                        C0820a c0820a3 = new C0820a(null, jv50Var);
                        this.c = crg0Var2;
                        this.a = null;
                        this.b = 3;
                        obj = crg0Var2.a(aVar2, c0820a3, this);
                        if (obj != y5bVar) {
                            this.c = obj;
                            this.b = 4;
                            boolB = crg0Var2.b(this);
                            if (boolB != y5bVar) {
                                Object obj6 = obj;
                                obj = boolB;
                                obj2 = obj6;
                                if (!((Boolean) obj).booleanValue()) {
                                    o0p o0pVarJ4 = lv50Var.j();
                                    o0pVarJ4.b.d(o0pVarJ4.e, o0pVarJ4.f);
                                }
                                return obj2;
                            }
                        }
                    }
                }
                return y5bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lv50 lv50Var, jv50 jv50Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = lv50Var;
            this.c = jv50Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            lv50 lv50Var = this.b;
            C0819a c0819a = new C0819a((lv50Var.p() && lv50Var.q()) ? false : true, lv50Var, null, this.c);
            this.a = 1;
            Object objW = lv50Var.w(false, c0819a, this);
            return objW == y5bVar ? y5bVar : objW;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llc(CoroutineContext coroutineContext, lv50 lv50Var, jv50 jv50Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = coroutineContext;
        this.c = lv50Var;
        this.d = jv50Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new llc(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
        return ((llc) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        a aVar = new a(this.c, this.d, null);
        this.a = 1;
        Object objD = ej5.d(this.b, aVar, this);
        return objD == y5bVar ? y5bVar : objD;
    }
}
