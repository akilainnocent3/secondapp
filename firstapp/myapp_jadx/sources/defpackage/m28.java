package defpackage;

import androidx.compose.runtime.m;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.crash.remote.models.BiggestResponse;
import com.sportygames.crash.remote.models.FairnessResponse;
import com.sportygames.crash.remote.models.PreviousMultiplierResponse;
import com.sportygames.crash.remote.models.TopWinResponseV2;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class m28 extends j8i0 {
    public final ssw A;
    public final ssw<String> B;
    public final ssw C;
    public final ytw<Boolean> D;
    public final rsm a;
    public final ssw<LoadingState<HTTPResponse<PreviousMultiplierResponse>>> b;
    public final ssw<LoadingState<HTTPResponse<List<BiggestResponse>>>> c;
    public final ssw<LoadingState<HTTPResponse<FairnessResponse>>> d;
    public final ssw<LoadingState<HTTPResponse<String>>> e;
    public final ssw<LoadingState<HTTPResponse<List<TopWinResponseV2>>>> f;
    public final ssw<String> i;
    public String v;
    public final ssw<String> w;
    public final ssw y;
    public final ssw<Integer> z;

    public m28(rsm rsmVar) {
        rsmVar.getClass();
        this.a = rsmVar;
        this.b = new ssw<>();
        this.c = new ssw<>();
        this.d = new ssw<>();
        this.e = new ssw<>();
        this.f = new ssw<>();
        this.i = new ssw<>();
        this.v = "";
        ssw<String> sswVar = new ssw<>();
        this.w = sswVar;
        this.y = sswVar;
        ssw<Integer> sswVar2 = new ssw<>(0);
        this.z = sswVar2;
        this.A = sswVar2;
        ssw<String> sswVar3 = new ssw<>();
        this.B = sswVar3;
        this.C = sswVar3;
        this.D = m.b(Boolean.FALSE);
    }
}
