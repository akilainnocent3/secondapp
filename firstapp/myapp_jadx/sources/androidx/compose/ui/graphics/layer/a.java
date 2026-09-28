package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import defpackage.asr;
import defpackage.j58;
import defpackage.l58;
import defpackage.lc6;
import defpackage.m750;
import defpackage.mmd;
import defpackage.qlr;
import defpackage.tcf;
import defpackage.v6l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    public static final C0045a a = C0045a.a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.a$a, reason: collision with other inner class name */
    public static final class C0045a {
        public static final /* synthetic */ C0045a a = new C0045a();
        public static final C0046a b = C0046a.a;

        /* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.a$a$a, reason: collision with other inner class name */
        public static final class C0046a extends qlr implements Function1<tcf, Unit> {
            public static final C0046a a = new C0046a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(tcf tcfVar) {
                tcf.m0(tcfVar, j58.l, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                return Unit.a;
            }
        }
    }

    long A();

    void B(float f);

    long C();

    float D();

    Matrix E();

    int F();

    float G();

    void H(Outline outline, long j);

    void I(lc6 lc6Var);

    void J(long j);

    void K(mmd mmdVar, asr asrVar, v6l v6lVar, v6l.a aVar);

    float L();

    void M(int i);

    float N();

    float O();

    float a();

    void b(float f);

    void c(int i);

    m750 d();

    void e(m750 m750Var);

    void f(float f);

    void g();

    void h(long j);

    void i(int i, long j, int i2);

    void j();

    void k(float f);

    void l(boolean z);

    int m();

    void n(long j);

    l58 o();

    void p(float f);

    void q(float f);

    void r(float f);

    float s();

    void t(float f);

    void u(float f);

    void v(float f);

    default boolean w() {
        return true;
    }

    float x();

    float y();

    float z();
}
