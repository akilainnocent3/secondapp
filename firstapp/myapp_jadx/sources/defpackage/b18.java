package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b18 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b18(c5q c5qVar, Function0 function0, Function0 function1, int i) {
        this.c = c5qVar;
        this.b = function0;
        this.d = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        final Function0 function0 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                final ytw ytwVar = (ytw) obj4;
                String str = (String) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    d dVarA = androidx.compose.foundation.a.a(dw.a(j.e(d.a.b, 1.0f), ((Boolean) ytwVar.getValue()).booleanValue() ? 1.0f : 0.7f), new hfs(b.k(new j58(r58.d(4291595264L)), new j58(r58.d(4287653632L))), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 0), null, 0.0f, 6);
                    boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                    boolean zM = aVar.M(function0);
                    Object objY = aVar.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: v08
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ytwVar.setValue(Boolean.FALSE);
                                function0.invoke();
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    d dVarD = androidx.compose.foundation.d.d(dVarA, zBooleanValue, null, null, (Function0) objY, 14);
                    aiv aivVarC = g75.c(ht.a.e, false);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarD);
                    yka.k.getClass();
                    tsr.a aVar2 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar2);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, aivVarC, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    lkf0.b(str, null, j58.f, i18.d(R.dimen._11ssp, aVar), null, t9i.C, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, null, aVar, 196992, 0, 130514);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                bhq.c((c5q) obj4, function0, (Function0) obj3, (a) obj, qj40.a(1));
                return Unit.a;
        }
    }

    public /* synthetic */ b18(Function0 function0, ytw ytwVar, String str) {
        this.b = function0;
        this.c = ytwVar;
        this.d = str;
    }
}
