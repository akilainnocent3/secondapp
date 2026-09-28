package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.antest.VirtualLobbyRenamingAnTestHelper$resolveVariant$1", f = "VirtualLobbyRenamingAnTestHelper.kt", l = {132, 140}, m = "invokeSuspend", v = 2)
public final class pki0 extends tje0 implements Function2<myh<? super rki0>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jki0 c;
    public final /* synthetic */ x66<rki0> d;

    @c0d(c = "com.sportybet.android.instantwin.antest.VirtualLobbyRenamingAnTestHelper$resolveVariant$1$variantResult$1", f = "VirtualLobbyRenamingAnTestHelper.kt", l = {133}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super lk50<? extends rki0>>, Object> {
        public int a;
        public final /* synthetic */ jki0 b;
        public final /* synthetic */ x66<rki0> c;

        /* JADX INFO: renamed from: pki0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.antest.VirtualLobbyRenamingAnTestHelper$resolveVariant$1$variantResult$1$1", f = "VirtualLobbyRenamingAnTestHelper.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0974a extends tje0 implements Function2<lk50<? extends rki0>, v1b<? super Boolean>, Object> {
            public /* synthetic */ Object a;

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0974a c0974a = new C0974a(2, v1bVar);
                c0974a.a = obj;
                return c0974a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(lk50<? extends rki0> lk50Var, v1b<? super Boolean> v1bVar) {
                return ((C0974a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                lk50 lk50Var = (lk50) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Boolean.valueOf(!(lk50Var instanceof lk50.b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jki0 jki0Var, x66<rki0> x66Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = jki0Var;
            this.c = x66Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends rki0>> v1bVar) {
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
            yzh yzhVarJ = this.b.a.j(this.c);
            C0974a c0974a = new C0974a(2, null);
            this.a = 1;
            Object objB = s0i.b(yzhVarJ, c0974a, this);
            return objB == y5bVar ? y5bVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pki0(jki0 jki0Var, x66<rki0> x66Var, v1b<? super pki0> v1bVar) {
        super(2, v1bVar);
        this.c = jki0Var;
        this.d = x66Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pki0 pki0Var = new pki0(this.c, this.d, v1bVar);
        pki0Var.b = obj;
        return pki0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super rki0> myhVar, v1b<? super Unit> v1bVar) {
        return ((pki0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r10)
            goto L5f
        L15:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r5
        L1b:
            defpackage.uj50.b(r10)
            goto L3f
        L1f:
            defpackage.uj50.b(r10)
            kotlin.time.b$a r10 = kotlin.time.b.b
            r10 = 5
            rgf r2 = defpackage.rgf.SECONDS
            long r6 = kotlin.time.c.h(r10, r2)
            pki0$a r10 = new pki0$a
            jki0 r2 = r9.c
            x66<rki0> r8 = r9.d
            r10.<init>(r2, r8, r5)
            r9.b = r0
            r9.a = r4
            java.lang.Object r10 = defpackage.vxf0.d(r6, r10, r9)
            if (r10 != r1) goto L3f
            goto L5e
        L3f:
            lk50 r10 = (defpackage.lk50) r10
            boolean r2 = r10 instanceof lk50.c
            if (r2 == 0) goto L48
            lk50$c r10 = (lk50.c) r10
            goto L49
        L48:
            r10 = r5
        L49:
            if (r10 == 0) goto L52
            T r10 = r10.a
            rki0 r10 = (defpackage.rki0) r10
            if (r10 == 0) goto L52
            goto L54
        L52:
            rki0 r10 = defpackage.rki0.SPORTY
        L54:
            r9.b = r5
            r9.a = r3
            java.lang.Object r9 = r0.emit(r10, r9)
            if (r9 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pki0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
