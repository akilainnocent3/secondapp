package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltySessionDataHandlerImpl$init$1$1", f = "SportyPenaltySessionDataHandlerImpl.kt", l = {43, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class m1d0 extends tje0 implements Function2<AccountInfo, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ p1d0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1d0(v1b v1bVar, p1d0 p1d0Var, String str) {
        super(2, v1bVar);
        this.c = p1d0Var;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m1d0 m1d0Var = new m1d0(v1bVar, this.c, this.d);
        m1d0Var.b = obj;
        return m1d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountInfo accountInfo, v1b<? super Unit> v1bVar) {
        return ((m1d0) create(accountInfo, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r6.a(r8.d, r8) == r1) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            com.sporty.android.core.model.account.AccountInfo r0 = (com.sporty.android.core.model.account.AccountInfo) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.a
            r3 = 0
            r4 = 2
            r5 = 1
            p1d0 r6 = r8.c
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L17
            defpackage.uj50.b(r9)
            goto L4d
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r3
        L1d:
            defpackage.uj50.b(r9)
            goto L40
        L21:
            defpackage.uj50.b(r9)
            wwd0 r9 = r6.f
        L26:
            java.lang.Object r2 = r9.getValue()
            r7 = r2
            q1d0 r7 = (defpackage.q1d0) r7
            q1d0$b r7 = q1d0.b.a
            boolean r2 = r9.g(r2, r7)
            if (r2 == 0) goto L26
            r8.b = r3
            r8.a = r5
            java.lang.Object r9 = r6.c(r0, r8)
            if (r9 != r1) goto L40
            goto L4c
        L40:
            r8.b = r3
            r8.a = r4
            java.lang.String r9 = r8.d
            java.lang.Object r8 = r6.a(r9, r8)
            if (r8 != r1) goto L4d
        L4c:
            return r1
        L4d:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m1d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
