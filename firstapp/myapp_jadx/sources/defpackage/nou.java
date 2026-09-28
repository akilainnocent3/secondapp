package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class nou implements lou {
    @Override // defpackage.lou
    public final jou a() {
        jou<?, ?> jouVar = jou.b;
        if (jouVar.isEmpty()) {
            return new jou();
        }
        jou jouVar2 = new jou(jouVar);
        jouVar2.a = true;
        return jouVar2;
    }

    @Override // defpackage.lou
    public final jou forMapData(Object obj) {
        return (jou) obj;
    }

    @Override // defpackage.lou
    public final void forMapMetadata(Object obj) {
        ((gou) obj).getClass();
    }

    @Override // defpackage.lou
    public final jou forMutableMapData(Object obj) {
        return (jou) obj;
    }

    @Override // defpackage.lou
    public final int getSerializedSize(int i, Object obj, Object obj2) {
        jou jouVar = (jou) obj;
        gou gouVar = (gou) obj2;
        if (jouVar.isEmpty()) {
            return 0;
        }
        Iterator it = jouVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        gouVar.getClass();
        r08.f0(i);
        throw null;
    }

    @Override // defpackage.lou
    public final boolean isImmutable(Object obj) {
        return !((jou) obj).a;
    }

    @Override // defpackage.lou
    public final jou mergeFrom(Object obj, Object obj2) {
        jou jouVar;
        jou jouVar2 = (jou) obj;
        jou jouVar3 = (jou) obj2;
        if (!jouVar3.isEmpty()) {
            if (!jouVar2.a) {
                if (jouVar2.isEmpty()) {
                    jouVar = new jou();
                } else {
                    jouVar = new jou(jouVar2);
                    jouVar.a = true;
                }
                jouVar2 = jouVar;
            }
            jouVar2.c();
            if (!jouVar3.isEmpty()) {
                jouVar2.putAll(jouVar3);
            }
        }
        return jouVar2;
    }

    @Override // defpackage.lou
    public final Object toImmutable(Object obj) {
        ((jou) obj).a = false;
        return obj;
    }
}
