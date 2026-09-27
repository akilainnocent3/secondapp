package lf;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import eh.f1;
import eh.t0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import re.d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f104083a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f104084b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104085c = 4;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f104087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f104088c;

        public a(String str, int i10, byte[] bArr) {
            this.f104086a = str;
            this.f104087b = i10;
            this.f104088c = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f104089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f104090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<a> f104091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f104092d;

        public b(int i10, @Nullable String str, @Nullable List<a> list, byte[] bArr) {
            this.f104089a = i10;
            this.f104090b = str;
            this.f104091c = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f104092d = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        @Nullable
        i0 a(int i10, b bVar);

        SparseArray<i0> createInitialPayloadReaders();
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
        public static final int f104093f = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f104095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f104096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f104097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f104098e;

        public e(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public void a() {
            int i10 = this.f104097d;
            this.f104097d = i10 == Integer.MIN_VALUE ? this.f104095b : i10 + this.f104096c;
            this.f104098e = this.f104094a + this.f104097d;
        }

        public String b() {
            d();
            return this.f104098e;
        }

        public int c() {
            d();
            return this.f104097d;
        }

        public final void d() {
            if (this.f104097d == Integer.MIN_VALUE) {
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
            this.f104094a = str;
            this.f104095b = i11;
            this.f104096c = i12;
            this.f104097d = Integer.MIN_VALUE;
            this.f104098e = "";
        }
    }

    void a(t0 t0Var, int i10) throws d4;

    void b(f1 f1Var, af.o oVar, e eVar);

    void seek();
}
