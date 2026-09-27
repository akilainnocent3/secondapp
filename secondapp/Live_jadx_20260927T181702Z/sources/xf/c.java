package xf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c {
    public static boolean a(d dVar) {
        return dVar.getCount() == 0 || dVar.getPosition() == dVar.getCount();
    }

    public static boolean b(d dVar) {
        return dVar.getCount() == 0 || dVar.getPosition() == -1;
    }

    public static boolean c(d dVar) {
        return dVar.getPosition() == 0 && dVar.getCount() != 0;
    }

    public static boolean d(d dVar) {
        int count = dVar.getCount();
        return dVar.getPosition() == count + (-1) && count != 0;
    }

    public static boolean e(d dVar) {
        return dVar.moveToPosition(0);
    }

    public static boolean f(d dVar) {
        return dVar.moveToPosition(dVar.getCount() - 1);
    }

    public static boolean g(d dVar) {
        return dVar.moveToPosition(dVar.getPosition() + 1);
    }

    public static boolean h(d dVar) {
        return dVar.moveToPosition(dVar.getPosition() - 1);
    }
}
