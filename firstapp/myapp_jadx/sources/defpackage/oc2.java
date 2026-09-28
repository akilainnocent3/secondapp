package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class oc2 implements PointerInputEventHandler {
    public final /* synthetic */ b1g0 a;

    @c0d(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", l = {203}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ u020 c;
        public final /* synthetic */ b1g0 d;

        /* JADX INFO: renamed from: oc2$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", l = {210, 216, 238}, m = "invokeSuspend")
        public static final class C0924a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
            public ztw b;
            public c020 c;
            public long d;
            public int e;
            public /* synthetic */ Object f;
            public final /* synthetic */ v5b i;
            public final /* synthetic */ b1g0 v;

            /* JADX INFO: renamed from: oc2$a$a$a, reason: collision with other inner class name */
            @c0d(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", l = {217}, m = "invokeSuspend")
            public static final class C0925a extends ji50 implements Function2<vp1, v1b<? super m020>, Object> {
                public int b;
                public /* synthetic */ Object c;
                public final /* synthetic */ c020 d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0925a(c020 c020Var, v1b<? super C0925a> v1bVar) {
                    super(2, v1bVar);
                    this.d = c020Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C0925a c0925a = new C0925a(this.d, v1bVar);
                    c0925a.c = obj;
                    return c0925a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(vp1 vp1Var, v1b<? super m020> v1bVar) {
                    return ((C0925a) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.b;
                    if (i != 0) {
                        if (i == 1) {
                            uj50.b(obj);
                            return obj;
                        }
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                    vp1 vp1Var = (vp1) this.c;
                    this.b = 1;
                    Object objH = u4f0.h(vp1Var, this.d, this);
                    return objH == y5bVar ? y5bVar : objH;
                }
            }

            /* JADX INFO: renamed from: oc2$a$a$b */
            @c0d(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3", f = "BasicTooltip.kt", l = {224, 227, 227}, m = "invokeSuspend")
            public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public Throwable a;
                public int b;
                public final /* synthetic */ ztw<Boolean> c;
                public final /* synthetic */ b1g0 d;

                /* JADX INFO: renamed from: oc2$a$a$b$a, reason: collision with other inner class name */
                @c0d(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1", f = "BasicTooltip.kt", l = {}, m = "invokeSuspend")
                public static final class C0926a extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
                    public /* synthetic */ boolean a;
                    public final /* synthetic */ b1g0 b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0926a(b1g0 b1g0Var, v1b<? super C0926a> v1bVar) {
                        super(2, v1bVar);
                        this.b = b1g0Var;
                    }

                    @Override // defpackage.pz1
                    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                        C0926a c0926a = new C0926a(this.b, v1bVar);
                        c0926a.a = ((Boolean) obj).booleanValue();
                        return c0926a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return ((C0926a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        y5b y5bVar = y5b.a;
                        uj50.b(obj);
                        if (!this.a) {
                            this.b.a();
                        }
                        return Unit.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(ztw<Boolean> ztwVar, b1g0 b1g0Var, v1b<? super b> v1bVar) {
                    super(2, v1bVar);
                    this.c = ztwVar;
                    this.d = b1g0Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new b(this.c, this.d, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
                
                    if (defpackage.kzh.b(r6, r9, r8) == r0) goto L30;
                 */
                @Override // defpackage.pz1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
                    /*
                        r8 = this;
                        y5b r0 = defpackage.y5b.a
                        int r1 = r8.b
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        ztw<java.lang.Boolean> r6 = r8.c
                        b1g0 r7 = r8.d
                        if (r1 == 0) goto L2a
                        if (r1 == r5) goto L24
                        if (r1 == r4) goto L20
                        if (r1 == r3) goto L1a
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ib5.a(r8)
                        return r2
                    L1a:
                        java.lang.Throwable r8 = r8.a
                        defpackage.uj50.b(r9)
                        goto L6b
                    L20:
                        defpackage.uj50.b(r9)
                        goto L51
                    L24:
                        defpackage.uj50.b(r9)     // Catch: java.lang.Throwable -> L28
                        goto L3d
                    L28:
                        r9 = move-exception
                        goto L54
                    L2a:
                        defpackage.uj50.b(r9)
                        java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L28
                        r6.a(r9)     // Catch: java.lang.Throwable -> L28
                        huw r9 = defpackage.huw.c     // Catch: java.lang.Throwable -> L28
                        r8.b = r5     // Catch: java.lang.Throwable -> L28
                        java.lang.Object r9 = r7.c(r9, r8)     // Catch: java.lang.Throwable -> L28
                        if (r9 != r0) goto L3d
                        goto L69
                    L3d:
                        boolean r9 = r7.b()
                        if (r9 == 0) goto L51
                        oc2$a$a$b$a r9 = new oc2$a$a$b$a
                        r9.<init>(r7, r2)
                        r8.b = r4
                        java.lang.Object r8 = defpackage.kzh.b(r6, r9, r8)
                        if (r8 != r0) goto L51
                        goto L69
                    L51:
                        kotlin.Unit r8 = kotlin.Unit.a
                        return r8
                    L54:
                        boolean r1 = r7.b()
                        if (r1 == 0) goto L6c
                        oc2$a$a$b$a r1 = new oc2$a$a$b$a
                        r1.<init>(r7, r2)
                        r8.a = r9
                        r8.b = r3
                        java.lang.Object r8 = defpackage.kzh.b(r6, r1, r8)
                        if (r8 != r0) goto L6a
                    L69:
                        return r0
                    L6a:
                        r8 = r9
                    L6b:
                        r9 = r8
                    L6c:
                        throw r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: oc2.a.C0924a.b.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0924a(v5b v5bVar, b1g0 b1g0Var, v1b<? super C0924a> v1bVar) {
                super(2, v1bVar);
                this.i = v5bVar;
                this.v = b1g0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0924a c0924a = new C0924a(this.i, this.v, v1bVar);
                c0924a.f = obj;
                return c0924a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
                return ((C0924a) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
            /* JADX WARN: Code duplicated, block: B:43:0x00c0 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #2 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00bc, B:43:0x00c0), top: B:52:0x0014 }] */
            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) throws Throwable {
                ztw ztwVarA;
                c020 c020Var;
                long j;
                vp1 vp1Var;
                ztw ztwVar;
                ztw ztwVar2;
                m020 m020Var;
                y5b y5bVar = y5b.a;
                int i = this.e;
                if (i == 0) {
                    uj50.b(obj);
                    vp1 vp1Var2 = (vp1) this.f;
                    ztwVarA = xwd0.a(Boolean.FALSE);
                    long jC = vp1Var2.getViewConfiguration().c();
                    c020Var = c020.a;
                    this.f = vp1Var2;
                    this.b = ztwVarA;
                    this.c = c020Var;
                    this.d = jC;
                    this.e = 1;
                    Object objB = u4f0.b(vp1Var2, this, 1);
                    if (objB != y5bVar) {
                        j = jC;
                        vp1Var = vp1Var2;
                        obj = objB;
                    }
                    return y5bVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ztwVar2 = (ztw) this.f;
                        try {
                            uj50.b(obj);
                            m020Var = (m020) obj;
                            if (m020Var != null) {
                                m020Var.a();
                            }
                            ztwVar2.a(Boolean.FALSE);
                            return Unit.a;
                        } catch (Throwable th) {
                            th = th;
                            ztwVar2.a(Boolean.FALSE);
                            throw th;
                        }
                    }
                    c020 c020Var2 = this.c;
                    ztwVar = this.b;
                    vp1Var = (vp1) this.f;
                    try {
                        uj50.b(obj);
                        ztwVar.a(Boolean.FALSE);
                    } catch (e020 unused) {
                        c020Var = c020Var2;
                        ztwVarA = ztwVar;
                        ej5.c(this.i, null, a6b.d, new b(ztwVarA, this.v, null), 1);
                        this.f = ztwVarA;
                        this.b = null;
                        this.c = null;
                        this.e = 3;
                        obj = u4f0.h(vp1Var, c020Var, this);
                        if (obj != y5bVar) {
                            ztwVar2 = ztwVarA;
                            m020Var = (m020) obj;
                            if (m020Var != null) {
                                m020Var.a();
                            }
                            ztwVar2.a(Boolean.FALSE);
                        }
                        return y5bVar;
                    } catch (Throwable th2) {
                        th = th2;
                        ztwVar2 = ztwVar;
                        ztwVar2.a(Boolean.FALSE);
                        throw th;
                    }
                    return Unit.a;
                }
                long j2 = this.d;
                c020 c020Var3 = this.c;
                ztw ztwVar3 = this.b;
                vp1 vp1Var3 = (vp1) this.f;
                uj50.b(obj);
                c020Var = c020Var3;
                ztwVarA = ztwVar3;
                j = j2;
                vp1Var = vp1Var3;
                long j3 = j;
                int i2 = ((m020) obj).i;
                if (i2 == 1 || i2 == 3) {
                    try {
                        try {
                            C0925a c0925a = new C0925a(c020Var, null);
                            this.f = vp1Var;
                            this.b = ztwVarA;
                            this.c = c020Var;
                            this.e = 2;
                            if (vp1Var.E0(j3, c0925a, this) != y5bVar) {
                                ztwVar = ztwVarA;
                                ztwVar.a(Boolean.FALSE);
                            }
                        } catch (e020 unused2) {
                            ej5.c(this.i, null, a6b.d, new b(ztwVarA, this.v, null), 1);
                            this.f = ztwVarA;
                            this.b = null;
                            this.c = null;
                            this.e = 3;
                            obj = u4f0.h(vp1Var, c020Var, this);
                            if (obj != y5bVar) {
                                ztwVar2 = ztwVarA;
                                m020Var = (m020) obj;
                                if (m020Var != null) {
                                    m020Var.a();
                                }
                                ztwVar2.a(Boolean.FALSE);
                                return Unit.a;
                            }
                        }
                        return y5bVar;
                    } catch (Throwable th3) {
                        th = th3;
                        ztwVar2 = ztwVarA;
                        ztwVar2.a(Boolean.FALSE);
                        throw th;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u020 u020Var, b1g0 b1g0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = u020Var;
            this.d = b1g0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, v1bVar);
            aVar.b = obj;
            return aVar;
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
                C0924a c0924a = new C0924a((v5b) this.b, this.d, null);
                this.a = 1;
                if (dqi.b(this.c, c0924a, this) == y5bVar) {
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

    public oc2(b1g0 b1g0Var) {
        this.a = b1g0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        Object objD = w5b.d(new a(u020Var, this.a, null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }
}
