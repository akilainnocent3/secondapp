package fe;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue.Builder
    public static abstract class a {
        public abstract g a();

        public abstract a b(Iterable<ee.j> iterable);

        public abstract a c(@Nullable byte[] bArr);
    }

    public static a a() {
        return new fe.a.b();
    }

    public static g b(Iterable<ee.j> iterable) {
        return a().b(iterable).a();
    }

    public abstract Iterable<ee.j> c();

    @Nullable
    public abstract byte[] d();
}
