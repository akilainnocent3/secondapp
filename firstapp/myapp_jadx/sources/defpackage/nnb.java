package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class nnb implements x82 {
    public final Object a;
    public final Object b;

    public nnb(i6u i6uVar, mgb0 mgb0Var) {
        i6uVar.getClass();
        mgb0Var.getClass();
        this.a = i6uVar;
        this.b = mgb0Var;
    }

    @Override // defpackage.x82
    public void a(mth mthVar) {
        String str = (String) this.a;
        zqy zqyVar = (zqy) this.b;
        boolean z = mthVar == mth.NO_DEPOSIT;
        if (!z || str.length() <= 0) {
            hvi hviVar = zqyVar.a;
            if (hviVar != null) {
                hviVar.J.setVisibility(4);
            }
        } else {
            hvi hviVar2 = zqyVar.a;
            if (hviVar2 != null) {
                hviVar2.J.setVisibility(0);
            }
        }
        ((x5a0) zqyVar.u0().P).setValue(Boolean.valueOf(z));
        ((x5a0) zqyVar.u0().Q).setValue(str);
        if (zqyVar.O) {
            return;
        }
        enb.D0(zqyVar);
    }

    @Override // defpackage.x82
    public void onError(String str) {
        str.getClass();
        zqy zqyVar = (zqy) this.b;
        hvi hviVar = zqyVar.a;
        if (hviVar != null) {
            hviVar.J.setVisibility(4);
        }
        ((x5a0) zqyVar.u0().P).setValue(Boolean.FALSE);
        ((x5a0) zqyVar.u0().Q).setValue("");
        if (zqyVar.O) {
            return;
        }
        enb.D0(zqyVar);
    }

    public nnb(String str, zqy zqyVar) {
        this.a = str;
        this.b = zqyVar;
    }
}
