package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class bba implements PointerInputEventHandler {
    public final /* synthetic */ c020 a;

    @c0d(c = "com.sportygames.common.ui.extension.ComposeExtensionsKt$disableGestures$2$1", f = "ComposeExtensions.kt", l = {29}, m = "invokeSuspend", v = 1)
    public static final class a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ c020 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c020 c020Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = c020Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.d, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
            ((a) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0027 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:15:0x0036 A[LOOP:0: B:13:0x0030->B:15:0x0036, LOOP_END] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:12:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.c
                vp1 r0 = (defpackage.vp1) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r4.b
                r3 = 1
                if (r2 == 0) goto L18
                if (r2 != r3) goto L11
                defpackage.uj50.b(r5)
                goto L28
            L11:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r4)
                r4 = 0
                return r4
            L18:
                defpackage.uj50.b(r5)
            L1b:
                r4.c = r0
                r4.b = r3
                c020 r5 = r4.d
                java.lang.Object r5 = r0.l1(r5, r4)
                if (r5 != r1) goto L28
                return r1
            L28:
                b020 r5 = (defpackage.b020) r5
                java.util.List<m020> r5 = r5.a
                java.util.Iterator r5 = r5.iterator()
            L30:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L1b
                java.lang.Object r2 = r5.next()
                m020 r2 = (defpackage.m020) r2
                r2.a()
                goto L30
            */
            throw new UnsupportedOperationException("Method not decompiled: bba.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public bba(c020 c020Var) {
        this.a = c020Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        Object objX0 = u020Var.x0(new a(this.a, null), v1bVar);
        return objX0 == y5b.a ? objX0 : Unit.a;
    }
}
