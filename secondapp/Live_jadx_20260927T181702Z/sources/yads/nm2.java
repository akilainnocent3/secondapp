package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg0 f153092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f153093b;

    public /* synthetic */ nm2(Context context) {
        this(context, new lg0());
    }

    public final ll1 a() {
        return kg0.f151530d == this.f153092a.a(this.f153093b) ? new ll1(1920, 1080, 6800) : new ll1(854, 480, 1000);
    }

    public nm2(Context context, lg0 lg0Var) {
        this.f153092a = lg0Var;
        this.f153093b = context.getApplicationContext();
    }
}
