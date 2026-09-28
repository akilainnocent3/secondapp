package defpackage;

import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes4.dex */
public final class bcd implements iwf {
    public static final bcd a = new bcd();

    @Override // defpackage.iwf
    public final long a(float f, int i, long j, a aVar) {
        aVar.N(458258929);
        if (Float.compare(f, 0.0f) > 0) {
            aVar.N(-1709191576);
            qyd0 qyd0Var = hdt.a;
            j = r58.h(j58.c(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, g68.b(j, aVar)), j);
            aVar.H();
        } else {
            aVar.N(-1709053068);
            aVar.H();
        }
        aVar.H();
        return j;
    }
}
