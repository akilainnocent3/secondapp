package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class m850 {

    @c0d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ s9s c;
        public final /* synthetic */ s9s.b d;
        public final /* synthetic */ Function2<v5b, v1b<? super Unit>, Object> e;

        /* JADX INFO: renamed from: m850$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend")
        public static final class C0859a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public dq40 a;
            public dq40 b;
            public v5b c;
            public int d;
            public final /* synthetic */ s9s e;
            public final /* synthetic */ s9s.b f;
            public final /* synthetic */ v5b i;
            public final /* synthetic */ Function2<v5b, v1b<? super Unit>, Object> v;

            /* JADX INFO: renamed from: m850$a$a$a, reason: collision with other inner class name */
            public static final class C0860a implements cbs {
                public final /* synthetic */ s9s.a a;
                public final /* synthetic */ dq40<c9p> b;
                public final /* synthetic */ v5b c;
                public final /* synthetic */ s9s.a d;
                public final /* synthetic */ bc6 e;
                public final /* synthetic */ tuw f;
                public final /* synthetic */ Function2<v5b, v1b<? super Unit>, Object> i;

                /* JADX INFO: renamed from: m850$a$a$a$a, reason: collision with other inner class name */
                @c0d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {165, 110}, m = "invokeSuspend")
                public static final class C0861a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                    public quw a;
                    public tje0 b;
                    public int c;
                    public final /* synthetic */ tuw d;
                    public final /* synthetic */ Function2<v5b, v1b<? super Unit>, Object> e;

                    /* JADX INFO: renamed from: m850$a$a$a$a$a, reason: collision with other inner class name */
                    @c0d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {110}, m = "invokeSuspend")
                    public static final class C0862a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                        public int a;
                        public /* synthetic */ Object b;
                        public final /* synthetic */ Function2<v5b, v1b<? super Unit>, Object> c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C0862a(Function2<? super v5b, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super C0862a> v1bVar) {
                            super(2, v1bVar);
                            this.c = function2;
                        }

                        @Override // defpackage.pz1
                        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                            C0862a c0862a = new C0862a(this.c, v1bVar);
                            c0862a.b = obj;
                            return c0862a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                            return ((C0862a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                        }

                        @Override // defpackage.pz1
                        public final Object invokeSuspend(Object obj) {
                            y5b y5bVar = y5b.a;
                            int i = this.a;
                            if (i == 0) {
                                uj50.b(obj);
                                v5b v5bVar = (v5b) this.b;
                                this.a = 1;
                                if (this.c.invoke(v5bVar, this) == y5bVar) {
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

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0861a(tuw tuwVar, Function2 function2, v1b v1bVar) {
                        super(2, v1bVar);
                        this.d = tuwVar;
                        this.e = function2;
                    }

                    @Override // defpackage.pz1
                    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                        return new C0861a(this.d, this.e, v1bVar);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                        return ((C0861a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function2] */
                    /* JADX WARN: Type inference failed for: r1v5 */
                    /* JADX WARN: Type inference failed for: r1v6 */
                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        quw quwVar;
                        haj hajVar;
                        ?? r1;
                        Throwable th;
                        quw quwVar2;
                        y5b y5bVar = y5b.a;
                        int i = this.c;
                        try {
                            if (i == 0) {
                                uj50.b(obj);
                                quwVar = this.d;
                                this.a = quwVar;
                                hajVar = this.e;
                                this.b = (tje0) hajVar;
                                this.c = 1;
                                if (quwVar.d(this) != y5bVar) {
                                }
                                r1 = hajVar;
                                return y5bVar;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                quwVar2 = this.a;
                                try {
                                    uj50.b(obj);
                                    Unit unit = Unit.a;
                                    quwVar2.f(null);
                                    return Unit.a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    quwVar2.f(null);
                                    throw th;
                                }
                            }
                            Function2 function2 = (Function2) this.b;
                            quw quwVar3 = this.a;
                            uj50.b(obj);
                            quwVar = quwVar3;
                            r1 = function2;
                            r1 = hajVar;
                            C0862a c0862a = new C0862a(r1, null);
                            this.a = quwVar;
                            this.b = null;
                            this.c = 2;
                            if (w5b.d(c0862a, this) != y5bVar) {
                                quwVar2 = quwVar;
                                Unit unit2 = Unit.a;
                                quwVar2.f(null);
                                return Unit.a;
                            }
                            r1 = hajVar;
                            return y5bVar;
                        } catch (Throwable th3) {
                            quw quwVar4 = quwVar;
                            th = th3;
                            quwVar2 = quwVar4;
                            quwVar2.f(null);
                            throw th;
                        }
                    }
                }

                public C0860a(s9s.a aVar, dq40 dq40Var, v5b v5bVar, s9s.a aVar2, bc6 bc6Var, tuw tuwVar, Function2 function2) {
                    this.a = aVar;
                    this.b = dq40Var;
                    this.c = v5bVar;
                    this.d = aVar2;
                    this.e = bc6Var;
                    this.f = tuwVar;
                    this.i = function2;
                }

                /* JADX WARN: Type inference failed for: r3v3, types: [T, jvd0] */
                @Override // defpackage.cbs
                public final void F0(ibs ibsVar, s9s.a aVar) {
                    s9s.a aVar2 = this.a;
                    dq40<c9p> dq40Var = this.b;
                    if (aVar == aVar2) {
                        dq40Var.a = ej5.c(this.c, null, null, new C0861a(this.f, this.i, null), 3);
                        return;
                    }
                    if (aVar == this.d) {
                        c9p c9pVar = dq40Var.a;
                        if (c9pVar != null) {
                            c9pVar.cancel((CancellationException) null);
                        }
                        dq40Var.a = null;
                    }
                    if (aVar == s9s.a.ON_DESTROY) {
                        zi50.a aVar3 = zi50.b;
                        this.e.resumeWith(Unit.a);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0859a(s9s s9sVar, s9s.b bVar, v5b v5bVar, Function2<? super v5b, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super C0859a> v1bVar) {
                super(2, v1bVar);
                this.e = s9sVar;
                this.f = bVar;
                this.i = v5bVar;
                this.v = function2;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0859a(this.e, this.f, this.i, this.v, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0859a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:25:0x0079  */
            /* JADX WARN: Code duplicated, block: B:28:0x0082  */
            /* JADX WARN: Code duplicated, block: B:38:0x0096  */
            /* JADX WARN: Code duplicated, block: B:41:0x009f  */
            /* JADX WARN: Code duplicated, block: B:49:? A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [T, hbs, m850$a$a$a] */
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
            public final Object invokeSuspend(Object obj) throws Throwable {
                dq40 dq40Var;
                Throwable th;
                dq40 dq40Var2;
                c9p c9pVar;
                cbs cbsVar;
                c9p c9pVar2;
                cbs cbsVar2;
                y5b y5bVar = y5b.a;
                int i = this.d;
                s9s s9sVar = this.e;
                if (i != 0) {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dq40Var = this.b;
                    dq40Var2 = this.a;
                    try {
                        uj50.b(obj);
                        c9pVar2 = (c9p) dq40Var2.a;
                        if (c9pVar2 != null) {
                            c9pVar2.cancel((CancellationException) null);
                        }
                        cbsVar2 = (cbs) dq40Var.a;
                        if (cbsVar2 != null) {
                            s9sVar.d(cbsVar2);
                        }
                        return Unit.a;
                    } catch (Throwable th2) {
                        th = th2;
                        c9pVar = (c9p) dq40Var2.a;
                        if (c9pVar != null) {
                            c9pVar.cancel((CancellationException) null);
                        }
                        cbsVar = (cbs) dq40Var.a;
                        if (cbsVar != null) {
                            throw th;
                        }
                        s9sVar.d(cbsVar);
                        throw th;
                    }
                }
                uj50.b(obj);
                if (s9sVar.b() == s9s.b.a) {
                    return Unit.a;
                }
                dq40 dq40Var3 = new dq40();
                dq40Var = new dq40();
                try {
                    s9s.b bVar = this.f;
                    v5b v5bVar = this.i;
                    Function2<v5b, v1b<? super Unit>, Object> function2 = this.v;
                    this.a = dq40Var3;
                    this.b = dq40Var;
                    this.c = v5bVar;
                    this.d = 1;
                    bc6 bc6Var = new bc6(1, yzo.b(this));
                    bc6Var.q();
                    try {
                        s9s.a.Companion.getClass();
                        ?? c0860a = new C0860a(s9s.a.C1084a.b(bVar), dq40Var3, v5bVar, s9s.a.C1084a.a(bVar), bc6Var, uuw.a(), function2);
                        dq40Var.a = c0860a;
                        s9sVar.a(c0860a);
                        if (bc6Var.o() == y5bVar) {
                            return y5bVar;
                        }
                        dq40Var2 = dq40Var3;
                        c9pVar2 = (c9p) dq40Var2.a;
                        if (c9pVar2 != null) {
                            c9pVar2.cancel((CancellationException) null);
                        }
                        cbsVar2 = (cbs) dq40Var.a;
                        if (cbsVar2 != null) {
                            s9sVar.d(cbsVar2);
                        }
                        return Unit.a;
                    } catch (Throwable th3) {
                        th = th3;
                        dq40Var2 = dq40Var3;
                        c9pVar = (c9p) dq40Var2.a;
                        if (c9pVar != null) {
                            c9pVar.cancel((CancellationException) null);
                        }
                        cbsVar = (cbs) dq40Var.a;
                        if (cbsVar != null) {
                            throw th;
                        }
                        s9sVar.d(cbsVar);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(s9s s9sVar, s9s.b bVar, Function2<? super v5b, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = s9sVar;
            this.d = bVar;
            this.e = function2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, v1bVar);
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
                v5b v5bVar = (v5b) this.b;
                pfd pfdVar = fse.a;
                vcl vclVarH0 = gku.a.h0();
                C0859a c0859a = new C0859a(this.c, this.d, v5bVar, this.e, null);
                this.a = 1;
                if (ej5.d(vclVarH0, c0859a, this) == y5bVar) {
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

    public static final Object a(s9s s9sVar, s9s.b bVar, Function2<? super v5b, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super Unit> v1bVar) {
        if (bVar == s9s.b.b) {
            hb5.a("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            return null;
        }
        if (s9sVar.b() == s9s.b.a) {
            return Unit.a;
        }
        Object objD = w5b.d(new a(s9sVar, bVar, function2, null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    public static final Object b(ibs ibsVar, s9s.b bVar, Function2<? super v5b, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super Unit> v1bVar) {
        Object objA = a(ibsVar.getLifecycle(), bVar, function2, v1bVar);
        return objA == y5b.a ? objA : Unit.a;
    }
}
