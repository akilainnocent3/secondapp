package yads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f154494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f154495c;

    public qk1(String str, boolean z10, boolean z11) {
        this.f154493a = str;
        this.f154494b = z10;
        this.f154495c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == qk1.class) {
            qk1 qk1Var = (qk1) obj;
            if (TextUtils.equals(this.f154493a, qk1Var.f154493a) && this.f154494b == qk1Var.f154494b && this.f154495c == qk1Var.f154495c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((k4.a(this.f154493a, 31, 31) + (this.f154494b ? 1231 : 1237)) * 31) + (this.f154495c ? 1231 : 1237);
    }
}
