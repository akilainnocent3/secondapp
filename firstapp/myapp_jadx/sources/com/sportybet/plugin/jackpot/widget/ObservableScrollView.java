package com.sportybet.plugin.jackpot.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.sportybet.plugin.jackpot.activities.JackpotMainActivity;

/* JADX INFO: loaded from: classes4.dex */
public class ObservableScrollView extends ScrollView {
    public a a;

    public interface a {
    }

    public ObservableScrollView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a aVar = this.a;
        if (aVar != null) {
            JackpotMainActivity jackpotMainActivity = (JackpotMainActivity) aVar;
            if (i2 <= 0) {
                jackpotMainActivity.f.setBackgroundColor(Color.argb(0, 228, 24, 39));
                return;
            }
            if (i2 > 0) {
                float f = i2;
                float f2 = jackpotMainActivity.w;
                if (f < f2) {
                    jackpotMainActivity.f.setBackgroundColor(Color.argb((int) ((f / f2) * 255.0f), 228, 24, 39));
                    return;
                }
            }
            jackpotMainActivity.f.setBackgroundColor(Color.argb(255, 228, 24, 39));
        }
    }

    public void setOnObservableScrollViewListener(a aVar) {
        this.a = aVar;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
