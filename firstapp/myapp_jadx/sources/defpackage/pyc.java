package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface pyc {

    public static final class a implements pyc {
        public final Date a;
        public final Date b;

        public a(Date date, Date date2) {
            date.getClass();
            date2.getClass();
            this.a = date;
            this.b = date2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Selected(startDate=" + this.a + ", endDate=" + this.b + ")";
        }
    }

    public static final class b implements pyc {
        public static final b a = new b();
    }
}
