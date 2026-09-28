package defpackage;

import android.util.Range;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes4.dex */
public final class b980 {
    public static final List<Float> a;
    public static final int b;
    public static final float c;

    static {
        List<Float> listK = b.k(Float.valueOf(1.0f), Float.valueOf(1.1f), Float.valueOf(1.2f), Float.valueOf(1.3f), Float.valueOf(1.4f), Float.valueOf(1.5f), Float.valueOf(2.0f), Float.valueOf(2.5f), Float.valueOf(3.0f), Float.valueOf(3.5f), Float.valueOf(4.0f), Float.valueOf(5.0f), Float.valueOf(10.0f), Float.valueOf(20.0f), Float.valueOf(Float.MAX_VALUE));
        a = listK;
        int size = listK.size() - 1;
        b = size;
        c = 100.0f / size;
    }

    public static Float a(Integer num) {
        if (num == null || num.intValue() == -1) {
            return null;
        }
        if (num.intValue() == 0) {
            return Float.valueOf(1.0f);
        }
        return num.intValue() == b.j(a) ? Float.valueOf(100.0f) : Float.valueOf(num.intValue() * c);
    }

    public static Range b(lhw lhwVar) {
        Float fValueOf = Float.valueOf(lhwVar.a);
        List<Float> list = a;
        Integer numValueOf = Integer.valueOf(list.indexOf(fValueOf));
        Float f = lhwVar.b;
        Integer numValueOf2 = f != null ? Integer.valueOf(list.indexOf(Float.valueOf(f.floatValue()))) : null;
        Float fA = a(numValueOf);
        Float fValueOf2 = Float.valueOf(fA != null ? fA.floatValue() : 1.0f);
        Float fA2 = a(numValueOf2);
        return new Range(fValueOf2, Float.valueOf(fA2 != null ? fA2.floatValue() : 100.0f));
    }
}
