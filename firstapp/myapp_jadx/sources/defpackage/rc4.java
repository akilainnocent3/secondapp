package defpackage;

import com.sporty.android.core.model.security.biometric.CryptoPurpose;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.data.repository.BiometricCryptoRepositoryImpl$createCryptoObject$2", f = "BiometricCryptoRepositoryImpl.kt", l = {137, 141}, m = "invokeSuspend", v = 2)
public final class rc4 extends tje0 implements Function2<v5b, v1b<? super qd4.c>, Object> {
    public int a;
    public final /* synthetic */ yc4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ CryptoPurpose d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CryptoPurpose.values().length];
            try {
                iArr[CryptoPurpose.Decryption.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc4(yc4 yc4Var, String str, CryptoPurpose cryptoPurpose, v1b<? super rc4> v1bVar) {
        super(2, v1bVar);
        this.b = yc4Var;
        this.c = str;
        this.d = cryptoPurpose;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rc4(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super qd4.c> v1bVar) {
        return ((rc4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r9 == r0) goto L17;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.a
            r2 = 0
            com.sporty.android.core.model.security.biometric.CryptoPurpose r3 = r8.d
            r4 = 2
            java.lang.String r5 = r8.c
            yc4 r6 = r8.b
            r7 = 1
            if (r1 == 0) goto L21
            if (r1 == r7) goto L1d
            if (r1 != r4) goto L17
            defpackage.uj50.b(r9)
            goto L4c
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r2
        L1d:
            defpackage.uj50.b(r9)
            goto L2d
        L21:
            defpackage.uj50.b(r9)
            r8.a = r7
            java.lang.Object r9 = r6.h(r5, r8)
            if (r9 != r0) goto L2d
            goto L4b
        L2d:
            int[] r9 = rc4.a.a
            int r1 = r3.ordinal()
            r9 = r9[r1]
            if (r9 != r7) goto L64
            m2l r9 = r6.c
            java.lang.String r1 = "biometric_token_iv_"
            java.lang.String r1 = defpackage.inm.a(r1, r5)
            r8.a = r4
            zed r9 = r9.a
            java.lang.String r4 = ""
            java.lang.Object r9 = r9.getString(r1, r4, r8)
            if (r9 != r0) goto L4c
        L4b:
            return r0
        L4c:
            java.lang.String r9 = (java.lang.String) r9
            int r8 = r9.length()
            if (r8 == 0) goto L5a
            r8 = 0
            byte[] r2 = android.util.Base64.decode(r9, r8)
            goto L64
        L5a:
            java.lang.String r8 = "No IV found for user "
            java.lang.String r8 = defpackage.inm.a(r8, r5)
            defpackage.ib5.a(r8)
            return r2
        L64:
            x3c r8 = r6.b
            qd4$c r8 = r8.d(r3, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
