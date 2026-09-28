package defpackage;

import android.util.Base64;
import com.sporty.android.core.model.crypto.InvalidCryptoLayerException;
import com.sporty.android.core.model.crypto.ValidationResult;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.security.biometric.BiometricAuthStatus;
import com.sporty.android.core.model.security.biometric.CryptoPurpose;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class yc4 implements oc4 {
    public final md4 a;
    public final x3c b;
    public final m2l c;
    public final k5b d;

    public yc4(md4 md4Var, x3c x3cVar, m2l m2lVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        md4Var.getClass();
        x3cVar.getClass();
        m2lVar.getClass();
        this.a = md4Var;
        this.b = x3cVar;
        this.c = m2lVar;
        this.d = k5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.oc4
    public final Object a(String str, CryptoPurpose cryptoPurpose, x1b x1bVar) {
        uc4 uc4Var;
        if (x1bVar instanceof uc4) {
            uc4Var = (uc4) x1bVar;
            int i = uc4Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uc4Var.d = i - Integer.MIN_VALUE;
            } else {
                uc4Var = new uc4(this, x1bVar);
            }
        } else {
            uc4Var = new uc4(this, x1bVar);
        }
        Object objD = uc4Var.b;
        y5b y5bVar = y5b.a;
        int i2 = uc4Var.d;
        if (i2 == 0) {
            uj50.b(objD);
            uc4Var.a = cryptoPurpose;
            uc4Var.d = 1;
            objD = ej5.d(this.d, new rc4(this, str, cryptoPurpose, null), uc4Var);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cryptoPurpose = uc4Var.a;
            uj50.b(objD);
        }
        return new nc4(cryptoPurpose, (qd4.c) objD);
    }

    @Override // defpackage.oc4
    public final Object b(String str, qd4.c cVar, tje0 tje0Var) {
        return ej5.d(this.d, new sc4(this, str, cVar, null), tje0Var);
    }

    @Override // defpackage.oc4
    public final BiometricAuthStatus c() {
        int iA = this.a.a(15);
        if (iA == 0) {
            return BiometricAuthStatus.Ready;
        }
        if (iA == 1) {
            return BiometricAuthStatus.TemporaryNotAvailable;
        }
        if (iA != 11) {
            return iA != 12 ? BiometricAuthStatus.NotAvailable : BiometricAuthStatus.NotAvailable;
        }
        return BiometricAuthStatus.AvailableButNotEnrolled;
    }

    @Override // defpackage.oc4
    public final Object d(String str, x1b x1bVar) {
        return ej5.d(this.d, new tc4(this, str, null), x1bVar);
    }

    @Override // defpackage.oc4
    public final Object e(String str, qd4.c cVar, String str2, bb4 bb4Var) {
        Object objD = ej5.d(this.d, new wc4(this, str, str2, cVar, null), bb4Var);
        return objD == y5b.a ? objD : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, x1b x1bVar) {
        qc4 qc4Var;
        if (x1bVar instanceof qc4) {
            qc4Var = (qc4) x1bVar;
            int i = qc4Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qc4Var.d = i - Integer.MIN_VALUE;
            } else {
                qc4Var = new qc4(this, x1bVar);
            }
        } else {
            qc4Var = new qc4(this, x1bVar);
        }
        Object obj = qc4Var.b;
        y5b y5bVar = y5b.a;
        int i2 = qc4Var.d;
        m2l m2lVar = this.c;
        if (i2 == 0) {
            uj50.b(obj);
            zn20.a aVar = new zn20.a("biometric_token_" + str);
            qc4Var.a = str;
            qc4Var.d = 1;
            if (m2lVar.a.clearPreference(aVar, qc4Var) != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = qc4Var.a;
        uj50.b(obj);
        zn20.a aVar2 = new zn20.a(inm.a("biometric_token_iv_", str));
        qc4Var.a = null;
        qc4Var.d = 2;
        Object objClearPreference = m2lVar.a.clearPreference(aVar2, qc4Var);
        return objClearPreference == y5bVar ? y5bVar : objClearPreference;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(byte[] bArr, byte[] bArr2, String str, x1b x1bVar) {
        vc4 vc4Var;
        String str2;
        if (x1bVar instanceof vc4) {
            vc4Var = (vc4) x1bVar;
            int i = vc4Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vc4Var.e = i - Integer.MIN_VALUE;
            } else {
                vc4Var = new vc4(this, x1bVar);
            }
        } else {
            vc4Var = new vc4(this, x1bVar);
        }
        Object obj = vc4Var.c;
        y5b y5bVar = y5b.a;
        int i2 = vc4Var.e;
        m2l m2lVar = this.c;
        if (i2 == 0) {
            uj50.b(obj);
            String strEncodeToString = Base64.encodeToString(bArr, 0);
            String strEncodeToString2 = Base64.encodeToString(bArr2, 0);
            String strA = inm.a("biometric_token_", str);
            vc4Var.a = str;
            vc4Var.b = strEncodeToString2;
            vc4Var.e = 1;
            if (m2lVar.a.putString(strA, strEncodeToString, vc4Var) != y5bVar) {
                str2 = strEncodeToString2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = vc4Var.b;
        str = vc4Var.a;
        uj50.b(obj);
        String strA2 = inm.a("biometric_token_iv_", str);
        vc4Var.a = null;
        vc4Var.b = null;
        vc4Var.e = 2;
        Object objPutString = m2lVar.a.putString(strA2, str2, vc4Var);
        return objPutString == y5bVar ? y5bVar : objPutString;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, x1b x1bVar) throws InvalidCryptoLayerException {
        xc4 xc4Var;
        if (x1bVar instanceof xc4) {
            xc4Var = (xc4) x1bVar;
            int i = xc4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xc4Var.c = i - Integer.MIN_VALUE;
            } else {
                xc4Var = new xc4(this, x1bVar);
            }
        } else {
            xc4Var = new xc4(this, x1bVar);
        }
        Object objD = xc4Var.a;
        y5b y5bVar = y5b.a;
        int i2 = xc4Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            xc4Var.c = 1;
            objD = ej5.d(this.d, new pc4(this, str, null), xc4Var);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        ValidationResult validationResult = (ValidationResult) objD;
        if (validationResult == ValidationResult.Ok) {
            return Unit.a;
        }
        throw new InvalidCryptoLayerException(validationResult);
    }
}
