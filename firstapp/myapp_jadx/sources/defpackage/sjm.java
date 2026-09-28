package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sjm implements nsr {
    public final yhf0 b;
    public final int c;
    public final wsg0 d;
    public final Function0<vkf0> e;

    public sjm(yhf0 yhf0Var, int i, wsg0 wsg0Var, Function0<vkf0> function0) {
        this.b = yhf0Var;
        this.c = i;
        this.d = wsg0Var;
        this.e = function0;
    }

    @Override // defpackage.nsr
    public final biv e(final t tVar, vhv vhvVar, long j) {
        long j2;
        if (vhvVar.b0(kxa.h(j)) < kxa.i(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = kxa.b(0, Reader.READ_DONE, 0, 0, 13, j2);
        }
        final y yVarD0 = vhvVar.d0(j);
        final int iMin = Math.min(yVarD0.a, kxa.i(j2));
        return t.z1(tVar, iMin, yVarD0.b, new Function1() { // from class: rjm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                sjm sjmVar = this.a;
                int i = sjmVar.c;
                yhf0 yhf0Var = sjmVar.b;
                wsg0 wsg0Var = sjmVar.d;
                vkf0 vkf0VarInvoke = sjmVar.e.invoke();
                ukf0 ukf0Var = vkf0VarInvoke != null ? vkf0VarInvoke.a : null;
                boolean z = tVar.getLayoutDirection() == asr.b;
                y yVar = yVarD0;
                yhf0Var.a(i3z.b, vhf0.a(aVar, i, wsg0Var, ukf0Var, z, yVar.a), iMin, yVar.a);
                y.a.A(aVar, yVar, Math.round(-((t5a0) yhf0Var.a).j()), 0);
                return Unit.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sjm) {
            sjm sjmVar = (sjm) obj;
            if (this.b == sjmVar.b && this.c == sjmVar.c && this.d.equals(sjmVar.d) && Intrinsics.g(this.e, sjmVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + gpp.a(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + ')';
    }
}
