package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.extensions.FlowKt$transformWithDefaultValue$1", f = "Flow.kt", l = {69, 70, 70}, m = "invokeSuspend", v = 2)
public final class czh extends tje0 implements gaj<myh<Object>, Object, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ myh c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Function2<Object, v1b<Object>, Object> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czh(v1b v1bVar, Object obj, Function2 function2) {
        super(3, v1bVar);
        this.e = obj;
        this.f = function2;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<Object> myhVar, Object obj, v1b<? super Unit> v1bVar) {
        czh czhVar = new czh(v1bVar, this.e, this.f);
        czhVar.c = myhVar;
        czhVar.d = obj;
        return czhVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r0.emit(r9, r8) == r2) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            myh r0 = r8.c
            java.lang.Object r1 = r8.d
            y5b r2 = defpackage.y5b.a
            int r3 = r8.b
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L28
            if (r3 == r6) goto L24
            if (r3 == r5) goto L1e
            if (r3 != r4) goto L18
            defpackage.uj50.b(r9)
            goto L5a
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r7
        L1e:
            myh r0 = r8.a
            defpackage.uj50.b(r9)
            goto L4b
        L24:
            defpackage.uj50.b(r9)
            goto L3a
        L28:
            defpackage.uj50.b(r9)
            r8.c = r0
            r8.d = r1
            r8.b = r6
            java.lang.Object r9 = r8.e
            java.lang.Object r9 = r0.emit(r9, r8)
            if (r9 != r2) goto L3a
            goto L59
        L3a:
            r8.c = r7
            r8.d = r7
            r8.a = r0
            r8.b = r5
            kotlin.jvm.functions.Function2<java.lang.Object, v1b<java.lang.Object>, java.lang.Object> r9 = r8.f
            java.lang.Object r9 = r9.invoke(r1, r8)
            if (r9 != r2) goto L4b
            goto L59
        L4b:
            r8.c = r7
            r8.d = r7
            r8.a = r7
            r8.b = r4
            java.lang.Object r8 = r0.emit(r9, r8)
            if (r8 != r2) goto L5a
        L59:
            return r2
        L5a:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
