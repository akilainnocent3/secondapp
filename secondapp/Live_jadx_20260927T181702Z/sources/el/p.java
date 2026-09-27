package el;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract p a();

        @NonNull
        public abstract a b(@NonNull String str);

        @NonNull
        public abstract a c(long j10);

        @NonNull
        public abstract a d(long j10);
    }

    @NonNull
    public static a a() {
        return new el.a.b();
    }

    @NonNull
    public abstract String b();

    @NonNull
    public abstract long c();

    @NonNull
    public abstract long d();

    @NonNull
    public abstract a e();
}
