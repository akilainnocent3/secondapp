package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wx20 {
    public final int a;

    public wx20(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wx20) {
            return this.a == ((wx20) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
