package defpackage;

import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class ard0 implements zde0<f1e0> {
    public final /* synthetic */ brd0 a;
    public final /* synthetic */ String b;

    public ard0(brd0 brd0Var, String str) {
        this.a = brd0Var;
        this.b = str;
    }

    @Override // defpackage.zde0
    public final void a(bee0 bee0Var) {
        if (bee0Var != null) {
            bee0Var.request(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.zde0
    public final void onError(Throwable th) {
        th.getClass();
        this.a.a.d(this.b, th);
    }

    @Override // defpackage.zde0
    public final void onNext(f1e0 f1e0Var) {
        Long lValueOf;
        String str;
        Integer intOrNull;
        f1e0 f1e0Var2 = f1e0Var;
        if (f1e0Var2 != null) {
            String str2 = f1e0Var2.c;
            str2.getClass();
            Regex regex = new Regex("CLICK_ACK:session-([^-]+)-row-(\\d+)");
            Regex regex2 = new Regex("CLICK_NACK:session-([^-]+)-row-(\\d+)");
            n8v n8vVarB = regex.b(str2);
            n8v n8vVarB2 = regex2.b(str2);
            brd0 brd0Var = this.a;
            Object dbVar = null;
            if (n8vVarB != null || n8vVarB2 != null) {
                if (n8vVarB != null) {
                    try {
                        lValueOf = Long.valueOf(Long.parseLong((String) ((n8v.a) n8vVarB.a()).get(1)));
                    } catch (NumberFormatException e) {
                        brd0Var.a.e(e);
                        lValueOf = null;
                    }
                    Integer intOrNull2 = StringsKt.toIntOrNull((String) ((n8v.a) n8vVarB.a()).get(2));
                    if (intOrNull2 != null) {
                        int iIntValue = intOrNull2.intValue();
                        if (lValueOf != null) {
                            dbVar = new db(lValueOf.longValue(), iIntValue);
                        }
                    }
                } else if (n8vVarB2 != null && (str = (String) ((n8v.a) n8vVarB2.a()).get(2)) != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
                    dbVar = new nbx(intOrNull.intValue());
                }
            }
            if (dbVar != null) {
                brd0Var.c.a(dbVar);
            }
        }
    }

    @Override // defpackage.zde0
    public final void onComplete() {
    }
}
