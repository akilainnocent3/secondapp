package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.appupdate.AppDownloadAction;
import com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig;
import com.sporty.android.core.model.appupdate.VersionCheckResults;
import com.sporty.android.core.model.config.Version;
import com.sporty.android.core.model.config.VersionData;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes6.dex */
public final class fhb0 {
    public final Context a;
    public final iu0 b;
    public final psm c;
    public final hu0 d;
    public final k650 e;
    public final du0 f;
    public final k5b g;
    public final bnx h;
    public final lq1 i;
    public final yi5 j;
    public final mpe0 k;
    public VersionData l;
    public final wwd0 m;
    public final wwd0 n;

    public fhb0(Context context, iu0 iu0Var, psm psmVar, hu0 hu0Var, k650 k650Var, du0 du0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.Default) k5b k5bVar, bnx bnxVar, lq1 lq1Var, yi5 yi5Var) {
        iu0Var.getClass();
        psmVar.getClass();
        hu0Var.getClass();
        k650Var.getClass();
        lq1Var.getClass();
        yi5Var.getClass();
        this.a = context;
        this.b = iu0Var;
        this.c = psmVar;
        this.d = hu0Var;
        this.e = k650Var;
        this.f = du0Var;
        this.g = k5bVar;
        this.h = bnxVar;
        this.i = lq1Var;
        this.j = yi5Var;
        this.k = hwr.b(new dbb(this, 2));
        this.m = xwd0.a(VersionCheckResults.NotRequested.INSTANCE);
        this.n = xwd0.a(AppDownloadAction.NotStarted.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(VersionData versionData, x1b x1bVar) {
        wgb0 wgb0Var;
        if (x1bVar instanceof wgb0) {
            wgb0Var = (wgb0) x1bVar;
            int i = wgb0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wgb0Var.d = i - Integer.MIN_VALUE;
            } else {
                wgb0Var = new wgb0(this, x1bVar);
            }
        } else {
            wgb0Var = new wgb0(this, x1bVar);
        }
        Object objA = wgb0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = wgb0Var.d;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                Task<gu0> taskA = this.d.a();
                taskA.getClass();
                wgb0Var.a = versionData;
                wgb0Var.d = 1;
                objA = z5f0.a(taskA, wgb0Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                versionData = wgb0Var.a;
                uj50.b(objA);
            }
            gu0 gu0Var = (gu0) objA;
            int i3 = gu0Var.b;
            int i4 = gu0Var.a;
            int iAvailableVersionCode = versionData.availableVersionCode();
            if (i3 != 2 || i4 != iAvailableVersionCode) {
                versionData = new VersionData(null, null, null, null, null, null, 63, null);
            }
            return j(versionData);
        } catch (Exception e) {
            return new VersionCheckResults.Failure(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(x1b x1bVar) {
        xgb0 xgb0Var;
        int i;
        UiText uiText;
        Throwable th;
        lk50 cVar;
        Object bVar;
        Object objK;
        UiText text;
        if (x1bVar instanceof xgb0) {
            xgb0Var = (xgb0) x1bVar;
            int i2 = xgb0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xgb0Var.e = i2 - Integer.MIN_VALUE;
            } else {
                xgb0Var = new xgb0(this, x1bVar);
            }
        } else {
            xgb0Var = new xgb0(this, x1bVar);
        }
        Object obj = xgb0Var.c;
        Object obj2 = y5b.a;
        int i3 = xgb0Var.e;
        if (i3 == 0) {
            uj50.b(obj);
            VersionData versionData = this.l;
            i = 0;
            if (versionData != null && versionData.isValidCachedData(((Number) this.k.getValue()).longValue())) {
                i = 1;
            }
            if (versionData == null || i == 0) {
                ResourceUiText resourceUiText = vch0.b;
                try {
                    zi50.a aVar = zi50.b;
                    iu0 iu0Var = this.b;
                    String strA = this.j.b().a();
                    CountryCodeName countryCode = this.c.getCountryCode();
                    xgb0Var.a = resourceUiText;
                    xgb0Var.b = i;
                    xgb0Var.e = 1;
                    Object objA = iu0Var.a(strA, countryCode, xgb0Var);
                    if (objA != obj2) {
                        uiText = resourceUiText;
                        obj = objA;
                    }
                } catch (Throwable th2) {
                    uiText = resourceUiText;
                    th = th2;
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
            } else {
                cVar = new lk50.c(versionData);
                if (cVar instanceof lk50.c) {
                    this.l = (VersionData) ((lk50.c) cVar).a;
                }
                xgb0Var.a = null;
                xgb0Var.b = i;
                xgb0Var.e = 2;
                objK = k(cVar, xgb0Var);
                if (objK != obj2) {
                    return objK;
                }
            }
            return obj2;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = xgb0Var.b;
        uiText = xgb0Var.a;
        try {
            uj50.b(obj);
        } catch (Throwable th3) {
            th = th3;
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        bVar = (VersionData) obj;
        zi50.a aVar4 = zi50.b;
        Object obj3 = bVar instanceof zi50.b ? null : bVar;
        if (obj3 != null) {
            cVar = new lk50.c(obj3);
        } else {
            Throwable thA = zi50.a(bVar);
            if (thA == null) {
                thA = new Throwable("Unknown error");
            }
            Throwable thA2 = zi50.a(bVar);
            if (thA2 != null) {
                if (!(thA2 instanceof fk50)) {
                    thA2 = null;
                }
                fk50 fk50Var = (fk50) thA2;
                if (fk50Var != null && (text = fk50Var.getText()) != null) {
                    uiText = text;
                }
            }
            cVar = new lk50.a(thA, uiText);
        }
        if (cVar instanceof lk50.c) {
            this.l = (VersionData) ((lk50.c) cVar).a;
        }
        xgb0Var.a = null;
        xgb0Var.b = i;
        xgb0Var.e = 2;
        objK = k(cVar, xgb0Var);
        if (objK != obj2) {
            return obj2;
        }
        return objK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r6 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        if (r6 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum c(defpackage.x1b r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.zgb0
            if (r0 == 0) goto L13
            r0 = r6
            zgb0 r0 = (defpackage.zgb0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zgb0 r0 = new zgb0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2b
            defpackage.uj50.b(r6)
            goto L9a
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L32:
            defpackage.uj50.b(r6)
            goto L6e
        L36:
            defpackage.uj50.b(r6)
            bnx r6 = r5.h
            android.content.Context r6 = r6.a
            rox r6 = defpackage.vox.c(r6)
            int r6 = r6.ordinal()
            du0 r2 = r5.f
            yi5 r5 = r5.j
            if (r6 == r4) goto L7c
            if (r6 == r3) goto L50
            com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig r5 = com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig.UNKNOWN_NETWORK
            return r5
        L50:
            r0.c = r4
            yi5$c r5 = r5.b()
            boolean r5 = r5.f()
            if (r5 == 0) goto L60
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L5e:
            r6 = r5
            goto L6b
        L60:
            wm20 r5 = r2.a()
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            java.lang.Object r5 = r5.e(r0, r6)
            goto L5e
        L6b:
            if (r6 != r1) goto L6e
            goto L99
        L6e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto L79
            com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig r5 = com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig.ENABLED_WIFI_NETWORK
            return r5
        L79:
            com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig r5 = com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig.DISABLED_WIFI_NETWORK
            return r5
        L7c:
            r0.c = r3
            yi5$c r5 = r5.b()
            boolean r5 = r5.f()
            if (r5 == 0) goto L8c
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L8a:
            r6 = r5
            goto L97
        L8c:
            wm20 r5 = r2.a()
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            java.lang.Object r5 = r5.e(r0, r6)
            goto L8a
        L97:
            if (r6 != r1) goto L9a
        L99:
            return r1
        L9a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto La5
            com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig r5 = com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig.ENABLED_MOBILE_NETWORK
            return r5
        La5:
            com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig r5 = com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig.DISABLED_MOBILE_NETWORK
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhb0.c(x1b):java.lang.Enum");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(VersionData versionData, x1b x1bVar) {
        ahb0 ahb0Var;
        if (x1bVar instanceof ahb0) {
            ahb0Var = (ahb0) x1bVar;
            int i = ahb0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ahb0Var.d = i - Integer.MIN_VALUE;
            } else {
                ahb0Var = new ahb0(this, x1bVar);
            }
        } else {
            ahb0Var = new ahb0(this, x1bVar);
        }
        Object objF = ahb0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = ahb0Var.d;
        if (i2 == 0) {
            uj50.b(objF);
            du0 du0Var = this.f;
            wm20 wm20VarA = du0Var.d.a(du0Var, du0.e[2]);
            ahb0Var.a = versionData;
            ahb0Var.d = 1;
            objF = wm20VarA.f(ahb0Var);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            versionData = ahb0Var.a;
            uj50.b(objF);
        }
        String str = (String) objF;
        boolean z = false;
        if (str != null) {
            String str2 = str.length() > 0 ? str : null;
            if (str2 != null) {
                z = new Version(versionData.getVersion()).compareTo(new Version(str2)) <= 0;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0103  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105 A[Catch: all -> 0x004a, PHI: r2 r3 r10 r11
      0x0105: PHI (r2v12 ??) = (r2v15 ??), (r2v16 ??) binds: [B:55:0x0101, B:16:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r3v17 ??) = (r3v22 ??), (r3v23 ??) binds: [B:55:0x0101, B:16:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r10v12 ??) = (r10v16 ??), (r10v17 ??) binds: [B:55:0x0101, B:16:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r11v24 java.lang.Object) = (r11v22 java.lang.Object), (r11v1 java.lang.Object) binds: [B:55:0x0101, B:16:0x0045] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x004a, blocks: (B:16:0x0045, B:57:0x0105, B:54:0x00de), top: B:92:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:63:0x0119  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0122  */
    /* JADX WARN: Code duplicated, block: B:68:0x012a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0137  */
    /* JADX WARN: Code duplicated, block: B:73:0x013b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0140  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x0150  */
    /* JADX WARN: Code duplicated, block: B:87:0x016b  */
    /* JADX WARN: Code duplicated, block: B:91:0x017f A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        if (kotlin.Unit.a == r1) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.sporty.android.common_ui.uitext.UiText] */
    /* JADX WARN: Type inference failed for: r9v0, types: [fhb0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(boolean r10, defpackage.x1b r11) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhb0.e(boolean, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(x1b x1bVar) {
        chb0 chb0Var;
        if (x1bVar instanceof chb0) {
            chb0Var = (chb0) x1bVar;
            int i = chb0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                chb0Var.c = i - Integer.MIN_VALUE;
            } else {
                chb0Var = new chb0(this, x1bVar);
            }
        } else {
            chb0Var = new chb0(this, x1bVar);
        }
        Object objE = chb0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = chb0Var.c;
        boolean z = false;
        if (i2 == 0) {
            uj50.b(objE);
            du0 du0Var = this.f;
            wm20 wm20VarA = du0Var.b.a(du0Var, du0.e[0]);
            Long l = new Long(0L);
            chb0Var.c = 1;
            objE = wm20VarA.e(chb0Var, l);
            if (objE == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objE);
        }
        long jLongValue = ((Number) objE).longValue();
        b.a aVar = b.b;
        long jE = (b.e(c.i(this.e.c("home_tab_auto_check_new_version_interval_in_hour"), rgf.HOURS)) + jLongValue) - System.currentTimeMillis();
        if (jE < 0) {
            z = true;
        } else {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_VERSION_CHECK);
            aVar2.l(tug.a("Check after ", b.k(c.i(jE, rgf.MINUTES)), " minutes"), new Object[0]);
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(VersionData versionData, x1b x1bVar) {
        dhb0 dhb0Var;
        if (x1bVar instanceof dhb0) {
            dhb0Var = (dhb0) x1bVar;
            int i = dhb0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dhb0Var.c = i - Integer.MIN_VALUE;
            } else {
                dhb0Var = new dhb0(this, x1bVar);
            }
        } else {
            dhb0Var = new dhb0(this, x1bVar);
        }
        Object objD = dhb0Var.a;
        Object obj = y5b.a;
        int i2 = dhb0Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            if (versionData.showPopUp()) {
                dhb0Var.c = 1;
                objD = d(versionData, dhb0Var);
                if (objD == obj) {
                    return obj;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objD);
        boolean z = ((Boolean) objD).booleanValue() ? false : true;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(x1b x1bVar) {
        ehb0 ehb0Var;
        if (x1bVar instanceof ehb0) {
            ehb0Var = (ehb0) x1bVar;
            int i = ehb0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ehb0Var.c = i - Integer.MIN_VALUE;
            } else {
                ehb0Var = new ehb0(this, x1bVar);
            }
        } else {
            ehb0Var = new ehb0(this, x1bVar);
        }
        Object objC = ehb0Var.a;
        Object obj = y5b.a;
        int i2 = ehb0Var.c;
        if (i2 == 0) {
            uj50.b(objC);
            ehb0Var.c = 1;
            objC = c(ehb0Var);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objC);
        }
        VersionAutoUpdateConfig versionAutoUpdateConfig = (VersionAutoUpdateConfig) objC;
        VersionData versionData = this.l;
        if (versionData == null) {
            return Unit.a;
        }
        if (!this.j.b().f()) {
            wwd0 wwd0Var = this.n;
            if (Intrinsics.g(wwd0Var.getValue(), AppDownloadAction.NotStarted.INSTANCE) && versionAutoUpdateConfig == VersionAutoUpdateConfig.ENABLED_WIFI_NETWORK && versionData.getUrl() != null) {
                AppDownloadAction.DownloadApkPermissionCheck downloadApkPermissionCheck = new AppDownloadAction.DownloadApkPermissionCheck(versionData, false);
                wwd0Var.getClass();
                wwd0Var.k(null, downloadApkPermissionCheck);
            }
        }
        return Unit.a;
    }

    public final void i(VersionData versionData) {
        versionData.getClass();
        int iOrdinal = this.j.b().h().ordinal();
        wwd0 wwd0Var = this.n;
        if (iOrdinal == 0) {
            AppDownloadAction.DownloadApkPermissionCheck downloadApkPermissionCheck = new AppDownloadAction.DownloadApkPermissionCheck(versionData, true);
            wwd0Var.getClass();
            wwd0Var.k(null, downloadApkPermissionCheck);
            return;
        }
        if (iOrdinal == 1) {
            AppDownloadAction.OpenGooglePlayStore openGooglePlayStore = new AppDownloadAction.OpenGooglePlayStore(versionData, qq1.h(this.i, BOConfigParam.AndroidManuallyUpdateUrlGp));
            wwd0Var.getClass();
            wwd0Var.k(null, openGooglePlayStore);
        } else if (iOrdinal == 2) {
            AppDownloadAction.OpenHuaweiAppGallery openHuaweiAppGallery = new AppDownloadAction.OpenHuaweiAppGallery(versionData);
            wwd0Var.getClass();
            wwd0Var.k(null, openHuaweiAppGallery);
        } else {
            if (iOrdinal != 3) {
                uhc.a();
                return;
            }
            AppDownloadAction.OpenPalmStore openPalmStore = new AppDownloadAction.OpenPalmStore(versionData, versionData.getUrl());
            wwd0Var.getClass();
            wwd0Var.k(null, openPalmStore);
        }
    }

    public final VersionCheckResults j(VersionData versionData) {
        yi5 yi5Var = this.j;
        if (versionData.hasNewVersionRequired(yi5Var.b().a())) {
            return new VersionCheckResults.UpdateRequired(versionData);
        }
        return versionData.hasNewVersionAvailable(yi5Var.b().a()) ? new VersionCheckResults.UpdateAvailable(versionData) : VersionCheckResults.NoUpdate.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object k(lk50 lk50Var, x1b x1bVar) {
        if (lk50Var instanceof lk50.c) {
            VersionData versionData = (VersionData) ((lk50.c) lk50Var).a;
            this.l = versionData;
            return this.j.b().j() ? a(versionData, x1bVar) : j(versionData);
        }
        if (lk50Var instanceof lk50.a) {
            return new VersionCheckResults.Failure(((lk50.a) lk50Var).a);
        }
        if (lk50Var.equals(lk50.b.a)) {
            return VersionCheckResults.Loading.INSTANCE;
        }
        uhc.a();
        return null;
    }
}
