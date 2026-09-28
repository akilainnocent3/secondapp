package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public final class nt70<T> extends q4<T> {
    public final dq7 a;
    public final List<? extends Annotation> b;
    public final ttr c;
    public final Map<ygp<? extends T>, php<? extends T>> d;
    public final LinkedHashMap e;

    public nt70(String str, dq7 dq7Var, ygp[] ygpVarArr, php[] phpVarArr, Annotation[] annotationArr) {
        this.a = dq7Var;
        this.b = m2g.a;
        this.c = hwr.a(a1s.b, new etu(1, str, this));
        if (ygpVarArr.length != phpVarArr.length) {
            d9h0.a(dq7Var.k(), "All subclasses of sealed class ", " should be marked @Serializable");
            throw null;
        }
        int iMin = Math.min(ygpVarArr.length, phpVarArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new Pair(ygpVarArr[i], phpVarArr[i]));
        }
        Map<ygp<? extends T>, php<? extends T>> mapK = kpu.k(arrayList);
        this.d = mapK;
        Set<Map.Entry<ygp<? extends T>, php<? extends T>>> setEntrySet = mapK.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strH = ((php) entry.getValue()).getDescriptor().h();
            Object obj = linkedHashMap.get(strH);
            if (obj == null) {
                linkedHashMap.containsKey(strH);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.a);
                sb.append("' have the same serial name '");
                sb.append(strH);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(strH, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(jpu.a(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (php) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
        List<? extends Annotation> listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }

    @Override // defpackage.q4
    public final tae<T> a(dma dmaVar, String str) {
        php phpVar = (php) this.e.get(str);
        return phpVar != null ? phpVar : dmaVar.d().j(c(), str);
    }

    @Override // defpackage.q4
    public final he80<T> b(f4g f4gVar, T t) {
        t.getClass();
        php<? extends T> phpVar = this.d.get(jq40.a(t.getClass()));
        php<? extends T> phpVarB = phpVar != null ? phpVar : super.b(f4gVar, t);
        if (phpVarB != null) {
            return phpVarB;
        }
        return null;
    }

    @Override // defpackage.q4
    public final ygp<T> c() {
        return this.a;
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return (pd80) this.c.getValue();
    }
}
