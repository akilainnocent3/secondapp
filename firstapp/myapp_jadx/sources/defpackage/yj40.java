package defpackage;

import com.sportybet.android.instantwin.presentation.legends.b;
import java.math.BigDecimal;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yj40 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yj40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x009c A[Catch: all -> 0x008f, LOOP:0: B:15:0x0057->B:32:0x009c, LOOP_END, TryCatch #0 {all -> 0x008f, blocks: (B:8:0x0031, B:10:0x0041, B:12:0x0048, B:15:0x0057, B:17:0x0067, B:19:0x0073, B:21:0x007c, B:23:0x0085, B:28:0x0091, B:29:0x0094, B:32:0x009c, B:42:0x00c1, B:33:0x009f, B:34:0x00a5, B:36:0x00ab, B:38:0x00b3, B:41:0x00bd), top: B:52:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        zb6<Unit> zb6VarZ;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                wj40 wj40Var = (wj40) obj3;
                Set set = (Set) obj;
                synchronized (wj40Var.b) {
                    try {
                        if (((wj40.c) wj40Var.t.getValue()).compareTo(wj40.c.e) >= 0) {
                            stw<Object> stwVar = wj40Var.g;
                            if (set instanceof iz60) {
                                gz60<T> gz60Var = ((iz60) set).a;
                                Object[] objArr = gz60Var.b;
                                long[] jArr = gz60Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        long j = jArr[i2];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                if ((255 & j) < 128) {
                                                    Object obj4 = objArr[(i2 << 3) + i4];
                                                    if (!(obj4 instanceof oxd0) || ((oxd0) obj4).M(1)) {
                                                        stwVar.d(obj4);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i3 == 8) {
                                                if (i2 != length) {
                                                    i2++;
                                                }
                                            }
                                        } else if (i2 != length) {
                                            i2++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set) {
                                    if (!(obj5 instanceof oxd0) || ((oxd0) obj5).M(1)) {
                                        stwVar.d(obj5);
                                    }
                                }
                            }
                            zb6VarZ = wj40Var.z();
                        } else {
                            zb6VarZ = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (zb6VarZ != null) {
                    zi50.a aVar = zi50.b;
                    ((bc6) zb6VarZ).resumeWith(Unit.a);
                }
                return Unit.a;
            default:
                zrd0 zrd0Var = (zrd0) obj;
                BigDecimal bigDecimal = (BigDecimal) obj2;
                zrd0Var.getClass();
                bigDecimal.getClass();
                ((Function1) obj3).invoke(new b.r.d(zrd0Var, bigDecimal));
                return Unit.a;
        }
    }
}
