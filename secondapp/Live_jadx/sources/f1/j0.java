package f1;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class j0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Deprecated
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static a f82257b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0813a f82258a = new C0813a();

        /* JADX INFO: renamed from: f1.j0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C0813a {
            public void a(@NonNull SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        @Deprecated
        public static a b() {
            if (f82257b == null) {
                f82257b = new a();
            }
            return f82257b;
        }

        @Deprecated
        public void a(@NonNull SharedPreferences.Editor editor) {
            this.f82258a.a(editor);
        }
    }
}
