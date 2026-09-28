package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class a5z {
    public static final void a(final j7z j7zVar, final Function0 function0, final Function1 function1, final Function1 function2, final Function0 function3, final Function1 function4, a aVar, final int i) {
        j7zVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(-327556553);
        int i2 = i | (bVarI.M(j7zVar) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function4) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            boolean z = j7zVar instanceof j7z.c;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z) {
                bVarI.N(-71271504);
                T t = ((j7z.c) j7zVar).a;
                if (t != 0) {
                    bVarI.N(-71221842);
                    boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 14) == 4);
                    Object objY = bVarI.y();
                    if (z2 || objY == c0042a) {
                        objY = new z4z(function2, j7zVar, null);
                        bVarI.r(objY);
                    }
                    xvf.e(bVarI, t, (Function2) objY);
                    bVarI.X(false);
                } else {
                    bVarI.N(-71070965);
                    bVarI.X(false);
                }
                bVarI.X(false);
            } else if (j7zVar instanceof j7z.d) {
                bVarI.N(-71022822);
                twi0.a(new yle(false, false, 5), function0, bVarI, (i2 & 112) | 6, 0);
                bVarI.X(false);
            } else {
                boolean z3 = j7zVar instanceof j7z.b;
                d.a aVar2 = d.a.b;
                if (z3) {
                    bVarI.N(-70789268);
                    j7z.b bVar = (j7z.b) j7zVar;
                    d dVarB = g3w.b(aVar2, bVar.d != null, new gaj() { // from class: r4z
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            d dVar = (d) obj;
                            a aVar3 = (a) obj2;
                            e3w.a((Integer) obj3, dVar, aVar3, -381926);
                            String str = ((j7z.b) j7zVar).d;
                            str.getClass();
                            d dVarC = c9j.c(dVar, AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, str);
                            aVar3.H();
                            return dVarC;
                        }
                    }, bVarI, 6);
                    UiText uiText = bVar.a;
                    uiText.getClass();
                    qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                    String strG = uiText.g((Context) bVarI.O(qyd0Var));
                    UiText uiText2 = bVar.b;
                    uiText2.getClass();
                    String strG2 = uiText2.g((Context) bVarI.O(qyd0Var));
                    String strA = cb40.a(R.string.common_functions__ok, new Object[0], bVarI);
                    int i3 = i2 & 896;
                    int i4 = i2 & 14;
                    boolean z4 = (i3 == 256) | (i4 == 4);
                    Object objY2 = bVarI.y();
                    if (z4 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: s4z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(((j7z.b) j7zVar).c);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY2);
                    }
                    Function0 function5 = (Function0) objY2;
                    boolean z5 = (i3 == 256) | (i4 == 4);
                    Object objY3 = bVarI.y();
                    if (z5 || objY3 == c0042a) {
                        objY3 = new Function0() { // from class: t4z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(((j7z.b) j7zVar).c);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY3);
                    }
                    nzj.b(dVarB, strG, strG2, null, null, null, strA, null, null, null, null, function5, (Function0) objY3, null, bVarI, 0, 0, 10168);
                    bVarI = bVarI;
                    bVarI.X(false);
                } else {
                    if (!(j7zVar instanceof j7z.a)) {
                        throw igf0.a(bVarI, -1249224963, false);
                    }
                    bVarI.N(-70118366);
                    j7z.a aVar3 = (j7z.a) j7zVar;
                    d dVarB2 = g3w.b(aVar2, aVar3.c != null, new gaj() { // from class: u4z
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            d dVar = (d) obj;
                            a aVar4 = (a) obj2;
                            e3w.a((Integer) obj3, dVar, aVar4, -993434571);
                            String str = ((j7z.a) j7zVar).c;
                            str.getClass();
                            d dVarC = c9j.c(dVar, AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, str);
                            aVar4.H();
                            return dVarC;
                        }
                    }, bVarI, 6);
                    String strG3 = aVar3.a.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                    int i5 = 458752 & i2;
                    int i6 = i2 & 14;
                    boolean z6 = ((i2 & 57344) == 16384) | (i5 == 131072) | (i6 == 4);
                    Object objY4 = bVarI.y();
                    if (z6 || objY4 == c0042a) {
                        objY4 = new Function0() { // from class: v4z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function4.invoke(((j7z.a) j7zVar).b);
                                function3.invoke();
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    }
                    Function0 function6 = (Function0) objY4;
                    boolean z7 = (i5 == 131072) | (i6 == 4);
                    Object objY5 = bVarI.y();
                    if (z7 || objY5 == c0042a) {
                        objY5 = new Function0() { // from class: w4z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function4.invoke(((j7z.a) j7zVar).b);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    Function0 function7 = (Function0) objY5;
                    boolean z8 = (i5 == 131072) | (i6 == 4);
                    Object objY6 = bVarI.y();
                    if (z8 || objY6 == c0042a) {
                        objY6 = new Function0() { // from class: x4z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function4.invoke(((j7z.a) j7zVar).b);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY6);
                    }
                    rfc.a(dVarB2, strG3, null, function6, function7, (Function0) objY6, null, bVarI, 0, 140);
                    bVarI.X(false);
                }
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, function3, function4, i) { // from class: y4z
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    a5z.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
