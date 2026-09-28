package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fae
public abstract class z1i {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ a[] b;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("Visible", 0);
            a aVar2 = new a("Clip", 1);
            a = aVar2;
            b = new a[]{aVar, aVar2, new a("ExpandIndicator", 2), new a("ExpandOrCollapseIndicator", 3)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }
    }
}
