package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class oc0 implements o30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f153435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o30 f153436b;

    public oc0(Context context, o30 o30Var) {
        this.f153435a = context.getApplicationContext();
        this.f153436b = o30Var;
    }

    @Override // yads.o30
    public final p30 createDataSource() {
        return new pc0(this.f153435a, this.f153436b.createDataSource());
    }
}
