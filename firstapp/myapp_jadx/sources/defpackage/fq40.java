package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class fq40<ElementKlass, Element extends ElementKlass> extends b48<Element, Element[], ArrayList<Element>> {
    public final ygp<ElementKlass> b;
    public final ex0 c;

    public fq40(ygp<ElementKlass> ygpVar, php<Element> phpVar) {
        super(phpVar);
        this.b = ygpVar;
        pd80 descriptor = phpVar.getDescriptor();
        descriptor.getClass();
        this.c = new ex0(descriptor);
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
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new hx0(objArr);
    }

    @Override // defpackage.r2
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
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
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) tgp.b(this.b), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // defpackage.b48
    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
