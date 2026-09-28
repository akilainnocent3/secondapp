package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b48<Element, Collection, Builder> extends r2<Element, Collection, Builder> {
    public final php<Element> a;

    public b48(php<Element> phpVar) {
        this.a = phpVar;
    }

    @Override // defpackage.r2
    public void f(dma dmaVar, int i, Object obj) {
        i(i, obj, dmaVar.y(getDescriptor(), i, this.a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // defpackage.he80
    public void serialize(f4g f4gVar, Collection collection) {
        int iD = d(collection);
        pd80 descriptor = getDescriptor();
        fma fmaVarS = f4gVar.s(descriptor, iD);
        Iterator<Element> itC = c(collection);
        for (int i = 0; i < iD; i++) {
            fmaVarS.q(getDescriptor(), i, this.a, itC.next());
        }
        fmaVarS.b(descriptor);
    }
}
