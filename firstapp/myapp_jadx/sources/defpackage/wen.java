package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class wen implements g00 {
    public static final void b(final Object obj, final int i, final fyr fyrVar, final op8 op8Var, a aVar, final int i2) {
        int i3;
        b bVarI = aVar.i(872548579);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.A(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.A(fyrVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.A(op8Var) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zM = bVarI.M(obj) | bVarI.M(fyrVar);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new byr(obj, fyrVar);
                bVarI.r(objY);
            }
            byr byrVar = (byr) objY;
            byrVar.c = i;
            ytw ytwVar = byrVar.g;
            chf chfVar = k610.a;
            j610 j610Var = (j610) bVarI.O(chfVar);
            c5a0.e.getClass();
            c5a0 c5a0VarA = c5a0.a.a();
            Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
            c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
            try {
                if (j610Var != ((j610) ((x5a0) ytwVar).getValue())) {
                    ((x5a0) ytwVar).setValue(j610Var);
                    if (byrVar.d > 0) {
                        j610.a aVar2 = byrVar.e;
                        if (aVar2 != null) {
                            aVar2.release();
                        }
                        byrVar.e = j610Var != null ? j610Var.a() : null;
                    }
                }
                Unit unit = Unit.a;
                c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                boolean zM2 = bVarI.M(byrVar);
                Object objY2 = bVarI.y();
                if (zM2 || objY2 == c0042a) {
                    objY2 = new cyr(byrVar, 0);
                    bVarI.r(objY2);
                }
                xvf.c(byrVar, (Function1) objY2, bVarI);
                hna.a(chfVar.a(byrVar), op8Var, bVarI, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                throw th;
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: dyr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    wen.b(obj, i, fyrVar, op8Var, (a) obj2, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static b2h c(rft rftVar) {
        if (rftVar instanceof ii1) {
            return ((ii1) rftVar).j();
        }
        hb5.a("logRecordData must be ExtendedLogRecordData");
        return null;
    }

    @Override // defpackage.g00
    public void a(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }
}
