package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyherov2.views.SportyHeroFragment$showRainActiveToastV2$3", f = "SportyHeroFragment.kt", l = {5463}, m = "invokeSuspend", v = 1)
public final class j3c0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ q1c0 b;

    @c0d(c = "com.sportygames.sportyherov2.views.SportyHeroFragment$showRainActiveToastV2$3$1", f = "SportyHeroFragment.kt", l = {5465, 5467}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ q1c0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1c0 q1c0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = q1c0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        
            if (defpackage.hkd.b(4000, r6) == r0) goto L18;
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
                q1c0 r2 = r6.b
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L12
                defpackage.uj50.b(r7)
                goto L44
            L12:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                r6 = 0
                return r6
            L19:
                defpackage.uj50.b(r7)
                goto L2b
            L1d:
                defpackage.uj50.b(r7)
                r6.a = r4
                r4 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r7 = defpackage.hkd.b(r4, r6)
                if (r7 != r0) goto L2b
                goto L43
            L2b:
                B extends g6i0 r7 = r2.b
                w3c0 r7 = (defpackage.w3c0) r7
                if (r7 == 0) goto L39
                cp80 r7 = r7.g0
                androidx.constraintlayout.widget.ConstraintLayout r7 = r7.a
                r1 = 0
                r7.setVisibility(r1)
            L39:
                r6.a = r3
                r3 = 4000(0xfa0, double:1.9763E-320)
                java.lang.Object r6 = defpackage.hkd.b(r3, r6)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                B extends g6i0 r6 = r2.b
                w3c0 r6 = (defpackage.w3c0) r6
                if (r6 == 0) goto L53
                cp80 r6 = r6.g0
                androidx.constraintlayout.widget.ConstraintLayout r6 = r6.a
                r7 = 8
                r6.setVisibility(r7)
            L53:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: j3c0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3c0(q1c0 q1c0Var, v1b<? super j3c0> v1bVar) {
        super(2, v1bVar);
        this.b = q1c0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j3c0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j3c0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            q1c0 q1c0Var = this.b;
            tb5 tb5Var = q1c0Var.H0;
            if (tb5Var != null) {
                nas nasVarA = ebs.a(q1c0Var.getLifecycle());
                pfd pfdVar = fse.a;
                jvd0 jvd0VarB = ej5.b(nasVarA, gku.a, a6b.b, new a(q1c0Var, null));
                this.a = 1;
                if (tb5Var.j(this, jvd0VarB) == y5bVar) {
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
        return Unit.a;
    }
}
