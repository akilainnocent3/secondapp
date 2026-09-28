package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ftk0 extends kqk0 {
    @Override // defpackage.kqk0
    public final ipk0 a(String str, g3l0 g3l0Var, ArrayList arrayList) {
        if (str == null || str.isEmpty() || !g3l0Var.d(str)) {
            hb5.a(inm.a("Command not found: ", str));
            return null;
        }
        ipk0 ipk0VarG = g3l0Var.g(str);
        if (ipk0VarG instanceof jok0) {
            return ((jok0) ipk0VarG).g(g3l0Var, arrayList);
        }
        hb5.a(tug.a("Function ", str, " is not defined"));
        return null;
    }
}
