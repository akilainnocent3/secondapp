package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fae
public final class rmh0 implements nk0.a {
    public final String a;

    public rmh0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rmh0) {
            return this.a.equals(((rmh0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j26.a(new StringBuilder("UrlAnnotation(url="), this.a, ')');
    }
}
