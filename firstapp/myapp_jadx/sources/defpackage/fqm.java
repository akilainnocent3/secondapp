package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public abstract class fqm {
    public static final b a;
    public static final /* synthetic */ fqm[] b;

    /* JADX INFO: Fake field, exist only in values array */
    fqm EF0;

    public final enum b extends fqm {
        public b() {
            super("CLIENT", 1);
        }

        public final boolean a(int i) {
            return i >= 400 || i < 100;
        }
    }

    static {
        fqm fqmVar = new fqm() { // from class: fqm.a
        };
        b bVar = new b();
        a = bVar;
        b = new fqm[]{fqmVar, bVar};
    }

    public fqm() {
        throw null;
    }

    public static fqm valueOf(String str) {
        return (fqm) Enum.valueOf(fqm.class, str);
    }

    public static fqm[] values() {
        return (fqm[]) b.clone();
    }
}
