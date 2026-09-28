package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.appupdate.VersionCheckResults;
import com.sporty.android.core.model.config.VersionData;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class cu0 {
    public final fhb0 a;
    public final wwd0 b = xwd0.a(Boolean.FALSE);

    public cu0(fhb0 fhb0Var) {
        this.a = fhb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r4.h(r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(final com.sporty.android.core.model.config.VersionData r10, boolean r11, defpackage.x1b r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.yt0
            if (r0 == 0) goto L13
            r0 = r12
            yt0 r0 = (defpackage.yt0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            yt0 r0 = new yt0
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.d
            y5b r1 = defpackage.y5b.a
            int r2 = r0.f
            r3 = 0
            fhb0 r4 = r9.a
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L46
            if (r2 == r7) goto L3e
            if (r2 == r6) goto L3a
            if (r2 != r5) goto L34
            com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig r10 = r0.b
            com.sporty.android.core.model.config.VersionData r11 = r0.a
            defpackage.uj50.b(r12)
            goto L93
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r3
        L3a:
            defpackage.uj50.b(r12)
            goto L7d
        L3e:
            boolean r11 = r0.c
            com.sporty.android.core.model.config.VersionData r10 = r0.a
            defpackage.uj50.b(r12)
            goto L56
        L46:
            defpackage.uj50.b(r12)
            r0.a = r10
            r0.c = r11
            r0.f = r7
            java.lang.Enum r12 = r4.c(r0)
            if (r12 != r1) goto L56
            goto L8e
        L56:
            com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig r12 = (com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig) r12
            if (r11 == 0) goto L6a
            vt0$a r11 = new vt0$a
            iev$b r0 = new iev$b
            wt0 r1 = new wt0
            r1.<init>()
            r0.<init>(r12, r10, r1)
            r11.<init>(r0)
            return r11
        L6a:
            com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig r2 = com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig.ENABLED_WIFI_NETWORK
            if (r12 != r2) goto L80
            r0.a = r3
            r0.b = r3
            r0.c = r11
            r0.f = r6
            java.lang.Object r9 = r4.h(r0)
            if (r9 != r1) goto L7d
            goto L8e
        L7d:
            vt0$b r9 = vt0.b.a
            return r9
        L80:
            r0.a = r10
            r0.b = r12
            r0.c = r11
            r0.f = r5
            java.lang.Object r11 = r4.g(r10, r0)
            if (r11 != r1) goto L8f
        L8e:
            return r1
        L8f:
            r8 = r11
            r11 = r10
            r10 = r12
            r12 = r8
        L93:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lac
            vt0$a r12 = new vt0$a
            iev$b r0 = new iev$b
            xt0 r1 = new xt0
            r2 = 0
            r1.<init>(r2, r9, r11)
            r0.<init>(r10, r11, r1)
            r12.<init>(r0)
            return r12
        Lac:
            vt0$b r9 = vt0.b.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu0.a(com.sporty.android.core.model.config.VersionData, boolean, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(VersionCheckResults versionCheckResults, x1b x1bVar) {
        zt0 zt0Var;
        if (x1bVar instanceof zt0) {
            zt0Var = (zt0) x1bVar;
            int i = zt0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zt0Var.c = i - Integer.MIN_VALUE;
            } else {
                zt0Var = new zt0(this, x1bVar);
            }
        } else {
            zt0Var = new zt0(this, x1bVar);
        }
        Object objA = zt0Var.a;
        Object obj = y5b.a;
        int i2 = zt0Var.c;
        wwd0 wwd0Var = this.b;
        if (i2 == 0) {
            uj50.b(objA);
            boolean zBooleanValue = ((Boolean) wwd0Var.getValue()).booleanValue();
            if (versionCheckResults instanceof VersionCheckResults.Downloading) {
                if (!zBooleanValue) {
                    return vt0.b.a;
                }
                StringUiText stringUiText = vch0.a;
                return new vt0.c(new a.n(new ResourceUiText(R.string.app_common__wifi_auto_update_downliading)));
            }
            if (versionCheckResults instanceof VersionCheckResults.Loading) {
                if (!zBooleanValue) {
                    return vt0.b.a;
                }
                StringUiText stringUiText2 = vch0.a;
                return new vt0.c(new a.n(new ResourceUiText(R.string.common_functions__checking_update)));
            }
            if (versionCheckResults instanceof VersionCheckResults.Failure) {
                wwd0Var.k(null, Boolean.FALSE);
                if (!zBooleanValue) {
                    return vt0.b.a;
                }
                StringUiText stringUiText3 = vch0.a;
                return new vt0.c(new a.n(new ResourceUiText(R.string.app_common__error_fail_to_get_version)));
            }
            if (versionCheckResults instanceof VersionCheckResults.UpdateRequired) {
                wwd0Var.k(null, Boolean.FALSE);
                return new vt0.a(new iev.a(((VersionCheckResults.UpdateRequired) versionCheckResults).getData()));
            }
            if (!(versionCheckResults instanceof VersionCheckResults.UpdateAvailable)) {
                if (!(versionCheckResults instanceof VersionCheckResults.NoUpdate)) {
                    return vt0.b.a;
                }
                wwd0Var.k(null, Boolean.FALSE);
                if (!zBooleanValue) {
                    return vt0.b.a;
                }
                StringUiText stringUiText4 = vch0.a;
                return new vt0.c(new a.n(new ResourceUiText(R.string.app_common__no_update)));
            }
            VersionData data = ((VersionCheckResults.UpdateAvailable) versionCheckResults).getData();
            zt0Var.c = 1;
            objA = a(data, zBooleanValue, zt0Var);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        vt0 vt0Var = (vt0) objA;
        wwd0Var.k(null, Boolean.FALSE);
        return vt0Var;
    }
}
