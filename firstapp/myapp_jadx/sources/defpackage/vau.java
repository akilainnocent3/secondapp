package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class vau {

    public static final /* synthetic */ class a extends saj implements Function2<Context, String, File> {
        @Override // kotlin.jvm.functions.Function2
        public final File invoke(Context context, String str) {
            Context context2 = context;
            String str2 = str;
            context2.getClass();
            str2.getClass();
            LinkedHashMap linkedHashMap = ((ccu) this.receiver).b.c;
            File file = (File) linkedHashMap.get(str2);
            if (file != null) {
                return file;
            }
            File fileA = hbu.a(context2, str2);
            if (!fileA.exists() || !fileA.canRead() || fileA.length() <= 0) {
                return null;
            }
            linkedHashMap.put(str2, fileA);
            return fileA;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<x8u, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(x8u x8uVar) {
            x8u x8uVar2 = x8uVar;
            x8uVar2.getClass();
            ((ccu) this.receiver).y1(x8uVar2);
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ccu ccuVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVar;
        ccu ccuVar2 = ccuVar;
        ccuVar2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-2067998810);
        int i2 = (bVarI.A(ccuVar2) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            jbu jbuVar = (jbu) wyh.c(ccuVar2.w, bVarI, 0, 7).getValue();
            t340 t340Var = ccuVar2.B;
            int i3 = i2 & 14;
            boolean z = i3 == 4 || bVarI.A(ccuVar2);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z || objY == c0042a) {
                a aVar2 = new a(2, ccuVar2, ccu.class, "getSoundFile", "getSoundFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", 0);
                bVarI.r(aVar2);
                objY = aVar2;
            }
            Function2 function2 = (Function2) ((chp) objY);
            boolean z2 = i3 == 4 || bVarI.A(ccuVar2);
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new b(1, ccuVar2, ccu.class, "handleEvent", "handleEvent(Lcom/sporty/android/platform/features/luckywheel/model/LuckyWheelEvent;)V", 0);
                bVarI.r(objY2);
            }
            bVar = bVarI;
            b(jbuVar, t340Var, function2, (Function1) ((chp) objY2), bVar, 0);
        } else {
            ccuVar2 = ccuVar2;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new cyp(i, 1, ccuVar2);
        }
    }

    public static final void b(final jbu jbuVar, final lyh<String> lyhVar, final Function2<? super Context, ? super String, ? extends File> function2, final Function1<? super x8u, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-696711065);
        int i2 = i | (bVarI.M(jbuVar) ? 4 : 2) | (bVarI.M(lyhVar) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = jbuVar.f;
            lyhVar.getClass();
            function2.getClass();
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new abu(context, function2);
                bVarI.r(objY);
            }
            final abu abuVar = (abu) objY;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA = bVarI.A(abuVar) | bVarI.b(z);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new cbu(abuVar, z, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY2);
            boolean zA2 = bVarI.A(abuVar) | ((((i2 & 112) ^ 48) > 32 && bVarI.A(lyhVar)) || (i2 & 48) == 32);
            Object objY3 = bVarI.y();
            if (zA2 || objY3 == c0042a) {
                objY3 = new dbu(lyhVar, abuVar, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, lyhVar, (Function2) objY3);
            boolean zA3 = bVarI.A(abuVar);
            Object objY4 = bVarI.y();
            if (zA3 || objY4 == c0042a) {
                objY4 = new Function1() { // from class: bbu
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((use) obj).getClass();
                        return new ebu(abuVar);
                    }
                };
                bVarI.r(objY4);
            }
            xvf.c(abuVar, (Function1) objY4, bVarI);
            bVar = bVarI;
            hy60.a(null, pp8.b(-822233557, new ib2(function1, i3), bVarI), null, null, null, 0, j58.l, 0L, null, pp8.b(-1591126602, new rnk(jbuVar, function1), bVarI), bVar, 806879280, 445);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(lyhVar, function2, function1, i) { // from class: rau
                public final /* synthetic */ lyh b;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    vau.b(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
