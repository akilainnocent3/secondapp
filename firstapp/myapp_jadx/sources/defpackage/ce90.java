package defpackage;

import com.sportygames.newcms.CMSRes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public interface ce90 {

    public static final class a implements ce90 {
        public final int a;
        public final CMSRes b;
        public final cui0.b c;

        public a(int i, CMSRes cMSRes, cui0.b bVar) {
            cMSRes.getClass();
            this.a = i;
            this.b = cMSRes;
            this.c = bVar;
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
            return this.c.a.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            return "Entry(drawableRes=" + this.a + ", name=" + this.b + ", clickEvent=" + this.c + ')';
        }
    }

    public static final class b implements ce90 {
        public final int a;
        public final CMSRes b;
        public final boolean c;
        public final cui0.a d;

        public b(int i, CMSRes cMSRes, boolean z, cui0.a aVar) {
            cMSRes.getClass();
            this.a = i;
            this.b = cMSRes;
            this.c = z;
            this.d = aVar;
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
            return "Switch(drawableRes=" + this.a + ", name=" + this.b + ", enable=" + this.c + ", clickEvent=" + this.d + ')';
        }
    }
}
