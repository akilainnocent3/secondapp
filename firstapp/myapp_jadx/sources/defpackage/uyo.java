package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uyo extends q6n {
    public final String b;
    public final String c;
    public final String d;

    public uyo(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uyo.class != obj.getClass()) {
            return false;
        }
        uyo uyoVar = (uyo) obj;
        return this.c.equals(uyoVar.c) && this.b.equals(uyoVar.b) && this.d.equals(uyoVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(527, 31, this.b), 31, this.c);
    }

    @Override // defpackage.q6n
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
