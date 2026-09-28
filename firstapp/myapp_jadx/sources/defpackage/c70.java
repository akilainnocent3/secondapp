package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class c70 implements PointerInputEventHandler {
    public final /* synthetic */ d70 a;

    @c0d(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {783, 787}, m = "invokeSuspend")
    public static final class a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ d70 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d70 d70Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = d70Var;
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

        /* JADX WARN: Code duplicated, block: B:25:0x007b  */
        /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:1: B:24:0x0079->B:28:0x008d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:43:0x0091 A[EDGE_INSN: B:43:0x0091->B:30:0x0091 BREAK  A[LOOP:1: B:24:0x0079->B:28:0x008d], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:17:0x004f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r12.b
                r2 = 2
                r3 = 0
                d70 r4 = r12.d
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L1d
                if (r1 != r2) goto L17
                java.lang.Object r1 = r12.c
                vp1 r1 = (defpackage.vp1) r1
                defpackage.uj50.b(r13)
                goto L4f
            L17:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                return r3
            L1d:
                java.lang.Object r1 = r12.c
                vp1 r1 = (defpackage.vp1) r1
                defpackage.uj50.b(r13)
                goto L38
            L25:
                defpackage.uj50.b(r13)
                java.lang.Object r13 = r12.c
                r1 = r13
                vp1 r1 = (defpackage.vp1) r1
                r12.c = r1
                r12.b = r5
                java.lang.Object r13 = defpackage.u4f0.b(r1, r12, r2)
                if (r13 != r0) goto L38
                goto L4e
            L38:
                m020 r13 = (defpackage.m020) r13
                long r5 = r13.a
                r4.h = r5
                long r5 = r13.c
                r4.b = r5
            L42:
                r12.c = r1
                r12.b = r2
                c020 r13 = defpackage.c020.b
                java.lang.Object r13 = r1.l1(r13, r12)
                if (r13 != r0) goto L4f
            L4e:
                return r0
            L4f:
                b020 r13 = (defpackage.b020) r13
                java.util.List<m020> r13 = r13.a
                java.util.ArrayList r5 = new java.util.ArrayList
                int r6 = r13.size()
                r5.<init>(r6)
                int r6 = r13.size()
                r7 = 0
                r8 = r7
            L62:
                if (r8 >= r6) goto L75
                java.lang.Object r9 = r13.get(r8)
                r10 = r9
                m020 r10 = (defpackage.m020) r10
                boolean r10 = r10.d
                if (r10 == 0) goto L72
                r5.add(r9)
            L72:
                int r8 = r8 + 1
                goto L62
            L75:
                int r13 = r5.size()
            L79:
                if (r7 >= r13) goto L90
                java.lang.Object r6 = r5.get(r7)
                r8 = r6
                m020 r8 = (defpackage.m020) r8
                long r8 = r8.a
                long r10 = r4.h
                boolean r8 = defpackage.k020.a(r8, r10)
                if (r8 == 0) goto L8d
                goto L91
            L8d:
                int r7 = r7 + 1
                goto L79
            L90:
                r6 = r3
            L91:
                m020 r6 = (defpackage.m020) r6
                if (r6 != 0) goto L9c
                java.lang.Object r13 = kotlin.collections.CollectionsKt.firstOrNull(r5)
                r6 = r13
                m020 r6 = (defpackage.m020) r6
            L9c:
                if (r6 == 0) goto La6
                long r7 = r6.a
                r4.h = r7
                long r6 = r6.c
                r4.b = r6
            La6:
                boolean r13 = r5.isEmpty()
                if (r13 == 0) goto L42
                r12 = -1
                r4.h = r12
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: c70.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public c70(d70 d70Var) {
        this.a = d70Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        Object objB = dqi.b(u020Var, new a(this.a, null), v1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }
}
