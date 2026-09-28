package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.gift.BonusResponse;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.sim.SimShareData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONException;
import org.json.JSONObject;
import p78.a;

/* JADX INFO: loaded from: classes2.dex */
public final class ow2 implements krm {
    public final m730<jrm> a;
    public final m730<lrm> b;
    public final nzm c;
    public final ConcurrentHashMap<Event, HashSet<lw2.a>> d;
    public final ConcurrentHashMap<Event, HashSet<lw2.a>> e;
    public final HashSet f;
    public volatile List<? extends lw2.a> g;
    public final HashMap h;
    public volatile ArrayList i;
    public volatile ArrayList j;
    public ArrayList k;
    public volatile List<? extends BigDecimal> l;
    public volatile List<? extends BigDecimal> m;
    public volatile BigDecimal n;
    public volatile BigDecimal o;
    public volatile int p;
    public BigDecimal q;
    public BigDecimal r;
    public HashMap s;
    public HashMap t;
    public final LinkedList<Integer> u;
    public int v;
    public int w;
    public int x;
    public final HashMap y;
    public final mpe0 z;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements gv5<BaseResponse<BonusResponse>> {
        public a() {
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<BonusResponse>> su5Var, Throwable th) {
            th.getClass();
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<BonusResponse>> su5Var, bi50<BaseResponse<BonusResponse>> bi50Var) {
            BaseResponse<BonusResponse> baseResponse;
            final BonusResponse bonusResponse;
            if (!bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null || (bonusResponse = baseResponse.data) == null) {
                return;
            }
            final ow2 ow2Var = ow2.this;
            rs1.a(new Runnable() { // from class: nw2
                @Override // java.lang.Runnable
                public final void run() {
                    String json = sh8.b().toJson(bonusResponse);
                    json.getClass();
                    ow2Var.R(json);
                }
            });
        }
    }

    public ow2(m730<jrm> m730Var, m730<lrm> m730Var2, nzm nzmVar) {
        m730Var.getClass();
        m730Var2.getClass();
        nzmVar.getClass();
        this.a = m730Var;
        this.b = m730Var2;
        this.c = nzmVar;
        this.d = new ConcurrentHashMap<>();
        this.e = new ConcurrentHashMap<>();
        this.f = new HashSet();
        this.g = m2g.a;
        this.h = new HashMap();
        LinkedList<Integer> linkedList = new LinkedList<>();
        this.u = linkedList;
        this.y = new HashMap();
        this.z = hwr.b(new mw2(0));
        linkedList.add(Integer.valueOf(Color.parseColor("#ccefff")));
        linkedList.add(Integer.valueOf(Color.parseColor("#faf6e2")));
        linkedList.add(Integer.valueOf(Color.parseColor("#ffd9bf")));
        linkedList.add(Integer.valueOf(Color.parseColor("#c6ece3")));
        linkedList.add(Integer.valueOf(Color.parseColor("#ff93a8")));
        linkedList.add(Integer.valueOf(Color.parseColor("#ffebbc")));
        linkedList.add(Integer.valueOf(Color.parseColor("#ade1c6")));
        linkedList.add(Integer.valueOf(Color.parseColor("#ffbdca")));
        linkedList.add(Integer.valueOf(Color.parseColor("#d0d2f3")));
        linkedList.add(Integer.valueOf(Color.parseColor("#f3dafb")));
        linkedList.add(Integer.valueOf(Color.parseColor("#b2d2f7")));
        linkedList.add(Integer.valueOf(Color.parseColor("#c1f7fd")));
        linkedList.add(Integer.valueOf(Color.parseColor("#b5f7b6")));
        linkedList.add(Integer.valueOf(Color.parseColor("#e5f8cc")));
        linkedList.add(Integer.valueOf(Color.parseColor("#dcdee5")));
    }

    @Override // defpackage.krm
    public final BigDecimal A() {
        if (!S().J()) {
            return BigDecimal.ONE;
        }
        if (this.o == null) {
            U();
        }
        return this.o;
    }

    @Override // defpackage.krm
    public final void B() {
        ConcurrentHashMap<Event, HashSet<lw2.a>> concurrentHashMap = this.e;
        concurrentHashMap.clear();
        this.v = 0;
        ArrayList arrayListU = a().U();
        int size = arrayListU.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListU.get(i);
            i++;
            Selection selection = (Selection) obj;
            boolean z = selection.i;
            List<Selection> list = selection.d;
            Outcome outcome = selection.c;
            Market market = selection.b;
            Event event = selection.a;
            if (!z || !a().D()) {
                HashSet<lw2.a> hashSet = concurrentHashMap.get(event);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    this.v++;
                }
                if (market.status == 0 && outcome.isActive == 1 && !selection.w) {
                    hashSet.add(new lw2.a(event, market, outcome, list));
                    concurrentHashMap.put(event, hashSet);
                } else {
                    if (hashSet.size() > 1) {
                        hashSet.remove(new lw2.a(event, market, outcome, list));
                        concurrentHashMap.put(event, hashSet);
                        this.v--;
                    } else {
                        concurrentHashMap.remove(event);
                        this.v--;
                    }
                    this.f.remove(event);
                }
            }
        }
        if (P()) {
            this.w = 0;
        }
        W();
        a0();
        Z();
        V();
    }

    @Override // defpackage.krm
    public final int C() {
        int size = 0;
        for (HashSet<lw2.a> hashSet : this.e.values()) {
            hashSet.getClass();
            size += hashSet.size();
        }
        return size;
    }

    @Override // defpackage.krm
    public final int D() {
        return this.f.size();
    }

    @Override // defpackage.krm
    public final Map<Event, HashSet<lw2.a>> E() {
        return this.d;
    }

    @Override // defpackage.krm
    public final void F() {
        ((h530) this.z.getValue()).b().G(new a());
    }

    @Override // defpackage.krm
    public final List<lw2.a> G() {
        if (!S().J()) {
            return new ArrayList();
        }
        if (this.o == null) {
            U();
        }
        return this.g;
    }

    @Override // defpackage.krm
    public final void H(Event event, Market market, Outcome outcome, List<Selection> list) {
        if (event == null) {
            return;
        }
        ConcurrentHashMap<Event, HashSet<lw2.a>> concurrentHashMap = this.d;
        HashSet<lw2.a> hashSet = concurrentHashMap.get(event);
        if (hashSet != null) {
            if (hashSet.size() > 1) {
                hashSet.remove(new lw2.a(event, market, outcome, list != null ? CollectionsKt.R(list) : null));
                concurrentHashMap.put(event, hashSet);
            } else {
                concurrentHashMap.remove(event);
                HashMap map = this.h;
                if (map.containsKey(event)) {
                    Integer num = (Integer) map.get(event);
                    if (num != null) {
                        this.u.addFirst(num);
                    }
                    map.remove(event);
                }
            }
        }
        this.f.remove(event);
        B();
    }

    @Override // defpackage.krm
    public final boolean I() {
        boolean z = false;
        this.x = 0;
        BigDecimal bigDecimal = nh4.c().a;
        for (HashSet<lw2.a> hashSet : this.e.values()) {
            hashSet.getClass();
            Iterator<lw2.a> it = hashSet.iterator();
            it.getClass();
            while (it.hasNext()) {
                lw2.a next = it.next();
                next.getClass();
                Outcome outcome = next.c;
                if (outcome != null && new BigDecimal(outcome.odds).compareTo(bigDecimal) >= 0) {
                    this.x++;
                    break;
                }
            }
            if (this.x >= nh4.c().d) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.krm
    public final lw2.b J(boolean z, egy egyVar) {
        BigDecimal bigDecimal;
        ConcurrentHashMap concurrentHashMapB = S().B();
        if (concurrentHashMapB.size() == 0) {
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            return new lw2.b(bigDecimal2, bigDecimal2);
        }
        HashMap map = new HashMap();
        ArrayList arrayListU = a().U();
        int size = arrayListU.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Selection selection = (Selection) arrayListU.get(i);
            for (Map.Entry entry : concurrentHashMapB.entrySet()) {
                boolean zB = qz3.b(selection);
                Outcome outcome = selection.c;
                if (zB && Intrinsics.g(entry.getKey(), selection) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    String strP = (String) entry.getValue();
                    if (strP == null) {
                        strP = "";
                    }
                    if (StringsKt.M(strP, ",", false)) {
                        strP = c.p(strP, ",", ".", false);
                    }
                    try {
                        bigDecimal = new BigDecimal(String.valueOf(Double.parseDouble(strP)));
                    } catch (Throwable th) {
                        itf0.a.m(th);
                        bigDecimal = BigDecimal.ZERO;
                        bigDecimal.getClass();
                    }
                    Boolean bool = (Boolean) a().l1().get(entry.getKey());
                    Boolean bool2 = (Boolean) a().A0().get(entry.getKey());
                    lw2.b bVar = new lw2.b(bigDecimal, (!(z && bool != null && bool.booleanValue()) && (bool2 == null || !bool2.booleanValue())) ? new BigDecimal(outcome.odds).multiply(bigDecimal) : new BigDecimal(outcome.odds).multiply(bigDecimal).multiply(egyVar.a(selection)));
                    lw2.c cVar = new lw2.c(selection.a, selection.b);
                    lw2.b bVar2 = (lw2.b) map.get(cVar);
                    if (bVar2 == null) {
                        map.put(cVar, bVar);
                    } else if (bVar2.b.compareTo(bVar.b) > 0) {
                        map.put(cVar, bVar);
                    }
                }
            }
            i = i2;
        }
        lw2.b bVar3 = new lw2.b(BigDecimal.ZERO, this.c.e());
        for (lw2.b bVar4 : map.values()) {
            if (bVar4.b.compareTo(bVar3.b) < 0) {
                bVar3 = bVar4;
            }
        }
        return bVar3;
    }

    @Override // defpackage.krm
    public final boolean K(Event event) {
        if (event == null) {
            return false;
        }
        return this.f.contains(event);
    }

    @Override // defpackage.krm
    public final boolean L(boolean z) {
        return z ? v() : P();
    }

    @Override // defpackage.krm
    public final BigDecimal M() {
        if (this.r == null) {
            W();
        }
        BigDecimal bigDecimal = this.r;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        bigDecimal2.getClass();
        return bigDecimal2;
    }

    @Override // defpackage.krm
    public final double N(int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListU = a().U();
        int size = arrayListU.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListU.get(i2);
            i2++;
            Selection selection = (Selection) obj;
            if (selection.b.status == 0) {
                Outcome outcome = selection.c;
                if (outcome.isActive == 1) {
                    arrayList.add(Double.valueOf(outcome.probability));
                }
            }
        }
        int size2 = arrayList.size();
        double d = 0.0d;
        int i3 = i;
        if (i3 <= size2) {
            while (true) {
                ArrayList arrayList2 = new ArrayList();
                k(arrayList2, i3, size2);
                int size3 = arrayList2.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    List list = (List) obj2;
                    ArrayList arrayList3 = new ArrayList();
                    for (int i5 = 0; i5 < size2; i5++) {
                        if (!list.contains(Integer.valueOf(i5))) {
                            arrayList3.add(Integer.valueOf(i5));
                        }
                    }
                    Iterator it = list.iterator();
                    double dDoubleValue = 1.0d;
                    while (it.hasNext()) {
                        dDoubleValue *= ((Number) arrayList.get(((Number) it.next()).intValue())).doubleValue();
                    }
                    int size4 = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size4) {
                        Object obj3 = arrayList3.get(i6);
                        i6++;
                        dDoubleValue *= 1.0d - ((Number) arrayList.get(((Number) obj3).intValue())).doubleValue();
                    }
                    d += dDoubleValue;
                }
                if (i3 == size2) {
                    break;
                }
                i3++;
            }
        }
        return d;
    }

    @Override // defpackage.krm
    public final void O(boolean z) {
        int i = this.w;
        if (z) {
            this.w = i + 1;
        } else {
            this.w = i - 1;
        }
    }

    @Override // defpackage.krm
    public final boolean P() {
        Collection<HashSet<lw2.a>> collectionValues = this.d.values();
        collectionValues.getClass();
        Collection<HashSet<lw2.a>> collection = collectionValues;
        if (collection.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            HashSet hashSet = (HashSet) it.next();
            if (hashSet != null && hashSet.size() > 1) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.krm
    public final long Q(int i) {
        ConcurrentHashMap<Event, HashSet<lw2.a>> concurrentHashMap = this.e;
        int size = concurrentHashMap.size();
        long j = 0;
        if (size < i) {
            return 0L;
        }
        HashSet hashSet = this.f;
        int size2 = hashSet.size();
        long size3 = 1;
        if (size2 > 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                HashSet<lw2.a> hashSet2 = concurrentHashMap.get((Event) it.next());
                if (hashSet2 != null) {
                    size3 *= (long) hashSet2.size();
                }
            }
            return q78.a(size - size2, i - size2) * size3;
        }
        int[] iArr = new int[size];
        int i2 = 0;
        for (Map.Entry<Event, HashSet<lw2.a>> entry : concurrentHashMap.entrySet()) {
            entry.getClass();
            iArr[i2] = entry.getValue().size();
            i2++;
        }
        p78.a aVar = new p78(size, i).new a();
        while (aVar.a) {
            long j2 = 1;
            for (int i3 : (int[]) aVar.next()) {
                j2 *= (long) iArr[i3];
            }
            j += j2;
        }
        return j;
    }

    @Override // defpackage.krm
    public final void R(String str) {
        str.getClass();
        try {
            vn20.a("BonusConfig").edit().putString("bonus", str).apply();
            nh4.c().f(str);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CONFIG);
            aVar.g("save bonus: %s", new JSONObject(str).toString(4));
        } catch (JSONException e) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_CONFIG);
            aVar2.f(e, "saveBonus error", new Object[0]);
        }
    }

    public final lrm S() {
        lrm lrmVar = this.b.get();
        lrmVar.getClass();
        return lrmVar;
    }

    public final BigDecimal T(lw2.a aVar, egy egyVar) {
        Outcome outcome = aVar.c;
        try {
            BigDecimal bigDecimal = new BigDecimal(outcome.odds);
            Selection selection = new Selection(aVar.a, aVar.b, outcome, aVar.d);
            if (!Boolean.TRUE.equals(a().A0().get(selection))) {
                return bigDecimal;
            }
            try {
                BigDecimal bigDecimalA = egyVar.a(selection);
                BigDecimal bigDecimalMultiply = (bigDecimalA == null || bigDecimalA.compareTo(BigDecimal.ZERO) <= 0) ? bigDecimal : bigDecimal.multiply(bigDecimalA);
                bigDecimalMultiply.getClass();
                return bigDecimalMultiply;
            } catch (Throwable th) {
                itf0.a.m(th);
                return bigDecimal;
            }
        } catch (Throwable th2) {
            itf0.a.m(th2);
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            bigDecimal2.getClass();
            return bigDecimal2;
        }
    }

    public final void U() {
        this.g = m2g.a;
        if (this.m == null) {
            this.m = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        BigDecimal bigDecimalMultiply = BigDecimal.ONE;
        int i = 0;
        for (Map.Entry<Event, HashSet<lw2.a>> entry : this.e.entrySet()) {
            entry.getClass();
            Map.Entry<Event, HashSet<lw2.a>> entry2 = entry;
            Event key = entry2.getKey();
            key.getClass();
            if (this.f.contains(key)) {
                lw2.a aVar = (lw2.a) Collections.max(entry2.getValue());
                BigDecimal bigDecimal = new BigDecimal(aVar.c.odds);
                bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal);
                arrayList2.add(aVar);
                if (bigDecimal.compareTo(nh4.c().a) >= 0) {
                    i++;
                }
            } else {
                BigDecimal bigDecimalAdd = BigDecimal.ZERO;
                Iterator<lw2.a> it = entry2.getValue().iterator();
                it.getClass();
                while (it.hasNext()) {
                    lw2.a next = it.next();
                    next.getClass();
                    bigDecimalAdd = bigDecimalAdd.add(new BigDecimal(next.c.odds));
                }
                arrayList.add(bigDecimalAdd);
            }
        }
        this.m = arrayList;
        this.o = bigDecimalMultiply;
        this.g = arrayList2;
        this.p = i;
    }

    public final void V() {
        HashMap map = this.t;
        if (map == null) {
            return;
        }
        List<ln7> listU = S().U();
        HashSet hashSet = new HashSet();
        for (String str : map.keySet()) {
            if (!listU.contains(new ln7(0, str))) {
                hashSet.add(str);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }

    public final void W() {
        BigDecimal bigDecimalMultiply = BigDecimal.ONE;
        ArrayList arrayList = new ArrayList();
        for (HashSet<lw2.a> hashSet : this.e.values()) {
            hashSet.getClass();
            BigDecimal bigDecimalAdd = BigDecimal.ZERO;
            Iterator<lw2.a> it = hashSet.iterator();
            it.getClass();
            while (it.hasNext()) {
                lw2.a next = it.next();
                next.getClass();
                bigDecimalAdd = bigDecimalAdd.add(new BigDecimal(next.c.odds));
            }
            bigDecimalAdd.getClass();
            arrayList.add(bigDecimalAdd);
        }
        this.i = arrayList;
        ArrayList arrayList2 = this.i;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            bigDecimalMultiply = BigDecimal.ZERO;
        } else {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                bigDecimalMultiply = bigDecimalMultiply.multiply((BigDecimal) obj);
            }
        }
        this.r = bigDecimalMultiply;
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        for (HashSet<lw2.a> hashSet : this.e.values()) {
            hashSet.getClass();
            HashSet<lw2.a> hashSet2 = hashSet;
            if (!hashSet2.isEmpty()) {
                arrayList.add(new BigDecimal(((lw2.a) Collections.min(hashSet2)).c.odds));
            }
        }
        this.j = arrayList;
    }

    public final void Y() {
        if (this.l == null) {
            this.l = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList();
        BigDecimal bigDecimalMultiply = BigDecimal.ONE;
        for (Map.Entry<Event, HashSet<lw2.a>> entry : this.e.entrySet()) {
            entry.getClass();
            Map.Entry<Event, HashSet<lw2.a>> entry2 = entry;
            if (this.f.contains(entry2.getKey())) {
                bigDecimalMultiply = bigDecimalMultiply.multiply(new BigDecimal(((lw2.a) Collections.min(entry2.getValue())).c.odds));
            } else {
                arrayList.add(new BigDecimal(((lw2.a) Collections.min(entry2.getValue())).c.odds));
            }
        }
        this.l = arrayList;
        this.n = bigDecimalMultiply;
    }

    public final void Z() {
        HashMap map = this.s;
        if (map == null) {
            return;
        }
        List<ln7> listU = S().U();
        HashSet hashSet = new HashSet();
        for (String str : map.keySet()) {
            if (!listU.contains(new ln7(0, str))) {
                hashSet.add(str);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }

    public final jrm a() {
        jrm jrmVar = this.a.get();
        jrmVar.getClass();
        return jrmVar;
    }

    public final void a0() {
        BigDecimal bigDecimalMultiply = BigDecimal.ONE;
        X();
        ArrayList arrayList = this.j;
        if (arrayList == null || arrayList.size() <= 0) {
            bigDecimalMultiply = BigDecimal.ZERO;
        } else {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                bigDecimalMultiply = bigDecimalMultiply.multiply((BigDecimal) obj);
            }
        }
        this.q = bigDecimalMultiply;
    }

    @Override // defpackage.krm
    public final mr4 b() {
        int minOddsCount;
        BigDecimal simOddsLimit;
        boolean zM0 = a().m0();
        if (zM0) {
            SimShareData simShareData = SimShareData.INSTANCE;
            minOddsCount = simShareData.getMinOddsCount();
            simOddsLimit = simShareData.getSimOddsLimit();
        } else {
            minOddsCount = nh4.c().d;
            simOddsLimit = nh4.c().a;
            simOddsLimit.getClass();
        }
        ConcurrentHashMap<Event, HashSet<lw2.a>> concurrentHashMap = this.e;
        concurrentHashMap.size();
        int length = 0;
        this.x = 0;
        boolean z = false;
        for (HashSet<lw2.a> hashSet : concurrentHashMap.values()) {
            hashSet.getClass();
            Iterator<lw2.a> it = hashSet.iterator();
            it.getClass();
            while (it.hasNext()) {
                lw2.a next = it.next();
                next.getClass();
                Outcome outcome = next.c;
                if (outcome != null && new BigDecimal(outcome.odds).compareTo(simOddsLimit) >= 0) {
                    this.x++;
                    break;
                }
            }
            if (this.x >= minOddsCount) {
                z = true;
            }
        }
        if (zM0) {
            int i = this.x;
            SimShareData simShareData2 = SimShareData.INSTANCE;
            int minOddsCount2 = i - simShareData2.getMinOddsCount();
            int size = simShareData2.getMultiBetBonusRatio().size();
            if (minOddsCount2 >= 0) {
                length = minOddsCount2 > size ? size : minOddsCount2 + 1;
            }
        } else {
            nh4 nh4VarC = nh4.c();
            int i2 = this.x - nh4VarC.d;
            if (i2 >= 0) {
                BigDecimal[] bigDecimalArr = nh4VarC.f;
                length = i2 > bigDecimalArr.length ? bigDecimalArr.length : i2 + 1;
            }
        }
        int i3 = this.x;
        mr4 mr4Var = new mr4();
        mr4Var.a = z;
        mr4Var.b = i3;
        mr4Var.c = length;
        return mr4Var;
    }

    @Override // defpackage.krm
    public final List<BigDecimal> c() {
        ArrayList arrayList = this.k;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.k = arrayList;
        }
        arrayList.clear();
        for (HashSet<lw2.a> hashSet : this.e.values()) {
            hashSet.getClass();
            HashMap map = new HashMap();
            Iterator<lw2.a> it = hashSet.iterator();
            it.getClass();
            while (it.hasNext()) {
                lw2.a next = it.next();
                next.getClass();
                lw2.a aVar = next;
                Market market = aVar.b;
                Outcome outcome = aVar.c;
                Outcome outcome2 = (Outcome) map.get(market);
                if (outcome2 == null) {
                    map.put(market, outcome);
                } else if (outcome.compareTo(outcome2) > 0) {
                    map.put(market, outcome);
                }
            }
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(new BigDecimal(((Outcome) ((Map.Entry) it2.next()).getValue()).odds));
            }
        }
        if (arrayList.isEmpty()) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            bigDecimal.getClass();
            arrayList.add(bigDecimal);
        }
        return arrayList;
    }

    @Override // defpackage.krm
    public final void clear() {
        this.d.clear();
        this.e.clear();
        this.v = 0;
        this.w = 0;
        this.f.clear();
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            this.u.addFirst(Integer.valueOf(((Number) it.next()).intValue()));
        }
        this.h.clear();
        m2g m2gVar = m2g.a;
        this.g = m2gVar;
        this.l = this.l != null ? m2gVar : null;
        if (this.m == null) {
            m2gVar = null;
        }
        this.m = m2gVar;
        this.n = null;
        this.o = null;
        this.r = null;
        this.q = null;
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.i;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.j;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        HashMap map = this.s;
        if (map != null) {
            map.clear();
        }
        HashMap map2 = this.t;
        if (map2 != null) {
            map2.clear();
        }
    }

    @Override // defpackage.krm
    public final void d() {
        this.f.clear();
        Y();
        U();
    }

    @Override // defpackage.krm
    public final BigDecimal e(egy egyVar) {
        ConcurrentHashMap<Event, HashSet<lw2.a>> concurrentHashMap = this.e;
        if (concurrentHashMap.isEmpty()) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            bigDecimal.getClass();
            return bigDecimal;
        }
        BigDecimal bigDecimalMultiply = BigDecimal.ONE;
        boolean z = false;
        for (HashSet<lw2.a> hashSet : concurrentHashMap.values()) {
            hashSet.getClass();
            HashSet<lw2.a> hashSet2 = hashSet;
            if (!hashSet2.isEmpty()) {
                Iterator<lw2.a> it = hashSet2.iterator();
                it.getClass();
                BigDecimal bigDecimal2 = null;
                while (it.hasNext()) {
                    lw2.a next = it.next();
                    next.getClass();
                    lw2.a aVar = next;
                    Outcome outcome = aVar.c;
                    if (outcome != null && outcome.odds != null) {
                        BigDecimal bigDecimalT = T(aVar, egyVar);
                        if (bigDecimal2 == null || bigDecimalT.compareTo(bigDecimal2) < 0) {
                            bigDecimal2 = bigDecimalT;
                        }
                    }
                }
                if (bigDecimal2 != null) {
                    bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal2);
                    z = true;
                }
            }
        }
        if (z) {
            bigDecimalMultiply.getClass();
            return bigDecimalMultiply;
        }
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        bigDecimal3.getClass();
        return bigDecimal3;
    }

    @Override // defpackage.krm
    public final lw2.b f(boolean z, BigDecimal bigDecimal, egy egyVar) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimalMultiply;
        ConcurrentHashMap concurrentHashMapB = S().B();
        HashMap map = new HashMap();
        ArrayList arrayListU = a().U();
        int size = arrayListU.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Selection selection = (Selection) arrayListU.get(i);
            for (Map.Entry entry : concurrentHashMapB.entrySet()) {
                boolean zB = qz3.b(selection);
                Outcome outcome = selection.c;
                if (zB && Intrinsics.g(entry.getKey(), selection) && bigDecimal != null && new BigDecimal(outcome.odds).compareTo(bigDecimal) >= 0 && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    try {
                        bigDecimal2 = new BigDecimal((String) entry.getValue());
                    } catch (Throwable th) {
                        itf0.a.m(th);
                        bigDecimal2 = BigDecimal.ZERO;
                        bigDecimal2.getClass();
                    }
                    boolean z2 = a().l1().containsKey(entry.getKey()) && Boolean.TRUE.equals(a().l1().get(entry.getKey()));
                    boolean z3 = a().A0().containsKey(entry.getKey()) && Boolean.TRUE.equals(a().A0().get(entry.getKey()));
                    if ((z && z2) || z3) {
                        bigDecimalMultiply = new BigDecimal(outcome.odds).multiply(bigDecimal2).multiply(egyVar.a(selection));
                        bigDecimalMultiply.getClass();
                    } else {
                        bigDecimalMultiply = new BigDecimal(outcome.odds).multiply(bigDecimal2);
                        bigDecimalMultiply.getClass();
                    }
                    lw2.b bVar = new lw2.b(bigDecimal2, bigDecimalMultiply);
                    lw2.c cVar = new lw2.c(selection.a, selection.b);
                    lw2.b bVar2 = (lw2.b) map.get(cVar);
                    if (bVar2 == null) {
                        map.put(cVar, bVar);
                    } else if (bVar2.b.compareTo(bVar.b) < 0) {
                        map.put(cVar, bVar);
                    }
                }
            }
            i = i2;
        }
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        lw2.b bVar3 = new lw2.b(bigDecimal3, bigDecimal3);
        for (lw2.b bVar4 : map.values()) {
            bVar3.b = bVar3.b.add(bVar4.b);
            bVar3.a = bVar3.a.add(bVar4.a);
        }
        return bVar3;
    }

    @Override // defpackage.krm
    public final List<lw2.a> g(List<Selection> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Selection selection : list) {
                if (selection != null) {
                    arrayList.add(new lw2.a(selection.a, selection.b, selection.c, selection.d));
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.krm
    public final void h(Event event, Market market, Outcome outcome, List<Selection> list) {
        if (event == null) {
            return;
        }
        ConcurrentHashMap<Event, HashSet<lw2.a>> concurrentHashMap = this.d;
        HashSet<lw2.a> hashSet = concurrentHashMap.get(event);
        if (hashSet == null) {
            hashSet = new HashSet<>();
        }
        hashSet.add(new lw2.a(event, market, outcome, list != null ? CollectionsKt.R(list) : null));
        concurrentHashMap.put(event, hashSet);
        HashSet<lw2.a> hashSet2 = concurrentHashMap.get(event);
        if (hashSet2 != null && hashSet2.size() > 1) {
            HashMap map = this.h;
            if (!map.containsKey(event)) {
                LinkedList<Integer> linkedList = this.u;
                if (linkedList.size() > 0) {
                    map.put(event, linkedList.remove(0));
                }
            }
        }
        B();
        U();
        Y();
    }

    @Override // defpackage.krm
    public final void i(Event event, boolean z) {
        if (event == null) {
            return;
        }
        HashSet hashSet = this.f;
        if (z) {
            hashSet.add(event);
        } else {
            hashSet.remove(event);
        }
        Y();
        U();
    }

    @Override // defpackage.krm
    public final BigDecimal j() {
        if (this.q == null) {
            a0();
        }
        BigDecimal bigDecimal = this.q;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        bigDecimal2.getClass();
        return bigDecimal2;
    }

    @Override // defpackage.krm
    public final Map<String, BigDecimal> l() {
        HashMap map = this.t;
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        this.t = map2;
        return map2;
    }

    @Override // defpackage.krm
    public final void m() {
        imn imnVar;
        S().d();
        HashMap map = this.s;
        if (map != null) {
            map.clear();
        }
        HashMap map2 = this.t;
        if (map2 != null) {
            map2.clear();
        }
        Y();
        U();
        List<ln7> listU = S().U();
        HashMap mapU = S().u();
        for (ln7 ln7Var : listU) {
            int i = ln7Var.a;
            String str = ln7Var.b;
            imn imnVar2 = (imn) mapU.get(str);
            if (imnVar2 == null) {
                imnVar2 = new imn(0L, "", "");
                S().P(str, imnVar2);
            }
            if (imnVar2.c == 0 && !Intrinsics.g(str, ln7.a())) {
                imnVar2.c = Q(i);
            }
            if (TextUtils.isEmpty(imnVar2.a) && (imnVar = (imn) mapU.get(ln7.a())) != null && !TextUtils.isEmpty(imnVar.a) && TextUtils.isEmpty(imnVar.b)) {
                imnVar2.a = imnVar.a;
            }
            int size = i - this.f.size();
            if (!Intrinsics.g(str, ln7.a())) {
                z(size, str, imnVar2.a);
            }
        }
    }

    @Override // defpackage.krm
    public final List<BigDecimal> n() {
        if (this.j == null) {
            X();
        }
        ArrayList arrayList = this.j;
        arrayList.getClass();
        return arrayList;
    }

    @Override // defpackage.krm
    public final void o(List<? extends Selection> list) {
        list.getClass();
        for (Selection selection : list) {
            h(selection.a, selection.b, selection.c, selection.d);
        }
    }

    @Override // defpackage.krm
    public final BigDecimal p(egy egyVar) {
        ConcurrentHashMap<Event, HashSet<lw2.a>> concurrentHashMap = this.e;
        if (concurrentHashMap.isEmpty()) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            bigDecimal.getClass();
            return bigDecimal;
        }
        BigDecimal bigDecimalMultiply = BigDecimal.ONE;
        boolean z = false;
        for (HashSet<lw2.a> hashSet : concurrentHashMap.values()) {
            hashSet.getClass();
            HashSet<lw2.a> hashSet2 = hashSet;
            if (!hashSet2.isEmpty()) {
                BigDecimal bigDecimalAdd = BigDecimal.ZERO;
                Iterator<lw2.a> it = hashSet2.iterator();
                it.getClass();
                while (it.hasNext()) {
                    lw2.a next = it.next();
                    next.getClass();
                    lw2.a aVar = next;
                    Outcome outcome = aVar.c;
                    if (outcome != null && outcome.odds != null) {
                        bigDecimalAdd = bigDecimalAdd.add(T(aVar, egyVar));
                    }
                }
                bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimalAdd);
                z = true;
            }
        }
        if (z) {
            bigDecimalMultiply.getClass();
            return bigDecimalMultiply;
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        bigDecimal2.getClass();
        return bigDecimal2;
    }

    @Override // defpackage.krm
    public final Map<String, BigDecimal> q() {
        HashMap map = this.s;
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        this.s = map2;
        return map2;
    }

    @Override // defpackage.krm
    public final Map<Event, Integer> r() {
        return this.h;
    }

    @Override // defpackage.krm
    public final Map<Event, HashSet<lw2.a>> s() {
        return this.e;
    }

    @Override // defpackage.krm
    public final boolean t() {
        return this.e.size() > 2;
    }

    @Override // defpackage.krm
    public final Set<Event> u() {
        return this.f;
    }

    @Override // defpackage.krm
    public final boolean v() {
        Collection<HashSet<lw2.a>> collectionValues = this.e.values();
        collectionValues.getClass();
        Collection<HashSet<lw2.a>> collection = collectionValues;
        if (collection.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            HashSet hashSet = (HashSet) it.next();
            if (hashSet != null && hashSet.size() > 1) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.krm
    public final int w() {
        int i = this.v;
        if (!(i <= gvh.b)) {
            return i;
        }
        int i2 = this.w + i;
        int iA = gvh.a(i);
        int i3 = this.v;
        if (i2 > i3) {
            this.w = 0;
            i2 = i3;
        }
        if (i2 < 2) {
            this.w = (2 - i2) + this.w;
            i2 = 2;
        }
        if (i2 < iA) {
            this.w = (iA - i2) + this.w;
        } else {
            iA = i2;
        }
        if (iA < i3) {
            return iA;
        }
        int i4 = iA - 1;
        this.w--;
        return i4;
    }

    @Override // defpackage.krm
    public final int x() {
        return this.p;
    }

    @Override // defpackage.krm
    public final void y() {
        ConcurrentHashMap<Event, HashSet<lw2.a>> concurrentHashMap = this.e;
        concurrentHashMap.clear();
        ArrayList arrayListU = a().U();
        int size = arrayListU.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListU.get(i);
            i++;
            Selection selection = (Selection) obj;
            Event event = selection.a;
            List<Selection> list = selection.d;
            Outcome outcome = selection.c;
            Market market = selection.b;
            HashSet<lw2.a> hashSet = concurrentHashMap.get(event);
            if (hashSet == null) {
                HashSet<lw2.a> hashSet2 = new HashSet<>();
                hashSet2.add(new lw2.a(event, market, outcome, list));
                concurrentHashMap.put(event, hashSet2);
            } else {
                if (hashSet.size() > 1) {
                    hashSet.remove(new lw2.a(event, market, outcome, list));
                    concurrentHashMap.put(event, hashSet);
                } else {
                    concurrentHashMap.remove(event);
                }
                this.f.remove(event);
            }
        }
        W();
        a0();
        Z();
        V();
    }

    @Override // defpackage.krm
    public final void z(int i, String str, String str2) {
        BigDecimal bigDecimal;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (TextUtils.isEmpty(str2) || Intrinsics.g(str2, "0")) {
            str.getClass();
            bigDecimal2.getClass();
            HashMap map = this.s;
            if (map == null) {
                map = new HashMap();
                this.s = map;
            }
            map.put(str, bigDecimal2);
            HashMap map2 = this.t;
            if (map2 == null) {
                map2 = new HashMap();
                this.t = map2;
            }
            map2.put(str, bigDecimal2);
            return;
        }
        BigDecimal bigDecimal3 = new BigDecimal(str2);
        List<? extends BigDecimal> list = this.l;
        if (S().J()) {
            if (this.n == null) {
                Y();
            }
            bigDecimal = this.n;
        } else {
            bigDecimal = BigDecimal.ONE;
        }
        BigDecimal bigDecimalMultiply = BigDecimal.ONE;
        int size = list.size();
        if (size > 0) {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int i4 = i2;
                for (int i5 = i3; i5 < size; i5++) {
                    if (list.get(i5).compareTo(list.get(i4)) < 0) {
                        i4 = i5;
                    }
                }
                BigDecimal bigDecimal4 = list.get(i4);
                if (i4 != i2) {
                    list.set(i4, list.get(i2));
                    list.set(i2, bigDecimal4);
                }
                bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal4);
                i2 = i3;
            }
        }
        BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(bigDecimal);
        BigDecimal bigDecimal5 = BigDecimal.ZERO;
        if (!bigDecimal5.equals(bigDecimal2)) {
            bigDecimalMultiply2 = bigDecimalMultiply2.min(bigDecimal2);
        }
        BigDecimal bigDecimalMultiply3 = bigDecimalMultiply2.multiply(bigDecimal3);
        str.getClass();
        bigDecimalMultiply3.getClass();
        HashMap map3 = this.s;
        if (map3 == null) {
            map3 = new HashMap();
            this.s = map3;
        }
        map3.put(str, bigDecimalMultiply3);
        List<? extends BigDecimal> list2 = this.m;
        BigDecimal bigDecimalA = A();
        if (i <= 0) {
            bigDecimal5 = bigDecimalA;
        } else if (i <= list2.size()) {
            ArrayList arrayList = new ArrayList();
            lw2.d.k(arrayList, i, list2.size());
            int size2 = arrayList.size();
            BigDecimal bigDecimalAdd = bigDecimal5;
            int i6 = 0;
            while (i6 < size2) {
                Object obj = arrayList.get(i6);
                i6++;
                List list3 = (List) obj;
                int size3 = list3.size();
                if (size3 > 0) {
                    BigDecimal bigDecimalMultiply4 = BigDecimal.ONE;
                    for (int i7 = 0; i7 < size3; i7++) {
                        bigDecimalMultiply4 = bigDecimalMultiply4.multiply(list2.get(((Integer) list3.get(i7)).intValue()));
                    }
                    BigDecimal bigDecimalMultiply5 = bigDecimalMultiply4.multiply(bigDecimalA);
                    if (!bigDecimal5.equals(BigDecimal.ZERO) && bigDecimalMultiply5.compareTo(bigDecimal5) > 0) {
                        bigDecimalMultiply5 = bigDecimal5;
                    }
                    bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply5);
                }
            }
            bigDecimal5 = bigDecimalAdd;
        }
        BigDecimal bigDecimalMultiply6 = bigDecimal5.multiply(bigDecimal3);
        bigDecimalMultiply6.getClass();
        HashMap map4 = this.t;
        if (map4 == null) {
            map4 = new HashMap();
            this.t = map4;
        }
        map4.put(str, bigDecimalMultiply6);
    }

    @Override // defpackage.krm
    public final void k(ArrayList arrayList, int i, int i2) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_BONUS_CALC);
        StringBuilder sb = new StringBuilder(LxHElgWAiSeM.NfHGc);
        sb.append(i);
        sb.append(", size=");
        aVar.g(zk1.a(i2, ")", sb), new Object[0]);
        String str = i2 + "_" + i;
        HashMap map = this.y;
        List list = (List) map.get(str);
        if (list != null) {
            aVar.q(MyLog.TAG_BONUS_CALC);
            aVar.g("combineByCache: cache hit! key=".concat(str), new Object[0]);
            arrayList.addAll(list);
            return;
        }
        try {
            aVar.q(MyLog.TAG_BONUS_CALC);
            aVar.g("combineByCache: start calculate combinations...", new Object[0]);
            o78 o78Var = new o78(i2, i);
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            while (o78Var.d && i3 < 100000) {
                arrayList2.add(o78Var.next());
                i3++;
            }
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_BONUS_CALC);
            aVar2.g("combineByCache: calculated " + i3 + " combinations.", new Object[0]);
            arrayList.addAll(arrayList2);
            map.put(str, arrayList2);
        } catch (Throwable th) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_BONUS_CALC);
            aVar3.o(th);
        }
    }
}
