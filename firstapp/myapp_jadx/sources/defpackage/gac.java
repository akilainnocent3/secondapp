package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.router.Sender;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class gac extends wgm {
    public final v7b d;

    static {
        CountryCodeName[] countryCodeNameArr = v7b.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gac(v7b v7bVar, skd skdVar, bnh0 bnh0Var) {
        super(v7bVar, skdVar, bnh0Var);
        skdVar.getClass();
        bnh0Var.getClass();
        this.d = v7bVar;
    }

    @Override // defpackage.wgm, com.sportybet.tech.uibus.UIRouter
    public final boolean isGenericUri() {
        return true;
    }

    @Override // defpackage.wgm, com.sportybet.tech.uibus.UIRouter
    public final boolean openUri(Uri uri, String str, String str2, Bundle bundle, Sender sender) {
        uri.getClass();
        str.getClass();
        str2.getClass();
        sender.getClass();
        String queryParameter = uri.getQueryParameter("c");
        if (queryParameter == null) {
            List<String> pathSegments = uri.getPathSegments();
            pathSegments.getClass();
            queryParameter = (String) CollectionsKt.V(0, pathSegments);
        }
        String queryParameter2 = uri.getQueryParameter("customCode");
        if (queryParameter2 == null || StringsKt.U(queryParameter2) || queryParameter == null || StringsKt.U(queryParameter) || !this.d.a(queryParameter)) {
            return false;
        }
        qz3.k(queryParameter2, "SHARE_BOOKING_CODE_LOAD_CODE");
        return true;
    }

    @Override // defpackage.wgm, com.sportybet.tech.uibus.UIRouter
    public final int priority() {
        return 50;
    }

    @Override // defpackage.wgm, com.sportybet.tech.uibus.UIRouter
    public final boolean verifyUri(Uri uri, String str, String str2) {
        uri.getClass();
        str.getClass();
        str2.getClass();
        if (!super.verifyUri(uri, str, str2)) {
            return false;
        }
        try {
            String queryParameter = uri.getQueryParameter("customCode");
            return (queryParameter == null || queryParameter.length() == 0) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
