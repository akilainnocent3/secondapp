package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.sporty.android.platform.features.account.verifiedemailchange.model.EmailChangeFlowArgs;

/* JADX INFO: loaded from: classes5.dex */
public final class qwf extends djx<EmailChangeFlowArgs> {
    @Override // defpackage.djx
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        Parcelable parcelable = (Parcelable) rj5.a(bundle, str, EmailChangeFlowArgs.class);
        parcelable.getClass();
        return (EmailChangeFlowArgs) parcelable;
    }

    @Override // defpackage.djx
    /* JADX INFO: renamed from: d */
    public final EmailChangeFlowArgs h(String str) {
        str.getClass();
        wbp.a aVar = wbp.d;
        y3l y3lVar = aVar.b;
        return (EmailChangeFlowArgs) aVar.a(EmailChangeFlowArgs.INSTANCE.serializer(), str);
    }

    @Override // defpackage.djx
    public final void e(Bundle bundle, String str, EmailChangeFlowArgs emailChangeFlowArgs) {
        EmailChangeFlowArgs emailChangeFlowArgs2 = emailChangeFlowArgs;
        str.getClass();
        emailChangeFlowArgs2.getClass();
        bundle.putParcelable(str, emailChangeFlowArgs2);
    }

    @Override // defpackage.djx
    public final String f(EmailChangeFlowArgs emailChangeFlowArgs) {
        EmailChangeFlowArgs emailChangeFlowArgs2 = emailChangeFlowArgs;
        emailChangeFlowArgs2.getClass();
        wbp.a aVar = wbp.d;
        y3l y3lVar = aVar.b;
        String strEncode = Uri.encode(aVar.b(EmailChangeFlowArgs.INSTANCE.serializer(), emailChangeFlowArgs2));
        strEncode.getClass();
        return strEncode;
    }
}
