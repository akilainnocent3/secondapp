package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ek70 {
    public final String a;
    public final String b;
    public final b c;
    public final a d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("START", 0);
            a = aVar;
            a aVar2 = new a("END", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final /* synthetic */ b[] c;

        static {
            b bVar = new b("HOME", 0);
            a = bVar;
            b bVar2 = new b("AWAY", 1);
            b = bVar2;
            c = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    public ek70(String str, String str2, b bVar, a aVar) {
        bVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek70)) {
            return false;
        }
        ek70 ek70Var = (ek70) obj;
        return this.a.equals(ek70Var.a) && this.b.equals(ek70Var.b) && this.c == ek70Var.c && this.d == ek70Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ScheduledFootballTeamNameplateState(nameText=", this.a, ", logoUrl=", this.b, ", team=");
        sbA.append(this.c);
        sbA.append(", logoPosition=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
