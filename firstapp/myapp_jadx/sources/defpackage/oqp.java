package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class oqp extends gnp<lqp> {

    public class a extends gnp.a<mqp, lqp> {
        @Override // gnp.a
        public final wnv a(wnv wnvVar) {
            lqp.a aVarY = lqp.y();
            aVarY.e();
            ((lqp) aVarY.b).A((mqp) wnvVar);
            aVarY.e();
            ((lqp) aVarY.b).B();
            return aVarY.b();
        }

        @Override // gnp.a
        public final wnv c(ql5 ql5Var) {
            return mqp.x(ql5Var, r3h.a());
        }

        @Override // gnp.a
        public final void d(wnv wnvVar) {
        }
    }

    @Override // defpackage.gnp
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // defpackage.gnp
    public final gnp.a<mqp, lqp> c() {
        return new a(mqp.class);
    }

    @Override // defpackage.gnp
    public final bmp.b d() {
        return bmp.b.REMOTE;
    }

    @Override // defpackage.gnp
    public final wnv e(ql5 ql5Var) {
        return lqp.z(ql5Var, r3h.a());
    }

    @Override // defpackage.gnp
    public final void f(wnv wnvVar) throws GeneralSecurityException {
        quh0.c(((lqp) wnvVar).x());
    }
}
