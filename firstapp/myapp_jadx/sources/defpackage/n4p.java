package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.newtork.model.response.DynamicMultiBetBonus;
import com.sportybet.android.instantwin.newtork.model.response.EventListPageDefaultSpecifier;
import com.sportybet.android.instantwin.newtork.model.response.InstantWinType;
import com.sportybet.android.instantwin.newtork.model.response.MarketCategory;
import com.sportybet.android.instantwin.newtork.model.response.MultiBetBonus;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class n4p implements tlo {
    public static volatile n4p M;
    public String D;
    public Double E;
    public EventListPageDefaultSpecifier F;
    public int G;
    public boolean L;
    public final grm a;
    public final nzm b;
    public final jdo c;
    public o4p f;
    public BetBuilderConfig i;
    public double j;
    public double k;
    public BigDecimal l;
    public String m;
    public String n;
    public String o;
    public MultiBetBonus q;
    public DynamicMultiBetBonus r;
    public if30 v;
    public BigDecimal y;
    public BigDecimal z;
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final HashMap<String, o4p> g = new HashMap<>();
    public boolean h = false;
    public final LinkedHashMap p = new LinkedHashMap();
    public int s = 10;
    public String t = null;
    public Pair<String, String> u = new Pair<>("", "");
    public final HashMap w = new HashMap();
    public final HashMap x = new HashMap();
    public final spi A = new spi();
    public boolean B = false;
    public boolean C = false;
    public boolean H = false;
    public boolean I = true;
    public boolean J = false;
    public int K = 0;

    public n4p(nzm nzmVar, grm grmVar, jdo jdoVar) {
        this.b = nzmVar;
        this.j = nzmVar.a().setScale(0, 0).longValue();
        this.k = nzmVar.b().setScale(0, 1).longValue();
        this.l = nzmVar.e();
        this.a = grmVar;
        this.c = jdoVar;
    }

    public final if30 A() {
        if30 if30Var = this.v;
        return if30Var != null ? if30Var : new if30(0);
    }

    public final String B() {
        return !TextUtils.isEmpty((CharSequence) this.u.second) ? (String) this.u.second : "";
    }

    public final String C() {
        return !TextUtils.isEmpty((CharSequence) this.u.first) ? (String) this.u.first : "";
    }

    public final BigDecimal D(String str) {
        return (BigDecimal) this.w.get(str);
    }

    public final o4p E(String str) {
        return this.g.get(str);
    }

    public final boolean F() {
        return TextUtils.equals(c(), "sr:sport:2");
    }

    public final boolean G() {
        return s() || TextUtils.equals(c(), "sr:sport:1-3-1") || TextUtils.equals(c(), "sr:sport:1-3-2");
    }

    public final boolean H() {
        return TextUtils.equals(c(), "sr:sport:3");
    }

    public final void I(String str) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_INSTANT_WIN);
        aVar.a("[remove]key =%s", str);
        spi spiVar = this.A;
        int i = spiVar.h;
        if (i > 2) {
            spiVar.h = i - 1;
        }
        if (!TextUtils.isEmpty((CharSequence) this.u.first) && TextUtils.equals(str, (CharSequence) this.u.first)) {
            this.u = new Pair<>("", "0");
        }
        LinkedHashMap linkedHashMap = this.d;
        if (linkedHashMap.remove(str) != null) {
            this.c.I0(str);
        }
        this.w.remove(str);
        HashMap map = this.x;
        if (!map.isEmpty()) {
            Integer num = null;
            for (Integer num2 : map.keySet()) {
                if (num == null || num2.intValue() > num.intValue()) {
                    num = num2;
                }
            }
            if (num != null) {
                map.remove(num);
            }
        }
        if (linkedHashMap.size() == 0) {
            this.u = new Pair<>("", "0");
            this.z = null;
            map.clear();
            this.y = null;
            return;
        }
        Map.Entry entry = linkedHashMap.isEmpty() ? null : (Map.Entry) linkedHashMap.entrySet().iterator().next();
        if (entry == null) {
            this.u = new Pair<>("", "0");
            return;
        }
        BigDecimal bigDecimalD = D((String) entry.getKey());
        if (bigDecimalD == null) {
            bigDecimalD = new BigDecimal(this.j);
        }
        L(new Pair<>((String) entry.getKey(), bigDecimalD.toPlainString()));
    }

    public final void J(int i, String str) {
        this.e.put(str, Integer.valueOf(i));
    }

    public final void K(int i, String str) {
        this.x.put(Integer.valueOf(i), str);
    }

    public final void L(Pair<String, String> pair) {
        this.u = pair;
        o4p o4pVar = A().c;
        BigDecimal bigDecimal = new BigDecimal(-1);
        if (!TextUtils.isEmpty((CharSequence) this.u.second)) {
            bigDecimal = new BigDecimal((String) this.u.second);
        }
        if (o4pVar != null && TextUtils.equals(o4pVar.a, SimulateBetConsts.BetslipType.SINGLE) && bigDecimal.compareTo(BigDecimal.valueOf(-1L)) != 0) {
            o4pVar.g(bigDecimal);
            if30 if30Var = this.v;
            if (if30Var != null) {
                if30Var.d = pair;
            }
        }
        O(b6y.a((String) pair.second), (String) pair.first);
    }

    public final void M(String str, o4p o4pVar) {
        this.g.put(str, o4pVar);
    }

    public final boolean N() {
        return this.s == this.K;
    }

    public final void O(BigDecimal bigDecimal, String str) {
        this.w.put(str, bigDecimal);
    }

    @Override // defpackage.tlo
    public final double a() {
        return this.j;
    }

    @Override // defpackage.tlo
    public final double b() {
        return this.k;
    }

    @Override // defpackage.tlo
    public final String c() {
        String str = this.m;
        return str == null ? "" : str;
    }

    @Override // defpackage.tlo
    public final void d() {
        this.d.clear();
        this.c.o();
        this.e.clear();
        this.w.clear();
        w();
        this.u = new Pair<>("", "0");
        this.z = null;
        this.x.clear();
        this.y = null;
        this.v = null;
    }

    @Override // defpackage.tlo
    public final void e(boolean z) {
        this.C = z;
    }

    @Override // defpackage.tlo
    public final spi f() {
        return this.A;
    }

    @Override // defpackage.tlo
    public final Double g() {
        return this.E;
    }

    @Override // defpackage.tlo
    public final int h() {
        return this.d.size();
    }

    @Override // defpackage.tlo
    public final BigDecimal i() {
        return this.l;
    }

    @Override // defpackage.tlo
    public final void j() {
        this.y = null;
    }

    @Override // defpackage.tlo
    public final boolean k() {
        return this.C;
    }

    @Override // defpackage.tlo
    public final MultiBetBonus l() {
        return this.q;
    }

    @Override // defpackage.tlo
    public final int m() {
        MultiBetBonus multiBetBonus = this.q;
        return multiBetBonus == null ? geo.b : multiBetBonus.maxSelections;
    }

    @Override // defpackage.tlo
    public final boolean n() {
        return this.B;
    }

    @Override // defpackage.tlo
    public final BigDecimal o() {
        return this.y;
    }

    @Override // defpackage.tlo
    public final void p(boolean z) {
        this.B = z;
    }

    @Override // defpackage.tlo
    public final BetSlipData q(String str) {
        return (BetSlipData) this.d.get(str);
    }

    @Override // defpackage.tlo
    public final DynamicMultiBetBonus r() {
        return this.r;
    }

    @Override // defpackage.tlo
    public final boolean s() {
        return TextUtils.equals(c(), "sr:sport:1");
    }

    @Override // defpackage.tlo
    public final String t() {
        return this.t;
    }

    @Override // defpackage.tlo
    public final int u() {
        return this.G;
    }

    public final void v(String str, BetSlipData betSlipData) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_INSTANT_WIN);
        aVar.a("[add]key =".concat(str), new Object[0]);
        LinkedHashMap linkedHashMap = this.d;
        if (linkedHashMap.put(str, betSlipData) == null) {
            this.c.O(str);
        }
        spi spiVar = this.A;
        if (spiVar.h < linkedHashMap.size() - 1) {
            spiVar.h++;
        }
        if (F()) {
            O(this.a.a(), str);
        } else {
            O(new BigDecimal(this.b.j()), str);
        }
    }

    public final void w() {
        this.g.clear();
    }

    public final void x(o4p o4pVar) {
        LinkedHashMap linkedHashMap = this.d;
        if (linkedHashMap.size() == 0) {
            this.v = new if30(0);
            return;
        }
        BigDecimal bigDecimal = new BigDecimal(this.b.j());
        BigDecimal bigDecimalA = this.a.a();
        if (F() && bigDecimalA.compareTo(BigDecimal.ZERO) > 0) {
            bigDecimal = bigDecimalA;
        }
        if (o4pVar == null) {
            o4pVar = sqo.a(SimulateBetConsts.BetslipType.MULTIPLE, this.t, bigDecimal, linkedHashMap.values(), this);
        }
        if (o4pVar == null) {
            o4pVar = sqo.a(SimulateBetConsts.BetslipType.SINGLE, this.t, bigDecimal, linkedHashMap.values(), this);
        }
        Map.Entry<String, BetSlipData> entry = linkedHashMap.isEmpty() ? null : (Map.Entry) linkedHashMap.entrySet().iterator().next();
        int size = linkedHashMap.size();
        Pair<String, String> pair = this.u;
        if30 if30Var = new if30();
        if30Var.a = entry;
        if30Var.b = size;
        if30Var.c = o4pVar;
        if30Var.d = pair;
        this.v = if30Var;
    }

    public final String y(int i) {
        return (String) this.x.get(Integer.valueOf(i));
    }

    public final List<MarketCategory> z(String str) {
        List<MarketCategory> list = (List) this.p.get(str);
        if (list != null && list.size() > 0) {
            return list;
        }
        List<String> list2 = uru.a;
        ArrayList arrayList = new ArrayList();
        List<String> list3 = uru.a;
        ArrayList arrayList2 = new ArrayList(l48.r(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(new InstantWinType((String) it.next()));
        }
        arrayList.add(new MarketCategory("all", "All", arrayList2));
        return arrayList;
    }
}
