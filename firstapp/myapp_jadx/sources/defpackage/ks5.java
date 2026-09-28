package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", l = {62, 67}, m = "invokeSuspend")
public final class ks5 extends tje0 implements Function2<myh<? super IndexedValue<? extends xmz<Object>>>, v1b<? super Unit>, Object> {
    public Iterator a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ls5<Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks5(ls5<Object> ls5Var, v1b<? super ks5> v1bVar) {
        super(2, v1bVar);
        this.d = ls5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ks5 ks5Var = new ks5(this.d, v1bVar);
        ks5Var.c = obj;
        return ks5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super IndexedValue<? extends xmz<Object>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((ks5) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:14:0x0049->B:24:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r6 == r0) goto L18;
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
            int r1 = r5.b
            ls5<java.lang.Object> r2 = r5.d
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L18
            java.util.Iterator r1 = r5.a
            java.lang.Object r2 = r5.c
            myh r2 = (defpackage.myh) r2
            defpackage.uj50.b(r6)
            goto L49
        L18:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L1f:
            java.lang.Object r1 = r5.c
            myh r1 = (defpackage.myh) r1
            defpackage.uj50.b(r6)
            goto L3c
        L27:
            defpackage.uj50.b(r6)
            java.lang.Object r6 = r5.c
            r1 = r6
            myh r1 = (defpackage.myh) r1
            puh<T> r6 = r2.a
            r5.c = r1
            r5.b = r4
            java.io.Serializable r6 = r6.a(r5)
            if (r6 != r0) goto L3c
            goto L61
        L3c:
            java.util.List r6 = (java.util.List) r6
            jvd0 r2 = r2.d
            r2.start()
            java.util.Iterator r6 = r6.iterator()
            r2 = r1
            r1 = r6
        L49:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L62
            java.lang.Object r6 = r1.next()
            kotlin.collections.IndexedValue r6 = (kotlin.collections.IndexedValue) r6
            r5.c = r2
            r5.a = r1
            r5.b = r3
            java.lang.Object r6 = r2.emit(r6, r5)
            if (r6 != r0) goto L49
        L61:
            return r0
        L62:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
