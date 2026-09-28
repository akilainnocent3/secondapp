package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class q0s implements mt60, et60 {
    public final nt60 a;
    public final et60 b;
    public final stw<Object> c;

    public q0s(final mt60 mt60Var, Map<String, ? extends List<? extends Object>> map, et60 et60Var) {
        Function1 function1 = new Function1() { // from class: n0s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                mt60 mt60Var2 = mt60Var;
                return Boolean.valueOf(mt60Var2 != null ? mt60Var2.a(obj) : true);
            }
        };
        qyd0 qyd0Var = pt60.a;
        this.a = new nt60(map, function1);
        this.b = et60Var;
        this.c = hz60.a();
    }

    @Override // defpackage.mt60
    public final boolean a(Object obj) {
        return this.a.a(obj);
    }

    @Override // defpackage.mt60
    public final mt60.a b(String str, Function0<? extends Object> function0) {
        return this.a.b(str, function0);
    }

    @Override // defpackage.et60
    public final void c(Object obj) {
        this.b.c(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // defpackage.mt60
    public final Map<String, List<Object>> d() {
        stw<Object> stwVar = this.c;
        Object[] objArr = stwVar.b;
        long[] jArr = stwVar.a;
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
                            this.b.c(objArr[(i << 3) + i3]);
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
        return this.a.d();
    }

    @Override // defpackage.mt60
    public final Object e(String str) {
        return this.a.e(str);
    }

    @Override // defpackage.et60
    public final void f(final Object obj, final op8 op8Var, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-858296452);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(this) ? 256 : 128;
        }
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            this.b.f(obj, op8Var, bVarI, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            boolean zA = bVarI.A(this) | bVarI.A(obj);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new l0s(i3, this, obj);
                bVarI.r(objY);
            }
            xvf.c(obj, (Function1) objY, bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: m0s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(i | 1);
                    this.a.f(obj, op8Var, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }
}
