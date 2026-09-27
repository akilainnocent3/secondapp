package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dp0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f148306c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile dp0 f148307d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo0 f148308a = new zo0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vy2 f148309b;

    public final nr a(Context context) {
        vy2 vy2VarA;
        synchronized (f148306c) {
            vy2VarA = this.f148309b;
            if (vy2VarA == null) {
                vy2VarA = this.f148308a.a(context);
                this.f148309b = vy2VarA;
            }
        }
        return vy2VarA;
    }
}
