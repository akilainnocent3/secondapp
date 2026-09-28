package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class pel<K, V> extends uou<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    public final oel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pel(php<K> phpVar, php<V> phpVar2) {
        super(phpVar, phpVar2);
        phpVar.getClass();
        phpVar2.getClass();
        pd80 descriptor = phpVar.getDescriptor();
        pd80 descriptor2 = phpVar2.getDescriptor();
        descriptor.getClass();
        descriptor2.getClass();
        this.c = new oel("kotlin.collections.HashMap", descriptor, descriptor2);
    }

    @Override // defpackage.r2
    public final Object a() {
        return new HashMap();
    }

    @Override // defpackage.r2
    public final int b(Object obj) {
        HashMap map = (HashMap) obj;
        map.getClass();
        return map.size() * 2;
    }

    @Override // defpackage.r2
    public final Iterator c(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // defpackage.r2
    public final int d(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    @Override // defpackage.r2
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return this.c;
    }

    @Override // defpackage.r2
    public final Object h(Object obj) {
        HashMap map = (HashMap) obj;
        map.getClass();
        return map;
    }
}
