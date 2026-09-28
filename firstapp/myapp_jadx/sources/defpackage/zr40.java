package defpackage;

import com.sportygames.common.ui.model.GiftItem;
import com.sportygames.newcms.CMSRes;
import com.sportygames.newcms.uitext.CMSUiText;
import com.sportygames.newcms.uitext.UiText;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
public final class zr40 extends j8i0 implements av1, ox2, pn30 {
    public pjd A;
    public dm8 B;
    public dm8 C;
    public final wwd0 D;
    public final wwd0 E;
    public final wwd0 F;
    public final wwd0 G;
    public final wwd0 H;
    public final wwd0 I;
    public final v340 J;
    public final wwd0 K;
    public final wwd0 L;
    public final v340 M;
    public final v340 N;
    public final v340 O;
    public final wwd0 P;
    public final wwd0 Q;
    public final v340 R;
    public final k5b a;
    public final vn30 b;
    public final do30 c;
    public final cq30 d;
    public final gn30 e;
    public final en20 f;
    public final String i;
    public boolean v;
    public boolean w;
    public final v340 y;
    public final v340 z;

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$3", f = "RefsCallViewModel.kt", l = {282}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zr40.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            zr40 zr40Var = zr40.this;
            if (i == 0) {
                uj50.b(obj);
                if (!((Boolean) zr40Var.z.a.getValue()).booleanValue() && !zr40Var.w) {
                    wwd0 wwd0Var = zr40Var.G;
                    jn30 jn30Var = jn30.c0;
                    tbd tbdVar = jn30Var.f;
                    tbd tbdVar2 = jn30Var.f;
                    nn30.a aVar = new nn30.a(new CMSUiText(tbdVar.n), new CMSUiText(tbdVar2.m), new CMSUiText(tbdVar2.l), new rn30.i(false), new rn30.i(true));
                    this.a = 1;
                    wwd0Var.getClass();
                    wwd0Var.k(null, aVar);
                    if (Unit.a == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            zr40Var.w = true;
            return Unit.a;
        }
    }

    public static final class a0 implements lyh<com.sportygames.newcms.b> {
        public final /* synthetic */ v340 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: zr40$a0$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$special$$inlined$map$3$2", f = "RefsCallViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1413a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1413a(v1b v1bVar) {
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
                C1413a c1413a;
                if (v1bVar instanceof C1413a) {
                    c1413a = (C1413a) v1bVar;
                    int i = c1413a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1413a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1413a = new C1413a(v1bVar);
                    }
                } else {
                    c1413a = new C1413a(v1bVar);
                }
                Object obj2 = c1413a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1413a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    com.sportygames.newcms.b bVar = ((yo30.c) obj).a;
                    c1413a.b = 1;
                    if (this.a.emit(bVar, c1413a) == y5bVar) {
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

        public a0(v340 v340Var) {
            this.a = v340Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.lyh
        public final Object collect(myh<? super com.sportygames.newcms.b> myhVar, v1b v1bVar) {
            Object objCollect = this.a.a.collect(new a(myhVar), (v1b<? super Unit>) v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$4", f = "RefsCallViewModel.kt", l = {295, 296}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<yo30.c, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = zr40.this.new b(v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(yo30.c cVar, v1b<? super Unit> v1bVar) {
            return ((b) create(cVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (kotlin.Unit.a == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.b
                yo30$c r0 = (yo30.c) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r7.a
                r3 = 0
                zr40 r4 = defpackage.zr40.this
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L21
                if (r2 == r6) goto L1d
                if (r2 != r5) goto L17
                defpackage.uj50.b(r8)
                goto L4c
            L17:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r3
            L1d:
                defpackage.uj50.b(r8)
                goto L34
            L21:
                defpackage.uj50.b(r8)
                wwd0 r8 = r4.H
                uq30 r2 = r0.f
                r7.b = r0
                r7.a = r6
                r8.setValue(r2)
                kotlin.Unit r8 = kotlin.Unit.a
                if (r8 != r1) goto L34
                goto L4b
            L34:
                wwd0 r8 = r4.Q
                ol30$a r2 = new ol30$a
                java.math.BigDecimal r0 = r0.d
                r2.<init>(r0)
                r7.b = r3
                r7.a = r5
                r8.getClass()
                r8.k(r3, r2)
                kotlin.Unit r7 = kotlin.Unit.a
                if (r7 != r1) goto L4c
            L4b:
                return r1
            L4c:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zr40.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b0 implements lyh<pl30> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ zr40 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ zr40 b;

            /* JADX INFO: renamed from: zr40$b0$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$special$$inlined$map$4$2", f = "RefsCallViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1414a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1414a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, zr40 zr40Var) {
                this.a = myhVar;
                this.b = zr40Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
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
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1414a c1414a;
                Object obj2;
                if (v1bVar instanceof C1414a) {
                    c1414a = (C1414a) v1bVar;
                    int i = c1414a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1414a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1414a = new C1414a(v1bVar);
                    }
                } else {
                    c1414a = new C1414a(v1bVar);
                }
                Object obj3 = c1414a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1414a.b;
                if (i2 == 0) {
                    uj50.b(obj3);
                    tn30 tn30Var = (tn30) obj;
                    if (Intrinsics.g(tn30Var, tn30.b.a)) {
                        obj2 = pl30.a.a;
                    } else if (Intrinsics.g(tn30Var, tn30.a.a) || (tn30Var instanceof tn30.d) || (tn30Var instanceof tn30.e)) {
                        obj2 = pl30.b.a;
                    } else {
                        if (!Intrinsics.g(tn30Var, tn30.c.a)) {
                            uhc.a();
                            return null;
                        }
                        ol30 ol30Var = (ol30) this.b.Q.getValue();
                        if (ol30Var instanceof ol30.a) {
                            obj2 = pl30.d.a;
                        } else {
                            if (!(ol30Var instanceof ol30.b)) {
                                uhc.a();
                                return null;
                            }
                            obj2 = pl30.c.a;
                        }
                    }
                    c1414a.b = 1;
                    if (this.a.emit(obj2, c1414a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj3);
                }
                return Unit.a;
            }
        }

        public b0(wwd0 wwd0Var, zr40 zr40Var) {
            this.a = wwd0Var;
            this.b = zr40Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super pl30> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar, this.b), v1bVar);
            return y5b.a;
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$5", f = "RefsCallViewModel.kt", l = {300}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        /* JADX INFO: loaded from: classes2.dex */
        @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$5$1", f = "RefsCallViewModel.kt", l = {306, HttpStatusCodesKt.HTTP_TEMP_REDIRECT, 312, 313, 314, 330, 331, 333}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<tn30, v1b<? super Unit>, Object> {
            public pjd a;
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ zr40 d;
            public final /* synthetic */ v5b e;

            /* JADX INFO: renamed from: zr40$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes6.dex */
            @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$5$1$betJob$1", f = "RefsCallViewModel.kt", l = {305}, m = "invokeSuspend", v = 1)
            public static final class C1415a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public /* synthetic */ Object b;
                public final /* synthetic */ zr40 c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1415a(zr40 zr40Var, v1b<? super C1415a> v1bVar) {
                    super(2, v1bVar);
                    this.c = zr40Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C1415a c1415a = new C1415a(this.c, v1bVar);
                    c1415a.b = obj;
                    return c1415a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C1415a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    v5b v5bVar = (v5b) this.b;
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        this.b = null;
                        this.a = 1;
                        if (this.c.x1(v5bVar, this) == y5bVar) {
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
            public a(zr40 zr40Var, v5b v5bVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.d = zr40Var;
                this.e = v5bVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.d, this.e, v1bVar);
                aVar.c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(tn30 tn30Var, v1b<? super Unit> v1bVar) {
                return ((a) create(tn30Var, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:25:0x008b  */
            /* JADX WARN: Code duplicated, block: B:26:0x0096  */
            /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
            /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
            /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:42:0x00de  */
            /* JADX WARN: Code duplicated, block: B:72:0x0150  */
            /* JADX WARN: Code duplicated, block: B:75:0x0164  */
            /* JADX WARN: Code duplicated, block: B:77:0x0176  */
            /* JADX WARN: Code duplicated, block: B:78:0x017e  */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
            
                if (r9 == r4) goto L80;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
            
                if (r9 == r4) goto L80;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x0180, code lost:
            
                if (r9 == r4) goto L80;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    Method dump skipped, instruction units count: 426
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: zr40.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = zr40.this.new c(v1bVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                zr40 zr40Var = zr40.this;
                wwd0 wwd0Var = zr40Var.D;
                a aVar = new a(zr40Var, v5bVar, null);
                this.b = null;
                this.a = 1;
                if (kzh.b(wwd0Var, aVar, this) == y5bVar) {
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

    public static final class c0 implements lyh<Boolean> {
        public final /* synthetic */ v340 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: zr40$c0$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$special$$inlined$map$5$2", f = "RefsCallViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1416a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1416a(v1b v1bVar) {
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
                C1416a c1416a;
                if (v1bVar instanceof C1416a) {
                    c1416a = (C1416a) v1bVar;
                    int i = c1416a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1416a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1416a = new C1416a(v1bVar);
                    }
                } else {
                    c1416a = new C1416a(v1bVar);
                }
                Object obj2 = c1416a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1416a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((ap30) obj) instanceof ap30.a);
                    c1416a.b = 1;
                    if (this.a.emit(boolValueOf, c1416a) == y5bVar) {
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

        public c0(v340 v340Var) {
            this.a = v340Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
            Object objCollect = this.a.a.collect(new a(myhVar), (v1b<? super Unit>) v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$animationState$1", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements gaj<yo30, rq30, v1b<? super nl30>, Object> {
        public /* synthetic */ yo30 a;
        public /* synthetic */ rq30 b;

        @Override // defpackage.gaj
        public final Object invoke(yo30 yo30Var, rq30 rq30Var, v1b<? super nl30> v1bVar) {
            d dVar = new d(3, v1bVar);
            dVar.a = yo30Var;
            dVar.b = rq30Var;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            yo30 yo30Var = this.a;
            rq30 rq30Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return yo30Var instanceof yo30.c ? new nl30.a(rq30Var) : nl30.b.a;
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$spineData$1", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d0 extends tje0 implements gaj<tn30, ql30, v1b<? super rq30>, Object> {
        public /* synthetic */ tn30 a;
        public /* synthetic */ ql30 b;

        public d0(v1b<? super d0> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(tn30 tn30Var, ql30 ql30Var, v1b<? super rq30> v1bVar) {
            d0 d0Var = zr40.this.new d0(v1bVar);
            d0Var.a = tn30Var;
            d0Var.b = ql30Var;
            return d0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var = zr40.this.P;
            tn30 tn30Var = this.a;
            ql30 ql30Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (Intrinsics.g(tn30Var, tn30.b.a)) {
                return new rq30.b((bp30) wwd0Var.getValue());
            }
            if (Intrinsics.g(tn30Var, tn30.a.a)) {
                return new rq30.c((bp30) wwd0Var.getValue());
            }
            if ((tn30Var instanceof tn30.d) || Intrinsics.g(tn30Var, tn30.c.a)) {
                return new rq30.a((bp30) wwd0Var.getValue(), ql30Var.b, ql30Var.j);
            }
            return null;
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$betResultState$1", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements jaj<ql30, tn30, ol30, tq30, v1b<? super fn30>, Object> {
        public /* synthetic */ ql30 a;
        public /* synthetic */ tn30 b;
        public /* synthetic */ ol30 c;
        public /* synthetic */ tq30 d;

        public e(v1b<? super e> v1bVar) {
            super(5, v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            CMSRes cMSRes;
            fq30 aVar;
            ql30 ql30Var = this.a;
            tn30 tn30Var = this.b;
            ol30 ol30Var = this.c;
            tq30 tq30Var = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ql30Var.getClass();
            tn30Var.getClass();
            ol30Var.getClass();
            tq30Var.getClass();
            if (!tn30Var.equals(tn30.c.a)) {
                return fn30.b.a;
            }
            boolean z = ql30Var.k;
            String str = ql30Var.c;
            if (z) {
                String strM = ox2.m(ql30Var.g, str);
                if (ol30Var instanceof ol30.a) {
                    aVar = fq30.b.a;
                } else {
                    if (!(ol30Var instanceof ol30.b)) {
                        uhc.a();
                        return null;
                    }
                    aVar = new fq30.a(ox2.m(ql30Var.d, str), ox2.m(ql30Var.h, str));
                }
                return new fn30.a.b(strM, aVar);
            }
            int iOrdinal = tq30Var.ordinal();
            if (iOrdinal == 0) {
                cMSRes = jn30.c0.n;
            } else if (iOrdinal == 1) {
                cMSRes = jn30.c0.m;
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                cMSRes = jn30.c0.o;
            }
            return new fn30.a.C0575a(cMSRes);
        }

        @Override // defpackage.jaj
        public final Object l(ql30 ql30Var, tn30 tn30Var, ol30 ol30Var, tq30 tq30Var, v1b<? super fn30> v1bVar) {
            e eVar = zr40.this.new e(v1bVar);
            eVar.a = ql30Var;
            eVar.b = tn30Var;
            eVar.c = ol30Var;
            eVar.d = tq30Var;
            return eVar.invokeSuspend(Unit.a);
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$uiState$1", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e0 extends tje0 implements jaj<ap30, nl30, nn30, Boolean, v1b<? super sq30>, Object> {
        public /* synthetic */ ap30 a;
        public /* synthetic */ nl30 b;
        public /* synthetic */ nn30 c;
        public /* synthetic */ boolean d;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ap30 ap30Var = this.a;
            nl30 nl30Var = this.b;
            nn30 nn30Var = this.c;
            boolean z = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new sq30(ap30Var, nl30Var, nn30Var, z);
        }

        @Override // defpackage.jaj
        public final Object l(ap30 ap30Var, nl30 nl30Var, nn30 nn30Var, Boolean bool, v1b<? super sq30> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            e0 e0Var = new e0(5, v1bVar);
            e0Var.a = ap30Var;
            e0Var.b = nl30Var;
            e0Var.c = nn30Var;
            e0Var.d = zBooleanValue;
            return e0Var.invokeSuspend(Unit.a);
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$betSliderState$1", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements iaj<yo30.c, ol30, uq30, v1b<? super s03>, Object> {
        public /* synthetic */ yo30.c a;
        public /* synthetic */ ol30 b;
        public /* synthetic */ uq30 c;

        @Override // defpackage.iaj
        public final Object d(yo30.c cVar, ol30 ol30Var, uq30 uq30Var, v1b<? super s03> v1bVar) {
            f fVar = new f(4, v1bVar);
            fVar.a = cVar;
            fVar.b = ol30Var;
            fVar.c = uq30Var;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            yo30.c cVar = this.a;
            ol30 ol30Var = this.b;
            uq30 uq30Var = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            BigDecimal bigDecimalSubtract = cVar.c.subtract(cVar.b);
            bigDecimalSubtract.getClass();
            BigDecimal bigDecimal = skd0.b;
            BigDecimal bigDecimalAbs = bigDecimalSubtract.abs();
            bigDecimalAbs.getClass();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100L);
            bigDecimalValueOf.getClass();
            bigDecimalAbs.divide(bigDecimalValueOf, RoundingMode.HALF_EVEN).getClass();
            BigDecimal bigDecimalA = ol30Var.a();
            BigDecimal bigDecimal2 = cVar.b;
            BigDecimal bigDecimal3 = cVar.c;
            if (ol30Var instanceof ol30.a) {
                z = false;
            } else {
                if (!(ol30Var instanceof ol30.b)) {
                    uhc.a();
                    return null;
                }
                z = true;
            }
            return new s03(bigDecimal2, bigDecimal3, bigDecimalA, z, uq30Var.a, cVar.e);
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$bgMusic$1", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements gaj<tn30, Boolean, v1b<? super in30>, Object> {
        public /* synthetic */ tn30 a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(tn30 tn30Var, Boolean bool, v1b<? super in30> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            g gVar = new g(3, v1bVar);
            gVar.a = tn30Var;
            gVar.b = zBooleanValue;
            return gVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            tn30 tn30Var = this.a;
            boolean z = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!z) {
                return in30.b.a;
            }
            if (Intrinsics.g(tn30Var, tn30.b.a) || Intrinsics.g(tn30Var, tn30.c.a) || Intrinsics.g(tn30Var, tn30.d.a)) {
                return new in30.a(jn30.c0.R);
            }
            if (Intrinsics.g(tn30Var, tn30.a.a) || (tn30Var instanceof tn30.e)) {
                return new in30.a(jn30.c0.S);
            }
            uhc.a();
            return null;
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$chipSelectorState$1", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class h extends tje0 implements iaj<yo30.c, ol30, uq30, v1b<? super bm7>, Object> {
        public /* synthetic */ yo30.c a;
        public /* synthetic */ ol30 b;
        public /* synthetic */ uq30 c;

        @Override // defpackage.iaj
        public final Object d(yo30.c cVar, ol30 ol30Var, uq30 uq30Var, v1b<? super bm7> v1bVar) {
            h hVar = new h(4, v1bVar);
            hVar.a = cVar;
            hVar.b = ol30Var;
            hVar.c = uq30Var;
            return hVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            yo30.c cVar = this.a;
            ol30 ol30Var = this.b;
            uq30 uq30Var = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (ol30Var instanceof ol30.a) {
                z = true;
            } else {
                if (!(ol30Var instanceof ol30.b)) {
                    uhc.a();
                    return null;
                }
                z = false;
            }
            return new bm7(z, uq30Var.d, cVar.e, cVar.b, cVar.c, ol30Var.a());
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$controlPanelState$1", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class i extends tje0 implements iaj<tn30, s03, bm7, v1b<? super mn30>, Object> {
        public /* synthetic */ tn30 a;
        public /* synthetic */ s03 b;
        public /* synthetic */ bm7 c;

        @Override // defpackage.iaj
        public final Object d(tn30 tn30Var, s03 s03Var, bm7 bm7Var, v1b<? super mn30> v1bVar) {
            i iVar = new i(4, v1bVar);
            iVar.a = tn30Var;
            iVar.b = s03Var;
            iVar.c = bm7Var;
            return iVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            tn30 tn30Var = this.a;
            s03 s03Var = this.b;
            bm7 bm7Var = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Intrinsics.g(tn30Var, tn30.b.a) ? new mn30.a(s03Var, bm7Var) : mn30.b.a;
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$handleEvent$2", f = "RefsCallViewModel.kt", l = {427, 428}, m = "invokeSuspend", v = 1)
    public static final class j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ rn30 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(rn30 rn30Var, v1b<? super j> v1bVar) {
            super(2, v1bVar);
            this.c = rn30Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zr40.this.new j(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            if (defpackage.un30.a(r6, r5) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                zr40 r2 = defpackage.zr40.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L12
                defpackage.uj50.b(r6)
                goto L3d
            L12:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L19:
                defpackage.uj50.b(r6)
                goto L32
            L1d:
                defpackage.uj50.b(r6)
                wwd0 r6 = r2.K
                rn30 r1 = r5.c
                rn30$b r1 = (rn30.b) r1
                tq30 r1 = r1.a
                r5.a = r4
                r6.setValue(r1)
                kotlin.Unit r6 = kotlin.Unit.a
                if (r6 != r0) goto L32
                goto L3c
            L32:
                wwd0 r6 = r2.D
                r5.a = r3
                java.lang.Object r5 = defpackage.un30.a(r6, r5)
                if (r5 != r0) goto L3d
            L3c:
                return r0
            L3d:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: zr40.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$handleEvent$4", f = "RefsCallViewModel.kt", l = {458, 459, 460}, m = "invokeSuspend", v = 1)
    public static final class k extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public k(v1b<? super k> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zr40.this.new k(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        
            if (defpackage.un30.b(r9, r8) == r0) goto L20;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r8.a
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                zr40 r6 = defpackage.zr40.this
                if (r1 == 0) goto L24
                if (r1 == r5) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L16
                defpackage.uj50.b(r9)
                goto L66
            L16:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r2
            L1c:
                defpackage.uj50.b(r9)
                goto L5b
            L20:
                defpackage.uj50.b(r9)
                goto L47
            L24:
                defpackage.uj50.b(r9)
                wwd0 r9 = r6.Q
                v340 r1 = r6.M
                uwd0<T> r1 = r1.a
                java.lang.Object r1 = r1.getValue()
                yo30$c r1 = (yo30.c) r1
                java.math.BigDecimal r1 = r1.d
                ol30$a r7 = new ol30$a
                r7.<init>(r1)
                r8.a = r5
                r9.getClass()
                r9.k(r2, r7)
                kotlin.Unit r9 = kotlin.Unit.a
                if (r9 != r0) goto L47
                goto L65
            L47:
                wwd0 r9 = r6.P
                uag r1 = defpackage.bp30.d
                lx30$a r2 = defpackage.lx30.INSTANCE
                java.lang.Object r1 = kotlin.collections.CollectionsKt.k0(r1, r2)
                r8.a = r4
                r9.setValue(r1)
                kotlin.Unit r9 = kotlin.Unit.a
                if (r9 != r0) goto L5b
                goto L65
            L5b:
                wwd0 r9 = r6.D
                r8.a = r3
                java.lang.Object r8 = defpackage.un30.b(r9, r8)
                if (r8 != r0) goto L66
            L65:
                return r0
            L66:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: zr40.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$handleEvent$5", f = "RefsCallViewModel.kt", l = {465, 466}, m = "invokeSuspend", v = 1)
    public static final class l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ rn30 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(rn30 rn30Var, v1b<? super l> v1bVar) {
            super(2, v1bVar);
            this.c = rn30Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zr40.this.new l(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (kotlin.Unit.a == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                zr40 r2 = defpackage.zr40.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L12
                defpackage.uj50.b(r6)
                goto L41
            L12:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L19:
                defpackage.uj50.b(r6)
                goto L33
            L1d:
                defpackage.uj50.b(r6)
                en20 r6 = r2.f
                rn30 r1 = r5.c
                rn30$i r1 = (rn30.i) r1
                boolean r1 = r1.a
                r5.a = r4
                java.lang.String r4 = "key-Refs-call-one-tap-bet"
                java.lang.Object r6 = r6.a(r4, r1, r5)
                if (r6 != r0) goto L33
                goto L40
            L33:
                wwd0 r6 = r2.G
                nn30$d r1 = nn30.d.a
                r5.a = r3
                r6.setValue(r1)
                kotlin.Unit r5 = kotlin.Unit.a
                if (r5 != r0) goto L41
            L40:
                return r0
            L41:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: zr40.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$handleEvent$6", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class m extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public m(v1b<? super m> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zr40.this.new m(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((m) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            dm8 dm8Var = zr40.this.C;
            if (dm8Var != null) {
                dm8Var.R(Unit.a);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$handleEvent$7", f = "RefsCallViewModel.kt", l = {496}, m = "invokeSuspend", v = 1)
    public static final class n extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public n(v1b<? super n> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zr40.this.new n(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((n) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = zr40.this.D;
                this.a = 1;
                if (un30.a(wwd0Var, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$handleEvent$8", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class o extends tje0 implements gaj<myh<? super uq30>, Throwable, v1b<? super Unit>, Object> {
        @Override // defpackage.gaj
        public final Object invoke(myh<? super uq30> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            return new o(3, v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$handleEvent$9", f = "RefsCallViewModel.kt", l = {523}, m = "invokeSuspend", v = 1)
    public static final class p extends tje0 implements Function2<uq30, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public p(v1b<? super p> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            p pVar = zr40.this.new p(v1bVar);
            pVar.b = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(uq30 uq30Var, v1b<? super Unit> v1bVar) {
            return ((p) create(uq30Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            uq30 uq30Var = (uq30) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = zr40.this.H;
                this.b = null;
                this.a = 1;
                wwd0Var.setValue(uq30Var);
                if (Unit.a == y5bVar) {
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

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$loadedState$1", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class q extends tje0 implements gaj<fn30, pl30, v1b<? super Pair<? extends fn30, ? extends pl30>>, Object> {
        public /* synthetic */ fn30 a;
        public /* synthetic */ pl30 b;

        @Override // defpackage.gaj
        public final Object invoke(fn30 fn30Var, pl30 pl30Var, v1b<? super Pair<? extends fn30, ? extends pl30>> v1bVar) {
            q qVar = new q(3, v1bVar);
            qVar.a = fn30Var;
            qVar.b = pl30Var;
            return qVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            fn30 fn30Var = this.a;
            pl30 pl30Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(fn30Var, pl30Var);
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$loadedState$2", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class r extends tje0 implements kaj<Pair<? extends fn30, ? extends pl30>, rp30, mn30, jv1, in30, v1b<? super ap30.a>, Object> {
        public /* synthetic */ Pair a;
        public /* synthetic */ rp30 b;
        public /* synthetic */ mn30 c;
        public /* synthetic */ jv1 d;
        public /* synthetic */ in30 e;

        public r(v1b<? super r> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(Pair<? extends fn30, ? extends pl30> pair, rp30 rp30Var, mn30 mn30Var, jv1 jv1Var, in30 in30Var, v1b<? super ap30.a> v1bVar) {
            r rVar = new r(v1bVar);
            rVar.a = pair;
            rVar.b = rp30Var;
            rVar.c = mn30Var;
            rVar.d = jv1Var;
            rVar.e = in30Var;
            return rVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Pair pair = this.a;
            rp30 rp30Var = this.b;
            mn30 mn30Var = this.c;
            jv1 jv1Var = this.d;
            in30 in30Var = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new ap30.a((pl30) pair.b, rp30Var, mn30Var, jv1Var, (fn30) pair.a, in30Var);
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$loadingState$1", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class s extends tje0 implements jaj<Boolean, yo30, Boolean, ap30.a, v1b<? super ap30>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ yo30 b;
        public /* synthetic */ boolean c;
        public /* synthetic */ ap30.a d;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            yo30 yo30Var = this.b;
            boolean z2 = this.c;
            ap30.a aVar = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (yo30Var instanceof yo30.b) {
                return new ap30.b(((yo30.b) yo30Var).a);
            }
            if ((yo30Var instanceof yo30.c) && z2 && z) {
                return aVar;
            }
            return null;
        }

        @Override // defpackage.jaj
        public final Object l(Boolean bool, yo30 yo30Var, Boolean bool2, ap30.a aVar, v1b<? super ap30> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            s sVar = new s(5, v1bVar);
            sVar.a = zBooleanValue;
            sVar.b = yo30Var;
            sVar.c = zBooleanValue2;
            sVar.d = aVar;
            return sVar.invokeSuspend(Unit.a);
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$pointerState$1", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class t extends tje0 implements gaj<tn30, mk50<? extends ql30>, v1b<? super rp30>, Object> {
        public /* synthetic */ tn30 a;
        public /* synthetic */ mk50 b;

        public t(v1b<? super t> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(tn30 tn30Var, mk50<? extends ql30> mk50Var, v1b<? super rp30> v1bVar) {
            t tVar = zr40.this.new t(v1bVar);
            tVar.a = tn30Var;
            tVar.b = mk50Var;
            return tVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            float f;
            tn30 tn30Var = this.a;
            mk50 mk50Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            tn30Var.getClass();
            mk50Var.getClass();
            if (!(tn30Var instanceof tn30.e)) {
                return rp30.d.a;
            }
            if ((mk50Var instanceof mk50.a) || mk50Var.equals(mk50.b.a)) {
                return rp30.c.a;
            }
            if (!(mk50Var instanceof mk50.c)) {
                uhc.a();
                return null;
            }
            ql30 ql30Var = (ql30) ((mk50.c) mk50Var).a;
            tq30 tq30Var = ql30Var.b;
            float f2 = ql30Var.i;
            int iOrdinal = tq30Var.ordinal();
            if (iOrdinal == 0) {
                f = ((f2 * 100.0f) % 72.0f) + 9.0f;
            } else if (iOrdinal == 1) {
                f = ((f2 * 100.0f) % 72.0f) + 9.0f + 180.0f;
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                f = 0.0f;
            }
            return new rp30.b(f);
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$showExitDialog$1", f = "RefsCallViewModel.kt", l = {535}, m = "invokeSuspend", v = 1)
    public static final class u extends tje0 implements Function2<iwg, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ UiText d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(UiText uiText, boolean z, boolean z2, v1b<? super u> v1bVar) {
            super(2, v1bVar);
            this.d = uiText;
            this.e = z;
            this.f = z2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            u uVar = zr40.this.new u(this.d, this.e, this.f, v1bVar);
            uVar.b = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iwg iwgVar, v1b<? super Unit> v1bVar) {
            return ((u) create(iwgVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            iwg iwgVar = (iwg) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = zr40.this.G;
                nn30.f fVar = new nn30.f(this.d, iwgVar, this.e, this.f);
                this.b = null;
                this.a = 1;
                wwd0Var.getClass();
                wwd0Var.k(null, fVar);
                if (Unit.a == y5bVar) {
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

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$showWinningConfetti$1", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class v extends tje0 implements gaj<ql30, tn30, v1b<? super Boolean>, Object> {
        public /* synthetic */ ql30 a;
        public /* synthetic */ tn30 b;

        @Override // defpackage.gaj
        public final Object invoke(ql30 ql30Var, tn30 tn30Var, v1b<? super Boolean> v1bVar) {
            v vVar = new v(3, v1bVar);
            vVar.a = ql30Var;
            vVar.b = tn30Var;
            return vVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ql30 ql30Var = this.a;
            tn30 tn30Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(((tn30Var instanceof tn30.d) || Intrinsics.g(tn30Var, tn30.c.a)) ? ql30Var.k : false);
        }
    }

    @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$sidePanelState$1", f = "RefsCallViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class w extends tje0 implements gaj<com.sportygames.newcms.b, yo30.c, v1b<? super qq30>, Object> {
        public /* synthetic */ com.sportygames.newcms.b a;
        public /* synthetic */ yo30.c b;

        @Override // defpackage.gaj
        public final Object invoke(com.sportygames.newcms.b bVar, yo30.c cVar, v1b<? super qq30> v1bVar) {
            w wVar = new w(3, v1bVar);
            wVar.a = bVar;
            wVar.b = cVar;
            return wVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sportygames.newcms.b bVar = this.a;
            yo30.c cVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new qq30(new me90.a(bVar.b(jn30.c0.h, ""), cVar.g));
        }
    }

    public static final class x implements lyh<Boolean> {
        public final /* synthetic */ lyh a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: zr40$x$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$special$$inlined$filter$1$2", f = "RefsCallViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1417a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1417a(v1b v1bVar) {
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
                C1417a c1417a;
                if (v1bVar instanceof C1417a) {
                    c1417a = (C1417a) v1bVar;
                    int i = c1417a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1417a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1417a = new C1417a(v1bVar);
                    }
                } else {
                    c1417a = new C1417a(v1bVar);
                }
                Object obj2 = c1417a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1417a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (((Boolean) obj).booleanValue()) {
                        c1417a.b = 1;
                        if (this.a.emit(obj, c1417a) == y5bVar) {
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

        public x(lyh lyhVar) {
            this.a = lyhVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class y implements lyh<ql30> {
        public final /* synthetic */ wwd0 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: zr40$y$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$special$$inlined$map$1$2", f = "RefsCallViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1418a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1418a(v1b v1bVar) {
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
                C1418a c1418a;
                if (v1bVar instanceof C1418a) {
                    c1418a = (C1418a) v1bVar;
                    int i = c1418a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1418a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1418a = new C1418a(v1bVar);
                    }
                } else {
                    c1418a = new C1418a(v1bVar);
                }
                Object obj2 = c1418a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1418a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    mk50 mk50Var = (mk50) obj;
                    ql30 ql30Var = mk50Var instanceof mk50.c ? (ql30) ((mk50.c) mk50Var).a : null;
                    c1418a.b = 1;
                    if (this.a.emit(ql30Var, c1418a) == y5bVar) {
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

        public y(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super ql30> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    public static final class z implements lyh<yo30.c> {
        public final /* synthetic */ wwd0 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: zr40$z$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$special$$inlined$map$2$2", f = "RefsCallViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C1419a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1419a(v1b v1bVar) {
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
                C1419a c1419a;
                if (v1bVar instanceof C1419a) {
                    c1419a = (C1419a) v1bVar;
                    int i = c1419a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1419a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1419a = new C1419a(v1bVar);
                    }
                } else {
                    c1419a = new C1419a(v1bVar);
                }
                Object obj2 = c1419a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1419a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    yo30 yo30Var = (yo30) obj;
                    yo30.c cVar = yo30Var instanceof yo30.c ? (yo30.c) yo30Var : null;
                    c1419a.b = 1;
                    if (this.a.emit(cVar, c1419a) == y5bVar) {
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

        public z(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super yo30.c> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    public zr40(k5b k5bVar, vn30 vn30Var, do30 do30Var, cq30 cq30Var, gn30 gn30Var, en20 en20Var, String str) {
        k5bVar.getClass();
        vn30Var.getClass();
        do30Var.getClass();
        cq30Var.getClass();
        gn30Var.getClass();
        en20Var.getClass();
        this.a = k5bVar;
        this.b = vn30Var;
        this.c = do30Var;
        this.d = cq30Var;
        this.e = gn30Var;
        this.f = en20Var;
        this.i = str;
        hn20 booleanByFlow = en20Var.getBooleanByFlow("key-Refs-call-music", true);
        Boolean bool = Boolean.TRUE;
        v340 v340VarF1 = F1(booleanByFlow, bool);
        this.y = F1(en20Var.getBooleanByFlow("key-Refs-call-sound", true), bool);
        hn20 booleanByFlow2 = en20Var.getBooleanByFlow("key-Refs-call-one-tap-bet", false);
        Boolean bool2 = Boolean.FALSE;
        this.z = F1(booleanByFlow2, bool2);
        wwd0 wwd0VarA = xwd0.a(tn30.b.a);
        this.D = wwd0VarA;
        v340 v340VarF2 = F1(new n1i(wwd0VarA, v340VarF1, new g(3, null)), in30.b.a);
        wwd0 wwd0VarA2 = xwd0.a(bool2);
        this.E = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(bool2);
        this.F = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(nn30.d.a);
        this.G = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a(new uq30());
        this.H = wwd0VarA5;
        v340 v340VarF3 = F1(new cv1(new h1i(new av1.a("", null, null), wwd0VarA5, new ev1(3, null)), this), new jv1(0));
        wwd0 wwd0VarA6 = xwd0.a(mk50.b.a);
        this.I = wwd0VarA6;
        f1i f1iVar = new f1i(new y(wwd0VarA6));
        tq30 tq30Var = tq30.d;
        BigDecimal bigDecimal = skd0.b;
        v340 v340VarF4 = F1(f1iVar, new ql30(tq30Var, tq30Var, "", bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal, 0.0f, 0));
        this.J = v340VarF4;
        v340 v340VarF5 = F1(new n1i(wwd0VarA, wwd0VarA6, new t(null)), rp30.d.a);
        wwd0 wwd0VarA7 = xwd0.a(tq30Var);
        this.K = wwd0VarA7;
        wwd0 wwd0VarA8 = xwd0.a(new yo30.b(0.0f));
        this.L = wwd0VarA8;
        v340 v340VarF6 = F1(new f1i(new z(wwd0VarA8)), new yo30.c(new com.sportygames.newcms.b(0), bigDecimal, bigDecimal, bigDecimal, n1a0.c, new uq30(), new iph0(0)));
        this.M = v340VarF6;
        v340 v340VarF7 = F1(new a0(v340VarF6), new com.sportygames.newcms.b(0));
        this.N = v340VarF7;
        this.O = F1(new n1i(v340VarF7, v340VarF6, new w(3, null)), new qq30(new me90.a(0)));
        this.P = xwd0.a(CollectionsKt.k0(bp30.d, lx30.INSTANCE));
        wwd0 wwd0VarA9 = xwd0.a(new ol30.a(bigDecimal));
        this.Q = wwd0VarA9;
        v340 v340VarF8 = F1(r1i.c(new n1i(F1(r1i.b(v340VarF4, wwd0VarA, wwd0VarA9, wwd0VarA7, new e(null)), fn30.b.a), F1(new b0(wwd0VarA, this), pl30.a.a), new q(3, null)), v340VarF5, F1(r1i.a(wwd0VarA, F1(r1i.a(v340VarF6, wwd0VarA9, wwd0VarA5, new f(4, null)), new s03()), F1(r1i.a(v340VarF6, wwd0VarA9, wwd0VarA5, new h(4, null)), new bm7()), new i(4, null)), new mn30.a(0)), v340VarF3, v340VarF2, new r(null)), new ap30.a(0));
        v340 v340VarF9 = F1(new n1i(wwd0VarA8, F1(new f1i(new n1i(wwd0VarA, v340VarF4, new d0(null))), new rq30.b(0)), new d(3, null)), nl30.b.a);
        v340 v340VarF10 = F1(new f1i(r1i.b(wwd0VarA2, wwd0VarA8, wwd0VarA3, v340VarF8, new s(5, null))), new ap30.b(0));
        this.R = F1(r1i.b(v340VarF10, v340VarF9, wwd0VarA4, F1(new n1i(v340VarF4, wwd0VarA, new v(3, null)), bool2), new e0(5, null)), new sq30(0));
        kzh.d(new g1i(new x(uzh.b(new c0(v340VarF10))), new a(null)), o8i0.d(this));
        kzh.d(new g1i(v340VarF6, new b(null)), o8i0.d(this));
        ej5.c(o8i0.d(this), null, null, new c(null), 3);
    }

    public final void A1(rn30 rn30Var) {
        Object value;
        ol30 aVar;
        rn30Var.getClass();
        boolean z2 = rn30Var instanceof rn30.a;
        wwd0 wwd0Var = this.Q;
        if (z2) {
            C1(jn30.c0.T);
            do {
                value = wwd0Var.getValue();
                aVar = (ol30) value;
                if (aVar instanceof ol30.a) {
                    BigDecimal bigDecimalAdd = ((ol30.a) aVar).a.add(((rn30.a) rn30Var).a);
                    bigDecimalAdd.getClass();
                    BigDecimal bigDecimal = skd0.b;
                    aVar = new ol30.a(bigDecimalAdd);
                } else if (!(aVar instanceof ol30.b)) {
                    uhc.a();
                    return;
                }
            } while (!wwd0Var.g(value, aVar));
            Unit unit = Unit.a;
            return;
        }
        if (rn30Var instanceof rn30.b) {
            rn30.b bVar = (rn30.b) rn30Var;
            boolean z3 = bVar.b;
            tq30 tq30Var = bVar.a;
            jn30 jn30Var = jn30.c0;
            if (B1(z3, tq30Var, new rn30.b(tq30Var, false), jn30Var.Z)) {
                return;
            }
            C1(jn30Var.Z);
            ej5.c(o8i0.d(this), null, null, new j(rn30Var, null), 3);
            return;
        }
        boolean zEquals = rn30Var.equals(rn30.c.a);
        v340 v340Var = this.M;
        if (zEquals) {
            ol30.a aVar2 = new ol30.a(((yo30.c) v340Var.a.getValue()).d);
            wwd0Var.getClass();
            wwd0Var.k(null, aVar2);
            return;
        }
        if (rn30Var instanceof rn30.d) {
            E1(null, ((rn30.d) rn30Var).a, false);
            Unit unit2 = Unit.a;
            return;
        }
        boolean zEquals2 = rn30Var.equals(rn30.e.a);
        wwd0 wwd0Var2 = this.G;
        if (zEquals2) {
            wwd0Var2.setValue(nn30.d.a);
            return;
        }
        if (rn30Var.equals(rn30.f.a)) {
            this.v = false;
            this.w = false;
            y1();
            wwd0Var2.setValue(nn30.d.a);
            return;
        }
        if (rn30Var.equals(rn30.g.a)) {
            Object value2 = wwd0Var2.getValue();
            nn30.d dVar = nn30.d.a;
            if (!Intrinsics.g(value2, dVar)) {
                wwd0Var2.setValue(dVar);
                return;
            } else {
                A1(new rn30.d(true));
                Unit unit3 = Unit.a;
                return;
            }
        }
        if (rn30Var.equals(rn30.h.a)) {
            C1(jn30.c0.W);
            ej5.c(o8i0.d(this), null, null, new k(null), 3);
            return;
        }
        if (rn30Var instanceof rn30.i) {
            ej5.c(o8i0.d(this), null, null, new l(rn30Var, null), 3);
            return;
        }
        if (rn30Var.equals(rn30.j.a)) {
            nn30.b bVar2 = new nn30.b(((uq30) this.H.getValue()).c, ((yo30.c) v340Var.a.getValue()).c.doubleValue(), ((yo30.c) v340Var.a.getValue()).b.doubleValue(), ((yo30.c) v340Var.a.getValue()).c.doubleValue());
            wwd0Var2.getClass();
            wwd0Var2.k(null, bVar2);
            return;
        }
        if (rn30Var.equals(rn30.k.a)) {
            wwd0Var2.setValue(this.O.a.getValue());
            return;
        }
        if (rn30Var.equals(rn30.l.a)) {
            ej5.c(o8i0.d(this), null, null, new m(null), 3);
            return;
        }
        if (rn30Var instanceof rn30.m) {
            if (B1(((rn30.m) rn30Var).a, (tq30) this.K.getValue(), new rn30.m(false), jn30.c0.Y)) {
                return;
            }
            ej5.c(o8i0.d(this), null, null, new n(null), 3);
            return;
        }
        if (rn30Var.equals(rn30.n.a)) {
            dm8 dm8Var = this.B;
            if (dm8Var != null) {
                dm8Var.R(Unit.a);
                return;
            }
            return;
        }
        if (rn30Var.equals(rn30.o.a)) {
            Boolean bool = Boolean.TRUE;
            wwd0 wwd0Var3 = this.F;
            wwd0Var3.getClass();
            wwd0Var3.k(null, bool);
            return;
        }
        if (rn30Var instanceof rn30.p) {
            wwd0Var2.setValue(((rn30.p) rn30Var).a);
            return;
        }
        if (rn30Var instanceof rn30.r) {
            C1(jn30.c0.U);
            ol30.a aVar3 = new ol30.a(((rn30.r) rn30Var).a);
            wwd0Var.getClass();
            wwd0Var.k(null, aVar3);
            return;
        }
        if (!(rn30Var instanceof rn30.s)) {
            if (!rn30Var.equals(rn30.q.a)) {
                uhc.a();
                return;
            } else {
                if (this.L.getValue() instanceof yo30.c) {
                    kzh.d(new g1i(new yzh(this.c.invoke(), new o(3, null)), new p(null)), o8i0.d(this));
                    return;
                }
                return;
            }
        }
        rn30.s sVar = (rn30.s) rn30Var;
        GiftItem giftItem = sVar.a;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(sVar.b);
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimal2 = skd0.b;
        ol30.b bVar3 = new ol30.b(giftItem, bigDecimalValueOf);
        wwd0Var.getClass();
        wwd0Var.k(null, bVar3);
        wwd0Var2.setValue(nn30.d.a);
    }

    public final boolean B1(boolean z2, tq30 tq30Var, rn30 rn30Var, CMSRes cMSRes) {
        wwd0 wwd0Var = this.G;
        if (!z2 || ((Boolean) this.z.a.getValue()).booleanValue()) {
            C1(cMSRes);
            wwd0Var.setValue(nn30.d.a);
            return false;
        }
        String str = ((uq30) this.H.getValue()).b;
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String strA = ((com.sportygames.newcms.b) this.N.a.getValue()).a(tq30Var.c, new String[0]);
        String str2 = decimalFormat.format(((ol30) this.Q.getValue()).a().setScale(2, RoundingMode.DOWN));
        jn30 jn30Var = jn30.c0;
        tbd tbdVar = jn30Var.f;
        tbd tbdVar2 = jn30Var.f;
        nn30.a aVar = new nn30.a(new CMSUiText(tbdVar.i, a4h.a(str, str2, strA)), new CMSUiText(tbdVar2.j), new CMSUiText(tbdVar2.k), rn30.e.a, rn30Var);
        wwd0Var.getClass();
        wwd0Var.k(null, aVar);
        return true;
    }

    public final void C1(CMSRes cMSRes) {
        if (((Boolean) this.y.a.getValue()).booleanValue()) {
            ((com.sportygames.newcms.b) this.N.a.getValue()).c(cMSRes);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D1(ojd ojdVar, x1b x1bVar) {
        gs40 gs40Var;
        if (x1bVar instanceof gs40) {
            gs40Var = (gs40) x1bVar;
            int i2 = gs40Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gs40Var.d = i2 - Integer.MIN_VALUE;
            } else {
                gs40Var = new gs40(this, x1bVar);
            }
        } else {
            gs40Var = new gs40(this, x1bVar);
        }
        Object obj = gs40Var.b;
        y5b y5bVar = y5b.a;
        int i3 = gs40Var.d;
        try {
            if (i3 == 0) {
                uj50.b(obj);
                gs40Var.a = ojdVar;
                gs40Var.d = 1;
                Object objAwait = ojdVar.await(gs40Var);
                return objAwait == y5bVar ? y5bVar : objAwait;
            }
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ojd ojdVar2 = gs40Var.a;
            uj50.b(obj);
            return obj;
        } catch (Throwable unused) {
            ojdVar.cancel((CancellationException) null);
            return null;
        }
    }

    public final void E1(UiText uiText, boolean z2, boolean z3) {
        kzh.d(new g1i(this.d.a(this.i), new u(uiText, z2, z3, null)), o8i0.d(this));
    }

    public final v340 F1(lyh lyhVar, Object obj) {
        return e1i.e(ozh.c(lyhVar, this.a), o8i0.d(this), q490.a.a, obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x1(v5b v5bVar, x1b x1bVar) {
        as40 as40Var;
        String giftId;
        if (x1bVar instanceof as40) {
            as40Var = (as40) x1bVar;
            int i2 = as40Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                as40Var.d = i2 - Integer.MIN_VALUE;
            } else {
                as40Var = new as40(this, x1bVar);
            }
        } else {
            as40Var = new as40(this, x1bVar);
        }
        Object obj = as40Var.b;
        y5b y5bVar = y5b.a;
        int i3 = as40Var.d;
        if (i3 == 0) {
            uj50.b(obj);
            String str = ((uq30) this.H.getValue()).b;
            wwd0 wwd0Var = this.Q;
            double dDoubleValue = ((ol30) wwd0Var.getValue()).a().doubleValue();
            tq30 tq30Var = (tq30) this.K.getValue();
            ol30 ol30Var = (ol30) wwd0Var.getValue();
            if (ol30Var instanceof ol30.a) {
                giftId = null;
            } else {
                if (!(ol30Var instanceof ol30.b)) {
                    uhc.a();
                    return null;
                }
                giftId = ((ol30.b) ol30Var).a.getGiftId();
            }
            lyh lyhVarA = this.e.a(dDoubleValue, tq30Var, str, giftId);
            bs40 bs40Var = new bs40(this, null);
            as40Var.a = v5bVar;
            as40Var.d = 1;
            Object objCollect = lyhVarA.collect(new g1i.a(gyx.a, bs40Var), as40Var);
            if (objCollect != y5bVar) {
                objCollect = Unit.a;
            }
            if (objCollect != y5bVar) {
                objCollect = Unit.a;
            }
            if (objCollect == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v5bVar = as40Var.a;
            uj50.b(obj);
        }
        this.A = ej5.a(v5bVar, null, new cs40(this, null), 3);
        return Unit.a;
    }

    public final void y1() {
        if (this.v) {
            return;
        }
        this.v = true;
        vn30 vn30Var = this.b;
        String str = this.i;
        kzh.d(new xzh(new g1i(vn30Var.b(str), new ds40(this, null)), new es40(this, null)), o8i0.d(this));
        kzh.d(this.d.a(str), o8i0.d(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (kotlin.Unit.a == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z1(java.lang.Throwable r7, defpackage.x1b r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.fs40
            if (r0 == 0) goto L13
            r0 = r8
            fs40 r0 = (defpackage.fs40) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fs40 r0 = new fs40
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r8)
            goto L63
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L31:
            defpackage.uj50.b(r8)
            goto L4d
        L35:
            defpackage.uj50.b(r8)
            v340 r8 = r6.N
            uwd0<T> r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            com.sportygames.newcms.b r8 = (com.sportygames.newcms.b) r8
            r0.c = r5
            wwd0 r8 = r6.D
            java.lang.Object r8 = defpackage.pn30.s(r6, r7, r8, r0)
            if (r8 != r1) goto L4d
            goto L62
        L4d:
            nn30 r8 = (defpackage.nn30) r8
            if (r8 != 0) goto L54
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L54:
            r0.c = r4
            wwd0 r6 = r6.G
            r6.getClass()
            r6.k(r3, r8)
            kotlin.Unit r6 = kotlin.Unit.a
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr40.z1(java.lang.Throwable, x1b):java.lang.Object");
    }
}
