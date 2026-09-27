package r7;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class k2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f123985f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f123986g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f123987h = "androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @k.y0({k.y0.a.LIBRARY})
    public static final String f123988i = "androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f123989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f123990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f123991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f123992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f123993e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @k.y0({k.y0.a.LIBRARY})
    public @interface b {
    }

    public k2(@NonNull a aVar) {
        this.f123989a = aVar.f123994a;
        this.f123990b = aVar.f123995b;
        this.f123991c = aVar.f123996c;
        this.f123992d = aVar.f123997d;
        Bundle bundle = aVar.f123998e;
        this.f123993e = bundle == null ? Bundle.EMPTY : new Bundle(bundle);
    }

    public int a() {
        return this.f123989a;
    }

    @NonNull
    @k.y0({k.y0.a.LIBRARY})
    public Bundle b() {
        return this.f123993e;
    }

    public boolean c() {
        return this.f123990b;
    }

    public boolean d() {
        return this.f123991c;
    }

    public boolean e() {
        return this.f123992d;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f123994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f123995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f123996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f123997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f123998e;

        public a() {
            this.f123994a = 1;
            this.f123995b = Build.VERSION.SDK_INT >= 30;
        }

        @NonNull
        public k2 a() {
            return new k2(this);
        }

        @NonNull
        public a b(int i10) {
            this.f123994a = i10;
            return this;
        }

        @NonNull
        @k.y0({k.y0.a.LIBRARY})
        public a c(@Nullable Bundle bundle) {
            this.f123998e = bundle == null ? null : new Bundle(bundle);
            return this;
        }

        @NonNull
        public a d(boolean z10) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f123995b = z10;
            }
            return this;
        }

        @NonNull
        public a e(boolean z10) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f123996c = z10;
            }
            return this;
        }

        @NonNull
        public a f(boolean z10) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f123997d = z10;
            }
            return this;
        }

        public a(@NonNull k2 k2Var) {
            this.f123994a = 1;
            this.f123995b = Build.VERSION.SDK_INT >= 30;
            if (k2Var != null) {
                this.f123994a = k2Var.f123989a;
                this.f123996c = k2Var.f123991c;
                this.f123997d = k2Var.f123992d;
                this.f123995b = k2Var.f123990b;
                this.f123998e = k2Var.f123993e == null ? null : new Bundle(k2Var.f123993e);
                return;
            }
            throw new NullPointerException("params should not be null!");
        }
    }
}
