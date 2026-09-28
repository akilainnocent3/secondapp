package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class qpt implements PointerInputEventHandler {
    public final /* synthetic */ ytw<Boolean> a;

    @c0d(c = "com.sporty.android.compose.ui.loyal.LoyalButtonKt$LoyalButton$3$1$1", f = "LoyalButton.kt", l = {86, 90}, m = "invokeSuspend", v = 2)
    public static final class a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ ytw<Boolean> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ytw<Boolean> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.d, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
            return ((a) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        
            if (defpackage.u4f0.b(r0, r6, 3) == r1) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        
            if (r7 == r1) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        
            return r1;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003f -> B:17:0x0042). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                vp1 r0 = (defpackage.vp1) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                ytw<java.lang.Boolean> r3 = r6.d
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L21
                if (r2 == r5) goto L1d
                if (r2 != r4) goto L16
                defpackage.uj50.b(r7)
                goto L42
            L16:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                r6 = 0
                return r6
            L1d:
                defpackage.uj50.b(r7)
                goto L30
            L21:
                defpackage.uj50.b(r7)
                r6.c = r0
                r6.b = r5
                r7 = 3
                java.lang.Object r7 = defpackage.u4f0.b(r0, r6, r7)
                if (r7 != r1) goto L30
                goto L41
            L30:
                java.lang.Boolean r7 = java.lang.Boolean.TRUE
                r3.setValue(r7)
            L35:
                r6.c = r0
                r6.b = r4
                c020 r7 = defpackage.c020.b
                java.lang.Object r7 = r0.l1(r7, r6)
                if (r7 != r1) goto L42
            L41:
                return r1
            L42:
                b020 r7 = (defpackage.b020) r7
                java.util.List<m020> r7 = r7.a
                if (r7 == 0) goto L4f
                boolean r2 = r7.isEmpty()
                if (r2 == 0) goto L4f
                goto L64
            L4f:
                java.util.Iterator r7 = r7.iterator()
            L53:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L64
                java.lang.Object r2 = r7.next()
                m020 r2 = (defpackage.m020) r2
                boolean r2 = r2.d
                if (r2 == 0) goto L53
                goto L35
            L64:
                java.lang.Boolean r6 = java.lang.Boolean.FALSE
                r3.setValue(r6)
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: qpt.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public qpt(ytw<Boolean> ytwVar) {
        this.a = ytwVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        return dqi.b(u020Var, new a(this.a, null), v1bVar);
    }
}
