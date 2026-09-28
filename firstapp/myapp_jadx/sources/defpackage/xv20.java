package defpackage;

import defpackage.vv20;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public abstract class xv20<Element, Array, Builder extends vv20<Array>> extends b48<Element, Array, Builder> {
    public final wv20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv20(php<Element> phpVar) {
        super(phpVar);
        phpVar.getClass();
        this.b = new wv20(phpVar.getDescriptor());
    }

    @Override // defpackage.r2
    public final Object a() {
        return g(j());
    }

    @Override // defpackage.r2
    public final int b(Object obj) {
        vv20 vv20Var = (vv20) obj;
        vv20Var.getClass();
        return vv20Var.d();
    }

    @Override // defpackage.r2
    public final Iterator<Element> c(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.r2, defpackage.tae
    public final Array deserialize(b5d b5dVar) {
        return (Array) e(b5dVar);
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return this.b;
    }

    @Override // defpackage.r2
    public final Object h(Object obj) {
        vv20 vv20Var = (vv20) obj;
        vv20Var.getClass();
        return vv20Var.a();
    }

    @Override // defpackage.b48
    public final void i(int i, Object obj, Object obj2) {
        ((vv20) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Array j();

    public abstract void k(fma fmaVar, Array array, int i);

    @Override // defpackage.b48, defpackage.he80
    public final void serialize(f4g f4gVar, Array array) {
        int iD = d(array);
        wv20 wv20Var = this.b;
        fma fmaVarS = f4gVar.s(wv20Var, iD);
        k(fmaVarS, array, iD);
        fmaVarS.b(wv20Var);
    }
}
