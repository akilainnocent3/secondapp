package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.data.repository.BiometricCryptoRepositoryImpl$storeEncryptedToken$2", f = "BiometricCryptoRepositoryImpl.kt", l = {89, 92}, m = "invokeSuspend", v = 2)
public final class wc4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ yc4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ qd4.c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc4(yc4 yc4Var, String str, String str2, qd4.c cVar, v1b<? super wc4> v1bVar) {
        super(2, v1bVar);
        this.b = yc4Var;
        this.c = str;
        this.d = str2;
        this.e = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wc4(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wc4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r5.g(r7, r1, r2, r6) == r0) goto L17;
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
            java.lang.String r2 = r6.c
            r3 = 2
            r4 = 1
            yc4 r5 = r6.b
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L14
            defpackage.uj50.b(r7)
            goto L48
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L1b:
            defpackage.uj50.b(r7)
            goto L2b
        L1f:
            defpackage.uj50.b(r7)
            r6.a = r4
            java.lang.Object r7 = r5.h(r2, r6)
            if (r7 != r0) goto L2b
            goto L47
        L2b:
            x3c r7 = r5.b
            java.lang.String r1 = r6.d
            qd4$c r4 = r6.e
            com.sporty.android.core.model.crypto.EncryptDataResult r7 = r7.g(r1, r4)
            byte[] r1 = r7.getInitializationVector()
            if (r1 == 0) goto L48
            byte[] r7 = r7.getCiphertext()
            r6.a = r3
            java.lang.Object r6 = r5.g(r7, r1, r2, r6)
            if (r6 != r0) goto L48
        L47:
            return r0
        L48:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
