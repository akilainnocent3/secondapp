package de;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract o a();

        @NonNull
        public abstract a b(@Nullable de.a aVar);

        @NonNull
        public abstract a c(@Nullable b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f78998b;

        b(int i10) {
            this.f78998b = i10;
        }
    }

    @NonNull
    public static a a() {
        return new e.b();
    }

    @Nullable
    public abstract de.a b();

    @Nullable
    public abstract b c();
}
