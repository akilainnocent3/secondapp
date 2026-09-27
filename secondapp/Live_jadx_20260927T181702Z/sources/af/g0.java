package af;

import androidx.annotation.Nullable;
import eh.t0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4927a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4928b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4929c = 2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f4931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f4933d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f4930a = i10;
            this.f4931b = bArr;
            this.f4932c = i11;
            this.f4933d = i12;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f4930a == aVar.f4930a && this.f4932c == aVar.f4932c && this.f4933d == aVar.f4933d && Arrays.equals(this.f4931b, aVar.f4931b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f4930a * 31) + Arrays.hashCode(this.f4931b)) * 31) + this.f4932c) * 31) + this.f4933d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    void a(t0 t0Var, int i10, int i11);

    void b(long j10, int i10, int i11, int i12, @Nullable a aVar);

    void c(n2 n2Var);

    int d(ah.r rVar, int i10, boolean z10, int i11) throws IOException;

    int e(ah.r rVar, int i10, boolean z10) throws IOException;

    void f(t0 t0Var, int i10);
}
