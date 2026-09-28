package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bj0 {
    public final tx90 a;
    public final wby<a> b = new wby<>(0);
    public final a c = new a();

    public static class a {
        public lh0 a;
        public lh0 b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            a aVar = (a) obj;
            lh0 lh0Var = this.a;
            lh0 lh0Var2 = aVar.a;
            if (lh0Var == null) {
                if (lh0Var2 != null) {
                    return false;
                }
            } else if (!lh0Var.equals(lh0Var2)) {
                return false;
            }
            lh0 lh0Var3 = this.b;
            lh0 lh0Var4 = aVar.b;
            if (lh0Var3 == null) {
                if (lh0Var4 != null) {
                    return false;
                }
            } else if (!lh0Var3.equals(lh0Var4)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 31) * 31);
        }

        public final String toString() {
            return this.a.a + "->" + this.b.a;
        }
    }

    public bj0(tx90 tx90Var) {
        if (tx90Var != null) {
            this.a = tx90Var;
        } else {
            hb5.a("skeletonData cannot be null.");
            throw null;
        }
    }
}
