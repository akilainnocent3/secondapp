package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class vv60 {
    public static final uv60 a = new uv60(new tv60(), new sv60());

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final String str2, final long j, final long j2, a aVar, final int i) {
        b bVar;
        str.getClass();
        b bVarI = aVar.i(-2035280052);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.e(j2) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b("");
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            boolean z = (i2 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new p6b(null, ytwVar, str);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, str, (Function2) objY2);
            bVar = bVarI;
            lkf0.b(oxc.a(str2, " ", (String) ytwVar.getValue()), null, j, j2, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar, i2 & 8064, 0, 131058);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, j, j2, str, str2) { // from class: n6b
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;

                {
                    this.a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = j2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(385);
                    vv60.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
