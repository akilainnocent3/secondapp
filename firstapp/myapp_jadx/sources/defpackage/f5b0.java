package defpackage;

import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class f5b0 implements noy {
    public final /* synthetic */ v4b0 a;

    public f5b0(v4b0 v4b0Var) {
        this.a = v4b0Var;
    }

    @Override // defpackage.noy
    public final void a(boolean z) {
        this.a.H.j(new LoadingState<>(Status.FAILED, null, new ResultWrapper.GenericError(Integer.valueOf(z ? 123450 : 123451), null, 2, null), null, null, 16, null));
    }
}
