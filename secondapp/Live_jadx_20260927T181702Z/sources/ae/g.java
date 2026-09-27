package ae;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract g a();

        @NonNull
        public abstract a b(byte[] bArr);

        @NonNull
        public abstract a c(byte[] bArr);

        @NonNull
        public abstract a d(String str);
    }

    public static a a() {
        return new b.C0015b();
    }

    @Nullable
    public abstract byte[] b();

    @Nullable
    public abstract byte[] c();

    @Nullable
    public abstract String d();
}
