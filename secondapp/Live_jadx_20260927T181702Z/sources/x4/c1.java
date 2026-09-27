package x4;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class c1 extends IllegalStateException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f144246d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f144247e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f144248f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f144249g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f144250h = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f144251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f144252c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public c1(int i10, int i11) {
        super(a(i10, i11));
        this.f144251b = i10;
        this.f144252c = i11;
    }

    public static String a(int i10, int i11) {
        if (i10 == 0) {
            return "Player stuck buffering and not loading for " + i11 + " ms";
        }
        if (i10 == 1) {
            return "Player stuck buffering with no progress for " + i11 + " ms";
        }
        if (i10 == 2) {
            return "Player stuck playing with no progress for " + i11 + " ms";
        }
        if (i10 == 3) {
            return "Player stuck playing without ending for " + i11 + " ms";
        }
        if (i10 != 4) {
            throw new IllegalStateException();
        }
        return "Player stuck suppressed for " + i11 + " ms";
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (this.f144251b == c1Var.f144251b && this.f144252c == c1Var.f144252c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f144251b) * 31) + this.f144252c;
    }
}
