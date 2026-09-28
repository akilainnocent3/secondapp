package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Metadata;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljof;", "Lavw;", "Lfof;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jof extends avw<fof> {
    public static final Regex i = new Regex("(https?://|www\\.|[a-zA-Z0-9-]+\\.[a-zA-Z]{2,6})", ns40.IGNORE_CASE);
    public final mgb0 e;
    public final vga0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jof(mgb0 mgb0Var, vga0 vga0Var) {
        super(new fof(0));
        mgb0Var.getClass();
        vga0Var.getClass();
        this.e = mgb0Var;
        this.f = vga0Var;
        AccountInfo accountInfoLastAccountInfo = mgb0Var.lastAccountInfo();
        if (accountInfoLastAccountInfo != null) {
            y1(new gof(null, this, accountInfoLastAccountInfo.getBio()));
        }
    }

    public static boolean z1(int i2, String str) {
        String string = StringsKt.t0(str).toString();
        return !i.a(string) && (string.length() <= i2);
    }
}
