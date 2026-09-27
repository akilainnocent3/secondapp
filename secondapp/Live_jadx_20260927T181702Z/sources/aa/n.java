package aa;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4528d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f4529e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f4530f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f4531g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f4532h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f4533i = 16;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f4534j = 32;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f4535k = 64;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f4536l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f4537m = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f4539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4540c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4541a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f4542b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4543c = 1;

        @NonNull
        public a a(@NonNull Collection<String> collection) {
            this.f4542b.addAll(collection);
            return this;
        }

        @NonNull
        public a b(@NonNull int... iArr) {
            for (int i10 : iArr) {
                this.f4541a = i10 | this.f4541a;
            }
            return this;
        }

        @NonNull
        public a c(@NonNull String... strArr) {
            this.f4542b.addAll(Arrays.asList(strArr));
            return this;
        }

        @NonNull
        public n d() {
            return new n(this.f4541a, this.f4542b, this.f4543c);
        }

        @NonNull
        public a e(int i10) {
            this.f4543c = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface c {
    }

    @y0({y0.a.LIBRARY})
    public n(int i10, @NonNull List<String> list, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f4539b = arrayList;
        this.f4538a = i10;
        arrayList.addAll(list);
        this.f4540c = i11;
    }

    @NonNull
    public List<String> a() {
        return this.f4539b;
    }

    public int b() {
        return this.f4538a;
    }

    public int c() {
        return this.f4540c;
    }
}
