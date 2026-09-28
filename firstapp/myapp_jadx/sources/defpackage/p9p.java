package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class p9p {
    public static final toe0 a = new toe0("COMPLETING_ALREADY");
    public static final toe0 b = new toe0("COMPLETING_WAITING_CHILDREN");
    public static final toe0 c = new toe0("COMPLETING_RETRY");
    public static final toe0 d = new toe0("TOO_LATE_TO_CANCEL");
    public static final toe0 e = new toe0("SEALED");
    public static final o1g f = new o1g(false);
    public static final o1g g = new o1g(true);

    public static final Object a(Object obj) {
        ven venVar = obj instanceof ven ? (ven) obj : null;
        return venVar != null ? venVar.a : obj;
    }
}
