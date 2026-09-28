package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class lrc extends qlr implements Function0<l1e0<Object>> {
    public final /* synthetic */ yqc<Object> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrc(yqc<Object> yqcVar) {
        super(0);
        this.a = yqcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final l1e0<Object> invoke() throws IOException {
        skh skhVar = this.a.a;
        File canonicalFile = skhVar.c.invoke().getCanonicalFile();
        synchronized (skh.e) {
            String absolutePath = canonicalFile.getAbsolutePath();
            LinkedHashSet linkedHashSet = skh.d;
            if (linkedHashSet.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            absolutePath.getClass();
            linkedHashSet.add(absolutePath);
        }
        return new vkh(canonicalFile, skhVar.a, skhVar.b.invoke(canonicalFile), new zqc(canonicalFile, 1));
    }
}
