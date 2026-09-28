package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.transaction.ui.txdetails.TxDetailsActivity;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxDetailsV2Activity;

/* JADX INFO: loaded from: classes6.dex */
public final class c1h0 {
    public static final d8b a = new d8b();
    public static final b b = new b();

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.NIGERIA.ordinal()] = 2;
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
            try {
                iArr[CountryCodeName.KENYA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public static final class b extends vd<a3h0, p5h0> {
        @Override // defpackage.vd
        public final Intent a(Object obj, Context context) {
            a3h0 a3h0Var = (a3h0) obj;
            a3h0Var.getClass();
            d8b d8bVar = c1h0.a;
            return c1h0.a(0, context, a3h0Var.a);
        }

        @Override // defpackage.vd
        public final Object c(Intent intent, int i) {
            if (i == 1) {
                return new p5h0.c(intent != null ? intent.getStringExtra("EXTRA_TRADE_ID") : null, intent != null ? Integer.valueOf(intent.getIntExtra("EXTRA_FINAL_STATUS", 0)) : null, intent != null ? Integer.valueOf(intent.getIntExtra("EXTRA_AMOUNT_SIGN", 0)) : null);
            }
            return p5h0.a.a;
        }
    }

    public static Intent a(int i, Context context, String str) {
        context.getClass();
        int i2 = a.a[a.a().getCountryCode().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            int i3 = TxDetailsV2Activity.v;
            Intent intent = new Intent(context, (Class<?>) TxDetailsV2Activity.class);
            intent.putExtra("data", str);
            intent.putExtra("isHistory", i);
            return new Intent(intent);
        }
        int i4 = TxDetailsActivity.D0;
        Intent intent2 = new Intent(context, (Class<?>) TxDetailsActivity.class);
        intent2.putExtra("data", str);
        intent2.putExtra("isHistory", i);
        return new Intent(intent2);
    }
}
