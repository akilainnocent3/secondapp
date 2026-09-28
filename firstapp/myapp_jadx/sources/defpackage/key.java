package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLNFeatureMatchConfigVerificationUseCase$invoke$1", f = "ObserveLNFeatureMatchConfigVerificationUseCase.kt", l = {80}, m = "invokeSuspend", v = 2)
public final class key extends tje0 implements Function2<ez20<? super h8q>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o67 c;
    public final /* synthetic */ jey d;

    public static final class a<T> implements myh {
        public final /* synthetic */ ez20<h8q> a;
        public final /* synthetic */ tuw b;
        public final /* synthetic */ dq40<jey.a> c;
        public final /* synthetic */ jey d;

        /* JADX INFO: renamed from: key$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLNFeatureMatchConfigVerificationUseCase$invoke$1$1$1", f = "ObserveLNFeatureMatchConfigVerificationUseCase.kt", l = {86, 83}, m = "invokeSuspend", v = 2)
        public static final class C0763a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public ez20 a;
            public d8q b;
            public int c;
            public final /* synthetic */ ez20<h8q> d;
            public final /* synthetic */ d8q e;
            public final /* synthetic */ jey.a f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0763a(ez20<? super h8q> ez20Var, d8q d8qVar, jey.a aVar, v1b<? super C0763a> v1bVar) {
                super(2, v1bVar);
                this.d = ez20Var;
                this.e = d8qVar;
                this.f = aVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0763a(this.d, this.e, this.f, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0763a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
            
                if (r4.j(r6, r5) == r0) goto L16;
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
                    int r1 = r6.c
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L1f
                    if (r1 == r4) goto L17
                    if (r1 != r3) goto L11
                    defpackage.uj50.b(r7)
                    goto L4d
                L11:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r6)
                    return r2
                L17:
                    d8q r1 = r6.b
                    ez20 r4 = r6.a
                    defpackage.uj50.b(r7)
                    goto L39
                L1f:
                    defpackage.uj50.b(r7)
                    jey$a r7 = r6.f
                    cm8<e8q> r7 = r7.b
                    ez20<h8q> r1 = r6.d
                    r6.a = r1
                    d8q r5 = r6.e
                    r6.b = r5
                    r6.c = r4
                    java.lang.Object r7 = r7.await(r6)
                    if (r7 != r0) goto L37
                    goto L4c
                L37:
                    r4 = r1
                    r1 = r5
                L39:
                    e8q r7 = (defpackage.e8q) r7
                    h8q r5 = new h8q
                    r5.<init>(r1, r7)
                    r6.a = r2
                    r6.b = r2
                    r6.c = r3
                    java.lang.Object r6 = r4.j(r6, r5)
                    if (r6 != r0) goto L4d
                L4c:
                    return r0
                L4d:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: key.a.C0763a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLNFeatureMatchConfigVerificationUseCase$invoke$1$1", f = "ObserveLNFeatureMatchConfigVerificationUseCase.kt", l = {81}, m = "emit", v = 2)
        public static final class b extends x1b {
            public d8q a;
            public /* synthetic */ Object b;
            public final /* synthetic */ a<T> c;
            public int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, v1b<? super b> v1bVar) {
                super(v1bVar);
                this.c = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return this.c.emit(null, this);
            }
        }

        public a(ez20 ez20Var, tuw tuwVar, dq40 dq40Var, jey jeyVar) {
            this.a = ez20Var;
            this.b = tuwVar;
            this.c = dq40Var;
            this.d = jeyVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(d8q d8qVar, v1b<? super Unit> v1bVar) {
            b bVar;
            d8q d8qVar2;
            if (v1bVar instanceof b) {
                bVar = (b) v1bVar;
                int i = bVar.d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    bVar.d = i - Integer.MIN_VALUE;
                } else {
                    bVar = new b(this, v1bVar);
                }
            } else {
                bVar = new b(this, v1bVar);
            }
            b bVar2 = bVar;
            Object objK = bVar2.b;
            y5b y5bVar = y5b.a;
            int i2 = bVar2.d;
            if (i2 == 0) {
                uj50.b(objK);
                bVar2.a = d8qVar;
                bVar2.d = 1;
                objK = key.k(this.b, this.a, this.c, this.d, d8qVar, bVar2);
                if (objK == y5bVar) {
                    return y5bVar;
                }
                d8qVar2 = d8qVar;
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d8qVar2 = bVar2.a;
                uj50.b(objK);
            }
            ez20<h8q> ez20Var = this.a;
            ej5.c(ez20Var, null, null, new C0763a(ez20Var, d8qVar2, (jey.a) objK, null), 3);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public key(o67 o67Var, jey jeyVar, v1b v1bVar) {
        super(2, v1bVar);
        this.c = o67Var;
        this.d = jeyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Object, jey$a] */
    public static final Object k(tuw tuwVar, ez20 ez20Var, dq40 dq40Var, jey jeyVar, d8q d8qVar, x1b x1bVar) {
        ley leyVar;
        tuw tuwVar2;
        tuw tuwVar3;
        ez20 ez20Var2;
        dq40 dq40Var2;
        jey jeyVar2;
        d8q d8qVar2;
        Pair pair;
        if (x1bVar instanceof ley) {
            leyVar = (ley) x1bVar;
            int i = leyVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                leyVar.v = i - Integer.MIN_VALUE;
            } else {
                leyVar = new ley(x1bVar);
            }
        } else {
            leyVar = new ley(x1bVar);
        }
        Object obj = leyVar.i;
        y5b y5bVar = y5b.a;
        int i2 = leyVar.v;
        if (i2 == 0) {
            uj50.b(obj);
            leyVar.a = tuwVar;
            leyVar.b = ez20Var;
            leyVar.c = dq40Var;
            leyVar.d = jeyVar;
            leyVar.e = d8qVar;
            leyVar.f = tuwVar;
            leyVar.v = 1;
            if (tuwVar.d(leyVar) == y5bVar) {
                return y5bVar;
            }
            tuwVar2 = tuwVar;
            tuwVar3 = tuwVar2;
            ez20Var2 = ez20Var;
            dq40Var2 = dq40Var;
            jeyVar2 = jeyVar;
            d8qVar2 = d8qVar;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuw tuwVar4 = leyVar.f;
            d8qVar2 = leyVar.e;
            jey jeyVar3 = leyVar.d;
            dq40 dq40Var3 = leyVar.c;
            ez20Var2 = leyVar.b;
            tuw tuwVar5 = leyVar.a;
            uj50.b(obj);
            jeyVar2 = jeyVar3;
            dq40Var2 = dq40Var3;
            tuwVar3 = tuwVar4;
            tuwVar2 = tuwVar5;
        }
        try {
            jey.a aVar = (jey.a) dq40Var2.a;
            if (aVar != null) {
                if (d8qVar2 instanceof d8q.b) {
                    aVar.a = true;
                }
                pair = new Pair(aVar, Boolean.FALSE);
            } else {
                ?? aVar2 = new jey.a(d8qVar2 instanceof d8q.b);
                dq40Var2.a = aVar2;
                pair = new Pair(aVar2, Boolean.TRUE);
            }
            tuwVar3.f(null);
            jey.a aVar3 = (jey.a) pair.a;
            if (((Boolean) pair.b).booleanValue()) {
                ej5.c(ez20Var2, null, null, new mey(tuwVar2, aVar3, jeyVar2, dq40Var2, null), 3);
            }
            return aVar3;
        } catch (Throwable th) {
            tuwVar3.f(null);
            throw th;
        }
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        key keyVar = new key(this.c, this.d, v1bVar);
        keyVar.b = obj;
        return keyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super h8q> ez20Var, v1b<? super Unit> v1bVar) {
        return ((key) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ez20 ez20Var = (ez20) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a(ez20Var, uuw.a(), new dq40(), this.d);
            this.b = null;
            this.a = 1;
            if (this.c.collect(aVar, this) == y5bVar) {
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
