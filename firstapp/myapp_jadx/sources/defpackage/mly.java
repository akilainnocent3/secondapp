package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface mly {
    int a(int i);

    int b(int i);

    public static final class a {
        public static final C0873a a = new C0873a();

        /* JADX INFO: renamed from: mly$a$a, reason: collision with other inner class name */
        public static final class C0873a implements mly {
            @Override // defpackage.mly
            public final int a(int i) {
                return i;
            }

            @Override // defpackage.mly
            public final int b(int i) {
                return i;
            }
        }
    }
}
