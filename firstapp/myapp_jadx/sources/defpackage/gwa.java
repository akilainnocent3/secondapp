package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class gwa {
    public final String a;
    public int b;
    public boolean c;

    public gwa(String str) {
        if (str != null) {
            this.a = str;
        } else {
            hb5.a("name cannot be null.");
            throw null;
        }
    }

    public final String toString() {
        return this.a;
    }
}
