package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class w81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f157235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a91 f157236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mf2 f157237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ea3 f157238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public da3 f157239e;

    public /* synthetic */ w81(Context context, lu2 lu2Var, a91 a91Var, pf2 pf2Var, w71 w71Var) {
        this(context, lu2Var, a91Var, pf2Var, w71Var, new mf2(a91Var));
    }

    public final void a() {
        gq0 gq0VarA;
        r91 r91Var;
        a53 playerView;
        z81 z81Var = this.f157237c.f152437a.f146706a;
        gq0 gq0VarA2 = z81Var != null ? z81Var.a() : null;
        if (gq0VarA2 != null && (playerView = gq0VarA2.getPlayerView()) != null) {
            gq0VarA2.removeView(playerView);
        }
        da3 da3Var = this.f157239e;
        if (da3Var != null && (gq0VarA = da3Var.f148130a.a()) != null && (r91Var = da3Var.f148134e) != null) {
            wa1 wa1Var = da3Var.f148133d;
            je3 je3Var = da3Var.f148132c;
            wa1Var.f157261b.getClass();
            wd3 adUiElements = gq0VarA.getAdUiElements();
            if (adUiElements != null) {
                wa1Var.f157260a.f158210a.put(je3Var, wa1Var.f157262c.a(adUiElements, r91Var));
            }
            da3Var.f148134e = null;
            da3Var.f148131b.a(gq0VarA);
        }
        this.f157239e = null;
    }

    public w81(Context context, lu2 lu2Var, a91 a91Var, pf2 pf2Var, w71 w71Var, mf2 mf2Var) {
        this.f157235a = context;
        this.f157236b = a91Var;
        this.f157237c = mf2Var;
        this.f157238d = new ea3(lu2Var, pf2Var, w71Var);
    }
}
