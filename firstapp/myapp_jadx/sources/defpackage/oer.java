package defpackage;

import android.os.SystemClock;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class oer {
    public static final ytw a(qcn qcnVar, a aVar) {
        qcnVar.getClass();
        boolean zM = aVar.M(qcnVar);
        Object objY = aVar.y();
        Object obj = a.C0041a.a;
        if (zM || objY == obj) {
            objY = m.b(per.a(SystemClock.elapsedRealtime(), qcnVar));
            aVar.r(objY);
        }
        ytw ytwVar = (ytw) objY;
        boolean zM2 = aVar.M(ytwVar) | aVar.M(qcnVar);
        Object objY2 = aVar.y();
        if (zM2 || objY2 == obj) {
            objY2 = new ner(ytwVar, qcnVar, null);
            aVar.r(objY2);
        }
        xvf.e(aVar, qcnVar, (Function2) objY2);
        return ytwVar;
    }
}
