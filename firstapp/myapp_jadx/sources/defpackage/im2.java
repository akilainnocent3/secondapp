package defpackage;

import com.sporty.android.common.uievent.a;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim2;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class im2 extends j8i0 {
    public final emf a;
    public final at2 b;
    public final rdd0 c;
    public final sfy d;
    public final ku90<a> e;
    public final vu90<lk50<wlf>> f;
    public final vu90 i;

    public im2(emf emfVar, at2 at2Var, rdd0 rdd0Var, sfy sfyVar) {
        at2Var.getClass();
        rdd0Var.getClass();
        sfyVar.getClass();
        this.a = emfVar;
        this.b = at2Var;
        this.c = rdd0Var;
        this.d = sfyVar;
        this.e = new ku90<>();
        vu90<lk50<wlf>> vu90Var = new vu90<>();
        this.f = vu90Var;
        this.i = vu90Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void x1(String str, List<? extends hl30> list) {
        Set<String> setB;
        str.getClass();
        if (list != null) {
            knh.a aVar = new knh.a(ld80.j(ld80.j(new u48(list), new dm2(0)), new em2()));
            if (aVar.hasNext()) {
                Object next = aVar.next();
                if (aVar.hasNext()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(next);
                    while (aVar.hasNext()) {
                        linkedHashSet.add(aVar.next());
                    }
                    setB = linkedHashSet;
                } else {
                    setB = wi80.b(next);
                }
            } else {
                setB = t3g.a;
            }
        } else {
            setB = null;
        }
        if (setB == null) {
            setB = t3g.a;
        }
        this.d.e(setB);
        emf emfVar = this.a;
        emfVar.getClass();
        kzh.d(new g1i(bm50.a(new or60(new bmf(emfVar, str, null))), new gm2(this, null)), o8i0.d(this));
    }
}
