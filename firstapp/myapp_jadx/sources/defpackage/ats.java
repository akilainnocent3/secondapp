package defpackage;

import com.sporty.android.book.presentation.eventsorting.EventStreamType;
import com.sportybet.plugin.realsports.live.data.LiveHeaderData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class ats {
    public final /* synthetic */ xss a;

    public ats(xss xssVar) {
        this.a = xssVar;
    }

    public final void a(Set<? extends EventStreamType> set) {
        xss xssVar = this.a;
        xssVar.s = LiveHeaderData.copy$default(xssVar.s, false, false, null, null, set, 0, 0, 111, null);
        k48.a(xssVar.u, xssVar.o());
        xssVar.I = true;
        xssVar.v();
        xssVar.c();
        jts jtsVar = xssVar.z;
        if (jtsVar != null) {
            jtsVar.h(true);
        }
    }
}
