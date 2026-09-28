package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sdl implements pdd0 {
    public final String a;

    public sdl(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("session_id", this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdl) && Intrinsics.g(this.a, ((sdl) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "android_app_session_start";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SessionStarted(sessionId=", this.a, ")");
    }
}
