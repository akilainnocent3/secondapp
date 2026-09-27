package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dw2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f148384j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile dw2 f148385k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile nt2 f148386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f148387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f148388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f148389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f148390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f148391f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f148392g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f148393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f148394i;

    public final boolean a() {
        boolean z10;
        synchronized (f148384j) {
            z10 = this.f148394i;
        }
        return z10;
    }

    public final Boolean b() {
        Boolean bool;
        synchronized (f148384j) {
            bool = this.f148388c;
        }
        return bool;
    }

    public final boolean c() {
        boolean z10;
        synchronized (f148384j) {
            z10 = this.f148390e;
        }
        return z10;
    }

    public final Boolean d() {
        Boolean bool;
        synchronized (f148384j) {
            bool = this.f148387b;
        }
        return bool;
    }

    public final nt2 a(Context context) {
        nt2 nt2VarA;
        nt2 nt2Var = this.f148386a;
        if (nt2Var != null) {
            return nt2Var;
        }
        synchronized (f148384j) {
            nt2VarA = this.f148386a;
            if (nt2VarA == null) {
                zy.f159094a.getClass();
                nt2VarA = ((cz) yy.a(context)).a();
                this.f148386a = nt2VarA;
            }
        }
        return nt2VarA;
    }

    public final void a(Context context, nt2 nt2Var) {
        synchronized (f148384j) {
            this.f148386a = nt2Var;
            zy.f159094a.getClass();
            ((cz) yy.a(context)).a(nt2Var);
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }
}
