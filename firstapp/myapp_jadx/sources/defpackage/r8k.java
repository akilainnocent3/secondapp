package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.domain.GetMeScreenPopupUseCase$invoke$1", f = "GetMeScreenPopupUseCase.kt", l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class r8k extends tje0 implements Function2<myh<? super lyh<? extends Boolean>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ t8k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8k(t8k t8kVar, v1b<? super r8k> v1bVar) {
        super(2, v1bVar);
        this.d = t8kVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        r8k r8kVar = new r8k(this.d, v1bVar);
        r8kVar.c = obj;
        return r8kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lyh<? extends Boolean>> myhVar, v1b<? super Unit> v1bVar) {
        return ((r8k) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L16;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r9)
            goto L69
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r5
        L1b:
            myh r0 = r8.a
            defpackage.uj50.b(r9)
            goto L5c
        L21:
            defpackage.uj50.b(r9)
            t8k r9 = r8.d
            wdk r9 = r9.c
            r8.c = r5
            r8.a = r0
            r8.b = r4
            tdk r2 = new tdk
            r2.<init>(r9, r5)
            or60 r4 = new or60
            r4.<init>(r2)
            udk r2 = new udk
            r6 = 3
            r2.<init>(r6, r5)
            yzh r7 = new yzh
            r7.<init>(r4, r2)
            yfe r9 = r9.a
            lyh r9 = r9.a()
            sdk r2 = new sdk
            r2.<init>(r9)
            vdk r9 = new vdk
            r9.<init>(r6, r5)
            n1i r4 = new n1i
            r4.<init>(r7, r2, r9)
            if (r4 != r1) goto L5b
            goto L68
        L5b:
            r9 = r4
        L5c:
            r8.c = r5
            r8.a = r5
            r8.b = r3
            java.lang.Object r8 = r0.emit(r9, r8)
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r8k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
