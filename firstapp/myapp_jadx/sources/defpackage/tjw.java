package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.multimaker.MultiMakerConstKt;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.data.dto.MultiMakerLeagueOptionDto;
import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltjw;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tjw extends j8i0 {
    public boolean A;
    public String B;
    public int C;
    public int D;
    public String E;
    public final wwd0 F;
    public final wwd0 G;
    public final wwd0 H;
    public final v340 I;
    public final v340 J;
    public final v340 K;
    public final wwd0 L;
    public final wwd0 M;
    public final wwd0 N;
    public final wwd0 O;
    public final wwd0 P;
    public final wwd0 Q;
    public final wwd0 R;
    public final wwd0 S;
    public final wwd0 T;
    public final wwd0 U;
    public final wwd0 V;
    public final wwd0 W;
    public final wwd0 X;
    public final wwd0 Y;
    public final wwd0 Z;
    public final hus a;
    public final wwd0 a0;
    public final lt5 b;
    public final wwd0 b0;
    public final o8s c;
    public final wwd0 c0;
    public final h940 d;
    public final wwd0 d0;
    public final ifw e;
    public final ku90<a> e0;
    public final jrm f;
    public final ku90 f0;
    public final wwd0 g0;
    public final v340 h0;
    public final lrm i;
    public final ku90<hiw> i0;
    public final ku90 j0;
    public jvd0 k0;
    public final krm v;
    public final iym w;
    public final rdd0 y;
    public boolean z;

    public tjw(hus husVar, lt5 lt5Var, o8s o8sVar, h940 h940Var, ifw ifwVar, jrm jrmVar, lrm lrmVar, krm krmVar, iym iymVar, rdd0 rdd0Var) {
        lt5Var.getClass();
        o8sVar.getClass();
        h940Var.getClass();
        ifwVar.getClass();
        jrmVar.getClass();
        lrmVar.getClass();
        krmVar.getClass();
        iymVar.getClass();
        rdd0Var.getClass();
        this.a = husVar;
        this.b = lt5Var;
        this.c = o8sVar;
        this.d = h940Var;
        this.e = ifwVar;
        this.f = jrmVar;
        this.i = lrmVar;
        this.v = krmVar;
        this.w = iymVar;
        this.y = rdd0Var;
        lk50.b bVar = lk50.b.a;
        this.F = xwd0.a(bVar);
        this.G = xwd0.a(bVar);
        this.H = xwd0.a(bVar);
        yl50 yl50VarG = ifwVar.g();
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        this.I = e1i.e(yl50VarG, et7VarD, kwd0Var, 50);
        yl50 yl50VarU = ifwVar.u();
        et7 et7VarD2 = o8i0.d(this);
        Boolean bool = Boolean.FALSE;
        this.J = e1i.e(yl50VarU, et7VarD2, kwd0Var, bool);
        this.K = e1i.e(ifwVar.m(), o8i0.d(this), kwd0Var, MultiMakerConstKt.getDefaultTotalOddsBoundary());
        this.L = xwd0.a(qhw.f);
        m2g m2gVar = m2g.a;
        this.M = xwd0.a(m2gVar);
        this.N = xwd0.a(5);
        this.O = xwd0.a(0);
        this.P = xwd0.a(bool);
        this.Q = xwd0.a(bool);
        this.R = xwd0.a("");
        this.S = xwd0.a(bool);
        this.T = xwd0.a(bool);
        this.U = xwd0.a(bool);
        this.V = xwd0.a("sr:sport:1");
        this.W = xwd0.a(kotlin.collections.a.c(3));
        this.X = xwd0.a(m2gVar);
        this.Y = xwd0.a(m2gVar);
        this.Z = xwd0.a(xvf0.a());
        mhw mhwVar = mhw.a;
        this.a0 = xwd0.a(mhwVar);
        Pair pair = new Pair(mhwVar, z1(mhwVar));
        mhw mhwVar2 = mhw.b;
        this.b0 = xwd0.a(b.k(pair, new Pair(mhwVar2, z1(mhwVar2))));
        this.c0 = xwd0.a(m2gVar);
        this.d0 = xwd0.a(new shw("sr:sport:1", m2gVar, m2gVar, m2gVar, m2gVar, xvf0.a()));
        ku90<a> ku90Var = new ku90<>();
        this.e0 = ku90Var;
        this.f0 = ku90Var;
        wwd0 wwd0VarA = xwd0.a(new kiw(0));
        this.g0 = wwd0VarA;
        this.h0 = e1i.b(wwd0VarA);
        ku90<hiw> ku90Var2 = new ku90<>();
        this.i0 = ku90Var2;
        this.j0 = ku90Var2;
        kzh.d(new g1i(r0i.e(husVar.l, husVar.j), new viw(null, this)), o8i0.d(this));
    }

    public static List A1(Collection collection, Collection collection2) {
        boolean z;
        boolean z2;
        Collection collection3 = collection;
        ArrayList arrayList = new ArrayList(l48.r(collection3, 10));
        Iterator it = collection3.iterator();
        while (true) {
            boolean z3 = true;
            if (!it.hasNext()) {
                break;
            }
            MultiMakerLeagueOptionDto multiMakerLeagueOptionDto = (MultiMakerLeagueOptionDto) it.next();
            String id = multiMakerLeagueOptionDto.getId();
            StringUiText stringUiTextD = vch0.d(multiMakerLeagueOptionDto.getName());
            boolean zContains = collection2.contains(multiMakerLeagueOptionDto.getId());
            if (multiMakerLeagueOptionDto.getEventSize() <= 0) {
                z3 = false;
            }
            arrayList.add(new ehw(id, stringUiTextD, zContains, z3));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.live_result__all_leagues);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = true;
                    break;
                }
                Object obj = arrayList2.get(i);
                i++;
                if (!((ehw) obj).c) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        if (!arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    z2 = false;
                    break;
                }
                Object obj2 = arrayList2.get(i2);
                i2++;
                if (((ehw) obj2).d) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        arrayList2.add(0, new ehw(MultiMakerConstKt.ID_SELECT_ALL, resourceUiText, z, z2));
        if (arrayList2.isEmpty()) {
            return m2g.a;
        }
        ehw ehwVar = (ehw) CollectionsKt.T(arrayList2);
        ArrayList arrayListC0 = CollectionsKt.C0(CollectionsKt.r0(CollectionsKt.O(arrayList2, 1), vl8.a(new miw(), new niw())));
        arrayListC0.add(0, ehwVar);
        return arrayListC0;
    }

    public static ArrayList B1(Collection collection, Collection collection2) {
        Collection<RegularMarketRule> collection3 = collection;
        ArrayList arrayList = new ArrayList(l48.r(collection3, 10));
        for (RegularMarketRule regularMarketRule : collection3) {
            String str = regularMarketRule.a;
            str.getClass();
            String str2 = regularMarketRule.b;
            str2.getClass();
            StringUiText stringUiText = vch0.a;
            arrayList.add(new ehw(str, new StringUiText(str2), collection2.contains(regularMarketRule.a), true));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static lhw C1(List list, mhw mhwVar) {
        Object next;
        lhw lhwVar;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Pair) next).a != mhwVar);
        Pair pair = (Pair) next;
        return (pair == null || (lhwVar = (lhw) pair.b) == null) ? z1(mhwVar) : lhwVar;
    }

    public static ArrayList D1(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ehw) obj).c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((ehw) obj2).b);
        }
        return arrayList2;
    }

    public static jvd0 I1(tjw tjwVar, boolean z, int i) {
        boolean z2 = (i & 1) == 0;
        if ((i & 2) != 0) {
            z = false;
        }
        return ej5.c(o8i0.d(tjwVar), null, null, new mjw(tjwVar, z2, z, null), 3);
    }

    public static lhw z1(mhw mhwVar) {
        int iOrdinal = mhwVar.ordinal();
        if (iOrdinal == 0) {
            Object lower = MultiMakerConstKt.getDefaultSelectionOddsBoundary().getLower();
            lower.getClass();
            return new lhw(((Number) lower).floatValue(), (Float) MultiMakerConstKt.getDefaultSelectionOddsBoundary().getUpper());
        }
        if (iOrdinal != 1) {
            uhc.a();
            return null;
        }
        Object lower2 = MultiMakerConstKt.getDefaultTotalOddsBoundary().getLower();
        lower2.getClass();
        return new lhw(((Number) lower2).floatValue(), null);
    }

    public final giw E1() {
        Object value = this.Z.getValue();
        value.getClass();
        xvf0 xvf0Var = (xvf0) value;
        return Intrinsics.g(xvf0Var.a, "all") ? new giw(null, null) : new giw(Long.valueOf(xvf0Var.d), Long.valueOf(xvf0Var.e));
    }

    public final boolean F1() {
        mhw mhwVar = (mhw) this.a0.getValue();
        mhwVar.getClass();
        return mhwVar == mhw.b;
    }

    public final jvd0 G1(qhw qhwVar) {
        return ej5.c(o8i0.d(this), null, null, new xiw(this, qhwVar, null), 3);
    }

    public final jvd0 H1(boolean z) {
        return ej5.c(o8i0.d(this), null, null, new ziw(this, z, null), 3);
    }

    public final jvd0 J1() {
        return ej5.c(o8i0.d(this), null, null, new njw(null, this), 3);
    }

    public final void K1(String str) {
        ej5.c(o8i0.d(this), null, null, new rjw(this, str, null), 3);
    }

    public final void x1(Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            wwd0 wwd0Var = this.R;
            String str = (String) wwd0Var.getValue();
            str.getClass();
            Integer intOrNull = StringsKt.toIntOrNull(str);
            int iIntValue2 = intOrNull != null ? intOrNull.intValue() : 0;
            wwd0Var.setValue(String.valueOf(iIntValue2));
            iIntValue = iIntValue2;
        }
        Boolean bool = Boolean.TRUE;
        wwd0 wwd0Var2 = this.S;
        wwd0Var2.getClass();
        wwd0Var2.k(null, bool);
        Integer numValueOf = Integer.valueOf(((List) this.M.getValue()).size() + iIntValue);
        wwd0 wwd0Var3 = this.N;
        wwd0Var3.getClass();
        wwd0Var3.k(null, numValueOf);
        I1(this, !F1(), 1);
    }

    public final BigDecimal y1() {
        Object value = this.M.getValue();
        if (((List) value).isEmpty()) {
            value = null;
        }
        List list = (List) value;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                MultiMakerItem multiMakerItem = (MultiMakerItem) obj;
                String str = multiMakerItem.c.b;
                AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
                try {
                    Double.parseDouble(str);
                    if (multiMakerItem.d) {
                        arrayList.add(obj);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(new BigDecimal(((MultiMakerItem) obj2).c.b));
                }
                Iterator it = arrayList2.iterator();
                if (!it.hasNext()) {
                    zkh.a("Empty collection can't be reduced.");
                    return null;
                }
                Object next = it.next();
                while (it.hasNext()) {
                    next = ((BigDecimal) next).multiply((BigDecimal) it.next());
                    next.getClass();
                }
                BigDecimal bigDecimal = (BigDecimal) next;
                if (bigDecimal != null) {
                    return bigDecimal;
                }
            }
        }
        BigDecimal bigDecimal2 = BigDecimal.ONE;
        bigDecimal2.getClass();
        return bigDecimal2;
    }
}
