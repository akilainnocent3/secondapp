package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class rpp {
    public final mpp.a a;

    public rpp(mpp.a aVar) {
        this.a = aVar;
    }

    @Deprecated
    public final synchronized void a(bnp bnpVar) {
        mpp.b bVarB;
        synchronized (this) {
            bVarB = b(y050.e(bnpVar), bnpVar.x());
        }
        mpp.a aVar = this.a;
        aVar.e();
        mpp mppVar = (mpp) aVar.b;
        int i = mpp.PRIMARY_KEY_ID_FIELD_NUMBER;
        mppVar.w(bVarB);
    }

    public final synchronized mpp.b b(bmp bmpVar, uaz uazVar) {
        int iA;
        synchronized (this) {
            iA = hrh0.a();
            while (d(iA)) {
                iA = hrh0.a();
            }
        }
        return aVarB.b();
        if (uazVar == uaz.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        mpp.b.a aVarB = mpp.b.B();
        aVarB.e();
        ((mpp.b) aVarB.b).C(bmpVar);
        aVarB.e();
        ((mpp.b) aVarB.b).D(iA);
        aVarB.e();
        ((mpp.b) aVarB.b).F();
        aVarB.e();
        ((mpp.b) aVarB.b).E(uazVar);
        return aVarB.b();
    }

    public final synchronized ppp c() {
        return ppp.a(this.a.b());
    }

    public final synchronized boolean d(int i) {
        Iterator it = Collections.unmodifiableList(((mpp) this.a.b).z()).iterator();
        while (it.hasNext()) {
            if (((mpp.b) it.next()).x() == i) {
                return true;
            }
        }
        return false;
    }
}
