package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.usecase.IsWithdrawPinPromptRequiredUseCase$getPinStatus$1", f = "IsWithdrawPinPromptRequiredUseCase.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class z1p extends tje0 implements Function2<myh<? super zi50<? extends WithdrawalPinStatusInfo>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y1p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1p(v1b v1bVar, y1p y1pVar) {
        super(2, v1bVar);
        this.d = y1pVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        z1p z1pVar = new z1p(v1bVar, this.d);
        z1pVar.c = obj;
        return z1pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super zi50<? extends WithdrawalPinStatusInfo>> myhVar, v1b<? super Unit> v1bVar) {
        return ((z1p) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r0.emit(r2, r6) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r7)
            goto L4d
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L1b:
            myh r0 = r6.a
            defpackage.uj50.b(r7)
            zi50 r7 = (defpackage.zi50) r7
            java.lang.Object r7 = r7.a
            goto L3b
        L25:
            defpackage.uj50.b(r7)
            y1p r7 = r6.d
            g010 r7 = r7.a
            r8d0 r2 = defpackage.r8d0.a
            r6.c = r5
            r6.a = r0
            r6.b = r4
            java.lang.Object r7 = r7.a(r2, r6)
            if (r7 != r1) goto L3b
            goto L4c
        L3b:
            zi50 r2 = new zi50
            r2.<init>(r7)
            r6.c = r5
            r6.a = r5
            r6.b = r3
            java.lang.Object r6 = r0.emit(r2, r6)
            if (r6 != r1) goto L4d
        L4c:
            return r1
        L4d:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
