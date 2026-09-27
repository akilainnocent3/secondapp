package androidx.leanback.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class y2 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f13155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f13156b;
    }

    public static Object a(ViewGroup viewGroup) {
        viewGroup.setLayoutMode(1);
        LayoutInflater.from(viewGroup.getContext()).inflate(s3.a.j.f128822c0, viewGroup, true);
        a aVar = new a();
        aVar.f13155a = viewGroup.findViewById(s3.a.h.f128773u1);
        aVar.f13156b = viewGroup.findViewById(s3.a.h.f128765s1);
        return aVar;
    }

    public static void b(ViewGroup viewGroup) {
        viewGroup.setLayoutMode(1);
    }

    public static void c(Object obj, float f10) {
        a aVar = (a) obj;
        aVar.f13155a.setAlpha(1.0f - f10);
        aVar.f13156b.setAlpha(f10);
    }

    public static boolean d() {
        return true;
    }
}
