package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", l = {386, 409}, m = "invokeSuspend")
public final class b5f0 extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ c020 d;
    public final /* synthetic */ dq40<hkt> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5f0(c020 c020Var, dq40<hkt> dq40Var, v1b<? super b5f0> v1bVar) {
        super(2, v1bVar);
        this.d = c020Var;
        this.e = dq40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        b5f0 b5f0Var = new b5f0(this.d, this.e, v1bVar);
        b5f0Var.c = obj;
        return b5f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
        return ((b5f0) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[LOOP:1: B:16:0x0047->B:41:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0084 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, hkt$b] */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, hkt$a] */
    /* JADX WARN: Type inference failed for: r14v3, types: [T, hkt$c] */
    /* JADX WARN: Type inference failed for: r14v5, types: [T, hkt$a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0093 -> B:34:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b5f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
