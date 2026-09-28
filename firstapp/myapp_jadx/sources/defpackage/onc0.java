package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class onc0 {
    public final ResourceUiText a;
    public final String b;
    public final boolean c;

    public onc0(ResourceUiText resourceUiText, String str, boolean z) {
        this.a = resourceUiText;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onc0)) {
            return false;
        }
        onc0 onc0Var = (onc0) obj;
        return Intrinsics.g(this.a, onc0Var.a) && Intrinsics.g(this.b, onc0Var.b) && this.c == onc0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyLegendsTeamInfoStats(nameUiText=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", isPts=");
        return mq0.a(sb, this.c, ")");
    }
}
