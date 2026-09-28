package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend")
public final class o1i extends tje0 implements gaj<myh<Object>, Object[], v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object[] c;
    public final /* synthetic */ gaj<Object, Object, v1b<Object>, Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o1i(gaj<Object, Object, ? super v1b<Object>, ? extends Object> gajVar, v1b<? super o1i> v1bVar) {
        super(3, v1bVar);
        this.d = gajVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<Object> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
        o1i o1iVar = new o1i(this.d, v1bVar);
        o1iVar.b = myhVar;
        o1iVar.c = objArr;
        return o1iVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r7)
            goto L41
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L17:
            myh r1 = r6.b
            defpackage.uj50.b(r7)
            goto L36
        L1d:
            defpackage.uj50.b(r7)
            myh r1 = r6.b
            java.lang.Object[] r7 = r6.c
            r5 = 0
            r5 = r7[r5]
            r7 = r7[r4]
            r6.b = r1
            r6.a = r4
            gaj<java.lang.Object, java.lang.Object, v1b<java.lang.Object>, java.lang.Object> r4 = r6.d
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r0) goto L36
            goto L40
        L36:
            r6.b = r2
            r6.a = r3
            java.lang.Object r6 = r1.emit(r7, r6)
            if (r6 != r0) goto L41
        L40:
            return r0
        L41:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o1i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
