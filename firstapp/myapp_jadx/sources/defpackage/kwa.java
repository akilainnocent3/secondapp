package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kwa extends qlr implements Function1<a7l, Unit> {
    public final /* synthetic */ u6j0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwa(u6j0 u6j0Var) {
        super(1);
        this.a = u6j0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(a7l a7lVar) {
        a7l a7lVar2 = a7lVar;
        u6j0 u6j0Var = this.a;
        if (!Float.isNaN(u6j0Var.d) || !Float.isNaN(u6j0Var.e)) {
            a7lVar2.z0(n09.a(Float.isNaN(u6j0Var.d) ? 0.5f : u6j0Var.d, Float.isNaN(u6j0Var.e) ? 0.5f : u6j0Var.e));
        }
        if (!Float.isNaN(u6j0Var.f)) {
            a7lVar2.q(u6j0Var.f);
        }
        if (!Float.isNaN(u6j0Var.g)) {
            a7lVar2.r(u6j0Var.g);
        }
        if (!Float.isNaN(u6j0Var.h)) {
            a7lVar2.u(u6j0Var.h);
        }
        if (!Float.isNaN(u6j0Var.i)) {
            a7lVar2.B(u6j0Var.i);
        }
        if (!Float.isNaN(u6j0Var.j)) {
            a7lVar2.f(u6j0Var.j);
        }
        if (!Float.isNaN(u6j0Var.k)) {
            a7lVar2.t(u6j0Var.k);
        }
        if (!Float.isNaN(u6j0Var.l) || !Float.isNaN(u6j0Var.m)) {
            a7lVar2.k(Float.isNaN(u6j0Var.l) ? 1.0f : u6j0Var.l);
            a7lVar2.v(Float.isNaN(u6j0Var.m) ? 1.0f : u6j0Var.m);
        }
        if (!Float.isNaN(u6j0Var.n)) {
            a7lVar2.b(u6j0Var.n);
        }
        return Unit.a;
    }
}
