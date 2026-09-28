package defpackage;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ai00 {
    public final List<hv7> a;

    public ai00(Object obj) {
        m2g m2gVar = m2g.a;
        m2gVar.getClass();
        this.a = m2gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ai00) && Intrinsics.g(this.a, ((ai00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return p.a("PersonalCodeChatUIState(isLoading=false, codeChatItems=", ")", this.a);
    }
}
