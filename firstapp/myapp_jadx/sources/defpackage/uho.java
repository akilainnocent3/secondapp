package defpackage;

import java.util.Collection;
import kotlin.Pair;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class uho {
    public static final boolean a(spu spuVar, ogo ogoVar) {
        Collection collectionValues;
        ogoVar.getClass();
        if (spuVar == null || (collectionValues = spuVar.f.values()) == null) {
            return false;
        }
        Collection<h8z> collection = collectionValues;
        if (collection.isEmpty()) {
            return false;
        }
        for (h8z h8zVar : collection) {
            if (h8zVar != null && h8zVar.d && b(h8zVar.b, ogoVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean b(String str, ogo ogoVar) {
        Float fI;
        Pair pair;
        if (str != null && (fI = b.i(str)) != null) {
            float fFloatValue = fI.floatValue();
            if (ogoVar == null) {
                return false;
            }
            if (ogoVar instanceof ogo.c) {
                ogo.c cVar = (ogo.c) ogoVar;
                int iOrdinal = cVar.d.ordinal();
                if (iOrdinal == 0) {
                    Float f = cVar.a;
                    pair = new Pair(Float.valueOf(f != null ? f.floatValue() : 1.0f), Float.valueOf(Float.MAX_VALUE));
                } else {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return false;
                    }
                    Float fValueOf = Float.valueOf(1.0f);
                    Float f2 = cVar.b;
                    pair = new Pair(fValueOf, Float.valueOf(f2 != null ? f2.floatValue() : Float.MAX_VALUE));
                }
            } else if (ogoVar instanceof ogo.b) {
                ogo.b bVar = (ogo.b) ogoVar;
                Float f3 = bVar.b;
                Float f4 = bVar.a;
                if (f4 == null && f3 == null) {
                    return false;
                }
                pair = new Pair(Float.valueOf(f4 != null ? f4.floatValue() : 1.0f), Float.valueOf(f3 != null ? f3.floatValue() : Float.MAX_VALUE));
            } else if (ogoVar instanceof ogo.a) {
                ogo.a aVar = (ogo.a) ogoVar;
                Float f5 = aVar.b;
                Float f6 = aVar.a;
                if (f6 == null && f5 == null) {
                    return false;
                }
                pair = new Pair(Float.valueOf(f6 != null ? f6.floatValue() : 1.0f), Float.valueOf(f5 != null ? f5.floatValue() : Float.MAX_VALUE));
            } else {
                uhc.a();
            }
            return ((Number) pair.a).floatValue() <= fFloatValue && fFloatValue <= ((Number) pair.b).floatValue();
        }
        return false;
    }
}
