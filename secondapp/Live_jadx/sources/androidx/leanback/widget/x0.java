package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rect f13137a = new Rect();

    public static int a(View view, w0.a aVar, int i10) {
        View viewFindViewById;
        GridLayoutManager.f fVar = (GridLayoutManager.f) view.getLayoutParams();
        int i11 = aVar.f13125a;
        if (i11 == 0 || (viewFindViewById = view.findViewById(i11)) == null) {
            viewFindViewById = view;
        }
        int iW = aVar.f13127c;
        if (i10 != 0) {
            if (aVar.f13129e) {
                float f10 = aVar.f13128d;
                if (f10 == 0.0f) {
                    iW += viewFindViewById.getPaddingTop();
                } else if (f10 == 100.0f) {
                    iW -= viewFindViewById.getPaddingBottom();
                }
            }
            if (aVar.f13128d != -1.0f) {
                iW += (int) (((viewFindViewById == view ? fVar.q(viewFindViewById) : viewFindViewById.getHeight()) * aVar.f13128d) / 100.0f);
            }
            if (view != viewFindViewById) {
                Rect rect = f13137a;
                rect.top = iW;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect);
                iW = rect.top - fVar.w();
            }
            return aVar.e() ? iW + viewFindViewById.getBaseline() : iW;
        }
        if (view.getLayoutDirection() != 1) {
            if (aVar.f13129e) {
                float f11 = aVar.f13128d;
                if (f11 == 0.0f) {
                    iW += viewFindViewById.getPaddingLeft();
                } else if (f11 == 100.0f) {
                    iW -= viewFindViewById.getPaddingRight();
                }
            }
            if (aVar.f13128d != -1.0f) {
                iW += (int) (((viewFindViewById == view ? fVar.x(viewFindViewById) : viewFindViewById.getWidth()) * aVar.f13128d) / 100.0f);
            }
            if (view == viewFindViewById) {
                return iW;
            }
            Rect rect2 = f13137a;
            rect2.left = iW;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect2);
            return rect2.left - fVar.s();
        }
        int iX = (viewFindViewById == view ? fVar.x(viewFindViewById) : viewFindViewById.getWidth()) - iW;
        if (aVar.f13129e) {
            float f12 = aVar.f13128d;
            if (f12 == 0.0f) {
                iX -= viewFindViewById.getPaddingRight();
            } else if (f12 == 100.0f) {
                iX += viewFindViewById.getPaddingLeft();
            }
        }
        if (aVar.f13128d != -1.0f) {
            iX -= (int) (((viewFindViewById == view ? fVar.x(viewFindViewById) : viewFindViewById.getWidth()) * aVar.f13128d) / 100.0f);
        }
        if (view == viewFindViewById) {
            return iX;
        }
        Rect rect3 = f13137a;
        rect3.right = iX;
        ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect3);
        return rect3.right + fVar.u();
    }
}
