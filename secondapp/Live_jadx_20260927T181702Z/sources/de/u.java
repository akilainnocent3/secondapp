package de;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class u {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract u a();

        @NonNull
        public abstract a b(@Nullable o oVar);

        @NonNull
        public abstract a c(@Nullable List<t> list);

        @NonNull
        public abstract a d(@Nullable Integer num);

        @NonNull
        public abstract a e(@Nullable String str);

        @NonNull
        public abstract a f(@Nullable x xVar);

        @NonNull
        public abstract a g(long j10);

        @NonNull
        public abstract a h(long j10);

        @NonNull
        public a i(int i10) {
            return d(Integer.valueOf(i10));
        }

        @NonNull
        public a j(@NonNull String str) {
            return e(str);
        }
    }

    @NonNull
    public static a a() {
        return new k.b();
    }

    @Nullable
    public abstract o b();

    @Nullable
    @uk.a.InterfaceC1443a(name = "logEvent")
    public abstract List<t> c();

    @Nullable
    public abstract Integer d();

    @Nullable
    public abstract String e();

    @Nullable
    public abstract x f();

    public abstract long g();

    public abstract long h();
}
