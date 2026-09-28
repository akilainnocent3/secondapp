package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RemoteViews;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class jbn implements gbn {
    public final ibn<Bitmap> a = new ibn<>();
    public final ibn<Drawable> b = new ibn<>();
    public final ibn<File> c = new ibn<>();

    public static xa50 k() {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = com.bumptech.glide.a.d(hp0.A);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        return (xa50) bVar;
    }

    @Override // defpackage.gbn
    public final void a(String str, ImageView imageView) {
        j(str, imageView, 0, 0, true);
    }

    @Override // defpackage.gbn
    public final void b(String str, ImageView imageView) {
        j(str, imageView, 0, 0, false);
    }

    @Override // defpackage.gbn
    public final void c(String str, j5f0<Bitmap> j5f0Var) {
        xa50 xa50VarK;
        ea50<Bitmap> ea50VarK;
        ea50<Bitmap> ea50VarP;
        ea50 ea50VarE;
        ea50 ea50VarN;
        if (TextUtils.isEmpty(str) || (xa50VarK = k()) == null || (ea50VarK = xa50VarK.k()) == null || (ea50VarP = ea50VarK.P(str)) == null || (ea50VarE = ea50VarP.e(hre.c)) == null || (ea50VarN = ea50VarE.N(this.a)) == null) {
            return;
        }
        ea50VarN.L(new b(j5f0Var), null, ea50VarN, fug.a);
    }

    @Override // defpackage.gbn
    public final void d(int i, ImageView imageView, String str) {
        ea50<Bitmap> ea50VarK;
        ea50<Bitmap> ea50VarP;
        ea50<Bitmap> ea50VarN;
        ea50 ea50VarE;
        ea50 ea50VarG;
        ea50 ea50VarF;
        imageView.getClass();
        xa50 xa50VarK = k();
        if (xa50VarK == null || (ea50VarK = xa50VarK.k()) == null || (ea50VarP = ea50VarK.P(str)) == null || (ea50VarN = ea50VarP.N(this.a)) == null || (ea50VarE = ea50VarN.e(hre.c)) == null || (ea50VarG = ea50VarE.g()) == null || (ea50VarF = ea50VarG.f()) == null) {
            return;
        }
        ea50VarF.L(new a(i, imageView), null, ea50VarF, fug.a);
    }

    @Override // defpackage.gbn
    public final void e(String str, ImageView imageView, int i, int i2) {
        j(str, imageView, i, i2, true);
    }

    @Override // defpackage.gbn
    public final void f(String str, ibn<Bitmap> ibnVar) {
        xa50 xa50VarK;
        ea50<Bitmap> ea50VarK;
        ea50<Bitmap> ea50VarP;
        ea50 ea50VarE;
        if (TextUtils.isEmpty(str) || (xa50VarK = k()) == null || (ea50VarK = xa50VarK.k()) == null || (ea50VarP = ea50VarK.P(str)) == null) {
            return;
        }
        if (ibnVar == null) {
            ibnVar = this.a;
        }
        ea50<Bitmap> ea50VarN = ea50VarP.N(ibnVar);
        if (ea50VarN == null || (ea50VarE = ea50VarN.e(hre.c)) == null) {
            return;
        }
        ea50VarE.L(new uo20(ea50VarE.M), null, ea50VarE, fug.a);
    }

    @Override // defpackage.gbn
    public final void g(ImageView imageView, int i, int i2) {
        ea50<Drawable> ea50VarP;
        ea50<Drawable> ea50VarS;
        ea50 ea50VarN;
        ea50 ea50VarE;
        ea50 ea50VarO;
        ea50 ea50VarH;
        ea50 ea50VarG;
        ea50 ea50VarW = com.bumptech.glide.a.d(imageView.getContext()).f(Drawable.class).w(0.1f);
        ea50VarW.getClass();
        ea50 ea50Var = ea50VarW;
        xa50 xa50VarK = k();
        if (xa50VarK == null || (ea50VarP = xa50VarK.p("https://s.sporty.net/cms/Image_Bets_02f7f97786.png")) == null || (ea50VarS = ea50VarP.S(ea50Var)) == null || (ea50VarN = ea50VarS.n(i, i2)) == null || (ea50VarE = ea50VarN.e(hre.c)) == null || (ea50VarO = ea50VarE.o(0)) == null || (ea50VarH = ea50VarO.h(0)) == null || (ea50VarG = ea50VarH.g()) == null) {
            return;
        }
        ea50VarG.j().M(imageView);
    }

    @Override // defpackage.gbn
    public final void h(String str, ibn<File> ibnVar) {
        xa50 xa50VarK;
        ea50<File> ea50VarL;
        ea50<File> ea50VarP;
        ea50 ea50VarE;
        if (TextUtils.isEmpty(str) || (xa50VarK = k()) == null || (ea50VarL = xa50VarK.l()) == null || (ea50VarP = ea50VarL.P(str)) == null) {
            return;
        }
        if (ibnVar == null) {
            ibnVar = this.c;
        }
        ea50<File> ea50VarN = ea50VarP.N(ibnVar);
        if (ea50VarN == null || (ea50VarE = ea50VarN.e(hre.c)) == null) {
            return;
        }
        ea50VarE.L(new uo20(ea50VarE.M), null, ea50VarE, fug.a);
    }

    @Override // defpackage.gbn
    public final void i(String str, RemoteViews remoteViews, int i, Notification notification) {
        xa50 xa50VarK;
        ea50<Bitmap> ea50VarK;
        ea50<Bitmap> ea50VarP;
        ea50<Bitmap> ea50VarN;
        if (TextUtils.isEmpty(str) || notification == null || (xa50VarK = k()) == null || (ea50VarK = xa50VarK.k()) == null || (ea50VarP = ea50VarK.P(str)) == null || (ea50VarN = ea50VarP.N(this.a)) == null) {
            return;
        }
        ea50VarN.L(new u4y(hp0.A, remoteViews, notification, i), null, ea50VarN, fug.a);
    }

    public final void j(String str, ImageView imageView, int i, int i2, boolean z) {
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
        if (imageView == null) {
            return;
        }
        ibn<Drawable> ibnVar = this.b;
        if (z) {
            xa50 xa50VarK = k();
            if (xa50VarK == null || (ea50VarP2 = xa50VarK.p(str)) == null || (ea50VarE2 = ea50VarP2.e(hre.c)) == null || (ea50VarO2 = ea50VarE2.o(i)) == null || (ea50VarH2 = ea50VarO2.h(i2)) == null || (ea50VarG2 = ea50VarH2.g()) == null || (ea50VarN2 = ea50VarG2.N(ibnVar)) == null) {
                return;
            }
            ea50VarN2.M(imageView);
            return;
        }
        xa50 xa50VarK2 = k();
        if (xa50VarK2 == null || (ea50VarP = xa50VarK2.p(str)) == null || (ea50VarE = ea50VarP.e(hre.c)) == null || (ea50VarO = ea50VarE.o(i)) == null || (ea50VarH = ea50VarO.h(i2)) == null || (ea50VarG = ea50VarH.g()) == null || (ea50VarN = ea50VarG.N(ibnVar)) == null) {
            return;
        }
        ea50VarN.j().M(imageView);
    }

    public static final class a extends ujc<Bitmap> {
        public final /* synthetic */ int d;
        public final /* synthetic */ ImageView e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, ImageView imageView) {
            super(Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.d = i;
            this.e = imageView;
        }

        @Override // defpackage.d5f0
        public final void e(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = this.d;
            int i2 = (height * i) / width;
            ImageView imageView = this.e;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = i2;
            layoutParams.width = i;
            imageView.setImageBitmap(bitmap);
        }

        @Override // defpackage.d5f0
        public final void h(Drawable drawable) {
        }
    }

    public static final class b extends ujc<Bitmap> {
        public final /* synthetic */ j5f0<Bitmap> d;

        public b(j5f0<Bitmap> j5f0Var) {
            this.d = j5f0Var;
        }

        @Override // defpackage.d5f0
        public final void e(Object obj) {
            this.d.b((Bitmap) obj);
        }

        @Override // defpackage.d5f0
        public final void h(Drawable drawable) {
            this.d.a(drawable);
        }

        @Override // defpackage.ujc, defpackage.d5f0
        public final void g(Drawable drawable) {
        }
    }
}
