package sg.bigo.ads.core.mraid;

import android.graphics.Rect;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final WeakReference<View> f135135a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    b f135138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f135139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f135140f = -1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Rect f135141g = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f135142h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    final Handler f135137c = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    final a f135136b = new a();

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0055  */
        @Override // java.lang.Runnable
        public final void run() {
            View view;
            float f10;
            b bVar;
            sg.bigo.ads.core.mraid.b bVar2;
            p pVar = p.this;
            boolean z10 = false;
            pVar.f135139e = false;
            if (pVar.f135138d == null || (view = pVar.f135135a.get()) == null) {
                return;
            }
            Rect rect = new Rect();
            view.getLocalVisibleRect(rect);
            Rect rect2 = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            boolean zIsShown = view.isShown();
            float f11 = 0.0f;
            boolean z11 = view.getAlpha() == 0.0f;
            List arrayList = new ArrayList();
            if (globalVisibleRect && zIsShown && !z11) {
                Pair pairA = p.a(rect2, view);
                if (((Boolean) pairA.first).booleanValue()) {
                    f10 = 0.0f;
                } else {
                    m mVar = new m((List) pairA.second, iArr);
                    float fA = mVar.a();
                    float width = view.getWidth() * view.getHeight();
                    float fWidth = rect.width() * rect.height();
                    if (width > 0.0f) {
                        f10 = ((fWidth - fA) * 100.0f) / width;
                        f11 = (fWidth * 100.0f) / width;
                    } else {
                        f10 = 0.0f;
                    }
                    arrayList = mVar.f135120a;
                }
            } else {
                f10 = 0.0f;
            }
            p pVar2 = p.this;
            if (f11 == pVar2.f135140f && rect.equals(pVar2.f135141g)) {
                return;
            }
            p pVar3 = p.this;
            if (pVar3.f135142h) {
                f11 = f10;
            }
            pVar3.f135140f = f11;
            pVar3.f135141g = rect;
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            p pVar4 = p.this;
            if (pVar4.f135142h) {
                bVar = pVar4.f135138d;
                if (globalVisibleRect && zIsShown && !z11) {
                    z10 = true;
                }
                bVar2 = new sg.bigo.ads.core.mraid.b(pVar4.f135140f, p.a(pVar4.f135141g, displayMetrics.densityDpi), p.a(arrayList, displayMetrics.densityDpi));
            } else {
                bVar = pVar4.f135138d;
                if (globalVisibleRect && zIsShown && !z11) {
                    z10 = true;
                }
                bVar2 = new sg.bigo.ads.core.mraid.b(pVar4.f135140f, p.a(pVar4.f135141g, displayMetrics.densityDpi), null);
            }
            bVar.a(z10, bVar2);
        }
    }

    public interface b {
        void a(boolean z10, sg.bigo.ads.core.mraid.b bVar);
    }

    public p(@NonNull View view) {
        this.f135135a = new WeakReference<>(view);
    }

    public static Rect a(Rect rect, int i10) {
        return new Rect((rect.left * 160) / i10, (rect.top * 160) / i10, (rect.right * 160) / i10, (rect.bottom * 160) / i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    public static /* synthetic */ Pair a(Rect rect, View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view.getRootView();
        loop0: while (true) {
            ?? r10 = view;
            view = (ViewGroup) view.getParent();
            while (true) {
                if (view == 0) {
                    z10 = false;
                    break loop0;
                }
                z10 = true;
                if (view.getAlpha() == 0.0f) {
                    break loop0;
                }
                for (int iIndexOfChild = view.indexOfChild(r10) + 1; iIndexOfChild < view.getChildCount(); iIndexOfChild++) {
                    View childAt = view.getChildAt(iIndexOfChild);
                    if (childAt.getVisibility() == 0) {
                        Rect rect2 = new Rect();
                        childAt.getGlobalVisibleRect(rect2);
                        if (Rect.intersects(rect, rect2)) {
                            arrayList.add(new Rect(Math.max(rect.left, rect2.left), Math.max(rect.top, rect2.top), Math.min(rect.right, rect2.right), Math.min(rect.bottom, rect2.bottom)));
                        }
                    }
                }
                if (view != viewGroup) {
                    break;
                }
                view = 0;
            }
        }
        return new Pair(Boolean.valueOf(z10), arrayList);
    }

    public static /* synthetic */ List a(List list, int i10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((Rect) it.next(), i10));
        }
        return arrayList;
    }
}
