package defpackage;

import com.sportygames.speedybingo.data.dto.SBBetRequest;
import com.sportygames.speedybingo.data.dto.SBExtraBallRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class sua0 implements iua0 {
    public final cua0 a;

    public sua0(cua0 cua0Var) {
        cua0Var.getClass();
        this.a = cua0Var;
    }

    @Override // defpackage.iua0
    public final or60 a() {
        return new or60(new oua0(this, null));
    }

    @Override // defpackage.iua0
    public final or60 b() {
        return new or60(new nua0(this, null));
    }

    @Override // defpackage.iua0
    public final or60 c(Integer num) {
        return new or60(new lua0(this, num, null));
    }

    @Override // defpackage.iua0
    public final or60 d() {
        return new or60(new rua0(this, null));
    }

    @Override // defpackage.iua0
    public final or60 e() {
        return new or60(new qua0(this, null));
    }

    @Override // defpackage.iua0
    public final or60 f() {
        return new or60(new pua0(this, null));
    }

    @Override // defpackage.iua0
    public final or60 g() {
        return new or60(new kua0(this, null));
    }

    @Override // defpackage.iua0
    public final or60 h(SBBetRequest sBBetRequest) {
        return new or60(new jua0(this, sBBetRequest, null));
    }

    @Override // defpackage.iua0
    public final or60 i(SBExtraBallRequest sBExtraBallRequest) {
        return new or60(new mua0(this, sBExtraBallRequest, null));
    }
}
