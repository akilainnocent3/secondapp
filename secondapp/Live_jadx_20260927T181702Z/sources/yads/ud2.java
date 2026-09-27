package yads;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdInfo;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ud2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f156365a;

    public ud2(Context context) {
        this.f156365a = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j10, or.f fVar) {
        pd2 pd2Var;
        String id2;
        if (fVar instanceof pd2) {
            pd2Var = (pd2) fVar;
            int i10 = pd2Var.f153897d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pd2Var.f153897d = i10 - Integer.MIN_VALUE;
            } else {
                pd2Var = new pd2(this, fVar);
            }
        } else {
            pd2Var = new pd2(this, fVar);
        }
        Object objE = pd2Var.f153895b;
        Object objL = qr.d.l();
        int i11 = pd2Var.f153897d;
        try {
            if (i11 == 0) {
                dr.j1.n(objE);
                sd2 sd2Var = new sd2(this, null);
                pd2Var.f153897d = 1;
                objE = jv.a4.e(j10, sd2Var, pd2Var);
                if (objE == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dr.j1.n(objE);
            }
            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) objE;
            if (appSetIdInfo == null || (id2 = appSetIdInfo.getId()) == null || cv.p0.O3(id2)) {
                return null;
            }
            return id2;
        } catch (Throwable unused) {
        }
    }
}
