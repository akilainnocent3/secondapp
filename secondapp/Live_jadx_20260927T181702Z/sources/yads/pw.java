package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pw implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kz f154162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z30 f154163b;

    public pw(kz kzVar, z30 z30Var) {
        this.f154162a = kzVar;
        this.f154163b = z30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f154162a.e();
        this.f154163b.a(y30.f158111c);
    }
}
