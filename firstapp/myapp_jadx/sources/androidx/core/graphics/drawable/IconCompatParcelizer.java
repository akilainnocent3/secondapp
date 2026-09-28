package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import defpackage.hb5;
import defpackage.n2i0;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(n2i0 n2i0Var) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.a;
        if (n2i0Var.h(1)) {
            i = n2i0Var.i();
        }
        iconCompat.a = i;
        byte[] bArrF = iconCompat.c;
        if (n2i0Var.h(2)) {
            bArrF = n2i0Var.f();
        }
        iconCompat.c = bArrF;
        Parcelable parcelableJ = iconCompat.d;
        if (n2i0Var.h(3)) {
            parcelableJ = n2i0Var.j();
        }
        iconCompat.d = parcelableJ;
        int i2 = iconCompat.e;
        if (n2i0Var.h(4)) {
            i2 = n2i0Var.i();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f;
        if (n2i0Var.h(5)) {
            i3 = n2i0Var.i();
        }
        iconCompat.f = i3;
        Parcelable parcelableJ2 = iconCompat.g;
        if (n2i0Var.h(6)) {
            parcelableJ2 = n2i0Var.j();
        }
        iconCompat.g = (ColorStateList) parcelableJ2;
        String strK = iconCompat.i;
        if (n2i0Var.h(7)) {
            strK = n2i0Var.k();
        }
        iconCompat.i = strK;
        String strK2 = iconCompat.j;
        if (n2i0Var.h(8)) {
            strK2 = n2i0Var.k();
        }
        iconCompat.j = strK2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                hb5.a("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr = iconCompat.c;
                iconCompat.b = bArr;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, n2i0 n2i0Var) {
        n2i0Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            n2i0Var.m(1);
            n2i0Var.q(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            n2i0Var.m(2);
            n2i0Var.o(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            n2i0Var.m(3);
            n2i0Var.r(parcelable);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            n2i0Var.m(4);
            n2i0Var.q(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            n2i0Var.m(5);
            n2i0Var.q(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            n2i0Var.m(6);
            n2i0Var.r(colorStateList);
        }
        String str = iconCompat.i;
        if (str != null) {
            n2i0Var.m(7);
            n2i0Var.s(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            n2i0Var.m(8);
            n2i0Var.s(str2);
        }
    }
}
