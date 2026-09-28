package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qm20 extends cny {
    public v5b d;
    public Function2<? super lyh<sr1>, ? super v1b<? super Unit>, ? extends Object> e;
    public bny f;
    public boolean g;

    public qm20() {
        throw null;
    }

    @Override // defpackage.cny
    public final void a() {
        bny bnyVar = this.f;
        if (bnyVar != null) {
            bnyVar.a();
        }
        bny bnyVar2 = this.f;
        if (bnyVar2 != null) {
            bnyVar2.a = false;
        }
        this.g = false;
    }

    @Override // defpackage.cny
    public final void b() {
        bny bnyVar = this.f;
        if (bnyVar != null && !bnyVar.a) {
            bnyVar.a();
            this.f = null;
            bnyVar = null;
        }
        if (bnyVar == null) {
            bnyVar = new bny(this.d, false, this.e, this);
            this.f = bnyVar;
        }
        bnyVar.b.k(null);
        bny bnyVar2 = this.f;
        if (bnyVar2 != null) {
            bnyVar2.a = false;
        }
        this.g = false;
    }

    @Override // defpackage.cny
    public final void c(sr1 sr1Var) {
        bny bnyVar = this.f;
        if (bnyVar != null) {
            bnyVar.b.c(sr1Var);
        }
    }

    @Override // defpackage.cny
    public final void d(sr1 sr1Var) {
        bny bnyVar = this.f;
        if (bnyVar != null) {
            bnyVar.a();
        }
        if (this.a) {
            this.f = new bny(this.d, true, this.e, this);
        }
        this.g = true;
    }
}
