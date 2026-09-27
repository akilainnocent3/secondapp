package yads;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ob1 implements ek3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a91 f153424a;

    public ob1(a91 a91Var) {
        this.f153424a = a91Var;
    }

    @Override // yads.ek3
    public final List a() {
        List list;
        z81 z81Var = this.f153424a.f146706a;
        return (z81Var == null || (list = z81Var.f158653a) == null) ? fr.h0.J() : list;
    }

    @Override // yads.ek3
    public final View getView() {
        z81 z81Var = this.f153424a.f146706a;
        if (z81Var != null) {
            return z81Var.a();
        }
        return null;
    }
}
