package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class uc70 implements vc70 {
    public final String a;

    public uc70(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uc70) && this.a.equals(((uc70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("NavigateToBetHistoryPage(sportId=", this.a, ")");
    }
}
