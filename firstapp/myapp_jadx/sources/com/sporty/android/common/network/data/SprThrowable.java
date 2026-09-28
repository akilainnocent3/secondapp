package com.sporty.android.common.network.data;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import defpackage.fk50;
import defpackage.vch0;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/common/network/data/SprThrowable;", "Lfk50;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class SprThrowable extends fk50 {
    public final int a;
    public final String b;
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SprThrowable(int i, String str, boolean z) {
        super(vch0.d(str));
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public int getA() {
        return this.a;
    }

    public final UiText b() {
        if (!StringsKt.U(getB())) {
            return vch0.d(getB());
        }
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public String getB() {
        return this.b;
    }
}
