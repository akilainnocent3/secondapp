package defpackage;

import com.sporty.android.book.presentation.sportsmenu.time.TimePickerItem;

/* JADX INFO: loaded from: classes4.dex */
public final class qwf0 {
    public static final xvf0 a(TimePickerItem timePickerItem, boolean z) {
        xvf0 xvf0Var = new xvf0(timePickerItem.getId());
        xvf0Var.b = timePickerItem.getName();
        xvf0Var.d = timePickerItem.getStartTime();
        xvf0Var.e = timePickerItem.getEndTime();
        xvf0Var.c = z;
        return xvf0Var;
    }
}
