package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class ll {
    public final String a;
    public final int b;

    public ll(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll)) {
            return false;
        }
        ll llVar = (ll) obj;
        return this.a.equals(llVar.a) && this.b == llVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return d830.a(this.b, "AddingWidgetStepData(imageUrl=", this.a, ", content=", ")");
    }
}
