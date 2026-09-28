package defpackage;

import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class bu5 {
    public static final Locale a(a aVar) {
        aVar.N(2088426481);
        Locale locale = ((Configuration) aVar.O(AndroidCompositionLocals_androidKt.a)).getLocales().get(0);
        aVar.H();
        return locale;
    }
}
