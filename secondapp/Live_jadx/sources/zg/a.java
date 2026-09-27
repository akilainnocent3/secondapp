package zg;

import android.view.View;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f161517d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f161518e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f161519f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f161520g = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f161521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f161523c;

    /* JADX INFO: renamed from: zg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1579a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f161524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f161525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f161526c;

        public C1579a(View view, int i10) {
            this.f161524a = view;
            this.f161525b = i10;
        }

        public a a() {
            return new a(this.f161524a, this.f161525b, this.f161526c);
        }

        @qj.a
        public C1579a b(@Nullable String str) {
            this.f161526c = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @Deprecated
    public a(View view, int i10) {
        this(view, i10, null);
    }

    @Deprecated
    public a(View view, int i10, @Nullable String str) {
        this.f161521a = view;
        this.f161522b = i10;
        this.f161523c = str;
    }
}
