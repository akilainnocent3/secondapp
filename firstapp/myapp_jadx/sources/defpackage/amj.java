package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class amj {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof amj) {
            return this.a.equals(((amj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zdf0.a(')', "GameNameWrapper(gameName=", this.a);
    }
}
