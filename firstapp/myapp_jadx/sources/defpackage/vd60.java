package defpackage;

import com.sportygames.speedybingo.data.dto.SBExtraBallRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class vd60 implements td60 {
    public final iua0 a;

    public vd60(iua0 iua0Var) {
        iua0Var.getClass();
        this.a = iua0Var;
    }

    @Override // defpackage.td60
    public final yzh a(int i) {
        return em50.a(new ud60(this.a.i(new SBExtraBallRequest(i)), this, i));
    }
}
