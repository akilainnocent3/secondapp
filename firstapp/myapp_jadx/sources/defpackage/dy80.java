package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dy80 extends u12<vx80, Path> {
    public final vx80 i;
    public final Path j;
    public Path k;
    public Path l;
    public ArrayList m;

    public dy80(List<cpp<vx80>> list) {
        super(list);
        this.i = new vx80();
        this.j = new Path();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.u12
    public final Path f(cpp<vx80> cppVar, float f) {
        vx80 vx80VarE;
        vx80 vx80Var = cppVar.b;
        vx80 vx80Var2 = cppVar.c;
        vx80 vx80Var3 = vx80Var2 == null ? vx80Var : vx80Var2;
        vx80 vx80Var4 = this.i;
        ArrayList arrayList = vx80Var4.a;
        if (vx80Var4.b == null) {
            vx80Var4.b = new PointF();
        }
        boolean z = vx80Var.c;
        ArrayList arrayList2 = vx80Var.a;
        boolean z2 = true;
        vx80Var4.c = z || vx80Var3.c;
        int size = arrayList2.size();
        ArrayList arrayList3 = vx80Var3.a;
        if (size != arrayList3.size()) {
            lgt.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new h4c());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = vx80Var.b;
        PointF pointF2 = vx80Var3.b;
        float f2 = rqv.f(pointF.x, pointF2.x, f);
        float f3 = rqv.f(pointF.y, pointF2.y, f);
        PointF pointF3 = vx80Var4.b;
        if (pointF3 == null) {
            pointF3 = new PointF();
            vx80Var4.b = pointF3;
        }
        pointF3.set(f2, f3);
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            h4c h4cVar = (h4c) arrayList2.get(size4);
            h4c h4cVar2 = (h4c) arrayList3.get(size4);
            PointF pointF4 = h4cVar.a;
            PointF pointF5 = h4cVar.b;
            PointF pointF6 = h4cVar.c;
            PointF pointF7 = h4cVar2.a;
            boolean z3 = z2;
            PointF pointF8 = h4cVar2.b;
            PointF pointF9 = h4cVar2.c;
            ((h4c) arrayList.get(size4)).a.set(rqv.f(pointF4.x, pointF7.x, f), rqv.f(pointF4.y, pointF7.y, f));
            ((h4c) arrayList.get(size4)).b.set(rqv.f(pointF5.x, pointF8.x, f), rqv.f(pointF5.y, pointF8.y, f));
            ((h4c) arrayList.get(size4)).c.set(rqv.f(pointF6.x, pointF9.x, f), rqv.f(pointF6.y, pointF9.y, f));
            size4--;
            z2 = z3;
            arrayList2 = arrayList2;
            vx80Var4 = vx80Var4;
            arrayList3 = arrayList3;
        }
        vx80 vx80Var5 = vx80Var4;
        ArrayList arrayList4 = this.m;
        if (arrayList4 != null) {
            vx80VarE = vx80Var5;
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                vx80VarE = ((fy80) this.m.get(size5)).e(vx80VarE);
            }
        } else {
            vx80VarE = vx80Var5;
        }
        Path path = this.j;
        rqv.e(vx80VarE, path);
        if (this.e == null) {
            return path;
        }
        if (this.k == null) {
            this.k = new Path();
            this.l = new Path();
        }
        rqv.e(vx80Var, this.k);
        if (vx80Var2 != null) {
            rqv.e(vx80Var2, this.l);
        }
        cpt<A> cptVar = this.e;
        float f4 = cppVar.g;
        float fFloatValue = cppVar.h.floatValue();
        Path path2 = this.k;
        return (Path) cptVar.b(f4, fFloatValue, path2, vx80Var2 == null ? path2 : this.l, f, d(), this.d);
    }

    @Override // defpackage.u12
    public final boolean k() {
        ArrayList arrayList = this.m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
