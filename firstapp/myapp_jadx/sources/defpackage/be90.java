package defpackage;

import com.sportygames.newcms.CMSRes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface be90<EVENT> {

    public static final class a<EVENT> implements be90<EVENT> {
        public final int a;
        public final CMSRes b;
        public final EVENT c;

        public a(int i, CMSRes cMSRes, EVENT event) {
            cMSRes.getClass();
            this.a = i;
            this.b = cMSRes;
            this.c = event;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EntryTG(drawableRes=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", clickEvent=");
            return ekw.a(sb, this.c, ')');
        }
    }

    public static final class b<EVENT> implements be90<EVENT> {
        public final int a;
        public final CMSRes b;
        public final boolean c;
        public final EVENT d;

        public b(int i, CMSRes cMSRes, boolean z, EVENT event) {
            cMSRes.getClass();
            this.a = i;
            this.b = cMSRes;
            this.c = z;
            this.d = event;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c && this.d.equals(bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + mtg0.a((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Switch(drawableRes=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", enable=");
            sb.append(this.c);
            sb.append(", clickEvent=");
            return ekw.a(sb, this.d, ')');
        }
    }
}
