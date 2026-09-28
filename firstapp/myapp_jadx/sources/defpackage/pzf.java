package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.model.EmailChangeVerifyIdentityArgs;

/* JADX INFO: loaded from: classes5.dex */
public final class pzf extends djx<EmailChangeVerifyIdentityArgs> {
    @Override // defpackage.djx
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        Parcelable parcelable = (Parcelable) rj5.a(bundle, str, EmailChangeVerifyIdentityArgs.class);
        parcelable.getClass();
        return (EmailChangeVerifyIdentityArgs) parcelable;
    }

    @Override // defpackage.djx
    /* JADX INFO: renamed from: d */
    public final EmailChangeVerifyIdentityArgs h(String str) {
        str.getClass();
        wbp.a aVar = wbp.d;
        y3l y3lVar = aVar.b;
        return (EmailChangeVerifyIdentityArgs) aVar.a(EmailChangeVerifyIdentityArgs.INSTANCE.serializer(), str);
    }

    @Override // defpackage.djx
    public final void e(Bundle bundle, String str, EmailChangeVerifyIdentityArgs emailChangeVerifyIdentityArgs) {
        EmailChangeVerifyIdentityArgs emailChangeVerifyIdentityArgs2 = emailChangeVerifyIdentityArgs;
        str.getClass();
        emailChangeVerifyIdentityArgs2.getClass();
        bundle.putParcelable(str, emailChangeVerifyIdentityArgs2);
    }

    @Override // defpackage.djx
    public final String f(EmailChangeVerifyIdentityArgs emailChangeVerifyIdentityArgs) {
        EmailChangeVerifyIdentityArgs emailChangeVerifyIdentityArgs2 = emailChangeVerifyIdentityArgs;
        emailChangeVerifyIdentityArgs2.getClass();
        wbp.a aVar = wbp.d;
        y3l y3lVar = aVar.b;
        String strEncode = Uri.encode(aVar.b(EmailChangeVerifyIdentityArgs.INSTANCE.serializer(), emailChangeVerifyIdentityArgs2));
        strEncode.getClass();
        return strEncode;
    }
}
