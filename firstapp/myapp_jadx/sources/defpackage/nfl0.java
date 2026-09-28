package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.twilio.voice.PublisherMetadata;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes4.dex */
public final class nfl0 extends j3l0 {
    public lel0 c;
    public tnl0 d;
    public final CopyOnWriteArraySet e;
    public boolean f;
    public final AtomicReference g;
    public final Object h;
    public boolean i;
    public int j;
    public dcl0 k;
    public zbl0 l;
    public PriorityQueue m;
    public boolean n;
    public jbl0 o;
    public final AtomicLong p;
    public long q;
    public final utl0 r;
    public boolean s;
    public edl0 t;
    public ffl0 u;
    public vcl0 v;
    public final qdl0 w;

    public nfl0(k8l0 k8l0Var) {
        super(k8l0Var);
        this.e = new CopyOnWriteArraySet();
        this.h = new Object();
        this.i = false;
        this.j = 1;
        this.s = true;
        this.w = new qdl0(this);
        this.g = new AtomicReference();
        this.o = jbl0.c;
        this.q = -1L;
        this.p = new AtomicLong(0L);
        this.r = new utl0(k8l0Var);
    }

    public final void A(Bundle bundle, int i, long j) {
        Boolean bool;
        String string;
        dbl0 dbl0Var;
        Boolean bool2;
        h();
        jbl0 jbl0Var = jbl0.c;
        hbl0[] hbl0VarArr = fbl0.STORAGE.a;
        int length = hbl0VarArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                string = null;
                break;
            }
            String str = hbl0VarArr[i2].a;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    bool2 = Boolean.TRUE;
                } else {
                    bool2 = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool2 == null) {
                    break;
                }
            }
            i2++;
        }
        k8l0 k8l0Var = this.a;
        if (string != null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.k.b(string, "Ignoring invalid consent setting");
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.k.a("Valid consent values are 'granted', 'denied'");
        }
        p7l0 p7l0Var = k8l0Var.g;
        k8l0.m(p7l0Var);
        boolean zM = p7l0Var.m();
        jbl0 jbl0VarB = jbl0.b(i, bundle);
        Iterator it = jbl0VarB.a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            dbl0Var = dbl0.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((dbl0) it.next()) != dbl0Var) {
                C(jbl0VarB, zM);
                break;
            }
        }
        crk0 crk0VarC = crk0.c(i, bundle);
        Iterator it2 = crk0VarC.e.values().iterator();
        while (it2.hasNext()) {
            if (((dbl0) it2.next()) != dbl0Var) {
                B(crk0VarC, zM);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = jbl0.d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zM) {
                r(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                q(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void B(crk0 crk0Var, boolean z) {
        cel0 cel0Var = new cel0(this, crk0Var);
        if (z) {
            g();
            cel0Var.run();
        } else {
            p7l0 p7l0Var = this.a.g;
            k8l0.m(p7l0Var);
            p7l0Var.p(cel0Var);
        }
    }

    public final void C(jbl0 jbl0Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        jbl0 jbl0Var2;
        h();
        int i = jbl0Var.b;
        if (i != -10) {
            dbl0 dbl0Var = (dbl0) jbl0Var.a.get(hbl0.AD_STORAGE);
            if (dbl0Var == null) {
                dbl0Var = dbl0.UNINITIALIZED;
            }
            dbl0 dbl0Var2 = dbl0.UNINITIALIZED;
            if (dbl0Var == dbl0Var2) {
                dbl0 dbl0Var3 = (dbl0) jbl0Var.a.get(hbl0.ANALYTICS_STORAGE);
                if (dbl0Var3 == null) {
                    dbl0Var3 = dbl0Var2;
                }
                if (dbl0Var3 == dbl0Var2) {
                    y4l0 y4l0Var = this.a.f;
                    k8l0.m(y4l0Var);
                    y4l0Var.k.a("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.h) {
            try {
                z2 = false;
                if (jbl0.l(i, this.o.b)) {
                    jbl0 jbl0Var3 = this.o;
                    EnumMap enumMap = jbl0Var.a;
                    hbl0[] hbl0VarArr = (hbl0[]) enumMap.keySet().toArray(new hbl0[0]);
                    int length = hbl0VarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        }
                        hbl0 hbl0Var = hbl0VarArr[i2];
                        dbl0 dbl0Var4 = (dbl0) enumMap.get(hbl0Var);
                        dbl0 dbl0Var5 = (dbl0) jbl0Var3.a.get(hbl0Var);
                        dbl0 dbl0Var6 = dbl0.DENIED;
                        if (dbl0Var4 == dbl0Var6 && dbl0Var5 != dbl0Var6) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                    hbl0 hbl0Var2 = hbl0.ANALYTICS_STORAGE;
                    if (jbl0Var.i(hbl0Var2) && !this.o.i(hbl0Var2)) {
                        z2 = true;
                    }
                    jbl0Var = jbl0Var.k(this.o);
                    this.o = jbl0Var;
                    z4 = z2;
                    z2 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                jbl0Var2 = jbl0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            y4l0 y4l0Var2 = this.a.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.l.b(jbl0Var2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.p.getAndIncrement();
        if (z3) {
            this.g.set(null);
            eel0 eel0Var = new eel0(this, jbl0Var2, andIncrement, z4);
            if (z) {
                g();
                eel0Var.run();
                return;
            } else {
                p7l0 p7l0Var = this.a.g;
                k8l0.m(p7l0Var);
                p7l0Var.r(eel0Var);
                return;
            }
        }
        gel0 gel0Var = new gel0(this, jbl0Var2, andIncrement, z4);
        if (z) {
            g();
            gel0Var.run();
        } else if (i == 30 || i == -10) {
            p7l0 p7l0Var2 = this.a.g;
            k8l0.m(p7l0Var2);
            p7l0Var2.r(gel0Var);
        } else {
            p7l0 p7l0Var3 = this.a.g;
            k8l0.m(p7l0Var3);
            p7l0Var3.p(gel0Var);
        }
    }

    public final void D() {
        kql0.a();
        k8l0 k8l0Var = this.a;
        wok0 wok0Var = k8l0Var.d;
        p7l0 p7l0Var = k8l0Var.g;
        y4l0 y4l0Var = k8l0Var.f;
        if (wok0Var.q(null, v2l0.Q0)) {
            k8l0.m(p7l0Var);
            if (p7l0Var.m()) {
                k8l0.m(y4l0Var);
                y4l0Var.f.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (l9c.c()) {
                k8l0.m(y4l0Var);
                y4l0Var.f.a("Cannot get trigger URIs from main thread");
                return;
            }
            h();
            k8l0.m(y4l0Var);
            y4l0Var.n.a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            k8l0.m(p7l0Var);
            p7l0Var.q(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: zel0
                @Override // java.lang.Runnable
                public final void run() {
                    nfl0 nfl0Var = this.a;
                    j6l0 j6l0Var = nfl0Var.a.e;
                    k8l0.k(j6l0Var);
                    final Bundle bundleA = j6l0Var.n.a();
                    final ikl0 ikl0VarO = nfl0Var.a.o();
                    ikl0VarO.g();
                    ikl0VarO.h();
                    final zzr zzrVarW = ikl0VarO.w(false);
                    final AtomicReference atomicReference2 = atomicReference;
                    ikl0VarO.u(new Runnable() { // from class: akl0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ikl0 ikl0Var = ikl0VarO;
                            AtomicReference atomicReference3 = atomicReference2;
                            zzr zzrVar = zzrVarW;
                            Bundle bundle = bundleA;
                            synchronized (atomicReference3) {
                                try {
                                    o3l0 o3l0Var = ikl0Var.d;
                                    if (o3l0Var != null) {
                                        o3l0Var.J(zzrVar, bundle, new phl0(ikl0Var, atomicReference3));
                                        ikl0Var.t();
                                    } else {
                                        y4l0 y4l0Var2 = ikl0Var.a.f;
                                        k8l0.m(y4l0Var2);
                                        y4l0Var2.f.a("Failed to request trigger URIs; not connected to service");
                                    }
                                } catch (RemoteException e) {
                                    y4l0 y4l0Var3 = ikl0Var.a.f;
                                    k8l0.m(y4l0Var3);
                                    y4l0Var3.f.b(e, "Failed to request trigger URIs; remote exception");
                                    atomicReference3.notifyAll();
                                }
                            }
                        }
                    });
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                k8l0.m(y4l0Var);
                y4l0Var.h.a("Timed out waiting for get trigger URIs");
            } else {
                k8l0.m(p7l0Var);
                p7l0Var.p(new Runnable() { // from class: bfl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        nfl0 nfl0Var = this.a;
                        nfl0Var.g();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        j6l0 j6l0Var = nfl0Var.a.e;
                        k8l0.k(j6l0Var);
                        SparseArray sparseArrayM = j6l0Var.m();
                        for (zzoh zzohVar : list) {
                            int i = zzohVar.c;
                            if (!sparseArrayM.contains(i) || ((Long) sparseArrayM.get(i)).longValue() < zzohVar.b) {
                                nfl0Var.E().add(zzohVar);
                            }
                        }
                        nfl0Var.F();
                    }
                });
            }
        }
    }

    public final PriorityQueue E() {
        PriorityQueue priorityQueue = this.m;
        if (priorityQueue != null) {
            return priorityQueue;
        }
        PriorityQueue priorityQueue2 = new PriorityQueue(Comparator.comparing(cfl0.a, efl0.a));
        this.m = priorityQueue2;
        return priorityQueue2;
    }

    public final void F() {
        zzoh zzohVar;
        g();
        this.n = false;
        if (E().isEmpty() || this.i || (zzohVar = (zzoh) E().poll()) == null) {
            return;
        }
        k8l0 k8l0Var = this.a;
        yol0 yol0Var = k8l0Var.i;
        k8l0.k(yol0Var);
        kiv kivVarA = yol0Var.A();
        if (kivVarA != null) {
            this.i = true;
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            u4l0 u4l0Var = y4l0Var.n;
            String str = zzohVar.a;
            u4l0Var.b(str, "Registering trigger URI");
            qis<Unit> qisVarB = kivVarA.b(Uri.parse(str));
            if (qisVarB != null) {
                qisVarB.k(new rbj.a(qisVarB, new bcl0(this, zzohVar)), new acl0(this));
            } else {
                this.i = false;
                E().add(zzohVar);
            }
        }
    }

    @Override // defpackage.j3l0
    public final boolean j() {
        return false;
    }

    public final void k(jbl0 jbl0Var) {
        g();
        boolean z = (jbl0Var.i(hbl0.ANALYTICS_STORAGE) && jbl0Var.i(hbl0.AD_STORAGE)) || this.a.o().p();
        k8l0 k8l0Var = this.a;
        p7l0 p7l0Var = k8l0Var.g;
        k8l0.m(p7l0Var);
        p7l0Var.g();
        if (z != k8l0Var.z) {
            p7l0 p7l0Var2 = k8l0Var.g;
            k8l0.m(p7l0Var2);
            p7l0Var2.g();
            k8l0Var.z = z;
            j6l0 j6l0Var = this.a.e;
            k8l0.k(j6l0Var);
            j6l0Var.g();
            Boolean boolValueOf = j6l0Var.k().contains("measurement_enabled_from_api") ? Boolean.valueOf(j6l0Var.k().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                x(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r14 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r3 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.String r13, java.lang.String r14, android.os.Bundle r15, boolean r16, boolean r17, long r18) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfl0.l(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void m() {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        yll0 yll0Var;
        yll0 yll0Var2;
        nfl0 nfl0Var;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String strA;
        rcn.a aVar;
        lgh0 it;
        wdl0 wdl0Var;
        d150 d150Var;
        d150 d150VarA;
        wdl0 wdl0Var2;
        g();
        k8l0 k8l0Var = this.a;
        y4l0 y4l0Var = k8l0Var.f;
        xi9 xi9Var = k8l0Var.k;
        k8l0.m(y4l0Var);
        y4l0Var.m.a("Handle tcf update.");
        j6l0 j6l0Var = k8l0Var.e;
        k8l0.k(j6l0Var);
        SharedPreferences sharedPreferencesL = j6l0Var.l();
        HashMap map = new HashMap();
        t2l0 t2l0Var = v2l0.Z0;
        int i10 = 2;
        int i11 = 1;
        if (((Boolean) t2l0Var.a(null)).booleanValue()) {
            c150 c150Var = cml0.a;
            udl0 udl0Var = udl0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            aml0 aml0Var = aml0.a;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(udl0Var, aml0Var);
            udl0 udl0Var2 = udl0.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            aml0 aml0Var2 = aml0.b;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(udl0Var2, aml0Var2);
            udl0 udl0Var3 = udl0.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(udl0Var3, aml0Var);
            udl0 udl0Var4 = udl0.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(udl0Var4, aml0Var);
            udl0 udl0Var5 = udl0.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            List listAsList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, new AbstractMap.SimpleImmutableEntry(udl0Var5, aml0Var2), new AbstractMap.SimpleImmutableEntry(udl0.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, aml0Var2), new AbstractMap.SimpleImmutableEntry(udl0.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, aml0Var2));
            rcn.a aVar2 = new rcn.a(listAsList != null ? listAsList.size() : 4);
            aVar2.c(listAsList);
            d150 d150VarA2 = aVar2.a();
            int i12 = tcn.c;
            tw90 tw90Var = new tw90("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesL.contains("IABTCF_TCString");
            try {
                i5 = sharedPreferencesL.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused) {
                i5 = -1;
            }
            try {
                try {
                    try {
                        try {
                            i6 = sharedPreferencesL.getInt("IABTCF_PolicyVersion", -1);
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                wdl0Var = wdl0.e;
                                d150Var = d150VarA2;
                                if (!zHasNext) {
                                    break;
                                }
                                udl0 udl0Var6 = (udl0) it.next();
                                lgh0 lgh0Var = it;
                                int iZza = udl0Var6.zza();
                                String str2 = strA;
                                int i13 = i8;
                                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 28);
                                sb.append("IABTCF_PublisherRestrictions");
                                sb.append(iZza);
                                String strA2 = cml0.a(sharedPreferencesL, sb.toString());
                                if (TextUtils.isEmpty(strA2) || strA2.length() < 755) {
                                    wdl0Var2 = wdl0Var;
                                } else {
                                    int iDigit = Character.digit(strA2.charAt(754), 10);
                                    wdl0Var2 = wdl0.PURPOSE_RESTRICTION_NOT_ALLOWED;
                                    if (iDigit >= 0 && iDigit <= wdl0.values().length && iDigit != 0) {
                                        if (iDigit == i11) {
                                            wdl0Var = wdl0.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                                        } else if (iDigit == i10) {
                                            wdl0Var = wdl0.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                                        }
                                        wdl0Var2 = wdl0Var;
                                    }
                                }
                                aVar.b(udl0Var6, wdl0Var2);
                                it = lgh0Var;
                                d150VarA2 = d150Var;
                                i8 = i13;
                                strA = str2;
                                i10 = 2;
                                i11 = 1;
                            }
                        } catch (ClassCastException unused2) {
                            i6 = -1;
                        }
                        i9 = sharedPreferencesL.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
                    } catch (ClassCastException unused3) {
                        i9 = -1;
                    }
                    i7 = sharedPreferencesL.getInt("IABTCF_gdprApplies", -1);
                } catch (ClassCastException unused4) {
                    i7 = -1;
                }
                i8 = sharedPreferencesL.getInt("IABTCF_PurposeOneTreatment", -1);
            } catch (ClassCastException unused5) {
                i8 = -1;
            }
            int i14 = i6;
            strA = cml0.a(sharedPreferencesL, "IABTCF_PublisherCC");
            int i15 = i5;
            aVar = new rcn.a(4);
            tcn tcnVarE = d150VarA2.b;
            if (tcnVarE == null) {
                tcnVarE = d150VarA2.e();
                d150VarA2.b = tcnVarE;
            }
            it = tcnVarE.iterator();
            int i16 = i8;
            String str3 = strA;
            d150 d150VarA3 = aVar.a();
            String strA3 = cml0.a(sharedPreferencesL, "IABTCF_PurposeConsents");
            String strA4 = cml0.a(sharedPreferencesL, "IABTCF_VendorConsents");
            boolean z = !TextUtils.isEmpty(strA4) && strA4.length() >= 755 && strA4.charAt(754) == '1';
            String strA5 = cml0.a(sharedPreferencesL, "IABTCF_PurposeLegitimateInterests");
            String strA6 = cml0.a(sharedPreferencesL, "IABTCF_VendorLegitimateInterests");
            boolean z2 = !TextUtils.isEmpty(strA6) && strA6.length() >= 755 && strA6.charAt(754) == '1';
            cArr[0] = '2';
            if (zContains) {
                wdl0 wdl0Var3 = (wdl0) d150VarA3.get(udl0Var);
                wdl0 wdl0Var4 = (wdl0) d150VarA3.get(udl0Var3);
                wdl0 wdl0Var5 = (wdl0) d150VarA3.get(udl0Var4);
                wdl0 wdl0Var6 = (wdl0) d150VarA3.get(udl0Var5);
                rcn.a aVar3 = new rcn.a(4);
                aVar3.b("Version", "2");
                boolean z3 = z;
                aVar3.b("VendorConsent", true != z ? "0" : "1");
                boolean z4 = z2;
                aVar3.b("VendorLegitimateInterest", true != z2 ? "0" : "1");
                aVar3.b("gdprApplies", i7 != 1 ? "0" : "1");
                aVar3.b("EnableAdvertiserConsentMode", i9 != 1 ? "0" : "1");
                aVar3.b("PolicyVersion", String.valueOf(i14));
                aVar3.b("CmpSdkID", String.valueOf(i15));
                aVar3.b("PurposeOneTreatment", i16 != 1 ? "0" : "1");
                aVar3.b("PublisherCC", str3);
                aVar3.b("PublisherRestrictions1", String.valueOf(wdl0Var3 != null ? wdl0Var3.zza() : wdl0Var.zza()));
                aVar3.b("PublisherRestrictions3", String.valueOf(wdl0Var4 != null ? wdl0Var4.zza() : wdl0Var.zza()));
                aVar3.b("PublisherRestrictions4", String.valueOf(wdl0Var5 != null ? wdl0Var5.zza() : wdl0Var.zza()));
                aVar3.b("PublisherRestrictions7", String.valueOf(wdl0Var6 != null ? wdl0Var6.zza() : wdl0Var.zza()));
                aVar3.c(d150.g(4, new Object[]{"Purpose1", cml0.d(udl0Var, strA3, strA5), "Purpose3", cml0.d(udl0Var3, strA3, strA5), "Purpose4", cml0.d(udl0Var4, strA3, strA5), "Purpose7", cml0.d(udl0Var5, strA3, strA5)}, null).entrySet());
                int i17 = i9;
                int i18 = i7;
                aVar3.c(d150.g(5, new Object[]{"AuthorizePurpose1", true != cml0.b(udl0Var, d150Var, d150VarA3, tw90Var, cArr, i17, i18, i16, str3, strA3, strA5, z3, z4) ? "0" : "1", "AuthorizePurpose3", true != cml0.b(udl0Var3, d150Var, d150VarA3, tw90Var, cArr, i17, i18, i16, str3, strA3, strA5, z3, z4) ? "0" : "1", "AuthorizePurpose4", true != cml0.b(udl0Var4, d150Var, d150VarA3, tw90Var, cArr, i17, i18, i16, str3, strA3, strA5, z3, z4) ? "0" : "1", "AuthorizePurpose7", true != cml0.b(udl0Var5, d150Var, d150VarA3, tw90Var, cArr, i17, i18, i16, str3, strA3, strA5, z3, z4) ? "0" : "1", "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                d150VarA = aVar3.a();
            } else {
                d150VarA = d150.i;
            }
            yll0Var = new yll0(d150VarA);
            str = "";
        } else {
            String strA7 = cml0.a(sharedPreferencesL, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(strA7) && strA7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strA7.charAt(754)));
            }
            try {
                i = sharedPreferencesL.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused6) {
                i = -1;
            }
            if (i != -1) {
                map.put("gdprApplies", String.valueOf(i));
            }
            try {
                i2 = sharedPreferencesL.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused7) {
                i2 = -1;
            }
            if (i2 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(i2));
            }
            try {
                i3 = sharedPreferencesL.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused8) {
                i3 = -1;
            }
            if (i3 != -1) {
                map.put("PolicyVersion", String.valueOf(i3));
            }
            String strA8 = cml0.a(sharedPreferencesL, "IABTCF_PurposeConsents");
            if (!str.equals(strA8)) {
                map.put("PurposeConsents", strA8);
            }
            try {
                i4 = sharedPreferencesL.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused9) {
                i4 = -1;
            }
            if (i4 != -1) {
                map.put("CmpSdkID", String.valueOf(i4));
            }
            yll0Var = new yll0(map);
        }
        k8l0.m(y4l0Var);
        u4l0 u4l0Var = y4l0Var.n;
        u4l0Var.b(yll0Var, "Tcf preferences read");
        if (!k8l0Var.d.q(null, t2l0Var)) {
            if (j6l0Var.o(yll0Var)) {
                Bundle bundleB = yll0Var.b();
                k8l0.m(y4l0Var);
                u4l0Var.b(bundleB, "Consent generated from Tcf");
                if (bundleB != Bundle.EMPTY) {
                    xi9Var.getClass();
                    A(bundleB, -30, System.currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", yll0Var.c());
                n(StompClient.DEFAULT_ACK, "_tcf", bundle);
                return;
            }
            return;
        }
        j6l0Var.g();
        String string = j6l0Var.k().getString("stored_tcf_param", str);
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            yll0Var2 = new yll0(map2);
        } else {
            for (String str4 : string.split(";")) {
                String[] strArrSplit = str4.split("=");
                if (strArrSplit.length >= 2 && cml0.a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            yll0Var2 = new yll0(map2);
        }
        if (j6l0Var.o(yll0Var)) {
            Bundle bundleB2 = yll0Var.b();
            k8l0.m(y4l0Var);
            u4l0Var.b(bundleB2, "Consent generated from Tcf");
            if (bundleB2 != Bundle.EMPTY) {
                xi9Var.getClass();
                nfl0Var = this;
                nfl0Var.A(bundleB2, -30, System.currentTimeMillis());
            } else {
                nfl0Var = this;
            }
            Bundle bundle2 = new Bundle();
            HashMap map3 = yll0Var2.a;
            String str5 = (map3.isEmpty() || ((String) map3.get("Version")) != null) ? "0" : "1";
            Bundle bundleB3 = yll0Var.b();
            Bundle bundleB4 = yll0Var2.b();
            bundle2.putString("_tcfm", str5.concat((bundleB3.size() == bundleB4.size() && Objects.equals(bundleB3.getString("ad_storage"), bundleB4.getString("ad_storage")) && Objects.equals(bundleB3.getString("ad_personalization"), bundleB4.getString("ad_personalization")) && Objects.equals(bundleB3.getString("ad_user_data"), bundleB4.getString("ad_user_data"))) ? "0" : "1"));
            String str6 = (String) yll0Var.a.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str6)) {
                str6 = "200000";
            }
            bundle2.putString("_tcfd2", str6);
            bundle2.putString("_tcfd", yll0Var.c());
            nfl0Var.n(StompClient.DEFAULT_ACK, "_tcf", bundle2);
        }
    }

    public final void n(String str, String str2, Bundle bundle) {
        g();
        this.a.k.getClass();
        o(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void o(long j, Bundle bundle, String str, String str2) {
        g();
        boolean z = true;
        if (this.d != null && !yol0.F(str2)) {
            z = false;
        }
        p(str, str2, j, bundle, true, z, true);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0274  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:125:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:130:0x0303  */
    /* JADX WARN: Code duplicated, block: B:131:0x030c  */
    /* JADX WARN: Code duplicated, block: B:138:0x036e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0384  */
    /* JADX WARN: Code duplicated, block: B:142:0x0399  */
    /* JADX WARN: Code duplicated, block: B:145:0x03af  */
    /* JADX WARN: Code duplicated, block: B:147:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:149:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:152:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:153:0x03db  */
    /* JADX WARN: Code duplicated, block: B:155:0x03df  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:158:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:163:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:165:0x0407  */
    /* JADX WARN: Code duplicated, block: B:167:0x040c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0414  */
    /* JADX WARN: Code duplicated, block: B:173:0x0452  */
    /* JADX WARN: Code duplicated, block: B:175:0x0463  */
    /* JADX WARN: Code duplicated, block: B:178:0x0477  */
    /* JADX WARN: Code duplicated, block: B:181:0x0483 A[LOOP:2: B:179:0x047d->B:181:0x0483, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0498 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:93:0x0204  */
    /* JADX WARN: Code duplicated, block: B:94:0x0209  */
    /* JADX WARN: Code duplicated, block: B:97:0x0220  */
    public final void p(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        j6l0 j6l0Var;
        j6l0 j6l0Var2;
        qdl0 qdl0Var;
        boolean z4;
        k8l0 k8l0Var;
        int iL0;
        Bundle bundleO;
        k8l0 k8l0Var2;
        String str3;
        long j2;
        k8l0 k8l0Var3;
        String strA;
        ArrayList arrayList;
        boolean zA;
        long j3;
        nfl0 nfl0Var;
        int i;
        long j4;
        ArrayList arrayList2;
        int size;
        int i2;
        int i3;
        Bundle bundleI;
        String str4;
        Bundle bundle2;
        h4l0 h4l0VarN;
        byte[] bArrMarshall;
        boolean zN;
        Iterator it;
        String str5;
        Object obj;
        Bundle[] bundleArr;
        int length;
        String str6 = str;
        hm20.e(str6);
        hm20.h(bundle);
        g();
        h();
        k8l0 k8l0Var4 = this.a;
        boolean zF = k8l0Var4.f();
        wll0 wll0Var = k8l0Var4.h;
        wok0 wok0Var = k8l0Var4.d;
        Context context = k8l0Var4.a;
        yol0 yol0Var = k8l0Var4.i;
        y4l0 y4l0Var = k8l0Var4.f;
        if (!zF) {
            k8l0.m(y4l0Var);
            y4l0Var.m.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = k8l0Var4.q().k;
        if (list != null && !list.contains(str2)) {
            k8l0.m(y4l0Var);
            y4l0Var.m.c(str2, "Dropping non-safelisted event. event name, origin", str6);
            return;
        }
        if (!this.f) {
            this.f = true;
            try {
                try {
                    (!k8l0Var4.b ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    k8l0.m(y4l0Var);
                    y4l0Var.i.b(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                k8l0.m(y4l0Var);
                y4l0Var.l.a("Tag Manager is not found and thus will not be used");
            }
        }
        k4l0 k4l0Var = k8l0Var4.j;
        j6l0 j6l0Var3 = k8l0Var4.e;
        xi9 xi9Var = k8l0Var4.k;
        if (!wok0Var.q(null, v2l0.f1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            xi9Var.getClass();
            j6l0Var = j6l0Var3;
            r(System.currentTimeMillis(), string, StompClient.DEFAULT_ACK, "_lgclid");
        } else {
            j6l0Var = j6l0Var3;
        }
        if (!z || yol0.j[0].equals(str2)) {
            j6l0Var2 = j6l0Var;
        } else {
            k8l0.k(yol0Var);
            k8l0.k(j6l0Var);
            j6l0Var2 = j6l0Var;
            yol0Var.r(bundle, j6l0Var2.y.a());
        }
        qdl0 qdl0Var2 = this.w;
        if (!z3 && !"_iap".equals(str2)) {
            k8l0.k(yol0Var);
            int i4 = 2;
            if (yol0Var.h0(AnalyticsEvent.BI_TRACKING_KIND_EVENT, str2)) {
                if (yol0Var.j0(AnalyticsEvent.BI_TRACKING_KIND_EVENT, lbl0.a, lbl0.b, str2)) {
                    wok0 wok0Var2 = yol0Var.a.d;
                    if (yol0Var.k0(40, AnalyticsEvent.BI_TRACKING_KIND_EVENT, str2)) {
                        i4 = 0;
                    }
                } else {
                    i4 = 13;
                }
            }
            if (i4 != 0) {
                k8l0.m(y4l0Var);
                y4l0Var.h.b(k4l0Var.a(str2), "Invalid public event name. Event will not be logged (FE)");
                k8l0.k(yol0Var);
                yol0.w(qdl0Var2, null, i4, "_ev", yol0.l(40, str2, true), str2 != null ? str2.length() : 0);
                return;
            }
        }
        khl0 khl0Var = k8l0Var4.l;
        k8l0.l(khl0Var);
        igl0 igl0VarM = khl0Var.m(false);
        if (igl0VarM != null && !bundle.containsKey("_sc")) {
            igl0VarM.d = true;
        }
        yol0.Y(igl0VarM, bundle, z && !z3);
        boolean zEquals = "am".equals(str6);
        boolean zF2 = yol0.F(str2);
        if (z) {
            qdl0Var = qdl0Var2;
            if (this.d != null && !zF2) {
                if (!zEquals) {
                    k8l0.m(y4l0Var);
                    y4l0Var.m.c(k4l0Var.a(str2), "Passing event to registered event handler (FE)", k4l0Var.e(bundle));
                    hm20.h(this.d);
                    tnl0 tnl0Var = this.d;
                    tnl0Var.getClass();
                    try {
                        tnl0Var.a.D(j, bundle, str6, str2);
                        return;
                    } catch (RemoteException e2) {
                        k8l0 k8l0Var5 = tnl0Var.b.a;
                        if (k8l0Var5 != null) {
                            y4l0 y4l0Var2 = k8l0Var5.f;
                            k8l0.m(y4l0Var2);
                            y4l0Var2.i.b(e2, "Event interceptor threw exception");
                            return;
                        }
                        return;
                    }
                }
                z4 = true;
            }
            if (k8l0Var4.h()) {
                k8l0.k(yol0Var);
                k8l0Var = yol0Var.a;
                iL0 = yol0Var.l0(str2);
                if (iL0 != 0) {
                    k8l0.m(y4l0Var);
                    y4l0Var.h.b(k4l0Var.a(str2), "Invalid event name. Event will not be logged (FE)");
                    String strL = yol0.l(40, str2, true);
                    if (str2 != null) {
                        length = str2.length();
                    } else {
                        length = 0;
                    }
                    k8l0.k(yol0Var);
                    yol0.w(qdl0Var, null, iL0, "_ev", strL, length);
                    return;
                }
                bundleO = yol0Var.o(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z3);
                hm20.h(bundleO);
                k8l0.l(khl0Var);
                if (khl0Var.m(false) == null && "_ae".equals(str2)) {
                    k8l0.l(wll0Var);
                    sll0 sll0Var = wll0Var.f;
                    j2 = 0;
                    sll0Var.d.a.k.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    k8l0Var2 = k8l0Var;
                    str3 = "_o";
                    long j5 = jElapsedRealtime - sll0Var.b;
                    sll0Var.b = jElapsedRealtime;
                    if (j5 > 0) {
                        yol0Var.O(bundleO, j5);
                    }
                } else {
                    k8l0Var2 = k8l0Var;
                    str3 = "_o";
                    j2 = 0;
                }
                if (StompClient.DEFAULT_ACK.equals(str6) && "_ssr".equals(str2)) {
                    String string2 = bundleO.getString("_ffr");
                    int i5 = lae0.a;
                    if (string2 == null || string2.trim().isEmpty()) {
                        string2 = null;
                    } else if (string2 != null) {
                        string2 = string2.trim();
                    }
                    j6l0 j6l0Var4 = k8l0Var2.e;
                    k8l0.k(j6l0Var4);
                    if (Objects.equals(string2, j6l0Var4.v.a())) {
                        y4l0 y4l0Var3 = k8l0Var2.f;
                        k8l0.m(y4l0Var3);
                        y4l0Var3.m.a("Not logging duplicate session_start_with_rollout event");
                        return;
                    } else {
                        j6l0 j6l0Var5 = k8l0Var2.e;
                        k8l0.k(j6l0Var5);
                        j6l0Var5.v.b(string2);
                    }
                } else {
                    k8l0Var3 = k8l0Var2;
                    if ("_ae".equals(str2)) {
                        j6l0 j6l0Var6 = k8l0Var3.e;
                        k8l0.k(j6l0Var6);
                        strA = j6l0Var6.v.a();
                        if (!TextUtils.isEmpty(strA)) {
                            bundleO.putString("_ffr", strA);
                        }
                    }
                }
                arrayList = new ArrayList();
                arrayList.add(bundleO);
                if (wok0Var.q(null, v2l0.U0)) {
                    k8l0.l(wll0Var);
                    wll0Var.g();
                    zA = wll0Var.d;
                } else {
                    k8l0.k(j6l0Var2);
                    zA = j6l0Var2.s.a();
                }
                k8l0.k(j6l0Var2);
                if (j6l0Var2.p.a() <= j2 && j6l0Var2.q(j) && zA) {
                    k8l0.m(y4l0Var);
                    y4l0Var.n.a("Current session is expired, remove the session number, ID, and engagement time");
                    xi9Var.getClass();
                    j3 = j2;
                    i = 0;
                    r(System.currentTimeMillis(), null, StompClient.DEFAULT_ACK, "_sid");
                    r(System.currentTimeMillis(), null, StompClient.DEFAULT_ACK, "_sno");
                    r(System.currentTimeMillis(), null, StompClient.DEFAULT_ACK, "_se");
                    nfl0Var = this;
                    j6l0Var2.q.b(j3);
                } else {
                    j3 = j2;
                    nfl0Var = this;
                    i = 0;
                }
                if (bundleO.getLong("extend_session", j3) == 1) {
                    k8l0.m(y4l0Var);
                    y4l0Var.n.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    k8l0.l(wll0Var);
                    j4 = j;
                    wll0Var.e.b(j4);
                } else {
                    j4 = j;
                }
                arrayList2 = new ArrayList(bundleO.keySet());
                Collections.sort(arrayList2);
                size = arrayList2.size();
                for (i2 = i; i2 < size; i2++) {
                    str5 = (String) arrayList2.get(i2);
                    if (str5 != null) {
                        k8l0.k(yol0Var);
                        obj = bundleO.get(str5);
                        if (obj instanceof Bundle) {
                            Bundle[] bundleArr2 = new Bundle[1];
                            bundleArr2[i] = (Bundle) obj;
                            bundleArr = bundleArr2;
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            bundleO.putParcelableArray(str5, bundleArr);
                        }
                    }
                }
                i3 = i;
                while (i3 < arrayList.size()) {
                    bundleI = (Bundle) arrayList.get(i3);
                    if (i3 != 0) {
                        str4 = "_ep";
                    } else {
                        str4 = str2;
                    }
                    String str7 = str3;
                    bundleI.putString(str7, str6);
                    if (z2) {
                        bundleI = yol0Var.I(bundleI);
                    }
                    bundle2 = bundleI;
                    zzbg zzbgVar = new zzbg(str4, new zzbe(bundle2), str6, j4);
                    ikl0 ikl0VarO = k8l0Var4.o();
                    ikl0VarO.getClass();
                    ikl0VarO.g();
                    ikl0VarO.h();
                    ikl0VarO.s();
                    h4l0VarN = ikl0VarO.a.n();
                    h4l0VarN.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    dtk0.a(zzbgVar, parcelObtain, i);
                    bArrMarshall = parcelObtain.marshall();
                    parcelObtain.recycle();
                    if (bArrMarshall.length > 131072) {
                        y4l0 y4l0Var4 = h4l0VarN.a.f;
                        k8l0.m(y4l0Var4);
                        y4l0Var4.g.a("Event is too long for local database. Sending event directly to service");
                        zN = false;
                    } else {
                        zN = h4l0VarN.n(0, bArrMarshall);
                    }
                    ikl0VarO.u(new ril0(ikl0VarO, ikl0VarO.w(true), zN, zzbgVar));
                    if (!z4) {
                        it = nfl0Var.e.iterator();
                        while (it.hasNext()) {
                            ((rbl0) it.next()).a(j, new Bundle(bundle2), str, str2);
                        }
                    }
                    i3++;
                    str6 = str;
                    j4 = j;
                    str3 = str7;
                    i = 0;
                }
                k8l0.l(khl0Var);
                if (khl0Var.m(false) == null && "_ae".equals(str2)) {
                    k8l0.l(wll0Var);
                    xi9Var.getClass();
                    wll0Var.f.a(SystemClock.elapsedRealtime(), true, true);
                    return;
                }
            }
            return;
        }
        qdl0Var = qdl0Var2;
        z4 = zEquals;
        if (k8l0Var4.h()) {
            return;
        }
        k8l0.k(yol0Var);
        k8l0Var = yol0Var.a;
        iL0 = yol0Var.l0(str2);
        if (iL0 != 0) {
            k8l0.m(y4l0Var);
            y4l0Var.h.b(k4l0Var.a(str2), "Invalid event name. Event will not be logged (FE)");
            String strL2 = yol0.l(40, str2, true);
            if (str2 != null) {
                length = str2.length();
            } else {
                length = 0;
            }
            k8l0.k(yol0Var);
            yol0.w(qdl0Var, null, iL0, "_ev", strL2, length);
            return;
        }
        bundleO = yol0Var.o(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z3);
        hm20.h(bundleO);
        k8l0.l(khl0Var);
        if (khl0Var.m(false) == null) {
            k8l0Var2 = k8l0Var;
            str3 = "_o";
            j2 = 0;
        } else {
            k8l0Var2 = k8l0Var;
            str3 = "_o";
            j2 = 0;
        }
        if (StompClient.DEFAULT_ACK.equals(str6)) {
            k8l0Var3 = k8l0Var2;
            if ("_ae".equals(str2)) {
                j6l0 j6l0Var7 = k8l0Var3.e;
                k8l0.k(j6l0Var7);
                strA = j6l0Var7.v.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleO.putString("_ffr", strA);
                }
            }
        } else {
            k8l0Var3 = k8l0Var2;
            if ("_ae".equals(str2)) {
                j6l0 j6l0Var8 = k8l0Var3.e;
                k8l0.k(j6l0Var8);
                strA = j6l0Var8.v.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleO.putString("_ffr", strA);
                }
            }
        }
        arrayList = new ArrayList();
        arrayList.add(bundleO);
        if (wok0Var.q(null, v2l0.U0)) {
            k8l0.l(wll0Var);
            wll0Var.g();
            zA = wll0Var.d;
        } else {
            k8l0.k(j6l0Var2);
            zA = j6l0Var2.s.a();
        }
        k8l0.k(j6l0Var2);
        if (j6l0Var2.p.a() <= j2) {
            j3 = j2;
            nfl0Var = this;
            i = 0;
        } else {
            j3 = j2;
            nfl0Var = this;
            i = 0;
        }
        if (bundleO.getLong("extend_session", j3) == 1) {
            k8l0.m(y4l0Var);
            y4l0Var.n.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
            k8l0.l(wll0Var);
            j4 = j;
            wll0Var.e.b(j4);
        } else {
            j4 = j;
        }
        arrayList2 = new ArrayList(bundleO.keySet());
        Collections.sort(arrayList2);
        size = arrayList2.size();
        while (i2 < size) {
            str5 = (String) arrayList2.get(i2);
            if (str5 != null) {
                k8l0.k(yol0Var);
                obj = bundleO.get(str5);
                if (obj instanceof Bundle) {
                    Bundle[] bundleArr3 = new Bundle[1];
                    bundleArr3[i] = (Bundle) obj;
                    bundleArr = bundleArr3;
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                    bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr2, parcelableArr2.length, Bundle[].class);
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList4 = (ArrayList) obj;
                    bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                } else {
                    bundleArr = null;
                }
                if (bundleArr != null) {
                    bundleO.putParcelableArray(str5, bundleArr);
                }
            }
        }
        i3 = i;
        while (i3 < arrayList.size()) {
            bundleI = (Bundle) arrayList.get(i3);
            if (i3 != 0) {
                str4 = "_ep";
            } else {
                str4 = str2;
            }
            String str8 = str3;
            bundleI.putString(str8, str6);
            if (z2) {
                bundleI = yol0Var.I(bundleI);
            }
            bundle2 = bundleI;
            zzbg zzbgVar2 = new zzbg(str4, new zzbe(bundle2), str6, j4);
            ikl0 ikl0VarO2 = k8l0Var4.o();
            ikl0VarO2.getClass();
            ikl0VarO2.g();
            ikl0VarO2.h();
            ikl0VarO2.s();
            h4l0VarN = ikl0VarO2.a.n();
            h4l0VarN.getClass();
            Parcel parcelObtain2 = Parcel.obtain();
            dtk0.a(zzbgVar2, parcelObtain2, i);
            bArrMarshall = parcelObtain2.marshall();
            parcelObtain2.recycle();
            if (bArrMarshall.length > 131072) {
                y4l0 y4l0Var5 = h4l0VarN.a.f;
                k8l0.m(y4l0Var5);
                y4l0Var5.g.a("Event is too long for local database. Sending event directly to service");
                zN = false;
            } else {
                zN = h4l0VarN.n(0, bArrMarshall);
            }
            ikl0VarO2.u(new ril0(ikl0VarO2, ikl0VarO2.w(true), zN, zzbgVar2));
            if (!z4) {
                it = nfl0Var.e.iterator();
                while (it.hasNext()) {
                    ((rbl0) it.next()).a(j, new Bundle(bundle2), str, str2);
                }
            }
            i3++;
            str6 = str;
            j4 = j;
            str3 = str8;
            i = 0;
        }
        k8l0.l(khl0Var);
        if (khl0Var.m(false) == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final void q(String str, String str2, Object obj, boolean z, long j) {
        int iM0;
        int length;
        k8l0 k8l0Var = this.a;
        if (z) {
            yol0 yol0Var = k8l0Var.i;
            k8l0.k(yol0Var);
            iM0 = yol0Var.m0(str2);
        } else {
            yol0 yol0Var2 = k8l0Var.i;
            k8l0.k(yol0Var2);
            if (!yol0Var2.h0("user property", str2)) {
                iM0 = 6;
            } else if (yol0Var2.j0("user property", obl0.a, null, str2)) {
                wok0 wok0Var = yol0Var2.a.d;
                if (yol0Var2.k0(24, "user property", str2)) {
                    iM0 = 0;
                } else {
                    iM0 = 6;
                }
            } else {
                iM0 = 15;
            }
        }
        qdl0 qdl0Var = this.w;
        if (iM0 != 0) {
            k8l0.k(k8l0Var.i);
            String strL = yol0.l(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            k8l0.k(k8l0Var.i);
            yol0.w(qdl0Var, null, iM0, "_ev", strL, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            String str4 = str3;
            p7l0 p7l0Var = k8l0Var.g;
            k8l0.m(p7l0Var);
            p7l0Var.p(new zcl0(this, str4, str2, null, j));
            return;
        }
        yol0 yol0Var3 = k8l0Var.i;
        yol0 yol0Var4 = k8l0Var.i;
        k8l0.k(yol0Var3);
        int iT = yol0Var3.t(obj, str2);
        if (iT != 0) {
            k8l0.k(yol0Var4);
            String strL2 = yol0.l(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            k8l0.k(yol0Var4);
            yol0.w(qdl0Var, null, iT, "_ev", strL2, length);
            return;
        }
        k8l0.k(yol0Var4);
        Object objU = yol0Var4.u(obj, str2);
        if (objU != null) {
            p7l0 p7l0Var2 = k8l0Var.g;
            k8l0.m(p7l0Var2);
            p7l0Var2.p(new zcl0(this, str3, str2, objU, j));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    public final void r(long j, Object obj, String str, String str2) {
        boolean zN;
        hm20.e(str);
        hm20.e(str2);
        g();
        h();
        boolean zEquals = "allow_personalized_ads".equals(str2);
        k8l0 k8l0Var = this.a;
        if (zEquals) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j2 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    obj = Long.valueOf(j2);
                    j6l0 j6l0Var = k8l0Var.e;
                    k8l0.k(j6l0Var);
                    j6l0Var.m.b(j2 == 1 ? "true" : "false");
                } else if (obj == null) {
                    j6l0 j6l0Var2 = k8l0Var.e;
                    k8l0.k(j6l0Var2);
                    j6l0Var2.m.b("unset");
                }
                str2 = "_npa";
            } else if (obj == null) {
                j6l0 j6l0Var3 = k8l0Var.e;
                k8l0.k(j6l0Var3);
                j6l0Var3.m.b("unset");
                str2 = "_npa";
            }
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.n.c("non_personalized_ads(_npa)", "Setting user property(FE)", obj);
        }
        Object obj2 = obj;
        String str4 = str2;
        if (!k8l0Var.f()) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.n.a("User property not set since app measurement is disabled");
            return;
        }
        if (k8l0Var.h()) {
            zzpl zzplVar = new zzpl(j, obj2, str4, str);
            ikl0 ikl0VarO = k8l0Var.o();
            ikl0VarO.g();
            ikl0VarO.h();
            ikl0VarO.s();
            h4l0 h4l0VarN = ikl0VarO.a.n();
            h4l0VarN.getClass();
            Parcel parcelObtain = Parcel.obtain();
            sol0.a(zzplVar, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                y4l0 y4l0Var3 = h4l0VarN.a.f;
                k8l0.m(y4l0Var3);
                y4l0Var3.g.a("User property too long for local database. Sending directly to service");
                zN = false;
            } else {
                zN = h4l0VarN.n(1, bArrMarshall);
            }
            ikl0VarO.u(new uhl0(ikl0VarO, ikl0VarO.w(true), zN, zzplVar));
        }
    }

    public final void s() {
        g();
        h();
        k8l0 k8l0Var = this.a;
        if (k8l0Var.h()) {
            wok0 wok0Var = k8l0Var.d;
            wok0Var.a.getClass();
            Boolean boolS = wok0Var.s("google_analytics_deferred_deep_link_enabled");
            if (boolS != null && boolS.booleanValue()) {
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.m(y4l0Var);
                y4l0Var.m.a("Deferred Deep Link feature enabled.");
                p7l0 p7l0Var = k8l0Var.g;
                k8l0.m(p7l0Var);
                p7l0Var.p(new Runnable() { // from class: kfl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        nfl0 nfl0Var = this.a;
                        nfl0Var.g();
                        k8l0 k8l0Var2 = nfl0Var.a;
                        j6l0 j6l0Var = k8l0Var2.e;
                        y4l0 y4l0Var2 = k8l0Var2.f;
                        k8l0.k(j6l0Var);
                        z5l0 z5l0Var = j6l0Var.t;
                        if (z5l0Var.a()) {
                            k8l0.m(y4l0Var2);
                            y4l0Var2.m.a("Deferred Deep Link already retrieved. Not fetching again.");
                            return;
                        }
                        d6l0 d6l0Var = j6l0Var.u;
                        long jA = d6l0Var.a();
                        d6l0Var.b(1 + jA);
                        if (jA >= 5) {
                            k8l0.m(y4l0Var2);
                            y4l0Var2.i.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                            z5l0Var.b(true);
                        } else {
                            edl0 edl0Var = nfl0Var.t;
                            if (edl0Var == null) {
                                edl0Var = new edl0(nfl0Var, k8l0Var2);
                                nfl0Var.t = edl0Var;
                            }
                            edl0Var.b(0L);
                        }
                    }
                });
            }
            ikl0 ikl0VarO = k8l0Var.o();
            ikl0VarO.g();
            ikl0VarO.h();
            zzr zzrVarW = ikl0VarO.w(true);
            ikl0VarO.s();
            k8l0 k8l0Var2 = ikl0VarO.a;
            k8l0Var2.d.q(null, v2l0.b1);
            k8l0Var2.n().n(3, new byte[0]);
            ikl0VarO.u(new ail0(ikl0VarO, zzrVarW));
            this.s = false;
            j6l0 j6l0Var = k8l0Var.e;
            k8l0.k(j6l0Var);
            j6l0Var.g();
            String string = j6l0Var.k().getString("previous_os_version", null);
            j6l0Var.a.p().i();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = j6l0Var.k().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            k8l0Var.p().i();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            n(StompClient.DEFAULT_ACK, "_ou", bundle);
        }
    }

    public final void u(String str, String str2, Bundle bundle) {
        k8l0 k8l0Var = this.a;
        k8l0Var.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        hm20.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        p7l0 p7l0Var = k8l0Var.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new jdl0(this, bundle2));
    }

    public final String v() {
        k8l0 k8l0Var = this.a;
        try {
            return ggl0.a(k8l0Var.a, k8l0Var.p);
        } catch (IllegalStateException e) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.b(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void w(jbl0 jbl0Var, long j, boolean z) {
        int i = jbl0Var.b;
        g();
        h();
        k8l0 k8l0Var = this.a;
        j6l0 j6l0Var = k8l0Var.e;
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.k(j6l0Var);
        jbl0 jbl0VarN = j6l0Var.n();
        if (j <= this.q && jbl0.l(jbl0VarN.b, i)) {
            k8l0.m(y4l0Var);
            y4l0Var.l.b(jbl0Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        j6l0 j6l0Var2 = k8l0Var.e;
        k8l0.k(j6l0Var2);
        j6l0Var2.g();
        if (!jbl0.l(i, j6l0Var2.k().getInt("consent_source", 100))) {
            k8l0.m(y4l0Var);
            y4l0Var.l.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = j6l0Var2.k().edit();
        editorEdit.putString("consent_settings", jbl0Var.g());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        k8l0.m(y4l0Var);
        y4l0Var.n.b(jbl0Var, "Setting storage consent(FE)");
        this.q = j;
        if (k8l0Var.o().q()) {
            final ikl0 ikl0VarO = k8l0Var.o();
            ikl0VarO.g();
            ikl0VarO.h();
            ikl0VarO.u(new Runnable() { // from class: gkl0
                @Override // java.lang.Runnable
                public final void run() {
                    ikl0 ikl0Var = ikl0VarO;
                    k8l0 k8l0Var2 = ikl0Var.a;
                    o3l0 o3l0Var = ikl0Var.d;
                    if (o3l0Var == null) {
                        y4l0 y4l0Var2 = k8l0Var2.f;
                        k8l0.m(y4l0Var2);
                        y4l0Var2.f.a("Failed to send storage consent settings to service");
                        return;
                    }
                    try {
                        o3l0Var.n(ikl0Var.w(false));
                        ikl0Var.t();
                    } catch (RemoteException e) {
                        y4l0 y4l0Var3 = k8l0Var2.f;
                        k8l0.m(y4l0Var3);
                        y4l0Var3.f.b(e, "Failed to send storage consent settings to the service");
                    }
                }
            });
        } else {
            ikl0 ikl0VarO2 = k8l0Var.o();
            ikl0VarO2.g();
            ikl0VarO2.h();
            if (ikl0VarO2.p()) {
                ikl0VarO2.u(new pil0(ikl0VarO2, ikl0VarO2.w(false)));
            }
        }
        if (z) {
            k8l0Var.o().k(new AtomicReference());
        }
    }

    public final void x(Boolean bool, boolean z) {
        g();
        h();
        k8l0 k8l0Var = this.a;
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        y4l0Var.m.b(bool, "Setting app measurement enabled (FE)");
        j6l0 j6l0Var = k8l0Var.e;
        k8l0.k(j6l0Var);
        j6l0Var.g();
        SharedPreferences.Editor editorEdit = j6l0Var.k().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            j6l0Var.g();
            SharedPreferences.Editor editorEdit2 = j6l0Var.k().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        p7l0 p7l0Var = k8l0Var.g;
        k8l0.m(p7l0Var);
        p7l0Var.g();
        if (k8l0Var.z || !(bool == null || bool.booleanValue())) {
            y();
        }
    }

    public final void y() {
        g();
        k8l0 k8l0Var = this.a;
        j6l0 j6l0Var = k8l0Var.e;
        y4l0 y4l0Var = k8l0Var.f;
        xi9 xi9Var = k8l0Var.k;
        k8l0.k(j6l0Var);
        String strA = j6l0Var.m.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                xi9Var.getClass();
                r(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strA) ? 0L : 1L);
                xi9Var.getClass();
                r(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!k8l0Var.f() || !this.s) {
            k8l0.m(y4l0Var);
            y4l0Var.m.a("Updating Scion state (FE)");
            ikl0 ikl0VarO = k8l0Var.o();
            ikl0VarO.g();
            ikl0VarO.h();
            ikl0VarO.u(new nil0(ikl0VarO, ikl0VarO.w(true)));
            return;
        }
        k8l0.m(y4l0Var);
        y4l0Var.m.a("Recording app launch after enabling measurement for the first time (FE)");
        s();
        wll0 wll0Var = k8l0Var.h;
        k8l0.l(wll0Var);
        wll0Var.e.a();
        p7l0 p7l0Var = k8l0Var.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new hcl0(this));
    }

    public final void z() {
        k8l0 k8l0Var = this.a;
        if (!(k8l0Var.a.getApplicationContext() instanceof Application) || this.c == null) {
            return;
        }
        ((Application) k8l0Var.a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
    }

    public final void t(Bundle bundle, long j) {
        hm20.h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean zIsEmpty = TextUtils.isEmpty(bundle2.getString(PublisherMetadata.APP_ID));
        k8l0 k8l0Var = this.a;
        if (!zIsEmpty) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(PublisherMetadata.APP_ID);
        bbl0.b(bundle2, PublisherMetadata.APP_ID, String.class, null);
        bbl0.b(bundle2, "origin", String.class, null);
        bbl0.b(bundle2, "name", String.class, null);
        bbl0.b(bundle2, "value", Object.class, null);
        bbl0.b(bundle2, "trigger_event_name", String.class, null);
        bbl0.b(bundle2, "trigger_timeout", Long.class, 0L);
        bbl0.b(bundle2, "timed_out_event_name", String.class, null);
        bbl0.b(bundle2, lobGSRIlnSGJY.htoa, Bundle.class, null);
        bbl0.b(bundle2, "triggered_event_name", String.class, null);
        bbl0.b(bundle2, "triggered_event_params", Bundle.class, null);
        bbl0.b(bundle2, "time_to_live", Long.class, 0L);
        bbl0.b(bundle2, "expired_event_name", String.class, null);
        bbl0.b(bundle2, "expired_event_params", Bundle.class, null);
        hm20.e(bundle2.getString("name"));
        hm20.e(bundle2.getString("origin"));
        hm20.h(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        yol0 yol0Var = k8l0Var.i;
        k4l0 k4l0Var = k8l0Var.j;
        y4l0 y4l0Var2 = k8l0Var.f;
        k8l0.k(yol0Var);
        if (yol0Var.m0(string) == 0) {
            k8l0.k(yol0Var);
            if (yol0Var.t(obj, string) == 0) {
                Object objU = yol0Var.u(obj, string);
                if (objU == null) {
                    k8l0.m(y4l0Var2);
                    y4l0Var2.f.c(k4l0Var.c(string), "Unable to normalize conditional user property value", obj);
                    return;
                }
                bbl0.a(bundle2, objU);
                long j2 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
                    k8l0.m(y4l0Var2);
                    y4l0Var2.f.c(k4l0Var.c(string), "Invalid conditional user property timeout", Long.valueOf(j2));
                    return;
                }
                long j3 = bundle2.getLong("time_to_live");
                if (j3 <= 15552000000L && j3 >= 1) {
                    p7l0 p7l0Var = k8l0Var.g;
                    k8l0.m(p7l0Var);
                    p7l0Var.p(new idl0(this, bundle2));
                    return;
                } else {
                    k8l0.m(y4l0Var2);
                    y4l0Var2.f.c(k4l0Var.c(string), "Invalid conditional user property time to live", Long.valueOf(j3));
                    return;
                }
            }
            k8l0.m(y4l0Var2);
            y4l0Var2.f.c(k4l0Var.c(string), "Invalid conditional user property value", obj);
            return;
        }
        k8l0.m(y4l0Var2);
        y4l0Var2.f.b(k4l0Var.c(string), "Invalid conditional user property name");
    }
}
