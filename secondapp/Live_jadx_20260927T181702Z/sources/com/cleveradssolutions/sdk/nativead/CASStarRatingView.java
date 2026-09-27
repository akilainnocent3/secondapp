package com.cleveradssolutions.sdk.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.cleveradssolutions.internal.integration.j;
import java.util.ArrayList;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@s1({"SMAP\nCASStarRatingView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CASStarRatingView.kt\ncom/cleveradssolutions/sdk/nativead/CASStarRatingView\n+ 2 AdSizeFactory.kt\ncom/cleveradssolutions/internal/CASUtils__AdSizeFactoryKt\n*L\n1#1,174:1\n18#2,4:175\n18#2,4:179\n*S KotlinDebug\n*F\n+ 1 CASStarRatingView.kt\ncom/cleveradssolutions/sdk/nativead/CASStarRatingView\n*L\n29#1:175,4\n124#1:179,4\n*E\n"})
public final class CASStarRatingView extends View implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f44053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f44054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Path f44055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f44056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Double f44059h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CASStarRatingView(@l Context context, @m AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m0.p(context, "context");
        Paint paint = new Paint(1);
        this.f44053b = paint;
        Paint paint2 = new Paint(1);
        this.f44054c = paint2;
        this.f44056e = new RectF();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        m0.o(displayMetrics, "getDisplayMetrics(...)");
        this.f44057f = (int) ((2 * displayMetrics.density) + 0.5f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint2.setStyle(Paint.Style.FILL);
        setColor(j.a());
        if (attributeSet != null || isInEditMode()) {
            setRating(Double.valueOf(4.5d));
        }
    }

    public static ArrayList b(PointF pointF, float f10, float f11) {
        ArrayList arrayList = new ArrayList(5);
        for (int i10 = 0; i10 < 5; i10++) {
            double d10 = f11;
            arrayList.add(new PointF((((float) Math.cos(d10)) * f10) + pointF.x, (((float) Math.sin(d10)) * f10) + pointF.y));
            f11 += 1.2566371f;
        }
        return arrayList;
    }

    public final int a(int i10, int i11) {
        int iMin = Math.min((((i10 - getPaddingLeft()) - getPaddingRight()) - (this.f44057f * 4)) / 5, (i11 - getPaddingTop()) - getPaddingBottom());
        Context context = getContext();
        m0.o(context, "getContext(...)");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        m0.o(displayMetrics, "getDisplayMetrics(...)");
        if (iMin < ((int) ((5 * displayMetrics.density) + 0.5f))) {
            return 0;
        }
        return iMin;
    }

    public final void c() {
        this.f44055d = null;
        Double rating = getRating();
        if (rating != null) {
            float fDoubleValue = (float) rating.doubleValue();
            int iA = a(getWidth(), getHeight());
            if (iA > 0) {
                Path path = new Path();
                float f10 = 0.5f;
                float height = (((getHeight() - getPaddingTop()) - getPaddingBottom()) - iA) * 0.5f;
                int paddingLeft = getPaddingLeft();
                int i10 = 0;
                int i11 = 0;
                while (i11 < 5) {
                    RectF rectF = new RectF(paddingLeft, getPaddingTop() + height, paddingLeft + iA, getPaddingBottom() + iA + height);
                    PointF pointF = new PointF(rectF.centerX(), rectF.centerY());
                    ArrayList arrayListB = b(pointF, rectF.width() * f10, 4.712389f);
                    PointF pointF2 = (PointF) arrayListB.get(i10);
                    PointF pointF3 = (PointF) arrayListB.get(1);
                    float f11 = pointF2.x;
                    float f12 = f10;
                    float f13 = ((pointF3.x - f11) * f12) + f11;
                    float f14 = pointF2.y;
                    PointF pointF4 = new PointF(f13, ((pointF3.y - f14) * f12) + f14);
                    int i12 = i11;
                    float f15 = height;
                    ArrayList arrayListB2 = b(pointF, ((float) Math.sqrt(Math.pow(pointF.y - pointF4.y, 2.0d) + Math.pow(pointF.x - pointF4.x, 2.0d))) - (((float) Math.sqrt(Math.pow(pointF2.y - pointF4.y, 2.0d) + Math.pow(pointF2.x - pointF4.x, 2.0d))) / ((float) Math.tan(0.9424778f))), 5.340708f);
                    Path path2 = new Path();
                    path2.moveTo(pointF2.x, pointF2.y);
                    for (int i13 = 0; i13 < 5; i13++) {
                        PointF pointF5 = (PointF) arrayListB.get(i13);
                        PointF pointF6 = (PointF) arrayListB2.get(i13);
                        path2.lineTo(pointF5.x, pointF5.y);
                        path2.lineTo(pointF6.x, pointF6.y);
                    }
                    path2.close();
                    path.addPath(path2);
                    paddingLeft += this.f44057f + iA;
                    i11 = i12 + 1;
                    height = f15;
                    f10 = f12;
                    i10 = 0;
                }
                this.f44055d = path;
                this.f44056e.right = (fDoubleValue * iA) + (((float) Math.ceil(fDoubleValue - 1.0f)) * this.f44057f) + getPaddingRight();
                this.f44056e.bottom = getHeight();
            }
        }
    }

    public final int getColor() {
        return this.f44058g;
    }

    @Override // com.cleveradssolutions.sdk.nativead.f
    @m
    public Double getRating() {
        return this.f44059h;
    }

    public final int getSpace() {
        return this.f44057f;
    }

    @Override // android.view.View
    public void onDraw(@l Canvas canvas) {
        m0.p(canvas, "canvas");
        Path path = this.f44055d;
        if (path != null) {
            canvas.drawPath(path, this.f44053b);
            canvas.clipPath(path);
            canvas.drawRect(this.f44056e, this.f44054c);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int iA = a(size, View.MeasureSpec.getSize(i11));
        int paddingRight = (this.f44057f * 4) + getPaddingRight() + getPaddingLeft() + (iA * 5);
        if (iA == 0 || getRating() == null || paddingRight > size) {
            setMeasuredDimension(0, 0);
            return;
        }
        setMeasuredDimension(View.resolveSizeAndState(paddingRight, i10, 0), View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + iA, i11, 0));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        c();
    }

    public final void setColor(int i10) {
        this.f44058g = i10;
        this.f44053b.setColor(i10);
        this.f44054c.setColor(i10);
        c();
    }

    @Override // com.cleveradssolutions.sdk.nativead.f
    public void setRating(@m Double d10) {
        this.f44059h = d10 != null ? Double.valueOf(Math.ceil(d10.doubleValue() * 2.0d) / 2.0d) : null;
        requestLayout();
    }

    public final void setSpace(int i10) {
        this.f44057f = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CASStarRatingView(@l Context context) {
        this(context, null, 0);
        m0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CASStarRatingView(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public CASStarRatingView(@l Context context, @m AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10);
        m0.p(context, "context");
    }
}
