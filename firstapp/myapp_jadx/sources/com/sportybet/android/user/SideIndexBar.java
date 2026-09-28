package com.sportybet.android.user;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import defpackage.s47;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class SideIndexBar extends View {
    public final String[] a;
    public boolean b;
    public a c;
    public final Paint d;
    public int e;

    public interface a {
    }

    public SideIndexBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new String[]{"#", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X, "Y", "Z"};
        Paint paint = new Paint();
        this.d = paint;
        this.e = -1;
        paint.setColor(getResources().getColor(R.color.brand_quaternary));
        paint.setTextSize(((double) context.getResources().getDisplayMetrics().density) == 1.0d ? 12.0f : 25.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b) {
            setBackgroundColor(Color.parseColor("#4c353a45"));
        } else {
            setBackgroundColor(0);
        }
        int height = getHeight();
        int width = getWidth();
        String[] strArr = this.a;
        int length = height / strArr.length;
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            Paint paint = this.d;
            canvas.drawText(str, (width / 2) - (paint.measureText(str) / 2.0f), (length * i) + length, paint);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        String str;
        ChangeLocationActivity changeLocationActivity;
        HashMap map;
        float y = motionEvent.getY();
        int i = this.e;
        float height = y / getHeight();
        String[] strArr = this.a;
        int length = (int) (height * strArr.length);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b = true;
            if (length != i && (aVar = this.c) != null && length > -1 && length < strArr.length) {
                str = strArr[length];
                changeLocationActivity = ((com.sportybet.android.user.a) aVar).a;
                changeLocationActivity.y.setVisibility(0);
                changeLocationActivity.y.setText(str);
                map = changeLocationActivity.M;
                if (str.equals("#")) {
                    changeLocationActivity.f.o0(0);
                } else if (map.keySet().contains(str)) {
                    int iIntValue = ((Integer) map.get(str)).intValue();
                    changeLocationActivity.f.o0(iIntValue);
                    ((LinearLayoutManager) changeLocationActivity.f.getLayoutManager()).w1(iIntValue, 0);
                }
                this.e = length;
                invalidate();
            }
        } else {
            if (action == 1) {
                this.b = false;
                this.e = -1;
                a aVar2 = this.c;
                if (aVar2 != null) {
                    com.sportybet.android.user.a aVar3 = (com.sportybet.android.user.a) aVar2;
                    aVar3.a.y.postDelayed(new s47(aVar3), 1000L);
                }
                invalidate();
                return true;
            }
            if (action == 2) {
                this.b = true;
                if (length != i) {
                    str = strArr[length];
                    changeLocationActivity = ((com.sportybet.android.user.a) aVar).a;
                    changeLocationActivity.y.setVisibility(0);
                    changeLocationActivity.y.setText(str);
                    map = changeLocationActivity.M;
                    if (str.equals("#")) {
                        changeLocationActivity.f.o0(0);
                    } else if (map.keySet().contains(str)) {
                        int iIntValue2 = ((Integer) map.get(str)).intValue();
                        changeLocationActivity.f.o0(iIntValue2);
                        ((LinearLayoutManager) changeLocationActivity.f.getLayoutManager()).w1(iIntValue2, 0);
                    }
                    this.e = length;
                    invalidate();
                }
            }
        }
        return true;
    }

    public void setOnChooseListener(a aVar) {
        this.c = aVar;
    }

    public SideIndexBar(Context context) {
        this(context, null);
    }
}
