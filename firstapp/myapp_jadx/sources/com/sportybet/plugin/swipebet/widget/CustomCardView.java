package com.sportybet.plugin.swipebet.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.cardview.widget.CardView;
import defpackage.ug6;

/* JADX INFO: loaded from: classes7.dex */
public class CustomCardView extends CardView {
    public float i;
    public float v;
    public a w;

    public interface a {
    }

    public CustomCardView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.i = motionEvent.getX();
            this.v = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x = motionEvent.getX() - this.i;
            float y = motionEvent.getY() - this.v;
            if (Math.abs(x) <= 25.0f && y > 50.0f && (aVar = this.w) != null) {
                ((ug6) aVar).a();
            }
        }
        return true;
    }

    public void setMotionDetector(a aVar) {
        this.w = aVar;
    }

    public CustomCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
