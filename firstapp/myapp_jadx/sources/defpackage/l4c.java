package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l4c implements baj {
    @Override // defpackage.baj
    public final Object apply(Object obj) {
        j4c j4cVar = (j4c) obj;
        Bitmap bitmap = j4cVar.d;
        Bundle bundle = new Bundle();
        CharSequence charSequence = j4cVar.a;
        if (charSequence != null) {
            bundle.putCharSequence(j4c.s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = sfc.a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (j160 j160Var : (j160[]) spanned.getSpans(0, spanned.length(), j160.class)) {
                    j160Var.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(j160.c, j160Var.a);
                    bundle2.putInt(j160.d, j160Var.b);
                    arrayList.add(sfc.a(spanned, j160Var, 1, bundle2));
                }
                for (jff0 jff0Var : (jff0[]) spanned.getSpans(0, spanned.length(), jff0.class)) {
                    jff0Var.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(jff0.d, jff0Var.a);
                    bundle3.putInt(jff0.e, jff0Var.b);
                    bundle3.putInt(jff0.f, jff0Var.c);
                    arrayList.add(sfc.a(spanned, jff0Var, 2, bundle3));
                }
                for (ujm ujmVar : (ujm[]) spanned.getSpans(0, spanned.length(), ujm.class)) {
                    arrayList.add(sfc.a(spanned, ujmVar, 3, null));
                }
                for (foi0 foi0Var : (foi0[]) spanned.getSpans(0, spanned.length(), foi0.class)) {
                    foi0Var.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(foi0.b, foi0Var.a);
                    arrayList.add(sfc.a(spanned, foi0Var, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(j4c.t, arrayList);
                }
            }
        }
        bundle.putSerializable(j4c.u, j4cVar.b);
        bundle.putSerializable(j4c.v, j4cVar.c);
        bundle.putFloat(j4c.y, j4cVar.e);
        bundle.putInt(j4c.z, j4cVar.f);
        bundle.putInt(j4c.A, j4cVar.g);
        bundle.putFloat(j4c.B, j4cVar.h);
        bundle.putInt(j4c.C, j4cVar.i);
        bundle.putInt(j4c.D, j4cVar.n);
        bundle.putFloat(j4c.E, j4cVar.o);
        bundle.putFloat(j4c.F, j4cVar.j);
        bundle.putFloat(j4c.G, j4cVar.k);
        bundle.putBoolean(j4c.I, j4cVar.l);
        bundle.putInt(j4c.H, j4cVar.m);
        bundle.putInt(j4c.J, j4cVar.p);
        bundle.putFloat(j4c.K, j4cVar.q);
        bundle.putInt(j4c.L, j4cVar.r);
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ly0.f(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(j4c.x, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }
}
