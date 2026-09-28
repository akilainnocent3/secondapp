package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;

/* JADX INFO: loaded from: classes6.dex */
public final class uga0 {
    public final lyz a;
    public final vga0 b;
    public final psm c;
    public final uqm d;
    public final bnh0 e;
    public final iym f;

    public uga0(lyz lyzVar, vga0 vga0Var, psm psmVar, uqm uqmVar, bnh0 bnh0Var, iym iymVar) {
        lyzVar.getClass();
        vga0Var.getClass();
        psmVar.getClass();
        uqmVar.getClass();
        bnh0Var.getClass();
        iymVar.getClass();
        this.a = lyzVar;
        this.b = vga0Var;
        this.c = psmVar;
        this.d = uqmVar;
        this.e = bnh0Var;
        this.f = iymVar;
    }

    public static final sga0 a(uga0 uga0Var, boolean z, String str, CountryCodeName countryCodeName) {
        return new sga0(bm50.b(z ? uga0Var.b.s() : uga0Var.b.i(str), vch0.b), z, uga0Var, str, countryCodeName);
    }
}
