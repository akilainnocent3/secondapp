package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class t060<T> extends bjb0 {
    public final php<T> b;
    public final LinkedHashMap c;
    public final zd80 d = ve80.a;
    public final LinkedHashMap e = new LinkedHashMap();
    public int f = -1;

    public t060(php phpVar, LinkedHashMap linkedHashMap) {
        this.b = phpVar;
        this.c = linkedHashMap;
    }

    @Override // defpackage.bjb0
    public final void J(pd80 pd80Var, int i) {
        pd80Var.getClass();
        this.f = i;
    }

    @Override // defpackage.bjb0
    public final void K(Object obj) {
        obj.getClass();
        i0(obj);
    }

    @Override // defpackage.f4g
    public final y3l d() {
        return this.d;
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final f4g h(pd80 pd80Var) {
        pd80Var.getClass();
        if (w060.e(pd80Var)) {
            this.f = 0;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, List<String>> h0(Object obj) {
        obj.getClass();
        super.x(this.b, obj);
        return kpu.l(this.e);
    }

    public final void i0(Object obj) {
        String strE = this.b.getDescriptor().e(this.f);
        djx djxVar = (djx) this.c.get(strE);
        if (djxVar != null) {
            this.e.put(strE, djxVar instanceof c48 ? ((c48) djxVar).i(obj) : a.c(djxVar.f(obj)));
        } else {
            q1b.a(tug.a("Cannot find NavType for argument ", strE, ". Please provide NavType through typeMap."));
        }
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void t() {
        i0(null);
    }

    @Override // defpackage.f4g
    public final <T> void x(he80<? super T> he80Var, T t) {
        he80Var.getClass();
        i0(t);
    }
}
