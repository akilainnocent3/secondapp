package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kbm implements zv20.a {
    @Override // zv20.a
    public final Object a(b3 b3Var) throws GeneralSecurityException {
        rn7 rn7Var = new rn7();
        if (byf0.a.b.a()) {
            return rn7Var;
        }
        opp.a("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        return null;
    }
}
