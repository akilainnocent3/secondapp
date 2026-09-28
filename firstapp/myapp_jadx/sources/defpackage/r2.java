package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public abstract class r2<Element, Collection, Builder> implements php<Collection> {
    public abstract Builder a();

    public abstract int b(Builder builder);

    public abstract Iterator<Element> c(Collection collection);

    public abstract int d(Collection collection);

    @Override // defpackage.tae
    public Collection deserialize(b5d b5dVar) {
        return (Collection) e(b5dVar);
    }

    public final Object e(b5d b5dVar) {
        Builder builderA = a();
        int iB = b(builderA);
        dma dmaVarC = b5dVar.c(getDescriptor());
        while (true) {
            int iV = dmaVarC.v(getDescriptor());
            if (iV == -1) {
                dmaVarC.b(getDescriptor());
                return h(builderA);
            }
            f(dmaVarC, iV + iB, builderA);
        }
    }

    public abstract void f(dma dmaVar, int i, Object obj);

    public abstract Builder g(Collection collection);

    public abstract Collection h(Builder builder);
}
