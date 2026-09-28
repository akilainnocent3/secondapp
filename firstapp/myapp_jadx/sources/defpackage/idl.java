package defpackage;

import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class idl implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string = UUID.randomUUID().toString();
        string.getClass();
        return string;
    }
}
