package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qp3 implements ud, paj {
    public final /* synthetic */ jp3 a;

    public qp3(jp3 jp3Var) {
        this.a = jp3Var;
    }

    @Override // defpackage.ud
    public final void a(Object obj) {
        gqk gqkVar = (gqk) obj;
        gqkVar.getClass();
        jp3.a aVar = jp3.c0;
        if (gqkVar instanceof gqk.b) {
            return;
        }
        boolean z = gqkVar instanceof gqk.c;
        jp3 jp3Var = this.a;
        if (z) {
            jp3Var.r0().j1(((gqk.c) gqkVar).a);
            return;
        }
        if (gqkVar instanceof gqk.a) {
            gqk.a aVar2 = (gqk.a) gqkVar;
            jp3Var.r0().I(jp3Var.v, aVar2.a, aVar2.b);
            return;
        }
        if (gqkVar instanceof gqk.d) {
            jp3Var.r0().E(jp3Var.v);
        } else {
            uhc.a();
        }
    }

    @Override // defpackage.paj
    public final haj<?> c() {
        return new saj(1, this.a, jp3.class, "onGiftPickerResultReceived", "onGiftPickerResultReceived(Lcom/sportybet/android/instantwin/router/giftpicker/GiftPickerResult;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ud) && (obj instanceof paj)) {
            return Intrinsics.g(c(), ((paj) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }
}
