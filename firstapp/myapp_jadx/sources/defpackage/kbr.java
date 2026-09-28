package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$7", f = "LNSearchViewModel.kt", l = {232}, m = "invokeSuspend", v = 2)
public final class kbr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xbr b;

    @c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$7$1", f = "LNSearchViewModel.kt", l = {233, 234}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<pz70, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ xbr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xbr xbrVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = xbrVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(pz70 pz70Var, v1b<? super Unit> v1bVar) {
            return ((a) create(pz70Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            if (r0.a.emit(r6, r5) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                xbr r0 = r5.b
                ku90<j9r> r0 = r0.D
                y5b r1 = defpackage.y5b.a
                int r2 = r5.a
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L14
                defpackage.uj50.b(r6)
                goto L3c
            L14:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L1b:
                defpackage.uj50.b(r6)
                goto L2f
            L1f:
                defpackage.uj50.b(r6)
                j9r$c r6 = j9r.c.a
                r5.a = r4
                b390 r2 = r0.a
                java.lang.Object r6 = r2.emit(r6, r5)
                if (r6 != r1) goto L2f
                goto L3b
            L2f:
                j9r$a r6 = j9r.a.a
                r5.a = r3
                b390 r0 = r0.a
                java.lang.Object r5 = r0.emit(r6, r5)
                if (r5 != r1) goto L3c
            L3b:
                return r1
            L3c:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kbr.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbr(xbr xbrVar, v1b<? super kbr> v1bVar) {
        super(2, v1bVar);
        this.b = xbrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kbr(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kbr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            xbr xbrVar = this.b;
            wwd0 wwd0Var = xbrVar.v;
            a aVar = new a(xbrVar, null);
            this.a = 1;
            if (kzh.b(wwd0Var, aVar, this) == y5bVar) {
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
