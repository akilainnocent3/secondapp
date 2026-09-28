package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2", f = "DBUtil.android.kt", l = {260}, m = "invokeSuspend")
public final class olc extends tje0 implements Function1<v1b<Object>, Object> {
    public int a;
    public final /* synthetic */ lv50 b;
    public final /* synthetic */ Function1<v1b<Object>, Object> c;

    @c0d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60, 172}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<crg0, v1b<Object>, Object> {
        public crg0.a a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ lv50 d;
        public final /* synthetic */ Function1 e;

        /* JADX INFO: renamed from: olc$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {60}, m = "invokeSuspend")
        public static final class C0946a extends tje0 implements Function2<sqg0<Object>, v1b<Object>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ Function1 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0946a(Function1 function1, v1b v1bVar) {
                super(2, v1bVar);
                this.c = function1;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0946a c0946a = new C0946a(this.c, v1bVar);
                c0946a.b = obj;
                return c0946a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(sqg0<Object> sqg0Var, v1b<Object> v1bVar) {
                return ((C0946a) create(sqg0Var, v1bVar)).invokeSuspend(Unit.a);
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
                this.a = 1;
                Object objInvoke = this.c.invoke(this);
                return objInvoke == y5bVar ? y5bVar : objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, lv50 lv50Var, Function1 function1) {
            super(2, v1bVar);
            this.d = lv50Var;
            this.e = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(v1bVar, this.d, this.e);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(crg0 crg0Var, v1b<Object> v1bVar) {
            return ((a) create(crg0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0092 A[PHI: r1 r10
          0x0092: PHI (r1v7 crg0) = (r1v4 crg0), (r1v12 crg0) binds: [B:31:0x008f, B:15:0x0029] A[DONT_GENERATE, DONT_INLINE]
          0x0092: PHI (r10v13 java.lang.Object) = (r10v11 java.lang.Object), (r10v0 java.lang.Object) binds: [B:31:0x008f, B:15:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:36:0x009d  */
        /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
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
            lv50 lv50Var = this.d;
            if (i == 0) {
                uj50.b(obj);
                crg0 crg0Var4 = (crg0) this.c;
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
                    C0946a c0946a = new C0946a(this.e, null);
                    this.c = crg0Var2;
                    this.a = null;
                    this.b = 3;
                    obj = crg0Var2.a(aVar2, c0946a, this);
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
                    if (i == 5) {
                        uj50.b(obj);
                        return obj;
                    }
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
                C0946a c0946a2 = new C0946a(this.e, null);
                this.c = crg0Var2;
                this.a = null;
                this.b = 3;
                obj = crg0Var2.a(aVar2, c0946a2, this);
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
                    C0946a c0946a3 = new C0946a(this.e, null);
                    this.c = crg0Var2;
                    this.a = null;
                    this.b = 3;
                    obj = crg0Var2.a(aVar2, c0946a3, this);
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
    public olc(v1b v1bVar, lv50 lv50Var, Function1 function1) {
        super(1, v1bVar);
        this.b = lv50Var;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new olc(v1bVar, this.b, this.c);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<Object> v1bVar) {
        return ((olc) create(v1bVar)).invokeSuspend(Unit.a);
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
        a aVar = new a(null, lv50Var, this.c);
        this.a = 1;
        Object objW = lv50Var.w(false, aVar, this);
        return objW == y5bVar ? y5bVar : objW;
    }
}
