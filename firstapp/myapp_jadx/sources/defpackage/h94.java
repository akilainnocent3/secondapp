package defpackage;

import com.sporty.android.core.model.crypto.InvalidCryptoLayerException;
import com.sporty.android.core.model.security.biometric.CryptoPurpose;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.presentation.settings.BioAuthSettingsViewModel$triggerPrompt$1", f = "BioAuthSettingsViewModel.kt", l = {150}, m = "invokeSuspend", v = 2)
public final class h94 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i94 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h94(i94 i94Var, v1b<? super h94> v1bVar) {
        super(2, v1bVar);
        this.b = i94Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h94(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h94) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i;
        Object value;
        Object value2;
        i94 i94Var = this.b;
        wwd0 wwd0Var = i94Var.v;
        y5b y5bVar = y5b.a;
        int i2 = this.a;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                oc4 oc4Var = i94Var.b;
                String phoneNumber = i94Var.d.getPhoneNumber();
                phoneNumber.getClass();
                CryptoPurpose cryptoPurpose = CryptoPurpose.Decryption;
                this.a = 1;
                obj = oc4Var.a(phoneNumber, cryptoPurpose, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            nc4 nc4Var = (nc4) obj;
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, d94.a((d94) value2, null, nc4Var.b, false, false, null, false, null, 0, 253)));
        } catch (Exception e) {
            if (e instanceof InvalidCryptoLayerException) {
                InvalidCryptoLayerException invalidCryptoLayerException = (InvalidCryptoLayerException) e;
                itf0.a.f(invalidCryptoLayerException, "handleInvalidCryptoException...", new Object[0]);
                if (invalidCryptoLayerException.getIsKeyPermanentlyInvalidated()) {
                    i = 2;
                } else {
                    i = invalidCryptoLayerException.getIsKeyInitFailed() ? 3 : 999999999;
                }
                int i3 = i;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, d94.a((d94) value, null, null, false, false, null, false, null, i3, 127)));
            } else {
                itf0.a.f(e, "Error preparing auth context", new Object[0]);
            }
        }
        return Unit.a;
    }
}
