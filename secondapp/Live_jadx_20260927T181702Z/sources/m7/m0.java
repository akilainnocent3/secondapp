package m7;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import u4.p1;
import x4.g1;
import x4.m1;
import x4.v0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public interface m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f106797a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f106798b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f106799c = 4;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f106801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f106802c;

        public a(String str, int i10, byte[] bArr) {
            this.f106800a = str;
            this.f106801b = i10;
            this.f106802c = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f106803f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f106804g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f106805h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f106806i = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f106807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f106808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f106809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<a> f106810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f106811e;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(int i10, @Nullable String str, int i11, @Nullable List<a> list, byte[] bArr) {
            this.f106807a = i10;
            this.f106808b = str;
            this.f106809c = i11;
            this.f106810d = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f106811e = bArr;
        }

        public int a() {
            int i10 = this.f106809c;
            if (i10 != 2) {
                return i10 != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        @Nullable
        m0 a(int i10, b bVar);

        SparseArray<m0> createInitialPayloadReaders();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f106812f = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f106814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f106815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f106816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f106817e;

        public e(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public void a() {
            int i10 = this.f106816d;
            this.f106816d = i10 == Integer.MIN_VALUE ? this.f106814b : i10 + this.f106815c;
            this.f106817e = this.f106813a + this.f106816d;
        }

        public String b() {
            d();
            return this.f106817e;
        }

        public int c() {
            d();
            return this.f106816d;
        }

        public final void d() {
            if (this.f106816d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public e(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + to.c.userBaseDel;
            } else {
                str = "";
            }
            this.f106813a = str;
            this.f106814b = i11;
            this.f106815c = i12;
            this.f106816d = Integer.MIN_VALUE;
            this.f106817e = "";
        }
    }

    void a(v0 v0Var, int i10) throws p1;

    void b(g1 g1Var, f6.w wVar, e eVar);

    void seek();
}
