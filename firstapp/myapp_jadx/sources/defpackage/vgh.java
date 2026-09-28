package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vgh {
    public final lk50<Sports> a;
    public final lk50<Round> b;

    /* JADX WARN: Multi-variable type inference failed */
    public vgh(lk50<Sports> lk50Var, lk50<? extends Round> lk50Var2) {
        this.a = lk50Var;
        this.b = lk50Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgh)) {
            return false;
        }
        vgh vghVar = (vgh) obj;
        return Intrinsics.g(this.a, vghVar.a) && Intrinsics.g(this.b, vghVar.b);
    }

    public final int hashCode() {
        lk50<Sports> lk50Var = this.a;
        int iHashCode = (lk50Var == null ? 0 : lk50Var.hashCode()) * 31;
        lk50<Round> lk50Var2 = this.b;
        return iHashCode + (lk50Var2 != null ? lk50Var2.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturedVirtualData(sportConfigResults=" + this.a + ", roundResults=" + this.b + ")";
    }
}
