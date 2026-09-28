package defpackage;

import com.sportybet.plugin.realsports.live.data.LiveEventData;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class yss implements Function1<Object, Boolean> {
    public static final yss a = new yss();

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj instanceof LiveEventData);
    }
}
