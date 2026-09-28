package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes8.dex */
public final class tn70<T> {
    public final ArrayList a = new ArrayList();

    public static final class a<T> {
        public final String toString() {
            StringJoiner stringJoiner = new StringJoiner(", ", "Condition{", "}");
            stringJoiner.add("scopeMatcher=null");
            stringJoiner.add("scopeConfig=null");
            return stringJoiner.toString();
        }
    }

    public static class b<T> implements Function {
        public final ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Iterator it = this.a.iterator();
            if (!it.hasNext()) {
                return null;
            }
            ((a) it.next()).getClass();
            throw null;
        }

        public final String toString() {
            StringJoiner stringJoiner = new StringJoiner(", ", "ScopeConfiguratorImpl{", "}");
            stringJoiner.add("conditions=" + ((String) this.a.stream().map(new un70()).collect(Collectors.joining(",", "[", "]"))));
            return stringJoiner.toString();
        }
    }
}
