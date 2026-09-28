package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class av60 implements jv60.b {
    public final /* synthetic */ bv60 a;

    @Override // jv60.b
    public final Bundle a() {
        Pair[] pairArr;
        bv60 bv60Var = this.a;
        for (Map.Entry entry : kpu.l(bv60Var.d).entrySet()) {
            bv60Var.a(((ztw) entry.getValue()).getValue(), (String) entry.getKey());
        }
        for (Map.Entry entry2 : kpu.l(bv60Var.b).entrySet()) {
            bv60Var.a(((jv60.b) entry2.getValue()).a(), (String) entry2.getKey());
        }
        LinkedHashMap linkedHashMap = bv60Var.a;
        if (linkedHashMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                arrayList.add(new Pair((String) entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        return vj5.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
