package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class r1 {
    public String a;
    public String b;
    public int c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            String str = this.b;
            String str2 = ((r1) obj).b;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
