package aa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f4571e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f4572f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final s[] f4573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f4574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final byte[] f4575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4576d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP})
    public @interface a {
    }

    public r(@Nullable String str) {
        this(str, (s[]) null);
    }

    public final void a(int i10) {
        if (i10 == this.f4576d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + f(this.f4576d) + " expected, but got " + f(i10));
    }

    @NonNull
    public byte[] b() {
        a(1);
        Objects.requireNonNull(this.f4575c);
        return this.f4575c;
    }

    @Nullable
    public String c() {
        a(0);
        return this.f4574b;
    }

    @Nullable
    public s[] d() {
        return this.f4573a;
    }

    public int e() {
        return this.f4576d;
    }

    @NonNull
    public final String f(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? "Unknown" : "ArrayBuffer";
        }
        return "String";
    }

    public r(@Nullable String str, @Nullable s[] sVarArr) {
        this.f4574b = str;
        this.f4575c = null;
        this.f4573a = sVarArr;
        this.f4576d = 0;
    }

    public r(@NonNull byte[] bArr) {
        this(bArr, (s[]) null);
    }

    public r(@NonNull byte[] bArr, @Nullable s[] sVarArr) {
        Objects.requireNonNull(bArr);
        this.f4575c = bArr;
        this.f4574b = null;
        this.f4573a = sVarArr;
        this.f4576d = 1;
    }
}
