package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pg f153927a = new pg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile fh f153928b;

    public static final fh a(Context context) {
        fh fhVar;
        fh fhVar2 = f153928b;
        if (fhVar2 != null) {
            return fhVar2;
        }
        synchronized (f153927a) {
            Context contextA = uz.a(context);
            fhVar = f153928b;
            if (fhVar == null) {
                fhVar = new fh(new zg(contextA));
                f153928b = fhVar;
            }
        }
        return fhVar;
    }
}
