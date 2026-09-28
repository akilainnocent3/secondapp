package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class wu60 extends kni0 {
    public final vu60 b;
    public final LinkedHashMap c;

    public wu60(vu60 vu60Var, LinkedHashMap linkedHashMap) {
        vu60Var.getClass();
        this.b = vu60Var;
        this.c = linkedHashMap;
    }

    @Override // defpackage.kni0
    public final boolean f(String str) {
        str.getClass();
        return this.b.a(str);
    }

    @Override // defpackage.kni0
    public final Object h(String str) {
        Pair[] pairArr;
        str.getClass();
        vu60 vu60Var = this.b;
        Map mapB = jpu.b(new Pair(str, vu60Var.b(str)));
        if (mapB.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapB.size());
            for (Map.Entry entry : mapB.entrySet()) {
                arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleA = vj5.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Object obj = this.c.get(str);
        if (obj != null) {
            return ((djx) obj).a(str, bundleA);
        }
        tkx.a(str, "Failed to find type for ", " when decoding ", vu60Var);
        return null;
    }
}
