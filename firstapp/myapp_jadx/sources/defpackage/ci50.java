package defpackage;

import androidx.compose.runtime.a;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.text.Charsets;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class ci50 {
    public static final /* synthetic */ int a = 0;

    public static final String a(ResponseBody responseBody) {
        if (responseBody == null) {
            return null;
        }
        try {
            cc5 d = responseBody.getD();
            d.request(Long.MAX_VALUE);
            return d.e().g().i1(Charsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final void b(b8l b8lVar, kwh0 kwh0Var) {
        List<mwh0> list = kwh0Var.y;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mwh0 mwh0Var = list.get(i);
            if (mwh0Var instanceof owh0) {
                gxz gxzVar = new gxz();
                owh0 owh0Var = (owh0) mwh0Var;
                gxzVar.d = owh0Var.b;
                gxzVar.n = true;
                gxzVar.c();
                gxzVar.s.h(owh0Var.c);
                gxzVar.c();
                gxzVar.c();
                gxzVar.b = owh0Var.d;
                gxzVar.c();
                gxzVar.c = owh0Var.e;
                gxzVar.c();
                gxzVar.g = owh0Var.f;
                gxzVar.c();
                gxzVar.e = owh0Var.i;
                gxzVar.c();
                gxzVar.f = owh0Var.v;
                gxzVar.o = true;
                gxzVar.c();
                gxzVar.h = owh0Var.w;
                gxzVar.o = true;
                gxzVar.c();
                gxzVar.i = owh0Var.y;
                gxzVar.o = true;
                gxzVar.c();
                gxzVar.j = owh0Var.z;
                gxzVar.o = true;
                gxzVar.c();
                gxzVar.k = owh0Var.A;
                gxzVar.p = true;
                gxzVar.c();
                gxzVar.l = owh0Var.B;
                gxzVar.p = true;
                gxzVar.c();
                gxzVar.m = owh0Var.C;
                gxzVar.p = true;
                gxzVar.c();
                b8lVar.e(i, gxzVar);
            } else if (mwh0Var instanceof kwh0) {
                b8l b8lVar2 = new b8l();
                kwh0 kwh0Var2 = (kwh0) mwh0Var;
                b8lVar2.k = kwh0Var2.a;
                b8lVar2.c();
                b8lVar2.l = kwh0Var2.b;
                b8lVar2.s = true;
                b8lVar2.c();
                b8lVar2.o = kwh0Var2.e;
                b8lVar2.s = true;
                b8lVar2.c();
                b8lVar2.p = kwh0Var2.f;
                b8lVar2.s = true;
                b8lVar2.c();
                b8lVar2.q = kwh0Var2.i;
                b8lVar2.s = true;
                b8lVar2.c();
                b8lVar2.r = kwh0Var2.v;
                b8lVar2.s = true;
                b8lVar2.c();
                b8lVar2.m = kwh0Var2.c;
                b8lVar2.s = true;
                b8lVar2.c();
                b8lVar2.n = kwh0Var2.d;
                b8lVar2.s = true;
                b8lVar2.c();
                b8lVar2.f = kwh0Var2.w;
                b8lVar2.g = true;
                b8lVar2.c();
                b(b8lVar2, kwh0Var2);
                b8lVar.e(i, b8lVar2);
            }
        }
    }

    public static final nwh0 c(rbn rbnVar, a aVar) {
        mmd mmdVar = (mmd) aVar.O(kna.h);
        boolean zE = aVar.e((((long) Float.floatToRawIntBits(mmdVar.getDensity())) & 4294967295L) | (((long) Float.floatToRawIntBits(rbnVar.j)) << 32));
        Object objY = aVar.y();
        if (zE || objY == a.C0041a.a) {
            b8l b8lVar = new b8l();
            b(b8lVar, rbnVar.f);
            Unit unit = Unit.a;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(mmdVar.C1(rbnVar.b))) << 32) | (((long) Float.floatToRawIntBits(mmdVar.C1(rbnVar.c))) & 4294967295L);
            float fIntBitsToFloat = rbnVar.d;
            float fIntBitsToFloat2 = rbnVar.e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            nwh0 nwh0Var = new nwh0(b8lVar);
            String str = rbnVar.a;
            long j = rbnVar.g;
            gf4 gf4Var = j != 16 ? new gf4(j, rbnVar.h) : null;
            boolean z = rbnVar.i;
            ((x5a0) nwh0Var.f).setValue(new yw90(jFloatToRawIntBits));
            ((x5a0) nwh0Var.i).setValue(Boolean.valueOf(z));
            uvh0 uvh0Var = nwh0Var.v;
            ((x5a0) uvh0Var.g).setValue(gf4Var);
            ((x5a0) uvh0Var.i).setValue(new yw90(jFloatToRawIntBits2));
            uvh0Var.c = str;
            aVar.r(nwh0Var);
            objY = nwh0Var;
        }
        return (nwh0) objY;
    }
}
