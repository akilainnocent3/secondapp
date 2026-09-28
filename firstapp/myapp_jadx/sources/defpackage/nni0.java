package defpackage;

import com.sportybet.plugin.realsports.data.Market;
import java.util.function.Function;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nni0 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Market) obj).isLive());
    }
}
