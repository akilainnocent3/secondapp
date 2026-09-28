package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class zsz {
    public final boolean a;
    public final s24 b;

    public zsz(boolean z, s24 s24Var) {
        s24Var.getClass();
        this.a = z;
        this.b = s24Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsz)) {
            return false;
        }
        zsz zszVar = (zsz) obj;
        return this.a == zszVar.a && this.b == zszVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ParticipateBettingStreakMissionRequest(previewMission=" + this.a + ", type=" + this.b + ")";
    }
}
