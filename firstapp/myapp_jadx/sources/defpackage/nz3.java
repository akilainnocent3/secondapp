package defpackage;

import com.appsflyer.internal.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface nz3 {

    public static final class a implements nz3 {
        public final long a;
        public final String b;
        public final String c;
        public final boolean d;

        public a(long j, String str, String str2, boolean z) {
            this.a = j;
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        public static a d(a aVar, boolean z) {
            return new a(aVar.a, aVar.b, aVar.c, z);
        }

        @Override // defpackage.nz3
        public final String a() {
            return this.b;
        }

        @Override // defpackage.nz3
        public final String b() {
            return this.c;
        }

        @Override // defpackage.nz3
        public final long c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b) && Intrinsics.g(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            int iA = gmf0.a(Long.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            return Boolean.hashCode(this.d) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbA = b0.a(this.a, "Confirm(themeId=", ", thumbnailPath=", this.b);
            sbA.append(", themeName=");
            sbA.append(this.c);
            sbA.append(", loading=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b implements nz3 {
        public final long a;
        public final String b;
        public final String c;
        public final boolean d;

        public b(long j, String str, String str2, boolean z) {
            this.a = j;
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        public static b d(b bVar, boolean z) {
            return new b(bVar.a, bVar.b, bVar.c, z);
        }

        @Override // defpackage.nz3
        public final String a() {
            return this.b;
        }

        @Override // defpackage.nz3
        public final String b() {
            return this.c;
        }

        @Override // defpackage.nz3
        public final long c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.equals(bVar.b) && Intrinsics.g(this.c, bVar.c) && this.d == bVar.d;
        }

        public final int hashCode() {
            int iA = gmf0.a(Long.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            return Boolean.hashCode(this.d) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbA = b0.a(this.a, "Earned(themeId=", ", thumbnailPath=", this.b);
            sbA.append(", themeName=");
            sbA.append(this.c);
            sbA.append(", loading=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    String a();

    String b();

    long c();
}
