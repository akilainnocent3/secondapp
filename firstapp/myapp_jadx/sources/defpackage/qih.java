package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.footer.impl.domain.usecase.FetchPaymentProvidersUseCase$getPaymentProviders$1", f = "FetchPaymentProvidersUseCase.kt", l = {RuntimeVersion.MINOR, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class qih extends tje0 implements Function2<myh<? super p800>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rih c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qih(rih rihVar, v1b<? super qih> v1bVar) {
        super(2, v1bVar);
        this.c = rihVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qih qihVar = new qih(this.c, v1bVar);
        qihVar.b = obj;
        return qihVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super p800> myhVar, v1b<? super Unit> v1bVar) {
        return ((qih) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (defpackage.kzh.c(r0, r8, r7) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        return r1;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L1c
            if (r2 == r5) goto L18
            if (r2 != r3) goto L12
            goto L18
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r4
        L18:
            defpackage.uj50.b(r8)
            goto L68
        L1c:
            defpackage.uj50.b(r8)
            rih r8 = r7.c
            java.lang.Object r2 = r8.a
            psm r2 = (defpackage.psm) r2
            boolean r2 = r2.O()
            if (r2 == 0) goto L3c
            p800 r8 = new p800
            r2 = 0
            r8.<init>(r2)
            r7.b = r4
            r7.a = r5
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L68
            goto L67
        L3c:
            java.lang.Object r2 = r8.c
            ipx r2 = (defpackage.ipx) r2
            java.lang.String r5 = "main_footer"
            java.lang.String r6 = "payment_method_"
            or60 r2 = r2.c(r5, r6, r4)
            yzh r2 = defpackage.bm50.a(r2)
            vl50 r2 = defpackage.bm50.f(r2)
            oih r5 = new oih
            r5.<init>(r2, r8)
            java.lang.Object r8 = r8.b
            k5b r8 = (defpackage.k5b) r8
            lyh r8 = defpackage.ozh.c(r5, r8)
            r7.b = r4
            r7.a = r3
            java.lang.Object r7 = defpackage.kzh.c(r0, r8, r7)
            if (r7 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qih.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
