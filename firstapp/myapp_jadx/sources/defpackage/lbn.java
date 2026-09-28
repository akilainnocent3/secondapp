package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.a;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.roulette.activities.RouletteActivity;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public final class lbn implements fbn {
    public final hbn<Drawable> a = new hbn<>();

    public static xa50 g() {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = a.d(SportyGamesManager.getApplicationContext());
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        return (xa50) bVar;
    }

    @Override // defpackage.fbn
    public final void a(String str, ImageView imageView) {
        f(str, imageView, null, true);
    }

    @Override // defpackage.fbn
    public final void b(String str, ImageView imageView) {
        f(str, imageView, null, false);
    }

    @Override // defpackage.fbn
    public final void c(RouletteActivity.n nVar) {
        xa50 xa50VarG;
        ea50<File> ea50VarL;
        ea50<File> ea50VarP;
        hre.c cVar;
        ea50 ea50VarE;
        ea50 ea50VarE2;
        ea50 ea50VarG;
        ea50 ea50VarF;
        if (TextUtils.isEmpty("https://s.sporty.net/common/main/res/1cac8bf402a85e71933daef28ec04050.png") || (xa50VarG = g()) == null || (ea50VarL = xa50VarG.l()) == null || (ea50VarP = ea50VarL.P("https://s.sporty.net/common/main/res/1cac8bf402a85e71933daef28ec04050.png")) == null || (ea50VarE = ea50VarP.e((cVar = hre.c))) == null || (ea50VarE2 = ea50VarE.e(cVar)) == null || (ea50VarG = ea50VarE2.g()) == null || (ea50VarF = ea50VarG.f()) == null) {
            return;
        }
        ea50VarF.L(new kbn(nVar), null, ea50VarF, fug.a);
    }

    @Override // defpackage.fbn
    public final void d(String str, ImageView imageView, RouletteActivity.o oVar) {
        f(str, imageView, oVar, true);
    }

    @Override // defpackage.fbn
    public final void e(String str) {
        xa50 xa50VarG;
        ea50<Bitmap> ea50VarK;
        ea50<Bitmap> ea50VarP;
        ea50<Bitmap> ea50VarN;
        ea50 ea50VarE;
        if (TextUtils.isEmpty(str) || (xa50VarG = g()) == null || (ea50VarK = xa50VarG.k()) == null || (ea50VarP = ea50VarK.P(str)) == null || (ea50VarN = ea50VarP.N(ebd0.a)) == null || (ea50VarE = ea50VarN.e(hre.c)) == null) {
            return;
        }
        ea50VarE.L(new uo20(ea50VarE.M), null, ea50VarE, fug.a);
    }

    public final void f(String str, ImageView imageView, RouletteActivity.o oVar, boolean z) {
        ea50<Drawable> ea50VarP;
        ea50 ea50VarE;
        ea50 ea50VarO;
        ea50 ea50VarH;
        ea50 ea50VarG;
        ea50 ea50VarN;
        ea50<Drawable> ea50VarP2;
        ea50 ea50VarE2;
        ea50 ea50VarO2;
        ea50 ea50VarH2;
        ea50 ea50VarG2;
        ea50 ea50VarN2;
        hbn<Drawable> hbnVar = oVar;
        if (imageView == null) {
            return;
        }
        if (oVar == null) {
            hbnVar = this.a;
        }
        if (z) {
            xa50 xa50VarG = g();
            if (xa50VarG == null || (ea50VarP2 = xa50VarG.p(str)) == null || (ea50VarE2 = ea50VarP2.e(hre.c)) == null || (ea50VarO2 = ea50VarE2.o(0)) == null || (ea50VarH2 = ea50VarO2.h(0)) == null || (ea50VarG2 = ea50VarH2.g()) == null || (ea50VarN2 = ea50VarG2.N(hbnVar)) == null) {
                return;
            }
            ea50VarN2.M(imageView);
            return;
        }
        xa50 xa50VarG2 = g();
        if (xa50VarG2 == null || (ea50VarP = xa50VarG2.p(str)) == null || (ea50VarE = ea50VarP.e(hre.c)) == null || (ea50VarO = ea50VarE.o(0)) == null || (ea50VarH = ea50VarO.h(0)) == null || (ea50VarG = ea50VarH.g()) == null || (ea50VarN = ea50VarG.N(hbnVar)) == null) {
            return;
        }
        ea50VarN.j().M(imageView);
    }
}
