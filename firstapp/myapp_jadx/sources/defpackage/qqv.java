package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qqv extends d.c implements yma, psr {
    public LinkedHashMap D;

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        float f = ((g7f) zma.a(this, zxo.d)).a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        final y yVarD0 = vhvVar.d0(j);
        boolean z = this.C && !Float.isNaN(f) && Float.compare(f, 0.0f) > 0;
        int iY0 = !Float.isNaN(f) ? tVar.y0(f) : 0;
        final int iMax = yVarD0.a;
        if (z) {
            iMax = Math.max(iMax, iY0);
        }
        final int iMax2 = yVarD0.b;
        if (z) {
            iMax2 = Math.max(iMax2, iY0);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.D;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.D = linkedHashMap;
            }
            t2i0 t2i0Var = zxo.b;
            int iRound = Math.round((iY0 - yVarD0.a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(t2i0Var, Integer.valueOf(iRound));
            mjm mjmVar = zxo.a;
            int iRound2 = Math.round((iY0 - yVarD0.b) / 2.0f);
            linkedHashMap.put(mjmVar, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map<kt, Integer> map = this.D;
        if (map == null) {
            map = o2g.a;
            map.getClass();
        }
        return tVar.e1(iMax, iMax2, map, new Function1() { // from class: pqv
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y yVar = yVarD0;
                ((y.a) obj).s(yVar, ycv.b((iMax - yVar.a) / 2.0f), ycv.b((iMax2 - yVar.b) / 2.0f), 0.0f);
                return Unit.a;
            }
        });
    }
}
