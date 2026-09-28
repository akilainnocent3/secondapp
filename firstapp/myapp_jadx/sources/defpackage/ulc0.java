package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes5.dex */
public interface ulc0 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final List<ulc0> b = b.k(p1z.b, hbl.b, p9j.b);
        public static final mpe0 c = hwr.b(new tlc0());
        public static final ArrayList d;
        public static final ArrayList e;
        public static final ArrayList f;
        public static final ArrayList g;
        public static final ArrayList h;
        public static final ArrayList i;
        public static final ArrayList j;
        public static final ArrayList k;

        static {
            List listA = a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                ulc0 ulc0Var = (ulc0) obj;
                if (ulc0Var.b() == p7v.a && ulc0Var.a() == v6v.a && ulc0Var.getResult() == j7v.a) {
                    arrayList.add(obj);
                }
            }
            d = arrayList;
            List listA2 = a();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listA2) {
                ulc0 ulc0Var2 = (ulc0) obj2;
                if (ulc0Var2.b() == p7v.b && ulc0Var2.a() == v6v.a && ulc0Var2.getResult() == j7v.a) {
                    arrayList2.add(obj2);
                }
            }
            e = arrayList2;
            List listA3 = a();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : listA3) {
                ulc0 ulc0Var3 = (ulc0) obj3;
                if (ulc0Var3.b() == p7v.a && ulc0Var3.a() == v6v.a && ulc0Var3.getResult() == j7v.b) {
                    arrayList3.add(obj3);
                }
            }
            f = arrayList3;
            List listA4 = a();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : listA4) {
                ulc0 ulc0Var4 = (ulc0) obj4;
                if (ulc0Var4.b() == p7v.b && ulc0Var4.a() == v6v.a && ulc0Var4.getResult() == j7v.b) {
                    arrayList4.add(obj4);
                }
            }
            g = arrayList4;
            List listA5 = a();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : listA5) {
                ulc0 ulc0Var5 = (ulc0) obj5;
                if (ulc0Var5.b() == p7v.a && ulc0Var5.a() == v6v.b && ulc0Var5.getResult() == j7v.a) {
                    arrayList5.add(obj5);
                }
            }
            h = arrayList5;
            List listA6 = a();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj6 : listA6) {
                ulc0 ulc0Var6 = (ulc0) obj6;
                if (ulc0Var6.b() == p7v.b && ulc0Var6.a() == v6v.b && ulc0Var6.getResult() == j7v.a) {
                    arrayList6.add(obj6);
                }
            }
            i = arrayList6;
            List listA7 = a();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj7 : listA7) {
                ulc0 ulc0Var7 = (ulc0) obj7;
                if (ulc0Var7.b() == p7v.a && ulc0Var7.a() == v6v.b && ulc0Var7.getResult() == j7v.b) {
                    arrayList7.add(obj7);
                }
            }
            j = arrayList7;
            List listA8 = a();
            ArrayList arrayList8 = new ArrayList();
            for (Object obj8 : listA8) {
                ulc0 ulc0Var8 = (ulc0) obj8;
                if (ulc0Var8.b() == p7v.b && ulc0Var8.a() == v6v.b && ulc0Var8.getResult() == j7v.b) {
                    arrayList8.add(obj8);
                }
            }
            k = arrayList8;
        }

        public static List a() {
            return (List) c.getValue();
        }
    }

    default v6v a() {
        return null;
    }

    default p7v b() {
        return null;
    }

    default Integer c() {
        return null;
    }

    String d();

    default j7v getResult() {
        return null;
    }
}
