package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f152584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ep1 f152585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ro1 f152586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final go1 f152587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f152588e;

    public mo1(List list, ep1 ep1Var, ro1 ro1Var, go1 go1Var) {
        this.f152584a = list;
        this.f152585b = ep1Var;
        this.f152586c = ro1Var;
        this.f152587d = go1Var;
    }

    public final co1 a(Context context, Class cls) {
        while (this.f152588e < this.f152584a.size()) {
            List list = this.f152584a;
            int i10 = this.f152588e;
            this.f152588e = i10 + 1;
            qq1 qq1Var = (qq1) list.get(i10);
            com.monetization.ads.mediation.base.a aVarA = this.f152586c.a(context, qq1Var, cls);
            if (aVarA != null) {
                this.f152587d.getClass();
                return new co1(aVarA, qq1Var, new fo1(aVarA), this.f152585b);
            }
        }
        return null;
    }

    public /* synthetic */ mo1(List list, ep1 ep1Var, xo1 xo1Var) {
        this(list, ep1Var, new ro1(xo1Var), new go1());
    }
}
