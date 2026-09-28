package defpackage;

import com.sportybet.repository.limits.model.SaveLimitsRequest;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.edit.viewmodel.EditSportsLimitsViewModel$saveLimits$1", f = "EditSportsLimitsViewModel.kt", l = {129}, m = "invokeSuspend", v = 2)
public final class ysf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zsf b;

    public static final class a<T> implements myh {
        public final /* synthetic */ zsf a;

        /* JADX INFO: renamed from: ysf$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.limits.edit.viewmodel.EditSportsLimitsViewModel$saveLimits$1$1", f = "EditSportsLimitsViewModel.kt", l = {132, 137}, m = "emit", v = 2)
        public static final class C1362a extends x1b {
            public /* synthetic */ Object a;
            public final /* synthetic */ a<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1362a(a<? super T> aVar, v1b<? super C1362a> v1bVar) {
                super(v1bVar);
                this.b = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        public a(zsf zsfVar) {
            this.a = zsfVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L26;
         */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.lk50<com.sportybet.repository.limits.model.SaveLimitsResponse> r7, defpackage.v1b<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof ysf.a.C1362a
                if (r0 == 0) goto L13
                r0 = r8
                ysf$a$a r0 = (ysf.a.C1362a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                ysf$a$a r0 = new ysf$a$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r0.c
                r3 = 2
                r4 = 1
                r5 = 0
                zsf r6 = r6.a
                if (r2 == 0) goto L37
                if (r2 == r4) goto L33
                if (r2 != r3) goto L2d
                defpackage.uj50.b(r8)
                goto L74
            L2d:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L33:
                defpackage.uj50.b(r8)
                goto L4b
            L37:
                defpackage.uj50.b(r8)
                boolean r8 = r7 instanceof lk50.c
                if (r8 == 0) goto L56
                b390 r7 = r6.c
                ssf$a r8 = ssf.a.a
                r0.c = r4
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L4b
                goto L73
            L4b:
                wwd0 r6 = r6.H
                uxs r7 = defpackage.uxs.ENABLE
                r6.getClass()
                r6.k(r5, r7)
                goto L8d
            L56:
                boolean r8 = r7 instanceof lk50.a
                if (r8 == 0) goto L7f
                b390 r7 = r6.c
                o990 r8 = new o990
                com.sporty.android.common_ui.uitext.StringUiText r2 = defpackage.vch0.a
                com.sporty.android.common_ui.uitext.ResourceUiText r2 = new com.sporty.android.common_ui.uitext.ResourceUiText
                r4 = 2132018156(0x7f1403ec, float:1.967461E38)
                r2.<init>(r4)
                r8.<init>(r2)
                r0.c = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L74
            L73:
                return r1
            L74:
                wwd0 r6 = r6.H
                uxs r7 = defpackage.uxs.ENABLE
                r6.getClass()
                r6.k(r5, r7)
                goto L8d
            L7f:
                boolean r7 = r7 instanceof lk50.b
                if (r7 == 0) goto L90
                wwd0 r6 = r6.H
                uxs r7 = defpackage.uxs.LOADING
                r6.getClass()
                r6.k(r5, r7)
            L8d:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            L90:
                defpackage.uhc.a()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ysf.a.emit(lk50, v1b):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysf(zsf zsfVar, v1b<? super ysf> v1bVar) {
        super(2, v1bVar);
        this.b = zsfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ysf(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ysf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zsf zsfVar = this.b;
            ws60 ws60Var = zsfVar.v;
            scs scsVar = zsfVar.C;
            if (scsVar == null) {
                Intrinsics.n("limitType");
                throw null;
            }
            int i2 = scsVar.a;
            vfb0 vfb0Var = zsfVar.B;
            if (vfb0Var == null) {
                Intrinsics.n("gameType");
                throw null;
            }
            int i3 = vfb0Var.a;
            String str = zsfVar.L.a.b;
            String str2 = zsfVar.M.a.b;
            String str3 = zsfVar.N.a.b;
            ws60Var.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            BigDecimal bigDecimal = new BigDecimal(10000);
            if (str.length() == 0) {
                str = null;
            }
            if (str != null) {
                BigDecimal bigDecimalMultiply = new BigDecimal(Double.parseDouble(str)).multiply(bigDecimal);
                bigDecimalMultiply.getClass();
                numValueOf = Integer.valueOf(bigDecimalMultiply.intValue());
            } else {
                numValueOf = null;
            }
            if (str2.length() == 0) {
                str2 = null;
            }
            if (str2 != null) {
                BigDecimal bigDecimalMultiply2 = new BigDecimal(Double.parseDouble(str2)).multiply(bigDecimal);
                bigDecimalMultiply2.getClass();
                numValueOf2 = Integer.valueOf(bigDecimalMultiply2.intValue());
            } else {
                numValueOf2 = null;
            }
            if (str3.length() == 0) {
                str3 = null;
            }
            if (str3 != null) {
                BigDecimal bigDecimalMultiply3 = new BigDecimal(Double.parseDouble(str3)).multiply(bigDecimal);
                bigDecimalMultiply3.getClass();
                numValueOf3 = Integer.valueOf(bigDecimalMultiply3.intValue());
            } else {
                numValueOf3 = null;
            }
            yzh yzhVarB = bm50.b(ws60Var.a.q(new SaveLimitsRequest(i2, Integer.valueOf(i3), numValueOf, numValueOf2, numValueOf3)), vch0.b);
            vs60 vs60Var = new vs60(ws60Var, null);
            a aVar = new a(zsfVar);
            this.a = 1;
            Object objCollect = yzhVarB.collect(new g1i.a(aVar, vs60Var), this);
            if (objCollect != y5bVar) {
                objCollect = Unit.a;
            }
            if (objCollect == y5bVar) {
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
