package androidx.leanback.widget;

import android.graphics.Outline;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.t0(21)
public class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SparseArray<ViewOutlineProvider> f12542a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12543b = 32;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12544a;

        public a(int i10) {
            this.f12544a = i10;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f12544a);
            outline.setAlpha(1.0f);
        }
    }

    public static void a(View view, boolean z10, int i10) {
        if (z10) {
            if (f12542a == null) {
                f12542a = new SparseArray<>();
            }
            ViewOutlineProvider aVar = f12542a.get(i10);
            if (aVar == null) {
                aVar = new a(i10);
                if (f12542a.size() < 32) {
                    f12542a.put(i10, aVar);
                }
            }
            view.setOutlineProvider(aVar);
        } else {
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        }
        view.setClipToOutline(z10);
    }
}
