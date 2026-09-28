package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class sqh implements tt0.a {
    public static final p80 a = p80.d();

    @Override // tt0.a
    public final void a() {
        try {
            p80 p80Var = rqh.e;
        } catch (IllegalStateException e) {
            a.g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
        }
    }
}
