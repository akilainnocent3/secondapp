package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sportybet.android.instantwin.router.bethistory.BuildAndGoHistoryInput;
import com.sportybet.android.instantwin.router.ticketdetail.InstantWinTicketDetailInput;

/* JADX INFO: loaded from: classes.dex */
public final class u700 {
    public final eko a;
    public final jlo b;

    public u700(eko ekoVar, jlo jloVar) {
        this.a = ekoVar;
        this.b = jloVar;
    }

    public final Intent a(Context context, String str) {
        str.getClass();
        return this.b.k(context, new BuildAndGoHistoryInput(str));
    }

    public final Intent b(int i, Context context, String str) {
        String str2;
        str.getClass();
        if (i == 101) {
            str2 = "sr:sport:1";
        } else if (i == 150) {
            str2 = "sr:sport:1000";
        } else if (i == 159) {
            str2 = "sr:sport:1-3-1";
        } else if (i == 171) {
            str2 = "sr:sport:10000";
        } else if (i == 173) {
            str2 = "sr:sport:1-3-2";
        } else if (i == 146) {
            str2 = "sr:sport:1-1";
        } else if (i == 147) {
            str2 = "sr:sport:2";
        } else if (i != 152) {
            str2 = i != 153 ? null : "sr:sport:1-2";
        } else {
            str2 = "sr:sport:3";
        }
        if (str2 == null) {
            str2 = "";
        }
        return this.b.d(context, new InstantWinTicketDetailInput(str2, str));
    }
}
