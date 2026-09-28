package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$5", f = "LNSearchViewModel.kt", l = {212}, m = "invokeSuspend", v = 2)
public final class ibr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xbr b;
    public final /* synthetic */ g6r c;

    @c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$5$1", f = "LNSearchViewModel.kt", l = {214, 215}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ g6r c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g6r g6rVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = g6rVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((a) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (r7.c.a.b(new defpackage.e6r(r0, java.lang.System.currentTimeMillis()), r7) == r1) goto L17;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.b
                java.lang.String r0 = (java.lang.String) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r7.a
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L1f
                if (r2 == r5) goto L1b
                if (r2 != r4) goto L15
                defpackage.uj50.b(r8)
                goto L4d
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r3
            L1b:
                defpackage.uj50.b(r8)
                goto L35
            L1f:
                defpackage.uj50.b(r8)
                boolean r8 = kotlin.text.StringsKt.U(r0)
                if (r8 != 0) goto L4d
                r7.b = r0
                r7.a = r5
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = defpackage.hkd.b(r5, r7)
                if (r8 != r1) goto L35
                goto L4c
            L35:
                r7.b = r3
                r7.a = r4
                e6r r8 = new e6r
                long r2 = java.lang.System.currentTimeMillis()
                r8.<init>(r0, r2)
                g6r r0 = r7.c
                w5r r0 = r0.a
                java.lang.Object r7 = r0.b(r8, r7)
                if (r7 != r1) goto L4d
            L4c:
                return r1
            L4d:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ibr.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibr(xbr xbrVar, g6r g6rVar, v1b<? super ibr> v1bVar) {
        super(2, v1bVar);
        this.b = xbrVar;
        this.c = g6rVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ibr(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ibr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            v340 v340Var = this.b.i;
            a aVar = new a(this.c, null);
            this.a = 1;
            if (kzh.b(v340Var, aVar, this) == y5bVar) {
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
