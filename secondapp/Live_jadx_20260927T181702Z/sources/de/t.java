package de;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class t {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract t a();

        @NonNull
        public abstract a b(@Nullable p pVar);

        @NonNull
        public abstract a c(@Nullable Integer num);

        @NonNull
        public abstract a d(long j10);

        @NonNull
        public abstract a e(long j10);

        @NonNull
        public abstract a f(@Nullable q qVar);

        @NonNull
        public abstract a g(@Nullable w wVar);

        @NonNull
        public abstract a h(@Nullable byte[] bArr);

        @NonNull
        public abstract a i(@Nullable String str);

        @NonNull
        public abstract a j(long j10);
    }

    public static a a() {
        return new j.b();
    }

    @NonNull
    public static a k(@NonNull String str) {
        return a().i(str);
    }

    @NonNull
    public static a l(@NonNull byte[] bArr) {
        return a().h(bArr);
    }

    @Nullable
    public abstract p b();

    @Nullable
    public abstract Integer c();

    public abstract long d();

    public abstract long e();

    @Nullable
    public abstract q f();

    @Nullable
    public abstract w g();

    @Nullable
    public abstract byte[] h();

    @Nullable
    public abstract String i();

    public abstract long j();
}
