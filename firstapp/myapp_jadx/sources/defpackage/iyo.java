package defpackage;

import android.os.Bundle;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class iyo<D extends Enum<?>> extends c48<List<? extends D>> {
    public final djx.c<D> r;

    public iyo(Class<D> cls) {
        super(true);
        this.r = new djx.c<>(cls);
    }

    @Override // defpackage.djx
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    @Override // defpackage.djx
    public final String b() {
        return "List<" + this.r.s.getName() + "}>";
    }

    @Override // defpackage.djx
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        djx.c<D> cVar = this.r;
        return list != null ? CollectionsKt.i0(a.c(cVar.d(str)), list) : a.c(cVar.d(str));
    }

    @Override // defpackage.djx
    /* JADX INFO: renamed from: d */
    public final Object h(String str) {
        str.getClass();
        return a.c(this.r.d(str));
    }

    @Override // defpackage.djx
    public final void e(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        bundle.putSerializable(str, list != null ? new ArrayList(list) : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyo)) {
            return false;
        }
        return this.r.equals(((iyo) obj).r);
    }

    @Override // defpackage.djx
    public final boolean g(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return Intrinsics.g(list != null ? new ArrayList(list) : null, list2 != null ? new ArrayList(list2) : null);
    }

    @Override // defpackage.c48
    public final Object h() {
        return m2g.a;
    }

    public final int hashCode() {
        return this.r.r.hashCode();
    }

    @Override // defpackage.c48
    public final List i(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).toString());
        }
        return arrayList;
    }
}
