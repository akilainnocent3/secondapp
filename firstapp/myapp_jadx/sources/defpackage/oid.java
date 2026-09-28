package defpackage;

import android.os.Build;
import androidx.media3.common.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oid implements om20 {
    public final /* synthetic */ pid a;
    public final /* synthetic */ pid.d b;

    public /* synthetic */ oid(pid pidVar, pid.d dVar) {
        this.a = pidVar;
        this.b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0068 A[FALL_THROUGH] */
    @Override // defpackage.om20
    public final boolean apply(Object obj) {
        pid pidVar;
        Boolean bool;
        pid.f fVar;
        pid.f fVar2;
        a aVar = (a) obj;
        if (this.b.A && ((bool = (pidVar = this.a).j) == null || !bool.booleanValue())) {
            int i = aVar.F;
            if (i != -1 && i > 2) {
                String str = aVar.n;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32 && (fVar2 = pidVar.h) != null && fVar2.b) {
                            }
                        default:
                            if (Build.VERSION.SDK_INT >= 32) {
                                break;
                            }
                            return false;
                    }
                } else if (Build.VERSION.SDK_INT >= 32 || (fVar = pidVar.h) == null || !fVar.b || !fVar.b() || !pidVar.h.c() || !pidVar.h.a(pidVar.i, aVar)) {
                    return false;
                }
            }
        }
        return true;
    }
}
