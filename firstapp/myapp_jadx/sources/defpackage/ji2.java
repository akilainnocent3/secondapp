package defpackage;

import android.text.TextUtils;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class ji2 {
    public final n4p a;

    public ji2(n4p n4pVar) {
        this.a = n4pVar;
    }

    public final String a() {
        String str;
        BetBuilderConfig betBuilderConfig = this.a.i;
        return (betBuilderConfig == null || (str = betBuilderConfig.marketId) == null) ? "special-bb" : str;
    }

    public final boolean b(String str) {
        return TextUtils.equals(str, a());
    }

    public final boolean c() {
        BetBuilderConfig betBuilderConfig = this.a.i;
        return betBuilderConfig != null && betBuilderConfig.active;
    }
}
