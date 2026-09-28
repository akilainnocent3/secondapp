package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {227}, m = "invokeSuspend")
public final class v4f0 extends ji50 implements Function2<vp1, v1b<? super m020>, Object> {
    public long b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ m020 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4f0(m020 m020Var, v1b<? super v4f0> v1bVar) {
        super(2, v1bVar);
        this.e = m020Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        v4f0 v4f0Var = new v4f0(this.e, v1bVar);
        v4f0Var.d = obj;
        return v4f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vp1 vp1Var, v1b<? super m020> v1bVar) {
        return ((v4f0) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:12:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.c
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L13
            long r3 = r7.b
            java.lang.Object r1 = r7.d
            vp1 r1 = (defpackage.vp1) r1
            defpackage.uj50.b(r8)
            goto L3e
        L13:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L1a:
            defpackage.uj50.b(r8)
            java.lang.Object r8 = r7.d
            vp1 r8 = (defpackage.vp1) r8
            m020 r1 = r7.e
            long r3 = r1.b
            z6i0 r1 = r8.getViewConfiguration()
            long r5 = r1.b()
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L30:
            r7.d = r1
            r7.b = r3
            r7.c = r2
            r8 = 3
            java.lang.Object r8 = defpackage.u4f0.b(r1, r7, r8)
            if (r8 != r0) goto L3e
            return r0
        L3e:
            m020 r8 = (defpackage.m020) r8
            long r5 = r8.b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L30
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v4f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
