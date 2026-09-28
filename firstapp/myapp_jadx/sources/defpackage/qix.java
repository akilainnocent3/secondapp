package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", f = "NavHost.kt", l = {}, m = "invokeSuspend")
public final class qix extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ dtg0<ifx> a;
    public final /* synthetic */ phx b;
    public final /* synthetic */ ifx c;
    public final /* synthetic */ ctw<String> d;
    public final /* synthetic */ twd0<List<ifx>> e;
    public final /* synthetic */ sga f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qix(dtg0<ifx> dtg0Var, phx phxVar, ifx ifxVar, ctw<String> ctwVar, twd0<? extends List<ifx>> twd0Var, sga sgaVar, v1b<? super qix> v1bVar) {
        super(2, v1bVar);
        this.a = dtg0Var;
        this.b = phxVar;
        this.c = ifxVar;
        this.d = ctwVar;
        this.e = twd0Var;
        this.f = sgaVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qix(this.a, this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qix) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00de A[LOOP:1: B:15:0x0063->B:27:0x00de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e1 A[EDGE_INSN: B:32:0x00e1->B:28:0x00e1 BREAK  A[LOOP:1: B:15:0x0063->B:27:0x00de], SYNTHETIC] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        dtg0<ifx> dtg0Var = this.a;
        Object objV = dtg0Var.a.V();
        ytw ytwVar = dtg0Var.d;
        if (Intrinsics.g(objV, ((x5a0) ytwVar).getValue()) && (this.b.b.h() == null || Intrinsics.g(((x5a0) ytwVar).getValue(), this.c))) {
            Iterator<T> it = this.e.getValue().iterator();
            while (it.hasNext()) {
                this.f.b().b((ifx) it.next());
            }
            ctw<String> ctwVar = this.d;
            long[] jArr = ctwVar.a;
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
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = ctwVar.b[i4];
                                float f = ctwVar.c[i4];
                                if (!Intrinsics.g((String) obj2, ((ifx) ((x5a0) ytwVar).getValue()).f)) {
                                    ctwVar.e--;
                                    long[] jArr2 = ctwVar.a;
                                    int i5 = ctwVar.d;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    ctwVar.b[i4] = null;
                                }
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
        }
        return Unit.a;
    }
}
