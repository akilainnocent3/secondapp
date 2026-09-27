package u4;

import android.view.View;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f137897d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f137898e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f137899f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f137900g = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f137901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f137902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f137903c;

    /* JADX INFO: renamed from: u4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1431a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f137904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f137905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f137906c;

        public C1431a(View view, int i10) {
            this.f137904a = view;
            this.f137905b = i10;
        }

        public a a() {
            return new a(this.f137904a, this.f137905b, this.f137906c);
        }

        @qj.a
        public C1431a b(@Nullable String str) {
            this.f137906c = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @x4.m1
    @Deprecated
    public a(View view, int i10) {
        this(view, i10, null);
    }

    @x4.m1
    @Deprecated
    public a(View view, int i10, @Nullable String str) {
        this.f137901a = view;
        this.f137902b = i10;
        this.f137903c = str;
    }
}
