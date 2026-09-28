package defpackage;

import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kdl implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Executors.newSingleThreadScheduledExecutor();
    }
}
