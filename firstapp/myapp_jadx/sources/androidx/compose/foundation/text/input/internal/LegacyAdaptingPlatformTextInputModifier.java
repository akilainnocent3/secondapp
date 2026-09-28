package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.d;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import defpackage.iif0;
import defpackage.n6s;
import defpackage.n80;
import defpackage.p3w;
import defpackage.t4s;
import defpackage.x5s;
import defpackage.zkn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Lp3w;", "Lt4s;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends p3w<t4s> {
    public final x5s b;
    public final n6s c;
    public final iif0 d;

    public LegacyAdaptingPlatformTextInputModifier(x5s x5sVar, n6s n6sVar, iif0 iif0Var) {
        this.b = x5sVar;
        this.c = n6sVar;
        this.d = iif0Var;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new t4s(this.b, this.c, this.d);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) throws Throwable {
        t4s t4sVar = (t4s) cVar;
        if (t4sVar.C) {
            ((n80) t4sVar.D).b();
            t4sVar.D.j(t4sVar);
        }
        x5s x5sVar = this.b;
        t4sVar.D = x5sVar;
        if (t4sVar.C) {
            if (x5sVar.a != null) {
                zkn.c("Expected textInputModifierNode to be null");
            }
            x5sVar.a = t4sVar;
        }
        t4sVar.E = this.c;
        t4sVar.F = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return Intrinsics.g(this.b, legacyAdaptingPlatformTextInputModifier.b) && Intrinsics.g(this.c, legacyAdaptingPlatformTextInputModifier.c) && Intrinsics.g(this.d, legacyAdaptingPlatformTextInputModifier.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.b + rarBonoqWB.KanhJFuAHzPqjtj + this.c + ", textFieldSelectionManager=" + this.d + ')';
    }
}
