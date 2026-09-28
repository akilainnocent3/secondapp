package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leej;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class eej extends j8i0 {
    public static final /* synthetic */ ohp<Object>[] B = {new otw(0, eej.class, "state", "getState()Lcom/sporty/android/compose/ui/password/PasswordState;")};
    public String A;
    public final ou40 a;
    public final idj b;
    public final psm c;
    public final lyz d;
    public final a990 e;
    public final rdd0 f;
    public final edj i;
    public final v340 v;
    public final vwd0 w;
    public final ku90<ycj> y;
    public final ku90 z;

    public eej(ou40 ou40Var, idj idjVar, psm psmVar, lyz lyzVar, a990 a990Var, rdd0 rdd0Var) {
        ou40Var.getClass();
        psmVar.getClass();
        lyzVar.getClass();
        a990Var.getClass();
        rdd0Var.getClass();
        this.a = ou40Var;
        this.b = idjVar;
        this.c = psmVar;
        this.d = lyzVar;
        this.e = a990Var;
        this.f = rdd0Var;
        this.i = new edj();
        vwd0 vwd0Var = new vwd0(new awz(7, idjVar.a()));
        this.v = vwd0Var.b;
        this.w = vwd0Var;
        ku90<ycj> ku90Var = new ku90<>();
        this.y = ku90Var;
        this.z = ku90Var;
        this.A = "";
    }

    public final awz x1() {
        return (awz) this.w.a(this, B[0]);
    }

    public final void y1(Throwable th) {
        UiText stringUiText;
        String e;
        if (!(th instanceof SprThrowable)) {
            th = null;
        }
        SprThrowable sprThrowable = (SprThrowable) th;
        if (sprThrowable == null || (e = sprThrowable.getE()) == null) {
            stringUiText = vch0.b;
        } else {
            StringUiText stringUiText2 = vch0.a;
            stringUiText = new StringUiText(e);
        }
        z1(awz.a(x1(), null, null, new wh80.a(stringUiText), null, 11));
    }

    public final void z1(awz awzVar) {
        this.w.b(this, B[0], awzVar);
    }
}
