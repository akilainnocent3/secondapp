package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.bet.edit.ErrorDataInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class tdv {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[sev.values().length];
            try {
                sev sevVar = sev.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                sev sevVar2 = sev.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                sev sevVar3 = sev.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(final sev sevVar, final tev tevVar, final Function1<? super sev, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function2, androidx.compose.runtime.a aVar, final int i) {
        tevVar.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        b bVarI = aVar.i(1242600875);
        int i2 = (bVarI.d(sevVar == null ? -1 : sevVar.ordinal()) ? 4 : 2) | i | (bVarI.M(tevVar) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = sevVar == null ? -1 : a.a[sevVar.ordinal()];
            if (i3 != -1) {
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (i3 == 1) {
                    bVarI.N(-170595);
                    ErrorDataInfo errorDataInfo = new ErrorDataInfo(null, null, 3, null);
                    boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4);
                    Object objY = bVarI.y();
                    if (z || objY == c0042a) {
                        objY = new Function0() { // from class: qdv
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(sevVar);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY);
                    }
                    w1i.a(0, tevVar.a(errorDataInfo, (Function0) objY), bVarI, false);
                } else if (i3 == 2) {
                    bVarI.N(57069);
                    Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                    wsv wsvVar = wsv.a;
                    tevVar.b(context);
                    bVarI.X(false);
                } else {
                    if (i3 != 3) {
                        throw igf0.a(bVarI, 138540767, false);
                    }
                    bVarI.N(265544);
                    boolean z2 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
                    Object objY2 = bVarI.y();
                    if (z2 || objY2 == c0042a) {
                        objY2 = new rdv(0, sevVar, function1);
                        bVarI.r(objY2);
                    }
                    zoh0.a(function0, function2, (Function0) objY2, bVarI, (i2 >> 9) & WebSocketProtocol.PAYLOAD_SHORT);
                    bVarI.X(false);
                }
            } else {
                bVarI.N(138564879);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(tevVar, function1, function0, function2, i) { // from class: sdv
                public final /* synthetic */ tev b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    tdv.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
