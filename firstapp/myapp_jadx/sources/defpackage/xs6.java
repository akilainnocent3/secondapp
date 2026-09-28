package defpackage;

import android.os.Bundle;
import com.sportygames.commons.utils.CasinoLogger;

/* JADX INFO: loaded from: classes.dex */
public final class xs6 implements ys6 {
    @Override // defpackage.ys6
    public final void logEvent(String str, Bundle bundle) {
        CasinoLogger.INSTANCE.logEventToCasino(str, bundle);
    }
}
