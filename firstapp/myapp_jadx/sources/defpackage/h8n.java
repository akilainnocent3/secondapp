package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class h8n extends pnh0 {
    public static final c C = new c();
    public wf80.c A;
    public final a B;
    public final int r;
    public final AtomicReference<Integer> s;
    public final int t;
    public final int u;
    public Rational v;
    public final qo70 w;
    public wf80.b x;
    public aan y;
    public h4f0 z;

    public class a implements j8n {
        public a() {
        }

        public final void a() {
            h8n h8nVar = h8n.this;
            synchronized (h8nVar.s) {
                try {
                    Integer andSet = h8nVar.s.getAndSet(null);
                    if (andSet == null) {
                        return;
                    }
                    if (andSet.intValue() != h8nVar.H()) {
                        h8nVar.L();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class c {
        public static final i8n a;

        static {
            o8e0 o8e0Var = o8e0.STILL_CAPTURE;
            xf50 xf50Var = new xf50(jy0.a, yf50.c);
            b bVar = new b();
            wg1 wg1Var = snh0.C;
            ftw ftwVar = bVar.a;
            ftwVar.Y(wg1Var, 4);
            ftwVar.Y(snh0.M, o8e0Var);
            ftwVar.Y(x9n.k, 0);
            ftwVar.Y(x9n.s, xf50Var);
            ftwVar.Y(i8n.S, 0);
            ftwVar.Y(d9n.j, dhf.d);
            a = new i8n(w2z.U(ftwVar));
        }
    }

    public static final class d {
        public final String toString() {
            return "Metadata{mIsReversedHorizontal=false, mIsReversedVertical=false, mLocation=null}";
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(k8n k8nVar);

        void b(h hVar);
    }

    public static final class g {
        public final File a;
        public final d b = new d();

        public g(File file) {
            this.a = file;
        }

        public final String toString() {
            return "OutputFileOptions{mFile=" + this.a + ", mContentResolver=null, mSaveCollection=null, mContentValues=null, mOutputStream=null, mMetadata=" + this.b + "}";
        }
    }

    public static class h {
    }

    public interface i {
        void a(long j, j jVar);

        void clear();
    }

    public interface j {
        void a();
    }

    public h8n(i8n i8nVar) {
        super(i8nVar);
        this.s = new AtomicReference<>(null);
        this.u = -1;
        this.v = null;
        this.B = new a();
        i8n i8nVar2 = (i8n) this.h;
        wg1 wg1Var = i8n.O;
        if (i8nVar2.e(wg1Var)) {
            this.r = ((Integer) i8nVar2.d(wg1Var)).intValue();
        } else {
            this.r = 1;
        }
        this.t = ((Integer) i8nVar2.b(i8n.V, 0)).intValue();
        this.w = new qo70((i) i8nVar2.b(i8n.X, null));
    }

    public static boolean I(int i2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i2))) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(Map map, int i2) {
        return map.containsKey(Integer.valueOf(i2)) && !((List) map.get(Integer.valueOf(i2))).isEmpty();
    }

    @Override // defpackage.pnh0
    public final void A() {
        qo70 qo70Var = this.w;
        qo70Var.c();
        qo70Var.b();
        h4f0 h4f0Var = this.z;
        if (h4f0Var != null) {
            h4f0Var.b();
        }
        F(false);
        d().c(null);
    }

    public final void F(boolean z) {
        h4f0 h4f0Var;
        Log.d("ImageCapture", "clearPipeline");
        kpf0.a();
        wf80.c cVar = this.A;
        if (cVar != null) {
            cVar.b();
            this.A = null;
        }
        aan aanVar = this.y;
        if (aanVar != null) {
            aanVar.a();
            this.y = null;
        }
        if (!z && (h4f0Var = this.z) != null) {
            h4f0Var.b();
            this.z = null;
        }
        d().f();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x014e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0057  */
    public final wf80.b G(String str, i8n i8nVar, k8e0 k8e0Var) {
        hoa hoaVarA;
        HashSet hashSet;
        zj1 zj1Var;
        gcn gcnVar;
        zj1 zj1Var2;
        boolean zContains;
        kpf0.a();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, k8e0Var));
        Size sizeF = k8e0Var.f();
        n26 n26VarC = c();
        Objects.requireNonNull(n26VarC);
        boolean z = !n26VarC.o();
        CameraCharacteristics cameraCharacteristics = null;
        if (this.y != null) {
            km20.g(null, z);
            this.y.a();
        }
        l26 l26VarA = c().a();
        if ((l26VarA instanceof rf) && (hoaVarA = ((tnh0) ((rf) l26VarA).d.b(h16.a, tnh0.a)).a(tnh0.b.a, 1)) != null) {
            wg1 wg1Var = x9n.r;
            w2z w2zVar = (w2z) hoaVarA;
            if (w2zVar.N.containsKey(wg1Var)) {
                hashSet = new HashSet();
                hashSet.add(0);
                Iterator it = ((List) w2zVar.d(wg1Var)).iterator();
                while (it.hasNext()) {
                    if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                        hashSet.add(1);
                        break;
                    }
                }
            } else {
                hashSet = null;
            }
        } else {
            hashSet = null;
        }
        if (hashSet == null) {
            hashSet = new HashSet();
            hashSet.add(0);
            if (l26VarA != null ? ((m26) l26VarA).r().contains(4101) : false) {
                hashSet.add(1);
            }
            if (l26VarA != null) {
                m26 m26Var = (m26) l26VarA;
                if (m26Var.k().contains(3)) {
                    zContains = m26Var.r().contains(32);
                } else {
                    zContains = false;
                }
            } else {
                zContains = false;
            }
            if (zContains) {
                hashSet.add(2);
                hashSet.add(3);
            }
        }
        snh0<?> snh0Var = this.h;
        wg1 wg1Var2 = i8n.S;
        Integer num = (Integer) snh0Var.b(wg1Var2, 0);
        num.getClass();
        boolean zContains2 = hashSet.contains(num);
        StringBuilder sb = new StringBuilder("The specified output format (");
        Integer num2 = (Integer) this.h.b(wg1Var2, 0);
        num2.getClass();
        sb.append(num2.intValue());
        sb.append(") is not supported by current configuration. Supported output formats: ");
        sb.append(hashSet);
        km20.a(sb.toString(), zContains2);
        if (((Boolean) this.h.b(i8n.Z, Boolean.FALSE)).booleanValue()) {
            i8nVar.m();
            if (c().f().v() == null) {
                zj1Var2 = null;
            } else {
                Map map = Collections.EMPTY_MAP;
                ArrayList arrayList = new ArrayList();
                if (J(map, 35)) {
                    arrayList.add(35);
                }
                if (J(map, 256)) {
                    arrayList.add(256);
                }
                if (J(map, 4101)) {
                    arrayList.add(4101);
                }
                int iA = !arrayList.isEmpty() ? ((h16.a) c().f().b(h16.e, h16.g)).a(arrayList) : 0;
                if (iA == 0) {
                    zj1Var2 = null;
                } else {
                    List list = (List) map.get(Integer.valueOf(iA));
                    xf50 xf50Var = (xf50) this.h.b(i8n.Y, null);
                    if (xf50Var != null) {
                        Collections.sort(list, new ql8(true));
                        n26 n26VarC2 = c();
                        Rect rectE = n26VarC2.h().e();
                        m26 m26VarH = n26VarC2.h();
                        ArrayList arrayListE = pge0.e(xf50Var, list, null, l(), new Rational(rectE.width(), rectE.height()), m26VarH.c(), m26VarH.f());
                        if (arrayListE.isEmpty()) {
                            hb5.a("The postview ResolutionSelector cannot select a valid size for the postview.");
                            return null;
                        }
                        zj1Var2 = new zj1((Size) arrayListE.get(0), iA);
                    } else {
                        zj1Var2 = new zj1((Size) Collections.max(list, new ql8(false)), iA);
                    }
                }
            }
            zj1Var = zj1Var2;
        } else {
            zj1Var = null;
        }
        if (c() != null) {
            try {
                Object objG = c().h().g();
                if (objG instanceof CameraCharacteristics) {
                    cameraCharacteristics = (CameraCharacteristics) objG;
                }
            } catch (Exception e2) {
                Log.e("ImageCapture", "getCameraCharacteristics failed", e2);
            }
        }
        this.y = new aan(i8nVar, sizeF, cameraCharacteristics, this.o, z, zj1Var);
        h4f0 h4f0VarA = this.z;
        if (h4f0VarA == null) {
            h4f0VarA = this.h.n().a(this.B);
            this.z = h4f0VarA;
        }
        h4f0VarA.d(this.y);
        aan aanVar = this.y;
        wf80.b bVarD = wf80.b.d(aanVar.a, k8e0Var.f());
        LinkedHashSet linkedHashSet = bVarD.a;
        sg1 sg1Var = aanVar.d;
        gcn gcnVar2 = sg1Var.c;
        Objects.requireNonNull(gcnVar2);
        pk1.a aVarA = wf80.f.a(gcnVar2);
        dhf dhfVar = dhf.d;
        aVarA.e = dhfVar;
        linkedHashSet.add(aVarA.a());
        if (sg1Var.h.size() > 1 && (gcnVar = sg1Var.d) != null) {
            pk1.a aVarA2 = wf80.f.a(gcnVar);
            aVarA2.e = dhfVar;
            linkedHashSet.add(aVarA2.a());
        }
        gcn gcnVar3 = sg1Var.e;
        if (gcnVar3 != null) {
            bVarD.i = wf80.f.a(gcnVar3).a();
        }
        bVarD.h = k8e0Var.g();
        if (this.r == 2 && !k8e0Var.h()) {
            d().e(bVarD);
        }
        if (k8e0Var.d() != null) {
            bVarD.a(k8e0Var.d());
        }
        wf80.c cVar = this.A;
        if (cVar != null) {
            cVar.b();
        }
        wf80.c cVar2 = new wf80.c(new wf80.d() { // from class: g8n
            @Override // wf80.d
            public final void a(wf80 wf80Var) {
                h8n h8nVar = this.a;
                if (h8nVar.c() == null) {
                    return;
                }
                h8nVar.z.a();
                h8nVar.F(true);
                String strE = h8nVar.e();
                i8n i8nVar2 = (i8n) h8nVar.h;
                k8e0 k8e0Var2 = h8nVar.i;
                k8e0Var2.getClass();
                wf80.b bVarG = h8nVar.G(strE, i8nVar2, k8e0Var2);
                h8nVar.x = bVarG;
                Object[] objArr = {bVarG.c()};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList2.add(obj);
                h8nVar.E(Collections.unmodifiableList(arrayList2));
                h8nVar.r();
                h8nVar.z.e();
            }
        });
        this.A = cVar2;
        bVarD.f = cVar2;
        return bVarD;
    }

    public final int H() {
        int iIntValue;
        synchronized (this.s) {
            iIntValue = this.u;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((i8n) this.h).b(i8n.P, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void K(final g gVar, final Executor executor, final utp utpVar) {
        int i2;
        int iRound;
        int i3;
        int i4;
        int i5;
        int iIntValue;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ((adl) mku.a()).execute(new Runnable() { // from class: f8n
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.K(gVar, executor, utpVar);
                }
            });
            return;
        }
        kpf0.a();
        if (H() == 3 && this.w.a == null) {
            hb5.a("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
            return;
        }
        Log.d("ImageCapture", "takePictureInternal");
        n26 n26VarC = c();
        Rect rect = null;
        if (n26VarC == null || !this.a) {
            utpVar.a(new k8n("Not bound to a valid Camera [" + this + "]", null));
            return;
        }
        boolean z = this.h.Q() != 0;
        if (z) {
            hb5.a("Simultaneous capture RAW and JPEG needs two output file options");
            return;
        }
        h4f0 h4f0Var = this.z;
        Objects.requireNonNull(h4f0Var);
        Rect rect2 = this.k;
        k8e0 k8e0Var = this.i;
        Size sizeF = k8e0Var != null ? k8e0Var.f() : null;
        Objects.requireNonNull(sizeF);
        if (rect2 != null) {
            i2 = 2;
        } else {
            Rational rational = this.v;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                i2 = 2;
                rect2 = new Rect(0, 0, sizeF.getWidth(), sizeF.getHeight());
            } else {
                n26 n26VarC2 = c();
                Objects.requireNonNull(n26VarC2);
                int iH = h(n26VarC2, false);
                Rational rational2 = new Rational(this.v.getDenominator(), this.v.getNumerator());
                if (!lsg0.d(iH)) {
                    rational2 = this.v;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    i2 = 2;
                    pgt.i("ImageUtil", "Invalid view ratio.");
                } else {
                    int width = sizeF.getWidth();
                    int height = sizeF.getHeight();
                    float f2 = width;
                    float f3 = height;
                    float f4 = f2 / f3;
                    i2 = 2;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f4) {
                        int iRound2 = Math.round((f2 / numerator) * denominator);
                        i5 = (height - iRound2) / 2;
                        i4 = iRound2;
                        iRound = width;
                        i3 = 0;
                    } else {
                        iRound = Math.round((f3 / denominator) * numerator);
                        i3 = (width - iRound) / 2;
                        i4 = height;
                        i5 = 0;
                    }
                    rect = new Rect(i3, i5, iRound + i3, i4 + i5);
                }
                Objects.requireNonNull(rect);
                rect2 = rect;
            }
        }
        Matrix matrix = this.l;
        int iH2 = h(n26VarC, false);
        i8n i8nVar = (i8n) this.h;
        wg1 wg1Var = i8n.W;
        if (i8nVar.e(wg1Var)) {
            iIntValue = ((Integer) i8nVar.d(wg1Var)).intValue();
        } else {
            int i6 = this.r;
            if (i6 == 0) {
                iIntValue = 100;
            } else {
                if (i6 != 1 && i6 != i2) {
                    ib5.a(pe4.b(i6, "CaptureMode ", " is invalid"));
                    return;
                }
                iIntValue = 95;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(this.x.e);
        km20.a("onDiskCallback and outputFileOptions should be both null or both non-null.", !false);
        jl1 jl1Var = new jl1(executor, utpVar, gVar, rect2, matrix, iH2, iIntValue, this.r, z, listUnmodifiableList);
        if (z) {
            Boolean bool = Boolean.FALSE;
            HashMap map = jl1Var.b;
            map.put(32, bool);
            map.put(256, bool);
        }
        h4f0Var.c(jl1Var);
    }

    public final void L() {
        synchronized (this.s) {
            try {
                if (this.s.get() != null) {
                    return;
                }
                d().b(H());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pnh0
    public final snh0<?> f(boolean z, tnh0 tnh0Var) {
        C.getClass();
        i8n i8nVar = c.a;
        hoa hoaVarA = tnh0Var.a(i8nVar.P(), this.r);
        if (z) {
            hoaVarA = hoa.N(hoaVarA, i8nVar);
        }
        if (hoaVarA == null) {
            return null;
        }
        return new i8n(w2z.U(((b) m(hoaVarA)).a));
    }

    @Override // defpackage.pnh0
    public final Set<Integer> k() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // defpackage.pnh0
    public final snh0.b<?, ?, ?> m(hoa hoaVar) {
        return new b(ftw.W(hoaVar));
    }

    @Override // defpackage.pnh0
    public final void t() {
        km20.f(c(), "Attached camera cannot be null");
        if (H() == 3) {
            n26 n26VarC = c();
            if ((n26VarC != null ? n26VarC.a().f() : -1) == 0) {
                return;
            }
            hb5.a("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(g());
    }

    @Override // defpackage.pnh0
    public final void u() {
        pgt.a("ImageCapture", "onCameraControlReady");
        L();
        d().c(this.w);
    }

    @Override // defpackage.pnh0
    public final snh0<?> v(m26 m26Var, snh0.b<?, ?, ?> bVar) {
        boolean z;
        HashSet<l8l> hashSet = this.g;
        if (hashSet != null) {
            int i2 = 0;
            for (l8l l8lVar : hashSet) {
                if (l8lVar instanceof z8n) {
                    i2 = ((z8n) l8lVar).a;
                }
            }
            ((ftw) bVar.a()).Y(i8n.S, Integer.valueOf(i2));
        }
        if (m26Var.i().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            Object objA = bVar.a();
            wg1 wg1Var = i8n.U;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(((w2z) objA).b(wg1Var, bool2))) {
                pgt.i("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                pgt.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                ((ftw) bVar.a()).Y(wg1Var, bool2);
            }
        }
        Object objA2 = bVar.a();
        Boolean bool3 = Boolean.TRUE;
        wg1 wg1Var2 = i8n.U;
        Boolean bool4 = Boolean.FALSE;
        if (bool3.equals(((w2z) objA2).b(wg1Var2, bool4))) {
            if (c() == null || c().f().v() == null) {
                z = true;
            } else {
                pgt.i("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z = false;
            }
            Integer num = (Integer) ((w2z) objA2).b(i8n.R, null);
            if (num != null && num.intValue() != 256) {
                pgt.i("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
                z = false;
            }
            if (!z) {
                pgt.i("ImageCapture", "Unable to support software JPEG. Disabling.");
                ((ftw) objA2).Y(wg1Var2, bool4);
            }
        } else {
            z = false;
        }
        Integer num2 = (Integer) ((w2z) bVar.a()).b(i8n.R, null);
        if (num2 != null) {
            km20.a("Cannot set non-JPEG buffer format with Extensions enabled.", c() == null || c().f().v() == null || num2.intValue() == 256);
            ((ftw) bVar.a()).Y(d9n.h, Integer.valueOf(z ? 35 : num2.intValue()));
        } else {
            Object objA3 = bVar.a();
            wg1 wg1Var3 = i8n.S;
            if (Objects.equals(((w2z) objA3).b(wg1Var3, null), 2)) {
                ((ftw) bVar.a()).Y(d9n.h, 32);
            } else if (Objects.equals(((w2z) bVar.a()).b(wg1Var3, null), 3)) {
                ((ftw) bVar.a()).Y(d9n.h, 32);
                ((ftw) bVar.a()).Y(d9n.i, 256);
            } else if (Objects.equals(((w2z) bVar.a()).b(wg1Var3, null), 1)) {
                ((ftw) bVar.a()).Y(d9n.h, 4101);
                ((ftw) bVar.a()).Y(d9n.j, dhf.c);
            } else if (z) {
                ((ftw) bVar.a()).Y(d9n.h, 35);
            } else {
                List list = (List) ((w2z) bVar.a()).b(x9n.r, null);
                if (list == null) {
                    ((ftw) bVar.a()).Y(d9n.h, 256);
                } else if (I(256, list)) {
                    ((ftw) bVar.a()).Y(d9n.h, 256);
                } else if (I(35, list)) {
                    ((ftw) bVar.a()).Y(d9n.h, 35);
                }
            }
        }
        return bVar.d();
    }

    @Override // defpackage.pnh0
    public final void x() {
        qo70 qo70Var = this.w;
        qo70Var.c();
        qo70Var.b();
        h4f0 h4f0Var = this.z;
        if (h4f0Var != null) {
            h4f0Var.b();
        }
    }

    @Override // defpackage.pnh0
    public final xk1 y(hoa hoaVar) {
        this.x.b.c(hoaVar);
        Object[] objArr = {this.x.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        xk1.a aVarI = this.i.i();
        aVarI.f = hoaVar;
        return aVarI.a();
    }

    @Override // defpackage.pnh0
    public final k8e0 z(k8e0 k8e0Var, k8e0 k8e0Var2) {
        pgt.a("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + k8e0Var + ", secondaryStreamSpec " + k8e0Var2);
        wf80.b bVarG = G(e(), (i8n) this.h, k8e0Var);
        this.x = bVarG;
        Object[] objArr = {bVarG.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        q();
        return k8e0Var;
    }

    public static final class b implements snh0.b<h8n, i8n, b>, x9n.a<b> {
        public final ftw a;

        public b(ftw ftwVar) {
            this.a = ftwVar;
            wg1 wg1Var = h5f0.w;
            Class cls = (Class) ftwVar.b(wg1Var, null);
            if (cls != null && !cls.equals(h8n.class)) {
                nrh0.a(this, "Invalid target class configuration for ", ": ", cls);
                throw null;
            }
            ftwVar.Y(snh0.I, tnh0.b.a);
            ftwVar.Y(wg1Var, h8n.class);
            wg1 wg1Var2 = h5f0.v;
            if (ftwVar.b(wg1Var2, null) == null) {
                ftwVar.Y(wg1Var2, h8n.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        @Override // defpackage.v1h
        public final csw a() {
            return this.a;
        }

        @Override // x9n.a
        public final b b(int i) {
            this.a.Y(x9n.l, Integer.valueOf(i));
            return this;
        }

        @Override // x9n.a
        @Deprecated
        public final b c(Size size) {
            this.a.Y(x9n.o, size);
            return this;
        }

        @Override // snh0.b
        public final snh0 d() {
            return new i8n(w2z.U(this.a));
        }

        public final h8n e() {
            wg1 wg1Var = i8n.R;
            ftw ftwVar = this.a;
            Integer num = (Integer) ftwVar.b(wg1Var, null);
            if (num != null) {
                ftwVar.Y(d9n.h, num);
            } else {
                c cVar = h8n.C;
                wg1 wg1Var2 = i8n.S;
                if (Objects.equals(ftwVar.b(wg1Var2, null), 2)) {
                    ftwVar.Y(d9n.h, 32);
                } else if (Objects.equals(ftwVar.b(wg1Var2, null), 3)) {
                    ftwVar.Y(d9n.h, 32);
                    ftwVar.Y(d9n.i, 256);
                } else if (Objects.equals(ftwVar.b(wg1Var2, null), 1)) {
                    ftwVar.Y(d9n.h, 4101);
                    ftwVar.Y(d9n.j, dhf.c);
                } else {
                    ftwVar.Y(d9n.h, 256);
                }
            }
            i8n i8nVar = new i8n(w2z.U(ftwVar));
            x9n.D(i8nVar);
            h8n h8nVar = new h8n(i8nVar);
            Size size = (Size) ftwVar.b(x9n.o, null);
            if (size != null) {
                h8nVar.v = new Rational(size.getWidth(), size.getHeight());
            }
            km20.f((Executor) ftwVar.b(v0p.u, w0p.a()), "The IO executor can't be null");
            wg1 wg1Var3 = i8n.P;
            if (ftwVar.N.containsKey(wg1Var3)) {
                Integer num2 = (Integer) ftwVar.d(wg1Var3);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    z9l.a(num2, "The flash mode is not allowed to set: ");
                    return null;
                }
                if (num2.intValue() == 3 && ftwVar.b(i8n.X, null) == null) {
                    hb5.a("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                    return null;
                }
            }
            return h8nVar;
        }

        public b() {
            this(ftw.V());
        }
    }
}
