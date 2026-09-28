package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class mcy<T> implements php<T> {
    public final T a;
    public final List<? extends Annotation> b;
    public final ttr c;

    /* JADX WARN: Multi-variable type inference failed */
    public mcy(Object obj, final String str) {
        obj.getClass();
        this.a = obj;
        this.b = m2g.a;
        this.c = hwr.a(a1s.b, new Function0() { // from class: kcy
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                final mcy mcyVar = this;
                Function1 function1 = new Function1() { // from class: lcy
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        eq7 eq7Var = (eq7) obj2;
                        eq7Var.getClass();
                        List<? extends Annotation> list = mcyVar.b;
                        list.getClass();
                        eq7Var.b = list;
                        return Unit.a;
                    }
                };
                return vd80.b(str, ebe0.d.a, new pd80[0], function1);
            }
        });
    }

    @Override // defpackage.tae
    public final T deserialize(b5d b5dVar) {
        pd80 descriptor = getDescriptor();
        dma dmaVarC = b5dVar.c(descriptor);
        int iV = dmaVarC.v(getDescriptor());
        if (iV != -1) {
            throw new ee80(hce0.a(iV, "Unexpected index "));
        }
        Unit unit = Unit.a;
        dmaVarC.b(descriptor);
        return this.a;
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return (pd80) this.c.getValue();
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, T t) {
        t.getClass();
        f4gVar.c(getDescriptor()).b(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mcy(String str, T t, Annotation[] annotationArr) {
        this(t, str);
        t.getClass();
        List<? extends Annotation> listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }
}
