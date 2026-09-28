package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class uou<Key, Value, Collection, Builder extends Map<Key, Value>> extends r2<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    public final php<Key> a;
    public final php<Value> b;

    public uou(php<Key> phpVar, php<Value> phpVar2) {
        this.a = phpVar;
        this.b = phpVar2;
    }

    @Override // defpackage.r2
    public final void f(dma dmaVar, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        Object objY = dmaVar.y(getDescriptor(), i, this.a, null);
        int iV = dmaVar.v(getDescriptor());
        if (iV != i + 1) {
            kb5.a(whs.b(i, iV, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objY);
        php<Value> phpVar = this.b;
        map.put(objY, (!zContainsKey || (phpVar.getDescriptor().getKind() instanceof bw20)) ? dmaVar.y(getDescriptor(), iV, phpVar, null) : dmaVar.y(getDescriptor(), iV, phpVar, kpu.c(objY, map)));
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Collection collection) {
        int iD = d(collection);
        pd80 descriptor = getDescriptor();
        fma fmaVarS = f4gVar.s(descriptor, iD);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itC = c(collection);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itC.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i2 = i + 1;
            fmaVarS.q(getDescriptor(), i, this.a, key);
            i += 2;
            fmaVarS.q(getDescriptor(), i2, this.b, value);
        }
        fmaVarS.b(descriptor);
    }
}
