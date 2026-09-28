package defpackage;

import android.view.MotionEvent;
import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes.dex */
public final class s5w {
    public static final s5w a = new s5w();

    public final boolean a(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Reader.READ_DONE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Reader.READ_DONE) < 2139095040;
    }
}
