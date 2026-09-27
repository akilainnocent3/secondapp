package ah;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface f {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {

        /* JADX INFO: renamed from: ah.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0018a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList<C0019a> f5109a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: ah.f$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public static final class C0019a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Handler f5110a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final a f5111b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f5112c;

                public C0019a(Handler handler, a aVar) {
                    this.f5110a = handler;
                    this.f5111b = aVar;
                }

                public void d() {
                    this.f5112c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                eh.a.g(handler);
                eh.a.g(aVar);
                d(aVar);
                this.f5109a.add(new C0019a(handler, aVar));
            }

            public void c(int i10, long j10, long j11) {
                final int i11;
                final long j12;
                final long j13;
                for (final C0019a c0019a : this.f5109a) {
                    if (c0019a.f5112c) {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                    } else {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                        c0019a.f5110a.post(new Runnable() { // from class: ah.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0019a.f5111b.onBandwidthSample(i11, j12, j13);
                            }
                        });
                    }
                    i10 = i11;
                    j10 = j12;
                    j11 = j13;
                }
            }

            public void d(a aVar) {
                for (C0019a c0019a : this.f5109a) {
                    if (c0019a.f5111b == aVar) {
                        c0019a.d();
                        this.f5109a.remove(c0019a);
                    }
                }
            }
        }

        void onBandwidthSample(int i10, long j10, long j11);
    }

    long a();

    void b(Handler handler, a aVar);

    void c(a aVar);

    @Nullable
    m1 d();

    long getBitrateEstimate();
}
