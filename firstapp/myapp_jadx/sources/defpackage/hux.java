package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$bet$2", f = "NightNDayViewModel.kt", l = {417}, m = "invokeSuspend", v = 1)
public final class hux extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ gux b;
    public final /* synthetic */ fbx c;

    @c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$bet$2$1", f = "NightNDayViewModel.kt", l = {409, 413, 414}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<mk50<? extends a7x>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ gux c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gux guxVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = guxVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(mk50<? extends a7x> mk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(mk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        
            if (r4.y1(r9, r8) == r1) goto L25;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.b
                mk50 r0 = (defpackage.mk50) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r8.a
                r3 = 0
                gux r4 = r8.c
                r5 = 3
                r6 = 2
                r7 = 1
                if (r2 == 0) goto L29
                if (r2 == r7) goto L25
                if (r2 == r6) goto L21
                if (r2 == r5) goto L1c
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r3
            L1c:
                zrp r8 = defpackage.l80.a(r9)
                throw r8
            L21:
                defpackage.uj50.b(r9)
                goto L5a
            L25:
                defpackage.uj50.b(r9)
                goto L3a
            L29:
                defpackage.uj50.b(r9)
                wwd0 r9 = r4.D
                r8.b = r0
                r8.a = r7
                r9.setValue(r0)
                kotlin.Unit r9 = kotlin.Unit.a
                if (r9 != r1) goto L3a
                goto L59
            L3a:
                mk50$b r9 = mk50.b.a
                boolean r9 = kotlin.jvm.internal.Intrinsics.g(r0, r9)
                if (r9 != 0) goto L66
                boolean r9 = r0 instanceof mk50.c
                if (r9 == 0) goto L47
                goto L66
            L47:
                boolean r9 = r0 instanceof mk50.a
                if (r9 == 0) goto L62
                mk50$a r0 = (mk50.a) r0
                java.lang.Throwable r9 = r0.a
                r8.b = r3
                r8.a = r6
                java.lang.Object r9 = r4.y1(r9, r8)
                if (r9 != r1) goto L5a
            L59:
                return r1
            L5a:
                r8.b = r3
                r8.a = r5
                defpackage.hkd.a(r8)
                return r1
            L62:
                defpackage.uhc.a()
                return r3
            L66:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: hux.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hux(gux guxVar, fbx fbxVar, v1b<? super hux> v1bVar) {
        super(2, v1bVar);
        this.b = guxVar;
        this.c = fbxVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hux(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hux) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String giftId;
        gux guxVar = this.b;
        wwd0 wwd0Var = guxVar.J;
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s8x s8xVar = guxVar.c;
            double dDoubleValue = ((y6x) wwd0Var.getValue()).d().doubleValue();
            y6x y6xVar = (y6x) wwd0Var.getValue();
            if (y6xVar instanceof y6x.a) {
                giftId = null;
            } else {
                if (!(y6xVar instanceof y6x.b)) {
                    uhc.a();
                    return null;
                }
                giftId = ((y6x.b) y6xVar).a.getGiftId();
            }
            lyh<mk50<a7x>> lyhVarA = s8xVar.a(dDoubleValue, this.c, giftId);
            a aVar = new a(guxVar, null);
            this.a = 1;
            Object objCollect = lyhVarA.collect(new g1i.a(gyx.a, aVar), this);
            if (objCollect != obj2) {
                objCollect = Unit.a;
            }
            if (objCollect != obj2) {
                objCollect = Unit.a;
            }
            if (objCollect == obj2) {
                return obj2;
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
