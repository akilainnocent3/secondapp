package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.withdraw.transfer.TransferStatusLegacy;

/* JADX INFO: loaded from: classes5.dex */
public final class n5s extends q5s.a<BaseResponse<TransferStatusLegacy>> {
    public final /* synthetic */ q5s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5s(q5s q5sVar, ssw sswVar) {
        super(sswVar);
        this.b = q5sVar;
    }

    @Override // q5s.a
    public final void a() {
        this.b.B = null;
    }
}
