package yads;

import android.text.TextUtils;
import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class q01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154216b;

    public q01(String str, String str2) {
        this.f154215a = str;
        this.f154216b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q01.class == obj.getClass()) {
            q01 q01Var = (q01) obj;
            if (TextUtils.equals(this.f154215a, q01Var.f154215a) && TextUtils.equals(this.f154216b, q01Var.f154216b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f154216b.hashCode() + (this.f154215a.hashCode() * 31);
    }

    public final String toString() {
        return "Header[name=" + this.f154215a + ",value=" + this.f154216b + C4235d4.j.f61462e;
    }
}
