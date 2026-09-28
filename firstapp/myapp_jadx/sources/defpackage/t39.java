package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes7.dex */
public final class t39 {
    public static final op8 a = new op8(1296712615, new r39(), false);
    public static final op8 b = new op8(1580698153, new s39(), false);

    public static boolean a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
