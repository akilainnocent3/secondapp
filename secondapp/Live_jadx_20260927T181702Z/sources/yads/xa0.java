package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xa0 extends rr.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f157759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ya0 f157760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f157761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(ya0 ya0Var, or.f fVar) {
        super(fVar);
        this.f157760c = ya0Var;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f157759b = obj;
        this.f157761d |= Integer.MIN_VALUE;
        return this.f157760c.a((View) null, (wa0) null, this);
    }
}
