package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class itw<T> {
    public String a;
    public String b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof frz)) {
            return false;
        }
        frz frzVar = (frz) obj;
        F f = frzVar.a;
        Object obj2 = this.a;
        if (f != obj2 && (f == 0 || !f.equals(obj2))) {
            return false;
        }
        S s = frzVar.b;
        Object obj3 = this.b;
        if (s != obj3) {
            return s != 0 && s.equals(obj3);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + ((Object) this.a) + " " + ((Object) this.b) + "}";
    }
}
