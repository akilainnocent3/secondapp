package com.sporty.android.common.util;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import defpackage.fk50;
import defpackage.vch0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/common/util/ApiResponseNullException;", "Lfk50;", "<init>", "()V", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ApiResponseNullException extends fk50 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiResponseNullException() {
        super(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later));
        StringUiText stringUiText = vch0.a;
    }
}
