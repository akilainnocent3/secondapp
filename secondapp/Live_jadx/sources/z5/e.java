package z5;

import a5.x1;
import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public interface e {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {

        /* JADX INFO: renamed from: z5.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C1572a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList<C1573a> f160322a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: z5.e$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public static final class C1573a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Handler f160323a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final a f160324b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f160325c;

                public C1573a(Handler handler, a aVar) {
                    this.f160323a = handler;
                    this.f160324b = aVar;
                }

                public void d() {
                    this.f160325c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                l0.E(handler);
                l0.E(aVar);
                d(aVar);
                this.f160322a.add(new C1573a(handler, aVar));
            }

            public void c(int i10, long j10, long j11) {
                final int i11;
                final long j12;
                final long j13;
                for (final C1573a c1573a : this.f160322a) {
                    if (c1573a.f160325c) {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                    } else {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                        c1573a.f160323a.post(new Runnable() { // from class: z5.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                c1573a.f160324b.onBandwidthSample(i11, j12, j13);
                            }
                        });
                    }
                    i10 = i11;
                    j10 = j12;
                    j11 = j13;
                }
            }

            public void d(a aVar) {
                for (C1573a c1573a : this.f160322a) {
                    if (c1573a.f160324b == aVar) {
                        c1573a.d();
                        this.f160322a.remove(c1573a);
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
    x1 d();

    long getBitrateEstimate();
}
