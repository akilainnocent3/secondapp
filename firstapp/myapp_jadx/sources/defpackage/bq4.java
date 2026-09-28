package defpackage;

import com.sportygames.newcms.CMSRes;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.presentation.BonusCupViewModel$observeBonusCupSounds$1", f = "BonusCupViewModel.kt", l = {175, 175}, m = "invokeSuspend", v = 1)
public final class bq4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qq4 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ qq4 a;

        public a(qq4 qq4Var) {
            this.a = qq4Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            CMSRes cMSRes;
            ep4 ep4Var = (ep4) obj;
            ep4Var.getClass();
            switch (ep4Var.ordinal()) {
                case 0:
                    cMSRes = ti4.w0.g0;
                    break;
                case 1:
                    cMSRes = ti4.w0.h0;
                    break;
                case 2:
                    cMSRes = ti4.w0.q0;
                    break;
                case 3:
                    cMSRes = ti4.w0.r0;
                    break;
                case 4:
                    cMSRes = ti4.w0.s0;
                    break;
                case 5:
                    cMSRes = ti4.w0.i0;
                    break;
                case 6:
                    cMSRes = ti4.w0.j0;
                    break;
                case 7:
                    cMSRes = ti4.w0.k0;
                    break;
                case 8:
                    cMSRes = ti4.w0.l0;
                    break;
                case 9:
                    cMSRes = ti4.w0.m0;
                    break;
                case 10:
                    cMSRes = ti4.w0.n0;
                    break;
                case 11:
                    cMSRes = ti4.w0.o0;
                    break;
                case 12:
                    cMSRes = ti4.w0.p0;
                    break;
                default:
                    uhc.a();
                    return null;
            }
            if (cMSRes != null) {
                this.a.z1(cMSRes);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq4(qq4 qq4Var, v1b<? super bq4> v1bVar) {
        super(2, v1bVar);
        this.b = qq4Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bq4(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((bq4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (((defpackage.a390) r7).collect(r1, r6) == r0) goto L15;
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
            r2 = 0
            qq4 r3 = r6.b
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L19
            if (r1 == r4) goto L15
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L15:
            defpackage.uj50.b(r7)
            goto L3b
        L19:
            defpackage.uj50.b(r7)
            goto L2b
        L1d:
            defpackage.uj50.b(r7)
            otm r7 = r3.z
            r6.a = r5
            b390 r7 = r7.invoke()
            if (r7 != r0) goto L2b
            goto L3a
        L2b:
            a390 r7 = (defpackage.a390) r7
            bq4$a r1 = new bq4$a
            r1.<init>(r3)
            r6.a = r4
            java.lang.Object r6 = r7.collect(r1, r6)
            if (r6 != r0) goto L3b
        L3a:
            return r0
        L3b:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
