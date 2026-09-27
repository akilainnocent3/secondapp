package bg;

import ah.d0;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f21302a = new a();

    long a();

    long b();

    d0 c();

    boolean isEnded();

    boolean next();

    void reset();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements o {
        @Override // bg.o
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // bg.o
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // bg.o
        public d0 c() {
            throw new NoSuchElementException();
        }

        @Override // bg.o
        public boolean isEnded() {
            return true;
        }

        @Override // bg.o
        public boolean next() {
            return false;
        }

        @Override // bg.o
        public void reset() {
        }
    }
}
