package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a3i0 implements nsr {
    public final yhf0 b;
    public final int c;
    public final wsg0 d;
    public final Function0<vkf0> e;

    public a3i0(yhf0 yhf0Var, int i, wsg0 wsg0Var, Function0<vkf0> function0) {
        this.b = yhf0Var;
        this.c = i;
        this.d = wsg0Var;
        this.e = function0;
    }

    @Override // defpackage.nsr
    public final biv e(t tVar, vhv vhvVar, long j) {
        final y yVarD0 = vhvVar.d0(kxa.b(0, 0, 0, Reader.READ_DONE, 7, j));
        final int iMin = Math.min(yVarD0.b, kxa.h(j));
        return t.z1(tVar, yVarD0.a, iMin, new Function1() { // from class: z2i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                a3i0 a3i0Var = this.a;
                int i = a3i0Var.c;
                yhf0 yhf0Var = a3i0Var.b;
                wsg0 wsg0Var = a3i0Var.d;
                vkf0 vkf0VarInvoke = a3i0Var.e.invoke();
                ukf0 ukf0Var = vkf0VarInvoke != null ? vkf0VarInvoke.a : null;
                y yVar = yVarD0;
                yhf0Var.a(i3z.a, vhf0.a(aVar, i, wsg0Var, ukf0Var, false, yVar.a), iMin, yVar.b);
                y.a.A(aVar, yVar, 0, Math.round(-((t5a0) yhf0Var.a).j()));
                return Unit.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a3i0) {
            a3i0 a3i0Var = (a3i0) obj;
            if (this.b == a3i0Var.b && this.c == a3i0Var.c && this.d.equals(a3i0Var.d) && Intrinsics.g(this.e, a3i0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + gpp.a(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + ')';
    }
}
