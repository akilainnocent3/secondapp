package k2;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f101777a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        @Nullable
        Object a();

        @NonNull
        Uri b();

        void c();

        void d();

        @NonNull
        ClipDescription getDescription();

        @Nullable
        Uri h();
    }

    public g(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f101777a = new a(uri, clipDescription, uri2);
        } else {
            this.f101777a = new b(uri, clipDescription, uri2);
        }
    }

    @Nullable
    public static g g(@Nullable Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new g(new a(obj));
        }
        return null;
    }

    @NonNull
    public Uri a() {
        return this.f101777a.b();
    }

    @NonNull
    public ClipDescription b() {
        return this.f101777a.getDescription();
    }

    @Nullable
    public Uri c() {
        return this.f101777a.h();
    }

    public void d() {
        this.f101777a.d();
    }

    public void e() {
        this.f101777a.c();
    }

    @Nullable
    public Object f() {
        return this.f101777a.a();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(25)
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final InputContentInfo f101778a;

        public a(@NonNull Object obj) {
            this.f101778a = (InputContentInfo) obj;
        }

        @Override // k2.g.c
        @NonNull
        public Object a() {
            return this.f101778a;
        }

        @Override // k2.g.c
        @NonNull
        public Uri b() {
            return this.f101778a.getContentUri();
        }

        @Override // k2.g.c
        public void c() {
            this.f101778a.requestPermission();
        }

        @Override // k2.g.c
        public void d() {
            this.f101778a.releasePermission();
        }

        @Override // k2.g.c
        @NonNull
        public ClipDescription getDescription() {
            return this.f101778a.getDescription();
        }

        @Override // k2.g.c
        @Nullable
        public Uri h() {
            return this.f101778a.getLinkUri();
        }

        public a(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.f101778a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public g(@NonNull c cVar) {
        this.f101777a = cVar;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Uri f101779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final ClipDescription f101780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Uri f101781c;

        public b(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.f101779a = uri;
            this.f101780b = clipDescription;
            this.f101781c = uri2;
        }

        @Override // k2.g.c
        @Nullable
        public Object a() {
            return null;
        }

        @Override // k2.g.c
        @NonNull
        public Uri b() {
            return this.f101779a;
        }

        @Override // k2.g.c
        @NonNull
        public ClipDescription getDescription() {
            return this.f101780b;
        }

        @Override // k2.g.c
        @Nullable
        public Uri h() {
            return this.f101781c;
        }

        @Override // k2.g.c
        public void c() {
        }

        @Override // k2.g.c
        public void d() {
        }
    }
}
