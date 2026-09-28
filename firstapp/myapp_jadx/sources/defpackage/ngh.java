package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.featuredGames.model.FeaturedResponse;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ngh {
    public static final ngh a = new ngh();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        jgh jghVar;
        if (x1bVar instanceof jgh) {
            jghVar = (jgh) x1bVar;
            int i = jghVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jghVar.c = i - Integer.MIN_VALUE;
            } else {
                jghVar = new jgh(this, x1bVar);
            }
        } else {
            jghVar = new jgh(this, x1bVar);
        }
        Object objD = jghVar.a;
        y5b y5bVar = y5b.a;
        int i2 = jghVar.c;
        if (i2 == 0) {
            uj50.b(objD);
            leh value = leh.d.getValue();
            HTTPResponse<List<FeaturedResponse>> hTTPResponse = value.a("getFeatured") ? value.a : null;
            if (hTTPResponse != null) {
                return new ResultWrapper.Success(hTTPResponse);
            }
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            kgh kghVar = new kgh(str, null);
            jghVar.c = 1;
            objD = ej5.d(oddVar, new a52(kghVar, null), jghVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        ResultWrapper resultWrapper = (ResultWrapper) objD;
        try {
            if (!(resultWrapper instanceof ResultWrapper.Success)) {
                return resultWrapper;
            }
            leh value2 = leh.d.getValue();
            HTTPResponse<List<FeaturedResponse>> hTTPResponse2 = (HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue();
            value2.getClass();
            hTTPResponse2.getClass();
            if (!value2.a("getFeatured")) {
                value2.a = hTTPResponse2;
                value2.b = Long.valueOf(System.currentTimeMillis());
                value2.c = "getFeatured";
            }
            return resultWrapper;
        } catch (Exception e) {
            e.printStackTrace();
            return resultWrapper;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, x1b x1bVar) {
        lgh lghVar;
        if (x1bVar instanceof lgh) {
            lghVar = (lgh) x1bVar;
            int i = lghVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lghVar.c = i - Integer.MIN_VALUE;
            } else {
                lghVar = new lgh(this, x1bVar);
            }
        } else {
            lghVar = new lgh(this, x1bVar);
        }
        Object objD = lghVar.a;
        y5b y5bVar = y5b.a;
        int i2 = lghVar.c;
        if (i2 == 0) {
            uj50.b(objD);
            leh value = leh.d.getValue();
            HTTPResponse<List<FeaturedResponse>> hTTPResponse = value.a("getRanking") ? value.a : null;
            if (hTTPResponse != null) {
                return new ResultWrapper.Success(hTTPResponse);
            }
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            mgh mghVar = new mgh(str, null);
            lghVar.c = 1;
            objD = ej5.d(oddVar, new a52(mghVar, null), lghVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        ResultWrapper resultWrapper = (ResultWrapper) objD;
        try {
            if (!(resultWrapper instanceof ResultWrapper.Success)) {
                return resultWrapper;
            }
            leh value2 = leh.d.getValue();
            HTTPResponse<List<FeaturedResponse>> hTTPResponse2 = (HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue();
            value2.getClass();
            hTTPResponse2.getClass();
            if (!value2.a("getRanking")) {
                value2.a = hTTPResponse2;
                value2.b = Long.valueOf(System.currentTimeMillis());
                value2.c = "getRanking";
            }
            return resultWrapper;
        } catch (Exception e) {
            e.printStackTrace();
            return resultWrapper;
        }
    }
}
