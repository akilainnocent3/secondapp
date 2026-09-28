package defpackage;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes8.dex */
public final class qug implements sug {
    public final /* synthetic */ int a;
    public final /* synthetic */ Supplier b;

    public qug(int i, Supplier supplier) {
        this.a = i;
        this.b = supplier;
    }

    @Override // defpackage.sug
    public final ujt a() {
        return new nx30(this.a, new nx30.a(this.b));
    }

    @Override // defpackage.sug
    public final kze b() {
        return new nx30(this.a, new nx30.a(this.b));
    }
}
