package defpackage;

import androidx.compose.runtime.a;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jkf implements Function2 {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ jkf() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0061 A[LOOP:0: B:7:0x001a->B:20:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                kkf.a(qj40.a(1), (a) obj);
                return Unit.a;
            default:
                kt60 kt60Var = (kt60) obj2;
                Map<Object, Map<String, List<Object>>> map = kt60Var.a;
                rtw<Object, mt60> rtwVar = kt60Var.b;
                Object[] objArr = rtwVar.b;
                Object[] objArr2 = rtwVar.c;
                long[] jArr = rtwVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map<String, List<Object>> mapD = ((mt60) objArr2[i4]).d();
                                    if (mapD.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapD);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
        }
    }

    public /* synthetic */ jkf(int i) {
    }
}
