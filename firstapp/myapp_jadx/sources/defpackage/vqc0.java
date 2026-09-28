package defpackage;

import com.sportybet.android.instantwin.newtork.model.request.SportyLegendsPrepareRoundRequest;
import com.sportybet.android.instantwin.presentation.legends.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.SportyLegendsViewModel$showMatchupAnimation$2", f = "SportyLegendsViewModel.kt", l = {1339, 1340}, m = "invokeSuspend", v = 2)
public final class vqc0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public pjd a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d d;
    public final /* synthetic */ xnc0 e;

    @c0d(c = "com.sportybet.android.instantwin.presentation.legends.SportyLegendsViewModel$showMatchupAnimation$2$prepareRoundDeferred$1", f = "SportyLegendsViewModel.kt", l = {1330}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super zi50<? extends hcc0>>, Object> {
        public int a;
        public final /* synthetic */ d b;
        public final /* synthetic */ xnc0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, xnc0 xnc0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = dVar;
            this.c = xnc0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends hcc0>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objI;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                mgc0 mgc0Var = this.b.b;
                xnc0 xnc0Var = this.c;
                enc0 enc0Var = xnc0Var.b;
                String str = enc0Var != null ? enc0Var.a : null;
                String str2 = enc0Var != null ? enc0Var.c : null;
                enc0 enc0Var2 = xnc0Var.c;
                SportyLegendsPrepareRoundRequest sportyLegendsPrepareRoundRequest = new SportyLegendsPrepareRoundRequest(str, str2, enc0Var2 != null ? enc0Var2.a : null, enc0Var2 != null ? enc0Var2.c : null);
                this.a = 1;
                objI = mgc0Var.i(sportyLegendsPrepareRoundRequest, this);
                if (objI == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objI = ((zi50) obj).a;
            }
            return new zi50(objI);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqc0(d dVar, xnc0 xnc0Var, v1b<? super vqc0> v1bVar) {
        super(2, v1bVar);
        this.d = dVar;
        this.e = xnc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vqc0 vqc0Var = new vqc0(this.d, this.e, v1bVar);
        vqc0Var.c = obj;
        return vqc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vqc0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r12 == r4) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            com.sportybet.android.instantwin.presentation.legends.d r0 = r11.d
            wwd0 r1 = r0.d0
            wwd0 r2 = r0.c0
            java.lang.Object r3 = r11.c
            v5b r3 = (defpackage.v5b) r3
            y5b r4 = defpackage.y5b.a
            int r5 = r11.b
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L27
            if (r5 == r7) goto L21
            if (r5 != r6) goto L1b
            defpackage.uj50.b(r12)
            goto L53
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r8
        L21:
            pjd r5 = r11.a
            defpackage.uj50.b(r12)
            goto L46
        L27:
            defpackage.uj50.b(r12)
            pfd r12 = r0.Q
            vqc0$a r5 = new vqc0$a
            xnc0 r9 = r11.e
            r5.<init>(r0, r9, r8)
            pjd r5 = defpackage.ej5.a(r3, r12, r5, r6)
            r11.c = r3
            r11.a = r5
            r11.b = r7
            r9 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r12 = defpackage.hkd.b(r9, r11)
            if (r12 != r4) goto L46
            goto L52
        L46:
            r11.c = r3
            r11.a = r8
            r11.b = r6
            java.lang.Object r12 = r5.await(r11)
            if (r12 != r4) goto L53
        L52:
            return r4
        L53:
            zi50 r12 = (defpackage.zi50) r12
            java.lang.Object r11 = r12.a
            boolean r12 = r11 instanceof zi50.b
            if (r12 != 0) goto L9e
            r12 = r11
            hcc0 r12 = (defpackage.hcc0) r12
            if (r12 != 0) goto L6c
            r2.setValue(r8)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r1.getClass()
            r1.k(r8, r12)
            goto L9e
        L6c:
            r2.setValue(r8)
            akc0 r0 = r0.H
            wwd0 r0 = r0.f
            java.lang.Object r3 = r0.getValue()
            boolean r4 = r3 instanceof bkc0.c
            if (r4 == 0) goto L7e
            bkc0$c r3 = (bkc0.c) r3
            goto L7f
        L7e:
            r3 = r8
        L7f:
            if (r3 != 0) goto L82
            goto L9e
        L82:
            java.lang.Object r4 = r0.getValue()
            r5 = r4
            bkc0 r5 = (defpackage.bkc0) r5
            bkc0$c r5 = new bkc0$c
            pjc0 r6 = r3.a
            r7 = 27
            pjc0 r6 = defpackage.pjc0.a(r6, r12, r8, r7)
            uhc0 r7 = defpackage.uhc0.b
            r5.<init>(r6, r7)
            boolean r4 = r0.g(r4, r5)
            if (r4 == 0) goto L82
        L9e:
            java.lang.Throwable r11 = defpackage.zi50.a(r11)
            if (r11 == 0) goto Laf
            r2.setValue(r8)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r1.getClass()
            r1.k(r8, r11)
        Laf:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
