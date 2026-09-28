package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class o3f0 {
    public final String a;
    public final Map<String, a> b;
    public final Set<c> c;
    public final Set<d> d;

    public static final class a {
        public final String a;
        public final String b;
        public final boolean c;
        public final int d;
        public final String e;
        public final int f;
        public final int g;

        public a(int i, int i2, String str, String str2, String str3, boolean z) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = i;
            this.e = str3;
            this.f = i2;
            String upperCase = str2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            this.g = StringsKt.M(upperCase, "INT", false) ? 3 : (StringsKt.M(upperCase, "CHAR", false) || StringsKt.M(upperCase, "CLOB", false) || StringsKt.M(upperCase, "TEXT", false)) ? 2 : StringsKt.M(upperCase, "BLOB", false) ? 5 : (StringsKt.M(upperCase, "REAL", false) || StringsKt.M(upperCase, "FLOA", false) || StringsKt.M(upperCase, "DOUB", false)) ? 4 : 1;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    boolean z = this.d > 0;
                    a aVar = (a) obj;
                    int i = aVar.f;
                    if (z == (aVar.d > 0) && Intrinsics.g(this.a, aVar.a) && this.c == aVar.c) {
                        String str = aVar.e;
                        int i2 = this.f;
                        String str2 = this.e;
                        if ((i2 != 1 || i != 2 || str2 == null || r3f0.a(str2, str)) && ((i2 != 2 || i != 1 || str == null || r3f0.a(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : r3f0.a(str2, str))) && this.g == aVar.g))) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
            sb.append(this.a);
            sb.append("',\n            |   type = '");
            sb.append(this.b);
            sb.append("',\n            |   affinity = '");
            sb.append(this.g);
            sb.append("',\n            |   notNull = '");
            sb.append(this.c);
            sb.append("',\n            |   primaryKeyPosition = '");
            sb.append(this.d);
            sb.append("',\n            |   defaultValue = '");
            String str = this.e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'\n            |}\n        ");
            return qae0.b(qae0.d(sb.toString()));
        }
    }

    public static final class b {
        public static o3f0 a(vp60 vp60Var, String str) {
            long j;
            Map mapC;
            ph80 ph80Var;
            vp60Var.getClass();
            hq60 hq60VarH1 = vp60Var.H1("PRAGMA table_info(`" + str + "`)");
            try {
                long j2 = 0;
                if (hq60VarH1.D1()) {
                    int iA = jq60.a(hq60VarH1, "name");
                    int iA2 = jq60.a(hq60VarH1, "type");
                    int iA3 = jq60.a(hq60VarH1, "notnull");
                    int iA4 = jq60.a(hq60VarH1, "pk");
                    int iA5 = jq60.a(hq60VarH1, "dflt_value");
                    xnu xnuVar = new xnu();
                    while (true) {
                        String strK1 = hq60VarH1.k1(iA);
                        j = j2;
                        xnuVar.put(strK1, new a((int) hq60VarH1.getLong(iA4), 2, strK1, hq60VarH1.k1(iA2), hq60VarH1.isNull(iA5) ? null : hq60VarH1.k1(iA5), hq60VarH1.getLong(iA3) != j2));
                        if (!hq60VarH1.D1()) {
                            break;
                        }
                        j2 = j;
                    }
                    mapC = xnuVar.c();
                    vc1.a(hq60VarH1, null);
                } else {
                    mapC = o2g.a;
                    mapC.getClass();
                    vc1.a(hq60VarH1, null);
                    j = 0;
                }
                hq60 hq60VarH2 = vp60Var.H1("PRAGMA foreign_key_list(`" + str + "`)");
                try {
                    int iA6 = jq60.a(hq60VarH2, AnalyticsParam.EVENT_PARAM_ID);
                    int iA7 = jq60.a(hq60VarH2, "seq");
                    int iA8 = jq60.a(hq60VarH2, "table");
                    int iA9 = jq60.a(hq60VarH2, "on_delete");
                    int iA10 = jq60.a(hq60VarH2, "on_update");
                    List<rti> listA = cn70.a(hq60VarH2);
                    hq60VarH2.reset();
                    ph80 ph80Var2 = new ph80();
                    while (hq60VarH2.D1()) {
                        if (hq60VarH2.getLong(iA7) == j) {
                            int i = (int) hq60VarH2.getLong(iA6);
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            int i2 = iA6;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : listA) {
                                int i3 = iA7;
                                List<rti> list = listA;
                                if (((rti) obj).a == i) {
                                    arrayList3.add(obj);
                                }
                                iA7 = i3;
                                listA = list;
                            }
                            int i4 = iA7;
                            List<rti> list2 = listA;
                            int size = arrayList3.size();
                            int i5 = 0;
                            while (i5 < size) {
                                Object obj2 = arrayList3.get(i5);
                                i5++;
                                rti rtiVar = (rti) obj2;
                                arrayList.add(rtiVar.c);
                                arrayList2.add(rtiVar.d);
                                arrayList3 = arrayList3;
                            }
                            ph80Var2.add(new c(hq60VarH2.k1(iA8), hq60VarH2.k1(iA9), hq60VarH2.k1(iA10), arrayList, arrayList2));
                            iA6 = i2;
                            iA7 = i4;
                            listA = list2;
                        }
                    }
                    ph80 ph80VarA = wi80.a(ph80Var2);
                    vc1.a(hq60VarH2, null);
                    hq60 hq60VarH3 = vp60Var.H1("PRAGMA index_list(`" + str + "`)");
                    try {
                        int iA11 = jq60.a(hq60VarH3, "name");
                        int iA12 = jq60.a(hq60VarH3, "origin");
                        int iA13 = jq60.a(hq60VarH3, "unique");
                        if (iA11 == -1 || iA12 == -1 || iA13 == -1) {
                            vc1.a(hq60VarH3, null);
                            ph80Var = null;
                        } else {
                            ph80 ph80Var3 = new ph80();
                            while (hq60VarH3.D1()) {
                                if ("c".equals(hq60VarH3.k1(iA12))) {
                                    d dVarB = cn70.b(vp60Var, hq60VarH3.k1(iA11), hq60VarH3.getLong(iA13) == 1);
                                    if (dVarB == null) {
                                        vc1.a(hq60VarH3, null);
                                        ph80Var = null;
                                    } else {
                                        ph80Var3.add(dVarB);
                                    }
                                }
                            }
                            ph80 ph80VarA2 = wi80.a(ph80Var3);
                            vc1.a(hq60VarH3, null);
                            ph80Var = ph80VarA2;
                        }
                        return new o3f0(str, mapC, ph80VarA, ph80Var);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            vc1.a(hq60VarH3, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        vc1.a(hq60VarH2, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    vc1.a(hq60VarH1, th5);
                    throw th6;
                }
            }
        }
    }

    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public c(String str, String str2, String str3, List<String> list, List<String> list2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            list2.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = list;
            this.e = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d)) {
                return Intrinsics.g(this.e, cVar.e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + ai50.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
            sb.append(this.a);
            sb.append("',\n            |   onDelete = '");
            sb.append(this.b);
            sb.append("',\n            |   onUpdate = '");
            sb.append(this.c);
            sb.append("',\n            |   columnNames = {");
            qae0.b(CollectionsKt.a0(CollectionsKt.q0(this.d), ",", null, null, null, 62));
            qae0.b("},");
            Unit unit = Unit.a;
            sb.append(unit);
            sb.append("\n            |   referenceColumnNames = {");
            qae0.b(CollectionsKt.a0(CollectionsKt.q0(this.e), ",", null, null, null, 62));
            qae0.b(" }");
            sb.append(unit);
            sb.append("\n            |}\n        ");
            return qae0.b(qae0.d(sb.toString()));
        }
    }

    public static final class d {
        public final String a;
        public final boolean b;
        public final List<String> c;
        public final List<String> d;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
        public d(String str, boolean z, List<String> list, List<String> list2) {
            str.getClass();
            list.getClass();
            list2.getClass();
            this.a = str;
            this.b = z;
            this.c = list;
            this.d = list2;
            if (list2.isEmpty()) {
                int size = list.size();
                list2 = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    list2.add("ASC");
                }
            }
            this.d = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                String str = dVar.a;
                if (this.b == dVar.b && Intrinsics.g(this.c, dVar.c) && Intrinsics.g(this.d, dVar.d)) {
                    String str2 = this.a;
                    return kotlin.text.c.u(str2, "index_", false) ? kotlin.text.c.u(str, "index_", false) : str2.equals(str);
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.a;
            return this.d.hashCode() + ai50.a((((kotlin.text.c.u(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
            sb.append(this.a);
            sb.append("',\n            |   unique = '");
            sb.append(this.b);
            sb.append("',\n            |   columns = {");
            qae0.b(CollectionsKt.a0(this.c, ",", null, null, null, 62));
            qae0.b("},");
            Unit unit = Unit.a;
            sb.append(unit);
            sb.append("\n            |   orders = {");
            qae0.b(CollectionsKt.a0(this.d, ",", null, null, null, 62));
            qae0.b(" }");
            sb.append(unit);
            sb.append("\n            |}\n        ");
            return qae0.b(qae0.d(sb.toString()));
        }
    }

    public o3f0(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    @fae
    public static final o3f0 a(rzi rziVar, String str) {
        return b.a(new ufe0(rziVar), str);
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3f0)) {
            return false;
        }
        o3f0 o3f0Var = (o3f0) obj;
        if (!this.a.equals(o3f0Var.a) || !this.b.equals(o3f0Var.b) || !Intrinsics.g(this.c, o3f0Var.c)) {
            return false;
        }
        Set<d> set2 = this.d;
        if (set2 == null || (set = o3f0Var.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        Collection collectionR0;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(r3f0.b(CollectionsKt.r0(this.b.values(), new p3f0())));
        sb.append("\n            |    foreignKeys = {");
        sb.append(r3f0.b(this.c));
        sb.append("\n            |    indices = {");
        Set<d> set = this.d;
        if (set == null || (collectionR0 = CollectionsKt.r0(set, new q3f0())) == null) {
            collectionR0 = m2g.a;
        }
        sb.append(r3f0.b(collectionR0));
        sb.append("\n            |}\n        ");
        return qae0.d(sb.toString());
    }
}
