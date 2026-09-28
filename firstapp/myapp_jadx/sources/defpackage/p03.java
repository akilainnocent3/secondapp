package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class p03 implements PointerInputEventHandler {
    public final /* synthetic */ ytw<Boolean> a;

    @c0d(c = "com.sportygames.component.chip.betslider.BetSliderKt$BubbleSlider$1$1$1$1", f = "BetSlider.kt", l = {271, 273}, m = "invokeSuspend", v = 1)
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

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (defpackage.u4f0.h(r0, defpackage.c020.b, r7) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.c
                vp1 r0 = (defpackage.vp1) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r7.b
                ytw<java.lang.Boolean> r3 = r7.d
                r4 = 2
                r5 = 0
                r6 = 1
                if (r2 == 0) goto L21
                if (r2 == r6) goto L1d
                if (r2 != r4) goto L17
                defpackage.uj50.b(r8)
                goto L43
            L17:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r5
            L1d:
                defpackage.uj50.b(r8)
                goto L2f
            L21:
                defpackage.uj50.b(r8)
                r7.c = r0
                r7.b = r6
                java.lang.Object r8 = defpackage.u4f0.b(r0, r7, r4)
                if (r8 != r1) goto L2f
                goto L42
            L2f:
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                r3.setValue(r8)
                r7.c = r5
                r7.b = r4
                u4f0$a r8 = defpackage.u4f0.a
                c020 r8 = defpackage.c020.b
                java.lang.Object r7 = defpackage.u4f0.h(r0, r8, r7)
                if (r7 != r1) goto L43
            L42:
                return r1
            L43:
                java.lang.Boolean r7 = java.lang.Boolean.FALSE
                r3.setValue(r7)
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p03.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public p03(ytw<Boolean> ytwVar) {
        this.a = ytwVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        Object objB = dqi.b(u020Var, new a(this.a, null), v1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }
}
