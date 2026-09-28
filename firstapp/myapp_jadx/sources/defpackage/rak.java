package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;

/* JADX INFO: loaded from: classes6.dex */
public final class rak {
    public final sr10 a;
    public final psm b;
    public final c4k c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.KENYA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountryCodeName.TANZANIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CountryCodeName.ZAMBIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[log0.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                log0 log0Var = log0.a;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public rak(sr10 sr10Var, psm psmVar, c4k c4kVar) {
        sr10Var.getClass();
        psmVar.getClass();
        this.a = sr10Var;
        this.b = psmVar;
        this.c = c4kVar;
    }

    public final lyh<lk50<sr00>> a(log0 log0Var, String str) {
        g1i g1iVarW;
        log0Var.getClass();
        psm psmVar = this.b;
        int i = a.a[psmVar.getCountryCode().ordinal()];
        if (i == 1 || i == 2) {
            return bm50.a(new or60(new sak(str, this, log0Var, null)));
        }
        sr10 sr10Var = this.a;
        if (i != 3) {
            if (i == 4) {
                return new wl50(sr10Var.g(pu0.b.a), new qak(0));
            }
            hoc.a(psmVar.getCountryCode(), "Unsupported country code: ");
            return null;
        }
        int iOrdinal = log0Var.ordinal();
        if (iOrdinal == 0) {
            g1iVarW = sr10Var.W(pu0.b.a);
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return null;
            }
            g1iVarW = sr10Var.h(pu0.b.a);
        }
        return bm50.a(new uak(new tak(new sl50(g1iVarW), this, log0Var)));
    }
}
