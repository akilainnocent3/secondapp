package sg.bigo.ads.a;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import k.k;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k
    private final int f130660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k
    private final int f130661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f130662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f130663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f130664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f130665g;

    /* JADX INFO: renamed from: sg.bigo.ads.a.a$a, reason: collision with other inner class name */
    public static class C1286a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f130666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f130667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f130668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @k
        private int f130669d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @k
        private int f130670e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f130671f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bitmap f130672g;

        public final a a() {
            return new a(this.f130666a, this.f130669d, this.f130670e, this.f130671f, this.f130672g, this.f130667b, this.f130668c);
        }
    }

    public interface b {
        void a(Context context, String str, int i10, @Nullable String str2);

        void a(String str, String str2, String str3);
    }

    public interface c {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    public a(String str, int i10, int i11, boolean z10, Bitmap bitmap, c cVar, b bVar) {
        this.f130659a = str;
        this.f130660b = i10;
        this.f130661c = i11;
        this.f130662d = z10;
        this.f130663e = bitmap;
        this.f130664f = cVar;
        this.f130665g = bVar;
    }

    public final void a(Context context) {
        sg.bigo.ads.a.c.a(context, this.f130659a, this.f130660b, this.f130661c, this.f130662d, this.f130663e, this.f130664f, this.f130665g);
    }
}
