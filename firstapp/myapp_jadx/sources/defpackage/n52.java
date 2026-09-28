package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprDataThrowable;
import com.sporty.android.common.network.data.SprThrowable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class n52 {
    public static final /* synthetic */ int a = 0;

    public static final ytw a(psw pswVar, a aVar, int i) {
        Object objY = aVar.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (objY == c0042a) {
            objY = m.b(Boolean.FALSE);
            aVar.r(objY);
        }
        ytw ytwVar = (ytw) objY;
        boolean z = (((i & 14) ^ 6) > 4 && aVar.M(pswVar)) || (i & 6) == 4;
        Object objY2 = aVar.y();
        if (z || objY2 == c0042a) {
            objY2 = new np20(pswVar, ytwVar, null);
            aVar.r(objY2);
        }
        xvf.e(aVar, pswVar, (Function2) objY2);
        return ytwVar;
    }

    public static final Object b(BaseResponse baseResponse) throws SprThrowable {
        baseResponse.getClass();
        if (baseResponse.hasData()) {
            return baseResponse.data;
        }
        int i = baseResponse.bizCode;
        String str = baseResponse.message;
        if (str == null) {
            str = "";
        }
        throw new SprThrowable(i, str, baseResponse.data == 0);
    }

    public static final void c(BaseResponse baseResponse) throws SprThrowable {
        baseResponse.getClass();
        if (baseResponse.isSuccessful()) {
            return;
        }
        int i = baseResponse.bizCode;
        String str = baseResponse.message;
        if (str == null) {
            str = "";
        }
        throw new SprThrowable(i, str, baseResponse.data == 0);
    }

    public static final Object d(BaseResponse baseResponse) throws SprDataThrowable {
        T t;
        baseResponse.getClass();
        if (baseResponse.isSuccessful() && (t = baseResponse.data) != 0) {
            return t;
        }
        int i = baseResponse.bizCode;
        String str = baseResponse.message;
        if (str == null) {
            str = "";
        }
        throw new SprDataThrowable(baseResponse.data, str, i);
    }
}
