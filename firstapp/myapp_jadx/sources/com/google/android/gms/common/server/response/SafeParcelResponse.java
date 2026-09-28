package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import defpackage.bu7;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.hjk0;
import defpackage.hm20;
import defpackage.ib5;
import defpackage.jfp;
import defpackage.tr60;
import defpackage.u4;
import defpackage.uif;
import defpackage.zkh;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new hjk0();
    public final int a;
    public final Parcel b;
    public final int c;
    public final zan d;
    public final String e;
    public int f;
    public int i;

    public SafeParcelResponse(int i, Parcel parcel, zan zanVar) {
        this.a = i;
        hm20.h(parcel);
        this.b = parcel;
        this.c = 2;
        this.d = zanVar;
        this.e = zanVar == null ? null : zanVar.c;
        this.f = 2;
    }

    public static void p(StringBuilder sb, Map map, Parcel parcel) {
        BigInteger bigInteger;
        Parcel parcelObtain;
        BigInteger[] bigIntegerArr;
        long[] jArrCreateLongArray;
        float[] fArrCreateFloatArray;
        double[] dArrCreateDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] zArrCreateBooleanArray;
        Parcel[] parcelArr;
        BigInteger bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).i, entry);
        }
        sb.append('{');
        int iV = tr60.v(parcel);
        boolean z = false;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) i);
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                u4.a(sb, "\"", str, "\":");
                FastJsonResponse.a aVar = field.z;
                String str2 = field.w;
                int i2 = field.d;
                if (aVar != null) {
                    switch (i2) {
                        case 0:
                            r(sb, field, FastJsonResponse.j(field, Integer.valueOf(tr60.p(parcel, i))));
                            break;
                        case 1:
                            int iT = tr60.t(parcel, i);
                            int iDataPosition = parcel.dataPosition();
                            if (iT == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iT);
                                bigInteger2 = new BigInteger(bArrCreateByteArray);
                            }
                            r(sb, field, FastJsonResponse.j(field, bigInteger2));
                            break;
                        case 2:
                            r(sb, field, FastJsonResponse.j(field, Long.valueOf(tr60.r(parcel, i))));
                            break;
                        case 3:
                            r(sb, field, FastJsonResponse.j(field, Float.valueOf(tr60.n(parcel, i))));
                            break;
                        case 4:
                            tr60.x(parcel, i, 8);
                            r(sb, field, FastJsonResponse.j(field, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            r(sb, field, FastJsonResponse.j(field, tr60.a(parcel, i)));
                            break;
                        case 6:
                            r(sb, field, FastJsonResponse.j(field, Boolean.valueOf(tr60.l(parcel, i))));
                            break;
                        case 7:
                            r(sb, field, FastJsonResponse.j(field, tr60.f(parcel, i)));
                            break;
                        case 8:
                        case 9:
                            r(sb, field, FastJsonResponse.j(field, tr60.c(parcel, i)));
                            break;
                        case 10:
                            Bundle bundleB = tr60.b(parcel, i);
                            HashMap map2 = new HashMap();
                            for (String str3 : bundleB.keySet()) {
                                String string = bundleB.getString(str3);
                                hm20.h(string);
                                map2.put(str3, string);
                            }
                            r(sb, field, FastJsonResponse.j(field, map2));
                            break;
                        case 11:
                            hb5.a("Method does not accept concrete type.");
                            return;
                        default:
                            hb5.a(hce0.a(i2, "Unknown field out type = "));
                            return;
                    }
                } else if (field.e) {
                    sb.append("[");
                    switch (i2) {
                        case 0:
                            int[] iArrD = tr60.d(parcel, i);
                            int length = iArrD.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                if (i3 != 0) {
                                    sb.append(",");
                                }
                                sb.append(iArrD[i3]);
                            }
                            break;
                        case 1:
                            int iT2 = tr60.t(parcel, i);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iT2 == 0) {
                                bigIntegerArr = null;
                            } else {
                                int i4 = parcel.readInt();
                                bigIntegerArr = new BigInteger[i4];
                                for (int i5 = 0; i5 < i4; i5++) {
                                    bigIntegerArr[i5] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(iDataPosition2 + iT2);
                            }
                            int length2 = bigIntegerArr.length;
                            for (int i6 = 0; i6 < length2; i6++) {
                                if (i6 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigIntegerArr[i6]);
                            }
                            break;
                        case 2:
                            int iT3 = tr60.t(parcel, i);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iT3 == 0) {
                                jArrCreateLongArray = null;
                            } else {
                                jArrCreateLongArray = parcel.createLongArray();
                                parcel.setDataPosition(iDataPosition3 + iT3);
                            }
                            int length3 = jArrCreateLongArray.length;
                            for (int i7 = 0; i7 < length3; i7++) {
                                if (i7 != 0) {
                                    sb.append(",");
                                }
                                sb.append(jArrCreateLongArray[i7]);
                            }
                            break;
                        case 3:
                            int iT4 = tr60.t(parcel, i);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iT4 == 0) {
                                fArrCreateFloatArray = null;
                            } else {
                                fArrCreateFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(iDataPosition4 + iT4);
                            }
                            int length4 = fArrCreateFloatArray.length;
                            for (int i8 = 0; i8 < length4; i8++) {
                                if (i8 != 0) {
                                    sb.append(",");
                                }
                                sb.append(fArrCreateFloatArray[i8]);
                            }
                            break;
                        case 4:
                            int iT5 = tr60.t(parcel, i);
                            int iDataPosition5 = parcel.dataPosition();
                            if (iT5 == 0) {
                                dArrCreateDoubleArray = null;
                            } else {
                                dArrCreateDoubleArray = parcel.createDoubleArray();
                                parcel.setDataPosition(iDataPosition5 + iT5);
                            }
                            int length5 = dArrCreateDoubleArray.length;
                            for (int i9 = 0; i9 < length5; i9++) {
                                if (i9 != 0) {
                                    sb.append(",");
                                }
                                sb.append(dArrCreateDoubleArray[i9]);
                            }
                            break;
                        case 5:
                            int iT6 = tr60.t(parcel, i);
                            int iDataPosition6 = parcel.dataPosition();
                            if (iT6 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int i10 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[i10];
                                for (int i11 = 0; i11 < i10; i11++) {
                                    bigDecimalArr[i11] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(iDataPosition6 + iT6);
                            }
                            int length6 = bigDecimalArr.length;
                            for (int i12 = 0; i12 < length6; i12++) {
                                if (i12 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigDecimalArr[i12]);
                            }
                            break;
                        case 6:
                            int iT7 = tr60.t(parcel, i);
                            int iDataPosition7 = parcel.dataPosition();
                            if (iT7 == 0) {
                                zArrCreateBooleanArray = null;
                            } else {
                                zArrCreateBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(iDataPosition7 + iT7);
                            }
                            int length7 = zArrCreateBooleanArray.length;
                            for (int i13 = 0; i13 < length7; i13++) {
                                if (i13 != 0) {
                                    sb.append(",");
                                }
                                sb.append(zArrCreateBooleanArray[i13]);
                            }
                            break;
                        case 7:
                            String[] strArrG = tr60.g(parcel, i);
                            int length8 = strArrG.length;
                            for (int i14 = 0; i14 < length8; i14++) {
                                if (i14 != 0) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(strArrG[i14]);
                                sb.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            zkh.a("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            return;
                        case 11:
                            int iT8 = tr60.t(parcel, i);
                            int iDataPosition8 = parcel.dataPosition();
                            if (iT8 == 0) {
                                parcelArr = null;
                            } else {
                                int i15 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[i15];
                                for (int i16 = 0; i16 < i15; i16++) {
                                    int i17 = parcel.readInt();
                                    if (i17 != 0) {
                                        int iDataPosition9 = parcel.dataPosition();
                                        Parcel parcelObtain2 = Parcel.obtain();
                                        parcelObtain2.appendFrom(parcel, iDataPosition9, i17);
                                        parcelArr2[i16] = parcelObtain2;
                                        parcel.setDataPosition(iDataPosition9 + i17);
                                    } else {
                                        parcelArr2[i16] = null;
                                    }
                                }
                                parcel.setDataPosition(iDataPosition8 + iT8);
                                parcelArr = parcelArr2;
                            }
                            int length9 = parcelArr.length;
                            for (int i18 = 0; i18 < length9; i18++) {
                                if (i18 > 0) {
                                    sb.append(",");
                                }
                                parcelArr[i18].setDataPosition(0);
                                hm20.h(str2);
                                hm20.h(field.y);
                                Map map3 = (Map) field.y.b.get(str2);
                                hm20.h(map3);
                                p(sb, map3, parcelArr[i18]);
                            }
                            break;
                        default:
                            ib5.a("Unknown field type out.");
                            return;
                    }
                    sb.append("]");
                } else {
                    switch (i2) {
                        case 0:
                            sb.append(tr60.p(parcel, i));
                            break;
                        case 1:
                            int iT9 = tr60.t(parcel, i);
                            int iDataPosition10 = parcel.dataPosition();
                            if (iT9 == 0) {
                                bigInteger = null;
                            } else {
                                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition10 + iT9);
                                bigInteger = new BigInteger(bArrCreateByteArray2);
                            }
                            sb.append(bigInteger);
                            break;
                        case 2:
                            sb.append(tr60.r(parcel, i));
                            break;
                        case 3:
                            sb.append(tr60.n(parcel, i));
                            break;
                        case 4:
                            tr60.x(parcel, i, 8);
                            sb.append(parcel.readDouble());
                            break;
                        case 5:
                            sb.append(tr60.a(parcel, i));
                            break;
                        case 6:
                            sb.append(tr60.l(parcel, i));
                            break;
                        case 7:
                            String strF = tr60.f(parcel, i);
                            sb.append("\"");
                            sb.append(jfp.a(strF));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] bArrC = tr60.c(parcel, i);
                            sb.append("\"");
                            sb.append(bArrC == null ? null : Base64.encodeToString(bArrC, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] bArrC2 = tr60.c(parcel, i);
                            sb.append("\"");
                            sb.append(bArrC2 == null ? null : Base64.encodeToString(bArrC2, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle bundleB2 = tr60.b(parcel, i);
                            Set<String> setKeySet = bundleB2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str4 : setKeySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                u4.a(sb, "\"", str4, "\":\"");
                                sb.append(jfp.a(bundleB2.getString(str4)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            int iT10 = tr60.t(parcel, i);
                            int iDataPosition11 = parcel.dataPosition();
                            if (iT10 == 0) {
                                parcelObtain = null;
                            } else {
                                parcelObtain = Parcel.obtain();
                                parcelObtain.appendFrom(parcel, iDataPosition11, iT10);
                                parcel.setDataPosition(iDataPosition11 + iT10);
                            }
                            parcelObtain.setDataPosition(0);
                            hm20.h(str2);
                            hm20.h(field.y);
                            Map map4 = (Map) field.y.b.get(str2);
                            hm20.h(map4);
                            p(sb, map4, parcelObtain);
                            break;
                        default:
                            ib5.a("Unknown field type out");
                            return;
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != iV) {
            throw new tr60.a(hce0.a(iV, "Overread allowed size end="), parcel);
        }
        sb.append('}');
    }

    public static final void q(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                break;
            case 7:
                sb.append("\"");
                hm20.h(obj);
                sb.append(jfp.a(obj.toString()));
                sb.append("\"");
                break;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                sb.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb.append("\"");
                break;
            case 9:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb.append("\"");
                break;
            case 10:
                hm20.h(obj);
                bu7.a(sb, (HashMap) obj);
                break;
            case 11:
                hb5.a("Method does not accept concrete type.");
                break;
            default:
                hb5.a(hce0.a(i, "Unknown type = "));
                break;
        }
    }

    public static final void r(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        boolean z = field.c;
        int i = field.b;
        if (!z) {
            q(sb, i, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            q(sb, i, arrayList.get(i2));
        }
        sb.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map<String, FastJsonResponse.Field<?, ?>> a() {
        zan zanVar = this.d;
        if (zanVar == null) {
            return null;
        }
        String str = this.e;
        hm20.h(str);
        return (Map) zanVar.b.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object g() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean i() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel n() {
        int i = this.f;
        Parcel parcel = this.b;
        if (i != 0) {
            if (i != 1) {
                return parcel;
            }
            uif.n(parcel, this.i);
            this.f = 2;
            return parcel;
        }
        int iM = uif.m(parcel, 20293);
        this.i = iM;
        uif.n(parcel, iM);
        this.f = 2;
        return parcel;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        zan zanVar = this.d;
        hm20.i(zanVar, "Cannot convert to JSON on client side.");
        Parcel parcelN = n();
        parcelN.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.e;
        hm20.h(str);
        Map map = (Map) zanVar.b.get(str);
        hm20.h(map);
        p(sb, map, parcelN);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        Parcel parcelN = n();
        if (parcelN != null) {
            int iM2 = uif.m(parcel, 2);
            parcel.appendFrom(parcelN, 0, parcelN.dataSize());
            uif.n(parcel, iM2);
        }
        uif.h(parcel, 3, this.c != 0 ? this.d : null, i, false);
        uif.n(parcel, iM);
    }
}
