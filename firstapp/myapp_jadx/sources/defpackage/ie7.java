package defpackage;

import android.text.TextUtils;
import com.sporty.android.chat.data.LiveShareBetData;
import com.sporty.android.chat.data.UploadImageResponse;
import com.sporty.android.common.data.CustomException;
import com.sporty.android.common.data.CustomExceptionType;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ie7 extends fte<bi50<UploadImageResponse>> {
    public final /* synthetic */ be7 a;
    public final /* synthetic */ LiveShareBetData b;

    public ie7(be7 be7Var, LiveShareBetData liveShareBetData) {
        this.a = be7Var;
        this.b = liveShareBetData;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        be7 be7Var = this.a;
        be7Var.y.j("");
        be7Var.y1();
        be7Var.E1(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        String string;
        bi50 bi50Var = (bi50) obj;
        bi50Var.getClass();
        UploadImageResponse uploadImageResponse = (UploadImageResponse) bi50Var.b;
        if (!bi50Var.a.getIsSuccessful() || uploadImageResponse == null) {
            onError(new CustomException(CustomExceptionType.ERROR, ui8.c(bi50Var.c)));
            return;
        }
        if (TextUtils.isEmpty(uploadImageResponse.getImageUrl())) {
            return;
        }
        be7 be7Var = this.a;
        String strD = be7Var.y.d();
        if (strD == null || (string = StringsKt.t0(strD).toString()) == null) {
            string = LGxrN.KsI;
        }
        String jsonString = LiveShareBetData.copy$default(this.b, null, null, null, null, null, false, uploadImageResponse.getImageUrl(), null, null, 447, null).toJsonString();
        if (string.length() <= 0 || jsonString.length() <= 0) {
            return;
        }
        be7Var.C1(string, jsonString);
    }
}
