package defpackage;

import com.sporty.android.core.model.crypto.ValidationResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.data.repository.BiometricCryptoRepositoryImpl$checkInternalWithCrypto$2", f = "BiometricCryptoRepositoryImpl.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class pc4 extends tje0 implements Function2<v5b, v1b<? super ValidationResult>, Object> {
    public ValidationResult a;
    public int b;
    public final /* synthetic */ yc4 c;
    public final /* synthetic */ String d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ValidationResult.values().length];
            try {
                iArr[ValidationResult.KeyPermanentlyInvalidate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidationResult.KeyInitFail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc4(yc4 yc4Var, String str, v1b<? super pc4> v1bVar) {
        super(2, v1bVar);
        this.c = yc4Var;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pc4(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super ValidationResult> v1bVar) {
        return ((pc4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ValidationResult validationResult;
        yc4 yc4Var = this.c;
        x3c x3cVar = yc4Var.b;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            ValidationResult validationResultC = x3cVar.c();
            int i2 = a.a[validationResultC.ordinal()];
            if (i2 != 1 && i2 != 2) {
                return validationResultC;
            }
            this.a = validationResultC;
            this.b = 1;
            x3cVar.f();
            Object objF = yc4Var.f(this.d, this);
            if (objF == y5bVar) {
                return y5bVar;
            }
            obj = objF;
            validationResult = validationResultC;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            validationResult = this.a;
            uj50.b(obj);
        }
        return validationResult;
    }
}
