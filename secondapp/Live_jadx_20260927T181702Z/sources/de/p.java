package de;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract p a();

        @NonNull
        public abstract a b(@Nullable s sVar);

        @NonNull
        public abstract a c(@Nullable b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final SparseArray<b> f79001e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f79003b;

        static {
            b bVar = NOT_SET;
            b bVar2 = EVENT_OVERRIDE;
            SparseArray<b> sparseArray = new SparseArray<>();
            f79001e = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        b(int i10) {
            this.f79003b = i10;
        }

        @Nullable
        public static b a(int i10) {
            return f79001e.get(i10);
        }

        public int d() {
            return this.f79003b;
        }
    }

    @NonNull
    public static a a() {
        return new f.b();
    }

    @Nullable
    public abstract s b();

    @Nullable
    public abstract b c();
}
