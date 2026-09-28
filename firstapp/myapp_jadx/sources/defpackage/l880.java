package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class l880 implements PointerInputEventHandler {
    public final /* synthetic */ g6w a;
    public final /* synthetic */ fff0 b;

    @c0d(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", l = {107, 113, 115}, m = "invokeSuspend")
    public static final class a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ g6w d;
        public final /* synthetic */ as7 e;
        public final /* synthetic */ fff0 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g6w g6wVar, as7 as7Var, fff0 fff0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = g6wVar;
            this.e = as7Var;
            this.f = fff0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.d, this.e, this.f, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
            return ((a) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
        
            if (defpackage.o880.c(r1, r9.d, r9.e, r10, r9) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
        
            if (defpackage.o880.d(r1, r9.f, r10, r9) == r0) goto L32;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r9.b
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L23
                if (r1 == r5) goto L1b
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                goto L17
            L11:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r9)
                return r2
            L17:
                defpackage.uj50.b(r10)
                goto L7f
            L1b:
                java.lang.Object r1 = r9.c
                vp1 r1 = (defpackage.vp1) r1
                defpackage.uj50.b(r10)
                goto L36
            L23:
                defpackage.uj50.b(r10)
                java.lang.Object r10 = r9.c
                r1 = r10
                vp1 r1 = (defpackage.vp1) r1
                r9.c = r1
                r9.b = r5
                java.lang.Object r10 = defpackage.o880.a(r1, r9)
                if (r10 != r0) goto L36
                goto L7e
            L36:
                b020 r10 = (defpackage.b020) r10
                boolean r5 = defpackage.o880.b(r10)
                if (r5 == 0) goto L6c
                int r5 = r10.d
                r5 = r5 & 33
                if (r5 == 0) goto L6c
                java.util.List<m020> r5 = r10.a
                int r6 = r5.size()
                r7 = 0
            L4b:
                if (r7 >= r6) goto L5d
                java.lang.Object r8 = r5.get(r7)
                m020 r8 = (defpackage.m020) r8
                boolean r8 = r8.b()
                if (r8 == 0) goto L5a
                goto L6c
            L5a:
                int r7 = r7 + 1
                goto L4b
            L5d:
                r9.c = r2
                r9.b = r4
                g6w r2 = r9.d
                as7 r3 = r9.e
                java.lang.Object r9 = defpackage.o880.c(r1, r2, r3, r10, r9)
                if (r9 != r0) goto L7f
                goto L7e
            L6c:
                boolean r4 = defpackage.o880.b(r10)
                if (r4 != 0) goto L7f
                r9.c = r2
                r9.b = r3
                fff0 r2 = r9.f
                java.lang.Object r9 = defpackage.o880.d(r1, r2, r10, r9)
                if (r9 != r0) goto L7f
            L7e:
                return r0
            L7f:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: l880.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public l880(g6w g6wVar, fff0 fff0Var) {
        this.a = g6wVar;
        this.b = fff0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        Object objB = dqi.b(u020Var, new a(this.a, new as7(u020Var.getViewConfiguration()), this.b, null), v1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }
}
