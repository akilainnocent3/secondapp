package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class q25<T> implements myh {
    public final /* synthetic */ s25 a;

    public q25(s25 s25Var) {
        this.a = s25Var;
    }

    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) {
        s25 s25Var = this.a;
        s25Var.c = (BaseResponse) obj;
        s25Var.d = System.currentTimeMillis();
        return Unit.a;
    }
}
