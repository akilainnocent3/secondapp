package de;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract q a();

        @NonNull
        public abstract a b(@Nullable byte[] bArr);

        @NonNull
        public abstract a c(@Nullable byte[] bArr);
    }

    @NonNull
    public static a a() {
        return new g.b();
    }

    @Nullable
    public abstract byte[] b();

    @Nullable
    public abstract byte[] c();
}
