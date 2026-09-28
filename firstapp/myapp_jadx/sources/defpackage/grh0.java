package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class grh0 {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static qpp a(mpp mppVar) {
        qpp.a aVarY = qpp.y();
        int iA = mppVar.A();
        aVarY.e();
        ((qpp) aVarY.b).z(iA);
        for (mpp.b bVar : mppVar.z()) {
            qpp.b.a aVarX = qpp.b.x();
            String strY = bVar.w().y();
            aVarX.e();
            ((qpp.b) aVarX.b).B(strY);
            zmp zmpVarZ = bVar.z();
            aVarX.e();
            ((qpp.b) aVarX.b).A(zmpVarZ);
            uaz uazVarY = bVar.y();
            aVarX.e();
            ((qpp.b) aVarX.b).z(uazVarY);
            int iX = bVar.x();
            aVarX.e();
            ((qpp.b) aVarX.b).y(iX);
            qpp.b bVarB = aVarX.b();
            aVarY.e();
            qpp qppVar = (qpp) aVarY.b;
            int i = qpp.PRIMARY_KEY_ID_FIELD_NUMBER;
            qppVar.w(bVarB);
        }
        return aVarY.b();
    }
}
