package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class o {
    public static byte[] a(ProductInfo productInfo) {
        String currencyCode;
        int i10;
        z zVar = new z();
        zVar.f95095a = productInfo.quantity;
        zVar.f95100f = productInfo.priceMicros;
        try {
            currencyCode = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
            currencyCode = "";
        }
        Charset charset = cv.g.f77202b;
        zVar.f95096b = currencyCode.getBytes(charset);
        zVar.f95097c = productInfo.sku.getBytes(charset);
        u uVar = new u();
        uVar.f95061a = productInfo.purchaseOriginalJson.getBytes(charset);
        uVar.f95062b = productInfo.signature.getBytes(charset);
        zVar.f95099e = uVar;
        int i11 = 1;
        zVar.f95101g = true;
        zVar.f95102h = 1;
        int i12 = n.f95048a[productInfo.type.ordinal()];
        zVar.f95103i = (i12 == 1 || i12 != 2) ? 1 : 2;
        y yVar = new y();
        yVar.f95084a = productInfo.purchaseToken.getBytes(charset);
        yVar.f95085b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        zVar.f95104j = yVar;
        if (productInfo.type == ProductType.SUBS) {
            x xVar = new x();
            xVar.f95077a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                w wVar = new w();
                wVar.f95074a = period.number;
                int i13 = n.f95049b[period.timeUnit.ordinal()];
                if (i13 == 1) {
                    i10 = 1;
                } else if (i13 == 2) {
                    i10 = 2;
                } else if (i13 != 3) {
                    i10 = i13 != 4 ? 0 : 4;
                } else {
                    i10 = 3;
                }
                wVar.f95075b = i10;
                xVar.f95078b = wVar;
            }
            v vVar = new v();
            vVar.f95064a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                w wVar2 = new w();
                wVar2.f95074a = period2.number;
                int i14 = n.f95049b[period2.timeUnit.ordinal()];
                if (i14 != 1) {
                    if (i14 == 2) {
                        i11 = 2;
                    } else if (i14 != 3) {
                        i11 = i14 != 4 ? 0 : 4;
                    } else {
                        i11 = 3;
                    }
                }
                wVar2.f95075b = i11;
                vVar.f95065b = wVar2;
            }
            vVar.f95066c = productInfo.introductoryPriceCycles;
            xVar.f95079c = vVar;
            zVar.f95105k = xVar;
        }
        return MessageNano.toByteArray(zVar);
    }
}
