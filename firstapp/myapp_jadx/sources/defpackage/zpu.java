package defpackage;

import com.sportybet.plugin.realsports.data.Market;

/* JADX INFO: loaded from: classes7.dex */
public final class zpu {

    public interface a {

        /* JADX INFO: renamed from: zpu$a$a, reason: collision with other inner class name */
        public static final class C1409a implements a {
            public final Market a;
            public final String b;

            public C1409a(Market market, String str) {
                this.a = market;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1409a)) {
                    return false;
                }
                C1409a c1409a = (C1409a) obj;
                return this.a.equals(c1409a.a) && this.b.equals(c1409a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Combined(market=" + this.a + ", groupName=" + this.b + ")";
            }
        }

        public static final class b implements a {
            public final Market a;

            public b(Market market) {
                this.a = market;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a.equals(((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Single(market=" + this.a + ")";
            }
        }
    }
}
