package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c9h extends Exception {
    public static final /* synthetic */ int a = 0;

    public static final class a extends c9h {
        public final xpm.a b;
        public final Throwable c;

        public a(xpm.a aVar, Throwable th) {
            super(th);
            this.b = aVar;
            this.c = th;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.c;
        }
    }
}
