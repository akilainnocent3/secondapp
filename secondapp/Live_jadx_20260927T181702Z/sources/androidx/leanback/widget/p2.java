package androidx.leanback.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.t0(21)
public class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewOutlineProvider f12874a = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(1.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f12875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f12876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f12877c;
    }

    public static Object a(View view, float f10, float f11, int i10) {
        if (i10 > 0) {
            g2.a(view, true, i10);
        } else {
            view.setOutlineProvider(f12874a);
        }
        b bVar = new b();
        bVar.f12875a = view;
        bVar.f12876b = f10;
        bVar.f12877c = f11;
        view.setZ(f10);
        return bVar;
    }

    public static void b(Object obj, float f10) {
        b bVar = (b) obj;
        View view = bVar.f12875a;
        float f11 = bVar.f12876b;
        view.setZ(f11 + (f10 * (bVar.f12877c - f11)));
    }
}
