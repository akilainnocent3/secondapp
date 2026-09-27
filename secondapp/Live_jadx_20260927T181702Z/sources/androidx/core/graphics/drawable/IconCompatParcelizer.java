package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import k.y0;
import w9.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public class IconCompatParcelizer {
    public static IconCompat read(e eVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f9270a = eVar.M(iconCompat.f9270a, 1);
        iconCompat.f9272c = eVar.t(iconCompat.f9272c, 2);
        iconCompat.f9273d = eVar.W(iconCompat.f9273d, 3);
        iconCompat.f9274e = eVar.M(iconCompat.f9274e, 4);
        iconCompat.f9275f = eVar.M(iconCompat.f9275f, 5);
        iconCompat.f9276g = (ColorStateList) eVar.W(iconCompat.f9276g, 6);
        iconCompat.f9278i = eVar.d0(iconCompat.f9278i, 7);
        iconCompat.f9279j = eVar.d0(iconCompat.f9279j, 8);
        iconCompat.a();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, e eVar) {
        eVar.j0(true, true);
        iconCompat.i(eVar.i());
        int i10 = iconCompat.f9270a;
        if (-1 != i10) {
            eVar.M0(i10, 1);
        }
        byte[] bArr = iconCompat.f9272c;
        if (bArr != null) {
            eVar.u0(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f9273d;
        if (parcelable != null) {
            eVar.X0(parcelable, 3);
        }
        int i11 = iconCompat.f9274e;
        if (i11 != 0) {
            eVar.M0(i11, 4);
        }
        int i12 = iconCompat.f9275f;
        if (i12 != 0) {
            eVar.M0(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f9276g;
        if (colorStateList != null) {
            eVar.X0(colorStateList, 6);
        }
        String str = iconCompat.f9278i;
        if (str != null) {
            eVar.f1(str, 7);
        }
        String str2 = iconCompat.f9279j;
        if (str2 != null) {
            eVar.f1(str2, 8);
        }
    }
}
