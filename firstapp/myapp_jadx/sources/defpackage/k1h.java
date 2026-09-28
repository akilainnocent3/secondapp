package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class k1h implements PointerInputEventHandler {
    public final /* synthetic */ j1h a;

    @c0d(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", l = {1426, 1430}, m = "invokeSuspend")
    public static final class a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ j1h d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j1h j1hVar, v1b v1bVar) {
            super(2, v1bVar);
            this.d = j1hVar;
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
        
            if (r6 == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.b
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                defpackage.uj50.b(r6)
                goto L43
            L11:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                return r2
            L17:
                java.lang.Object r1 = r5.c
                vp1 r1 = (defpackage.vp1) r1
                defpackage.uj50.b(r6)
                goto L34
            L1f:
                defpackage.uj50.b(r6)
                java.lang.Object r6 = r5.c
                r1 = r6
                vp1 r1 = (defpackage.vp1) r1
                c020 r6 = defpackage.c020.a
                r5.c = r1
                r5.b = r4
                java.lang.Object r6 = defpackage.u4f0.b(r1, r5, r4)
                if (r6 != r0) goto L34
                goto L42
            L34:
                m020 r6 = (defpackage.m020) r6
                c020 r6 = defpackage.c020.a
                r5.c = r2
                r5.b = r3
                java.lang.Object r6 = defpackage.u4f0.h(r1, r6, r5)
                if (r6 != r0) goto L43
            L42:
                return r0
            L43:
                m020 r6 = (defpackage.m020) r6
                if (r6 == 0) goto L4c
                j1h r5 = r5.d
                r5.invoke()
            L4c:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: k1h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public k1h(j1h j1hVar) {
        this.a = j1hVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        Object objB = dqi.b(u020Var, new a(this.a, null), v1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }
}
