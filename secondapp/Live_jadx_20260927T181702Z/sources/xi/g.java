package xi;

import android.graphics.RectF;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@t0(21)
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f145168a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f145169b = new b();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements f {
        @Override // xi.f
        public h a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
            float fN = w.n(f13, f15, f11, f12, f10, true);
            float f17 = fN / f13;
            float f18 = fN / f15;
            return new h(f17, f18, fN, f14 * f17, fN, f16 * f18);
        }

        @Override // xi.f
        public void b(RectF rectF, float f10, h hVar) {
            rectF.bottom -= Math.abs(hVar.f145175f - hVar.f145173d) * f10;
        }

        @Override // xi.f
        public boolean c(h hVar) {
            return hVar.f145173d > hVar.f145175f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements f {
        @Override // xi.f
        public h a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
            float fN = w.n(f14, f16, f11, f12, f10, true);
            float f17 = fN / f14;
            float f18 = fN / f16;
            return new h(f17, f18, f13 * f17, fN, f15 * f18, fN);
        }

        @Override // xi.f
        public void b(RectF rectF, float f10, h hVar) {
            float fAbs = (Math.abs(hVar.f145174e - hVar.f145172c) / 2.0f) * f10;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }

        @Override // xi.f
        public boolean c(h hVar) {
            return hVar.f145172c > hVar.f145174e;
        }
    }

    public static f a(int i10, boolean z10, RectF rectF, RectF rectF2) {
        if (i10 == 0) {
            return b(z10, rectF, rectF2) ? f145168a : f145169b;
        }
        if (i10 == 1) {
            return f145168a;
        }
        if (i10 == 2) {
            return f145169b;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i10);
    }

    public static boolean b(boolean z10, RectF rectF, RectF rectF2) {
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fWidth2 = rectF2.width();
        float fHeight2 = rectF2.height();
        float f10 = (fHeight2 * fWidth) / fWidth2;
        float f11 = (fWidth2 * fHeight) / fWidth;
        if (z10) {
            return f10 >= fHeight;
        }
        return f11 >= fHeight2;
    }
}
