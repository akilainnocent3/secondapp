package defpackage;

import androidx.transition.nfj.CaBJCMnsV;

/* JADX INFO: loaded from: classes.dex */
public final class dl1 extends lhe0.b {
    public final lhe0 a;

    public dl1(lhe0 lhe0Var) {
        this.a = lhe0Var;
    }

    @Override // lhe0.b
    public final int a() {
        return 0;
    }

    @Override // lhe0.b
    public final lhe0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lhe0.b)) {
            return false;
        }
        lhe0.b bVar = (lhe0.b) obj;
        return bVar.a() == 0 && this.a.equals(bVar.b());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.a + CaBJCMnsV.nHjlz;
    }
}
