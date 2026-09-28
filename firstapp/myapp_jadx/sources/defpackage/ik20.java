package defpackage;

import com.sportybet.plugin.realsports.prematch.data.PreMatchEventData;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class ik20 implements Function1<Object, Boolean> {
    public static final ik20 a = new ik20();

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj instanceof PreMatchEventData);
    }
}
