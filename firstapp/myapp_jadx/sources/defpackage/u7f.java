package defpackage;

import android.view.DragEvent;

/* JADX INFO: loaded from: classes.dex */
public final class u7f {
    public static final long a(m7f m7fVar) {
        DragEvent dragEvent = m7fVar.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }
}
