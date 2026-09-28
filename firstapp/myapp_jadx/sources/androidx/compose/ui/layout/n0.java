package androidx.compose.ui.layout;

import defpackage.msw;
import defpackage.r160;
import defpackage.uk40;
import defpackage.zx;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    public static final msw a;
    public static final l0[] b;
    public static final msw<l0> c;

    static {
        msw mswVar = new msw(8);
        l0.a.getClass();
        m0 m0Var = l0.a.g;
        mswVar.h(1, m0Var);
        m0 m0Var2 = l0.a.f;
        mswVar.h(2, m0Var2);
        m0 m0Var3 = l0.a.b;
        mswVar.h(4, m0Var3);
        m0 m0Var4 = l0.a.d;
        mswVar.h(8, m0Var4);
        m0 m0Var5 = l0.a.h;
        mswVar.h(16, m0Var5);
        m0 m0Var6 = l0.a.e;
        mswVar.h(32, m0Var6);
        m0 m0Var7 = l0.a.i;
        mswVar.h(64, m0Var7);
        a = mswVar;
        b = new l0[]{m0Var, m0Var2, m0Var3, m0Var7, m0Var5, m0Var6, m0Var4, l0.a.j, l0.a.c};
        msw<l0> mswVar2 = new msw<>(7);
        mswVar2.h(1, m0Var);
        mswVar2.h(2, m0Var2);
        mswVar2.h(4, m0Var3);
        mswVar2.h(16, m0Var5);
        mswVar2.h(64, m0Var7);
        mswVar2.h(32, m0Var6);
        mswVar2.h(8, m0Var4);
        c = mswVar2;
    }

    public static final androidx.compose.ui.d a(g gVar) {
        return new RulerProviderModifierElement(gVar);
    }

    public static final void b(r160 r160Var, uk40 uk40Var, long j, int i, int i2) {
        if (zx.a(j, -1L)) {
            return;
        }
        float f = (int) ((j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        float f2 = (int) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        float f3 = i - ((int) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        float f4 = i2 - ((int) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        r160Var.F0(uk40Var.a(), f);
        r160Var.F0(uk40Var.b(), f2);
        r160Var.F0(uk40Var.d(), f3);
        r160Var.F0(uk40Var.c(), f4);
    }
}
