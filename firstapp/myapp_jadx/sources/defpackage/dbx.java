package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface dbx {

    public static final class a implements dbx {
        public final fbx a;
        public final boolean b;

        public a(fbx fbxVar, boolean z) {
            fbxVar.getClass();
            this.a = fbxVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BetResult(userPick=");
            sb.append(this.a);
            sb.append(", isWin=");
            return ruw.a(sb, this.b, ')');
        }
    }

    public static final class b implements dbx {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1003706937;
        }

        public final String toString() {
            return "Init";
        }
    }
}
