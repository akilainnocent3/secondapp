package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.BetDetail;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class gvd0 extends uyy {
    public final j5p b;
    public final tlo c;
    public final List<xzy> d;

    /* JADX WARN: Illegal instructions before constructor call */
    public gvd0(j5p j5pVar, tlo tloVar, ArrayList arrayList) {
        tloVar.getClass();
        LinearLayout linearLayout = j5pVar.a;
        linearLayout.getClass();
        super(linearLayout, arrayList);
        this.b = j5pVar;
        this.c = tloVar;
        this.d = arrayList;
    }

    @Override // defpackage.uyy
    public final void a(int i) {
        BigDecimal bigDecimalDivide;
        j5p j5pVar = this.b;
        TextView textView = j5pVar.c;
        xzy xzyVarC = c(i);
        BigDecimal bigDecimalI = null;
        if (xzyVarC != null) {
            BigDecimal bigDecimalAdd = BigDecimal.ZERO;
            Iterator<Bet> it = xzyVarC.b.iterator();
            while (it.hasNext()) {
                bigDecimalAdd = bigDecimalAdd.add(BigDecimal.valueOf(it.next().stake));
            }
            bigDecimalDivide = bigDecimalAdd.divide(geo.a);
        } else {
            bigDecimalDivide = null;
        }
        textView.setText(" ".concat(bjb0.L(bigDecimalDivide, Locale.US)));
        TextView textView2 = j5pVar.b;
        xzy xzyVarC2 = c(i);
        if (xzyVarC2 != null) {
            HashMap map = new HashMap();
            BigDecimal bigDecimalAdd2 = BigDecimal.ZERO;
            for (Bet bet : xzyVarC2.b) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(bet.potWin);
                ArrayList arrayList = new ArrayList();
                Iterator<BetDetail> it2 = bet.betDetails.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().marketId);
                }
                Collections.sort(arrayList);
                StringBuilder sb = new StringBuilder();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    sb.append((String) obj);
                }
                String string = sb.toString();
                if (map.get(string) == null) {
                    map.put(string, bigDecimalValueOf);
                } else {
                    if (((BigDecimal) map.get(string)).compareTo(bigDecimalValueOf) >= 0) {
                        bigDecimalValueOf = (BigDecimal) map.get(string);
                    }
                    map.put(string, bigDecimalValueOf);
                }
            }
            Iterator it3 = map.values().iterator();
            while (it3.hasNext()) {
                bigDecimalAdd2 = bigDecimalAdd2.add((BigDecimal) it3.next());
            }
            BigDecimal bigDecimalDivide2 = bigDecimalAdd2.divide(geo.a);
            tlo tloVar = this.c;
            bigDecimalI = bigDecimalDivide2.compareTo(tloVar.i()) > 0 ? tloVar.i() : bigDecimalDivide2;
        }
        textView2.setText(" ".concat(bjb0.L(bigDecimalI, Locale.US)));
    }

    @Override // defpackage.uyy
    public final List<xzy> b() {
        return this.d;
    }
}
