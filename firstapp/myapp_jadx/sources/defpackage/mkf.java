package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;

/* JADX INFO: loaded from: classes7.dex */
public final class mkf {
    public static final boolean a(Selection selection, Selection selection2, Selection selection3, boolean z, boolean z2, boolean z3) {
        if (selection3 == null) {
            return false;
        }
        if (z && (u7u.d(selection, selection2) || rlc.a(selection, selection2))) {
            return true;
        }
        if (z2 && yay.c(selection, selection2)) {
            return true;
        }
        return z3 && qvy.c(selection) && qvy.a(selection, selection2);
    }
}
