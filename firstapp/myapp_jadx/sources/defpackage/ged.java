package defpackage;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ged implements ekv.a {
    public static final /* synthetic */ int j = 0;
    public final a a;
    public final zpc.a b;
    public ugd c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public static final class a {
        public final mcd a;
        public final HashMap b = new HashMap();
        public final HashMap c = new HashMap();
        public zpc.a d;
        public ugd e;

        public a(mcd mcdVar, ugd ugdVar) {
            this.a = mcdVar;
            this.e = ugdVar;
        }

        public final mfe0<ekv.a> a(int i) {
            mfe0<ekv.a> mfe0Var;
            Integer numValueOf = Integer.valueOf(i);
            HashMap map = this.b;
            mfe0<ekv.a> mfe0Var2 = (mfe0) map.get(numValueOf);
            if (mfe0Var2 != null) {
                return mfe0Var2;
            }
            final zpc.a aVar = this.d;
            aVar.getClass();
            if (i == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(ekv.a.class);
                mfe0Var = new mfe0() { // from class: bed
                    @Override // defpackage.mfe0
                    public final Object get() {
                        return ged.e(clsAsSubclass, aVar);
                    }
                };
            } else if (i == 1) {
                final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(ekv.a.class);
                mfe0Var = new mfe0() { // from class: ced
                    @Override // defpackage.mfe0
                    public final Object get() {
                        return ged.e(clsAsSubclass2, aVar);
                    }
                };
            } else if (i == 2) {
                final Class clsAsSubclass3 = HlsMediaSource.Factory.class.asSubclass(ekv.a.class);
                mfe0Var = new mfe0() { // from class: ded
                    @Override // defpackage.mfe0
                    public final Object get() {
                        return ged.e(clsAsSubclass3, aVar);
                    }
                };
            } else if (i == 3) {
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(ekv.a.class);
                mfe0Var = new mfe0() { // from class: eed
                    @Override // defpackage.mfe0
                    public final Object get() {
                        try {
                            return (ekv.a) clsAsSubclass4.getConstructor(null).newInstance(null);
                        } catch (Exception e) {
                            dad.a(e);
                            return null;
                        }
                    }
                };
            } else {
                if (i != 4) {
                    hb5.a(hce0.a(i, "Unrecognized contentType: "));
                    return null;
                }
                mfe0Var = new mfe0() { // from class: fed
                    @Override // defpackage.mfe0
                    public final Object get() {
                        return new r430.b(aVar, this.a.a);
                    }
                };
            }
            map.put(Integer.valueOf(i), mfe0Var);
            return mfe0Var;
        }
    }

    public ged(zpc.a aVar, mcd mcdVar) {
        this.b = aVar;
        ugd ugdVar = new ugd();
        this.c = ugdVar;
        a aVar2 = new a(mcdVar, ugdVar);
        this.a = aVar2;
        if (aVar != aVar2.d) {
            aVar2.d = aVar;
            aVar2.b.clear();
            aVar2.c.clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static ekv.a e(Class<? extends ekv.a> cls, zpc.a aVar) {
        try {
            return cls.getConstructor(zpc.a.class).newInstance(aVar);
        } catch (Exception e) {
            dad.a(e);
            return null;
        }
    }

    @Override // ekv.a
    @Deprecated
    public final void a() {
        this.i = true;
        a aVar = this.a;
        aVar.getClass();
        synchronized (aVar.a) {
        }
        Iterator it = aVar.c.values().iterator();
        while (it.hasNext()) {
            ((ekv.a) it.next()).a();
        }
    }

    @Override // ekv.a
    public final ekv b(njv njvVar) {
        njv njvVar2;
        List<StreamKey> list;
        Uri uri;
        String str;
        long j2;
        njvVar.b.getClass();
        String scheme = njvVar.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean zEquals = Objects.equals(njvVar.b.b, "application/x-image-uri");
        njv.e eVar = njvVar.b;
        if (zEquals) {
            long j3 = eVar.e;
            String str2 = jrh0.a;
            throw null;
        }
        int iH = jrh0.H(eVar.a, eVar.b);
        if (njvVar.b.e != -9223372036854775807L) {
            mcd mcdVar = this.a.a;
            synchronized (mcdVar) {
                mcdVar.c = 1;
            }
        }
        try {
            a aVar = this.a;
            HashMap map = aVar.c;
            ekv.a aVar2 = (ekv.a) map.get(Integer.valueOf(iH));
            if (aVar2 == null) {
                aVar2 = aVar.a(iH).get();
                aVar2.c(aVar.e);
                aVar2.a();
                aVar2.d();
                map.put(Integer.valueOf(iH), aVar2);
            }
            njv.d.a aVarA = njvVar.c.a();
            njv.d dVar = njvVar.c;
            if (dVar.a == -9223372036854775807L) {
                aVarA.a = this.d;
            }
            if (dVar.d == -3.4028235E38f) {
                aVarA.d = this.g;
            }
            if (dVar.e == -3.4028235E38f) {
                aVarA.e = this.h;
            }
            if (dVar.b == -9223372036854775807L) {
                aVarA.b = this.e;
            }
            if (dVar.c == -9223372036854775807L) {
                aVarA.c = this.f;
            }
            njv.d dVar2 = new njv.d(aVarA);
            if (dVar2.equals(njvVar.c)) {
                njvVar2 = njvVar;
            } else {
                new njv.c.a();
                List<StreamKey> list2 = Collections.EMPTY_LIST;
                pcn.b bVar = pcn.b;
                pcn pcnVar = c150.e;
                njv.f fVar = njv.f.a;
                njv.b bVar2 = njvVar.e;
                njv.a.C0902a c0902a = new njv.a.C0902a();
                c0902a.a = bVar2.a;
                String str3 = njvVar.a;
                qjv qjvVar = njvVar.d;
                njvVar.c.a();
                njv.f fVar2 = njvVar.f;
                njv.e eVar2 = njvVar.b;
                if (eVar2 != null) {
                    String str4 = eVar2.b;
                    Uri uri2 = eVar2.a;
                    List<StreamKey> list3 = eVar2.c;
                    pcnVar = eVar2.d;
                    new njv.c.a();
                    str = str4;
                    uri = uri2;
                    list = list3;
                    j2 = eVar2.e;
                } else {
                    list = list2;
                    uri = null;
                    str = null;
                    j2 = -9223372036854775807L;
                }
                pcn pcnVar2 = pcnVar;
                njv.d.a aVarA2 = dVar2.a();
                njv.e eVar3 = uri != null ? new njv.e(uri, str, null, list, pcnVar2, j2) : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = str3;
                njv.b bVar3 = new njv.b(c0902a);
                njv.d dVar3 = new njv.d(aVarA2);
                if (qjvVar == null) {
                    qjvVar = qjv.B;
                }
                njvVar2 = new njv(str5, bVar3, eVar3, dVar3, qjvVar, fVar2);
            }
            ekv ekvVarB = aVar2.b(njvVar2);
            pcn<njv.h> pcnVar3 = njvVar2.b.d;
            if (!pcnVar3.isEmpty()) {
                ekv[] ekvVarArr = new ekv[pcnVar3.size() + 1];
                ekvVarArr[0] = ekvVarB;
                if (pcnVar3.size() > 0) {
                    if (!this.i) {
                        this.b.getClass();
                        njv.h hVar = pcnVar3.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new mkv.a();
                        new mef.a();
                        new njv.c.a();
                        List list4 = Collections.EMPTY_LIST;
                        pcn.b bVar4 = pcn.b;
                        c150 c150Var = c150.e;
                        njv.f fVar3 = njv.f.a;
                        Uri uri3 = Uri.EMPTY;
                        hVar.getClass();
                        throw null;
                    }
                    androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
                    pcnVar3.get(0).getClass();
                    ArrayList<gqv.a> arrayList = gqv.a;
                    c0062a.m = null;
                    pcnVar3.get(0).getClass();
                    c0062a.d = null;
                    pcnVar3.get(0).getClass();
                    c0062a.e = 0;
                    pcnVar3.get(0).getClass();
                    c0062a.f = 0;
                    pcnVar3.get(0).getClass();
                    c0062a.b = null;
                    pcnVar3.get(0).getClass();
                    c0062a.a = null;
                    androidx.media3.common.a aVar3 = new androidx.media3.common.a(c0062a);
                    if (this.c.d(aVar3)) {
                        androidx.media3.common.a.C0062a c0062aA = aVar3.a();
                        c0062aA.m = gqv.m("application/x-media3-cues");
                        c0062aA.j = aVar3.n;
                        c0062aA.K = this.c.e(aVar3);
                        new androidx.media3.common.a(c0062aA);
                    }
                    pcnVar3.get(0).getClass();
                    throw null;
                }
                ekvVarB = new onv(ekvVarArr);
            }
            njv.b bVar5 = njvVar2.e;
            if (bVar5.a != Long.MIN_VALUE) {
                rs7.a aVar4 = new rs7.a(ekvVarB);
                ly0.f(!aVar4.d);
                long j4 = bVar5.a;
                ly0.f(!aVar4.d);
                aVar4.b = j4;
                ly0.f(!aVar4.d);
                aVar4.c = true;
                ly0.f(!aVar4.d);
                ly0.f(!aVar4.d);
                ly0.f(!aVar4.d);
                aVar4.d = true;
                ekvVarB = new rs7(aVar4);
            }
            njvVar2.b.getClass();
            njvVar2.b.getClass();
            return ekvVarB;
        } catch (ClassNotFoundException e) {
            dad.a(e);
            return null;
        }
    }

    @Override // ekv.a
    public final void c(ugd ugdVar) {
        this.c = ugdVar;
        a aVar = this.a;
        aVar.e = ugdVar;
        mcd mcdVar = aVar.a;
        synchronized (mcdVar) {
            mcdVar.b = ugdVar;
        }
        Iterator it = aVar.c.values().iterator();
        while (it.hasNext()) {
            ((ekv.a) it.next()).c(ugdVar);
        }
    }

    @Override // ekv.a
    public final void d() {
        a aVar = this.a;
        aVar.getClass();
        synchronized (aVar.a) {
        }
    }

    public ged(gr5.a aVar) {
        this(aVar, new mcd());
    }
}
