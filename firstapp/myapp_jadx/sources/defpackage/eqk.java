package defpackage;

import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;

/* JADX INFO: loaded from: classes.dex */
public final class eqk {
    public final q840 a;
    public final ofo b;
    public final rcd c;

    public eqk(q840 q840Var, ofo ofoVar, rcd rcdVar) {
        q840Var.getClass();
        ofoVar.getClass();
        rcdVar.getClass();
        this.a = q840Var;
        this.b = ofoVar;
        this.c = rcdVar;
    }

    public final zpk a(int i, int i2, boolean z, String str, InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContext) {
        if (i != 1) {
            return (i == 101 || i == 150 || i == 159 || i == 171 || i == 173 || i == 146 || i == 147 || i == 152 || i == 153) ? this.b.a(instantWinGiftApplicabilityContext) : this.c.a(i2, str, z);
        }
        return this.a.a(i2, str, z);
    }
}
