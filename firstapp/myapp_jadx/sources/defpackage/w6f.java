package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class w6f {
    public final lq1 a;
    public final ys60 b;
    public final lpa0 c;
    public final k5b d;

    public w6f(lq1 lq1Var, ys60 ys60Var, lpa0 lpa0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        lq1Var.getClass();
        this.a = lq1Var;
        this.b = ys60Var;
        this.c = lpa0Var;
        this.d = k5bVar;
    }

    public static boolean a(File file) {
        LocalDate localDateM = Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).m();
        LocalDate localDateNow = LocalDate.now();
        boolean z = localDateM.compareTo((ChronoLocalDate) localDateNow) < 0;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_WINNING_POPUP);
        aVar.a("SoundDownloader: fileDate=" + localDateM + ", today=" + localDateNow + ", expired=" + z, new Object[0]);
        return z;
    }
}
