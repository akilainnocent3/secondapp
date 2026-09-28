package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class tbn {

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(ImageView imageView, String str, boolean z) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        str.getClass();
        scaleType.getClass();
        ea50<Drawable> ea50VarP = com.bumptech.glide.a.d(imageView.getContext()).p(str);
        ea50VarP.getClass();
        int i = a.a[scaleType.ordinal()];
        if (i == 1) {
            ea50VarP = (ea50) ea50VarP.j();
        } else if (i == 2) {
            ea50VarP = (ea50) ea50VarP.s(x6f.b, new hv6(), true);
        } else if (i == 3) {
            m52 m52VarZ = ea50VarP.z(x6f.c, new gv6());
            m52VarZ.getClass();
            ea50VarP = (ea50) m52VarZ;
        }
        if (z) {
            ea50VarP = ea50VarP.a(hb50.E());
            ea50VarP.getClass();
        }
        ea50VarP.f().M(imageView);
    }

    public static final boolean b(ImageView imageView, gbn gbnVar, lxs lxsVar) {
        if (imageView.getHeight() == 0 || imageView.getWidth() == 0) {
            return false;
        }
        gbnVar.a(xib0.GIFT_GRAB_IDLE_BACKGROUND, imageView);
        if (lxsVar == null) {
            return true;
        }
        imageView.removeOnLayoutChangeListener(lxsVar);
        imageView.setTag(R.id.load_url_when_size_ready, null);
        return true;
    }
}
