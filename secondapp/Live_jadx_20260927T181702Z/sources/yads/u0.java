package yads;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class u0 extends rr.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v0 f156169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f156170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.l1.h f156171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f156172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f156173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v0 f156174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f156175h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, or.f fVar) {
        super(fVar);
        this.f156174g = v0Var;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f156173f = obj;
        this.f156175h |= Integer.MIN_VALUE;
        return this.f156174g.a(null, null, this);
    }
}
