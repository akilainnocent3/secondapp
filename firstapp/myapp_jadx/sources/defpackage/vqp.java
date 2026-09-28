package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class vqp extends gnp<sqp> {

    public class a extends gnp.a<tqp, sqp> {
        @Override // gnp.a
        public final wnv a(wnv wnvVar) {
            sqp.a aVarY = sqp.y();
            aVarY.e();
            ((sqp) aVarY.b).A((tqp) wnvVar);
            aVarY.e();
            ((sqp) aVarY.b).B();
            return aVarY.b();
        }

        @Override // gnp.a
        public final wnv c(ql5 ql5Var) {
            return tqp.z(ql5Var, r3h.a());
        }

        @Override // gnp.a
        public final void d(wnv wnvVar) throws GeneralSecurityException {
            tqp tqpVar = (tqp) wnvVar;
            if (tqpVar.x().isEmpty() || !tqpVar.y()) {
                opp.a("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    @Override // defpackage.gnp
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // defpackage.gnp
    public final gnp.a<tqp, sqp> c() {
        return new a(tqp.class);
    }

    @Override // defpackage.gnp
    public final bmp.b d() {
        return bmp.b.REMOTE;
    }

    @Override // defpackage.gnp
    public final wnv e(ql5 ql5Var) {
        return sqp.z(ql5Var, r3h.a());
    }

    @Override // defpackage.gnp
    public final void f(wnv wnvVar) throws GeneralSecurityException {
        quh0.c(((sqp) wnvVar).x());
    }
}
