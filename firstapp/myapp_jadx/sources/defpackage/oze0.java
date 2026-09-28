package defpackage;

import com.sportygames.newcms.CMSRes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface oze0 {

    public static final class b implements oze0 {
        public final int a;
        public final CMSRes b;
        public final boolean c;
        public final pze0.a d;

        public b(int i, CMSRes cMSRes, boolean z, pze0.a aVar) {
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
            return this.a == bVar.a && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c && this.d.equals(bVar.d) && Float.compare(1.0f, 1.0f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(1.0f) + ((this.d.hashCode() + mtg0.a((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c)) * 31);
        }

        public final String toString() {
            return "Switch(drawableRes=" + this.a + ", name=" + this.b + ", enable=" + this.c + ", clickEvent=" + this.d + ", drawableAlpha=1.0)";
        }
    }

    public static final class a implements oze0 {
        public final int a;
        public final CMSRes b;
        public final pze0.b c;
        public final float d;

        public a(int i, CMSRes cMSRes, pze0.b bVar, float f) {
            cMSRes.getClass();
            this.a = i;
            this.b = cMSRes;
            this.c = bVar;
            this.d = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Float.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + ((this.c.a.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EntryTG(drawableRes=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", clickEvent=");
            sb.append(this.c);
            sb.append(", drawableAlpha=");
            return h70.a(sb, this.d, ')');
        }

        public /* synthetic */ a(int i, CMSRes cMSRes, pze0.b bVar) {
            this(i, cMSRes, bVar, 1.0f);
        }
    }
}
