package defpackage;

import android.database.Cursor;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qlc {

    @c0d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", l = {261}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<Object>, Object> {
        public int a;
        public final /* synthetic */ lv50 b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Function1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, lv50 lv50Var, Function1 function1, boolean z, boolean z2) {
            super(2, v1bVar);
            this.b = lv50Var;
            this.c = z;
            this.d = z2;
            this.e = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            boolean z = this.d;
            return new a(v1bVar, this.b, this.e, this.c, z);
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
            Function1 function1 = this.e;
            lv50 lv50Var = this.b;
            boolean z = this.d;
            boolean z2 = this.c;
            c cVar = new c(null, lv50Var, function1, z, z2);
            this.a = 1;
            Object objW = lv50Var.w(z2, cVar, this);
            return objW == y5bVar ? y5bVar : objW;
        }
    }

    @c0d(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {262, 264, 264}, m = "performSuspending")
    public static final class b<R> extends x1b {
        public lv50 a;
        public Function1 b;
        public boolean c;
        public boolean d;
        public /* synthetic */ Object e;
        public int f;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.f |= Integer.MIN_VALUE;
            return qlc.c(this, null, null, false, false);
        }
    }

    @c0d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<crg0, v1b<Object>, Object> {
        public crg0.a a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ lv50 f;
        public final /* synthetic */ Function1 i;

        @c0d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
        public static final class a extends tje0 implements Function2<sqg0<Object>, v1b<Object>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ Function1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Function1 function1, v1b v1bVar) {
                super(2, v1bVar);
                this.b = function1;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, v1bVar);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(sqg0<Object> sqg0Var, v1b<Object> v1bVar) {
                return ((a) create(sqg0Var, v1bVar)).invokeSuspend(Unit.a);
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
        public c(v1b v1bVar, lv50 lv50Var, Function1 function1, boolean z, boolean z2) {
            super(2, v1bVar);
            this.d = z;
            this.e = z2;
            this.f = lv50Var;
            this.i = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(v1bVar, this.f, this.i, this.d, this.e);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(crg0 crg0Var, v1b<Object> v1bVar) {
            return ((c) create(crg0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x009c A[DONT_INVERT, PHI: r1 r12
          0x009c: PHI (r1v11 crg0) = (r1v8 crg0), (r1v16 crg0) binds: [B:34:0x0099, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x009c: PHI (r12v15 java.lang.Object) = (r12v13 java.lang.Object), (r12v0 java.lang.Object) binds: [B:34:0x0099, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:37:0x009e  */
        /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c2 A[RETURN] */
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
            Function1 function1 = this.i;
            lv50 lv50Var = this.f;
            boolean z = this.e;
            if (i == 0) {
                uj50.b(obj);
                crg0 crg0Var4 = (crg0) this.c;
                if (!this.d) {
                    crg0Var4.getClass();
                    return function1.invoke(((r040) crg0Var4).d());
                }
                aVar = z ? crg0.a.a : crg0.a.b;
                if (z) {
                    crg0.a aVar3 = aVar;
                    crg0Var = crg0Var4;
                    aVar2 = aVar3;
                    a aVar4 = new a(function1, null);
                    this.c = crg0Var;
                    this.a = null;
                    this.b = 3;
                    obj = crg0Var.a(aVar2, aVar4, this);
                    if (obj != y5bVar) {
                        if (z) {
                            return obj;
                        }
                        this.c = obj;
                        this.b = 4;
                        boolB = crg0Var.b(this);
                        if (boolB != y5bVar) {
                            Object obj3 = obj;
                            obj = boolB;
                            obj2 = obj3;
                            if (!((Boolean) obj).booleanValue()) {
                                o0p o0pVarJ = lv50Var.j();
                                o0pVarJ.b.d(o0pVarJ.e, o0pVarJ.f);
                            }
                            return obj2;
                        }
                    }
                } else {
                    this.c = crg0Var4;
                    this.a = aVar;
                    this.b = 1;
                    Boolean boolB2 = crg0Var4.b(this);
                    if (boolB2 != y5bVar) {
                        crg0Var2 = crg0Var4;
                        obj = boolB2;
                    }
                }
                return y5bVar;
            }
            if (i == 1) {
                aVar = this.a;
                crg0Var2 = (crg0) this.c;
                uj50.b(obj);
            } else {
                if (i == 2) {
                    aVar = this.a;
                    crg0Var3 = (crg0) this.c;
                    uj50.b(obj);
                    aVar2 = aVar;
                    crg0Var = crg0Var3;
                    a aVar5 = new a(function1, null);
                    this.c = crg0Var;
                    this.a = null;
                    this.b = 3;
                    obj = crg0Var.a(aVar2, aVar5, this);
                    if (obj != y5bVar) {
                        if (z) {
                            return obj;
                        }
                        this.c = obj;
                        this.b = 4;
                        boolB = crg0Var.b(this);
                        if (boolB != y5bVar) {
                            Object obj4 = obj;
                            obj = boolB;
                            obj2 = obj4;
                        }
                    }
                    return y5bVar;
                }
                if (i == 3) {
                    crg0Var = (crg0) this.c;
                    uj50.b(obj);
                    if (z) {
                        return obj;
                    }
                    this.c = obj;
                    this.b = 4;
                    boolB = crg0Var.b(this);
                    if (boolB != y5bVar) {
                        Object obj5 = obj;
                        obj = boolB;
                        obj2 = obj5;
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
                o0p o0pVarJ2 = lv50Var.j();
                o0pVarJ2.b.d(o0pVarJ2.e, o0pVarJ2.f);
            }
            return obj2;
            if (((Boolean) obj).booleanValue()) {
                aVar2 = aVar;
                crg0Var = crg0Var2;
                a aVar6 = new a(function1, null);
                this.c = crg0Var;
                this.a = null;
                this.b = 3;
                obj = crg0Var.a(aVar2, aVar6, this);
                if (obj != y5bVar) {
                    if (z) {
                        return obj;
                    }
                    this.c = obj;
                    this.b = 4;
                    boolB = crg0Var.b(this);
                    if (boolB != y5bVar) {
                        Object obj6 = obj;
                        obj = boolB;
                        obj2 = obj6;
                        if (!((Boolean) obj).booleanValue()) {
                            o0p o0pVarJ3 = lv50Var.j();
                            o0pVarJ3.b.d(o0pVarJ3.e, o0pVarJ3.f);
                        }
                        return obj2;
                    }
                }
            } else {
                o0p o0pVarJ4 = lv50Var.j();
                this.c = crg0Var2;
                this.a = aVar;
                this.b = 2;
                if (o0pVarJ4.b(this) != y5bVar) {
                    crg0Var3 = crg0Var2;
                    aVar2 = aVar;
                    crg0Var = crg0Var3;
                    a aVar7 = new a(function1, null);
                    this.c = crg0Var;
                    this.a = null;
                    this.b = 3;
                    obj = crg0Var.a(aVar2, aVar7, this);
                    if (obj != y5bVar) {
                        if (z) {
                            return obj;
                        }
                        this.c = obj;
                        this.b = 4;
                        boolB = crg0Var.b(this);
                        if (boolB != y5bVar) {
                            Object obj7 = obj;
                            obj = boolB;
                            obj2 = obj7;
                            if (!((Boolean) obj).booleanValue()) {
                                o0p o0pVarJ5 = lv50Var.j();
                                o0pVarJ5.b.d(o0pVarJ5.e, o0pVarJ5.f);
                            }
                            return obj2;
                        }
                    }
                }
            }
            return y5bVar;
        }
    }

    public static final CoroutineContext a(lv50 lv50Var, boolean z, x1b x1bVar) {
        fqg0 fqg0Var = (fqg0) x1bVar.getContext().get(fqg0.b);
        CoroutineContext coroutineContext = fqg0Var != null ? fqg0Var.a : null;
        if (!lv50Var.p()) {
            j1b j1bVar = lv50Var.a;
            if (j1bVar == null) {
                Intrinsics.n("coroutineScope");
                throw null;
            }
            CoroutineContext coroutineContext2 = j1bVar.a;
            if (coroutineContext == null) {
                coroutineContext = e.a;
            }
            return coroutineContext2.plus(coroutineContext);
        }
        if (coroutineContext != null) {
            j1b j1bVar2 = lv50Var.a;
            if (j1bVar2 != null) {
                return j1bVar2.a.plus(coroutineContext);
            }
            Intrinsics.n("coroutineScope");
            throw null;
        }
        if (z) {
            CoroutineContext coroutineContext3 = lv50Var.b;
            if (coroutineContext3 != null) {
                return coroutineContext3;
            }
            Intrinsics.n("transactionContext");
            throw null;
        }
        j1b j1bVar3 = lv50Var.a;
        if (j1bVar3 != null) {
            return j1bVar3.a;
        }
        Intrinsics.n("coroutineScope");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(lv50 lv50Var, Function1 function1, x1b x1bVar) {
        nlc nlcVar;
        Function1 function2;
        if (x1bVar instanceof nlc) {
            nlcVar = (nlc) x1bVar;
            int i = nlcVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nlcVar.d = i - Integer.MIN_VALUE;
            } else {
                nlcVar = new nlc(x1bVar);
            }
        } else {
            nlcVar = new nlc(x1bVar);
        }
        Object objA = nlcVar.c;
        Object obj = y5b.a;
        int i2 = nlcVar.d;
        if (i2 == 0) {
            uj50.b(objA);
            if (lv50Var.p()) {
                olc olcVar = new olc(null, lv50Var, function1);
                nlcVar.d = 1;
                Object objC = qv50.c(nlcVar, lv50Var, olcVar);
                if (objC != obj) {
                    return objC;
                }
            } else if (lv50Var.p() && lv50Var.t() && lv50Var.q()) {
                plc plcVar = new plc(null, lv50Var, function1);
                nlcVar.d = 2;
                Object objW = lv50Var.w(false, plcVar, nlcVar);
                if (objW != obj) {
                    return objW;
                }
            } else {
                nlcVar.a = lv50Var;
                nlcVar.b = (tje0) function1;
                nlcVar.d = 3;
                objA = a(lv50Var, true, nlcVar);
                function2 = function1;
                if (objA != obj) {
                }
            }
        }
        if (i2 == 1) {
            uj50.b(objA);
            return objA;
        }
        if (i2 == 2) {
            uj50.b(objA);
            return objA;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                uj50.b(objA);
                return objA;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Function1 function3 = (Function1) nlcVar.b;
        lv50Var = nlcVar.a;
        uj50.b(objA);
        function2 = function3;
        mlc mlcVar = new mlc(null, lv50Var, function2);
        nlcVar.a = null;
        nlcVar.b = null;
        nlcVar.d = 4;
        Object objD = ej5.d((CoroutineContext) objA, mlcVar, nlcVar);
        return objD == obj ? obj : objD;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object c(v1b v1bVar, lv50 lv50Var, Function1 function1, boolean z, boolean z2) {
        b bVar;
        lv50 lv50Var2;
        Function1 function2;
        boolean z3;
        boolean z4;
        if (v1bVar instanceof b) {
            bVar = (b) v1bVar;
            int i = bVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(v1bVar);
            }
        } else {
            bVar = new b(v1bVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.e;
        y5b y5bVar = y5b.a;
        int i2 = bVar2.f;
        if (i2 == 0) {
            uj50.b(obj);
            if (lv50Var.p() && lv50Var.t() && lv50Var.q()) {
                c cVar = new c(null, lv50Var, function1, z2, z);
                bVar2.f = 1;
                Object objW = lv50Var.w(z, cVar, bVar2);
                if (objW != y5bVar) {
                    return objW;
                }
            } else {
                bVar2.a = lv50Var;
                bVar2.b = function1;
                bVar2.c = z;
                bVar2.d = z2;
                bVar2.f = 2;
                CoroutineContext coroutineContextA = a(lv50Var, z2, bVar2);
                if (coroutineContextA != y5bVar) {
                    lv50Var2 = lv50Var;
                    function2 = function1;
                    z3 = z2;
                    obj = coroutineContextA;
                    z4 = z;
                }
            }
        }
        if (i2 == 1) {
            uj50.b(obj);
            return obj;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z5 = bVar2.d;
        boolean z6 = bVar2.c;
        Function1 function3 = bVar2.b;
        lv50 lv50Var3 = bVar2.a;
        uj50.b(obj);
        z3 = z5;
        z4 = z6;
        function2 = function3;
        lv50Var2 = lv50Var3;
        a aVar = new a(null, lv50Var2, function2, z4, z3);
        bVar2.a = null;
        bVar2.b = null;
        bVar2.f = 3;
        Object objD = ej5.d((CoroutineContext) obj, aVar, bVar2);
        return objD == y5bVar ? y5bVar : objD;
    }

    public static final Cursor d(lv50 lv50Var, yfe0 yfe0Var) {
        lv50Var.getClass();
        lv50Var.a();
        lv50Var.b();
        return lv50Var.k().f1().w(yfe0Var);
    }
}
