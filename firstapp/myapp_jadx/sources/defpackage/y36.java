package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y36 implements Runnable {
    public final /* synthetic */ c46 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ int d;
    public final /* synthetic */ nv5.a e;
    public final /* synthetic */ long f;

    public /* synthetic */ y36(int i, long j, nv5.a aVar, c46 c46Var, Context context, Executor executor) {
        this.a = c46Var;
        this.b = context;
        this.c = executor;
        this.d = i;
        this.e = aVar;
        this.f = j;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0161 A[Catch: all -> 0x0217, TryCatch #4 {all -> 0x0217, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x0042, B:9:0x0056, B:11:0x005b, B:13:0x0065, B:15:0x0082, B:22:0x0094, B:23:0x00bb, B:25:0x00c1, B:26:0x00d1, B:28:0x0104, B:30:0x010a, B:31:0x0110, B:32:0x0112, B:35:0x0118, B:40:0x0121, B:41:0x0122, B:42:0x012e, B:53:0x0150, B:55:0x0161, B:56:0x0168, B:60:0x0176, B:62:0x01aa, B:63:0x01ae, B:64:0x01b8, B:65:0x01ba, B:68:0x01c0, B:70:0x01c4, B:71:0x01c6, B:74:0x01cc, B:78:0x01d2, B:79:0x01d3, B:81:0x01d7, B:82:0x0200, B:84:0x0204, B:85:0x0208, B:90:0x0216, B:49:0x0136, B:50:0x0142, B:51:0x0143, B:52:0x014f, B:72:0x01c7, B:73:0x01cb, B:66:0x01bb, B:67:0x01bf), top: B:98:0x001d, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0171  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b8 A[Catch: all -> 0x0217, TryCatch #4 {all -> 0x0217, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x0042, B:9:0x0056, B:11:0x005b, B:13:0x0065, B:15:0x0082, B:22:0x0094, B:23:0x00bb, B:25:0x00c1, B:26:0x00d1, B:28:0x0104, B:30:0x010a, B:31:0x0110, B:32:0x0112, B:35:0x0118, B:40:0x0121, B:41:0x0122, B:42:0x012e, B:53:0x0150, B:55:0x0161, B:56:0x0168, B:60:0x0176, B:62:0x01aa, B:63:0x01ae, B:64:0x01b8, B:65:0x01ba, B:68:0x01c0, B:70:0x01c4, B:71:0x01c6, B:74:0x01cc, B:78:0x01d2, B:79:0x01d3, B:81:0x01d7, B:82:0x0200, B:84:0x0204, B:85:0x0208, B:90:0x0216, B:49:0x0136, B:50:0x0142, B:51:0x0143, B:52:0x014f, B:72:0x01c7, B:73:0x01cb, B:66:0x01bb, B:67:0x01bf), top: B:98:0x001d, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01c4 A[Catch: all -> 0x0217, TryCatch #4 {all -> 0x0217, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x0042, B:9:0x0056, B:11:0x005b, B:13:0x0065, B:15:0x0082, B:22:0x0094, B:23:0x00bb, B:25:0x00c1, B:26:0x00d1, B:28:0x0104, B:30:0x010a, B:31:0x0110, B:32:0x0112, B:35:0x0118, B:40:0x0121, B:41:0x0122, B:42:0x012e, B:53:0x0150, B:55:0x0161, B:56:0x0168, B:60:0x0176, B:62:0x01aa, B:63:0x01ae, B:64:0x01b8, B:65:0x01ba, B:68:0x01c0, B:70:0x01c4, B:71:0x01c6, B:74:0x01cc, B:78:0x01d2, B:79:0x01d3, B:81:0x01d7, B:82:0x0200, B:84:0x0204, B:85:0x0208, B:90:0x0216, B:49:0x0136, B:50:0x0142, B:51:0x0143, B:52:0x014f, B:72:0x01c7, B:73:0x01cb, B:66:0x01bb, B:67:0x01bf), top: B:98:0x001d, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01d3 A[Catch: all -> 0x0217, TryCatch #4 {all -> 0x0217, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x0042, B:9:0x0056, B:11:0x005b, B:13:0x0065, B:15:0x0082, B:22:0x0094, B:23:0x00bb, B:25:0x00c1, B:26:0x00d1, B:28:0x0104, B:30:0x010a, B:31:0x0110, B:32:0x0112, B:35:0x0118, B:40:0x0121, B:41:0x0122, B:42:0x012e, B:53:0x0150, B:55:0x0161, B:56:0x0168, B:60:0x0176, B:62:0x01aa, B:63:0x01ae, B:64:0x01b8, B:65:0x01ba, B:68:0x01c0, B:70:0x01c4, B:71:0x01c6, B:74:0x01cc, B:78:0x01d2, B:79:0x01d3, B:81:0x01d7, B:82:0x0200, B:84:0x0204, B:85:0x0208, B:90:0x0216, B:49:0x0136, B:50:0x0142, B:51:0x0143, B:52:0x014f, B:72:0x01c7, B:73:0x01cb, B:66:0x01bb, B:67:0x01bf), top: B:98:0x001d, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d7 A[Catch: all -> 0x0217, TryCatch #4 {all -> 0x0217, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x0042, B:9:0x0056, B:11:0x005b, B:13:0x0065, B:15:0x0082, B:22:0x0094, B:23:0x00bb, B:25:0x00c1, B:26:0x00d1, B:28:0x0104, B:30:0x010a, B:31:0x0110, B:32:0x0112, B:35:0x0118, B:40:0x0121, B:41:0x0122, B:42:0x012e, B:53:0x0150, B:55:0x0161, B:56:0x0168, B:60:0x0176, B:62:0x01aa, B:63:0x01ae, B:64:0x01b8, B:65:0x01ba, B:68:0x01c0, B:70:0x01c4, B:71:0x01c6, B:74:0x01cc, B:78:0x01d2, B:79:0x01d3, B:81:0x01d7, B:82:0x0200, B:84:0x0204, B:85:0x0208, B:90:0x0216, B:49:0x0136, B:50:0x0142, B:51:0x0143, B:52:0x014f, B:72:0x01c7, B:73:0x01cb, B:66:0x01bb, B:67:0x01bf), top: B:98:0x001d, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0200 A[Catch: all -> 0x0217, TryCatch #4 {all -> 0x0217, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x0042, B:9:0x0056, B:11:0x005b, B:13:0x0065, B:15:0x0082, B:22:0x0094, B:23:0x00bb, B:25:0x00c1, B:26:0x00d1, B:28:0x0104, B:30:0x010a, B:31:0x0110, B:32:0x0112, B:35:0x0118, B:40:0x0121, B:41:0x0122, B:42:0x012e, B:53:0x0150, B:55:0x0161, B:56:0x0168, B:60:0x0176, B:62:0x01aa, B:63:0x01ae, B:64:0x01b8, B:65:0x01ba, B:68:0x01c0, B:70:0x01c4, B:71:0x01c6, B:74:0x01cc, B:78:0x01d2, B:79:0x01d3, B:81:0x01d7, B:82:0x0200, B:84:0x0204, B:85:0x0208, B:90:0x0216, B:49:0x0136, B:50:0x0142, B:51:0x0143, B:52:0x014f, B:72:0x01c7, B:73:0x01cb, B:66:0x01bb, B:67:0x01bf), top: B:98:0x001d, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0204 A[Catch: all -> 0x0217, TryCatch #4 {all -> 0x0217, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x0042, B:9:0x0056, B:11:0x005b, B:13:0x0065, B:15:0x0082, B:22:0x0094, B:23:0x00bb, B:25:0x00c1, B:26:0x00d1, B:28:0x0104, B:30:0x010a, B:31:0x0110, B:32:0x0112, B:35:0x0118, B:40:0x0121, B:41:0x0122, B:42:0x012e, B:53:0x0150, B:55:0x0161, B:56:0x0168, B:60:0x0176, B:62:0x01aa, B:63:0x01ae, B:64:0x01b8, B:65:0x01ba, B:68:0x01c0, B:70:0x01c4, B:71:0x01c6, B:74:0x01cc, B:78:0x01d2, B:79:0x01d3, B:81:0x01d7, B:82:0x0200, B:84:0x0204, B:85:0x0208, B:90:0x0216, B:49:0x0136, B:50:0x0142, B:51:0x0143, B:52:0x014f, B:72:0x01c7, B:73:0x01cb, B:66:0x01bb, B:67:0x01bf), top: B:98:0x001d, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0208 A[Catch: all -> 0x0217, TRY_LEAVE, TryCatch #4 {all -> 0x0217, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x0042, B:9:0x0056, B:11:0x005b, B:13:0x0065, B:15:0x0082, B:22:0x0094, B:23:0x00bb, B:25:0x00c1, B:26:0x00d1, B:28:0x0104, B:30:0x010a, B:31:0x0110, B:32:0x0112, B:35:0x0118, B:40:0x0121, B:41:0x0122, B:42:0x012e, B:53:0x0150, B:55:0x0161, B:56:0x0168, B:60:0x0176, B:62:0x01aa, B:63:0x01ae, B:64:0x01b8, B:65:0x01ba, B:68:0x01c0, B:70:0x01c4, B:71:0x01c6, B:74:0x01cc, B:78:0x01d2, B:79:0x01d3, B:81:0x01d7, B:82:0x0200, B:84:0x0204, B:85:0x0208, B:90:0x0216, B:49:0x0136, B:50:0x0142, B:51:0x0143, B:52:0x014f, B:72:0x01c7, B:73:0x01cb, B:66:0x01bb, B:67:0x01bf), top: B:98:0x001d, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x01d7, please report this as an issue */
    /* JADX WARN: Type inference failed for: r0v12, types: [b46, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        e36 e36Var;
        fo50.a aVarB;
        final c46 c46Var = this.a;
        Context context = this.b;
        final Executor executor = this.c;
        final int i = this.d;
        final nv5.a aVar = this.e;
        final long j = this.f;
        Trace.beginSection(sig0.d("CX:initAndRetryRecursively"));
        final Context contextA = o1b.a(context);
        try {
            try {
                g26.a aVarV = c46Var.c.V();
                if (aVarV == null) {
                    throw new uhn(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                }
                rg1 rg1Var = new rg1(c46Var.d, c46Var.e);
                k36 k36VarU = c46Var.c.U();
                long jW = c46Var.c.W();
                tnh0.c cVarY = c46Var.c.Y();
                if (cVarY == null) {
                    throw new uhn(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                pz5 pz5VarA = cVarY.a(contextA);
                c46Var.i = pz5VarA;
                n8e0 n8e0Var = new n8e0(pz5VarA);
                c46Var.j = n8e0Var;
                try {
                    c46Var.g = aVarV.a(contextA, rg1Var, k36VarU, jW, c46Var.c, n8e0Var);
                    b26.a aVarX = c46Var.c.X();
                    if (aVarX == null) {
                        throw new uhn(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                    }
                    iz5 iz5VarA = aVarX.a(contextA, c46Var.g.e(), c46Var.g.c());
                    c46Var.h = iz5VarA;
                    n8e0 n8e0Var2 = c46Var.j;
                    n8e0Var2.getClass();
                    n8e0Var2.b = iz5VarA;
                    if (executor instanceof f26) {
                        ((f26) executor).a(c46Var.g);
                    }
                    c46Var.a.d(c46Var.g);
                    qw5 qw5VarF = c46Var.g.f();
                    qw5VarF.getClass();
                    c46Var.k = new w36(c46Var.a, qw5VarF, c46Var.i, c46Var.j);
                    Iterator<n26> it = c46Var.a.c().iterator();
                    while (it.hasNext()) {
                        it.next().h().q(c46Var.k);
                    }
                    c46Var.n.f(c46Var.g, c46Var.a);
                    d36 d36Var = c46Var.n;
                    b26 b26Var = c46Var.h;
                    d36Var.getClass();
                    b26Var.getClass();
                    d36Var.i.add(b26Var);
                    d36 d36Var2 = c46Var.n;
                    qw5 qw5VarF2 = c46Var.g.f();
                    d36Var2.getClass();
                    qw5VarF2.getClass();
                    d36Var2.i.add(qw5VarF2);
                    x36.a(contextA, c46Var.a, k36VarU);
                    if (i > 1 && sig0.b()) {
                        sig0.c(-1, "CX:CameraProvider-RetryStatus");
                    }
                    synchronized (c46Var.b) {
                        c46Var.o = c46.a.d;
                    }
                    aVar.b(null);
                    Trace.endSection();
                } catch (RuntimeException e) {
                    e = e;
                    contextA = contextA;
                    e36Var = new e36(j, e);
                    aVarB = c46Var.l.b(e36Var);
                    if (sig0.b()) {
                        sig0.c(e36Var.a, "CX:CameraProvider-RetryStatus");
                    }
                    c46Var.n.e();
                    if (aVarB.b || i >= Integer.MAX_VALUE) {
                        synchronized (c46Var.b) {
                            c46Var.o = c46.a.c;
                        }
                        if (aVarB.c) {
                            synchronized (c46Var.b) {
                                c46Var.o = c46.a.d;
                            }
                            aVar.b(null);
                        } else if (e instanceof x36.b) {
                            String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((x36.b) e).a;
                            pgt.d("CameraX", str, e);
                            aVar.d(new uhn(new r36(str)));
                        } else if (e instanceof uhn) {
                            aVar.d(e);
                        } else {
                            aVar.d(new uhn(e));
                        }
                    } else {
                        pgt.j("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                        Handler handler = c46Var.e;
                        ?? r0 = new Runnable() { // from class: b46
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = i + 1;
                                long j2 = j;
                                nv5.a aVar2 = aVar;
                                c46 c46Var2 = c46Var;
                                Context context2 = contextA;
                                Executor executor2 = executor;
                                executor2.execute(new y36(i2, j2, aVar2, c46Var2, context2, executor2));
                            }
                        };
                        long j2 = aVarB.a;
                        if (Build.VERSION.SDK_INT >= 28) {
                            rcl.a.b(handler, r0, j2);
                        } else {
                            Message messageObtain = Message.obtain(handler, (Runnable) r0);
                            messageObtain.obj = "retry_token";
                            handler.sendMessageDelayed(messageObtain, j2);
                        }
                    }
                    Trace.endSection();
                } catch (uhn e2) {
                    e = e2;
                    contextA = contextA;
                    e36Var = new e36(j, e);
                    aVarB = c46Var.l.b(e36Var);
                    if (sig0.b()) {
                        sig0.c(e36Var.a, "CX:CameraProvider-RetryStatus");
                    }
                    c46Var.n.e();
                    if (aVarB.b) {
                        synchronized (c46Var.b) {
                            c46Var.o = c46.a.c;
                            if (aVarB.c) {
                                synchronized (c46Var.b) {
                                    c46Var.o = c46.a.d;
                                    aVar.b(null);
                                }
                            } else if (e instanceof x36.b) {
                                String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((x36.b) e).a;
                                pgt.d("CameraX", str2, e);
                                aVar.d(new uhn(new r36(str2)));
                            } else if (e instanceof uhn) {
                                aVar.d(e);
                            } else {
                                aVar.d(new uhn(e));
                            }
                        }
                    } else {
                        synchronized (c46Var.b) {
                            c46Var.o = c46.a.c;
                            if (aVarB.c) {
                                synchronized (c46Var.b) {
                                    c46Var.o = c46.a.d;
                                    aVar.b(null);
                                }
                            } else if (e instanceof x36.b) {
                                String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((x36.b) e).a;
                                pgt.d("CameraX", str3, e);
                                aVar.d(new uhn(new r36(str3)));
                            } else if (e instanceof uhn) {
                                aVar.d(e);
                            } else {
                                aVar.d(new uhn(e));
                            }
                        }
                    }
                    Trace.endSection();
                } catch (x36.b e3) {
                    e = e3;
                    contextA = contextA;
                    e36Var = new e36(j, e);
                    aVarB = c46Var.l.b(e36Var);
                    if (sig0.b()) {
                        sig0.c(e36Var.a, "CX:CameraProvider-RetryStatus");
                    }
                    c46Var.n.e();
                    if (aVarB.b) {
                        synchronized (c46Var.b) {
                            c46Var.o = c46.a.c;
                            if (aVarB.c) {
                                synchronized (c46Var.b) {
                                    c46Var.o = c46.a.d;
                                    aVar.b(null);
                                }
                            } else if (e instanceof x36.b) {
                                String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((x36.b) e).a;
                                pgt.d("CameraX", str4, e);
                                aVar.d(new uhn(new r36(str4)));
                            } else if (e instanceof uhn) {
                                aVar.d(e);
                            } else {
                                aVar.d(new uhn(e));
                            }
                        }
                    } else {
                        synchronized (c46Var.b) {
                            c46Var.o = c46.a.c;
                            if (aVarB.c) {
                                synchronized (c46Var.b) {
                                    c46Var.o = c46.a.d;
                                    aVar.b(null);
                                }
                            } else if (e instanceof x36.b) {
                                String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((x36.b) e).a;
                                pgt.d("CameraX", str5, e);
                                aVar.d(new uhn(new r36(str5)));
                            } else if (e instanceof uhn) {
                                aVar.d(e);
                            } else {
                                aVar.d(new uhn(e));
                            }
                        }
                    }
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (RuntimeException e4) {
            e = e4;
        } catch (uhn e5) {
            e = e5;
        } catch (x36.b e6) {
            e = e6;
        }
    }
}
