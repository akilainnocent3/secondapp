package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class zm5 implements sm5 {
    public final lv50 a;
    public final a b = new a();

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            hp5 hp5Var = (hp5) obj;
            hq60Var.getClass();
            hp5Var.getClass();
            hq60Var.L(1, hp5Var.a);
            hq60Var.L(2, hp5Var.b);
            hq60Var.L(3, hp5Var.c);
            hq60Var.L(4, hp5Var.d);
            String str = hp5Var.e;
            if (str == null) {
                hq60Var.r(5);
            } else {
                hq60Var.L(5, str);
            }
            String str2 = hp5Var.f;
            if (str2 == null) {
                hq60Var.r(6);
            } else {
                hq60Var.L(6, str2);
            }
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR REPLACE INTO `CMSResponseEntity` (`key`,`page`,`countryCode`,`locale`,`value`,`type`) VALUES (?,?,?,?,?,?)";
        }
    }

    public zm5(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.sm5
    public final Object a(final ArrayList arrayList, hn5 hn5Var) {
        Object objC = qlc.c(hn5Var, this.a, new Function1() { // from class: um5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.b.n(vp60Var, arrayList);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.sm5
    public final q2i b(String str, String str2) {
        str.getClass();
        str2.getClass();
        ym5 ym5Var = new ym5(str, str2);
        return s7n.a(this.a, new String[]{"CMSResponseEntity"}, ym5Var);
    }

    @Override // defpackage.sm5
    public final Object c(final String str, final String str2, final String str3, cn5 cn5Var) {
        Object objC = qlc.c(cn5Var, this.a, new Function1() { // from class: vm5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM CMSResponseEntity WHERE page = ? AND countryCode = ? AND locale = ?");
                try {
                    hq60VarH1.L(1, str4);
                    hq60VarH1.L(2, str5);
                    hq60VarH1.L(3, str6);
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.sm5
    public final Object d(final ArrayList arrayList, final ArrayList arrayList2, final String str, final String str2, bn5 bn5Var) {
        StringBuilder sbA = y4s.a("DELETE FROM CMSResponseEntity WHERE page IN (");
        final int size = arrayList.size();
        d21.c(size, sbA);
        sbA.append(") AND `key` IN (");
        final int size2 = arrayList2.size();
        d21.c(size2, sbA);
        sbA.append(") AND countryCode = ");
        sbA.append("?");
        sbA.append(" AND locale = ");
        sbA.append("?");
        final String string = sbA.toString();
        Object objC = qlc.c(bn5Var, this.a, new Function1() { // from class: xm5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                ArrayList arrayList3 = arrayList;
                int i = size;
                ArrayList arrayList4 = arrayList2;
                int i2 = size2;
                String str3 = str;
                String str4 = str2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1(string);
                try {
                    int size3 = arrayList3.size();
                    int i3 = 0;
                    int i4 = 1;
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj2 = arrayList3.get(i5);
                        i5++;
                        hq60VarH1.L(i4, (String) obj2);
                        i4++;
                    }
                    int i6 = i + 1;
                    int size4 = arrayList4.size();
                    int i7 = i6;
                    while (i3 < size4) {
                        Object obj3 = arrayList4.get(i3);
                        i3++;
                        hq60VarH1.L(i7, (String) obj3);
                        i7++;
                    }
                    hq60VarH1.L(i6 + i2, str3);
                    hq60VarH1.L(i + 2 + i2, str4);
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.sm5
    public final Object e(final ArrayList arrayList, final ArrayList arrayList2, final String str, final String str2, dn5 dn5Var) {
        StringBuilder sbA = y4s.a("SELECT * FROM CMSResponseEntity WHERE page IN (");
        final int size = arrayList.size();
        d21.c(size, sbA);
        sbA.append(") AND `key` IN (");
        final int size2 = arrayList2.size();
        d21.c(size2, sbA);
        sbA.append(") AND countryCode = ");
        sbA.append("?");
        sbA.append(" AND locale = ");
        sbA.append("?");
        final String string = sbA.toString();
        return qlc.c(dn5Var, this.a, new Function1() { // from class: wm5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                ArrayList arrayList3 = arrayList;
                int i = size;
                ArrayList arrayList4 = arrayList2;
                int i2 = size2;
                String str3 = str;
                String str4 = str2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1(string);
                try {
                    int size3 = arrayList3.size();
                    int i3 = 0;
                    int i4 = 1;
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj2 = arrayList3.get(i5);
                        i5++;
                        hq60VarH1.L(i4, (String) obj2);
                        i4++;
                    }
                    int i6 = i + 1;
                    int size4 = arrayList4.size();
                    int i7 = i6;
                    while (i3 < size4) {
                        Object obj3 = arrayList4.get(i3);
                        i3++;
                        hq60VarH1.L(i7, (String) obj3);
                        i7++;
                    }
                    hq60VarH1.L(i6 + i2, str3);
                    hq60VarH1.L(i + 2 + i2, str4);
                    int iB = l0b.b(hq60VarH1, "key");
                    int iB2 = l0b.b(hq60VarH1, AnalyticsParam.MINI_GAMES_PAGE);
                    int iB3 = l0b.b(hq60VarH1, "countryCode");
                    int iB4 = l0b.b(hq60VarH1, "locale");
                    int iB5 = l0b.b(hq60VarH1, "value");
                    int iB6 = l0b.b(hq60VarH1, "type");
                    ArrayList arrayList5 = new ArrayList();
                    while (hq60VarH1.D1()) {
                        arrayList5.add(new hp5(hq60VarH1.k1(iB), hq60VarH1.k1(iB2), hq60VarH1.k1(iB3), hq60VarH1.k1(iB4), hq60VarH1.isNull(iB5) ? null : hq60VarH1.k1(iB5), hq60VarH1.isNull(iB6) ? null : hq60VarH1.k1(iB6)));
                    }
                    return arrayList5;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, true, false);
    }

    @Override // defpackage.sm5
    public final Object f(final String str, final String str2, final String str3, en5 en5Var) {
        return qlc.c(en5Var, this.a, new Function1() { // from class: tm5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM CMSResponseEntity WHERE page = ? AND countryCode = ? AND locale = ?");
                try {
                    hq60VarH1.L(1, str4);
                    hq60VarH1.L(2, str5);
                    hq60VarH1.L(3, str6);
                    int iB = l0b.b(hq60VarH1, "key");
                    int iB2 = l0b.b(hq60VarH1, AnalyticsParam.MINI_GAMES_PAGE);
                    int iB3 = l0b.b(hq60VarH1, "countryCode");
                    int iB4 = l0b.b(hq60VarH1, "locale");
                    int iB5 = l0b.b(hq60VarH1, "value");
                    int iB6 = l0b.b(hq60VarH1, "type");
                    ArrayList arrayList = new ArrayList();
                    while (hq60VarH1.D1()) {
                        arrayList.add(new hp5(hq60VarH1.k1(iB), hq60VarH1.k1(iB2), hq60VarH1.k1(iB3), hq60VarH1.k1(iB4), hq60VarH1.isNull(iB5) ? null : hq60VarH1.k1(iB5), hq60VarH1.isNull(iB6) ? null : hq60VarH1.k1(iB6)));
                    }
                    return arrayList;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, true, false);
    }
}
