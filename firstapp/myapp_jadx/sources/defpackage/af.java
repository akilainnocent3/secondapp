package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sporty.android.common_ui.widgets.CommonButton;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.plugin.realsports.betorder.calendar.view.CalendarView;

/* JADX INFO: loaded from: classes5.dex */
public final class af implements g6i0 {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final RelativeLayout a;
    public final TextView b;
    public final CalendarView c;
    public final TextView d;
    public final ImageButton e;
    public final AppCompatImageView f;
    public final ImageButton i;
    public final BubbleView v;
    public final CommonButton w;
    public final CommonButton y;
    public final CommonButton z;

    public af(RelativeLayout relativeLayout, TextView textView, CalendarView calendarView, TextView textView2, ImageButton imageButton, AppCompatImageView appCompatImageView, ImageButton imageButton2, BubbleView bubbleView, CommonButton commonButton, CommonButton commonButton2, CommonButton commonButton3, ImageView imageView, TextView textView3, TextView textView4) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = calendarView;
        this.d = textView2;
        this.e = imageButton;
        this.f = appCompatImageView;
        this.i = imageButton2;
        this.v = bubbleView;
        this.w = commonButton;
        this.y = commonButton2;
        this.z = commonButton3;
        this.A = imageView;
        this.B = textView3;
        this.C = textView4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
