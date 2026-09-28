package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.fh6;
import defpackage.gh6;
import defpackage.mz50;
import defpackage.vk30;

/* JADX INFO: loaded from: classes4.dex */
public class CardView extends FrameLayout {
    public static final int[] f = {R.attr.colorBackground};
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final a e;

    public class a implements gh6 {
        public mz50 a;

        public a() {
        }

        public final void a(int i, int i2, int i3, int i4) {
            CardView cardView = CardView.this;
            cardView.d.set(i, i2, i3, i4);
            Rect rect = cardView.c;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        a aVar = new a();
        this.e = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vk30.a, i, com.sportybet.android.gp.tz.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.sportybet.android.gp.tz.R.color.cardview_light_background) : getResources().getColor(com.sportybet.android.gp.tz.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        mz50 mz50Var = new mz50(colorStateListValueOf, dimension);
        aVar.a = mz50Var;
        setBackgroundDrawable(mz50Var);
        setClipToOutline(true);
        setElevation(dimension2);
        fh6.a(aVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return this.e.a.h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return this.e.a.e;
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return this.e.a.a;
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        mz50 mz50Var = this.e.a;
        if (colorStateListValueOf == null) {
            mz50Var.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        mz50Var.h = colorStateListValueOf;
        mz50Var.b.setColor(colorStateListValueOf.getColorForState(mz50Var.getState(), mz50Var.h.getDefaultColor()));
        mz50Var.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        CardView.this.setElevation(f2);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.c.set(i, i2, i3, i4);
        fh6.b(this.e);
    }

    public void setMaxCardElevation(float f2) {
        fh6.a(this.e, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            a aVar = this.e;
            fh6.a(aVar, aVar.a.e);
        }
    }

    public void setRadius(float f2) {
        mz50 mz50Var = this.e.a;
        if (f2 == mz50Var.a) {
            return;
        }
        mz50Var.a = f2;
        mz50Var.b(null);
        mz50Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            a aVar = this.e;
            fh6.a(aVar, aVar.a.e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        mz50 mz50Var = this.e.a;
        if (colorStateList == null) {
            mz50Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        mz50Var.h = colorStateList;
        mz50Var.b.setColor(colorStateList.getColorForState(mz50Var.getState(), mz50Var.h.getDefaultColor()));
        mz50Var.invalidateSelf();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.sportybet.android.gp.tz.R.attr.cardViewStyle);
    }

    public CardView(Context context) {
        this(context, null);
    }
}
