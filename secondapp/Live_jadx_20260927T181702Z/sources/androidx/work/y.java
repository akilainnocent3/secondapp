package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends h0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final long f20321g = 900000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final long f20322h = 300000;

    public y(a builder) {
        super(builder.f20112b, builder.f20113c, builder.f20114d);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends h0.a<a, y> {
        public a(@NonNull Class<? extends ListenableWorker> workerClass, long repeatInterval, @NonNull TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            this.f20113c.f(repeatIntervalTimeUnit.toMillis(repeatInterval));
        }

        @Override // androidx.work.h0.a
        @NonNull
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public y c() {
            if (this.f20111a && this.f20113c.f118918j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new y(this);
        }

        @t0(26)
        public a(@NonNull Class<? extends ListenableWorker> workerClass, @NonNull Duration repeatInterval) {
            super(workerClass);
            this.f20113c.f(repeatInterval.toMillis());
        }

        public a(@NonNull Class<? extends ListenableWorker> workerClass, long repeatInterval, @NonNull TimeUnit repeatIntervalTimeUnit, long flexInterval, @NonNull TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            this.f20113c.g(repeatIntervalTimeUnit.toMillis(repeatInterval), flexIntervalTimeUnit.toMillis(flexInterval));
        }

        @t0(26)
        public a(@NonNull Class<? extends ListenableWorker> workerClass, @NonNull Duration repeatInterval, @NonNull Duration flexInterval) {
            super(workerClass);
            this.f20113c.g(repeatInterval.toMillis(), flexInterval.toMillis());
        }

        @Override // androidx.work.h0.a
        @NonNull
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }
}
