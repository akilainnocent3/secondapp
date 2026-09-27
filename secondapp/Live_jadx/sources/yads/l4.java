package yads;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f151860d;

    public l4(int i10, String str, String str2, String str3) {
        this.f151857a = i10;
        this.f151858b = str;
        this.f151859c = str2;
        this.f151860d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return this.f151857a == l4Var.f151857a && kotlin.jvm.internal.m0.g(this.f151858b, l4Var.f151858b) && kotlin.jvm.internal.m0.g(this.f151859c, l4Var.f151859c) && kotlin.jvm.internal.m0.g(this.f151860d, l4Var.f151860d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f151859c, k4.a(this.f151858b, this.f151857a * 31, 31), 31);
        String str = this.f151860d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
        String str = String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s, adUnitId: %s, display_message: %s)", Arrays.copyOf(new Object[]{Integer.valueOf(this.f151857a), this.f151858b, this.f151860d, this.f151859c}, 4));
        kotlin.jvm.internal.m0.o(str, "format(...)");
        return str;
    }
}
