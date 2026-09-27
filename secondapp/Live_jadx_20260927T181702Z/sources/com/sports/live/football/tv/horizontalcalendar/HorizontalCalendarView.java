package com.sports.live.football.tv.horizontalcalendar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import com.sports.live.football.tv.a;
import fo.d;
import go.b;
import go.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class HorizontalCalendarView extends RecyclerView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f73554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f73555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f73556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f73557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f73558f;

    public HorizontalCalendarView(Context context) {
        super(context);
        this.f73558f = 0.5f;
    }

    public void b(eo.b horizontalCalendar) {
        horizontalCalendar.f().s(this.f73556d);
        horizontalCalendar.i().i(this.f73554b);
        horizontalCalendar.m().i(this.f73555c);
        this.f73556d = null;
        this.f73554b = null;
        this.f73555c = null;
        this.f73557e = horizontalCalendar.j() / 2;
    }

    public final int c() {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new TypedValue().data, new int[]{a.c.f73116c});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public final float d(TypedArray a10, int index, float defValue) {
        TypedValue typedValue = new TypedValue();
        return !a10.getValue(index, typedValue) ? defValue : TypedValue.complexToFloat(typedValue.data);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int velocityX, int velocityY) {
        return super.fling((int) (velocityX * 0.5f), velocityY);
    }

    public int getPositionOfCenterItem() {
        int iFindFirstCompletelyVisibleItemPosition;
        HorizontalLayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || (iFindFirstCompletelyVisibleItemPosition = layoutManager.findFirstCompletelyVisibleItemPosition()) == -1) {
            return -1;
        }
        return iFindFirstCompletelyVisibleItemPosition + this.f73557e;
    }

    public float getSmoothScrollSpeed() {
        return getLayoutManager().K();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int widthSpec, int heightSpec) {
        if (isInEditMode()) {
            setMeasuredDimension(widthSpec, 150);
        } else {
            super.onMeasure(widthSpec, heightSpec);
        }
    }

    public void setSmoothScrollSpeed(float smoothScrollSpeed) {
        getLayoutManager().L(smoothScrollSpeed);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public d getAdapter() {
        return (d) super.getAdapter();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public HorizontalLayoutManager getLayoutManager() {
        return (HorizontalLayoutManager) super.getLayoutManager();
    }

    public HorizontalCalendarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f73558f = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, a.o.f73518a, 0, 0);
        try {
            int color = typedArrayObtainStyledAttributes.getColor(a.o.f73530m, -3355444);
            int color2 = typedArrayObtainStyledAttributes.getColor(a.o.f73523f, color);
            int color3 = typedArrayObtainStyledAttributes.getColor(a.o.f73521d, color);
            int color4 = typedArrayObtainStyledAttributes.getColor(a.o.f73519b, color);
            int color5 = typedArrayObtainStyledAttributes.getColor(a.o.f73531n, -16777216);
            int color6 = typedArrayObtainStyledAttributes.getColor(a.o.f73524g, color5);
            int color7 = typedArrayObtainStyledAttributes.getColor(a.o.f73522e, color5);
            int color8 = typedArrayObtainStyledAttributes.getColor(a.o.f73520c, color5);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(a.o.f73525h);
            int color9 = typedArrayObtainStyledAttributes.getColor(a.o.f73526i, c());
            float fD = d(typedArrayObtainStyledAttributes, a.o.f73529l, 14.0f);
            float fD2 = d(typedArrayObtainStyledAttributes, a.o.f73528k, 24.0f);
            float fD3 = d(typedArrayObtainStyledAttributes, a.o.f73527j, 14.0f);
            this.f73554b = new b(color2, color3, color4, null);
            this.f73555c = new b(color6, color7, color8, drawable);
            this.f73556d = new c(fD, fD2, fD3, Integer.valueOf(color9));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
