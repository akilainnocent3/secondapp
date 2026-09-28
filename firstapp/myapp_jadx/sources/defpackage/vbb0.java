package defpackage;

import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class vbb0 implements noy {
    public final /* synthetic */ nbb0 a;

    public vbb0(nbb0 nbb0Var) {
        this.a = nbb0Var;
    }

    @Override // defpackage.noy
    public final void a(boolean z) {
        this.a.w.j(new LoadingState<>(Status.FAILED, null, new ResultWrapper.GenericError(Integer.valueOf(z ? 123450 : 123451), null, 2, null), null, null, 16, null));
    }
}
