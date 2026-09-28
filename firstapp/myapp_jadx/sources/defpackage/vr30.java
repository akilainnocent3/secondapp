package defpackage;

import com.sportybet.plugin.realsports.data.SearchRequestData;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vr30 implements Function0 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new SimpleDateFormat("dd/MM HH:mm", Locale.US);
            default:
                return new SearchRequestData(null, 0, 0, null, null, null, 63, null);
        }
    }
}
