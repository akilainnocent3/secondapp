package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", l = {646, 179}, m = "invokeSuspend")
public final class nnz extends tje0 implements Function2<myh<? super xmz<Object>>, v1b<? super Unit>, Object> {
    public tuw a;
    public myh b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ enz<Object, Object> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnz(enz<Object, Object> enzVar, v1b<? super nnz> v1bVar) {
        super(2, v1bVar);
        this.e = enzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nnz nnzVar = new nnz(this.e, v1bVar);
        nnzVar.d = obj;
        return nnzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super xmz<Object>> myhVar, v1b<? super Unit> v1bVar) {
        return ((nnz) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r1.emit(r3, r6) == r0) goto L17;
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
            int r1 = r6.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L23
            if (r1 == r3) goto L17
            if (r1 != r2) goto L11
            defpackage.uj50.b(r7)
            goto L60
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r4
        L17:
            myh r1 = r6.b
            tuw r3 = r6.a
            java.lang.Object r5 = r6.d
            onz$a r5 = (onz.a) r5
            defpackage.uj50.b(r7)
            goto L41
        L23:
            defpackage.uj50.b(r7)
            java.lang.Object r7 = r6.d
            r1 = r7
            myh r1 = (defpackage.myh) r1
            enz<java.lang.Object, java.lang.Object> r7 = r6.e
            onz$a<Key, Value> r5 = r7.j
            tuw r7 = r5.a
            r6.d = r5
            r6.a = r7
            r6.b = r1
            r6.c = r3
            java.lang.Object r3 = r7.d(r6)
            if (r3 != r0) goto L40
            goto L5f
        L40:
            r3 = r7
        L41:
            onz<Key, Value> r7 = r5.b     // Catch: java.lang.Throwable -> L63
            tsw r7 = r7.l     // Catch: java.lang.Throwable -> L63
            jxs r7 = r7.d()     // Catch: java.lang.Throwable -> L63
            r3.f(r4)
            xmz$c r3 = new xmz$c
            r3.<init>(r7, r4)
            r6.d = r4
            r6.a = r4
            r6.b = r4
            r6.c = r2
            java.lang.Object r6 = r1.emit(r3, r6)
            if (r6 != r0) goto L60
        L5f:
            return r0
        L60:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L63:
            r6 = move-exception
            r3.f(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
