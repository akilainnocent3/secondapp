package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.SharedMomoDataDelegateImpl$initMomoSavedAssets$2", f = "SharedMomoDataDelegateImpl.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class g390 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ log0 b;
    public final /* synthetic */ i390 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g390(log0 log0Var, i390 i390Var, v1b<? super g390> v1bVar) {
        super(2, v1bVar);
        this.b = log0Var;
        this.c = i390Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g390(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g390) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r6 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6 == r0) goto L21;
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
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r6)
            goto L3b
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            return r2
        L17:
            defpackage.uj50.b(r6)
            goto L53
        L1b:
            defpackage.uj50.b(r6)
            log0 r6 = r5.b
            int r6 = r6.ordinal()
            i390 r1 = r5.c
            if (r6 == 0) goto L42
            if (r6 != r4) goto L3e
            sr10 r6 = r1.a
            pu0$c r1 = pu0.c.a
            g1i r6 = r6.h(r1)
            r5.a = r3
            java.lang.Object r6 = defpackage.bm50.p(r6, r5)
            if (r6 != r0) goto L3b
            goto L52
        L3b:
            lk50 r6 = (defpackage.lk50) r6
            goto L55
        L3e:
            defpackage.uhc.a()
            return r2
        L42:
            sr10 r6 = r1.a
            pu0$c r1 = pu0.c.a
            g1i r6 = r6.W(r1)
            r5.a = r4
            java.lang.Object r6 = defpackage.bm50.p(r6, r5)
            if (r6 != r0) goto L53
        L52:
            return r0
        L53:
            lk50 r6 = (defpackage.lk50) r6
        L55:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g390.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
