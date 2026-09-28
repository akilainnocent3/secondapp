package defpackage;

import android.view.ViewGroup;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import com.sportybet.plugin.realsports.widget.OutcomeView;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class kuh {
    public static final void a(OutcomeButton outcomeButton, z7z z7zVar, String str, ViewGroup viewGroup, ku1 ku1Var, boolean z) {
        outcomeButton.getClass();
        z7zVar.getClass();
        str.getClass();
        if (z7zVar instanceof z7z.b) {
            e(outcomeButton, ((z7z.b) z7zVar).a, str, viewGroup, ku1Var, z);
        } else if (z7zVar.equals(z7z.a.a)) {
            outcomeButton.f(viewGroup, ku1Var, z);
        } else {
            if (z7zVar.equals(z7z.c.a)) {
                return;
            }
            uhc.a();
        }
    }

    public static final void b(OutcomeView outcomeView, z7z z7zVar, String str, ViewGroup viewGroup, ku1 ku1Var, boolean z) {
        outcomeView.getClass();
        z7zVar.getClass();
        str.getClass();
        if (!(z7zVar instanceof z7z.b)) {
            if (z7zVar.equals(z7z.a.a)) {
                outcomeView.H(viewGroup, ku1Var, z);
                return;
            } else {
                if (z7zVar.equals(z7z.c.a)) {
                    return;
                }
                uhc.a();
                return;
            }
        }
        BigDecimal bigDecimal = ((z7z.b) z7zVar).a;
        bigDecimal.getClass();
        BigDecimal bigDecimalG = b.g(str);
        if (bigDecimalG == null) {
            return;
        }
        outcomeView.getOb2().setBoostedOdds(bjb0.L(bigDecimalG.multiply(bigDecimal), Locale.US), str);
        outcomeView.H(viewGroup, ku1Var, z);
    }

    public static /* synthetic */ void c(OutcomeButton outcomeButton, z7z z7zVar, String str, ViewGroup viewGroup, boolean z, int i) {
        if ((i & 8) != 0) {
            viewGroup = null;
        }
        ViewGroup viewGroup2 = viewGroup;
        ku1 ku1Var = ku1.b;
        if ((i & 32) != 0) {
            z = false;
        }
        a(outcomeButton, z7zVar, str, viewGroup2, ku1Var, z);
    }

    public static /* synthetic */ void d(OutcomeView outcomeView, z7z z7zVar, String str, ViewGroup viewGroup, boolean z, int i) {
        if ((i & 8) != 0) {
            viewGroup = null;
        }
        ViewGroup viewGroup2 = viewGroup;
        ku1 ku1Var = ku1.a;
        if ((i & 32) != 0) {
            z = false;
        }
        b(outcomeView, z7zVar, str, viewGroup2, ku1Var, z);
    }

    public static final void e(OutcomeButton outcomeButton, BigDecimal bigDecimal, String str, ViewGroup viewGroup, ku1 ku1Var, boolean z) {
        outcomeButton.getClass();
        bigDecimal.getClass();
        str.getClass();
        BigDecimal bigDecimalG = b.g(str);
        if (bigDecimalG == null) {
            return;
        }
        outcomeButton.f(viewGroup, ku1Var, z);
        outcomeButton.setBoostedOdds(bjb0.L(bigDecimalG.multiply(bigDecimal), Locale.US), str);
    }
}
