package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class hkf {
    public final mjf a;
    public final xhh0 b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ckf.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
            int[] iArr2 = new int[rhh0.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                rhh0 rhh0Var = rhh0.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr3 = new int[phh0.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                phh0 phh0Var = phh0.a;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public hkf(mjf mjfVar, xhh0 xhh0Var) {
        mjfVar.getClass();
        this.a = mjfVar;
        this.b = xhh0Var;
    }

    public static RegularMarketRule d(RegularMarketRule regularMarketRule) {
        RegularMarketRule regularMarketRuleA;
        regularMarketRule.getClass();
        String str = regularMarketRule.a;
        if (xvy.i(regularMarketRule) || ((str != null && str.equals("1")) || (str != null && str.equals("1")))) {
            RegularMarketRule regularMarketRuleA2 = RegularMarketRule.a("1", null);
            if (regularMarketRuleA2 != null) {
                return regularMarketRuleA2;
            }
        } else {
            slc.a.getClass();
            String str2 = slc.d;
            if (Intrinsics.g(str, str2) || Intrinsics.g(str, slc.b)) {
                regularMarketRuleA = (Intrinsics.g(str, str2) || Intrinsics.g(str, slc.b)) ? RegularMarketRule.a(slc.b, null) : null;
                if (regularMarketRuleA != null) {
                    return regularMarketRuleA;
                }
            } else {
                cby.a.getClass();
                if (Intrinsics.g(str, "18") || Intrinsics.g(str, "60180")) {
                    regularMarketRuleA = (Intrinsics.g(str, "60180") || Intrinsics.g(str, "18")) ? RegularMarketRule.a("18", null) : null;
                    if (regularMarketRuleA != null) {
                        return regularMarketRuleA;
                    }
                }
            }
        }
        return regularMarketRule;
    }

    public static boolean e(RegularMarketRule regularMarketRule) {
        regularMarketRule.getClass();
        return hi9.a(regularMarketRule) || yay.f(regularMarketRule) || Intrinsics.g(regularMarketRule.a, "60210");
    }

    public final RegularMarketRule a(String str, RegularMarketRule regularMarketRule, boolean z, boolean z2) {
        String strA;
        ckf ckfVar = ckf.c;
        if (regularMarketRule == null) {
            return null;
        }
        String str2 = regularMarketRule.a;
        if (a.a[2] == 1 && this.a.b(ckfVar, str, str2, z2)) {
            RegularMarketRule regularMarketRuleA = (!yay.h(str2) || str2 == null || (strA = yay.a(str2, z)) == null) ? regularMarketRule : RegularMarketRule.a(strA, null);
            if (regularMarketRuleA != null) {
                return regularMarketRuleA;
            }
        }
        return regularMarketRule;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    public final List b(String str, String str2, List list, boolean z, boolean z2) {
        Event event;
        List<Market> list2;
        List<Market> list3;
        Event event2;
        List<Market> list4;
        List<Market> list5;
        list.getClass();
        whh0 whh0VarD = this.b.d(str, str2, false);
        boolean zG = yay.g(str2);
        if ((whh0VarD != null ? whh0VarD.b : null) == null) {
            if (!zG) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (akf.d((ing) obj, cby.a, z, z2)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            ing ingVar = (ing) obj2;
            phh0 phh0Var = whh0VarD.b;
            rhh0 rhh0Var = whh0VarD.a;
            int iOrdinal = phh0Var.ordinal();
            boolean zD = true;
            if (iOrdinal == 0) {
                int iOrdinal2 = rhh0Var.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        uhc.a();
                        return null;
                    }
                    zD = akf.d(ingVar, tlc.a, z, z2);
                } else if (!z ? ingVar == null || (event = ingVar.a) == null || (list2 = event.markets) == null || !xvy.c(list2, z2) : ingVar == null || (list3 = ingVar.w) == null || !xvy.c(list3, z2)) {
                    zD = false;
                }
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                int iOrdinal3 = rhh0Var.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 != 1) {
                        uhc.a();
                        return null;
                    }
                } else if (!z ? ingVar == null || (event2 = ingVar.a) == null || (list4 = event2.markets) == null || !xvy.f(list4, z2) : ingVar == null || (list5 = ingVar.w) == null || !xvy.f(list5, z2)) {
                    zD = false;
                }
            }
            if (zD) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public final List c(String str, String str2, List list, boolean z) {
        list.getClass();
        whh0 whh0VarD = this.b.d(str, str2, z);
        boolean zG = yay.g(str2);
        if ((whh0VarD != null ? whh0VarD.b : null) == null) {
            if (!zG) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (akf.e((Event) obj, cby.a, false, 2)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            Event event = (Event) obj2;
            phh0 phh0Var = whh0VarD.b;
            rhh0 rhh0Var = whh0VarD.a;
            int iOrdinal = phh0Var.ordinal();
            boolean zD = true;
            if (iOrdinal == 0) {
                int iOrdinal2 = rhh0Var.ordinal();
                if (iOrdinal2 == 0) {
                    zD = xvy.d(event, false, 1);
                } else {
                    if (iOrdinal2 != 1) {
                        uhc.a();
                        return null;
                    }
                    zD = akf.e(event, tlc.a, false, 2);
                }
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                int iOrdinal3 = rhh0Var.ordinal();
                if (iOrdinal3 == 0) {
                    zD = xvy.g(event, false, 1);
                } else if (iOrdinal3 != 1) {
                    uhc.a();
                    return null;
                }
            }
            if (zD) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
