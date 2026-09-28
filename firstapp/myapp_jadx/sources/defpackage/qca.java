package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class qca implements Function0<Unit> {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ v5b e;
    public final /* synthetic */ Function0<Unit> f;
    public final /* synthetic */ ytw<Integer> i;

    public qca(int i, zzr zzrVar, int i2, int i3, v5b v5bVar, Function0<Unit> function0, ytw<Integer> ytwVar) {
        this.a = i;
        this.b = zzrVar;
        this.c = i2;
        this.d = i3;
        this.e = v5bVar;
        this.f = function0;
        this.i = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object next;
        int i = this.a;
        this.i.setValue(Integer.valueOf(i));
        zzr zzrVar = this.b;
        Iterator<T> it = zzrVar.j().k().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((zyr) next).getIndex() != i);
        zyr zyrVar = (zyr) next;
        if (zyrVar != null) {
            int iA = zyrVar.a() + zyrVar.getOffset();
            int iF = (zzrVar.j().f() - this.c) - this.d;
            if (iA > iF) {
                ej5.c(this.e, null, null, new pca(iA, iF, this.b, this.a, null), 3);
            }
        }
        this.f.invoke();
        return Unit.a;
    }
}
