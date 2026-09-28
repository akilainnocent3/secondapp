package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class db00 {
    public final float a;

    public db00(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db00) && g7f.b(this.a, ((db00) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return tug.a("PenaltySettlementEndAnimationLayoutState(textYouWonTopPadding=", g7f.c(this.a), ")");
    }
}
