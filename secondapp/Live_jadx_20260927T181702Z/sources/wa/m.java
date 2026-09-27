package wa;

import android.graphics.Path;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class m extends a<bb.o, Path> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bb.o f142592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f142593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Path f142594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Path f142595l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<va.t> f142596m;

    public m(List<hb.a<bb.o>> list) {
        super(list);
        this.f142592i = new bb.o();
        this.f142593j = new Path();
    }

    @Override // wa.a
    public boolean p() {
        List<va.t> list = this.f142596m;
        return (list == null || list.isEmpty()) ? false : true;
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
    @Override // wa.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Path i(hb.a<bb.o> aVar, float f10) {
        bb.o oVar = aVar.f88080b;
        bb.o oVar2 = aVar.f88081c;
        this.f142592i.c(oVar, oVar2 == null ? oVar : oVar2, f10);
        bb.o oVarH = this.f142592i;
        List<va.t> list = this.f142596m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVarH = this.f142596m.get(size).h(oVarH);
            }
        }
        gb.l.i(oVarH, this.f142593j);
        if (this.f142557e == null) {
            return this.f142593j;
        }
        if (this.f142594k == null) {
            this.f142594k = new Path();
            this.f142595l = new Path();
        }
        gb.l.i(oVar, this.f142594k);
        if (oVar2 != null) {
            gb.l.i(oVar2, this.f142595l);
        }
        hb.j<A> jVar = this.f142557e;
        float f11 = aVar.f88085g;
        float fFloatValue = aVar.f88086h.floatValue();
        Path path = this.f142594k;
        return (Path) jVar.b(f11, fFloatValue, path, oVar2 == null ? path : this.f142595l, f10, e(), f());
    }

    public void s(@Nullable List<va.t> list) {
        this.f142596m = list;
    }
}
