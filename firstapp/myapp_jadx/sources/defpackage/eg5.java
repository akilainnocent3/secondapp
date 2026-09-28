package defpackage;

import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eg5 {

    public static final class a extends eg5 {
        public static final a a = new a();

        @Override // defpackage.eg5
        public final int a() {
            return bqe.a(255.0f);
        }
    }

    public static final class b extends eg5 {
        public static final b a = new b();

        @Override // defpackage.eg5
        public final int a() {
            return bqe.a(500.0f);
        }
    }

    public static final class c extends eg5 {
        public static final c a = new c();

        @Override // defpackage.eg5
        public final int a() {
            return bqe.a(450.0f);
        }
    }

    public static final class d extends eg5 {
        public static final d a = new d();

        @Override // defpackage.eg5
        public final int a() {
            DisplayMetrics displayMetrics = bqe.a;
            return (int) ((displayMetrics != null ? displayMetrics.heightPixels : 1280) * 0.9f);
        }
    }

    public abstract int a();
}
