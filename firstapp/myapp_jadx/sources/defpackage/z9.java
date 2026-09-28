package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.crypto.InvalidCryptoLayerException;
import com.sporty.android.core.model.security.biometric.CryptoPurpose;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.viewmodel.AccountLoginViewModel$prepareAuthContext$1", f = "AccountLoginViewModel.kt", l = {231}, m = "invokeSuspend", v = 2)
public final class z9 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ aa b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(aa aaVar, String str, v1b<? super z9> v1bVar) {
        super(2, v1bVar);
        this.b = aaVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z9(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z9) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        y5b y5bVar = y5b.a;
        int i = this.a;
        String str = this.c;
        aa aaVar = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                oc4 oc4Var = aaVar.f;
                CryptoPurpose cryptoPurpose = CryptoPurpose.Decryption;
                this.a = 1;
                obj = oc4Var.a(str, cryptoPurpose, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            nc4 nc4Var = (nc4) obj;
            wwd0 wwd0Var = aaVar.C;
            do {
                value4 = wwd0Var.getValue();
            } while (!wwd0Var.g(value4, q74.a((q74) value4, null, false, nc4Var.b, str, false, null, null, 0L, 243)));
        } catch (Exception e) {
            if (e instanceof InvalidCryptoLayerException) {
                InvalidCryptoLayerException invalidCryptoLayerException = (InvalidCryptoLayerException) e;
                wwd0 wwd0Var2 = aaVar.C;
                itf0.a.f(invalidCryptoLayerException, "handleInvalidCryptoException...", new Object[0]);
                if (invalidCryptoLayerException.getIsKeyPermanentlyInvalidated()) {
                    do {
                        value3 = wwd0Var2.getValue();
                        StringUiText stringUiText = vch0.a;
                    } while (!wwd0Var2.g(value3, q74.a((q74) value3, null, false, null, null, false, new ResourceUiText(R.string.biometrics_authentication__biometric_authentication_cannot_be_used), new ResourceUiText(R.string.biometrics_authentication__android_biometric_authentication_cannot_be_used), 0L, 159)));
                }
                do {
                    value2 = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value2, q74.a((q74) value2, null, false, null, null, false, null, null, 0L, 253)));
            } else {
                wwd0 wwd0Var3 = aaVar.C;
                do {
                    value = wwd0Var3.getValue();
                    StringUiText stringUiText2 = vch0.a;
                } while (!wwd0Var3.g(value, q74.a((q74) value, null, false, null, null, false, null, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later), 0L, 191)));
                itf0.a.f(e, "prepareAuthContext failed", new Object[0]);
            }
        }
        return Unit.a;
    }
}
