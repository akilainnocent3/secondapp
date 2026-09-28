package defpackage;

import android.app.Application;
import android.content.Intent;
import com.sporty.android.core.model.captcha.CaptchaProvider;
import com.sporty.android.platform.features.captcha.inhouseCaptcha.CaptchaInHouseActivity;
import com.sporty.android.platform.features.captcha.model.CaptchaError;

/* JADX INFO: loaded from: classes5.dex */
public final class tdn implements pdn {
    public final Application a;
    public final ssw<pdn.a> b;
    public final ssw c;
    public final int d;

    public tdn(Application application) {
        this.a = application;
        ssw<pdn.a> sswVar = new ssw<>(pdn.a.d.a);
        this.b = sswVar;
        this.c = sswVar;
        this.d = CaptchaProvider.InHouse.getId();
    }

    @Override // defpackage.pdn
    public final void a(pdn.a aVar) {
        ssw<pdn.a> sswVar = this.b;
        pdn.a aVarD = sswVar.d();
        if (aVarD != null) {
            if ((aVarD instanceof pdn.a.C0968a) || aVarD.getId() == aVar.getId()) {
                aVarD = null;
            }
            if (aVarD != null) {
                sswVar.m(new pdn.a.C0968a(aVarD.getId()));
            }
        }
        sswVar.m(aVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [rdn] */
    @Override // defpackage.jd6
    public final ct90<String> b(final String str, j6c j6cVar) {
        j6cVar.getClass();
        final int iHashCode = new Object().hashCode();
        return new du90(new au90(new bv90() { // from class: qdn
            /* JADX WARN: Type inference failed for: r1v0, types: [T, lfy, sdn] */
            @Override // defpackage.bv90
            public final void a(final au90.a aVar) {
                final dq40 dq40Var = new dq40();
                final int i = iHashCode;
                final tdn tdnVar = this.a;
                ?? r1 = new lfy() { // from class: sdn
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        pdn.a aVar2 = (pdn.a) obj;
                        aVar2.getClass();
                        if (aVar2.getId() == i && !(aVar2 instanceof pdn.a.c)) {
                            boolean z = aVar2 instanceof pdn.a.e;
                            au90.a aVar3 = aVar;
                            if (z) {
                                iu90.a(aVar3, ((pdn.a.e) aVar2).b);
                            } else if (aVar2 instanceof pdn.a.C0968a) {
                                iu90.b(aVar3, new CaptchaError.CaptchaSDKCancel());
                            } else if (aVar2 instanceof pdn.a.b) {
                                iu90.b(aVar3, new CaptchaError.CaptchaSDKFailure(((pdn.a.b) aVar2).b));
                            } else {
                                iu90.b(aVar3, new CaptchaError.CaptchaSDKFailure(null, 1, null));
                            }
                            lfy lfyVar = (lfy) dq40Var.a;
                            if (lfyVar != null) {
                                tdnVar.c.k(lfyVar);
                            }
                        }
                    }
                };
                dq40Var.a = r1;
                tdnVar.c.g(r1);
                int i2 = CaptchaInHouseActivity.b;
                Application application = tdnVar.a;
                Intent intent = new Intent(application, (Class<?>) CaptchaInHouseActivity.class);
                intent.putExtra("key - id", i);
                intent.putExtra("key - site key", str);
                intent.addFlags(268435456);
                application.startActivity(intent);
            }
        }), new ib() { // from class: rdn
            @Override // defpackage.ib
            public final void run() {
                this.a.b.j(new pdn.a.C0968a(iHashCode));
            }
        }).d(va0.a());
    }

    @Override // defpackage.jd6
    public final ct90<Boolean> c(String str) {
        return new qu90(Boolean.TRUE);
    }

    @Override // defpackage.jd6
    public final int d() {
        return this.d;
    }

    @Override // defpackage.pdn
    public final ssw getStatus() {
        return this.c;
    }
}
