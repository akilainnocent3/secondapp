package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.sporty.android.sportymedia.ui.SportyMediaActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class i8d implements tit {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Boolean d;
    public final /* synthetic */ h8d e;

    public i8d(h8d h8dVar, Context context, String str, String str2, Boolean bool) {
        this.e = h8dVar;
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = bool;
    }

    @Override // defpackage.tit
    public final void w(Account account, boolean z) {
        if (this.e.b()) {
            SportyMediaActivity.z1(this.a, this.b, this.c, this.d.booleanValue());
        }
    }
}
