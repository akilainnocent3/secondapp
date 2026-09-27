package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class p41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f153726a;

    public p41(Context context) {
        this.f153726a = context.getApplicationContext();
    }

    public final String a(int i10, int i11) {
        int iA = kl3.a(this.f153726a, i10);
        int iA2 = kl3.a(this.f153726a, i11);
        boolean z10 = ad1.f146762a;
        if (iA >= 320 || iA2 >= 240) {
            return "large";
        }
        return (iA >= 160 || iA2 >= 160) ? "medium" : "small";
    }
}
