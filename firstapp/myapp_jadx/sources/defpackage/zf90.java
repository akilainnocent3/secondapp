package defpackage;

import android.view.View;
import androidx.compose.runtime.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zf90 {

    @c0d(c = "com.sportygames.component.sidepanel.SGSidepanelKt$SGSidePanel$4$7$1", f = "SGSidepanel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ oh90 a;
        public final /* synthetic */ ief b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(oh90 oh90Var, ief iefVar, v1b v1bVar) {
            super(2, v1bVar);
            this.a = oh90Var;
            this.b = iefVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.A1(((def) this.b).getState());
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.sidepanel.SidePanelKt$SidePanel$$inlined$SGSidePanel-8GjC6c4$11", f = "SidePanel.kt", l = {233}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ oh90 b;
        public final /* synthetic */ Function1 c;

        public static final class a<T> implements myh {
            public final /* synthetic */ Function1 a;

            public a(Function1 function1) {
                this.a = function1;
            }

            @Override // defpackage.myh
            public final Object emit(ud90 ud90Var, v1b<? super Unit> v1bVar) {
                ud90 ud90Var2 = ud90Var;
                if (!(ud90Var2 instanceof ud90.a)) {
                    uhc.a();
                    return null;
                }
                this.a.invoke(new vc60.t(((ud90.a) ud90Var2).a));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oh90 oh90Var, v1b v1bVar, Function1 function1) {
            super(2, v1bVar);
            this.b = oh90Var;
            this.c = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to zf90$b for r5v2 'this'  v1b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                return r2
            L10:
                defpackage.uj50.b(r6)
                goto L2f
            L14:
                defpackage.uj50.b(r6)
                oh90 r6 = r5.b
                t340 r6 = r6.x1()
                zf90$b$a r1 = new zf90$b$a
                kotlin.jvm.functions.Function1 r4 = r5.c
                r1.<init>(r4)
                r5.a = r3
                a390<T> r6 = r6.a
                java.lang.Object r5 = r6.collect(r1, r5)
                if (r5 != r0) goto L2f
                return r0
            L2f:
                defpackage.fkd.a()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: zf90.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c implements Function1<mmd, iwo> {
        public final /* synthetic */ i20 a;

        public c(i20 i20Var) {
            this.a = i20Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final iwo invoke(mmd mmdVar) {
            mmdVar.getClass();
            return new iwo(((long) ycv.b(this.a.e())) << 32);
        }
    }

    public static final class d implements Function0<Unit> {
        public static final d a = new d();

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            return Unit.a;
        }
    }

    public static final /* synthetic */ class e extends saj implements Function1<zf60, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(zf60 zf60Var) {
            ((oh90) this.receiver).z1(zf60Var);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.component.sidepanel.SGSidepanelKt$SGSidePanel$2$1", f = "SGSidepanel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ me90 a;
        public final /* synthetic */ ytw b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(me90 me90Var, ytw ytwVar, v1b v1bVar) {
            super(2, v1bVar);
            this.a = me90Var;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new f(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object cVar;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            me90.b bVar = me90.b.a;
            me90 me90Var = this.a;
            boolean zG = Intrinsics.g(me90Var, bVar);
            ytw ytwVar = this.b;
            if (zG) {
                ief iefVar = (ief) ytwVar.getValue();
                if (iefVar instanceof def) {
                    cVar = new ief.b(((def) iefVar).getState());
                } else {
                    if (!(iefVar instanceof cef)) {
                        uhc.a();
                        return null;
                    }
                    cVar = ief.a.a;
                }
            } else {
                if (!(me90Var instanceof me90.a)) {
                    uhc.a();
                    return null;
                }
                cVar = new ief.c((me90.a) me90Var);
            }
            ytwVar.setValue(cVar);
            return Unit.a;
        }
    }

    public static final class g implements Function1<pb80, Unit> {
        public static final g a = new g();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(pb80 pb80Var) {
            pb80Var.getClass();
            return Unit.a;
        }
    }

    public static final class h implements Function1<Float, Float> {
        public static final h a = new h();

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f) {
            return Float.valueOf(f.floatValue() * 0.35f);
        }
    }

    @c0d(c = "com.sportygames.component.sidepanel.SGSidepanelKt$SGSidePanel$4$1$1", f = "SGSidepanel.kt", l = {187}, m = "invokeSuspend", v = 1)
    public static final class i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ i20 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(i20 i20Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = i20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new i(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                hef hefVar = hef.a;
                this.a = 1;
                if (androidx.compose.foundation.gestures.a.e(this.b, hefVar, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.component.sidepanel.SGSidepanelKt$SGSidePanel$4$2$1", f = "SGSidepanel.kt", l = {196}, m = "invokeSuspend", v = 1)
    public static final class j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ i20 b;
        public final /* synthetic */ float c;
        public final /* synthetic */ Function0 d;
        public final /* synthetic */ ytw e;

        public static final class a implements Function0<Float> {
            public final /* synthetic */ i20 a;

            public a(i20 i20Var) {
                this.a = i20Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                return Float.valueOf(this.a.e());
            }
        }

        public static final class b implements lyh<Boolean> {
            public final /* synthetic */ or60 a;
            public final /* synthetic */ float b;

            public static final class a<T> implements myh {
                public final /* synthetic */ myh a;
                public final /* synthetic */ float b;

                /* JADX INFO: renamed from: zf90$j$b$a$a, reason: collision with other inner class name */
                @c0d(c = "com.sportygames.speedybingo.presentation.sidepanel.SidePanelKt$SidePanel$$inlined$SGSidePanel-8GjC6c4$6$2$2", f = "SidePanel.kt", l = {50}, m = "emit", v = 1)
                public static final class C1387a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C1387a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(myh myhVar, float f) {
                    this.a = myhVar;
                    this.b = f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    C1387a c1387a;
                    if (v1bVar instanceof C1387a) {
                        c1387a = (C1387a) v1bVar;
                        int i = c1387a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c1387a.b = i - Integer.MIN_VALUE;
                        } else {
                            c1387a = new C1387a(v1bVar);
                        }
                    } else {
                        c1387a = new C1387a(v1bVar);
                    }
                    Object obj2 = c1387a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c1387a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        Boolean boolValueOf = Boolean.valueOf(Math.abs(this.b - ((Number) obj).floatValue()) < 1.0E-4f);
                        c1387a.b = 1;
                        if (this.a.emit(boolValueOf, c1387a) == y5bVar) {
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

            public b(or60 or60Var, float f) {
                this.a = or60Var;
                this.b = f;
            }

            @Override // defpackage.lyh
            public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) throws Throwable {
                Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
                return objCollect == y5b.a ? objCollect : Unit.a;
            }
        }

        public static final class c implements lyh<Boolean> {
            public final /* synthetic */ d0i a;

            public static final class a<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: zf90$j$c$a$a, reason: collision with other inner class name */
                @c0d(c = "com.sportygames.speedybingo.presentation.sidepanel.SidePanelKt$SidePanel$$inlined$SGSidePanel-8GjC6c4$6$3$2", f = "SidePanel.kt", l = {50}, m = "emit", v = 1)
                public static final class C1388a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C1388a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(myh myhVar) {
                    this.a = myhVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    C1388a c1388a;
                    if (v1bVar instanceof C1388a) {
                        c1388a = (C1388a) v1bVar;
                        int i = c1388a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c1388a.b = i - Integer.MIN_VALUE;
                        } else {
                            c1388a = new C1388a(v1bVar);
                        }
                    } else {
                        c1388a = new C1388a(v1bVar);
                    }
                    Object obj2 = c1388a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c1388a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        if (((Boolean) obj).booleanValue()) {
                            c1388a.b = 1;
                            if (this.a.emit(obj, c1388a) == y5bVar) {
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

            public c(d0i d0iVar) {
                this.a = d0iVar;
            }

            @Override // defpackage.lyh
            public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
                Object objCollect = this.a.collect(new a(myhVar), v1bVar);
                return objCollect == y5b.a ? objCollect : Unit.a;
            }
        }

        public static final class d<T> implements myh {
            public final /* synthetic */ Function0 a;
            public final /* synthetic */ ytw b;

            public d(ytw ytwVar, Function0 function0) {
                this.a = function0;
                this.b = ytwVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                ((Boolean) obj).getClass();
                ytw ytwVar = this.b;
                ief iefVar = (ief) ytwVar.getValue();
                if (iefVar instanceof ief.c) {
                    this.a.invoke();
                } else {
                    if (!(iefVar instanceof ief.b) && !Intrinsics.g(iefVar, ief.a.a)) {
                        uhc.a();
                        return null;
                    }
                    ytwVar.setValue(ief.a.a);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i20 i20Var, float f, Function0 function0, ytw ytwVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = i20Var;
            this.c = f;
            this.d = function0;
            this.e = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new j(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                c cVar = new c(fc4.a(uzh.b(new b(n95.c(new a(this.b)), this.c)), 1));
                d dVar = new d(this.e, this.d);
                this.a = 1;
                if (cVar.collect(dVar, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.component.sidepanel.SGSidepanelKt$SGSidePanel$4$3$1", f = "SGSidepanel.kt", l = {209}, m = "invokeSuspend", v = 1)
    public static final class k extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ytw b;
        public final /* synthetic */ i20 c;

        public static final class a implements Function0<ief> {
            public final /* synthetic */ ytw a;

            public a(ytw ytwVar) {
                this.a = ytwVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final ief invoke() {
                return (ief) this.a.getValue();
            }
        }

        public static final class b implements lyh<ief> {
            public final /* synthetic */ or60 a;

            public static final class a<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: zf90$k$b$a$a, reason: collision with other inner class name */
                @c0d(c = "com.sportygames.speedybingo.presentation.sidepanel.SidePanelKt$SidePanel$$inlined$SGSidePanel-8GjC6c4$7$2$2", f = "SidePanel.kt", l = {50}, m = "emit", v = 1)
                public static final class C1389a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C1389a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(myh myhVar) {
                    this.a = myhVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    C1389a c1389a;
                    if (v1bVar instanceof C1389a) {
                        c1389a = (C1389a) v1bVar;
                        int i = c1389a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c1389a.b = i - Integer.MIN_VALUE;
                        } else {
                            c1389a = new C1389a(v1bVar);
                        }
                    } else {
                        c1389a = new C1389a(v1bVar);
                    }
                    Object obj2 = c1389a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c1389a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        if (((ief) obj) instanceof ief.b) {
                            c1389a.b = 1;
                            if (this.a.emit(obj, c1389a) == y5bVar) {
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

            public b(or60 or60Var) {
                this.a = or60Var;
            }

            @Override // defpackage.lyh
            public final Object collect(myh<? super ief> myhVar, v1b v1bVar) throws Throwable {
                Object objCollect = this.a.collect(new a(myhVar), v1bVar);
                return objCollect == y5b.a ? objCollect : Unit.a;
            }
        }

        public static final class c<T> implements myh {
            public final /* synthetic */ i20 a;
            public final /* synthetic */ ytw b;

            public c(i20 i20Var, ytw ytwVar) {
                this.a = i20Var;
                this.b = ytwVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object c(v1b v1bVar) {
                cg90 cg90Var;
                if (v1bVar instanceof cg90) {
                    cg90Var = (cg90) v1bVar;
                    int i = cg90Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        cg90Var.b = i - Integer.MIN_VALUE;
                    } else {
                        cg90Var = new cg90(this, v1bVar);
                    }
                } else {
                    cg90Var = new cg90(this, v1bVar);
                }
                Object obj = cg90Var.a;
                y5b y5bVar = y5b.a;
                int i2 = cg90Var.b;
                if (i2 == 0) {
                    uj50.b(obj);
                    hef hefVar = hef.b;
                    cg90Var.b = 1;
                    if (androidx.compose.foundation.gestures.a.e(this.a, hefVar, cg90Var) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                this.b.setValue(ief.a.a);
                return Unit.a;
            }

            @Override // defpackage.myh
            public final /* bridge */ /* synthetic */ Object emit(Object obj, v1b v1bVar) {
                return c(v1bVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ytw ytwVar, i20 i20Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = ytwVar;
            this.c = i20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new k(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ytw ytwVar = this.b;
                lyh lyhVarB = uzh.b(new b(n95.c(new a(ytwVar))));
                c cVar = new c(this.c, ytwVar);
                this.a = 1;
                if (lyhVarB.collect(cVar, this) == y5bVar) {
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

    public static final class l implements Function0<Unit> {
        public final /* synthetic */ Function0 a;

        public l(Function0 function0) {
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.a.invoke();
            return Unit.a;
        }
    }

    public static final class m implements Function1<pb80, Unit> {
        public static final m a = new m();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(pb80 pb80Var) {
            pb80Var.getClass();
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final rc60 rc60Var, final Function1<? super vc60, Unit> function1, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVar;
        boolean z;
        float f2;
        v1b v1bVar;
        boolean z2;
        rc60Var.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(296808118);
        int i3 = (bVarI.M(rc60Var) ? 4 : 2) | i2 | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = androidx.compose.runtime.m.b(me90.b.a);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            ytwVar.setValue(rc60Var instanceof cg60 ? ((cg60) rc60Var).a : me90.b.a);
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            float fA = r8j0.c(q8j0.a.a(bVarI).e, bVarI).a();
            me90 me90Var = (me90) ytwVar.getValue();
            ma60 ma60Var = ma60.B0;
            long jD = r58.d(4286617087L);
            long j2 = j58.f;
            long jD2 = r58.d(4279096472L);
            long jD3 = r58.d(4279378541L);
            g7f g7fVar = new g7f(fA - 32.0f);
            g7f g7fVar2 = new g7f(0.0f);
            if (g7fVar.compareTo(g7fVar2) < 0) {
                g7fVar = g7fVar2;
            }
            float f3 = g7fVar.a;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarA = ls7.a(d35.a(androidx.compose.foundation.layout.h.j(aVar2, 0.0f, 0.0f, 0.0f, f3, 7), 1.0f, j2, j060.c(6.0f)), j060.c(6.0f));
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                z = true;
                objY2 = new ea(1);
                bVarI.r(objY2);
            } else {
                z = true;
            }
            Function1 function2 = (Function1) objY2;
            boolean z3 = (i3 & 112) == 32 ? z : false;
            Object objY3 = bVarI.y();
            if (z3 || objY3 == c0042a) {
                objY3 = new x5d(function1, 2);
                bVarI.r(objY3);
            }
            Function0 function0 = (Function0) objY3;
            pnj pnjVarB = xd90.b(bVarI);
            boolean z4 = z;
            pnj pnjVarD = xd90.d(bVarI);
            pnj pnjVarC = xd90.c(bVarI);
            pnj pnjVarA = xd90.a(bVarI);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = androidx.compose.runtime.m.b(ief.a.a);
                bVarI.r(objY4);
            }
            ytw ytwVar2 = (ytw) objY4;
            boolean zM = bVarI.M(me90Var);
            Object objY5 = bVarI.y();
            if (zM || objY5 == c0042a) {
                objY5 = new f(me90Var, ytwVar2, null);
                bVarI.r(objY5);
            }
            xvf.e(bVarI, me90Var, (Function2) objY5);
            androidx.compose.ui.d dVarE = androidx.compose.foundation.layout.j.e(aVar2, 1.0f);
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = g.a;
                bVarI.r(objY6);
            }
            androidx.compose.ui.d dVarB = xa80.b(dVarE, false, (Function1) objY6);
            aiv aivVarC = g75.c(ht.a.f, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            ief iefVar = (ief) ytwVar2.getValue();
            if (iefVar instanceof cef) {
                bVarI.N(-1591259753);
                bVarI.X(false);
                bVar = bVarI;
                z2 = z4;
            } else {
                if (!(iefVar instanceof def)) {
                    throw igf0.a(bVarI, -1298254277, false);
                }
                bVarI.N(-1591061911);
                float fC1 = ((mmd) bVarI.O(kna.h)).C1(260.0f);
                boolean zC = bVarI.c(fC1);
                Object objY7 = bVarI.y();
                if (zC || objY7 == c0042a) {
                    p9f p9fVar = new p9f();
                    p9fVar.a(hef.a, 0.0f);
                    p9fVar.a(hef.b, fC1);
                    Unit unit = Unit.a;
                    float[] fArr = p9fVar.b;
                    ArrayList arrayList = p9fVar.a;
                    int size = arrayList.size();
                    fArr.getClass();
                    vx0.a(size, fArr.length);
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                    fArrCopyOfRange.getClass();
                    objY7 = new vbd(arrayList, fArrCopyOfRange);
                    bVarI.r(objY7);
                }
                n9f n9fVar = (n9f) objY7;
                Object objY8 = bVarI.y();
                if (objY8 == c0042a) {
                    hef hefVar = hef.a;
                    objY8 = new i20(n9fVar);
                    bVarI.r(objY8);
                }
                i20 i20Var = (i20) objY8;
                gzg0 gzg0Var = v00.a;
                Object objY9 = bVarI.y();
                if (objY9 == c0042a) {
                    objY9 = h.a;
                    bVarI.r(objY9);
                }
                l5f0 l5f0VarA = v00.a(i20Var, (Function1) objY9, yi0.d(1.0f, 1500.0f, null, 4), bVarI, (v00.d << 9) | 438);
                Unit unit2 = Unit.a;
                Object objY10 = bVarI.y();
                if (objY10 == c0042a) {
                    objY10 = new i(i20Var, null);
                    bVarI.r(objY10);
                }
                xvf.e(bVarI, unit2, (Function2) objY10);
                boolean zC2 = bVarI.c(fC1) | bVarI.M(function0);
                Object objY11 = bVarI.y();
                if (zC2 || objY11 == c0042a) {
                    f2 = fC1;
                    objY11 = new j(i20Var, f2, function0, ytwVar2, null);
                    bVarI.r(objY11);
                } else {
                    f2 = fC1;
                }
                xvf.e(bVarI, unit2, (Function2) objY11);
                Object objY12 = bVarI.y();
                if (objY12 == c0042a) {
                    objY12 = new k(ytwVar2, i20Var, null);
                    bVarI.r(objY12);
                }
                xvf.e(bVarI, unit2, (Function2) objY12);
                androidx.compose.ui.d dVarA2 = dw.a(androidx.compose.foundation.layout.j.e(aVar2, 1.0f), 1.0f - (i20Var.e() / f2));
                Object objY13 = bVarI.y();
                if (objY13 == c0042a) {
                    objY13 = rzk.a(bVarI);
                }
                psw pswVar = (psw) objY13;
                boolean zM2 = bVarI.M(function0);
                Object objY14 = bVarI.y();
                if (zM2 || objY14 == c0042a) {
                    objY14 = new l(function0);
                    bVarI.r(objY14);
                }
                androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(androidx.compose.foundation.d.b(dVarA2, pswVar, null, false, null, (Function0) objY14, 28), j58.c(0.6f, j58.b), zk40.a);
                Object objY15 = bVarI.y();
                if (objY15 == c0042a) {
                    objY15 = m.a;
                    bVarI.r(objY15);
                }
                g75.a(xa80.a(dVarB2, (Function1) objY15), bVarI, 0);
                bVarI.N(-1614864554);
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                j8i0 j8i0VarA = sgk.a(jq40.a(mh90.class), w8i0VarA.getViewModelStore(), dyb.a(w8i0VarA), null, orp.b(bVarI), null);
                bVarI.X(false);
                oh90 oh90Var = (oh90) j8i0VarA;
                boolean zA = bVarI.A(oh90Var) | bVarI.M(iefVar);
                Object objY16 = bVarI.y();
                if (zA || objY16 == c0042a) {
                    v1bVar = null;
                    objY16 = new a(oh90Var, iefVar, null);
                    bVarI.r(objY16);
                } else {
                    v1bVar = null;
                }
                xvf.e(bVarI, iefVar, (Function2) objY16);
                ytw ytwVarC = wyh.c(oh90Var.y1(), bVarI, 0, 7);
                xvf.e(bVarI, unit2, new b(oh90Var, v1bVar, function1));
                Object objY17 = bVarI.y();
                if (objY17 == c0042a) {
                    objY17 = new c(i20Var);
                    bVarI.r(objY17);
                }
                androidx.compose.ui.d dVarW = androidx.compose.foundation.layout.j.w(androidx.compose.foundation.layout.g.b(aVar2, (Function1) objY17), 260.0f);
                Object objY18 = bVarI.y();
                if (objY18 == c0042a) {
                    objY18 = rzk.a(bVarI);
                }
                psw pswVar2 = (psw) objY18;
                Object objY19 = bVarI.y();
                if (objY19 == c0042a) {
                    objY19 = d.a;
                    bVarI.r(objY19);
                }
                androidx.compose.ui.d dVarB3 = androidx.compose.foundation.gestures.a.b(androidx.compose.foundation.d.b(dVarW, pswVar2, null, false, null, (Function0) objY19, 28), i20Var, i3z.b, false, l5f0VarA, 28);
                dk60 dk60Var = (dk60) ytwVarC.getValue();
                boolean zA2 = bVarI.A(oh90Var);
                Object objY20 = bVarI.y();
                if (zA2 || objY20 == c0042a) {
                    objY20 = new e(1, oh90Var, oh90.class, "handleEvent", "handleEvent(Ljava/lang/Object;)V", 0);
                    bVarI.r(objY20);
                }
                ok60.e(dVarB3, dk60Var, ma60Var, pnjVarB, pnjVarD, pnjVarC, pnjVarA, j2, jD, j2, j2, jD2, jD3, dVarA, j2, up9.a, function2, up9.b, (Function1) ((chp) objY20), bVarI, 113246592);
                bVar = bVarI;
                bVar.X(false);
                z2 = true;
            }
            bVar.X(z2);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i2) { // from class: df90
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    zf90.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
