package z;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    @k.k
    public final Integer f160059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    @k.k
    public final Integer f160060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    @k.k
    public final Integer f160061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    @k.k
    public final Integer f160062d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        @k.k
        public Integer f160063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        @k.k
        public Integer f160064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        @k.k
        public Integer f160065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        @k.k
        public Integer f160066d;

        @NonNull
        public b a() {
            return new b(this.f160063a, this.f160064b, this.f160065c, this.f160066d);
        }

        @NonNull
        public a b(@k.k int i10) {
            this.f160065c = Integer.valueOf(i10 | (-16777216));
            return this;
        }

        @NonNull
        public a c(@k.k int i10) {
            this.f160066d = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public a d(@k.k int i10) {
            this.f160064b = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public a e(@k.k int i10) {
            this.f160063a = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    public b(@Nullable @k.k Integer num, @Nullable @k.k Integer num2, @Nullable @k.k Integer num3, @Nullable @k.k Integer num4) {
        this.f160059a = num;
        this.f160060b = num2;
        this.f160061c = num3;
        this.f160062d = num4;
    }

    @NonNull
    public static b a(@Nullable Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new b((Integer) bundle.get(f.f160127k), (Integer) bundle.get(f.f160155y), (Integer) bundle.get(f.S), (Integer) bundle.get(f.f160156y0));
    }

    @NonNull
    public Bundle b() {
        Bundle bundle = new Bundle();
        Integer num = this.f160059a;
        if (num != null) {
            bundle.putInt(f.f160127k, num.intValue());
        }
        Integer num2 = this.f160060b;
        if (num2 != null) {
            bundle.putInt(f.f160155y, num2.intValue());
        }
        Integer num3 = this.f160061c;
        if (num3 != null) {
            bundle.putInt(f.S, num3.intValue());
        }
        Integer num4 = this.f160062d;
        if (num4 != null) {
            bundle.putInt(f.f160156y0, num4.intValue());
        }
        return bundle;
    }

    @NonNull
    public b c(@NonNull b bVar) {
        Integer num = this.f160059a;
        if (num == null) {
            num = bVar.f160059a;
        }
        Integer num2 = this.f160060b;
        if (num2 == null) {
            num2 = bVar.f160060b;
        }
        Integer num3 = this.f160061c;
        if (num3 == null) {
            num3 = bVar.f160061c;
        }
        Integer num4 = this.f160062d;
        if (num4 == null) {
            num4 = bVar.f160062d;
        }
        return new b(num, num2, num3, num4);
    }
}
