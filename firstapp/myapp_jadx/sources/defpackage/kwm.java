package defpackage;

import com.sportybet.android.account.international.data.model.INTRegisterRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class kwm {
    public final lwm a;
    public final rx20 b;
    public final INTRegisterRequest c;

    public kwm(lwm lwmVar, rx20 rx20Var, psm psmVar, mgb0 mgb0Var) {
        lwmVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        this.a = lwmVar;
        this.b = rx20Var;
        this.c = new INTRegisterRequest(null, null, psmVar.getCountryCode().getCode(), psmVar.B(), mgb0Var.getLanguageCode(), null, null, null, null, null, 995, null);
    }
}
