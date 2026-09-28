package defpackage;

import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bug implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Executors.newFixedThreadPool(5);
    }
}
