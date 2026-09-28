package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class aqg0 {
    public final int a;
    public final ResourceUiText b;

    public static final class a extends aqg0 {
        public static final a c = new a(0, new ResourceUiText(R.string.page_transaction__all_categories));
    }

    public static final class b extends aqg0 {
        public static final b c = new b(3, new ResourceUiText(R.string.page_transaction__bets));
    }

    public static final class c {

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
                a = iArr;
            }
        }

        public static ngs a(psm psmVar) {
            psmVar.getClass();
            ngs ngsVarB = kotlin.collections.a.b();
            ngsVarB.add(a.c);
            ngsVarB.add(e.c);
            ngsVarB.add(j.c);
            ngsVarB.add(b.c);
            ngsVarB.add(g.c);
            ngsVarB.add(f.c);
            int i = a.a[psmVar.getCountryCode().ordinal()];
            if (i == 1) {
                ngsVarB.add(h.c);
            } else if (i == 2) {
                ngsVarB.add(d.c);
                ngsVarB.add(i.c);
            }
            return kotlin.collections.a.a(ngsVarB);
        }
    }

    public static final class d extends aqg0 {
        public static final d c = new d(9, new ResourceUiText(R.string.page_transaction__deposit_tax));
    }

    public static final class e extends aqg0 {
        public static final e c = new e(1, new ResourceUiText(R.string.page_transaction__deposits));
    }

    public static final class f extends aqg0 {
        public static final f c = new f(5, new ResourceUiText(R.string.page_transaction__refunds));
    }

    public static final class g extends aqg0 {
        public static final g c = new g(4, new ResourceUiText(R.string.page_transaction__winnings));
    }

    public static final class h extends aqg0 {
        public static final h c = new h(8, new ResourceUiText(R.string.page_transaction__withholding_tax));
    }

    public static final class i extends aqg0 {
        public static final i c = new i(10, new ResourceUiText(R.string.page_transaction__withdrawal_tax));
    }

    public static final class j extends aqg0 {
        public static final j c = new j(2, new ResourceUiText(R.string.page_transaction__withdrawals));
    }

    public aqg0(int i2, ResourceUiText resourceUiText) {
        this.a = i2;
        this.b = resourceUiText;
    }
}
