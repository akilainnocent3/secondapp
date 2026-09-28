package defpackage;

import androidx.compose.foundation.lazy.layout.g;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qur implements our {
    public final zvr a;
    public final mur b;
    public final g c;

    public static final class a implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                rsw<jur> rswVar = qur.this.b.b;
                int i = this.b;
                jzo<jur> jzoVarB = rswVar.b(i);
                ((jur) jzoVarB.c).d.d(uur.a, Integer.valueOf(i - jzoVarB.a), aVar2, 6);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public qur(zvr zvrVar, mur murVar, g gVar) {
        this.a = zvrVar;
        this.b = murVar;
        this.c = gVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public final int a() {
        return this.b.j().b;
    }

    @Override // defpackage.our
    public final ixr b() {
        return this.c;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public final int c(Object obj) {
        return this.c.c(obj);
    }

    @Override // defpackage.our
    public final lsw d() {
        this.b.getClass();
        return bwo.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public final Object e(int i) {
        jzo jzoVarB = this.b.j().b(i);
        return jzoVarB.c.getType().invoke(Integer.valueOf(i - jzoVarB.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qur)) {
            return false;
        }
        return Intrinsics.g(this.b, ((qur) obj).b);
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public final Object g(int i) {
        Object objA = this.c.a(i);
        return objA == null ? this.b.k(i) : objA;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public final void h(int i, Object obj, androidx.compose.runtime.a aVar, final int i2) {
        final int i3;
        final Object obj2;
        b bVarI = aVar.i(1493551140);
        int i4 = (bVarI.d(i) ? 4 : 2) | i2 | (bVarI.A(obj) ? 32 : 16) | (bVarI.M(this) ? 256 : 128);
        if (bVarI.q(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            wen.b(obj2, i3, this.a.q, pp8.b(726189336, new a(i), bVarI), bVarI, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i3, obj2, i2) { // from class: pur
                public final /* synthetic */ int b;
                public final /* synthetic */ Object c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = qj40.a(1);
                    this.a.h(this.b, this.c, (a) obj3, iA);
                    return Unit.a;
                }
            };
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.our
    public final rvr i() {
        return this.b.a;
    }
}
