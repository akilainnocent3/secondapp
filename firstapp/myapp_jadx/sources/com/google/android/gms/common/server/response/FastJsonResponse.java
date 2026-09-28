package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import defpackage.bu7;
import defpackage.gqm;
import defpackage.hb5;
import defpackage.hm20;
import defpackage.ib5;
import defpackage.inm;
import defpackage.jfp;
import defpackage.scy;
import defpackage.u4;
import defpackage.uif;
import defpackage.zkh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FastJsonResponse {

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final com.google.android.gms.common.server.response.a CREATOR = new com.google.android.gms.common.server.response.a();
        public final int a;
        public final int b;
        public final boolean c;
        public final int d;
        public final boolean e;
        public final String f;
        public final int i;
        public final Class v;
        public final String w;
        public zan y;
        public final a z;

        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaaVar) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = i3;
            this.e = z2;
            this.f = str;
            this.i = i4;
            if (str2 == null) {
                this.v = null;
                this.w = null;
            } else {
                this.v = SafeParcelResponse.class;
                this.w = str2;
            }
            if (zaaVar == null) {
                this.z = null;
                return;
            }
            StringToIntConverter stringToIntConverter = zaaVar.b;
            if (stringToIntConverter != null) {
                this.z = stringToIntConverter;
            } else {
                ib5.a("There was no converter wrapped in this ConverterWrapper.");
                throw null;
            }
        }

        public static Field G0(int i, String str) {
            return new Field(7, true, 7, true, str, i, null);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iM = uif.m(parcel, 20293);
            uif.o(parcel, 1, 4);
            parcel.writeInt(this.a);
            uif.o(parcel, 2, 4);
            parcel.writeInt(this.b);
            uif.o(parcel, 3, 4);
            parcel.writeInt(this.c ? 1 : 0);
            uif.o(parcel, 4, 4);
            parcel.writeInt(this.d);
            uif.o(parcel, 5, 4);
            parcel.writeInt(this.e ? 1 : 0);
            uif.i(parcel, 6, this.f, false);
            uif.o(parcel, 7, 4);
            parcel.writeInt(this.i);
            zaa zaaVar = null;
            String str = this.w;
            if (str == null) {
                str = null;
            }
            uif.i(parcel, 8, str, false);
            a aVar = this.z;
            if (aVar != null) {
                if (!(aVar instanceof StringToIntConverter)) {
                    hb5.a("Unsupported safe parcelable field converter class.");
                    return;
                }
                zaaVar = new zaa((StringToIntConverter) aVar);
            }
            uif.h(parcel, 9, zaaVar, i, false);
            uif.n(parcel, iM);
        }

        public final String toString() {
            scy.a aVar = new scy.a(this);
            aVar.a(Integer.valueOf(this.a), "versionCode");
            aVar.a(Integer.valueOf(this.b), "typeIn");
            aVar.a(Boolean.valueOf(this.c), "typeInArray");
            aVar.a(Integer.valueOf(this.d), "typeOut");
            aVar.a(Boolean.valueOf(this.e), "typeOutArray");
            aVar.a(this.f, "outputFieldName");
            aVar.a(Integer.valueOf(this.i), yFmFZvuWxAYfEj.ghs);
            String str = this.w;
            if (str == null) {
                str = null;
            }
            aVar.a(str, "concreteTypeName");
            Class cls = this.v;
            if (cls != null) {
                aVar.a(cls.getCanonicalName(), "concreteType.class");
            }
            a aVar2 = this.z;
            if (aVar2 != null) {
                aVar.a(aVar2.getClass().getCanonicalName(), "converterName");
            }
            return aVar.toString();
        }

        public Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls) {
            this.a = 1;
            this.b = i;
            this.c = z;
            this.d = i2;
            this.e = z2;
            this.f = str;
            this.i = i3;
            this.v = cls;
            if (cls == null) {
                this.w = null;
            } else {
                this.w = cls.getCanonicalName();
            }
            this.z = null;
        }
    }

    public interface a<I, O> {
    }

    public static final Object j(Field field, Object obj) {
        a aVar = field.z;
        if (aVar != null) {
            StringToIntConverter stringToIntConverter = (StringToIntConverter) aVar;
            obj = (String) stringToIntConverter.c.get(((Integer) obj).intValue());
            if (obj == null && stringToIntConverter.b.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    public static final void k(StringBuilder sb, Field field, Object obj) {
        int i = field.b;
        if (i == 11) {
            Class cls = field.v;
            hm20.h(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(jfp.a((String) obj));
            sb.append("\"");
        }
    }

    public abstract Map<String, Field<?, ?>> a();

    public Object e(Field field) {
        String str = field.f;
        if (field.v == null) {
            return g();
        }
        boolean z = g() == null;
        String str2 = field.f;
        if (!z) {
            ib5.a(inm.a("Concrete field shouldn't be value object: ", str2));
            return null;
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e) {
            gqm.a(e);
            return null;
        }
    }

    public abstract Object g();

    public boolean h(Field field) {
        if (field.d != 11) {
            return i();
        }
        if (field.e) {
            zkh.a("Concrete type arrays not supported");
            return false;
        }
        zkh.a("Concrete types not supported");
        return false;
    }

    public abstract boolean i();

    public String toString() {
        Map<String, Field<?, ?>> mapA = a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : mapA.keySet()) {
            Field<?, ?> field = mapA.get(str);
            if (h(field)) {
                Object objJ = j(field, e(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                u4.a(sb, "\"", str, "\":");
                if (objJ != null) {
                    switch (field.d) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objJ, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objJ, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            bu7.a(sb, (HashMap) objJ);
                            break;
                        default:
                            if (field.c) {
                                ArrayList arrayList = (ArrayList) objJ;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        k(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                            } else {
                                k(sb, field, objJ);
                            }
                            break;
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
