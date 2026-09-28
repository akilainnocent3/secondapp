package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import com.esotericsoftware.spine.android.SpineView;
import com.esotericsoftware.spine.android.b;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class gw80 {
    public static final void a(final boolean z, final boolean z2, final File file, final File file2, final String str, final Function1<? super b, Unit> function1, a aVar, final int i) {
        str.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(190877858);
        int i2 = (bVarI.b(z) ? 4 : 2) | i | (bVarI.b(z2) ? 32 : 16) | (bVarI.A(file) ? 256 : 128) | (bVarI.A(file2) ? 2048 : 1024) | (bVarI.M(str) ? 16384 : 8192) | (bVarI.A(function1) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            bVarI.C(-1249966141, bVarI.l(bVarI.l(bVarI.l(bVarI.l(str, Boolean.valueOf(z)), Boolean.valueOf(z2)), file != null ? file.getAbsolutePath() : null), file2 != null ? file2.getAbsolutePath() : null));
            boolean zA = bVarI.A(file) | bVarI.A(file2) | ((458752 & i2) == 131072) | ((i2 & 57344) == 16384);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new Function1() { // from class: dw80
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        final String str2 = str;
                        final Function1 function2 = function1;
                        return SpineView.a(file, file2, context, new b(new hcb0() { // from class: fw80
                            @Override // defpackage.hcb0
                            public final void b(b bVar) {
                                bVar.getClass();
                                function2.invoke(bVar);
                                gw80.b(bVar, str2);
                            }
                        }));
                    }
                };
                bVarI.r(objY);
            }
            androidx.compose.ui.viewinterop.b.a((Function1) objY, null, null, bVarI, 0, 6);
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, z2, file, file2, str, function1, i) { // from class: ew80
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ File c;
                public final /* synthetic */ File d;
                public final /* synthetic */ String e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    gw80.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static void b(b bVar, String str) {
        bVar.getClass();
        str.getClass();
        zi0 zi0VarA = bVar.a();
        tx90 tx90Var = bVar.b().a;
        if (tx90Var.a(str) == null && tx90Var.a("militao-normal") != null) {
            str = "militao-normal";
        }
        zi0VarA.m(0, str, true);
    }
}
