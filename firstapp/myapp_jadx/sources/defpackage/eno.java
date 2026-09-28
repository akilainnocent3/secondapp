package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class eno {

    public static final class a implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class b implements iaj<gwr, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ Function1 b;
        public final /* synthetic */ Function2 c;
        public final /* synthetic */ Function1 d;
        public final /* synthetic */ Function1 e;
        public final /* synthetic */ Function0 f;
        public final /* synthetic */ Function1 i;
        public final /* synthetic */ Function1 v;
        public final /* synthetic */ Function0 w;

        public b(List list, Function1 function1, Function2 function2, Function1 function3, Function1 function4, Function0 function0, Function1 function5, Function1 function6, Function0 function7) {
            this.a = list;
            this.b = function1;
            this.c = function2;
            this.d = function3;
            this.e = function4;
            this.f = function0;
            this.i = function5;
            this.v = function6;
            this.w = function7;
        }

        @Override // defpackage.iaj
        public final Unit d(gwr gwrVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            gwr gwrVar2 = gwrVar;
            int iIntValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= aVar2.d(iIntValue) ? 32 : 16;
            }
            if (aVar2.q(i & 1, (i & 147) != 146)) {
                omo omoVar = (omo) this.a.get(iIntValue);
                aVar2.N(679803249);
                if (omoVar instanceof epo) {
                    aVar2.N(679844261);
                    dpo.b((epo) omoVar, this.b, aVar2, 0);
                    aVar2.H();
                } else if (omoVar instanceof zoo) {
                    aVar2.N(680110892);
                    yoo.a((zoo) omoVar, this.c, aVar2, 0);
                    aVar2.H();
                } else if (omoVar instanceof nmo) {
                    aVar2.N(680286073);
                    mmo.a((nmo) omoVar, this.d, this.e, this.f, this.i, aVar2, 0);
                    aVar2.H();
                } else {
                    if (!(omoVar instanceof fno)) {
                        throw rg.a(1130307794, aVar2);
                    }
                    aVar2.N(680829162);
                    c5f.a(h.j(j.g(d.a.b, 1.0f), 0.0f, 8.0f, 0.0f, 32.0f, 5), (fno) omoVar, this.v, this.w, this.b, aVar2, 6);
                    aVar2.H();
                }
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final void a(final qcn<? extends omo> qcnVar, final Function1<? super String, Unit> function1, final Function2<? super String, ? super String, Unit> function2, final Function1<? super String, Unit> function3, final Function1<? super String, Unit> function4, final Function0<Unit> function0, final Function1<? super moo, Unit> function5, final Function1<? super v4f, Unit> function6, final Function0<Unit> function7, androidx.compose.runtime.a aVar, final int i) {
        qcnVar.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function0.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(792348774);
        int i2 = i | (bVarI.M(qcnVar) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function3) ? 2048 : 1024) | (bVarI.A(function4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function0) ? 131072 : 65536) | (bVarI.A(function5) ? 1048576 : 524288) | (bVarI.A(function6) ? 8388608 : 4194304) | (bVarI.A(function7) ? 67108864 : 33554432);
        if (bVarI.q(i2 & 1, (i2 & 38347923) != 38347922)) {
            d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), ((lib0) bVarI.O(oib0.a)).i0, zk40.a);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608) | ((i2 & 234881024) == 67108864);
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                Function1 function8 = new Function1() { // from class: cno
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        qcn qcnVar2 = qcnVar;
                        szrVar.d(qcnVar2.size(), null, new eno.a(qcnVar2), new op8(802480018, new eno.b(qcnVar2, function1, function2, function3, function4, function0, function5, function6, function7), true));
                        return Unit.a;
                    }
                };
                bVarI.r(function8);
                objY = function8;
            }
            aur.a(dVarB, null, null, false, null, null, null, false, null, (Function1) objY, bVarI, 0, 510);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, function3, function4, function0, function5, function6, function7, i) { // from class: dno
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function1 v;
                public final /* synthetic */ Function0 w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    eno.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
