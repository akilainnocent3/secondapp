package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class csp implements Comparable<csp> {
    public static final a b = new a(null);
    public static final csp c = new csp();
    public final int a = 132096;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(csp cspVar) {
        csp cspVar2 = cspVar;
        cspVar2.getClass();
        return this.a - cspVar2.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        csp cspVar = obj instanceof csp ? (csp) obj : null;
        return cspVar != null && this.a == cspVar.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.4.0";
    }
}
