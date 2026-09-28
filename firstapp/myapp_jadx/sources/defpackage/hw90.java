package defpackage;

import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes.dex */
public final class hw90 {
    public static final fkd0<j58> a = yi0.d(0.0f, 0.0f, null, 7);

    public static final twd0 a(long j, goh gohVar, String str, a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            gohVar = a;
        }
        goh gohVar2 = gohVar;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean zM = aVar.M(j58.f(j));
        Object objY = aVar.y();
        if (zM || objY == a.C0041a.a) {
            objY = (f0h0) e78.a.invoke(j58.f(j));
            aVar.r(objY);
        }
        return xe0.c(new j58(j), (f0h0) objY, gohVar2, null, str2, null, aVar, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
