package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.runtime.m;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zzr implements fr70 {
    public static final uv60 x = jis.a(new wzr(), new rm4(1));
    public final qdd a;
    public boolean b;
    public nzr c;
    public boolean d;
    public final tzr e;
    public final ytw<nzr> f;
    public final qsw g;
    public float h;
    public final sfd i;
    public final boolean j;
    public y250 k;
    public final c0s l;
    public final rp1 m;
    public final LazyLayoutItemAnimator<ozr> n;
    public final jwr o;
    public final gyr p;
    public final b0s q;
    public final fyr r;
    public final ytw<Unit> s;
    public final ytw t;
    public final ytw u;
    public final ytw<Unit> v;
    public final iyr w;

    @c0d(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", l = {560}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<tp70, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = i;
            this.e = i2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = zzr.this.new a(this.d, this.e, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(tp70 tp70Var, v1b<? super Unit> v1bVar) {
            return ((a) create(tp70Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                tp70 tp70Var = (tp70) this.b;
                zzr zzrVar = zzr.this;
                uzr uzrVar = new uzr(tp70Var, zzrVar);
                mmd mmdVar = ((nzr) ((x5a0) zzrVar.f).getValue()).i;
                this.a = 1;
                if (of9.a(uzrVar, this.d, this.e, 100, mmdVar, this) == y5bVar) {
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

    @c0d(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {443, 444}, m = "scroll")
    public static final class b extends x1b {
        public huw a;
        public tje0 b;
        public /* synthetic */ Object c;
        public int e;

        public b(v1b<? super b> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return zzr.this.b(null, null, this);
        }
    }

    @c0d(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<tp70, v1b<? super Unit>, Object> {
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, int i2, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = i;
            this.c = i2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zzr.this.new c(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(tp70 tp70Var, v1b<? super Unit> v1bVar) {
            return ((c) create(tp70Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            zzr.this.l(this.b, this.c);
            return Unit.a;
        }
    }

    public zzr(final int i, int i2, qdd qddVar) {
        this.a = qddVar;
        this.e = new tzr(i, i2);
        this.f = m.a(e0s.a, epx.a);
        this.g = new qsw();
        this.i = new sfd(new Function1() { // from class: xzr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                gyr.b bVar;
                gyr.b bVar2;
                gyr.b bVar3;
                gyr.b bVar4;
                nzr nzrVar;
                zzr zzrVar = this.a;
                b0s b0sVar = zzrVar.q;
                qdd qddVar2 = zzrVar.a;
                boolean z2 = zzrVar.j;
                float f = -((Float) obj).floatValue();
                if ((f >= 0.0f || zzrVar.e()) && (f <= 0.0f || zzrVar.d())) {
                    if (Math.abs(zzrVar.h) > 0.5f) {
                        zkn.c("entered drag with non-zero pending scroll");
                    }
                    zzrVar.d = true;
                    float f2 = zzrVar.h + f;
                    zzrVar.h = f2;
                    if (Math.abs(f2) > 0.5f) {
                        float f3 = zzrVar.h;
                        int iRound = Math.round(f3);
                        nzr nzrVarN = ((nzr) ((x5a0) zzrVar.f).getValue()).n(iRound, !zzrVar.b);
                        if (nzrVarN != null && (nzrVar = zzrVar.c) != null) {
                            nzr nzrVarN2 = nzrVar.n(iRound, true);
                            if (nzrVarN2 != null) {
                                zzrVar.c = nzrVarN2;
                            } else {
                                nzrVarN = null;
                            }
                        }
                        if (nzrVarN != null) {
                            zzrVar.g(nzrVarN, zzrVar.b, true);
                            zzrVar.v.setValue(Unit.a);
                            float f4 = f3 - zzrVar.h;
                            if (z2) {
                                qddVar2.getClass();
                                if (!nzrVarN.k().isEmpty()) {
                                    z = f4 < 0.0f;
                                    int iA = qdd.a(nzrVarN, z);
                                    if (iA >= 0 && iA < nzrVarN.i()) {
                                        if (iA != qddVar2.a) {
                                            if (qddVar2.c != z) {
                                                qddVar2.a = -1;
                                                gyr.b bVar5 = qddVar2.b;
                                                if (bVar5 != null) {
                                                    bVar5.cancel();
                                                }
                                                qddVar2.b = null;
                                            }
                                            qddVar2.c = z;
                                            qddVar2.a = iA;
                                            qddVar2.b = b0sVar.a(iA);
                                        }
                                        if (z) {
                                            zyr zyrVar = (zyr) CollectionsKt.b0(nzrVarN.k());
                                            if (((zyrVar.a() + zyrVar.getOffset()) + nzrVarN.j()) - nzrVarN.f() < (-f4) && (bVar4 = qddVar2.b) != null) {
                                                bVar4.c();
                                            }
                                        } else if (nzrVarN.h() - ((zyr) CollectionsKt.T(nzrVarN.k())).getOffset() < f4 && (bVar3 = qddVar2.b) != null) {
                                            bVar3.c();
                                        }
                                    }
                                }
                                qddVar2.e = f4;
                            }
                        } else {
                            y250 y250Var = zzrVar.k;
                            if (y250Var != null) {
                                y250Var.d();
                            }
                            float f5 = f3 - zzrVar.h;
                            kzr kzrVarJ = zzrVar.j();
                            if (z2) {
                                qddVar2.getClass();
                                if (!kzrVarJ.k().isEmpty()) {
                                    z = f5 < 0.0f;
                                    int iA2 = qdd.a(kzrVarJ, z);
                                    if (iA2 >= 0 && iA2 < kzrVarJ.i()) {
                                        if (iA2 != qddVar2.a) {
                                            if (qddVar2.c != z) {
                                                qddVar2.a = -1;
                                                gyr.b bVar6 = qddVar2.b;
                                                if (bVar6 != null) {
                                                    bVar6.cancel();
                                                }
                                                qddVar2.b = null;
                                            }
                                            qddVar2.c = z;
                                            qddVar2.a = iA2;
                                            qddVar2.b = b0sVar.a(iA2);
                                        }
                                        if (z) {
                                            zyr zyrVar2 = (zyr) CollectionsKt.b0(kzrVarJ.k());
                                            if (((zyrVar2.a() + zyrVar2.getOffset()) + kzrVarJ.j()) - kzrVarJ.f() < (-f5) && (bVar2 = qddVar2.b) != null) {
                                                bVar2.c();
                                            }
                                        } else if (kzrVarJ.h() - ((zyr) CollectionsKt.T(kzrVarJ.k())).getOffset() < f5 && (bVar = qddVar2.b) != null) {
                                            bVar.c();
                                        }
                                    }
                                }
                                qddVar2.e = f5;
                            }
                        }
                    }
                    if (Math.abs(zzrVar.h) > 0.5f) {
                        f -= zzrVar.h;
                        zzrVar.h = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(-f);
            }
        });
        this.j = true;
        this.l = new c0s(this);
        this.m = new rp1();
        this.n = new LazyLayoutItemAnimator<>();
        this.o = new jwr();
        this.p = new gyr(null, new Function1() { // from class: yzr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                dlx dlxVar = (dlx) obj;
                qdd qddVar2 = this.a.a;
                c5a0.e.getClass();
                c5a0 c5a0VarA = c5a0.a.a();
                c5a0.a.e(c5a0VarA, c5a0.a.b(c5a0VarA), c5a0VarA != null ? c5a0VarA.e() : null);
                qddVar2.getClass();
                int iB = dlxVar.b() == -1 ? 2 : dlxVar.b();
                for (int i3 = 0; i3 < iB; i3++) {
                    dlxVar.a(i + i3);
                }
                return Unit.a;
            }
        });
        this.q = new b0s(this);
        this.r = new fyr();
        this.s = aey.a();
        Boolean bool = Boolean.FALSE;
        this.t = m.b(bool);
        this.u = m.b(bool);
        this.v = aey.a();
        this.w = new iyr();
    }

    @Override // defpackage.fr70
    public final float a(float f) {
        return this.i.a(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r6.i.b(r7, r8, r0) == r1) goto L21;
     */
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
    @Override // defpackage.fr70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.huw r7, kotlin.jvm.functions.Function2<? super defpackage.tp70, ? super defpackage.v1b<? super kotlin.Unit>, ? extends java.lang.Object> r8, defpackage.v1b<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof zzr.b
            if (r0 == 0) goto L13
            r0 = r9
            zzr$b r0 = (zzr.b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            zzr$b r0 = new zzr$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r9)
            goto L60
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L31:
            tje0 r7 = r0.b
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            huw r7 = r0.a
            defpackage.uj50.b(r9)
            goto L51
        L3c:
            defpackage.uj50.b(r9)
            r0.a = r7
            r9 = r8
            tje0 r9 = (defpackage.tje0) r9
            r0.b = r9
            r0.e = r5
            rp1 r9 = r6.m
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L51
            goto L5f
        L51:
            r0.a = r3
            r0.b = r3
            r0.e = r4
            sfd r6 = r6.i
            java.lang.Object r6 = r6.b(r7, r8, r0)
            if (r6 != r1) goto L60
        L5f:
            return r1
        L60:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzr.b(huw, kotlin.jvm.functions.Function2, v1b):java.lang.Object");
    }

    @Override // defpackage.fr70
    public final boolean c() {
        return this.i.c();
    }

    @Override // defpackage.fr70
    public final boolean d() {
        return ((Boolean) ((x5a0) this.u).getValue()).booleanValue();
    }

    @Override // defpackage.fr70
    public final boolean e() {
        return ((Boolean) ((x5a0) this.t).getValue()).booleanValue();
    }

    public final Object f(int i, int i2, v1b<? super Unit> v1bVar) {
        Object objB = b(huw.a, new a(i, i2, null), v1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }

    public final void g(nzr nzrVar, boolean z, boolean z2) {
        List<ozr> list = nzrVar.k;
        int i = nzrVar.b;
        ozr ozrVar = nzrVar.a;
        this.p.f = list.size();
        iyr iyrVar = this.w;
        mj0 mj0Var = null;
        tzr tzrVar = this.e;
        if (!z && this.b) {
            this.c = nzrVar;
            c5a0.e.getClass();
            c5a0 c5a0VarA = c5a0.a.a();
            Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
            c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
            try {
                if (((Number) ((x5a0) iyrVar.b.b).getValue()).floatValue() != 0.0f && ozrVar != null && ozrVar.a == ((u5a0) tzrVar.a).D() && i == ((u5a0) tzrVar.b).D()) {
                    jvd0 jvd0Var = iyrVar.a;
                    if (jvd0Var != null) {
                        jvd0Var.cancel((CancellationException) null);
                    }
                    iyrVar.b = new aj0<>(gjs.b, Float.valueOf(0.0f), mj0Var, 60);
                }
                Unit unit = Unit.a;
                return;
            } finally {
                c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            }
        }
        if (z) {
            this.b = true;
        }
        ((x5a0) this.u).setValue(Boolean.valueOf(((ozrVar != null ? ozrVar.a : 0) == 0 && i == 0) ? false : true));
        ((x5a0) this.t).setValue(Boolean.valueOf(nzrVar.c));
        this.h -= nzrVar.d;
        ((x5a0) this.f).setValue(nzrVar);
        if (z2) {
            tzrVar.getClass();
            if (i < 0.0f) {
                zkn.c("scrollOffset should be non-negative");
            }
            ((u5a0) tzrVar.b).k(i);
        } else {
            ozr ozrVar2 = (ozr) CollectionsKt.firstOrNull(list);
            ozr ozrVar3 = (ozr) CollectionsKt.d0(list);
            rc0.a(ozrVar2 != null ? ozrVar2.a : -1L, "firstVisibleItem:index");
            rc0.a(ozrVar3 != null ? ozrVar3.a : -1L, "lastVisibleItem:index");
            tzrVar.getClass();
            tzrVar.d = ozrVar != null ? ozrVar.l : null;
            if (tzrVar.c || nzrVar.n > 0) {
                tzrVar.c = true;
                if (i < 0.0f) {
                    zkn.c("scrollOffset should be non-negative");
                }
                tzrVar.a(ozrVar != null ? ozrVar.a : 0, i);
            }
            if (this.j) {
                qdd qddVar = this.a;
                int i2 = qddVar.a;
                boolean z3 = qddVar.c;
                if (i2 != -1 && !nzrVar.k().isEmpty() && i2 != qdd.a(nzrVar, z3)) {
                    qddVar.a = -1;
                    gyr.b bVar = qddVar.b;
                    if (bVar != null) {
                        bVar.cancel();
                    }
                    qddVar.b = null;
                }
                int i3 = nzrVar.i();
                int i4 = qddVar.d;
                if (i4 != -1 && qddVar.e != 0.0f && i4 != i3 && !nzrVar.k().isEmpty()) {
                    int iA = qdd.a(nzrVar, qddVar.e < 0.0f);
                    if (iA >= 0 && iA < i3) {
                        qddVar.a = iA;
                        qddVar.b = this.q.a(iA);
                    }
                }
                qddVar.d = i3;
            }
        }
        if (z) {
            iyrVar.a(nzrVar.f, nzrVar.i, nzrVar.h);
        }
    }

    public final int h() {
        return ((u5a0) this.e.a).D();
    }

    public final int i() {
        return ((u5a0) this.e.b).D();
    }

    public final kzr j() {
        return (kzr) ((x5a0) this.f).getValue();
    }

    public final Object k(int i, int i2, v1b<? super Unit> v1bVar) {
        Object objB = b(huw.a, new c(i, i2, null), v1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }

    public final void l(int i, int i2) {
        tzr tzrVar = this.e;
        if (((u5a0) tzrVar.a).D() != i || ((u5a0) tzrVar.b).D() != i2) {
            LazyLayoutItemAnimator<ozr> lazyLayoutItemAnimator = this.n;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.b = null;
            lazyLayoutItemAnimator.c = -1;
        }
        tzrVar.a(i, i2);
        tzrVar.d = null;
        y250 y250Var = this.k;
        if (y250Var != null) {
            y250Var.d();
        }
    }

    public zzr(int i, int i2) {
        qdd qddVar = new qdd();
        qddVar.a = -1;
        qddVar.d = -1;
        this(i, i2, qddVar);
    }

    public zzr() {
        qdd qddVar = new qdd();
        qddVar.a = -1;
        qddVar.d = -1;
        this(0, 0, qddVar);
    }
}
