package sg.bigo.ads.common.view.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.Set;
import java.util.WeakHashMap;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public final class d<T extends View> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f133628a = r.f133428a.a(1) / 60;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f133629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f133630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sg.bigo.ads.common.view.a.a f133631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f133632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f133633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f133634g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sg.bigo.ads.common.c.a f133636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Canvas f133637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bitmap f133638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f133639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f133640m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f133635h = new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.common.view.a.d.1
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - d.this.f133640m) < d.f133628a) {
                return true;
            }
            d.b(d.this);
            d.this.f133640m = jElapsedRealtime;
            return true;
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f133641n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final WeakHashMap<TextureView, Object> f133642o = new WeakHashMap<>();

    public static class a extends BitmapDrawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d f133645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Paint f133646b;

        private a(d dVar, Bitmap bitmap) {
            super(dVar.f133629b.getResources(), bitmap);
            this.f133645a = dVar;
            this.f133646b = new Paint();
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            super.draw(canvas);
            b bVar = this.f133645a.f133631d.f133616b;
            if (bVar != null) {
                this.f133646b.setColor(bVar.b());
                canvas.drawRect(getBounds(), this.f133646b);
            }
        }

        public /* synthetic */ a(d dVar, Bitmap bitmap, byte b10) {
            this(dVar, bitmap);
        }
    }

    public d(T t10) {
        this.f133629b = t10;
        Context context = t10.getContext();
        this.f133630c = context;
        this.f133636i = new sg.bigo.ads.common.c.b(context);
        this.f133631d = new sg.bigo.ads.common.view.a.a();
    }

    public static /* synthetic */ int d(d dVar) {
        int i10 = dVar.f133641n;
        dVar.f133641n = i10 + 1;
        return i10;
    }

    public final void b() {
        Bitmap bitmap = this.f133638k;
        if (bitmap != null) {
            bitmap.recycle();
            this.f133638k = null;
        }
        if (this.f133639l != null) {
            this.f133639l = null;
        }
        this.f133636i.a();
    }

    @Override // sg.bigo.ads.common.view.a.c
    public final void setBlurStyle(b bVar) {
        sg.bigo.ads.common.view.a.a aVar = this.f133631d;
        if ((bVar == null && aVar.f133616b == null) || bVar == aVar.f133616b) {
            return;
        }
        aVar.f133616b = bVar;
        aVar.invalidateSelf();
        this.f133640m = 0L;
        b();
    }

    public static /* synthetic */ void b(d dVar) {
        b bVar;
        Bitmap bitmap;
        if (dVar.f133632e) {
            return;
        }
        sg.bigo.ads.common.view.a.a aVar = dVar.f133631d;
        Drawable drawable = aVar.f133139a;
        if ((drawable == null || (drawable instanceof a)) && (bVar = aVar.f133616b) != null && bVar.c() > 0.0f && u.c(dVar.f133629b) && sg.bigo.ads.common.ab.a.a(dVar.f133629b, new Rect())) {
            b bVar2 = dVar.f133631d.f133616b;
            if (bVar2 == null) {
                dVar.b();
                return;
            }
            View view = dVar.f133633f;
            if (view == null || !dVar.f133629b.isShown()) {
                dVar.b();
                return;
            }
            Rect rect = new Rect();
            bVar2.a(rect);
            byte b10 = 0;
            if (dVar.f133637j == null || dVar.f133639l == null || dVar.f133638k == null) {
                dVar.b();
                int measuredWidth = (dVar.f133629b.getMeasuredWidth() - rect.left) - rect.right;
                int measuredHeight = (dVar.f133629b.getMeasuredHeight() - rect.top) - rect.bottom;
                int iMax = Math.max(1, (int) (measuredWidth / bVar2.d()));
                int iMax2 = Math.max(1, (int) (measuredHeight / bVar2.d()));
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                dVar.f133638k = sg.bigo.ads.common.utils.d.a(iMax, iMax2, config);
                dVar.f133639l = new a(dVar, sg.bigo.ads.common.utils.d.a(iMax, iMax2, config), b10);
                if (dVar.f133638k == null) {
                    return;
                }
                dVar.f133637j = new Canvas(dVar.f133638k);
                dVar.f133631d.a(dVar.f133639l);
                if (!dVar.f133636i.a(dVar.f133638k, bVar2.c())) {
                    return;
                }
            }
            Point pointA = u.a(view, dVar.f133629b);
            dVar.f133638k.eraseColor(bVar2.b());
            float alpha = dVar.f133629b.getAlpha();
            dVar.f133629b.setAlpha(0.0f);
            dVar.f133632e = true;
            float fD = 1.0f / bVar2.d();
            int iSave = dVar.f133637j.save();
            try {
                dVar.f133637j.scale(fD, fD);
                dVar.f133637j.translate((-pointA.x) - rect.left, (-pointA.y) - rect.top);
                if (view.getBackground() != null) {
                    view.getBackground().draw(dVar.f133637j);
                }
                view.draw(dVar.f133637j);
            } catch (Exception unused) {
            } finally {
                dVar.f133637j.restoreToCount(iSave);
            }
            dVar.a();
            Set<TextureView> setKeySet = dVar.f133642o.keySet();
            if (!k.a(setKeySet)) {
                int i10 = pointA.x;
                Rect rect2 = new Rect(rect.left + i10, pointA.y + rect.top, (i10 + dVar.f133629b.getMeasuredWidth()) - rect.right, (pointA.y + dVar.f133629b.getMeasuredHeight()) - rect.bottom);
                for (TextureView textureView : setKeySet) {
                    if (textureView != null && textureView.isOpaque() && u.d(textureView)) {
                        Point pointA2 = u.a(view, textureView);
                        int i11 = pointA2.x;
                        Rect rect3 = new Rect(i11, pointA2.y, textureView.getMeasuredWidth() + i11, pointA2.y + textureView.getMeasuredHeight());
                        Rect rect4 = new Rect(rect3);
                        if (rect4.intersect(rect2) && (bitmap = textureView.getBitmap()) != null) {
                            int i12 = rect4.left - rect3.left;
                            int i13 = rect4.top - rect3.top;
                            Rect rect5 = new Rect(i12, i13, rect4.width() + i12, rect4.height() + i13);
                            int i14 = rect4.left - rect2.left;
                            int i15 = rect4.top - rect2.top;
                            Rect rect6 = new Rect(i14, i15, rect4.width() + i14, rect4.height() + i15);
                            int iSave2 = dVar.f133637j.save();
                            try {
                                dVar.f133637j.scale(fD, fD);
                                dVar.f133637j.drawBitmap(bitmap, rect5, rect6, new Paint());
                            } catch (Exception unused2) {
                            } finally {
                                dVar.f133637j.restoreToCount(iSave2);
                            }
                            break;
                        }
                    }
                }
            }
            dVar.f133632e = false;
            dVar.f133629b.setAlpha(alpha);
            dVar.f133636i.a(dVar.f133638k, dVar.f133639l.getBitmap());
            dVar.f133631d.invalidateSelf();
        }
    }

    public final void a() {
        if (!(this.f133633f instanceof ViewGroup) || this.f133641n == this.f133642o.size()) {
            return;
        }
        this.f133641n = 0;
        this.f133642o.clear();
        u.a((ViewGroup) this.f133633f, new sg.bigo.ads.common.d<View>() { // from class: sg.bigo.ads.common.view.a.d.2
            @Override // sg.bigo.ads.common.d
            public final /* synthetic */ void a(View view) {
                View view2 = view;
                if (view2 instanceof TextureView) {
                    d.this.f133642o.put((TextureView) view2, d.this);
                    d.d(d.this);
                }
            }
        });
    }
}
