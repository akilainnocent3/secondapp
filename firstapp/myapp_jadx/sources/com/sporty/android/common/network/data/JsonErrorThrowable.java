package com.sporty.android.common.network.data;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import defpackage.fk50;
import defpackage.itf0;
import defpackage.vch0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/common/network/data/JsonErrorThrowable;", "Lfk50;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class JsonErrorThrowable extends fk50 {
    public final ResourceUiText a;

    public JsonErrorThrowable(int i) {
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.common_feedback__network_issue_please_check_your_network_and_try_again);
        super(resourceUiText);
        this.a = resourceUiText;
        itf0.a aVar = itf0.a;
        aVar.q("JsonErrorThrowable");
        aVar.a("451 CloudFront Html detected", new Object[0]);
    }
}
