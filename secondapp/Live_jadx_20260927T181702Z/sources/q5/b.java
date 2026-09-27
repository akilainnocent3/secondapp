package q5;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b {
    public static boolean a(c cVar) {
        return cVar.getCount() == 0 || cVar.getPosition() == cVar.getCount();
    }

    public static boolean b(c cVar) {
        return cVar.getCount() == 0 || cVar.getPosition() == -1;
    }

    public static boolean c(c cVar) {
        return cVar.getPosition() == 0 && cVar.getCount() != 0;
    }

    public static boolean d(c cVar) {
        int count = cVar.getCount();
        return cVar.getPosition() == count + (-1) && count != 0;
    }

    public static boolean e(c cVar) {
        return cVar.moveToPosition(0);
    }

    public static boolean f(c cVar) {
        return cVar.moveToPosition(cVar.getCount() - 1);
    }

    public static boolean g(c cVar) {
        return cVar.moveToPosition(cVar.getPosition() + 1);
    }

    public static boolean h(c cVar) {
        return cVar.moveToPosition(cVar.getPosition() - 1);
    }
}
