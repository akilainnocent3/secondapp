package defpackage;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ps1 {

    public static final class a extends ps1 {
        public final List<j58> a;

        public a(List<j58> list) {
            list.getClass();
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return p.a("Gradient(colors=", ")", this.a);
        }
    }

    public static final class b extends ps1 {
        public final long a;

        public b(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            long j = ((b) obj).a;
            int i = j58.n;
            return nbh0.a(this.a, j);
        }

        public final int hashCode() {
            int i = j58.n;
            nbh0.a aVar = nbh0.b;
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return tug.a("SolidColor(color=", j58.i(this.a), ")");
        }
    }
}
