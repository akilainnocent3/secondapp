package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class lpv {
    public gcn a;
    public wf80 b;
    public final b c;
    public final Size d;
    public final ax5 e;
    public wf80.c f;

    public class a implements cbj<Void> {
        public final /* synthetic */ Surface a;
        public final /* synthetic */ SurfaceTexture b;

        public a(Surface surface, SurfaceTexture surfaceTexture) {
            this.a = surface;
            this.b = surfaceTexture;
        }

        @Override // defpackage.cbj
        public final void onFailure(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        @Override // defpackage.cbj
        public final void onSuccess(Void r1) {
            this.a.release();
            this.b.release();
        }
    }

    public static class b implements snh0<pnh0> {
        public final ftw N;

        public b() {
            ftw ftwVarV = ftw.V();
            ftwVarV.Y(snh0.A, new oz5());
            ftwVarV.Y(d9n.h, 34);
            ftwVarV.Y(h5f0.w, lpv.class);
            ftwVarV.Y(h5f0.v, lpv.class.getCanonicalName() + "-" + UUID.randomUUID());
            this.N = ftwVarV;
        }

        @Override // defpackage.snh0
        public final tnh0.b P() {
            return tnh0.b.f;
        }

        @Override // defpackage.q340
        public final hoa l() {
            return this.N;
        }
    }

    public final wf80 a() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = this.d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        wf80.b bVarD = wf80.b.d(this.c, size);
        bVarD.b.c = 1;
        gcn gcnVar = new gcn(surface);
        this.a = gcnVar;
        qis qisVarD = obj.d(gcnVar.e);
        a aVar = new a(surface, surfaceTexture);
        qisVarD.k(new obj.b(qisVarD, aVar), nqe.a());
        bVarD.b(this.a, dhf.d, -1);
        wf80.c cVar = this.f;
        if (cVar != null) {
            cVar.b();
        }
        wf80.c cVar2 = new wf80.c(new wf80.d() { // from class: jpv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // wf80.d
            public final void a(wf80 wf80Var) {
                lpv lpvVar = this.a;
                lpvVar.b = lpvVar.a();
                ax5 ax5Var = lpvVar.e;
                if (ax5Var != null) {
                    String str = DZsoPoBl.ETANZiPt;
                    final qx5 qx5Var = (qx5) ax5Var.a;
                    od80 od80Var = qx5Var.c;
                    try {
                        try {
                            final nv5.a aVar2 = new nv5.a();
                            nv5.d<T> dVar = new nv5.d<>(aVar2);
                            aVar2.b = dVar;
                            aVar2.a = ew5.class;
                            try {
                                try {
                                    od80Var.execute(new Runnable() { // from class: ex5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zE;
                                            qx5 qx5Var2 = qx5Var;
                                            lpv lpvVar2 = qx5Var2.Q;
                                            if (lpvVar2 == null) {
                                                zE = false;
                                            } else {
                                                zE = qx5Var2.a.e(qx5.y(lpvVar2));
                                            }
                                            aVar2.b(Boolean.valueOf(zE));
                                        }
                                    });
                                } catch (RejectedExecutionException unused) {
                                    aVar2.d(new RuntimeException(ACKxwYRsuWyGz.BPJVnW));
                                }
                                aVar2.a = str;
                            } catch (Exception e) {
                                dVar.a(e);
                            }
                            if (((Boolean) dVar.b.get()).booleanValue()) {
                                lpv lpvVar2 = qx5Var.Q;
                                od80Var.execute(new ww5(qx5Var, qx5.y(lpvVar2), lpvVar2.b, lpvVar2.c, null, Collections.singletonList(tnh0.b.f)));
                            }
                        } catch (ExecutionException e2) {
                            e = e2;
                            jk40.a("Unable to check if MeteringRepeating is attached.", e);
                        }
                    } catch (InterruptedException | ExecutionException e3) {
                        e = e3;
                        jk40.a("Unable to check if MeteringRepeating is attached.", e);
                    }
                }
            }
        });
        this.f = cVar2;
        bVarD.f = cVar2;
        return bVarD.c();
    }

    public lpv(e16 e16Var, lse lseVar, ax5 ax5Var) {
        Size size;
        rge0 rge0Var = new rge0();
        Size size2 = null;
        this.f = null;
        this.c = new b();
        this.e = ax5Var;
        Size[] sizeArrA = e16Var.c().a(34);
        if (sizeArrA == null) {
            pgt.c("MeteringRepeating", "Can not get output size list.");
            size = new Size(0, 0);
        } else {
            if (rge0Var.a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && oLsIjJCWb.aZpjjaDbnNlci.equalsIgnoreCase(Build.MODEL)) {
                ArrayList arrayList = new ArrayList();
                for (Size size3 : sizeArrA) {
                    if (rge0.c.compare(size3, rge0.b) >= 0) {
                        arrayList.add(size3);
                    }
                }
                sizeArrA = (Size[]) arrayList.toArray(new Size[0]);
            }
            List listAsList = Arrays.asList(sizeArrA);
            Collections.sort(listAsList, new kpv());
            Size sizeE = lseVar.e();
            long jMin = Math.min(((long) sizeE.getWidth()) * ((long) sizeE.getHeight()), 307200L);
            int length = sizeArrA.length;
            int i = 0;
            while (i < length) {
                Size size4 = sizeArrA[i];
                long width = ((long) size4.getWidth()) * ((long) size4.getHeight());
                if (width == jMin) {
                    size = size4;
                } else if (width > jMin) {
                    if (size2 != null) {
                        size = size2;
                    }
                } else {
                    i++;
                    size2 = size4;
                }
            }
            size = (Size) listAsList.get(0);
        }
        this.d = size;
        pgt.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + size);
        this.b = a();
    }
}
