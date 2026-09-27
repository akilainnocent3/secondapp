package wa;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class j extends g<PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f142585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f142586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f142587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PathMeasure f142588l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f142589m;

    public j(List<? extends hb.a<PointF>> list) {
        super(list);
        this.f142585i = new PointF();
        this.f142586j = new float[2];
        this.f142587k = new float[2];
        this.f142588l = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public PointF i(hb.a<PointF> aVar, float f10) {
        float f11;
        i iVar = (i) aVar;
        Path pathK = iVar.k();
        hb.j<A> jVar = this.f142557e;
        if (jVar == 0 || aVar.f88086h == null) {
            f11 = f10;
        } else {
            f11 = f10;
            PointF pointF = (PointF) jVar.b(iVar.f88085g, iVar.f88086h.floatValue(), (PointF) iVar.f88080b, (PointF) iVar.f88081c, e(), f11, f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (pathK == null) {
            return aVar.f88080b;
        }
        if (this.f142589m != iVar) {
            this.f142588l.setPath(pathK, false);
            this.f142589m = iVar;
        }
        float length = this.f142588l.getLength();
        float f12 = f11 * length;
        this.f142588l.getPosTan(f12, this.f142586j, this.f142587k);
        PointF pointF2 = this.f142585i;
        float[] fArr = this.f142586j;
        pointF2.set(fArr[0], fArr[1]);
        if (f12 < 0.0f) {
            PointF pointF3 = this.f142585i;
            float[] fArr2 = this.f142587k;
            pointF3.offset(fArr2[0] * f12, fArr2[1] * f12);
        } else if (f12 > length) {
            PointF pointF4 = this.f142585i;
            float[] fArr3 = this.f142587k;
            float f13 = f12 - length;
            pointF4.offset(fArr3[0] * f13, fArr3[1] * f13);
        }
        return this.f142585i;
    }
}
