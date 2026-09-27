package a0;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3299a = "androidx.browser.trusted.displaymode.KEY_ID";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f3300b = 0;

        @Override // a0.u
        @NonNull
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(u.f3299a, 0);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements u {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f3301d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f3302e = "androidx.browser.trusted.displaymode.KEY_STICKY";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f3303f = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f3304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3305c;

        public b(boolean z10, int i10) {
            this.f3304b = z10;
            this.f3305c = i10;
        }

        @NonNull
        public static u a(@NonNull Bundle bundle) {
            return new b(bundle.getBoolean(f3302e), bundle.getInt(f3303f));
        }

        public boolean b() {
            return this.f3304b;
        }

        public int c() {
            return this.f3305c;
        }

        @Override // a0.u
        @NonNull
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(u.f3299a, 1);
            bundle.putBoolean(f3302e, this.f3304b);
            bundle.putInt(f3303f, this.f3305c);
            return bundle;
        }
    }

    @NonNull
    Bundle toBundle();
}
