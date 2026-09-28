package defpackage;

import android.util.Log;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x390 implements w390 {
    public final hh80 a;
    public final pg80 b;
    public final lg80 c;
    public final vwf0 d;
    public final sqc<bg80> e;
    public final yw20 f;
    public final CoroutineContext g;
    public bg80 h;
    public boolean i;
    public String j;

    @c0d(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", f = "SharedSessionRepository.kt", l = {94}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: x390$a$a, reason: collision with other inner class name */
        @c0d(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", f = "SharedSessionRepository.kt", l = {92}, m = "invokeSuspend")
        public static final class C1272a extends tje0 implements gaj<myh<? super bg80>, Throwable, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Throwable c;
            public final /* synthetic */ x390 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1272a(x390 x390Var, v1b<? super C1272a> v1bVar) {
                super(3, v1bVar);
                this.d = x390Var;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<? super bg80> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
                C1272a c1272a = new C1272a(this.d, v1bVar);
                c1272a.b = myhVar;
                c1272a.c = th;
                return c1272a.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    myh myhVar = this.b;
                    Throwable th = this.c;
                    eg80 eg80VarA = this.d.b.a(null);
                    bg80 bg80Var = new bg80(eg80VarA, null, null);
                    Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + eg80VarA.a);
                    this.b = null;
                    this.a = 1;
                    if (myhVar.emit(bg80Var, this) == y5bVar) {
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

        public static final class b<T> implements myh {
            public final /* synthetic */ x390 a;

            public b(x390 x390Var) {
                this.a = x390Var;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                bg80 bg80Var = (bg80) obj;
                bg80Var.getClass();
                x390 x390Var = this.a;
                x390Var.h = bg80Var;
                Object objF = x390Var.f(bg80Var.a.a, b.a, v1bVar);
                return objF == y5b.a ? objF : Unit.a;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return x390.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                x390 x390Var = x390.this;
                yzh yzhVar = new yzh(x390Var.e.k(), new C1272a(x390Var, null));
                b bVar = new b(x390Var);
                this.a = 1;
                if (yzhVar.collect(bVar, this) == y5bVar) {
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final /* synthetic */ b[] c;

        static {
            b bVar = new b("GENERAL", 0);
            a = bVar;
            b bVar2 = new b("FALLBACK", 1);
            b = bVar2;
            c = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    @c0d(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", f = "SharedSessionRepository.kt", l = {112}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        @c0d(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
        public static final class a extends tje0 implements Function2<bg80, v1b<? super bg80>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ x390 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x390 x390Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = x390Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, v1bVar);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(bg80 bg80Var, v1b<? super bg80> v1bVar) {
                return ((a) create(bg80Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return bg80.a((bg80) this.a, null, this.b.d.a(), null, 5);
            }
        }

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return x390.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            x390 x390Var = x390.this;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    sqc<bg80> sqcVar = x390Var.e;
                    a aVar = new a(x390Var, null);
                    this.a = 1;
                    if (sqcVar.l(aVar, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
            } catch (Exception e) {
                Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
                bg80 bg80Var = x390Var.h;
                if (bg80Var == null) {
                    Intrinsics.n("localSessionData");
                    throw null;
                }
                x390Var.h = bg80.a(bg80Var, null, x390Var.d.a(), null, 5);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", l = {135, 186}, m = "invokeSuspend")
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ bg80 c;

        @c0d(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
        public static final class a extends tje0 implements Function2<bg80, v1b<? super bg80>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ x390 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x390 x390Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = x390Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, v1bVar);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(bg80 bg80Var, v1b<? super bg80> v1bVar) {
                return ((a) create(bg80Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                boolean zE;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                bg80 bg80Var = (bg80) this.a;
                x390 x390Var = this.b;
                yw20 yw20Var = x390Var.f;
                boolean zE2 = x390Var.e(bg80Var);
                Map<String, xw20> mapC = bg80Var.c;
                if (mapC != null) {
                    zE = yw20Var.e(mapC);
                    if (zE) {
                        Log.d("FirebaseSessions", "Cold app start detected");
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    zE = true;
                }
                boolean zD = x390Var.d(bg80Var);
                if (zE) {
                    mapC = yw20Var.f();
                } else if (zD) {
                    mapC = yw20Var.c(mapC);
                }
                eg80 eg80Var = zE ? null : bg80Var.a;
                if (!zE2 && !zE) {
                    return zD ? bg80.a(bg80Var, null, null, yw20Var.c(mapC), 3) : bg80Var;
                }
                eg80 eg80VarA = x390Var.b.a(eg80Var);
                x390Var.c.a(eg80VarA);
                yw20Var.d();
                return new bg80(eg80VarA, null, mapC);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(bg80 bg80Var, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.c = bg80Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return x390.this.new d(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        
            if (r6 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        
            if (r5.f(r7, r1, r6) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
        
            return r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.a
                r2 = 0
                r3 = 2
                r4 = 1
                x390 r5 = defpackage.x390.this
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L19
                if (r1 != r3) goto L13
                defpackage.uj50.b(r7)
                goto L72
            L13:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r2
            L19:
                defpackage.uj50.b(r7)     // Catch: java.lang.Exception -> L1d
                goto L72
            L1d:
                r7 = move-exception
                goto L32
            L1f:
                defpackage.uj50.b(r7)
                sqc<bg80> r7 = r5.e     // Catch: java.lang.Exception -> L1d
                x390$d$a r1 = new x390$d$a     // Catch: java.lang.Exception -> L1d
                r1.<init>(r5, r2)     // Catch: java.lang.Exception -> L1d
                r6.a = r4     // Catch: java.lang.Exception -> L1d
                java.lang.Object r6 = r7.l(r1, r6)     // Catch: java.lang.Exception -> L1d
                if (r6 != r0) goto L72
                goto L71
            L32:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "App foregrounded, failed to update data. Message: "
                r1.<init>(r4)
                java.lang.String r7 = r7.getMessage()
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                java.lang.String r1 = "FirebaseSessions"
                android.util.Log.d(r1, r7)
                bg80 r7 = r6.c
                boolean r1 = r5.e(r7)
                if (r1 == 0) goto L72
                pg80 r1 = r5.b
                eg80 r4 = r7.a
                eg80 r1 = r1.a(r4)
                r4 = 4
                bg80 r7 = defpackage.bg80.a(r7, r1, r2, r2, r4)
                r5.h = r7
                lg80 r7 = r5.c
                r7.a(r1)
                java.lang.String r7 = r1.a
                x390$b r1 = x390.b.b
                r6.a = r3
                java.lang.Object r6 = r5.f(r7, r1, r6)
                if (r6 != r0) goto L72
            L71:
                return r0
            L72:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: x390.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", f = "SharedSessionRepository.kt", l = {199}, m = "notifySubscribers")
    public static final class e extends x1b {
        public String a;
        public b b;
        public /* synthetic */ Object c;
        public int e;

        public e(v1b<? super e> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return x390.this.f(null, null, this);
        }
    }

    public x390(hh80 hh80Var, pg80 pg80Var, lg80 lg80Var, vwf0 vwf0Var, sqc<bg80> sqcVar, yw20 yw20Var, @is1 CoroutineContext coroutineContext) {
        hh80Var.getClass();
        pg80Var.getClass();
        lg80Var.getClass();
        vwf0Var.getClass();
        sqcVar.getClass();
        yw20Var.getClass();
        coroutineContext.getClass();
        this.a = hh80Var;
        this.b = pg80Var;
        this.c = lg80Var;
        this.d = vwf0Var;
        this.e = sqcVar;
        this.f = yw20Var;
        this.g = coroutineContext;
        b bVar = b.a;
        this.j = "";
        ej5.c(w5b.a(coroutineContext), null, null, new a(null), 3);
    }

    @Override // defpackage.w390
    public final boolean a() {
        return this.i;
    }

    @Override // defpackage.w390
    public final void b() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        ej5.c(w5b.a(this.g), null, null, new c(null), 3);
    }

    @Override // defpackage.w390
    public final void c() {
        this.i = true;
        bg80 bg80Var = this.h;
        if (bg80Var == null) {
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        if (bg80Var == null) {
            Intrinsics.n("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
        if (e(bg80Var) || d(bg80Var)) {
            ej5.c(w5b.a(this.g), null, null, new d(bg80Var, null), 3);
        }
    }

    public final boolean d(bg80 bg80Var) {
        Map<String, xw20> map = bg80Var.c;
        yw20 yw20Var = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + yw20Var.a());
            return true;
        }
        boolean zB = yw20Var.b(map);
        if (zB) {
            Log.d("FirebaseSessions", "Process " + yw20Var.a() + " is stale");
        }
        return zB;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    public final boolean e(bg80 bg80Var) {
        kotlin.time.b bVarC;
        long jH;
        ktf0 ktf0Var = bg80Var.b;
        eg80 eg80Var = bg80Var.a;
        if (ktf0Var == null) {
            Log.d("FirebaseSessions", "Session " + eg80Var.a + " has not backgrounded yet");
            return false;
        }
        ktf0 ktf0VarA = this.d.a();
        kotlin.time.b.a aVar = kotlin.time.b.b;
        long jI = kotlin.time.c.i(ktf0VarA.a - ktf0Var.a, rgf.MILLISECONDS);
        hh80 hh80Var = this.a;
        kotlin.time.b bVarC2 = hh80Var.a.c();
        if (bVarC2 != null) {
            jH = bVarC2.a;
            if (jH <= 0 || kotlin.time.b.h(jH)) {
                bVarC = hh80Var.b.c();
                if (bVarC != null) {
                    jH = bVarC.a;
                    if (jH > 0 || kotlin.time.b.h(jH)) {
                        jH = kotlin.time.c.h(30, rgf.MINUTES);
                    }
                } else {
                    jH = kotlin.time.c.h(30, rgf.MINUTES);
                }
            }
        } else {
            bVarC = hh80Var.b.c();
            if (bVarC != null) {
                jH = bVarC.a;
                if (jH > 0) {
                    jH = kotlin.time.c.h(30, rgf.MINUTES);
                } else {
                    jH = kotlin.time.c.h(30, rgf.MINUTES);
                }
            } else {
                jH = kotlin.time.c.h(30, rgf.MINUTES);
            }
        }
        boolean z = kotlin.time.b.c(jI, jH) > 0;
        if (z) {
            Log.d("FirebaseSessions", "Session " + eg80Var.a + " is expired");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, b bVar, v1b<? super Unit> v1bVar) {
        e eVar;
        String string;
        if (v1bVar instanceof e) {
            eVar = (e) v1bVar;
            int i = eVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.e = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(v1bVar);
            }
        } else {
            eVar = new e(v1bVar);
        }
        Object objB = eVar.c;
        y5b y5bVar = y5b.a;
        int i2 = eVar.e;
        if (i2 == 0) {
            uj50.b(objB);
            if (Intrinsics.g(this.j, str)) {
                return Unit.a;
            }
            this.j = str;
            ssh sshVar = ssh.a;
            eVar.a = str;
            eVar.b = bVar;
            eVar.e = 1;
            objB = sshVar.b(eVar);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = eVar.b;
            str = eVar.a;
            uj50.b(objB);
        }
        for (ch80 ch80Var : ((Map) objB).values()) {
            ch80Var.b(new ch80.b(str));
            int iOrdinal = bVar.ordinal();
            if (iOrdinal == 0) {
                StringBuilder sb = new StringBuilder("Notified ");
                ch80Var.c();
                sb.append(ch80.a.a);
                sb.append(" of new session ");
                sb.append(str);
                string = sb.toString();
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                StringBuilder sb2 = new StringBuilder("Notified ");
                ch80Var.c();
                sb2.append(ch80.a.a);
                sb2.append(" of new fallback session ");
                sb2.append(str);
                string = sb2.toString();
            }
            Log.d("FirebaseSessions", string);
        }
        return Unit.a;
    }
}
