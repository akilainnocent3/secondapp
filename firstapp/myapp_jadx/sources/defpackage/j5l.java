package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.integrity.DeviceIntegrityActivity;
import com.sportybet.integrity.a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j5l implements sde, lit {
    public final c1k a;
    public final qde b;
    public final bck c;
    public final uqm d;
    public final j1b e;
    public final g7k f;
    public final a i;
    public final wwd0 v;

    public j5l(c1k c1kVar, qde qdeVar, bck bckVar, uqm uqmVar, j1b j1bVar, g7k g7kVar, wwf0 wwf0Var, a aVar) {
        uqmVar.getClass();
        this.a = c1kVar;
        this.b = qdeVar;
        this.c = bckVar;
        this.d = uqmVar;
        this.e = j1bVar;
        this.f = g7kVar;
        this.i = aVar;
        this.v = xwd0.a(Boolean.FALSE);
        ej5.c(j1bVar, null, null, new c5l(this, null), 3);
    }

    public static void g(String str) {
        itf0.a aVar = itf0.a;
        aVar.q("GooglePlayIntegrityVerifier");
        aVar.a(str, new Object[0]);
    }

    public final void a(UiText uiText) {
        int i = DeviceIntegrityActivity.b;
        DeviceIntegrityActivity.a.a(this.i.a, uiText);
    }

    @Override // defpackage.sde
    public final void b() {
        wwd0 wwd0Var;
        Object value;
        uqm uqmVar = this.d;
        if (!uqmVar.isLogin()) {
            uqmVar.removeLoginEventListener(this);
            uqmVar.addLoginEventListener(this);
        } else {
            do {
                wwd0Var = this.v;
                value = wwd0Var.getValue();
                ((Boolean) value).getClass();
            } while (!wwd0Var.g(value, Boolean.TRUE));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(rde rdeVar, x1b x1bVar) {
        d5l d5lVar;
        if (x1bVar instanceof d5l) {
            d5lVar = (d5l) x1bVar;
            int i = d5lVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d5lVar.d = i - Integer.MIN_VALUE;
            } else {
                d5lVar = new d5l(this, x1bVar);
            }
        } else {
            d5lVar = new d5l(this, x1bVar);
        }
        Object obj = d5lVar.b;
        y5b y5bVar = y5b.a;
        int i2 = d5lVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            d5lVar.a = rdeVar;
            d5lVar.d = 1;
            if (this.b.a(rdeVar, d5lVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rdeVar = d5lVar.a;
            uj50.b(obj);
        }
        int iOrdinal = rdeVar.ordinal();
        if (iOrdinal == 1) {
            StringUiText stringUiText = vch0.a;
            a(new ResourceUiText(R.string.app_common__changes_were_detected_in_the_device));
        } else if (iOrdinal == 2) {
            StringUiText stringUiText2 = vch0.a;
            a(new ResourceUiText(R.string.app_common__please_update_play_services));
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r7.b.a(r8, r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, defpackage.x1b r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.e5l
            if (r0 == 0) goto L13
            r0 = r9
            e5l r0 = (defpackage.e5l) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            e5l r0 = new e5l
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3c
            if (r2 == r6) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            defpackage.uj50.b(r9)
            return r9
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r3
        L34:
            defpackage.uj50.b(r9)
            goto L5d
        L38:
            defpackage.uj50.b(r9)
            goto L4a
        L3c:
            defpackage.uj50.b(r9)
            r0.c = r6
            g7k r9 = r7.f
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L4a
            goto L75
        L4a:
            g7k$a r9 = (g7k.a) r9
            boolean r8 = r9 instanceof g7k.a.C0593a
            if (r8 == 0) goto L65
            rde r8 = defpackage.rde.f
            r0.c = r5
            qde r7 = r7.b
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L5d
            goto L75
        L5d:
            java.lang.String r7 = "API is disabled on backend (verify). Skipping verification."
            g(r7)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L65:
            boolean r8 = r9 instanceof g7k.a.b
            if (r8 == 0) goto L77
            g7k$a$b r9 = (g7k.a.b) r9
            jde r8 = r9.a
            r0.c = r4
            java.lang.Object r7 = r7.e(r8, r0)
            if (r7 != r1) goto L76
        L75:
            return r1
        L76:
            return r7
        L77:
            defpackage.uhc.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5l.d(java.lang.String, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(sxo sxoVar, x1b x1bVar) {
        g5l g5lVar;
        if (x1bVar instanceof g5l) {
            g5lVar = (g5l) x1bVar;
            int i = g5lVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                g5lVar.d = i - Integer.MIN_VALUE;
            } else {
                g5lVar = new g5l(this, x1bVar);
            }
        } else {
            g5lVar = new g5l(this, x1bVar);
        }
        Object objD = g5lVar.b;
        y5b y5bVar = y5b.a;
        int i2 = g5lVar.d;
        boolean z = true;
        if (i2 == 0) {
            uj50.b(objD);
            g5lVar.a = sxoVar;
            g5lVar.d = 1;
            qde qdeVar = this.b;
            objD = ej5.d(qdeVar.b, new lde(qdeVar, null), g5lVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sxoVar = g5lVar.a;
            uj50.b(objD);
        }
        Long l = (Long) objD;
        if (l != null) {
            if (System.currentTimeMillis() - l.longValue() <= sxoVar.b()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00c8, please report this as an issue */
    public final Object h(sxo sxoVar, x1b x1bVar) {
        i5l i5lVar;
        sxo sxoVar2;
        Object objA;
        bck.a aVar;
        Object objD;
        Object objC;
        if (x1bVar instanceof i5l) {
            i5lVar = (i5l) x1bVar;
            int i = i5lVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i5lVar.d = i - Integer.MIN_VALUE;
            } else {
                i5lVar = new i5l(this, x1bVar);
            }
        } else {
            i5lVar = new i5l(this, x1bVar);
        }
        Object objA2 = i5lVar.b;
        Object obj = y5b.a;
        int i2 = i5lVar.d;
        if (i2 == 0) {
            uj50.b(objA2);
            g("generating nonce");
            sxoVar2 = sxoVar;
            i5lVar.a = sxoVar2;
            i5lVar.d = 1;
            objA = this.a.a(i5lVar);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            sxo sxoVar3 = i5lVar.a;
            uj50.b(objA2);
            objA = objA2;
            sxoVar2 = sxoVar3;
        } else {
            if (i2 == 2) {
                uj50.b(objA2);
                return objA2;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    uj50.b(objA2);
                    return objA2;
                }
                if (i2 == 5) {
                    uj50.b(objA2);
                    return objA2;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA2);
        }
        aVar = (bck.a) objA2;
        if (aVar instanceof bck.a.C0118a) {
            g("Integrity token request has been canceled");
            return Unit.a;
        }
        if (aVar instanceof bck.a.b) {
            bck.a.b bVar = (bck.a.b) aVar;
            g("Integrity token request failed with errorCode " + bVar.a);
            rde rdeVar = bVar.b;
            i5lVar.a = null;
            i5lVar.d = 4;
            objC = c(rdeVar, i5lVar);
            if (objC == obj) {
                return objC;
            }
        } else {
            if (aVar instanceof bck.a.c) {
                uhc.a();
                return null;
            }
            String str = ((bck.a.c) aVar).a;
            i5lVar.a = null;
            i5lVar.d = 5;
            objD = d(str, i5lVar);
            if (objD == obj) {
                return objD;
            }
        }
        return obj;
        c1k.a aVar2 = (c1k.a) objA;
        if (Intrinsics.g(aVar2, c1k.a.C0150a.a)) {
            g("API is disabled on backend (unique). Skipping verification.");
            rde rdeVar2 = rde.f;
            i5lVar.a = null;
            i5lVar.d = 2;
            Object objA3 = this.b.a(rdeVar2, i5lVar);
            if (objA3 != obj) {
                return objA3;
            }
        } else {
            if (!(aVar2 instanceof c1k.a.b)) {
                uhc.a();
                return null;
            }
            g("Requesting integrity token");
            String str2 = ((c1k.a.b) aVar2).a;
            long gcpNumber = sxoVar2.getGcpNumber();
            i5lVar.a = null;
            i5lVar.d = 3;
            objA2 = s0i.a(hzh.a(new dck(this.c, str2, gcpNumber, null)), i5lVar);
            if (objA2 != obj) {
                aVar = (bck.a) objA2;
                if (aVar instanceof bck.a.C0118a) {
                    g("Integrity token request has been canceled");
                    return Unit.a;
                }
                if (aVar instanceof bck.a.b) {
                    bck.a.b bVar2 = (bck.a.b) aVar;
                    g("Integrity token request failed with errorCode " + bVar2.a);
                    rde rdeVar3 = bVar2.b;
                    i5lVar.a = null;
                    i5lVar.d = 4;
                    objC = c(rdeVar3, i5lVar);
                    if (objC == obj) {
                        return objC;
                    }
                } else {
                    if (aVar instanceof bck.a.c) {
                        uhc.a();
                        return null;
                    }
                    String str3 = ((bck.a.c) aVar).a;
                    i5lVar.a = null;
                    i5lVar.d = 5;
                    objD = d(str3, i5lVar);
                    if (objD == obj) {
                        return objD;
                    }
                }
            }
        }
        return obj;
    }

    @Override // defpackage.lit
    public final void onLogin() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.v;
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.TRUE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r2.a(r9, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.jde r8, defpackage.x1b r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.f5l
            if (r0 == 0) goto L13
            r0 = r9
            f5l r0 = (defpackage.f5l) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            f5l r0 = new f5l
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r9)
            return r9
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r3
        L31:
            jde r8 = r0.a
            defpackage.uj50.b(r9)
            goto L7d
        L37:
            defpackage.uj50.b(r9)
            jde$a r9 = r8.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r6 = 0
            java.lang.String r6 = com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz.ggPjTOQzzfgMD
            r2.<init>(r6)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            g(r9)
            jde$a r9 = r8.a()
            int r9 = r9.ordinal()
            qde r2 = r7.b
            if (r9 == 0) goto L70
            if (r9 != r5) goto L6c
            rde r7 = defpackage.rde.b
            r0.a = r3
            r0.d = r4
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 != r1) goto L6b
            goto L7c
        L6b:
            return r7
        L6c:
            defpackage.uhc.a()
            return r3
        L70:
            rde r9 = defpackage.rde.c
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r8.getClass()
            com.sporty.android.common_ui.uitext.StringUiText r8 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r8 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r9 = 2132017232(0x7f140050, float:1.9672737E38)
            r8.<init>(r9)
            r7.a(r8)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5l.e(jde, x1b):java.lang.Object");
    }
}
