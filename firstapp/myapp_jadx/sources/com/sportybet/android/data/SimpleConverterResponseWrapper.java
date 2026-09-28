package com.sportybet.android.data;

import com.sporty.android.core.model.MyLog;
import defpackage.bcp;
import defpackage.c8b;
import defpackage.eal;
import defpackage.hwr;
import defpackage.itf0;
import defpackage.psm;
import defpackage.qva;
import defpackage.tcp;
import defpackage.xdp;

/* JADX INFO: loaded from: classes5.dex */
public abstract class SimpleConverterResponseWrapper<T, Y> extends SimpleResponseWrapper<T> {
    private static final psm countryManager = (psm) hwr.b(new c8b(0)).getValue();

    private bcp configsConvert(xdp xdpVar) {
        return (bcp) xdpVar.a.get("commonConfigDtos");
    }

    public abstract Y convert(bcp bcpVar);

    public abstract String getIdentifier();

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(T t) {
        Exception e;
        tcp tcpVarC;
        super.onSuccess(t);
        try {
            tcpVarC = qva.c(new eal().j(t));
            try {
                Y yConvert = countryManager.r() ? convert(configsConvert(tcpVarC.d())) : convert(tcpVarC.c());
                if (yConvert != null) {
                    onSuccessData(yConvert);
                } else {
                    onFailure(null);
                }
            } catch (Exception e2) {
                e = e2;
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_CONFIG);
                aVar.n("Failed to convert config value %s", tcpVarC);
                onFailure(e);
            }
        } catch (Exception e3) {
            e = e3;
            tcpVarC = null;
        }
    }

    public void onSuccessData(Y y) {
    }
}
