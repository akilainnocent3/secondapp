package defpackage;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class sr1 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public sr1(BackEvent backEvent) {
        backEvent.getClass();
        float fC = fm0.c(backEvent);
        float fD = fm0.d(backEvent);
        float fA = fm0.a(backEvent);
        int iB = fm0.b(backEvent);
        this.a = fC;
        this.b = fD;
        this.c = fA;
        this.d = iB;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        return rr1.b(sb, this.d, '}');
    }
}
