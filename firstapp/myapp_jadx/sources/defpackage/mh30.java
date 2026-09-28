package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class mh30 {
    public final ArrayList a;
    public final Long b;

    public mh30(ArrayList arrayList, Long l) {
        this.a = arrayList;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh30)) {
            return false;
        }
        mh30 mh30Var = (mh30) obj;
        return this.a.equals(mh30Var.a) && this.b.equals(mh30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QuickLiabilityCheckBet(selections=" + this.a + ", stake=" + this.b + ")";
    }
}
