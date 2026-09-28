package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ng50<T> {
    public final T a;
    public final String b;

    public static final class a<T> extends ng50<T> {
        public final Throwable c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i, Throwable th) {
            super(null, str);
            th = (i & 2) != 0 ? null : th;
            this.c = th;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class b<T> extends ng50<T> {
        public b() {
            throw null;
        }
    }

    public ng50(T t, String str) {
        this.a = t;
        this.b = str;
    }
}
