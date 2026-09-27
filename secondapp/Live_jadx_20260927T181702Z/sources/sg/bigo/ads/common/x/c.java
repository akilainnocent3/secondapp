package sg.bigo.ads.common.x;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f133721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1363a f133722b = new C1363a();

        /* JADX INFO: renamed from: sg.bigo.ads.common.x.c$a$a, reason: collision with other inner class name */
        public static class C1363a {
            public static void a(@NonNull SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private a() {
        }

        public static a a() {
            if (f133721a == null) {
                f133721a = new a();
            }
            return f133721a;
        }
    }
}
