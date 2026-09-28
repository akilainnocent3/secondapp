package defpackage;

import j$.time.Instant;
import kotlin.time.d;

/* JADX INFO: loaded from: classes8.dex */
public final class m5p implements us7 {
    @Override // defpackage.us7
    public final d a() {
        Instant instantNow = Instant.now();
        instantNow.getClass();
        d dVar = d.c;
        return d.a.b(instantNow.getNano(), instantNow.getEpochSecond());
    }
}
