package defpackage;

import java.util.Calendar;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wwc implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(Calendar.getInstance().getTimeZone().getRawOffset());
    }
}
