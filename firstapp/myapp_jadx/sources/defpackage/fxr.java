package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fxr {

    public static final class a implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ c a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Object c;

        public a(int i, c cVar, Object obj) {
            this.a = cVar;
            this.b = i;
            this.c = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                this.a.h(this.b, this.c, aVar2, 0);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final void a(final c cVar, final Object obj, final int i, final Object obj2, androidx.compose.runtime.a aVar, final int i2) {
        b bVarI = aVar.i(1439843069);
        int i3 = (bVarI.M(cVar) ? 4 : 2) | i2 | (bVarI.M(obj) ? 32 : 16) | (bVarI.d(i) ? 256 : 128) | (bVarI.M(obj2) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            ((et60) obj).f(obj2, pp8.b(980966366, new a(i, cVar, obj2), bVarI), bVarI, 48);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(obj, i, obj2, i2) { // from class: exr
                public final /* synthetic */ Object b;
                public final /* synthetic */ int c;
                public final /* synthetic */ Object d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = qj40.a(1);
                    fxr.a(this.a, this.b, this.c, this.d, (a) obj3, iA);
                    return Unit.a;
                }
            };
        }
    }
}
