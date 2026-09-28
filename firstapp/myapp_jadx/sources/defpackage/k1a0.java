package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k1a0 implements uov.a {
    public final ArrayList a;

    public static final class a {
        public final long a;
        public final long b;
        public final int c;

        public a(int i, long j, long j2) {
            ly0.b(j < j2);
            this.a = j;
            this.b = j2;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
        }

        public final String toString() {
            String str = jrh0.a;
            Locale locale = Locale.US;
            StringBuilder sbA = q6a0.a(this.a, "Segment: startTimeMs=", ", endTimeMs=");
            sbA.append(this.b);
            sbA.append(", speedDivisor=");
            sbA.append(this.c);
            return sbA.toString();
        }
    }

    public k1a0(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((a) arrayList.get(0)).b;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((a) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                }
                j = ((a) arrayList.get(i)).b;
            }
        }
        ly0.b(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k1a0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((k1a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
