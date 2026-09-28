package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.b;
import androidx.compose.ui.d;
import java.math.BigDecimal;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd3 implements baj {
    public static int a(BigDecimal bigDecimal, int i, int i2) {
        return (bigDecimal.hashCode() + i) * i2;
    }

    public static void b(d.a aVar, float f, b bVar, boolean z) {
        ty0.a(bVar, j.w(aVar, f));
        bVar.X(z);
    }

    @Override // defpackage.baj
    public Object apply(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = j4c.s;
        j4c.a aVar = new j4c.a();
        CharSequence charSequence = bundle.getCharSequence(j4c.s);
        if (charSequence != null) {
            aVar.b(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(j4c.t);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                int size = parcelableArrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = parcelableArrayList.get(i);
                    i++;
                    Bundle bundle2 = (Bundle) obj2;
                    int i2 = bundle2.getInt(sfc.a);
                    int i3 = bundle2.getInt(sfc.b);
                    int i4 = bundle2.getInt(sfc.c);
                    int i5 = bundle2.getInt(sfc.d, -1);
                    Bundle bundle3 = bundle2.getBundle(sfc.e);
                    if (i5 == 1) {
                        bundle3.getClass();
                        String string = bundle3.getString(j160.c);
                        string.getClass();
                        spannableStringValueOf.setSpan(new j160(string, bundle3.getInt(j160.d)), i2, i3, i4);
                    } else if (i5 == 2) {
                        bundle3.getClass();
                        spannableStringValueOf.setSpan(new jff0(bundle3.getInt(jff0.d), bundle3.getInt(jff0.e), bundle3.getInt(jff0.f)), i2, i3, i4);
                    } else if (i5 == 3) {
                        spannableStringValueOf.setSpan(new ujm(), i2, i3, i4);
                    } else if (i5 == 4) {
                        bundle3.getClass();
                        String string2 = bundle3.getString(foi0.b);
                        string2.getClass();
                        spannableStringValueOf.setSpan(new foi0(string2), i2, i3, i4);
                    }
                }
                aVar.b(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(j4c.u);
        if (alignment != null) {
            aVar.c = alignment;
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(j4c.v);
        if (alignment2 != null) {
            aVar.d = alignment2;
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(j4c.w);
        if (bitmap != null) {
            aVar.b = bitmap;
            aVar.a = null;
        } else {
            byte[] byteArray = bundle.getByteArray(j4c.x);
            if (byteArray != null) {
                aVar.b = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                aVar.a = null;
            }
        }
        String str2 = j4c.y;
        if (bundle.containsKey(str2)) {
            String str3 = j4c.z;
            if (bundle.containsKey(str3)) {
                float f = bundle.getFloat(str2);
                int i6 = bundle.getInt(str3);
                aVar.e = f;
                aVar.f = i6;
            }
        }
        String str4 = j4c.A;
        if (bundle.containsKey(str4)) {
            aVar.g = bundle.getInt(str4);
        }
        String str5 = j4c.B;
        if (bundle.containsKey(str5)) {
            aVar.h = bundle.getFloat(str5);
        }
        String str6 = j4c.C;
        if (bundle.containsKey(str6)) {
            aVar.i = bundle.getInt(str6);
        }
        String str7 = j4c.E;
        if (bundle.containsKey(str7)) {
            String str8 = j4c.D;
            if (bundle.containsKey(str8)) {
                float f2 = bundle.getFloat(str7);
                int i7 = bundle.getInt(str8);
                aVar.k = f2;
                aVar.j = i7;
            }
        }
        String str9 = j4c.F;
        if (bundle.containsKey(str9)) {
            aVar.l = bundle.getFloat(str9);
        }
        String str10 = j4c.G;
        if (bundle.containsKey(str10)) {
            aVar.m = bundle.getFloat(str10);
        }
        String str11 = j4c.H;
        if (bundle.containsKey(str11)) {
            aVar.o = bundle.getInt(str11);
            aVar.n = true;
        }
        if (!bundle.getBoolean(j4c.I, false)) {
            aVar.n = false;
        }
        String str12 = j4c.J;
        if (bundle.containsKey(str12)) {
            aVar.p = bundle.getInt(str12);
        }
        String str13 = j4c.K;
        if (bundle.containsKey(str13)) {
            aVar.q = bundle.getFloat(str13);
        }
        String str14 = j4c.L;
        if (bundle.containsKey(str14)) {
            aVar.r = bundle.getInt(str14);
        }
        return aVar.a();
    }
}
