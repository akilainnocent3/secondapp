package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zx extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f159076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f159077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cy f159078d;

    public zx(cy cyVar, int i10) {
        this.f159078d = cyVar;
        this.f159076b = cyVar.b(i10);
        this.f159077c = i10;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f159076b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map mapA = this.f159078d.a();
        if (mapA != null) {
            return mapA.get(this.f159076b);
        }
        int i10 = this.f159077c;
        if (i10 == -1 || i10 >= this.f159078d.size() || !l92.a(this.f159076b, this.f159078d.b(this.f159077c))) {
            this.f159077c = this.f159078d.a(this.f159076b);
        }
        int i11 = this.f159077c;
        if (i11 == -1) {
            return null;
        }
        return this.f159078d.c(i11);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapA = this.f159078d.a();
        if (mapA != null) {
            return mapA.put(this.f159076b, obj);
        }
        int i10 = this.f159077c;
        if (i10 == -1 || i10 >= this.f159078d.size() || !l92.a(this.f159076b, this.f159078d.b(this.f159077c))) {
            this.f159077c = this.f159078d.a(this.f159076b);
        }
        int i11 = this.f159077c;
        if (i11 == -1) {
            this.f159078d.put(this.f159076b, obj);
            return null;
        }
        Object objC = this.f159078d.c(i11);
        this.f159078d.a(this.f159077c, obj);
        return objC;
    }
}
