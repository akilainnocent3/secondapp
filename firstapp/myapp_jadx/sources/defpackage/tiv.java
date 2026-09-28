package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public interface tiv {
    public static final a a = new a();

    public class a implements tiv {
        @Override // defpackage.tiv
        public final long a() {
            throw new NoSuchElementException();
        }

        @Override // defpackage.tiv
        public final long b() {
            throw new NoSuchElementException();
        }

        @Override // defpackage.tiv
        public final boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
