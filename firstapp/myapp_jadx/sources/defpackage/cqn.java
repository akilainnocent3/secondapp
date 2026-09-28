package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.antest.InstantFootballKickOffVisibilityAnTestHelper$init$1$1", f = "InstantFootballKickOffVisibilityAnTestHelper.kt", l = {73, 75, 96}, m = "invokeSuspend", v = 2)
public final class cqn extends tje0 implements Function2<myh<? super gqn>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ eqn c;

    @c0d(c = "com.sportybet.android.instantwin.antest.InstantFootballKickOffVisibilityAnTestHelper$init$1$1$state$1", f = "InstantFootballKickOffVisibilityAnTestHelper.kt", l = {93}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super gqn>, Object> {
        public int a;
        public final /* synthetic */ eqn b;

        /* JADX INFO: renamed from: cqn$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.antest.InstantFootballKickOffVisibilityAnTestHelper$init$1$1$state$1$2", f = "InstantFootballKickOffVisibilityAnTestHelper.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0452a extends tje0 implements Function2<gqn, v1b<? super Boolean>, Object> {
            public /* synthetic */ Object a;

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0452a c0452a = new C0452a(2, v1bVar);
                c0452a.a = obj;
                return c0452a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(gqn gqnVar, v1b<? super Boolean> v1bVar) {
                return ((C0452a) create(gqnVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                gqn gqnVar = (gqn) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Boolean.valueOf(!(gqnVar instanceof gqn.b));
            }
        }

        public static final class b implements lyh<gqn> {
            public final /* synthetic */ lyh a;
            public final /* synthetic */ eqn b;

            /* JADX INFO: renamed from: cqn$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.instantwin.antest.InstantFootballKickOffVisibilityAnTestHelper$init$1$1$state$1$invokeSuspend$$inlined$map$1", f = "InstantFootballKickOffVisibilityAnTestHelper.kt", l = {109}, m = "collect", v = 2)
            public static final class C0453a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0453a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.collect(null, this);
                }
            }

            /* JADX INFO: renamed from: cqn$a$b$b, reason: collision with other inner class name */
            public static final class C0454b<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: cqn$a$b$b$a, reason: collision with other inner class name */
                @c0d(c = "com.sportybet.android.instantwin.antest.InstantFootballKickOffVisibilityAnTestHelper$init$1$1$state$1$invokeSuspend$$inlined$map$1$2", f = "InstantFootballKickOffVisibilityAnTestHelper.kt", l = {50}, m = "emit", v = 2)
                public static final class C0455a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0455a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0454b.this.emit(null, this);
                    }
                }

                public C0454b(myh myhVar, eqn eqnVar) {
                    this.a = myhVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
                    C0455a c0455a;
                    gqn aVar;
                    aqn aqnVar;
                    if (v1bVar instanceof C0455a) {
                        c0455a = (C0455a) v1bVar;
                        int i = c0455a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0455a.b = i - Integer.MIN_VALUE;
                        } else {
                            c0455a = new C0455a(v1bVar);
                        }
                    } else {
                        c0455a = new C0455a(v1bVar);
                    }
                    Object obj2 = c0455a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c0455a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        lk50 lk50Var = (lk50) obj;
                        if (lk50Var instanceof lk50.c) {
                            int iOrdinal = ((ftm) ((lk50.c) lk50Var).a).ordinal();
                            if (iOrdinal == 0) {
                                aqnVar = aqn.a;
                            } else if (iOrdinal == 1) {
                                aqnVar = aqn.b;
                            } else {
                                if (iOrdinal != 2) {
                                    uhc.a();
                                    return null;
                                }
                                aqnVar = aqn.c;
                            }
                            aVar = new gqn.a(aqnVar);
                        } else if (lk50Var instanceof lk50.a) {
                            aVar = gqn.c.a;
                        } else {
                            if (!(lk50Var instanceof lk50.b)) {
                                uhc.a();
                                return null;
                            }
                            aVar = gqn.b.a;
                        }
                        c0455a.b = 1;
                        if (this.a.emit(aVar, c0455a) == y5bVar) {
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

            public b(lyh lyhVar, eqn eqnVar) {
                this.a = lyhVar;
                this.b = eqnVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.lyh
            public final Object collect(myh<? super gqn> myhVar, v1b v1bVar) {
                C0453a c0453a;
                if (v1bVar instanceof C0453a) {
                    c0453a = (C0453a) v1bVar;
                    int i = c0453a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0453a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0453a = new C0453a(v1bVar);
                    }
                } else {
                    c0453a = new C0453a(v1bVar);
                }
                Object obj = c0453a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0453a.b;
                if (i2 == 0) {
                    uj50.b(obj);
                    C0454b c0454b = new C0454b(myhVar, this.b);
                    c0453a.b = 1;
                    if (this.a.collect(c0454b, c0453a) == y5bVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, eqn eqnVar) {
            super(2, v1bVar);
            this.b = eqnVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super gqn> v1bVar) {
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
            eqn eqnVar = this.b;
            b bVar = new b(eqnVar.a.j(z76.m), eqnVar);
            C0452a c0452a = new C0452a(2, null);
            this.a = 1;
            Object objB = s0i.b(bVar, c0452a, this);
            return objB == y5bVar ? y5bVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqn(v1b v1bVar, eqn eqnVar) {
        super(2, v1bVar);
        this.c = eqnVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cqn cqnVar = new cqn(v1bVar, this.c);
        cqnVar.b = obj;
        return cqnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super gqn> myhVar, v1b<? super Unit> v1bVar) {
        return ((cqn) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L23;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r9.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L26
            if (r2 == r5) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L18
            defpackage.uj50.b(r10)
            goto L62
        L18:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r6
        L1e:
            defpackage.uj50.b(r10)
            goto L51
        L22:
            defpackage.uj50.b(r10)
            goto L36
        L26:
            defpackage.uj50.b(r10)
            gqn$b r10 = gqn.b.a
            r9.b = r0
            r9.a = r5
            java.lang.Object r10 = r0.emit(r10, r9)
            if (r10 != r1) goto L36
            goto L61
        L36:
            kotlin.time.b$a r10 = kotlin.time.b.b
            r10 = 5
            rgf r2 = defpackage.rgf.SECONDS
            long r7 = kotlin.time.c.h(r10, r2)
            cqn$a r10 = new cqn$a
            eqn r2 = r9.c
            r10.<init>(r6, r2)
            r9.b = r0
            r9.a = r4
            java.lang.Object r10 = defpackage.vxf0.d(r7, r10, r9)
            if (r10 != r1) goto L51
            goto L61
        L51:
            gqn r10 = (defpackage.gqn) r10
            if (r10 != 0) goto L57
            gqn$c r10 = gqn.c.a
        L57:
            r9.b = r6
            r9.a = r3
            java.lang.Object r9 = r0.emit(r10, r9)
            if (r9 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
