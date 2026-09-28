package defpackage;

import com.sporty.android.core.model.gift.GiftBetBuilderType;
import com.sporty.android.core.model.gift.GiftEarlyGoalsType;
import com.sporty.android.core.model.gift.GiftPreMatchOrLiveType;
import com.sporty.android.core.model.gift.GiftUpType;
import com.sporty.android.core.model.gift.GiftUtil;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class vp3 {
    public final up3 a;
    public final up3 b;
    public final up3 c;
    public final jrm d;
    public final lrm e;
    public final krm f;

    public vp3(up3 up3Var, up3 up3Var2, up3 up3Var3, jrm jrmVar, lrm lrmVar, krm krmVar) {
        up3Var.getClass();
        up3Var2.getClass();
        up3Var3.getClass();
        jrmVar.getClass();
        lrmVar.getClass();
        krmVar.getClass();
        this.a = up3Var;
        this.b = up3Var2;
        this.c = up3Var3;
        this.d = jrmVar;
        this.e = lrmVar;
        this.f = krmVar;
    }

    public final boolean a(List<Integer> list) {
        if (list == null || list.contains(Integer.valueOf(GiftBetBuilderType.NO_LIMIT.getValue()))) {
            return true;
        }
        boolean zContains = list.contains(Integer.valueOf(GiftBetBuilderType.ALL_BET_BUILDER.getValue()));
        jrm jrmVar = this.d;
        if (zContains) {
            ArrayList arrayListU = jrmVar.U();
            ArrayList arrayList = new ArrayList();
            int size = arrayListU.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListU.get(i);
                i++;
                if (qz3.b((Selection) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (!((Selection) obj2).p()) {
                    }
                }
                return true;
            }
        } else if (list.contains(Integer.valueOf(GiftBetBuilderType.LEAST_ONE_BET_BUILDER.getValue()))) {
            ArrayList arrayListU2 = jrmVar.U();
            ArrayList arrayList2 = new ArrayList();
            int size3 = arrayListU2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayListU2.get(i3);
                i3++;
                if (qz3.b((Selection) obj3)) {
                    arrayList2.add(obj3);
                }
            }
            if (!arrayList2.isEmpty()) {
                int size4 = arrayList2.size();
                int i4 = 0;
                while (i4 < size4) {
                    Object obj4 = arrayList2.get(i4);
                    i4++;
                    if (((Selection) obj4).p()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(int i, List list) {
        list.getClass();
        if (i == 3) {
            return false;
        }
        if (list.contains(0)) {
            return true;
        }
        if (i == 2 || i == 4 || i == 6) {
            if (list.contains(2)) {
                return true;
            }
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (iIntValue == 4 || iIntValue == 5 || iIntValue == 6) {
                    }
                }
            }
            return list.contains(Integer.valueOf(this.e.V()));
        }
        return list.contains(Integer.valueOf(i));
    }

    public final boolean c(int i, int i2, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, Integer num) {
        list.getClass();
        return i == 3 && e(i2) && b(i2, list) && g(list2) && d(list3) && a(list4) && f(num);
    }

    public final boolean d(List<Integer> list) {
        if (list == null || list.contains(Integer.valueOf(GiftEarlyGoalsType.NO_LIMIT.getValue()))) {
            return true;
        }
        boolean zContains = list.contains(Integer.valueOf(GiftEarlyGoalsType.LEAST_ONE_EARLY_GOALS.getValue()));
        jrm jrmVar = this.d;
        if (zContains) {
            return jrmVar.I() && jrmVar.B1();
        }
        if (list.contains(Integer.valueOf(GiftEarlyGoalsType.ALL_EARLY_GOALS.getValue()))) {
            return jrmVar.w1();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x007c A[RETURN] */
    public final boolean e(int i) {
        int i2;
        int i3;
        jrm jrmVar = this.d;
        if (i == 1) {
            ArrayList arrayListU = jrmVar.U();
            if (arrayListU == null || !arrayListU.isEmpty()) {
                int size = arrayListU.size();
                i2 = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayListU.get(i4);
                    i4++;
                    if (qz3.b((Selection) obj) && (i2 = i2 + 1) < 0) {
                        b.p();
                        throw null;
                    }
                }
            } else {
                i2 = 0;
            }
            if (i2 == 1) {
                return true;
            }
            return false;
        }
        if (i == 2 || (i != 3 && (i == 4 || i == 6))) {
            ArrayList arrayListU2 = jrmVar.U();
            if (arrayListU2 == null || !arrayListU2.isEmpty()) {
                int size2 = arrayListU2.size();
                i3 = 0;
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayListU2.get(i5);
                    i5++;
                    if (qz3.b((Selection) obj2) && (i3 = i3 + 1) < 0) {
                        b.p();
                        throw null;
                    }
                }
            } else {
                i3 = 0;
            }
            if (!this.f.P() && i3 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(Integer num) {
        int iIntValue;
        if (num == null || (iIntValue = num.intValue()) == GiftPreMatchOrLiveType.BOTH.getValue()) {
            return true;
        }
        int value = GiftPreMatchOrLiveType.PRE_MATCH.getValue();
        jrm jrmVar = this.d;
        if (iIntValue == value) {
            return jrmVar.O();
        }
        if (iIntValue == GiftPreMatchOrLiveType.LIVE.getValue()) {
            return jrmVar.g0();
        }
        return false;
    }

    public final boolean g(List<Integer> list) {
        if (list != null && !list.contains(Integer.valueOf(GiftUpType.NO_LIMIT.getValue()))) {
            boolean zContains = list.contains(Integer.valueOf(GiftUpType.LEAST_ONE_ONE_UP.getValue()));
            jrm jrmVar = this.d;
            if (zContains) {
                if (!jrmVar.s0(true) || !jrmVar.H1(true)) {
                    return false;
                }
            } else {
                if (list.contains(Integer.valueOf(GiftUpType.ALL_ONE_UP.getValue()))) {
                    return jrmVar.M0();
                }
                if (!list.contains(Integer.valueOf(GiftUpType.LEAST_ONE_TWO_UP.getValue()))) {
                    if (list.contains(Integer.valueOf(GiftUpType.ALL_TWO_UP.getValue()))) {
                        return jrmVar.n1();
                    }
                    return false;
                }
                if (!jrmVar.Z0() || !jrmVar.C0()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean h(int i, Integer num) {
        up3 up3Var;
        if (i != 1) {
            if (i == 2 || i == 4 || i == 6) {
                up3Var = this.b;
            }
            return false;
        }
        up3Var = this.a;
        String str = up3Var.c;
        if (up3Var.i && str != null && str.length() != 0 && !StringsKt.M(str, GiftUtil.CLEARED_GIFT_VALUE, false)) {
            AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
            if (str.matches("\\d+(\\.\\d+)?")) {
                if (num != null) {
                    return c(up3Var.e, num.intValue(), up3Var.w, up3Var.y, up3Var.z, up3Var.A, up3Var.B);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean i(int i) {
        up3 up3Var;
        if (i == 1) {
            up3Var = this.a;
        } else if (i == 2) {
            up3Var = this.b;
        } else if (i != 3) {
            if (i != 4 && i != 6) {
                return false;
            }
            up3Var = this.b;
        } else {
            up3Var = this.c;
        }
        lrm lrmVar = this.e;
        if (!lrmVar.M() || ((lrmVar.M() && i == 1) || (lrmVar.M() && i == 3))) {
            return up3Var.b > 0 || up3Var.c != null;
        }
        return false;
    }

    public final boolean j(int i, int i2) {
        up3 up3Var;
        if (i == 1) {
            up3Var = this.a;
        } else {
            if (i != 2 && i != 4 && i != 6) {
                return false;
            }
            up3Var = this.b;
        }
        if (this.e.M()) {
            return false;
        }
        return (up3Var.b > 0 || up3Var.c != null) && e(i) && b(i2, up3Var.w) && g(up3Var.y) && d(up3Var.z) && a(up3Var.A) && f(up3Var.B);
    }
}
