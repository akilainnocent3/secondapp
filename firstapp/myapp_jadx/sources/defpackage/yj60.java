package defpackage;

import com.sportygames.newcms.CMSRes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface yj60 {

    public static final class a implements yj60 {
        public final cl60 a = new cl60(j58.m);
        public final d0b b = d0b.a.b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + (Integer.hashCode(2131233729) * 31)) * 31);
        }

        public final String toString() {
            return "Local(drawableRes=2131233729, color=" + this.a + ", contentScale=" + this.b + ')';
        }
    }

    public interface b extends yj60 {

        public static final class a implements b {
            public final CMSRes a;
            public final CMSRes b;
            public final CMSRes c;
            public final CMSRes d;
            public final d0b e;

            public a(CMSRes cMSRes) {
                cMSRes.getClass();
                cMSRes.getClass();
                cMSRes.getClass();
                cMSRes.getClass();
                this.a = cMSRes;
                this.b = cMSRes;
                this.c = cMSRes;
                this.d = cMSRes;
                this.e = d0b.a.b;
            }

            @Override // yj60.b
            public final d0b a() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.g(this.a, aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "CMSResIcon(defaultRes=" + this.a + ", activeRes=" + this.b + ", activeUrlDisable=" + this.c + ", disabledRes=" + this.d + ", contentScale=" + this.e + ')';
            }
        }

        /* JADX INFO: renamed from: yj60$b$b, reason: collision with other inner class name */
        public static final class C1348b implements b {
            @Override // yj60.b
            public final d0b a() {
                return null;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1348b);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Url(defaultUrl=null, activeUrl=null, activeUrlDisable=null, disabledUrl=null, contentScale=null)";
            }
        }

        d0b a();
    }
}
