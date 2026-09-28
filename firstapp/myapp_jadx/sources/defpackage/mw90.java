package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class mw90 {
    public static final void a(Object obj, String str, d dVar, Function1 function1, n54 n54Var, d0b d0bVar, gf4 gf4Var, a aVar, int i, int i2) {
        d dVar2 = (i2 & 4) != 0 ? d.a.b : dVar;
        Function1 function2 = (i2 & 16) != 0 ? null : function1;
        n54 n54Var2 = (i2 & 32) != 0 ? ht.a.e : n54Var;
        d0b d0bVar2 = (i2 & 64) != 0 ? d0b.a.b : d0bVar;
        gf4 gf4Var2 = (i2 & 256) != 0 ? null : gf4Var;
        m9n m9nVarA = qw90.a((Context) aVar.O(AndroidCompositionLocals_androidKt.b));
        int i3 = i << 3;
        int i4 = (i & WebSocketProtocol.PAYLOAD_SHORT) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192);
        int i5 = i4 >> 3;
        yz0.a(new g01(obj, (zz0) aVar.O(cdt.a), m9nVarA), str, dVar2, b01.L, function2, n54Var2, d0bVar2, 1.0f, gf4Var2, 1, true, aVar, (i4 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
    }

    public static final void b(Object obj, String str, d dVar, crz crzVar, crz crzVar2, crz crzVar3, Function1 function1, Function1 function2, d0b d0bVar, float f, gf4 gf4Var, a aVar, int i, int i2, int i3) {
        crz crzVar4 = (i3 & 8) != 0 ? null : crzVar;
        crz crzVar5 = (i3 & 16) != 0 ? null : crzVar2;
        crz crzVar6 = (i3 & 32) != 0 ? crzVar5 : crzVar3;
        Function1 function3 = (i3 & 128) != 0 ? null : function1;
        Function1 function4 = (i3 & 256) != 0 ? null : function2;
        d0b d0bVar2 = (i3 & 1024) != 0 ? d0b.a.b : d0bVar;
        float f2 = (i3 & 2048) != 0 ? 1.0f : f;
        gf4 gf4Var2 = (i3 & 4096) != 0 ? null : gf4Var;
        m9n m9nVarA = qw90.a((Context) aVar.O(AndroidCompositionLocals_androidKt.b));
        int i4 = i << 3;
        int i5 = (i & WebSocketProtocol.PAYLOAD_SHORT) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192);
        int i6 = i2 << 3;
        yz0.b(obj, str, m9nVarA, dVar, crzVar4, crzVar5, crzVar6, function3, function4, ht.a.e, d0bVar2, f2, gf4Var2, aVar, i5, ((i >> 27) & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752), 0);
    }
}
