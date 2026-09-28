package defpackage;

import android.content.res.Resources;
import com.sportybet.plugin.realsports.betorder.calendar.view.CalendarView;
import com.sportybet.plugin.realsports.betorder.calendar.view.customviews.CircleAnimationTextView;

/* JADX INFO: loaded from: classes7.dex */
public final class yyc extends sz1 {
    public CircleAnimationTextView c;
    public y52 d;

    public final void a(boolean z) {
        CircleAnimationTextView circleAnimationTextView = this.c;
        CalendarView calendarView = this.b;
        circleAnimationTextView.setCompoundDrawablePadding(((int) ((z ? lu5.d(calendarView.getContext().getResources(), calendarView.getConnectedDaySelectedIconRes()) : lu5.d(calendarView.getContext().getResources(), calendarView.getConnectedDayIconRes())) * Resources.getSystem().getDisplayMetrics().density)) * (-1));
        int connectedDayIconPosition = calendarView.getConnectedDayIconPosition();
        if (connectedDayIconPosition == 0) {
            circleAnimationTextView.setCompoundDrawablesWithIntrinsicBounds(0, z ? calendarView.getConnectedDaySelectedIconRes() : calendarView.getConnectedDayIconRes(), 0, 0);
        } else {
            if (connectedDayIconPosition != 1) {
                return;
            }
            circleAnimationTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, z ? calendarView.getConnectedDaySelectedIconRes() : calendarView.getConnectedDayIconRes());
        }
    }
}
