package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l13 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bm f151837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bp f151838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m13 f151839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u41 f151840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Drawable f151841e;

    public l13(bm bmVar, bp bpVar, m13 m13Var, u41 u41Var, Drawable drawable) {
        this.f151837a = bmVar;
        this.f151838b = bpVar;
        this.f151839c = m13Var;
        this.f151840d = u41Var;
        this.f151841e = drawable;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Bitmap bitmap;
        g13 g13Var;
        List list;
        Object next;
        dm dmVar;
        float f10;
        float f11;
        String str;
        g13 g13Var2;
        dm dmVar2;
        g13 g13Var3;
        float fWidth;
        int i18;
        String str2;
        String str3;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView == null) {
            return;
        }
        Drawable drawable = this.f151841e;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return;
        }
        boolean z10 = (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) ? false : true;
        boolean z11 = (i13 == i11 || i10 == i12) ? false : true;
        if (z10 && z11) {
            RectF rectF = new RectF(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight());
            if (rectF.height() == 0.0f) {
                return;
            }
            bm bmVar = this.f151837a;
            u41 u41Var = this.f151840d;
            bmVar.getClass();
            o13 o13Var = u41Var.f156270e;
            if (o13Var != null && (dmVar = o13Var.f153310e) != null) {
                String str4 = dmVar.f148271d;
                boolean z12 = (str4 == null || (str3 = dmVar.f148268a) == null || !kotlin.jvm.internal.m0.g(str4, str3)) ? false : true;
                String str5 = dmVar.f148270c;
                boolean z13 = (str5 == null || (str2 = dmVar.f148269b) == null || !kotlin.jvm.internal.m0.g(str5, str2)) ? false : true;
                if (z12 || z13) {
                    bm bmVar2 = this.f151837a;
                    u41 u41Var2 = this.f151840d;
                    bmVar2.getClass();
                    o13 o13Var2 = u41Var2.f156270e;
                    if (o13Var2 == null || (dmVar2 = o13Var2.f153310e) == null || (g13Var3 = o13Var2.f153311f) == null) {
                        f10 = 0.0f;
                        f11 = 1.0f;
                        str = null;
                    } else {
                        float fWidth2 = rectF.width();
                        float fHeight = rectF.height();
                        float f12 = u41Var2.f156266a;
                        float f13 = u41Var2.f156267b;
                        float f14 = g13Var3.f149344c;
                        float f15 = g13Var3.f149345d;
                        if (fWidth2 == 0.0f || fHeight == 0.0f || f12 == 0.0f || f13 == 0.0f || f14 == 0.0f || f15 == 0.0f) {
                            f10 = 0.0f;
                            f11 = 1.0f;
                        } else {
                            f11 = 1.0f;
                            f10 = 0.0f;
                            if (rectF.width() / rectF.height() > g13Var3.f149344c / g13Var3.f149345d) {
                                fWidth = rectF.height();
                                i18 = g13Var3.f149345d;
                            } else {
                                fWidth = rectF.width();
                                i18 = g13Var3.f149344c;
                            }
                            if (fWidth / i18 <= 1.0f) {
                                if (fWidth2 / fHeight > f14 / f15) {
                                    if (kotlin.jvm.internal.m0.g(dmVar2.f148269b, dmVar2.f148270c)) {
                                        str = dmVar2.f148269b;
                                    }
                                } else if (kotlin.jvm.internal.m0.g(dmVar2.f148268a, dmVar2.f148271d)) {
                                    str = dmVar2.f148268a;
                                }
                            } else if (fWidth2 / fHeight > f12 / f13) {
                                if (kotlin.jvm.internal.m0.g(dmVar2.f148269b, dmVar2.f148270c)) {
                                    str = dmVar2.f148269b;
                                }
                            } else if (kotlin.jvm.internal.m0.g(dmVar2.f148268a, dmVar2.f148271d)) {
                                str = dmVar2.f148268a;
                            }
                        }
                        str = null;
                    }
                    o13 o13Var3 = this.f151840d.f156270e;
                    if (o13Var3 == null || (g13Var2 = o13Var3.f153311f) == null) {
                        return;
                    }
                    if (str == null) {
                        this.f151839c.a(imageView, bitmap, g13Var2);
                        return;
                    }
                    m13 m13Var = this.f151839c;
                    m13Var.getClass();
                    float width = imageView.getWidth();
                    float height = imageView.getHeight();
                    float width2 = bitmap.getWidth();
                    float height2 = bitmap.getHeight();
                    int i19 = g13Var2.f149344c;
                    float f16 = i19;
                    int i20 = g13Var2.f149345d;
                    float f17 = i20;
                    if (height == f10 || f17 == f10 || height2 == f10) {
                        return;
                    }
                    float f18 = width / height;
                    float f19 = f18 < f16 / f17 ? width / f16 : height / f17;
                    if (f19 > f11) {
                        f19 = f18 < width2 / height2 ? width / width2 : height / height2;
                    }
                    float f20 = ((i19 / 2) + g13Var2.f149342a) * f19;
                    float f21 = 2;
                    float f22 = (height / f21) - (((i20 / 2) + g13Var2.f149343b) * f19);
                    m13Var.f152261b.setScale(f19, f19);
                    m13Var.f152261b.postTranslate((width / f21) - f20, f22);
                    imageView.setScaleType(ImageView.ScaleType.MATRIX);
                    imageView.setImageMatrix(m13Var.f152261b);
                    imageView.setBackgroundColor(Color.parseColor(str));
                    i13 i13Var = m13Var.f152260a;
                    Context context = imageView.getContext();
                    i13Var.getClass();
                    if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
                        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                        Canvas canvas = new Canvas(bitmapCopy);
                        Rect rect = m13Var.f152263d;
                        int i21 = g13Var2.f149342a;
                        int i22 = g13Var2.f149343b;
                        rect.set(i21, i22, g13Var2.f149344c + i21, g13Var2.f149345d + i22);
                        canvas.drawRect(rect, m13Var.f152262c);
                        imageView.setImageBitmap(bitmapCopy);
                        return;
                    }
                    return;
                }
            }
            bp bpVar = this.f151838b;
            u41 u41Var3 = this.f151840d;
            bpVar.getClass();
            RectF rectF2 = new RectF(0.0f, 0.0f, u41Var3.f156266a, u41Var3.f156267b);
            o13 o13Var4 = u41Var3.f156270e;
            if (o13Var4 == null || (list = o13Var4.f153312g) == null) {
                g13Var = null;
            } else {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    while (it.hasNext()) {
                        g13 g13Var4 = (g13) it.next();
                        next = (g13) next;
                        bpVar.f147301a.getClass();
                        float fA = k13.a(next, rectF, rectF2);
                        float fA2 = k13.a(g13Var4, rectF, rectF2);
                        if (fA != Float.MAX_VALUE) {
                            if (fA == fA2) {
                                if (next.f149346e > g13Var4.f149346e) {
                                }
                            } else if (fA > fA2) {
                            }
                        }
                        next = g13Var4;
                    }
                } else {
                    next = 0;
                }
                g13Var = (g13) next;
            }
            if (g13Var != null) {
                this.f151839c.a(imageView, bitmap, g13Var);
            }
        }
    }
}
