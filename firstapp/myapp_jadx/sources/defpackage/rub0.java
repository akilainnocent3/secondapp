package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.sportygames.sportyherocompose.views.ShMultiplierContainer;

/* JADX INFO: loaded from: classes8.dex */
public final class rub0 extends AnimatorListenerAdapter {
    public final /* synthetic */ yp40 a;
    public final /* synthetic */ qub0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;

    public rub0(yp40 yp40Var, qub0 qub0Var, float f, float f2, boolean z) {
        this.a = yp40Var;
        this.b = qub0Var;
        this.c = f;
        this.d = f2;
        this.e = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
        this.a.a = true;
        this.b.m3 = null;
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
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        if (this.a.a) {
            return;
        }
        qub0 qub0Var = this.b;
        float f = this.c;
        qub0Var.j3 = f;
        float f2 = this.d;
        qub0Var.k3 = f2;
        qub0Var.t3(f, f2);
        qub0Var.m3 = null;
        u5a0 u5a0Var = (u5a0) qub0Var.g3;
        boolean z = this.e;
        u5a0Var.k(z ? 1 : 0);
        ShMultiplierContainer shMultiplierContainer = qub0Var.E2;
        if (shMultiplierContainer != null) {
            shMultiplierContainer.k(z);
        }
    }
}
