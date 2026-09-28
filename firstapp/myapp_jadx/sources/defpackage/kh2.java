package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kh2 implements jh2 {
    public final ConcurrentHashMap<String, Boolean> a = new ConcurrentHashMap<>();

    @Override // defpackage.jh2
    public final boolean B(String str) {
        str.getClass();
        return Intrinsics.g(this.a.remove(str), Boolean.TRUE);
    }

    @Override // defpackage.jh2
    public final void W0(String str, boolean z) {
        str.getClass();
        this.a.put(str, Boolean.valueOf(z));
    }
}
