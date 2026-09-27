package v3;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1466a f139943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1466a f139944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1466a f139945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1466a f139946d;

    public a() {
    }

    public void a(Rect rect, Rect rect2) {
        C1466a c1466a = this.f139943a;
        if (c1466a == null) {
            rect2.left = rect.left;
        } else {
            rect2.left = b(rect.left, c1466a, rect.width());
        }
        C1466a c1466a2 = this.f139945c;
        if (c1466a2 == null) {
            rect2.right = rect.right;
        } else {
            rect2.right = b(rect.left, c1466a2, rect.width());
        }
        C1466a c1466a3 = this.f139944b;
        if (c1466a3 == null) {
            rect2.top = rect.top;
        } else {
            rect2.top = b(rect.top, c1466a3, rect.height());
        }
        C1466a c1466a4 = this.f139946d;
        if (c1466a4 == null) {
            rect2.bottom = rect.bottom;
        } else {
            rect2.bottom = b(rect.top, c1466a4, rect.height());
        }
    }

    public final int b(int i10, C1466a c1466a, int i11) {
        return i10 + c1466a.f139948b + ((int) (c1466a.f139947a * i11));
    }

    public a(a aVar) {
        C1466a c1466a = aVar.f139943a;
        this.f139943a = c1466a != null ? new C1466a(c1466a) : null;
        C1466a c1466a2 = aVar.f139945c;
        this.f139945c = c1466a2 != null ? new C1466a(c1466a2) : null;
        C1466a c1466a3 = aVar.f139944b;
        this.f139944b = c1466a3 != null ? new C1466a(c1466a3) : null;
        C1466a c1466a4 = aVar.f139946d;
        this.f139946d = c1466a4 != null ? new C1466a(c1466a4) : null;
    }

    /* JADX INFO: renamed from: v3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1466a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f139947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f139948b;

        public C1466a(int i10, float f10) {
            this.f139948b = i10;
            this.f139947a = f10;
        }

        public static C1466a a(int i10) {
            return new C1466a(i10, 0.0f);
        }

        public static C1466a d(float f10) {
            return new C1466a(0, f10);
        }

        public static C1466a e(float f10, int i10) {
            return new C1466a(i10, f10);
        }

        public int b() {
            return this.f139948b;
        }

        public float c() {
            return this.f139947a;
        }

        public void f(int i10) {
            this.f139948b = i10;
        }

        public void g(float f10) {
            this.f139947a = f10;
        }

        public C1466a(C1466a c1466a) {
            this.f139947a = c1466a.f139947a;
            this.f139948b = c1466a.f139948b;
        }
    }
}
