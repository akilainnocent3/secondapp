package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.patron.KYCBannerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ts5<T> implements ss5<T> {
    public final Function1<v1b<? super T>, Object> a;
    public final tuw b = uuw.a();
    public final wwd0 c = xwd0.a(null);
    public final or60 d = new or60(new a(this, null));

    @c0d(c = "com.sportybet.feature.luckynumber.utils.apicache.CachedResourceImpl$dataFlow$1", f = "CachedResourceImpl.kt", l = {KYCBannerItem.STATUS_DEPRECATE}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super T>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ ts5<T> c;

        /* JADX INFO: renamed from: ts5$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.utils.apicache.CachedResourceImpl$dataFlow$1$1", f = "CachedResourceImpl.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class C1146a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ myh<T> c;
            public final /* synthetic */ ts5<T> d;

            /* JADX INFO: renamed from: ts5$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.luckynumber.utils.apicache.CachedResourceImpl$dataFlow$1$1$1", f = "CachedResourceImpl.kt", l = {28}, m = "invokeSuspend", v = 2)
            public static final class C1147a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public /* synthetic */ Object b;
                public final /* synthetic */ ts5<T> c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1147a(ts5<T> ts5Var, v1b<? super C1147a> v1bVar) {
                    super(2, v1bVar);
                    this.c = ts5Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C1147a c1147a = new C1147a(this.c, v1bVar);
                    c1147a.b = obj;
                    return c1147a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C1147a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    try {
                        if (i == 0) {
                            uj50.b(obj);
                            ts5<T> ts5Var = this.c;
                            zi50.a aVar = zi50.b;
                            km0.a aVar2 = km0.a.a;
                            this.b = null;
                            this.a = 1;
                            if (ts5Var.c(aVar2, this) == y5bVar) {
                                return y5bVar;
                            }
                        } else {
                            if (i != 1) {
                                ib5.a("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            uj50.b(obj);
                        }
                        zi50.a aVar3 = zi50.b;
                    } catch (Throwable unused) {
                        zi50.a aVar4 = zi50.b;
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1146a(myh<? super T> myhVar, ts5<T> ts5Var, v1b<? super C1146a> v1bVar) {
                super(2, v1bVar);
                this.c = myhVar;
                this.d = ts5Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1146a c1146a = new C1146a(this.c, this.d, v1bVar);
                c1146a.b = obj;
                return c1146a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1146a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) throws Throwable {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return Unit.a;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                ts5<T> ts5Var = this.d;
                ej5.c(v5bVar, null, null, new C1147a(ts5Var, null), 3);
                wwd0 wwd0Var = ts5Var.c;
                this.b = null;
                this.a = 1;
                myh<T> myhVar = this.c;
                h99.a(myhVar);
                wwd0Var.collect(new f1i.a(myhVar), this);
                return y5bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ts5<T> ts5Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = ts5Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
            return ((a) create((myh) obj, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = (myh) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C1146a c1146a = new C1146a(myhVar, this.c, null);
                this.b = null;
                this.a = 1;
                if (w5b.d(c1146a, this) == y5bVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public ts5(Function1<? super v1b<? super T>, ? extends Object> function1) {
        this.a = function1;
    }

    @Override // defpackage.ss5
    public final or60 a() {
        return new or60(new et5(this, null));
    }

    @Override // defpackage.ss5
    public final or60 b() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f2, code lost:
    
        if (f(r8, r13, r0) == r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f5, code lost:
    
        r11 = r13;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0127, code lost:
    
        if (f(r8, r13, r0) == r1) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, km0] */
    /* JADX WARN: Type inference failed for: r12v1, types: [quw] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.km0 r12, defpackage.x1b r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts5.c(km0, x1b):java.lang.Object");
    }

    public final b77 d(Object obj) {
        return r0i.f(new yzh(new ws5(a()), new xs5(3, null)), new vs5(null, this, obj));
    }

    public final or60 e() {
        return new or60(new ft5(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (defpackage.s0i.b(r6, r5, r0) == r8) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.wwd0 r6, java.lang.Object r7, defpackage.x1b r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.gt5
            if (r0 == 0) goto L13
            r0 = r8
            gt5 r0 = (defpackage.gt5) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gt5 r0 = new gt5
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.b
            y5b r8 = defpackage.y5b.a
            int r1 = r0.d
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L37
            if (r1 == r2) goto L31
            if (r1 != r3) goto L2b
            defpackage.uj50.b(r5)
            goto L56
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            return r4
        L31:
            wwd0 r6 = r0.a
            defpackage.uj50.b(r5)
            goto L46
        L37:
            defpackage.uj50.b(r5)
            r0.a = r6
            r0.d = r2
            r6.setValue(r7)
            kotlin.Unit r5 = kotlin.Unit.a
            if (r5 != r8) goto L46
            goto L55
        L46:
            ht5 r5 = new ht5
            r5.<init>(r3, r4)
            r0.a = r4
            r0.d = r3
            java.lang.Object r5 = defpackage.s0i.b(r6, r5, r0)
            if (r5 != r8) goto L56
        L55:
            return r8
        L56:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts5.f(wwd0, java.lang.Object, x1b):java.lang.Object");
    }

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
    public final void g(Function1<? super T, ? extends T> function1) {
        wwd0 wwd0Var;
        a030 a030Var;
        do {
            wwd0Var = this.c;
            a030Var = (Object) wwd0Var.getValue();
        } while (!wwd0Var.g(a030Var, function1.invoke(a030Var)));
    }
}
