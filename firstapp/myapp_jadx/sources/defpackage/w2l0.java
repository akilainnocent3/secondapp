package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w2l0 extends mtk0 implements o3l0 {
    public w2l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // defpackage.o3l0
    public final String A(zzr zzrVar) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzrVar);
        Parcel parcelA = a(parcelB, 11);
        String string = parcelA.readString();
        parcelA.recycle();
        return string;
    }

    @Override // defpackage.o3l0
    public final void C(long j, String str, String str2, String str3) {
        Parcel parcelB = b();
        parcelB.writeLong(j);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        d(parcelB, 10);
    }

    @Override // defpackage.o3l0
    public final void E(zzr zzrVar) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzrVar);
        d(parcelB, 18);
    }

    @Override // defpackage.o3l0
    public final void H(zzr zzrVar, zzaf zzafVar) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzrVar);
        ptk0.b(parcelB, zzafVar);
        d(parcelB, 30);
    }

    @Override // defpackage.o3l0
    public final void J(zzr zzrVar, Bundle bundle, u3l0 u3l0Var) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzrVar);
        ptk0.b(parcelB, bundle);
        ptk0.c(parcelB, u3l0Var);
        d(parcelB, 31);
    }

    @Override // defpackage.o3l0
    public final zzao L(zzr zzrVar) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzrVar);
        Parcel parcelA = a(parcelB, 21);
        zzao zzaoVar = (zzao) ptk0.a(parcelA, zzao.CREATOR);
        parcelA.recycle();
        return zzaoVar;
    }

    @Override // defpackage.o3l0
    public final void N(Bundle bundle, zzr zzrVar) {
        Parcel parcelB = b();
        ptk0.b(parcelB, bundle);
        ptk0.b(parcelB, zzrVar);
        d(parcelB, 19);
    }

    @Override // defpackage.o3l0
    public final void Q(zzr zzrVar) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzrVar);
        d(parcelB, 4);
    }

    @Override // defpackage.o3l0
    public final void R(zzr zzrVar, zzoo zzooVar, z3l0 z3l0Var) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzrVar);
        ptk0.b(parcelB, zzooVar);
        ptk0.c(parcelB, z3l0Var);
        d(parcelB, 29);
    }

    @Override // defpackage.o3l0
    public final void T(zzr zzrVar) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzrVar);
        d(parcelB, 27);
    }

    @Override // defpackage.o3l0
    public final List V(String str, String str2, boolean z, zzr zzrVar) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        ClassLoader classLoader = ptk0.a;
        parcelB.writeInt(z ? 1 : 0);
        ptk0.b(parcelB, zzrVar);
        Parcel parcelA = a(parcelB, 14);
        ArrayList arrayListCreateTypedArrayList = parcelA.createTypedArrayList(zzpl.CREATOR);
        parcelA.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.o3l0
    public final List W(String str, String str2, zzr zzrVar) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        ptk0.b(parcelB, zzrVar);
        Parcel parcelA = a(parcelB, 16);
        ArrayList arrayListCreateTypedArrayList = parcelA.createTypedArrayList(zzah.CREATOR);
        parcelA.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.o3l0
    public final void Y(zzr zzrVar) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzrVar);
        d(parcelB, 20);
    }

    @Override // defpackage.o3l0
    public final List f(String str, String str2, String str3, boolean z) {
        Parcel parcelB = b();
        parcelB.writeString(null);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        ClassLoader classLoader = ptk0.a;
        parcelB.writeInt(z ? 1 : 0);
        Parcel parcelA = a(parcelB, 15);
        ArrayList arrayListCreateTypedArrayList = parcelA.createTypedArrayList(zzpl.CREATOR);
        parcelA.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.o3l0
    public final void g(zzah zzahVar, zzr zzrVar) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzahVar);
        ptk0.b(parcelB, zzrVar);
        d(parcelB, 12);
    }

    @Override // defpackage.o3l0
    public final List l(String str, String str2, String str3) {
        Parcel parcelB = b();
        parcelB.writeString(null);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        Parcel parcelA = a(parcelB, 17);
        ArrayList arrayListCreateTypedArrayList = parcelA.createTypedArrayList(zzah.CREATOR);
        parcelA.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.o3l0
    public final void n(zzr zzrVar) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzrVar);
        d(parcelB, 25);
    }

    @Override // defpackage.o3l0
    public final void q(zzbg zzbgVar, zzr zzrVar) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzbgVar);
        ptk0.b(parcelB, zzrVar);
        d(parcelB, 1);
    }

    @Override // defpackage.o3l0
    public final void r(zzr zzrVar) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzrVar);
        d(parcelB, 6);
    }

    @Override // defpackage.o3l0
    public final void s(zzr zzrVar) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzrVar);
        d(parcelB, 26);
    }

    @Override // defpackage.o3l0
    public final byte[] t(zzbg zzbgVar, String str) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzbgVar);
        parcelB.writeString(str);
        Parcel parcelA = a(parcelB, 9);
        byte[] bArrCreateByteArray = parcelA.createByteArray();
        parcelA.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.o3l0
    public final void v(zzpl zzplVar, zzr zzrVar) {
        Parcel parcelB = b();
        ptk0.b(parcelB, zzplVar);
        ptk0.b(parcelB, zzrVar);
        d(parcelB, 2);
    }
}
