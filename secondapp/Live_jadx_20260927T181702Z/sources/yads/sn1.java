package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class sn1 extends hk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ao1 f155496c;

    public sn1(CustomizableMediaView customizableMediaView, ao1 ao1Var) {
        super(customizableMediaView);
        this.f155496c = ao1Var;
    }

    public abstract void a(CustomizableMediaView customizableMediaView);

    @Override // yads.hk3
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(CustomizableMediaView customizableMediaView, on1 on1Var) {
        ao1 ao1Var = this.f155496c;
        rn1 rn1VarD = d();
        if (ao1Var.f146879c) {
            if (ao1Var.f146877a.f148053a == e00.f148435g) {
                zn1 zn1Var = new zn1(ao1Var, customizableMediaView, rn1VarD);
                wl3 wl3Var = kl3.f151600a;
                customizableMediaView.getViewTreeObserver().addOnPreDrawListener(new jl3(customizableMediaView, zn1Var));
            }
            ao1Var.f146879c = false;
        }
    }

    public abstract void a(on1 on1Var);

    public abstract rn1 d();
}
