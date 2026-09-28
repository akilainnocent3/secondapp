package defpackage;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.c;
import androidx.camera.core.d;
import androidx.camera.core.e;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class aan {
    public static int e;
    public final i8n a;
    public final ue6 b;
    public final ff6 c;
    public final sg1 d;

    public final void a() {
        gcn gcnVar;
        kpf0.a();
        kpf0.a();
        ff6 ff6Var = this.c;
        sg1 sg1Var = ff6Var.f;
        Objects.requireNonNull(sg1Var);
        final e eVar = ff6Var.b;
        Objects.requireNonNull(eVar);
        final e eVar2 = ff6Var.c;
        final e eVar3 = ff6Var.d;
        gcn gcnVar2 = sg1Var.c;
        Objects.requireNonNull(gcnVar2);
        gcnVar2.a();
        gcn gcnVar3 = sg1Var.c;
        Objects.requireNonNull(gcnVar3);
        obj.d(gcnVar3.e).k(new Runnable() { // from class: ze6
            @Override // java.lang.Runnable
            public final void run() {
                eVar.g();
            }
        }, mku.a());
        gcn gcnVar4 = sg1Var.e;
        if (gcnVar4 != null) {
            gcnVar4.a();
            obj.d(sg1Var.e.e).k(new Runnable() { // from class: af6
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar4 = eVar3;
                    if (eVar4 != null) {
                        eVar4.g();
                    }
                }
            }, mku.a());
        }
        if (sg1Var.h.size() <= 1 || (gcnVar = sg1Var.d) == null) {
            return;
        }
        gcnVar.a();
        obj.d(sg1Var.d.e).k(new Runnable() { // from class: bf6
            @Override // java.lang.Runnable
            public final void run() {
                e eVar4 = eVar2;
                if (eVar4 != null) {
                    eVar4.g();
                }
            }
        }, mku.a());
    }

    public aan(i8n i8nVar, Size size, CameraCharacteristics cameraCharacteristics, c26 c26Var, boolean z, zj1 zj1Var) {
        int iIntValue;
        boolean z2;
        boolean z3;
        tz5 tz5VarA;
        d dVar;
        qya qyaVar;
        jan janVar;
        d dVar2;
        kpf0.a();
        this.a = i8nVar;
        tz5 tz5VarA2 = null;
        ue6.b bVar = (ue6.b) i8nVar.b(snh0.B, null);
        if (bVar == null) {
            uj5.a(i8nVar.q(i8nVar.toString()), dqvOSm.VQNNY);
            throw null;
        }
        ue6.a aVar = new ue6.a();
        bVar.a(i8nVar, aVar);
        this.b = aVar.e();
        final ff6 ff6Var = new ff6();
        ff6Var.a = null;
        ff6Var.g = null;
        this.c = ff6Var;
        Executor executor = (Executor) i8nVar.b(v0p.u, w0p.a());
        Objects.requireNonNull(executor);
        if (c26Var != null) {
            km20.b(false);
            throw null;
        }
        final ry20 ry20Var = new ry20(executor, cameraCharacteristics);
        ArrayList arrayList = new ArrayList();
        if (i8nVar.Q() != 0) {
            arrayList.add(32);
            arrayList.add(256);
        } else {
            Integer num = (Integer) i8nVar.b(i8n.R, null);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                Integer num2 = (Integer) i8nVar.b(d9n.h, null);
                iIntValue = (num2 == null || num2.intValue() != 4101) ? (num2 == null || num2.intValue() != 32) ? 256 : 32 : 4101;
            }
            arrayList.add(Integer.valueOf(iIntValue));
        }
        sg1 sg1Var = new sg1(size, i8nVar.m(), arrayList, z, (kan) i8nVar.b(i8n.T, null), zj1Var, new zkf(), new zkf());
        this.d = sg1Var;
        km20.g("CaptureNode does not support recreation yet.", ff6Var.f == null && ff6Var.b == null);
        ff6Var.f = sg1Var;
        ef6 ef6Var = new ef6(ff6Var);
        ArrayList arrayList2 = sg1Var.h;
        boolean z4 = arrayList2.size() > 1;
        kan kanVar = sg1Var.j;
        Size size2 = sg1Var.f;
        int i = sg1Var.g;
        if (sg1Var.i || kanVar != null) {
            z2 = true;
            z3 = false;
            kvx kvxVar = new kvx(kanVar != null ? kanVar.newInstance() : new z70(ImageReader.newInstance(size2.getWidth(), size2.getHeight(), i, 4)));
            ff6Var.g = kvxVar;
            tz5VarA = ef6Var;
            dVar = null;
            janVar = kvxVar;
            qyaVar = new qya() { // from class: we6
                @Override // defpackage.qya
                public final void accept(Object obj) {
                    sy20 sy20Var = (sy20) obj;
                    ff6 ff6Var2 = ff6Var;
                    ff6Var2.c(sy20Var);
                    kvx kvxVar2 = ff6Var2.g;
                    km20.g("Pending request should be null", kvxVar2.b == null);
                    kvxVar2.b = sy20Var;
                }
            };
        } else {
            if (z4) {
                z3 = false;
                z2 = true;
                d dVar3 = new d(size2.getWidth(), size2.getHeight(), 256, 4);
                tz5 tz5VarA3 = uz5.a(ef6Var, dVar3.b);
                dVar = new d(size2.getWidth(), size2.getHeight(), 32, 4);
                tz5VarA2 = uz5.a(ef6Var, dVar.b);
                tz5VarA = tz5VarA3;
                dVar2 = dVar3;
            } else {
                z2 = true;
                z3 = false;
                d dVar4 = new d(size2.getWidth(), size2.getHeight(), i, 4);
                dVar2 = dVar4;
                tz5VarA = uz5.a(ef6Var, dVar4.b);
                dVar = null;
            }
            janVar = dVar2;
            qyaVar = new qya() { // from class: ve6
                @Override // defpackage.qya
                public final void accept(Object obj) {
                    ff6Var.c((sy20) obj);
                }
            };
        }
        sg1Var.a = tz5VarA;
        if (z4 && tz5VarA2 != null) {
            sg1Var.b = tz5VarA2;
        }
        Surface surface = janVar.getSurface();
        Objects.requireNonNull(surface);
        km20.g("The surface is already set.", sg1Var.c == null ? z2 : z3);
        sg1Var.c = new gcn(surface, size2, i);
        ff6Var.b = new e(janVar);
        janVar.h(new jan.a() { // from class: cf6
            @Override // jan.a
            public final void a(jan janVar2) throws Exception {
                ff6 ff6Var2 = ff6Var;
                try {
                    c cVarA = janVar2.a();
                    if (cVarA != null) {
                        ff6Var2.b(cVarA);
                        return;
                    }
                    sy20 sy20Var = ff6Var2.a;
                    if (sy20Var != null) {
                        ff6Var2.d(new il1(sy20Var.a, new k8n("Failed to acquire latest image", null)));
                    }
                } catch (IllegalStateException e2) {
                    sy20 sy20Var2 = ff6Var2.a;
                    if (sy20Var2 != null) {
                        ff6Var2.d(new il1(sy20Var2.a, new k8n("Failed to acquire latest image", e2)));
                    }
                }
            }
        }, mku.a());
        zj1 zj1Var2 = sg1Var.k;
        if (zj1Var2 != null) {
            jan janVarNewInstance = kanVar != null ? kanVar.newInstance() : new z70(ImageReader.newInstance(zj1Var2.b().getWidth(), zj1Var2.b().getHeight(), zj1Var2.a(), 4));
            janVarNewInstance.h(new jan.a() { // from class: xe6
                @Override // jan.a
                public final void a(jan janVar2) throws Exception {
                    ff6 ff6Var2 = ff6Var;
                    try {
                        c cVarA = janVar2.a();
                        if (cVarA != null) {
                            if (ff6Var2.a == null) {
                                pgt.i("CaptureNode", "Postview image is closed due to request completed or aborted");
                                cVarA.close();
                            } else {
                                ak1 ak1Var = ff6Var2.e;
                                Objects.requireNonNull(ak1Var);
                                ak1Var.b.accept(new bk1(ff6Var2.a, cVarA));
                            }
                        }
                    } catch (IllegalStateException e2) {
                        pgt.d("CaptureNode", "Failed to acquire latest image of postview", e2);
                    }
                }
            }, mku.a());
            ff6Var.d = new e(janVarNewInstance);
            sg1Var.e = new gcn(janVarNewInstance.getSurface(), zj1Var2.b(), zj1Var2.a());
        }
        if (z4 && dVar != null) {
            Surface surface2 = dVar.getSurface();
            km20.g("The secondary surface is already set.", sg1Var.d == null ? z2 : z3);
            sg1Var.d = new gcn(surface2, size2, i);
            ff6Var.c = new e(dVar);
            dVar.h(new jan.a() { // from class: cf6
                @Override // jan.a
                public final void a(jan janVar2) throws Exception {
                    ff6 ff6Var2 = ff6Var;
                    try {
                        c cVarA = janVar2.a();
                        if (cVarA != null) {
                            ff6Var2.b(cVarA);
                            return;
                        }
                        sy20 sy20Var = ff6Var2.a;
                        if (sy20Var != null) {
                            ff6Var2.d(new il1(sy20Var.a, new k8n("Failed to acquire latest image", null)));
                        }
                    } catch (IllegalStateException e2) {
                        sy20 sy20Var2 = ff6Var2.a;
                        if (sy20Var2 != null) {
                            ff6Var2.d(new il1(sy20Var2.a, new k8n("Failed to acquire latest image", e2)));
                        }
                    }
                }
            }, mku.a());
        }
        sg1Var.l.a = qyaVar;
        sg1Var.m.a = new qya() { // from class: ye6
            @Override // defpackage.qya
            public final void accept(Object obj) {
                ff6Var.d((h4f0.a) obj);
            }
        };
        ak1 ak1Var = new ak1(new zkf(), new zkf(), i, arrayList2);
        ff6Var.e = ak1Var;
        ry20Var.d = ak1Var;
        ak1Var.a.a = new qya() { // from class: jy20
            @Override // defpackage.qya
            public final void accept(Object obj) throws Exception {
                final ry20.b bVar2 = (ry20.b) obj;
                if (bVar2.b().i.g) {
                    bVar2.a().close();
                } else {
                    final ry20 ry20Var2 = ry20Var;
                    ry20Var2.a.execute(new Runnable() { // from class: my20
                        @Override // java.lang.Runnable
                        public final void run() throws Exception {
                            ry20 ry20Var3 = ry20Var2;
                            ry20.b bVar3 = bVar2;
                            final sy20 sy20VarB = bVar3.b();
                            try {
                                boolean z5 = true;
                                if (ry20Var3.d.d.size() <= 1) {
                                    z5 = false;
                                }
                                sy20 sy20VarB2 = bVar3.b();
                                if (sy20VarB2.c == null && sy20VarB2.d == null) {
                                    final c cVarA = ry20Var3.a(bVar3);
                                    ((adl) mku.a()).execute(new Runnable() { // from class: ny20
                                        @Override // java.lang.Runnable
                                        public final void run() throws Exception {
                                            lb50 lb50Var = sy20VarB.i;
                                            kpf0.a();
                                            boolean z6 = lb50Var.g;
                                            final c cVar = cVarA;
                                            if (z6) {
                                                cVar.close();
                                                return;
                                            }
                                            km20.g("onImageCaptured() must be called before onFinalResult()", lb50Var.c.b.isDone());
                                            lb50Var.a();
                                            final s4f0 s4f0Var = lb50Var.a;
                                            s4f0Var.a().execute(new Runnable() { // from class: o4f0
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    Objects.requireNonNull(s4f0Var.d());
                                                    Objects.requireNonNull(cVar);
                                                }
                                            });
                                        }
                                    });
                                    return;
                                }
                                final h8n.h hVarB = ry20Var3.b(bVar3);
                                if (!z5 || sy20VarB.b.l()) {
                                    ((adl) mku.a()).execute(new Runnable() { // from class: oy20
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            lb50 lb50Var = sy20VarB.i;
                                            kpf0.a();
                                            if (lb50Var.g) {
                                                return;
                                            }
                                            km20.g("onImageCaptured() must be called before onFinalResult()", lb50Var.c.b.isDone());
                                            lb50Var.a();
                                            final s4f0 s4f0Var = lb50Var.a;
                                            Executor executorA = s4f0Var.a();
                                            final h8n.h hVar = hVarB;
                                            executorA.execute(new Runnable() { // from class: q4f0
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    h8n.f fVarF = s4f0Var.f();
                                                    Objects.requireNonNull(fVarF);
                                                    h8n.h hVar2 = hVar;
                                                    Objects.requireNonNull(hVar2);
                                                    fVarF.b(hVar2);
                                                }
                                            });
                                        }
                                    });
                                }
                            } catch (OutOfMemoryError e2) {
                                final k8n k8nVar = new k8n("Processing failed due to low memory.", e2);
                                ((adl) mku.a()).execute(new Runnable() { // from class: qy20
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        lb50 lb50Var = sy20VarB.i;
                                        kpf0.a();
                                        if (lb50Var.g) {
                                            return;
                                        }
                                        km20.g("onImageCaptured() must be called before onFinalResult()", lb50Var.c.b.isDone());
                                        lb50Var.a();
                                        kpf0.a();
                                        s4f0 s4f0Var = lb50Var.a;
                                        s4f0Var.a().execute(new n4f0(s4f0Var, k8nVar));
                                    }
                                });
                            } catch (RuntimeException e3) {
                                final k8n k8nVar2 = new k8n("Processing failed.", e3);
                                ((adl) mku.a()).execute(new Runnable() { // from class: qy20
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        lb50 lb50Var = sy20VarB.i;
                                        kpf0.a();
                                        if (lb50Var.g) {
                                            return;
                                        }
                                        km20.g("onImageCaptured() must be called before onFinalResult()", lb50Var.c.b.isDone());
                                        lb50Var.a();
                                        kpf0.a();
                                        s4f0 s4f0Var = lb50Var.a;
                                        s4f0Var.a().execute(new n4f0(s4f0Var, k8nVar2));
                                    }
                                });
                            } catch (k8n e4) {
                                ((adl) mku.a()).execute(new Runnable() { // from class: qy20
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        lb50 lb50Var = sy20VarB.i;
                                        kpf0.a();
                                        if (lb50Var.g) {
                                            return;
                                        }
                                        km20.g("onImageCaptured() must be called before onFinalResult()", lb50Var.c.b.isDone());
                                        lb50Var.a();
                                        kpf0.a();
                                        s4f0 s4f0Var = lb50Var.a;
                                        s4f0Var.a().execute(new n4f0(s4f0Var, e4));
                                    }
                                });
                            }
                        }
                    });
                }
            }
        };
        ak1Var.b.a = new qya() { // from class: ky20
            @Override // defpackage.qya
            public final void accept(Object obj) throws Exception {
                final ry20.b bVar2 = (ry20.b) obj;
                if (bVar2.b().i.g) {
                    pgt.i("ProcessingNode", "The postview image is closed due to request aborted");
                    bVar2.a().close();
                } else {
                    final ry20 ry20Var2 = ry20Var;
                    ry20Var2.a.execute(new Runnable() { // from class: ly20
                        @Override // java.lang.Runnable
                        public final void run() throws Exception {
                            ry20 ry20Var3 = ry20Var2;
                            ry20.b bVar3 = bVar2;
                            final sy20 sy20VarB = bVar3.b();
                            try {
                                wj1 wj1Var = (wj1) ry20Var3.e.a(bVar3);
                                int iE = wj1Var.e();
                                km20.a("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + iE, iE == 35 || iE == 256 || iE == 4101);
                                final Bitmap bitmap = (Bitmap) ry20Var3.l.a(wj1Var);
                                ((adl) mku.a()).execute(new Runnable() { // from class: py20
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        lb50 lb50Var = sy20VarB.i;
                                        kpf0.a();
                                        if (lb50Var.g) {
                                            return;
                                        }
                                        s4f0 s4f0Var = lb50Var.a;
                                        s4f0Var.a().execute(new Runnable(bitmap) { // from class: p4f0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                s4f0 s4f0Var2 = this.a;
                                                if (s4f0Var2.f() != null) {
                                                    s4f0Var2.f().getClass();
                                                } else {
                                                    s4f0Var2.d();
                                                }
                                            }
                                        });
                                    }
                                });
                            } catch (Exception e2) {
                                bVar3.a().close();
                                pgt.d("ProcessingNode", "process postview input packet failed.", e2);
                            }
                        }
                    });
                }
            }
        };
        ry20Var.e = new iy20();
        ry20Var.f = new t7n(ry20Var.m);
        ry20Var.i = new mbp();
        ry20Var.g = new be4();
        ry20Var.h = new nbp();
        ry20Var.j = new qbp();
        ry20Var.l = new he4();
        if (ak1Var.c == 35 || ry20Var.n) {
            ry20Var.k = new obp();
        }
    }
}
