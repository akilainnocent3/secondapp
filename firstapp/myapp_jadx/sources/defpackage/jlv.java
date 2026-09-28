package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class jlv<T> extends ssw<T> {
    public final qr60<njs<?>, a<?>> l;

    public static class a<V> implements lfy<V> {
        public final njs<V> a;
        public final lfy<? super V> b;
        public int c = -1;

        public a(njs<V> njsVar, lfy<? super V> lfyVar) {
            this.a = njsVar;
            this.b = lfyVar;
        }

        public final void a() {
            this.a.k(this);
        }

        @Override // defpackage.lfy
        public final void u1(V v) {
            int i = this.c;
            int i2 = this.a.g;
            if (i != i2) {
                this.c = i2;
                this.b.u1(v);
            }
        }
    }

    public jlv(T t) {
        super(t);
        this.l = new qr60<>();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.njs
    public void h() {
        Iterator<Map.Entry<njs<?>, a<?>>> it = this.l.iterator();
        while (true) {
            qr60.e eVar = (qr60.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.a.g(aVar);
        }
    }

    @Override // defpackage.njs
    public void i() {
        Iterator<Map.Entry<njs<?>, a<?>>> it = this.l.iterator();
        while (true) {
            qr60.e eVar = (qr60.e) it;
            if (!eVar.hasNext()) {
                return;
            } else {
                ((a) ((Map.Entry) eVar.next()).getValue()).a();
            }
        }
    }

    public <S> void n(njs<S> njsVar, lfy<? super S> lfyVar) {
        a<?> aVar;
        if (njsVar == null) {
            bmy.a("source cannot be null");
            return;
        }
        a aVar2 = new a(njsVar, lfyVar);
        qr60<njs<?>, a<?>> qr60Var = this.l;
        qr60.c<njs<?>, a<?>> cVarA = qr60Var.a(njsVar);
        if (cVarA != null) {
            aVar = cVarA.b;
        } else {
            qr60.c<K, V> cVar = new qr60.c<>(njsVar, aVar2);
            qr60Var.d++;
            qr60.c cVar2 = qr60Var.b;
            if (cVar2 == null) {
                qr60Var.a = cVar;
                qr60Var.b = cVar;
            } else {
                cVar2.c = cVar;
                cVar.d = cVar2;
                qr60Var.b = cVar;
            }
            aVar = null;
        }
        a<?> aVar3 = aVar;
        if (aVar3 != null && aVar3.b != lfyVar) {
            hb5.a("This source was already added with the different observer");
        } else if (aVar3 == null && e()) {
            njsVar.g(aVar2);
        }
    }

    public jlv() {
        this.l = new qr60<>();
    }
}
