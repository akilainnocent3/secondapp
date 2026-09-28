package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iww extends j8i0 {
    public final ssw<hqc> a = new ssw<>();
    public final ssw<hqc> b = new ssw<>();
    public final ssw<Integer> c;
    public final ssw d;
    public final vxw e;

    public iww(vxw vxwVar) {
        ssw<Integer> sswVar = new ssw<>();
        this.c = sswVar;
        this.d = sswVar;
        this.e = vxwVar;
        vxwVar.b().g(new lfy() { // from class: gww
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                hqc hqcVar = (hqc) obj;
                ssw<hqc> sswVar2 = this.a.b;
                if (hqcVar instanceof kqc) {
                    sswVar2.m(new kqc());
                } else if (hqcVar instanceof nqc) {
                    sswVar2.m(new nqc(new Object()));
                }
            }
        });
    }

    public abstract su5<BaseResponse> A1();

    public abstract void B1(pvw pvwVar);

    public final void C1() {
        this.b.m(new jqc());
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        y1();
        super.onCleared();
    }

    public final void x1() {
        this.b.m(new lqc());
        A1().G(new hww(this));
    }

    public void y1() {
    }

    public void z1() {
    }
}
