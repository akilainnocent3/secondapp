package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ah2 implements wa3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lv f146804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53 f146805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final be0 f146806c;

    public ah2(lv lvVar, o53 o53Var, be0 be0Var) {
        this.f146804a = lvVar;
        this.f146805b = o53Var;
        this.f146806c = be0Var;
    }

    @Override // yads.wa3
    public final void a(String str, Map map) {
        String strA = this.f146806c.a(str, map);
        if (strA.length() == 0) {
            boolean z10 = ad1.f146762a;
        } else {
            this.f146805b.a(this.f146804a, strA);
        }
    }
}
