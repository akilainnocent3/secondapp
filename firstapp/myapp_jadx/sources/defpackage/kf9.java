package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kf9 implements w6a0 {
    public static final op8 a = new op8(1522473717, new if9(), false);
    public static final kf9 b = new kf9();
    public static final kf9 c = new kf9();

    public static int a(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final int b(int i, List list) {
        int i2;
        byte b2;
        int i3 = ((jrz) CollectionsKt.b0(list)).c;
        if (i > ((jrz) CollectionsKt.b0(list)).c) {
            xkn.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            jrz jrzVar = (jrz) list.get(i2);
            if (jrzVar.b > i) {
                b2 = 1;
            } else {
                b2 = jrzVar.c <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder sbA = efe0.a(i2, "Found paragraph index ", " should be in range [0, ");
        sbA.append(list.size());
        sbA.append(").\nDebug info: index=");
        sbA.append(i);
        sbA.append(", paragraphs=[");
        sbA.append(ois.a(list, null, new dkw(), 31));
        sbA.append(']');
        xkn.a(sbA.toString());
        return i2;
    }

    public static final int c(int i, List list) {
        byte b2;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            jrz jrzVar = (jrz) list.get(i3);
            if (jrzVar.d > i) {
                b2 = 1;
            } else {
                b2 = jrzVar.e <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int d(ArrayList arrayList, float f) {
        byte b2;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((jrz) CollectionsKt.b0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            jrz jrzVar = (jrz) arrayList.get(i2);
            if (jrzVar.f > f) {
                b2 = 1;
            } else {
                b2 = jrzVar.g <= f ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i = i2 + 1;
            } else {
                if (b2 <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void e(ArrayList arrayList, long j, Function1 function1) {
        int size = arrayList.size();
        for (int iB = b(ulf0.f(j), arrayList); iB < size; iB++) {
            jrz jrzVar = (jrz) arrayList.get(iB);
            if (jrzVar.b >= ulf0.e(j)) {
                return;
            }
            if (jrzVar.b != jrzVar.c) {
                function1.invoke(jrzVar);
            }
        }
    }
}
