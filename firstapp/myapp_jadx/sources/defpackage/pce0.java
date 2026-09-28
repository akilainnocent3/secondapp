package defpackage;

import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class pce0 extends qlr implements Function0<Unit> {
    public final /* synthetic */ g0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pce0(g0 g0Var) {
        super(0);
        this.a = g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005a A[LOOP:0: B:7:0x0024->B:17:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x005d A[EDGE_INSN: B:28:0x005d->B:18:0x005d BREAK  A[LOOP:0: B:7:0x0024->B:17:0x005a], SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        k kVarA = this.a.a();
        tsr tsrVar = kVarA.a;
        if (kVarA.C != ((duw.a) tsrVar.B()).a.c) {
            rtw<tsr, k.b> rtwVar = kVarA.f;
            Object[] objArr = rtwVar.c;
            long[] jArr = rtwVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((k.b) objArr[(i << 3) + i3]).d = true;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i != length) {
                            break;
                        }
                        i++;
                    }
                }
            }
            if (tsrVar.v != null) {
                if (!tsrVar.V.e) {
                    tsr.f0(tsrVar, false, 7);
                }
            } else if (!tsrVar.D()) {
                tsr.h0(tsrVar, false, 7);
            }
        }
        return Unit.a;
    }
}
