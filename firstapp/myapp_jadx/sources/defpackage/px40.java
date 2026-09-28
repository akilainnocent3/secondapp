package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final class px40 {
    public static final Set<String> a = wi80.b("999");

    public static boolean a(String str, List list, Collection collection) {
        str.getClass();
        list.getClass();
        collection.getClass();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Regex) it.next()).f(str)) {
                    return true;
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        Collection<a> collection2 = collection;
        if (!collection2.isEmpty()) {
            for (a aVar : collection2) {
                if (str.length() == aVar.a) {
                    Set<String> set = aVar.b;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator<T> it2 = set.iterator();
                        while (it2.hasNext()) {
                            if (c.u(str, (String) it2.next(), false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final class a {
        public final int a;
        public final Set<String> b;

        public a(int i, Set<String> set) {
            set.getClass();
            this.a = i;
            this.b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Rule(totalLength=" + this.a + ", prefixes=" + this.b + ")";
        }

        public a(int i) {
            this(i, px40.a);
        }
    }
}
