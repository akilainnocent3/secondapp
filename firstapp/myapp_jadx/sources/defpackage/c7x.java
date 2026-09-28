package defpackage;

import com.sportygames.newcms.CMSRes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface c7x {

    public static final class a implements c7x {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1255063079;
        }

        public final String toString() {
            return "Closed";
        }
    }

    public static final class b implements c7x {
        public final fbx a;
        public final String b;
        public final CMSRes c;
        public final e7x d;

        public b(fbx fbxVar, String str, CMSRes cMSRes, e7x e7xVar) {
            fbxVar.getClass();
            str.getClass();
            cMSRes.getClass();
            e7xVar.getClass();
            this.a = fbxVar;
            this.b = str;
            this.c = cMSRes;
            this.d = e7xVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            return "Opened(userPick=" + this.a + ", ticketId=" + this.b + ", resultImg=" + this.c + ", giftState=" + this.d + ')';
        }

        public b() {
            this(0);
        }

        public b(int i) {
            this(fbx.d, "", shj.v0.M, e7x.d.a);
        }
    }
}
