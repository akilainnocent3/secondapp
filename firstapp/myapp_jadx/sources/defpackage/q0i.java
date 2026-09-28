package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {213, 213}, m = "invokeSuspend")
public final class q0i extends tje0 implements gaj<myh<Object>, Object, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Function2<Object, v1b<Object>, Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q0i(Function2<Object, ? super v1b<Object>, ? extends Object> function2, v1b<? super q0i> v1bVar) {
        super(3, v1bVar);
        this.d = function2;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<Object> myhVar, Object obj, v1b<? super Unit> v1bVar) {
        q0i q0iVar = new q0i(this.d, v1bVar);
        q0iVar.b = myhVar;
        q0iVar.c = obj;
        return q0iVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
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
            int r1 = r5.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r6)
            goto L3c
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            return r2
        L17:
            myh r1 = r5.b
            defpackage.uj50.b(r6)
            goto L31
        L1d:
            defpackage.uj50.b(r6)
            myh r1 = r5.b
            java.lang.Object r6 = r5.c
            r5.b = r1
            r5.a = r4
            kotlin.jvm.functions.Function2<java.lang.Object, v1b<java.lang.Object>, java.lang.Object> r4 = r5.d
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L31
            goto L3b
        L31:
            r5.b = r2
            r5.a = r3
            java.lang.Object r5 = r1.emit(r6, r5)
            if (r5 != r0) goto L3c
        L3b:
            return r0
        L3c:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
