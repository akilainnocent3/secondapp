package defpackage;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface g0i0 {

    public static final class a implements g0i0 {
        public static final a a = new a();
    }

    public static final class b implements g0i0 {
        public static final b a = new b();
    }

    public static final class c implements g0i0 {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ShouldUpgradeAppVersion(message=", this.a, ")");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class d implements g0i0 {
        public final String a;
        public final String b;
        public final boolean c;

        public d(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return mq0.a(ux5.a("Success(otpCode=", this.a, ", otpToken=", this.b, ", isTrustedDevice="), this.c, QWvyvNzGsBpRT.WiddbjlhODA);
        }
    }

    public static final class e implements g0i0 {
        public static final e a = new e();
    }
}
