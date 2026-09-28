package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class pol0 extends vml0 {
    public static boolean H(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean I(gil0 gil0Var, int i) {
        if (i < ((njl0) gil0Var).c * 64) {
            return ((1 << (i % 64)) & ((Long) ((njl0) gil0Var).get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList J(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static lhl0 O(lhl0 lhl0Var, byte[] bArr) throws oil0 {
        dgl0 dgl0VarB;
        dgl0 dgl0Var = dgl0.b;
        if (dgl0Var == null) {
            synchronized (dgl0.class) {
                try {
                    dgl0VarB = dgl0.b;
                    if (dgl0VarB == null) {
                        cll0 cll0Var = cll0.c;
                        dgl0VarB = tgl0.b();
                        dgl0.b = dgl0VarB;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            dgl0Var = dgl0VarB;
        }
        if (dgl0Var != null) {
            lhl0Var.getClass();
            lhl0Var.k(bArr, bArr.length, dgl0Var);
            return lhl0Var;
        }
        lhl0Var.getClass();
        int length = bArr.length;
        dgl0 dgl0Var2 = dgl0.b;
        cll0 cll0Var2 = cll0.c;
        lhl0Var.k(bArr, length, dgl0.c);
        return lhl0Var;
    }

    public static int P(String str, l8l0 l8l0Var) {
        for (int i = 0; i < ((n8l0) l8l0Var.b).W1(); i++) {
            if (str.equals(((n8l0) l8l0Var.b).X1(i).s())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] Q(iil0 iil0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iil0Var.iterator();
        while (it.hasNext()) {
            k7l0 k7l0Var = (k7l0) it.next();
            if (k7l0Var != null) {
                Bundle bundle = new Bundle();
                for (k7l0 k7l0Var2 : k7l0Var.A()) {
                    if (k7l0Var2.s()) {
                        bundle.putString(k7l0Var2.r(), k7l0Var2.t());
                    } else if (k7l0Var2.u()) {
                        bundle.putLong(k7l0Var2.r(), k7l0Var2.v());
                    } else if (k7l0Var2.y()) {
                        bundle.putDouble(k7l0Var2.r(), k7l0Var2.z());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap R(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(R((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(R((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(R((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static zzbg k(qmk0 qmk0Var) {
        Object obj;
        Bundle bundleL = l(qmk0Var.c, true);
        String string = (!bundleL.containsKey("_o") || (obj = bundleL.get("_o")) == null) ? "app" : obj.toString();
        String strB = ggl0.b(qmk0Var.a, lbl0.a, lbl0.c);
        if (strB == null) {
            strB = qmk0Var.a;
        }
        return new zzbg(strB, new zzbe(bundleL), string, qmk0Var.b);
    }

    public static Bundle l(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(l((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void m(b7l0 b7l0Var, String str, Long l) {
        List listL = b7l0Var.l();
        int i = 0;
        while (true) {
            if (i >= listL.size()) {
                i = -1;
                break;
            } else if (str.equals(((k7l0) listL.get(i)).r())) {
                break;
            } else {
                i++;
            }
        }
        i7l0 i7l0VarC = k7l0.C();
        i7l0VarC.l(str);
        i7l0VarC.n(l.longValue());
        if (i < 0) {
            b7l0Var.p(i7l0VarC);
        } else {
            b7l0Var.g();
            ((d7l0) b7l0Var.b).B(i, (k7l0) i7l0VarC.i());
        }
    }

    public static final Bundle n(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k7l0 k7l0Var = (k7l0) it.next();
            String strR = k7l0Var.r();
            if (k7l0Var.y()) {
                bundle.putDouble(strR, k7l0Var.z());
            } else if (k7l0Var.w()) {
                bundle.putFloat(strR, k7l0Var.x());
            } else if (k7l0Var.s()) {
                bundle.putString(strR, k7l0Var.t());
            } else if (k7l0Var.u()) {
                bundle.putLong(strR, k7l0Var.v());
            }
        }
        return bundle;
    }

    public static final k7l0 o(String str, d7l0 d7l0Var) {
        for (k7l0 k7l0Var : d7l0Var.q()) {
            if (k7l0Var.r().equals(str)) {
                return k7l0Var;
            }
        }
        return null;
    }

    public static final Serializable p(String str, d7l0 d7l0Var) {
        k7l0 k7l0VarO = o(str, d7l0Var);
        if (k7l0VarO == null) {
            return null;
        }
        return v(k7l0VarO);
    }

    public static final void s(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void t(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String u(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable v(k7l0 k7l0Var) {
        if (k7l0Var.s()) {
            return k7l0Var.t();
        }
        if (k7l0Var.u()) {
            return Long.valueOf(k7l0Var.v());
        }
        if (k7l0Var.y()) {
            return Double.valueOf(k7l0Var.z());
        }
        if (k7l0Var.B() > 0) {
            return Q((iil0) k7l0Var.A());
        }
        return null;
    }

    public static final void w(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                t(builder, str3, string, set);
            }
        }
    }

    public static final void x(StringBuilder sb, String str, x8l0 x8l0Var) {
        if (x8l0Var == null) {
            return;
        }
        s(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (x8l0Var.t() != 0) {
            s(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : x8l0Var.s()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (x8l0Var.r() != 0) {
            s(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : x8l0Var.q()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (x8l0Var.v() != 0) {
            s(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (z6l0 z6l0Var : x8l0Var.u()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(z6l0Var.q() ? Integer.valueOf(z6l0Var.r()) : null);
                sb.append(":");
                sb.append(z6l0Var.s() ? Long.valueOf(z6l0Var.t()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (x8l0Var.x() != 0) {
            s(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (b9l0 b9l0Var : x8l0Var.w()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(b9l0Var.q() ? Integer.valueOf(b9l0Var.r()) : null);
                sb.append(": [");
                Iterator it = b9l0Var.s().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        s(3, sb);
        sb.append("}\n");
    }

    public static final void y(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        s(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void z(StringBuilder sb, int i, String str, d2l0 d2l0Var) {
        String str2;
        if (d2l0Var == null) {
            return;
        }
        s(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (d2l0Var.q()) {
            int iA = d2l0Var.A();
            if (iA == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iA == 2) {
                str2 = "LESS_THAN";
            } else if (iA != 3) {
                str2 = iA != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            y(sb, i, "comparison_type", str2);
        }
        if (d2l0Var.r()) {
            y(sb, i, "match_as_float", Boolean.valueOf(d2l0Var.s()));
        }
        if (d2l0Var.t()) {
            y(sb, i, "comparison_value", d2l0Var.u());
        }
        if (d2l0Var.v()) {
            y(sb, i, "min_comparison_value", d2l0Var.w());
        }
        if (d2l0Var.x()) {
            y(sb, i, "max_comparison_value", d2l0Var.y());
        }
        s(i, sb);
        sb.append("}\n");
    }

    public final void A(q9l0 q9l0Var, Object obj) {
        q9l0Var.g();
        ((s9l0) q9l0Var.b).F();
        q9l0Var.g();
        ((s9l0) q9l0Var.b).H();
        q9l0Var.g();
        ((s9l0) q9l0Var.b).J();
        if (obj instanceof String) {
            q9l0Var.g();
            ((s9l0) q9l0Var.b).E((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            q9l0Var.g();
            ((s9l0) q9l0Var.b).G(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            q9l0Var.g();
            ((s9l0) q9l0Var.b).I(dDoubleValue);
        } else {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void B(i7l0 i7l0Var, Object obj) {
        i7l0Var.g();
        ((k7l0) i7l0Var.b).F();
        i7l0Var.g();
        ((k7l0) i7l0Var.b).H();
        i7l0Var.g();
        ((k7l0) i7l0Var.b).J();
        i7l0Var.g();
        ((k7l0) i7l0Var.b).M();
        if (obj instanceof String) {
            i7l0Var.m((String) obj);
            return;
        }
        if (obj instanceof Long) {
            i7l0Var.n(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            i7l0Var.g();
            ((k7l0) i7l0Var.b).I(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                i7l0 i7l0VarC = k7l0.C();
                for (String str : bundle.keySet()) {
                    i7l0 i7l0VarC2 = k7l0.C();
                    i7l0VarC2.l(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        i7l0VarC2.n(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        i7l0VarC2.m((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        i7l0VarC2.g();
                        ((k7l0) i7l0VarC2.b).I(dDoubleValue2);
                    }
                    i7l0VarC.g();
                    ((k7l0) i7l0VarC.b).K((k7l0) i7l0VarC2.i());
                }
                if (((k7l0) i7l0VarC.b).B() > 0) {
                    arrayList.add((k7l0) i7l0VarC.i());
                }
            }
        }
        i7l0Var.g();
        ((k7l0) i7l0Var.b).L(arrayList);
    }

    public final zzoh C(String str, l8l0 l8l0Var, b7l0 b7l0Var, String str2) {
        int iIndexOf;
        kql0.a();
        k8l0 k8l0Var = this.a;
        wok0 wok0Var = k8l0Var.d;
        if (!wok0Var.q(str, v2l0.P0)) {
            return null;
        }
        k8l0Var.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = wok0Var.m(str, v2l0.u0).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                z9l.a(str3, "duplicate element: ");
                return null;
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        iol0 iol0Var = this.b;
        zml0 zml0Var = iol0Var.j;
        e7l0 e7l0Var = iol0Var.a;
        e7l0 e7l0Var2 = zml0Var.b.a;
        iol0.U(e7l0Var2);
        String strT = e7l0Var2.t(str);
        Uri.Builder builder = new Uri.Builder();
        wok0 wok0Var2 = zml0Var.a.d;
        builder.scheme(wok0Var2.m(str, v2l0.n0));
        if (TextUtils.isEmpty(strT)) {
            builder.authority(wok0Var2.m(str, v2l0.o0));
        } else {
            String strM = wok0Var2.m(str, v2l0.o0);
            StringBuilder sb = new StringBuilder(String.valueOf(strT).length() + 1 + String.valueOf(strM).length());
            sb.append(strT);
            sb.append(".");
            sb.append(strM);
            builder.authority(sb.toString());
        }
        builder.path(wok0Var2.m(str, v2l0.p0));
        t(builder, "gmp_app_id", ((n8l0) l8l0Var.b).F(), setUnmodifiableSet);
        wok0Var.l();
        t(builder, "gmp_version", String.valueOf(133005L), setUnmodifiableSet);
        String strZ = ((n8l0) l8l0Var.b).z();
        t2l0 t2l0Var = v2l0.S0;
        if (wok0Var.q(str, t2l0Var)) {
            iol0.U(e7l0Var);
            if (e7l0Var.z(str)) {
                strZ = "";
            }
        }
        t(builder, "app_instance_id", strZ, setUnmodifiableSet);
        t(builder, "rdid", ((n8l0) l8l0Var.b).w(), setUnmodifiableSet);
        t(builder, "bundle_id", l8l0Var.s(), setUnmodifiableSet);
        String strR = b7l0Var.r();
        String strB = ggl0.b(strR, lbl0.c, lbl0.a);
        if (true != TextUtils.isEmpty(strB)) {
            strR = strB;
        }
        t(builder, "app_event_name", strR, setUnmodifiableSet);
        t(builder, "app_version", String.valueOf(((n8l0) l8l0Var.b).L()), setUnmodifiableSet);
        String strJ2 = ((n8l0) l8l0Var.b).j2();
        if (wok0Var.q(str, t2l0Var)) {
            iol0.U(e7l0Var);
            if (e7l0Var.y(str) && !TextUtils.isEmpty(strJ2) && (iIndexOf = strJ2.indexOf(".")) != -1) {
                strJ2 = strJ2.substring(0, iIndexOf);
            }
        }
        t(builder, PublisherMetadata.OS_VERSION, strJ2, setUnmodifiableSet);
        t(builder, EventKeys.TIMESTAMP, String.valueOf(b7l0Var.s()), setUnmodifiableSet);
        if (((n8l0) l8l0Var.b).y()) {
            t(builder, "lat", "1", setUnmodifiableSet);
        }
        t(builder, "privacy_sandbox_version", String.valueOf(((n8l0) l8l0Var.b).H0()), setUnmodifiableSet);
        t(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        t(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        t(builder, "request_uuid", str2, setUnmodifiableSet);
        List<k7l0> listL = b7l0Var.l();
        Bundle bundle = new Bundle();
        for (k7l0 k7l0Var : listL) {
            String strR2 = k7l0Var.r();
            if (k7l0Var.y()) {
                bundle.putString(strR2, String.valueOf(k7l0Var.z()));
            } else if (k7l0Var.w()) {
                bundle.putString(strR2, String.valueOf(k7l0Var.x()));
            } else if (k7l0Var.s()) {
                bundle.putString(strR2, k7l0Var.t());
            } else if (k7l0Var.u()) {
                bundle.putString(strR2, String.valueOf(k7l0Var.v()));
            }
        }
        w(builder, wok0Var.m(str, v2l0.t0).split("\\|"), bundle, setUnmodifiableSet);
        List<s9l0> listUnmodifiableList = Collections.unmodifiableList(((n8l0) l8l0Var.b).V1());
        Bundle bundle2 = new Bundle();
        for (s9l0 s9l0Var : listUnmodifiableList) {
            String strS = s9l0Var.s();
            if (s9l0Var.z()) {
                bundle2.putString(strS, String.valueOf(s9l0Var.A()));
            } else if (s9l0Var.x()) {
                bundle2.putString(strS, String.valueOf(s9l0Var.y()));
            } else if (s9l0Var.t()) {
                bundle2.putString(strS, s9l0Var.u());
            } else if (s9l0Var.v()) {
                bundle2.putString(strS, String.valueOf(s9l0Var.w()));
            }
        }
        w(builder, wok0Var.m(str, v2l0.s0).split("\\|"), bundle2, setUnmodifiableSet);
        t(builder, "dma", true != ((n8l0) l8l0Var.b).E0() ? "0" : "1", setUnmodifiableSet);
        if (!((n8l0) l8l0Var.b).G0().isEmpty()) {
            t(builder, "dma_cps", ((n8l0) l8l0Var.b).G0(), setUnmodifiableSet);
        }
        if (((n8l0) l8l0Var.b).M0()) {
            w5l0 w5l0VarN0 = ((n8l0) l8l0Var.b).N0();
            if (!w5l0VarN0.A().isEmpty()) {
                t(builder, "dl_gclid", w5l0VarN0.A(), setUnmodifiableSet);
            }
            if (!w5l0VarN0.C().isEmpty()) {
                t(builder, "dl_gbraid", w5l0VarN0.C(), setUnmodifiableSet);
            }
            if (!w5l0VarN0.E().isEmpty()) {
                t(builder, "dl_gs", w5l0VarN0.E(), setUnmodifiableSet);
            }
            if (w5l0VarN0.G() > 0) {
                t(builder, "dl_ss_ts", String.valueOf(w5l0VarN0.G()), setUnmodifiableSet);
            }
            if (!w5l0VarN0.I().isEmpty()) {
                t(builder, "mr_gclid", w5l0VarN0.I(), setUnmodifiableSet);
            }
            if (!w5l0VarN0.K().isEmpty()) {
                t(builder, "mr_gbraid", w5l0VarN0.K(), setUnmodifiableSet);
            }
            if (!w5l0VarN0.M().isEmpty()) {
                t(builder, "mr_gs", w5l0VarN0.M(), setUnmodifiableSet);
            }
            if (w5l0VarN0.O() > 0) {
                t(builder, "mr_click_ts", String.valueOf(w5l0VarN0.O()), setUnmodifiableSet);
            }
        }
        return new zzoh(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    public final d7l0 D(isk0 isk0Var) {
        b7l0 b7l0VarA = d7l0.A();
        long j = isk0Var.e;
        b7l0VarA.g();
        ((d7l0) b7l0VarA.b).I(j);
        Bundle bundle = isk0Var.f.a;
        for (String str : bundle.keySet()) {
            i7l0 i7l0VarC = k7l0.C();
            i7l0VarC.l(str);
            Object obj = bundle.get(str);
            hm20.h(obj);
            B(i7l0VarC, obj);
            b7l0VarA.p(i7l0VarC);
        }
        String str2 = isk0Var.c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            i7l0 i7l0VarC2 = k7l0.C();
            i7l0VarC2.l("_o");
            i7l0VarC2.m(str2);
            b7l0VarA.o((k7l0) i7l0VarC2.i());
        }
        return (d7l0) b7l0VarA.i();
    }

    public final String E(j8l0 j8l0Var) {
        String str;
        String str2;
        String str3;
        e6l0 e6l0VarJ0;
        StringBuilder sbA = y4s.a("\nbatch {\n");
        if (j8l0Var.v()) {
            y(sbA, 0, "upload_subdomain", j8l0Var.w());
        }
        if (j8l0Var.t()) {
            y(sbA, 0, "sgtm_join_id", j8l0Var.u());
        }
        for (n8l0 n8l0Var : j8l0Var.q()) {
            if (n8l0Var != null) {
                s(1, sbA);
                sbA.append("bundle {\n");
                if (n8l0Var.Q()) {
                    y(sbA, 1, "protocol_version", Integer.valueOf(n8l0Var.Q0()));
                }
                k8l0 k8l0Var = this.a;
                wok0 wok0Var = k8l0Var.d;
                k4l0 k4l0Var = k8l0Var.j;
                if (wok0Var.q(n8l0Var.q(), v2l0.M0) && n8l0Var.w0()) {
                    y(sbA, 1, "session_stitching_token", n8l0Var.x0());
                }
                y(sbA, 1, "platform", n8l0Var.i2());
                if (n8l0Var.s()) {
                    y(sbA, 1, "gmp_version", Long.valueOf(n8l0Var.t()));
                }
                if (n8l0Var.u()) {
                    y(sbA, 1, "uploading_gmp_version", Long.valueOf(n8l0Var.v()));
                }
                if (n8l0Var.s0()) {
                    y(sbA, 1, "dynamite_version", Long.valueOf(n8l0Var.t0()));
                }
                if (n8l0Var.M()) {
                    y(sbA, 1, "config_version", Long.valueOf(n8l0Var.N()));
                }
                y(sbA, 1, "gmp_app_id", n8l0Var.F());
                y(sbA, 1, PublisherMetadata.APP_ID, n8l0Var.q());
                y(sbA, 1, "app_version", n8l0Var.r());
                if (n8l0Var.K()) {
                    y(sbA, 1, "app_version_major", Integer.valueOf(n8l0Var.L()));
                }
                y(sbA, 1, "firebase_instance_id", n8l0Var.J());
                if (n8l0Var.A()) {
                    y(sbA, 1, "dev_cert_hash", Long.valueOf(n8l0Var.B()));
                }
                y(sbA, 1, "app_store", n8l0Var.o2());
                if (n8l0Var.Y1()) {
                    y(sbA, 1, "upload_timestamp_millis", Long.valueOf(n8l0Var.Z1()));
                }
                if (n8l0Var.a2()) {
                    y(sbA, 1, "start_timestamp_millis", Long.valueOf(n8l0Var.b2()));
                }
                if (n8l0Var.c2()) {
                    y(sbA, 1, "end_timestamp_millis", Long.valueOf(n8l0Var.d2()));
                }
                if (n8l0Var.e2()) {
                    y(sbA, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(n8l0Var.f2()));
                }
                if (n8l0Var.g2()) {
                    y(sbA, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(n8l0Var.h2()));
                }
                y(sbA, 1, "app_instance_id", n8l0Var.z());
                y(sbA, 1, "resettable_device_id", n8l0Var.w());
                y(sbA, 1, "ds_id", n8l0Var.P());
                if (n8l0Var.x()) {
                    y(sbA, 1, "limited_ad_tracking", Boolean.valueOf(n8l0Var.y()));
                }
                y(sbA, 1, PublisherMetadata.OS_VERSION, n8l0Var.j2());
                y(sbA, 1, PublisherMetadata.DEVICE_MODEL, n8l0Var.k2());
                y(sbA, 1, "user_default_language", n8l0Var.l2());
                if (n8l0Var.m2()) {
                    y(sbA, 1, "time_zone_offset_minutes", Integer.valueOf(n8l0Var.n2()));
                }
                if (n8l0Var.C()) {
                    y(sbA, 1, "bundle_sequential_index", Integer.valueOf(n8l0Var.D()));
                }
                if (n8l0Var.K0()) {
                    y(sbA, 1, "delivery_index", Integer.valueOf(n8l0Var.L0()));
                }
                if (n8l0Var.G()) {
                    y(sbA, 1, "service_upload", Boolean.valueOf(n8l0Var.H()));
                }
                y(sbA, 1, "health_monitor", n8l0Var.E());
                if (n8l0Var.q0()) {
                    y(sbA, 1, "retry_counter", Integer.valueOf(n8l0Var.r0()));
                }
                if (n8l0Var.u0()) {
                    y(sbA, 1, "consent_signals", n8l0Var.v0());
                }
                if (n8l0Var.D0()) {
                    y(sbA, 1, "is_dma_region", Boolean.valueOf(n8l0Var.E0()));
                }
                if (n8l0Var.F0()) {
                    y(sbA, 1, "core_platform_services", n8l0Var.G0());
                }
                if (n8l0Var.B0()) {
                    y(sbA, 1, "consent_diagnostics", n8l0Var.C0());
                }
                if (n8l0Var.y0()) {
                    y(sbA, 1, "target_os_version", Long.valueOf(n8l0Var.z0()));
                }
                kql0.a();
                if (k8l0Var.d.q(n8l0Var.q(), v2l0.P0)) {
                    y(sbA, 1, "ad_services_version", Integer.valueOf(n8l0Var.H0()));
                    if (n8l0Var.I0() && (e6l0VarJ0 = n8l0Var.J0()) != null) {
                        s(2, sbA);
                        sbA.append("attribution_eligibility_status {\n");
                        y(sbA, 2, "eligible", Boolean.valueOf(e6l0VarJ0.q()));
                        y(sbA, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(e6l0VarJ0.r()));
                        y(sbA, 2, "pre_r", Boolean.valueOf(e6l0VarJ0.s()));
                        y(sbA, 2, "r_extensions_too_old", Boolean.valueOf(e6l0VarJ0.t()));
                        y(sbA, 2, "adservices_extension_too_old", Boolean.valueOf(e6l0VarJ0.u()));
                        y(sbA, 2, "ad_storage_not_allowed", Boolean.valueOf(e6l0VarJ0.v()));
                        y(sbA, 2, "measurement_manager_disabled", Boolean.valueOf(e6l0VarJ0.w()));
                        s(2, sbA);
                        sbA.append("}\n");
                    }
                }
                if (n8l0Var.M0()) {
                    w5l0 w5l0VarN0 = n8l0Var.N0();
                    s(2, sbA);
                    sbA.append("ad_campaign_info {\n");
                    if (w5l0VarN0.z()) {
                        y(sbA, 2, "deep_link_gclid", w5l0VarN0.A());
                    }
                    if (w5l0VarN0.B()) {
                        y(sbA, 2, "deep_link_gbraid", w5l0VarN0.C());
                    }
                    if (w5l0VarN0.D()) {
                        y(sbA, 2, "deep_link_gad_source", w5l0VarN0.E());
                    }
                    if (w5l0VarN0.F()) {
                        y(sbA, 2, "deep_link_session_millis", Long.valueOf(w5l0VarN0.G()));
                    }
                    if (w5l0VarN0.H()) {
                        y(sbA, 2, "market_referrer_gclid", w5l0VarN0.I());
                    }
                    if (w5l0VarN0.J()) {
                        y(sbA, 2, "market_referrer_gbraid", w5l0VarN0.K());
                    }
                    if (w5l0VarN0.L()) {
                        y(sbA, 2, "market_referrer_gad_source", w5l0VarN0.M());
                    }
                    if (w5l0VarN0.N()) {
                        y(sbA, 2, "market_referrer_click_millis", Long.valueOf(w5l0VarN0.O()));
                    }
                    s(2, sbA);
                    sbA.append("}\n");
                }
                if (n8l0Var.R()) {
                    y(sbA, 1, "batching_timestamp_millis", Long.valueOf(n8l0Var.S()));
                }
                if (n8l0Var.O0()) {
                    o9l0 o9l0VarP0 = n8l0Var.P0();
                    s(2, sbA);
                    sbA.append("sgtm_diagnostics {\n");
                    int iU = o9l0VarP0.u();
                    if (iU == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iU == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iU != 3) {
                        str2 = iU != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    y(sbA, 2, "upload_type", str2);
                    y(sbA, 2, "client_upload_eligibility", fl40.d(o9l0VarP0.q()));
                    int iV = o9l0VarP0.v();
                    if (iV == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iV == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iV == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iV != 4) {
                        str3 = iV != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    y(sbA, 2, "service_upload_eligibility", str3);
                    s(2, sbA);
                    sbA.append("}\n");
                }
                if (n8l0Var.T()) {
                    v6l0 v6l0VarU = n8l0Var.U();
                    s(2, sbA);
                    sbA.append("consent_info_extra {\n");
                    for (q6l0 q6l0Var : v6l0VarU.q()) {
                        s(3, sbA);
                        sbA.append("limited_data_modes {\n");
                        int iR = q6l0Var.r();
                        if (iR == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iR == 2) {
                            str = "AD_STORAGE";
                        } else if (iR != 3) {
                            str = iR != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        y(sbA, 3, "type", str);
                        int iS = q6l0Var.s();
                        y(sbA, 3, "mode", iS != 1 ? iS != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        s(3, sbA);
                        sbA.append("}\n");
                    }
                    s(2, sbA);
                    sbA.append("}\n");
                }
                iil0<s9l0> iil0VarV1 = n8l0Var.V1();
                if (iil0VarV1 != null) {
                    for (s9l0 s9l0Var : iil0VarV1) {
                        if (s9l0Var != null) {
                            s(2, sbA);
                            sbA.append("user_property {\n");
                            y(sbA, 2, "set_timestamp_millis", s9l0Var.q() ? Long.valueOf(s9l0Var.r()) : null);
                            y(sbA, 2, "name", k4l0Var.c(s9l0Var.s()));
                            y(sbA, 2, "string_value", s9l0Var.u());
                            y(sbA, 2, "int_value", s9l0Var.v() ? Long.valueOf(s9l0Var.w()) : null);
                            y(sbA, 2, "double_value", s9l0Var.z() ? Double.valueOf(s9l0Var.A()) : null);
                            s(2, sbA);
                            sbA.append("}\n");
                        }
                    }
                }
                iil0<i6l0> iil0VarI = n8l0Var.I();
                if (iil0VarI != null) {
                    for (i6l0 i6l0Var : iil0VarI) {
                        if (i6l0Var != null) {
                            s(2, sbA);
                            sbA.append("audience_membership {\n");
                            if (i6l0Var.q()) {
                                y(sbA, 2, "audience_id", Integer.valueOf(i6l0Var.r()));
                            }
                            if (i6l0Var.v()) {
                                y(sbA, 2, "new_audience", Boolean.valueOf(i6l0Var.w()));
                            }
                            x(sbA, "current_data", i6l0Var.s());
                            if (i6l0Var.t()) {
                                x(sbA, "previous_data", i6l0Var.u());
                            }
                            s(2, sbA);
                            sbA.append("}\n");
                        }
                    }
                }
                List<d7l0> listQ1 = n8l0Var.Q1();
                if (listQ1 != null) {
                    for (d7l0 d7l0Var : listQ1) {
                        if (d7l0Var != null) {
                            s(2, sbA);
                            sbA.append("event {\n");
                            y(sbA, 2, "name", k4l0Var.a(d7l0Var.t()));
                            if (d7l0Var.u()) {
                                y(sbA, 2, "timestamp_millis", Long.valueOf(d7l0Var.v()));
                            }
                            if (d7l0Var.w()) {
                                y(sbA, 2, "previous_timestamp_millis", Long.valueOf(d7l0Var.x()));
                            }
                            if (d7l0Var.y()) {
                                y(sbA, 2, "count", Integer.valueOf(d7l0Var.z()));
                            }
                            if (d7l0Var.r() != 0) {
                                q(sbA, 2, (iil0) d7l0Var.q());
                            }
                            s(2, sbA);
                            sbA.append("}\n");
                        }
                    }
                }
                s(1, sbA);
                sbA.append("}\n");
            }
        }
        sbA.append("} // End-of-batch\n");
        return sbA.toString();
    }

    public final String F(g2l0 g2l0Var) {
        StringBuilder sbA = y4s.a("\nproperty_filter {\n");
        if (g2l0Var.q()) {
            y(sbA, 0, "filter_id", Integer.valueOf(g2l0Var.r()));
        }
        y(sbA, 0, "property_name", this.a.j.c(g2l0Var.s()));
        String strU = u(g2l0Var.u(), g2l0Var.v(), g2l0Var.x());
        if (!strU.isEmpty()) {
            y(sbA, 0, "filter_type", strU);
        }
        r(sbA, 1, g2l0Var.t());
        sbA.append("}\n");
        return sbA.toString();
    }

    public final Parcelable G(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (tr60.a unused) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    public final List K(gil0 gil0Var, List list) {
        int i;
        ArrayList arrayList = new ArrayList(gil0Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            k8l0 k8l0Var = this.a;
            if (iIntValue < 0) {
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.m(y4l0Var);
                y4l0Var.i.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue2 = num.intValue() / 64;
                if (iIntValue2 >= arrayList.size()) {
                    y4l0 y4l0Var2 = k8l0Var.f;
                    k8l0.m(y4l0Var2);
                    y4l0Var2.i.c(num, "Ignoring bit index greater than bitSet size", Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue2, Long.valueOf(((Long) arrayList.get(iIntValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final boolean L(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        this.a.k.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public final long M(byte[] bArr) {
        hm20.h(bArr);
        k8l0 k8l0Var = this.a;
        yol0 yol0Var = k8l0Var.i;
        k8l0.k(yol0Var);
        yol0Var.g();
        MessageDigest messageDigestX = yol0.x();
        if (messageDigestX != null) {
            return yol0.y(messageDigestX.digest(bArr));
        }
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        y4l0Var.f.a("Failed to get MD5");
        return 0L;
    }

    public final byte[] N(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.b(e, "Failed to gzip content");
            throw e;
        }
    }

    public final void q(StringBuilder sb, int i, iil0 iil0Var) {
        if (iil0Var == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = iil0Var.iterator();
        while (it.hasNext()) {
            k7l0 k7l0Var = (k7l0) it.next();
            if (k7l0Var != null) {
                s(i2, sb);
                sb.append("param {\n");
                y(sb, i2, "name", k7l0Var.q() ? this.a.j.b(k7l0Var.r()) : null);
                y(sb, i2, "string_value", k7l0Var.s() ? k7l0Var.t() : null);
                y(sb, i2, "int_value", k7l0Var.u() ? Long.valueOf(k7l0Var.v()) : null);
                y(sb, i2, "double_value", k7l0Var.y() ? Double.valueOf(k7l0Var.z()) : null);
                if (k7l0Var.B() > 0) {
                    q(sb, i2, (iil0) k7l0Var.A());
                }
                s(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public final void r(StringBuilder sb, int i, z1l0 z1l0Var) {
        String str;
        if (z1l0Var == null) {
            return;
        }
        s(i, sb);
        sb.append("filter {\n");
        if (z1l0Var.u()) {
            y(sb, i, "complement", Boolean.valueOf(z1l0Var.v()));
        }
        if (z1l0Var.w()) {
            y(sb, i, "param_name", this.a.j.b(z1l0Var.x()));
        }
        if (z1l0Var.q()) {
            int i2 = i + 1;
            k2l0 k2l0VarR = z1l0Var.r();
            if (k2l0VarR != null) {
                s(i2, sb);
                sb.append("string_filter {\n");
                if (k2l0VarR.q()) {
                    switch (k2l0VarR.y()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    y(sb, i2, "match_type", str);
                }
                if (k2l0VarR.r()) {
                    y(sb, i2, "expression", k2l0VarR.s());
                }
                if (k2l0VarR.t()) {
                    y(sb, i2, "case_sensitive", Boolean.valueOf(k2l0VarR.u()));
                }
                if (k2l0VarR.w() > 0) {
                    s(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : k2l0VarR.v()) {
                        s(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                s(i2, sb);
                sb.append("}\n");
            }
        }
        if (z1l0Var.s()) {
            z(sb, i + 1, "number_filter", z1l0Var.t());
        }
        s(i, sb);
        sb.append("}\n");
    }

    @Override // defpackage.vml0
    public final void j() {
    }
}
