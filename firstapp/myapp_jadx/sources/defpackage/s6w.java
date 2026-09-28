package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", f = "MouseWheelScrollable.kt", l = {179}, m = "invokeSuspend")
public final class s6w extends ji50 implements Function2<wc80<Object>, v1b<? super Unit>, Object> {
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ h6w e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6w(h6w h6wVar, v1b v1bVar) {
        super(2, v1bVar);
        this.e = h6wVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s6w s6wVar = new s6w(this.e, v1bVar);
        s6wVar.d = obj;
        return s6wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wc80<Object> wc80Var, v1b<? super Unit> v1bVar) {
        return ((s6w) create(wc80Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0036 -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0036
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L14
            java.lang.Object r1 = r5.b
            java.lang.Object r4 = r5.d
            wc80 r4 = (defpackage.wc80) r4
            defpackage.uj50.b(r6)
            goto L37
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            return r2
        L1a:
            defpackage.uj50.b(r6)
            java.lang.Object r6 = r5.d
            wc80 r6 = (defpackage.wc80) r6
            r4 = r6
        L22:
            h6w r6 = r5.e
            java.lang.Object r6 = r6.invoke()
            if (r6 == 0) goto L36
            r5.d = r4
            r5.b = r6
            r5.c = r3
            r4.b(r5, r6)
            y5b r5 = defpackage.y5b.a
            return r0
        L36:
            r1 = r2
        L37:
            if (r1 != 0) goto L22
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
