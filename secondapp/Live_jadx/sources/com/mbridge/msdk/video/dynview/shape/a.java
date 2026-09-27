package com.mbridge.msdk.video.dynview.shape;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a extends ShapeDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f70792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f70793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f70794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f70795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f70796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f70797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f70798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f70799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f70800i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Matrix f70801j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RectShape f70802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f70803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap f70804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f70805d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f70806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f70807f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f70808g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f70809h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f70810i;

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public a build() {
            return new a(this);
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c orientation(int i10) {
            this.f70806e = i10;
            return this;
        }

        private b() {
            this.f70807f = 100;
            this.f70808g = 10;
            this.f70802a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(Bitmap bitmap) {
            this.f70804c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c b(Bitmap bitmap) {
            this.f70803b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(boolean z10) {
            this.f70805d = z10;
            return this;
        }

        public c b(float f10) {
            this.f70809h = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(float f10) {
            this.f70810i = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(int i10) {
            this.f70808g = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        c a(float f10);

        c a(int i10);

        c a(Bitmap bitmap);

        c a(boolean z10);

        c b(Bitmap bitmap);

        a build();

        c orientation(int i10);
    }

    private void a(Canvas canvas) {
        float f10 = this.f70793b / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, this.f70794c);
        path.lineTo((f10 - this.f70795d) - this.f70796e, this.f70794c);
        path.lineTo((this.f70795d + f10) - this.f70796e, 0.0f);
        if (this.f70799h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f70797f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f70797f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(this.f70795d + f10 + this.f70796e, 0.0f);
        path2.lineTo(this.f70793b, 0.0f);
        path2.lineTo(this.f70793b, this.f70794c);
        path2.lineTo((f10 - this.f70795d) + this.f70796e, this.f70794c);
        if (this.f70799h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f70798g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f70798g);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    private void b(Canvas canvas) {
        float f10 = this.f70794c / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, (this.f70795d + f10) - this.f70796e);
        path.lineTo(this.f70793b, (f10 - this.f70795d) - this.f70796e);
        path.lineTo(this.f70793b, 0.0f);
        if (this.f70799h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f70797f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f70797f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(0.0f, this.f70795d + f10 + this.f70796e);
        path2.lineTo(0.0f, this.f70794c);
        path2.lineTo(this.f70793b, this.f70794c);
        path2.lineTo(this.f70793b, (f10 - this.f70795d) + this.f70796e);
        if (this.f70799h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f70798g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f70798g);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f70792a == 1) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private a(b bVar) {
        super(bVar.f70802a);
        this.f70799h = false;
        this.f70797f = bVar.f70803b;
        this.f70798g = bVar.f70804c;
        this.f70799h = bVar.f70805d;
        this.f70792a = bVar.f70806e;
        this.f70795d = bVar.f70807f;
        this.f70796e = bVar.f70808g;
        this.f70793b = bVar.f70809h;
        this.f70794c = bVar.f70810i;
        Paint paint = new Paint();
        this.f70800i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f70800i.setAntiAlias(true);
        this.f70801j = new Matrix();
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            float fMax = Math.max(this.f70793b / bitmap.getWidth(), this.f70794c / bitmap.getHeight());
            if (this.f70801j == null) {
                this.f70801j = new Matrix();
            }
            this.f70801j.reset();
            this.f70801j.preScale(fMax, fMax);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.f70801j);
        this.f70800i.setShader(bitmapShader);
        canvas.drawPath(path, this.f70800i);
    }

    private void a(Canvas canvas, Path path) {
        this.f70800i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f70800i);
    }

    public static b a() {
        return new b();
    }
}
