package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface mt00 {

    public static final class a implements mt00 {
        public final Event a;
        public final String b;
        public final String c;
        public final ArrayList d;
        public final ArrayList e;

        /* JADX INFO: renamed from: mt00$a$a, reason: collision with other inner class name */
        public static final class C0878a {
            public final String a;
            public final Market b;

            public C0878a(Market market, String str) {
                this.a = str;
                this.b = market;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0878a)) {
                    return false;
                }
                C0878a c0878a = (C0878a) obj;
                return this.a.equals(c0878a.a) && this.b.equals(c0878a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Row(entityName=" + this.a + ", market=" + this.b + ")";
            }
        }

        public a(Event event, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
            str.getClass();
            this.a = event;
            this.b = str;
            this.c = str2;
            this.d = arrayList;
            this.e = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
        }

        @Override // defpackage.mt00
        public final String getKey() {
            return lx5.a("grid_", this.a.eventId, "_", this.b);
        }

        public final int hashCode() {
            return this.e.hashCode() + vt5.a(this.d, gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        }

        public final String toString() {
            return "Grid(event=" + this.a + ", marketId=" + this.b + ", headline=" + this.c + ", columnTitles=" + this.d + ", rows=" + this.e + ")";
        }
    }

    public static final class b implements mt00 {
        public final Event a;
        public final Market b;

        public b(Event event, Market market) {
            this.a = event;
            this.b = market;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        @Override // defpackage.mt00
        public final String getKey() {
            String str = this.a.eventId;
            Market market = this.b;
            String str2 = market.id;
            String str3 = market.specifier;
            StringBuilder sbA = ux5.a("single_", str, "_", str2, "_");
            sbA.append(str3);
            return sbA.toString();
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Single(event=" + this.a + ", market=" + this.b + ")";
        }
    }

    String getKey();
}
