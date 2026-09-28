package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$subscribeMatchmakingEvents$1", f = "PiggyBashViewModel.kt", l = {438, 442}, m = "invokeSuspend", v = 1)
public final class qy00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vx00 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ vx00 a;

        public a(vx00 vx00Var) {
            this.a = vx00Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            yav yavVarA;
            jav javVar = (jav) obj;
            boolean z = javVar instanceof jav.b;
            vx00 vx00Var = this.a;
            if (z) {
                wwd0 wwd0Var = vx00Var.J;
                yav yavVar = (yav) wwd0Var.getValue();
                jav.b bVar = (jav.b) javVar;
                yavVar.getClass();
                if (bVar instanceof jav.b.C0714b) {
                    jav.b.C0714b c0714b = (jav.b.C0714b) bVar;
                    yavVarA = yav.a(yavVar, null, 0.0d, 0, 0, c0714b.a, c0714b.b, null, 79);
                } else if (bVar instanceof jav.b.a) {
                    jav.b.a aVar = (jav.b.a) bVar;
                    yavVarA = yav.a(yavVar, aVar.d, aVar.c, aVar.a, aVar.b, 0, 0, null, 112);
                } else {
                    if (!(bVar instanceof jav.b.c)) {
                        uhc.a();
                        return null;
                    }
                    jav.b.c cVar = (jav.b.c) bVar;
                    yavVarA = yav.a(yavVar, null, 0.0d, 0, 0, 0, 0, new wph0(cVar.a, cVar.b, cVar.c), 63);
                }
                wwd0Var.k(null, yavVarA);
                Unit unit = Unit.a;
                y5b y5bVar = y5b.a;
                return unit;
            }
            jav.a aVar2 = javVar instanceof jav.a ? (jav.a) javVar : null;
            if (aVar2 instanceof jav.a.C0713a) {
                Object objF1 = vx00Var.F1(v1bVar);
                return objF1 == y5b.a ? objF1 : Unit.a;
            }
            if (aVar2 instanceof jav.a.b) {
                jav.a.b bVar2 = javVar instanceof jav.a.b ? (jav.a.b) javVar : null;
                if (bVar2 != null) {
                    vx00Var.z.b();
                    wwd0 wwd0Var2 = vx00Var.O;
                    nu00.i iVar = new nu00.i(bVar2.a, bVar2.b);
                    wwd0Var2.getClass();
                    wwd0Var2.k(null, iVar);
                    Unit unit2 = Unit.a;
                    if (unit2 == y5b.a) {
                        return unit2;
                    }
                }
            } else if (aVar2 != null) {
                uhc.a();
                return null;
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy00(vx00 vx00Var, v1b<? super qy00> v1bVar) {
        super(2, v1bVar);
        this.b = vx00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qy00(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qy00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r7.f(r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r7.collect(r1, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        return r0;
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
            r2 = 2
            r3 = 1
            vx00 r4 = r6.b
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            defpackage.uj50.b(r7)
            goto L5b
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L19:
            defpackage.uj50.b(r7)     // Catch: java.lang.Exception -> L1d
            goto L47
        L1d:
            r7 = move-exception
            goto L2d
        L1f:
            defpackage.uj50.b(r7)
            sum r7 = r4.y     // Catch: java.lang.Exception -> L1d
            r6.a = r3     // Catch: java.lang.Exception -> L1d
            java.lang.Object r7 = r7.f(r6)     // Catch: java.lang.Exception -> L1d
            if (r7 != r0) goto L47
            goto L5a
        L2d:
            itf0$a r1 = defpackage.itf0.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Error connecting to matchmaking: "
            r3.<init>(r5)
            java.lang.String r7 = r7.getLocalizedMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1.a(r7, r3)
        L47:
            sum r7 = r4.y
            zav$d r7 = r7.e()
            qy00$a r1 = new qy00$a
            r1.<init>(r4)
            r6.a = r2
            java.lang.Object r6 = r7.collect(r1, r6)
            if (r6 != r0) goto L5b
        L5a:
            return r0
        L5b:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
