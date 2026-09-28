package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sportybet.feature.facialrecognition.model.FacialRecognitionResult;
import com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class q6h extends vd<u6h, FacialRecognitionResult> {
    @Override // defpackage.vd
    public final Intent a(Object obj, Context context) {
        u6h u6hVar = (u6h) obj;
        u6hVar.getClass();
        Intent intent = new Intent(context, (Class<?>) FacialRecognitionActivity.class);
        intent.putExtra("data_enable_default_action_bar", false);
        intent.putExtra("cpf", u6hVar.a);
        intent.putExtra(UserCertConstants.CONFIRM_NAME_USAGE, u6hVar.b.a);
        return intent;
    }

    @Override // defpackage.vd
    public final Object c(Intent intent, int i) {
        FacialRecognitionResult facialRecognitionResult;
        return (intent == null || (facialRecognitionResult = (FacialRecognitionResult) uxo.a(intent, "facial-recognition-result", FacialRecognitionResult.class)) == null) ? new FacialRecognitionResult(FacialRecognitionResult.b.c, null) : facialRecognitionResult;
    }
}
