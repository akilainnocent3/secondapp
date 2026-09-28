package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class mx0<E> extends d48<E, List<? extends E>, ArrayList<E>> {
    public final lx0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx0(php<E> phpVar) {
        super(phpVar);
        phpVar.getClass();
        pd80 descriptor = phpVar.getDescriptor();
        descriptor.getClass();
        this.b = new lx0(descriptor);
    }

    @Override // defpackage.r2
    public final Object a() {
        return new ArrayList();
    }

    @Override // defpackage.r2
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.r2
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return this.b;
    }

    @Override // defpackage.r2
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList;
    }

    @Override // defpackage.b48
    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
