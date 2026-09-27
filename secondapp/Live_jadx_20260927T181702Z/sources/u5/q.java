package u5;

import a5.z;
import java.util.NoSuchElementException;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f139250a = new a();

    long a();

    long b();

    z c();

    boolean isEnded();

    boolean next();

    void reset();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements q {
        @Override // u5.q
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // u5.q
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // u5.q
        public z c() {
            throw new NoSuchElementException();
        }

        @Override // u5.q
        public boolean isEnded() {
            return true;
        }

        @Override // u5.q
        public boolean next() {
            return false;
        }

        @Override // u5.q
        public void reset() {
        }
    }
}
