package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {1015, 1037}, m = "invokeSuspend")
public final class k8f extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
    public b020 b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ yp40 f;
    public final /* synthetic */ dq40<m020> i;
    public final /* synthetic */ dq40<m020> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8f(yp40 yp40Var, dq40<m020> dq40Var, dq40<m020> dq40Var2, v1b<? super k8f> v1bVar) {
        super(2, v1bVar);
        this.f = yp40Var;
        this.i = dq40Var;
        this.v = dq40Var2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k8f k8fVar = new k8f(this.f, this.i, this.v, v1bVar);
        k8fVar.e = obj;
        return k8fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
        return ((k8f) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[LOOP:2: B:16:0x0056->B:20:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0069 A[EDGE_INSN: B:74:0x0069->B:22:0x0069 BREAK  A[LOOP:2: B:16:0x0056->B:20:0x0065], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [T, m020] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:39:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k8f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
