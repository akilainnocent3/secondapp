package defpackage;

import com.google.android.gms.common.annotation.LjLk.llGRV;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class yfs<K, V> extends uou<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    public final xfs c;

    @Override // defpackage.r2
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // defpackage.r2
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap.size() * 2;
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
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfs(php<K> phpVar, php<V> phpVar2) {
        super(phpVar, phpVar2);
        phpVar.getClass();
        phpVar2.getClass();
        pd80 descriptor = phpVar.getDescriptor();
        pd80 descriptor2 = phpVar2.getDescriptor();
        descriptor.getClass();
        descriptor2.getClass();
        this.c = new xfs(llGRV.iFAlsrYS, descriptor, descriptor2);
    }
}
