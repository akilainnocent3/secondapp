package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.sporty.android.book.domain.entity.SourceType;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportygames.commons.SportyGamesManager;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b3 implements b5d, dma {
    public static String b;
    public final /* synthetic */ int a;

    public /* synthetic */ b3(int i) {
        this.a = i;
    }

    public static void H(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(textView.getContext(), R.drawable.spr_ic_chevron_right_pale_grey_16dp, textView.getContext().getResources().getColor(i)), (Drawable) null);
    }

    public static boolean I(int i, long j) {
        return (i == 0 && System.currentTimeMillis() >= j) || i == 1 || i == 2;
    }

    public static String K(String str) {
        return (str == null || str.isEmpty()) ? "0.00" : String.format(Locale.US, "%,.2f", new BigDecimal(str));
    }

    public static ArrayList L(mfb0 mfb0Var, List list, int i) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c2p c2pVar = (c2p) it.next();
            if (c2pVar instanceof fqu) {
                Market market = ((fqu) c2pVar).a;
                if (!R(market, i) && Q(mfb0Var, market.id)) {
                    String strO = O(mfb0Var, market);
                    if (!hashSet.contains(strO)) {
                        hashSet.add(strO);
                        arrayList.add(market);
                    }
                }
            }
        }
        return arrayList;
    }

    public static String M(Event event) {
        return event == null ? "" : sn5.b(yrh0.j(), R.string.app_common__market_count, String.valueOf(event.totalMarketSize));
    }

    public static SourceType N(String str) {
        if (str.startsWith("sr:match:1111111") || str.startsWith("1111111")) {
            return SourceType.BET_GENIUS;
        }
        return (str.startsWith("sr:match:B") || str.startsWith("B")) ? SourceType.BETER : SourceType.BET_RADAR;
    }

    public static String O(mfb0 mfb0Var, Market market) {
        HashSet hashSet = tru.a;
        boolean zG = tru.g(market.id, market.specifier);
        String str = market.id;
        if (zG) {
            return inm.a("asian", str);
        }
        if (!mfb0Var.o(str) && !mfb0Var.i(market.id)) {
            return market.id;
        }
        return market.id + market.desc;
    }

    public static String P(Event event) {
        Context contextJ = yrh0.j();
        String str = event.gameId;
        if (str == null) {
            str = "";
        }
        return sn5.b(contextJ, R.string.app_common__id_is, str);
    }

    public static boolean Q(mfb0 mfb0Var, String str) {
        return mfb0Var.w(str) || mfb0Var.o(str) || mfb0Var.m(str) || mfb0Var.b(str) || mfb0Var.i(str);
    }

    public static boolean R(Market market, int i) {
        int i2;
        return market.product != i || (i2 = market.status) == 2 || i2 == 3;
    }

    public static boolean S(String str) {
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length <= 2) {
            return false;
        }
        String str2 = strArrSplit[2];
        return str2.startsWith("2000") & (str2.length() > 10);
    }

    public static boolean T(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("sr:season") || str.startsWith("sr:simple_tournament") || str.startsWith("sr:stage");
    }

    public static boolean U(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("sr:pick:");
    }

    public static String V(long j) {
        return String.format(SportyGamesManager.locale, "%,.2f", BigDecimal.valueOf(j).divide(BigDecimal.valueOf(10000L), 2, RoundingMode.HALF_UP));
    }

    @Override // defpackage.b5d
    public String A() {
        Object objJ = J();
        objJ.getClass();
        return (String) objJ;
    }

    @Override // defpackage.b5d
    public int B(pd80 pd80Var) {
        pd80Var.getClass();
        Object objJ = J();
        objJ.getClass();
        return ((Integer) objJ).intValue();
    }

    @Override // defpackage.b5d
    public boolean D() {
        return true;
    }

    @Override // defpackage.dma
    public boolean E(pd80 pd80Var, int i) {
        pd80Var.getClass();
        return t();
    }

    @Override // defpackage.b5d
    public byte F() {
        Object objJ = J();
        objJ.getClass();
        return ((Byte) objJ).byteValue();
    }

    @Override // defpackage.dma
    public double G(pd80 pd80Var, int i) {
        pd80Var.getClass();
        return s();
    }

    public Object J() {
        throw new ee80(jq40.a(getClass()) + " can't retrieve untyped values");
    }

    public abstract Object W();

    @Override // defpackage.dma
    public void b(pd80 pd80Var) {
        pd80Var.getClass();
    }

    @Override // defpackage.b5d
    public dma c(pd80 pd80Var) {
        pd80Var.getClass();
        return this;
    }

    @Override // defpackage.dma
    public b5d e(wv20 wv20Var, int i) {
        return l(wv20Var.g(i));
    }

    @Override // defpackage.dma
    public char f(wv20 wv20Var, int i) {
        return u();
    }

    @Override // defpackage.dma
    public float g(wv20 wv20Var, int i) {
        return q();
    }

    @Override // defpackage.dma
    public byte i(wv20 wv20Var, int i) {
        return F();
    }

    @Override // defpackage.dma
    public String j(pd80 pd80Var, int i) {
        pd80Var.getClass();
        return A();
    }

    @Override // defpackage.b5d
    public int k() {
        Object objJ = J();
        objJ.getClass();
        return ((Integer) objJ).intValue();
    }

    @Override // defpackage.b5d
    public b5d l(pd80 pd80Var) {
        pd80Var.getClass();
        return this;
    }

    @Override // defpackage.dma
    public int m(pd80 pd80Var, int i) {
        pd80Var.getClass();
        return k();
    }

    @Override // defpackage.dma
    public Object n(pd80 pd80Var, int i, tae taeVar, Object obj) {
        pd80Var.getClass();
        taeVar.getClass();
        if (taeVar.getDescriptor().b() || D()) {
            return z(taeVar);
        }
        return null;
    }

    @Override // defpackage.b5d
    public long o() {
        Object objJ = J();
        objJ.getClass();
        return ((Long) objJ).longValue();
    }

    @Override // defpackage.b5d
    public short p() {
        Object objJ = J();
        objJ.getClass();
        return ((Short) objJ).shortValue();
    }

    @Override // defpackage.b5d
    public float q() {
        Object objJ = J();
        objJ.getClass();
        return ((Float) objJ).floatValue();
    }

    @Override // defpackage.dma
    public long r(pd80 pd80Var, int i) {
        pd80Var.getClass();
        return o();
    }

    @Override // defpackage.b5d
    public double s() {
        Object objJ = J();
        objJ.getClass();
        return ((Double) objJ).doubleValue();
    }

    @Override // defpackage.b5d
    public boolean t() {
        Object objJ = J();
        objJ.getClass();
        return ((Boolean) objJ).booleanValue();
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return ((idd.b) this).c.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.b5d
    public char u() {
        Object objJ = J();
        objJ.getClass();
        return ((Character) objJ).charValue();
    }

    @Override // defpackage.dma
    public short x(wv20 wv20Var, int i) {
        return p();
    }

    @Override // defpackage.dma
    public Object y(pd80 pd80Var, int i, tae taeVar, Object obj) {
        pd80Var.getClass();
        taeVar.getClass();
        return z(taeVar);
    }
}
