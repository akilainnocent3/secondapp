package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class och0 {
    public final String a;
    public final String b;

    public och0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof och0)) {
            return false;
        }
        och0 och0Var = (och0) obj;
        return this.a.equals(och0Var.a) && this.b.equals(och0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("UiInteractionTarget(activityName=", this.a, ", viewId=", this.b, ")");
    }
}
