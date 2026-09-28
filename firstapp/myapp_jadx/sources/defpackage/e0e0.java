package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class e0e0 {
    public final String a;
    public final String b;
    public final String c;

    public e0e0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0e0)) {
            return false;
        }
        e0e0 e0e0Var = (e0e0) obj;
        return this.a.equals(e0e0Var.a) && this.b.equals(e0e0Var.b) && this.c.equals(e0e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StepData(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", imageUrl1=");
        return j26.a(sb, this.c, ')');
    }
}
