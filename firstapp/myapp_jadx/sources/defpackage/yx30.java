package defpackage;

import com.appsflyer.internal.v;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class yx30<T> implements Serializable {
    public final Comparator<T> a = a.a;
    public transient int b;
    public final Integer c;
    public final Integer d;
    public transient String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a implements Comparator {
        public static final a a;
        public static final /* synthetic */ a[] b;

        static {
            a aVar = new a("INSTANCE", 0);
            a = aVar;
            b = new a[]{aVar};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public yx30(Integer num, Integer num2) {
        if (num.compareTo(num2) < 1) {
            this.d = num;
            this.c = num2;
        } else {
            this.d = num2;
            this.c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != yx30.class) {
            return false;
        }
        yx30 yx30Var = (yx30) obj;
        return this.d.equals(yx30Var.d) && this.c.equals(yx30Var.c);
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.c.hashCode() + ((this.d.hashCode() + ((yx30.class.hashCode() + 629) * 37)) * 37);
        this.b = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.d);
        sb.append("..");
        String strA = v.a(sb, this.c, "]");
        this.e = strA;
        return strA;
    }
}
