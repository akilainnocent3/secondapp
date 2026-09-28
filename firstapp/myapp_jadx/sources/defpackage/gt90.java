package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public final class gt90 {
    public final lrm a;

    public gt90(lrm lrmVar) {
        lrmVar.getClass();
        this.a = lrmVar;
    }

    public final boolean a(Selection selection) {
        String str;
        Object bVar;
        selection.getClass();
        lrm lrmVar = this.a;
        if (!lrmVar.B().containsKey(selection) || !qz3.b(selection) || (str = (String) lrmVar.B().get(selection)) == null || str.length() == 0) {
            return false;
        }
        Object obj = BigDecimal.ZERO;
        obj.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = str.length() == 0 ? obj : new BigDecimal(str);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (!(bVar instanceof zi50.b)) {
            obj = bVar;
        }
        return ((BigDecimal) obj).compareTo(BigDecimal.ZERO) > 0;
    }
}
