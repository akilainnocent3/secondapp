package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class en implements zv20.a {
    @Override // zv20.a
    public final Object a(b3 b3Var) throws GeneralSecurityException {
        qn7 qn7Var = new qn7();
        if (byf0.a.a.a()) {
            return qn7Var;
        }
        opp.a("Can not use AES-CMAC in FIPS-mode.");
        return null;
    }
}
