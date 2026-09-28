package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class afs {
    public static final afs c = new afs(a.c, 17, 0);
    public final float a;
    public final int b;

    public static final class a {
        public static final float b;
        public static final float c;
        public static final float d;
        public final float a;

        static {
            a(0.0f);
            a(0.5f);
            b = 0.5f;
            a(-1.0f);
            c = -1.0f;
            a(1.0f);
            d = 1.0f;
        }

        public static void a(float f) {
            if ((0.0f > f || f > 1.0f) && f != -1.0f) {
                xkn.c("topRatio should be in [0..1] range or -1");
            }
        }

        public static String b(float f) {
            if (f == 0.0f) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == b) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == c) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f == d) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Float.compare(this.a, ((a) obj).a) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return b(this.a);
        }
    }

    public static final class b {
        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "Mode(value=0)";
        }
    }

    public static final class c {
        public final int a;

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.a == ((c) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            int i = this.a;
            if (i == 1) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i == 16) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i == 17) {
                return "LineHeightStyle.Trim.Both";
            }
            return i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
    }

    public afs(float f, int i, int i2) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afs)) {
            return false;
        }
        afs afsVar = (afs) obj;
        float f = afsVar.a;
        float f2 = a.b;
        return Float.compare(this.a, f) == 0 && this.b == afsVar.b;
    }

    public final int hashCode() {
        float f = a.b;
        return Integer.hashCode(0) + gpp.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) a.b(this.a));
        sb.append(", trim=");
        int i = this.b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
