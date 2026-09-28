package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ljg0 {
    public static final ljg0 d = new ljg0(new jjg0[0]);
    public final int a;
    public final c150 b;
    public int c;

    static {
        jrh0.J(0);
    }

    public ljg0(jjg0... jjg0VarArr) {
        c150 c150VarK = pcn.k(jjg0VarArr);
        this.b = c150VarK;
        this.a = jjg0VarArr.length;
        int i = 0;
        while (i < c150VarK.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < c150VarK.d; i3++) {
                if (((jjg0) c150VarK.get(i)).equals(c150VarK.get(i3))) {
                    cft.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final jjg0 a(int i) {
        return (jjg0) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ljg0.class != obj.getClass()) {
            return false;
        }
        ljg0 ljg0Var = (ljg0) obj;
        return this.a == ljg0Var.a && this.b.equals(ljg0Var.b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b.toString();
    }
}
