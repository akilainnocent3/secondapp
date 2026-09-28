package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class onp<K, V, R> implements php<R> {
    public final php<K> a;
    public final php<V> b;

    public onp(php<K> phpVar, php<V> phpVar2) {
        this.a = phpVar;
        this.b = phpVar2;
    }

    public abstract K a(R r);

    public abstract V b(R r);

    public abstract R c(K k, V v);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tae
    public final R deserialize(b5d b5dVar) {
        pd80 descriptor = getDescriptor();
        dma dmaVarC = b5dVar.c(descriptor);
        Object obj = fyg0.a;
        Object objY = obj;
        Object objY2 = objY;
        while (true) {
            int iV = dmaVarC.v(getDescriptor());
            if (iV == -1) {
                if (objY == obj) {
                    throw new ee80("Element 'key' is missing");
                }
                if (objY2 == obj) {
                    throw new ee80("Element 'value' is missing");
                }
                R r = (R) c(objY, objY2);
                dmaVarC.b(descriptor);
                return r;
            }
            if (iV == 0) {
                objY = dmaVarC.y(getDescriptor(), 0, this.a, null);
            } else {
                if (iV != 1) {
                    throw new ee80(hce0.a(iV, "Invalid index: "));
                }
                objY2 = dmaVarC.y(getDescriptor(), 1, this.b, null);
            }
        }
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, R r) {
        fma fmaVarC = f4gVar.c(getDescriptor());
        fmaVarC.q(getDescriptor(), 0, this.a, a(r));
        fmaVarC.q(getDescriptor(), 1, this.b, b(r));
        fmaVarC.b(getDescriptor());
    }
}
