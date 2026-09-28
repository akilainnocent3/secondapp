package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.patron.KYCBannerItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m3l0 extends ntk0 implements o3l0 {
    @Override // defpackage.ntk0
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        List list;
        ArrayList arrayList = null;
        u3l0 q3l0Var = null;
        z3l0 v3l0Var = null;
        switch (i) {
            case 1:
                zzbg zzbgVar = (zzbg) ptk0.a(parcel, zzbg.CREATOR);
                zzr zzrVar = (zzr) ptk0.a(parcel, zzr.CREATOR);
                ptk0.d(parcel);
                ((ual0) this).q(zzbgVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzpl zzplVar = (zzpl) ptk0.a(parcel, zzpl.CREATOR);
                zzr zzrVar2 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                ptk0.d(parcel);
                ((ual0) this).v(zzplVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
            case 28:
            default:
                return false;
            case 4:
                zzr zzrVar3 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                ptk0.d(parcel);
                ((ual0) this).Q(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbg zzbgVar2 = (zzbg) ptk0.a(parcel, zzbg.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                ptk0.d(parcel);
                ual0 ual0Var = (ual0) this;
                hm20.h(zzbgVar2);
                hm20.e(string);
                ual0Var.Z(string, true);
                ual0Var.a0(new n9l0(ual0Var, zzbgVar2, string));
                parcel2.writeNoException();
                return true;
            case 6:
                zzr zzrVar4 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                ptk0.d(parcel);
                ((ual0) this).r(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzr zzrVar5 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                z = parcel.readInt() != 0;
                ptk0.d(parcel);
                ual0 ual0Var2 = (ual0) this;
                ual0Var2.d(zzrVar5);
                String str = zzrVar5.a;
                hm20.h(str);
                iol0 iol0Var = ual0Var2.a;
                try {
                    List<uol0> list2 = (List) iol0Var.b().n(new m8l0(ual0Var2, str)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (uol0 uol0Var : list2) {
                        if (z || !yol0.F(uol0Var.c)) {
                            arrayList2.add(new zzpl(uol0Var));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    iol0Var.a().f.c(y4l0.k(str), "Failed to get user properties. appId", e);
                } catch (ExecutionException e2) {
                    e = e2;
                    iol0Var.a().f.c(y4l0.k(str), "Failed to get user properties. appId", e);
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                zzbg zzbgVar3 = (zzbg) ptk0.a(parcel, zzbg.CREATOR);
                String string2 = parcel.readString();
                ptk0.d(parcel);
                byte[] bArrT = ((ual0) this).t(zzbgVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrT);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                ptk0.d(parcel);
                ((ual0) this).C(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                ptk0.d(parcel);
                String strA = ((ual0) this).A(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 12:
                zzah zzahVar = (zzah) ptk0.a(parcel, zzah.CREATOR);
                zzr zzrVar7 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                ptk0.d(parcel);
                ((ual0) this).g(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVar2 = (zzah) ptk0.a(parcel, zzah.CREATOR);
                ptk0.d(parcel);
                ual0 ual0Var3 = (ual0) this;
                hm20.h(zzahVar2);
                hm20.h(zzahVar2.c);
                hm20.e(zzahVar2.a);
                ual0Var3.Z(zzahVar2.a, true);
                ual0Var3.a0(new w8l0(ual0Var3, new zzah(zzahVar2)));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = ptk0.a;
                z = parcel.readInt() != 0;
                zzr zzrVar8 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                ptk0.d(parcel);
                List listV = ((ual0) this).V(string6, string7, z, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listV);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = ptk0.a;
                z = parcel.readInt() != 0;
                ptk0.d(parcel);
                List listF = ((ual0) this).f(string8, string9, string10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listF);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                zzr zzrVar9 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                ptk0.d(parcel);
                List listW = ((ual0) this).W(string11, string12, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listW);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                ptk0.d(parcel);
                List listL = ((ual0) this).l(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listL);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                ptk0.d(parcel);
                ((ual0) this).E(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) ptk0.a(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                ptk0.d(parcel);
                ((ual0) this).N(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                ptk0.d(parcel);
                ((ual0) this).Y(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzr zzrVar13 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                ptk0.d(parcel);
                zzao zzaoVarL = ((ual0) this).L(zzrVar13);
                parcel2.writeNoException();
                if (zzaoVarL == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                zzaoVarL.writeToParcel(parcel2, 1);
                return true;
            case 24:
                zzr zzrVar14 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) ptk0.a(parcel, Bundle.CREATOR);
                ptk0.d(parcel);
                ual0 ual0Var4 = (ual0) this;
                ual0Var4.d(zzrVar14);
                String str2 = zzrVar14.a;
                hm20.h(str2);
                iol0 iol0Var2 = ual0Var4.a;
                if (!iol0Var2.e0().q(null, v2l0.Y0)) {
                    try {
                        list = (List) iol0Var2.b().n(new v9l0(ual0Var4, zzrVar14, bundle2)).get();
                    } catch (InterruptedException | ExecutionException e3) {
                        iol0Var2.a().f.c(y4l0.k(str2), "Failed to get trigger URIs. appId", e3);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) iol0Var2.b().o(new t9l0(ual0Var4, zzrVar14, bundle2)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                        iol0Var2.a().f.c(y4l0.k(str2), "Failed to get trigger URIs. appId", e4);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                zzr zzrVar15 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                ptk0.d(parcel);
                ((ual0) this).n(zzrVar15);
                parcel2.writeNoException();
                return true;
            case RuntimeVersion.MINOR /* 26 */:
                zzr zzrVar16 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                ptk0.d(parcel);
                ((ual0) this).s(zzrVar16);
                parcel2.writeNoException();
                return true;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                zzr zzrVar17 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                ptk0.d(parcel);
                ((ual0) this).T(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                zzr zzrVar18 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                zzoo zzooVar = (zzoo) ptk0.a(parcel, zzoo.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    v3l0Var = iInterfaceQueryLocalInterface instanceof z3l0 ? (z3l0) iInterfaceQueryLocalInterface : new v3l0(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                }
                ptk0.d(parcel);
                ((ual0) this).R(zzrVar18, zzooVar, v3l0Var);
                parcel2.writeNoException();
                return true;
            case 30:
                zzr zzrVar19 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                zzaf zzafVar = (zzaf) ptk0.a(parcel, zzaf.CREATOR);
                ptk0.d(parcel);
                ((ual0) this).H(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                zzr zzrVar20 = (zzr) ptk0.a(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) ptk0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    q3l0Var = iInterfaceQueryLocalInterface2 instanceof u3l0 ? (u3l0) iInterfaceQueryLocalInterface2 : new q3l0(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                }
                ptk0.d(parcel);
                ((ual0) this).J(zzrVar20, bundle3, q3l0Var);
                parcel2.writeNoException();
                return true;
        }
    }
}
