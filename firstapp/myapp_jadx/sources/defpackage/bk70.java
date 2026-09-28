package defpackage;

import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class bk70 {
    public final uqm a;
    public final nzm b;
    public final jpk c;
    public final String d;
    public final wwd0 e;
    public final wwd0 f;
    public final wwd0 g;

    public bk70(uqm uqmVar, nzm nzmVar, jpk jpkVar, hn9 hn9Var) {
        this.a = uqmVar;
        this.b = nzmVar;
        this.c = jpkVar;
        bz3 bz3Var = bz3.SINGLE;
        this.d = SimulateBetConsts.BetslipType.SINGLE;
        this.e = xwd0.a(ft90.f);
        this.f = xwd0.a(et90.h);
        String strJ = nzmVar.j();
        strJ.getClass();
        this.g = xwd0.a(strJ);
    }

    public final void a(zrd0 zrd0Var) {
        Object value;
        Object value2;
        ft90 ft90Var;
        LinkedHashMap linkedHashMap;
        Object value3;
        Object value4;
        ft90 ft90Var2;
        Map<String, String> mapI;
        boolean z = zrd0Var instanceof zrd0.b;
        wwd0 wwd0Var = this.e;
        wwd0 wwd0Var2 = this.g;
        if (z) {
            do {
                value3 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value3, ""));
            do {
                value4 = wwd0Var.getValue();
                ft90Var2 = (ft90) value4;
                String str = ((zrd0.b) zrd0Var).a;
                mapI = ft90Var2.b;
                if (mapI.containsKey(str)) {
                    mapI = kpu.i(mapI, new Pair(str, ""));
                }
            } while (!wwd0Var.g(value4, ft90.a(ft90Var2, mapI)));
            return;
        }
        if (!(zrd0Var instanceof zrd0.a)) {
            uhc.a();
            return;
        }
        do {
            value = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value, ""));
        do {
            value2 = wwd0Var.getValue();
            ft90Var = (ft90) value2;
            Map<String, String> map = ft90Var.b;
            linkedHashMap = new LinkedHashMap(jpu.a(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(((Map.Entry) it.next()).getKey(), "");
            }
        } while (!wwd0Var.g(value2, ft90.a(ft90Var, linkedHashMap)));
    }

    public final void b(zrd0 zrd0Var, boolean z) {
        BigDecimal bigDecimalG;
        if (z) {
            if (zrd0Var instanceof zrd0.b) {
                String str = ((ft90) this.e.getValue()).b.get(((zrd0.b) zrd0Var).a);
                bigDecimalG = str != null ? b.g(str) : null;
            } else {
                if (!(zrd0Var instanceof zrd0.a)) {
                    uhc.a();
                    return;
                }
                bigDecimalG = b.g((String) this.g.getValue());
            }
            if (bigDecimalG == null) {
                return;
            }
            this.a.setCustomDefaultStake(bigDecimalG);
        }
    }

    public final void c(zrd0 zrd0Var) {
        Object value;
        Object value2;
        ft90 ft90Var;
        LinkedHashMap linkedHashMap;
        Object value3;
        Object value4;
        ft90 ft90VarA;
        boolean z = zrd0Var instanceof zrd0.b;
        wwd0 wwd0Var = this.g;
        wwd0 wwd0Var2 = this.e;
        if (!z) {
            if (!(zrd0Var instanceof zrd0.a)) {
                uhc.a();
                return;
            }
            String strE = wae0.E((String) wwd0Var.getValue());
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, strE));
            do {
                value2 = wwd0Var2.getValue();
                ft90Var = (ft90) value2;
                Map<String, String> map = ft90Var.b;
                linkedHashMap = new LinkedHashMap(jpu.a(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(((Map.Entry) it.next()).getKey(), strE);
                }
            } while (!wwd0Var2.g(value2, ft90.a(ft90Var, linkedHashMap)));
            return;
        }
        String str = ((zrd0.b) zrd0Var).a;
        ft90 ft90Var2 = (ft90) wwd0Var2.getValue();
        List<cz2> list = ft90Var2.a;
        String str2 = ft90Var2.b.get(str);
        if (str2 == null) {
            return;
        }
        String strE2 = wae0.E(str2);
        String str3 = list.size() > 1 ? "" : strE2;
        do {
            value3 = wwd0Var.getValue();
        } while (!wwd0Var.g(value3, str3));
        do {
            value4 = wwd0Var2.getValue();
            ft90VarA = (ft90) value4;
            if (ft90VarA.b.containsKey(str)) {
                ft90VarA = ft90.a(ft90VarA, kpu.i(ft90VarA.b, new Pair(str, strE2)));
            }
        } while (!wwd0Var2.g(value4, ft90VarA));
    }

    public final void d(zrd0 zrd0Var, BigDecimal bigDecimal) {
        Object value;
        Object value2;
        ft90 ft90Var;
        LinkedHashMap linkedHashMap;
        Object value3;
        Object value4;
        ft90 ft90VarA;
        boolean z = zrd0Var instanceof zrd0.b;
        wwd0 wwd0Var = this.g;
        wwd0 wwd0Var2 = this.e;
        if (!z) {
            if (!(zrd0Var instanceof zrd0.a)) {
                uhc.a();
                return;
            }
            BigDecimal bigDecimalG = b.g((String) wwd0Var.getValue());
            if (bigDecimalG == null) {
                bigDecimalG = BigDecimal.ZERO;
            }
            String strC = b6y.c(bigDecimalG.add(bigDecimal));
            strC.getClass();
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, strC));
            do {
                value2 = wwd0Var2.getValue();
                ft90Var = (ft90) value2;
                Map<String, String> map = ft90Var.b;
                linkedHashMap = new LinkedHashMap(jpu.a(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(((Map.Entry) it.next()).getKey(), strC);
                }
            } while (!wwd0Var2.g(value2, ft90.a(ft90Var, linkedHashMap)));
            return;
        }
        String str = ((zrd0.b) zrd0Var).a;
        ft90 ft90Var2 = (ft90) wwd0Var2.getValue();
        List<cz2> list = ft90Var2.a;
        String str2 = ft90Var2.b.get(str);
        if (str2 == null) {
            return;
        }
        BigDecimal bigDecimalG2 = b.g(str2);
        if (bigDecimalG2 == null) {
            bigDecimalG2 = BigDecimal.ZERO;
        }
        String strC2 = b6y.c(bigDecimalG2.add(bigDecimal));
        strC2.getClass();
        String str3 = list.size() > 1 ? "" : strC2;
        do {
            value3 = wwd0Var.getValue();
        } while (!wwd0Var.g(value3, str3));
        do {
            value4 = wwd0Var2.getValue();
            ft90VarA = (ft90) value4;
            if (ft90VarA.b.containsKey(str)) {
                ft90VarA = ft90.a(ft90VarA, kpu.i(ft90VarA.b, new Pair(str, strC2)));
            }
        } while (!wwd0Var2.g(value4, ft90VarA));
    }

    public final void e(zrd0 zrd0Var, String str) {
        Object value;
        Object value2;
        ft90 ft90Var;
        LinkedHashMap linkedHashMap;
        Object value3;
        Object value4;
        ft90 ft90VarA;
        boolean z = zrd0Var instanceof zrd0.b;
        wwd0 wwd0Var = this.g;
        wwd0 wwd0Var2 = this.e;
        if (!z) {
            if (!(zrd0Var instanceof zrd0.a)) {
                uhc.a();
                return;
            }
            String strA = kn5.a((String) wwd0Var.getValue(), str);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, strA));
            do {
                value2 = wwd0Var2.getValue();
                ft90Var = (ft90) value2;
                Map<String, String> map = ft90Var.b;
                linkedHashMap = new LinkedHashMap(jpu.a(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(((Map.Entry) it.next()).getKey(), strA);
                }
            } while (!wwd0Var2.g(value2, ft90.a(ft90Var, linkedHashMap)));
            return;
        }
        String str2 = ((zrd0.b) zrd0Var).a;
        ft90 ft90Var2 = (ft90) wwd0Var2.getValue();
        List<cz2> list = ft90Var2.a;
        String str3 = ft90Var2.b.get(str2);
        if (str3 == null) {
            return;
        }
        String strA2 = kn5.a(str3, str);
        String str4 = list.size() > 1 ? "" : strA2;
        do {
            value3 = wwd0Var.getValue();
        } while (!wwd0Var.g(value3, str4));
        do {
            value4 = wwd0Var2.getValue();
            ft90VarA = (ft90) value4;
            Map<String, String> map2 = ft90VarA.b;
            if (map2.containsKey(str2)) {
                ft90VarA = ft90.a(ft90VarA, kpu.i(map2, new Pair(str2, strA2)));
            }
        } while (!wwd0Var2.g(value4, ft90VarA));
    }
}
