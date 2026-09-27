package yads;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class po extends po2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f154009v = (int) TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f154010s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final oo f154011t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final uo2 f154012u;

    public po(Context context, int i10, String str, oo ooVar, uo2 uo2Var) {
        super(i10, no.a(str), ooVar);
        this.f154010s = context;
        this.f154011t = ooVar;
        this.f154012u = uo2Var;
        k();
        a(new qe0(1.0f, f154009v, 0));
    }

    @Override // yads.po2
    public im3 a(im3 im3Var) {
        return im3Var;
    }

    @Override // yads.po2
    public final void a(Object obj) {
        this.f154011t.a(obj);
    }

    public /* synthetic */ po(Context context, String str, oo ooVar) {
        this(context, 0, str, ooVar, null);
    }
}
